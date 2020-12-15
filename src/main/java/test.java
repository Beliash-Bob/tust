import javax.swing.*;

public class test {
    public static void main(String[] args) {
    /* String in;
    in = JOptionPane.showInputDialog(null,"Введите число", JOptionPane.QUESTION_MESSAGE);
    if (in != null && !in.equals("")) {
        double n = Double.parseDouble(in);
        if (n > 0) System.out.println("Вы ввели положительное число");
        else if (n < 0) System.out.println("Вы ввели отрицательное число");
        else System.out.println("Вы ввели ноль");
        }
    else System.out.println("Вы не ввели число");*/
    String first_num_positive;
    String second_num_unequal0;
        first_num_positive = JOptionPane.showInputDialog(null,"Введите положительное число");
            if (first_num_positive != null && !first_num_positive.equals("")){
                Double DoubleFirstNumPositive = Double.parseDouble(first_num_positive);
                if (DoubleFirstNumPositive > 0) {
                    second_num_unequal0 = JOptionPane.showInputDialog(null, "Введите число отличное от нуля");
                    if (second_num_unequal0 != null && !second_num_unequal0.equals("")){
                        Double DoubleSecondNumUnequal0 = Double.parseDouble(second_num_unequal0);
                        if (DoubleSecondNumUnequal0 == 0) JOptionPane.showMessageDialog(null, "Результат бесконечность");
                        else if (DoubleSecondNumUnequal0 != 0) JOptionPane.showMessageDialog(null, "Результат деления: " + DoubleFirstNumPositive / DoubleSecondNumUnequal0);
                    }
                }
                else JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
                }

            else {
               Double DoubleFirstNumPositive = 1.0;
                second_num_unequal0 = JOptionPane.showInputDialog(null, "Введите число отличное от нуля");
                if (second_num_unequal0 != null && !second_num_unequal0.equals("")){
                    Double DoubleSecondNumUnequal0 = Double.parseDouble(second_num_unequal0);
                    if (DoubleSecondNumUnequal0 == 0) JOptionPane.showMessageDialog(null, "Результат бесконечность");
                    else if (DoubleSecondNumUnequal0 != 0) JOptionPane.showMessageDialog(null, "Результат деления: " + DoubleFirstNumPositive / DoubleSecondNumUnequal0);
                    }
                else JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
            }
    }
}
