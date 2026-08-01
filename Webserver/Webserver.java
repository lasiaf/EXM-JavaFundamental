import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WebServerSimple {

    public static void main(String[] args) throws IOException {
        // Buat server di port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // 1. FRONTEND: Membaca dan Menyajikan File "index.html" dari Disk (Route: /)
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                // Pastikan hanya menangani path utama
                if (!exchange.getRequestURI().getPath().equals("/")) {
                    exchange.sendResponseHeaders(404, -1);
                    return;
                }

                File file = new File("index.html");

                if (!file.exists()) {
                    String errorMsg = "404 Not Found: File index.html tidak ditemukan di folder proyek.";
                    exchange.sendResponseHeaders(404, errorMsg.length());
                    try (OutputStream os = exchange.getResponseBody()) {
                        os.write(errorMsg.getBytes());
                    }
                    return;
                }

                // Kirim file index.html ke browser client
                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                exchange.sendResponseHeaders(200, file.length());

                try (FileInputStream fis = new FileInputStream(file);
                     OutputStream os = exchange.getResponseBody()) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = fis.read(buffer)) != -1) {
                        os.write(buffer, 0, bytesRead);
                    }
                }
            }
        });

        // 2. BACKEND: Endpoint API yang mengembalikan data JSON (Route: /api/waktu)
        server.createContext("/api/waktu", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                // Ambil waktu server saat ini
                String waktuSekarang = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss - dd MMMM yyyy"));

                // Format respon JSON
                String jsonResponse = String.format("""
                    {
                        "status": "success",
                        "pesan": "Halo! Data ini dikirim langsung dari Java Backend!",
                        "waktu": "%s"
                    }
                """, waktuSekarang);

                byte[] responseBytes = jsonResponse.getBytes("UTF-8");
                exchange.getResponseHeaders().set("Content-Type", "application/json; charset=UTF-8");
                exchange.sendResponseHeaders(200, responseBytes.length);

                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(responseBytes);
                }
            }
        });

        // Jalankan Web Server
        server.start();
        System.out.println("Server berhasil berjalan di http://localhost:8080");
    }
}