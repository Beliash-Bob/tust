import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        int InputFirstNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите первое число"));
        int InputSecondNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите второе число"));
        String InputOperation = JOptionPane.showInputDialog(null, "Введите арифметическую операцию");
            switch (InputOperation){
                case "+":
                    JOptionPane.showMessageDialog(null, InputFirstNum + InputSecondNum);
                    break;
                case "-":
                    JOptionPane.showMessageDialog(null, InputFirstNum - InputSecondNum);
                    break;
                case "*":
                    JOptionPane.showMessageDialog(null, InputFirstNum * InputSecondNum);
                    break;
                case "/":
                    JOptionPane.showMessageDialog(null, InputFirstNum / InputSecondNum);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Вы ввели неверную операцию");
            }

    }
}
