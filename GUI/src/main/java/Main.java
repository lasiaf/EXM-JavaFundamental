import javax.swing.*;
import kalkulator.Calculator;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.KalkulatorSederhana();
            calc.setVisible(true);
        });
    }
}