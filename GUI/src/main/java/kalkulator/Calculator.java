package kalkulator;

import javax.swing.*;
import java.awt.event.*;


public class Calculator extends JFrame {


    public JTextField txtBil1;
    public JTextField txtBil2;
    public JButton btnHitung;
    public JLabel lblHasil;

    public void KalkulatorSederhana() {

        setTitle("Kalkulator Sederhana");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblBil1 = new JLabel("Bilangan 1:");
        lblBil1.setBounds(20, 20, 80, 25);
        add(lblBil1);

        txtBil1 = new JTextField();
        txtBil1.setBounds(100, 20, 150, 25);
        add(txtBil1);

        JLabel lblBil2 = new JLabel("Bilangan 2:");
        lblBil2.setBounds(20, 60, 80, 25);
        add(lblBil2);

        txtBil2 = new JTextField();
        txtBil2.setBounds(100, 60, 150, 25);
        add(txtBil2);

        btnHitung = new JButton("Hitung");
        btnHitung.setBounds(100, 100, 100, 30);
        add(btnHitung);

        lblHasil = new JLabel("Hasil: 0");
        lblHasil.setBounds(100, 140, 150, 25);
        add(lblHasil);

        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitung();
            }
        });
    }

    public void hitung() {
        try {
            double bil1 = Double.parseDouble(txtBil1.getText());
            double bil2 = Double.parseDouble(txtBil2.getText());

            double hasil = bil1 + bil2;

            lblHasil.setText("Hasil: " + hasil);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan angka yang valid!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
