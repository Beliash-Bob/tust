import javax.swing.*;

public class ForWhile {
    public static void main(String[] args) {
        String PositiveNum = JOptionPane.showInputDialog(null, "Введите положительное число");
        if (PositiveNum != null && !PositiveNum.equals("")) {
            int InputIntegerPositiveNum = Integer.parseInt(PositiveNum);
            if (InputIntegerPositiveNum >= 0){
                /*int SumNum = 0;
                for (int i = 1; i <= InputIntegerPositiveNum; i++)
                    SumNum += i;
                    JOptionPane.showMessageDialog(null,"Сумма чисел от одного до " + InputIntegerPositiveNum + " равна " + SumNum);
            */
                int FractNum = 0;
                int n = 0;
                if (InputIntegerPositiveNum > 1) {
                    while (n <= InputIntegerPositiveNum) {
                        FractNum = (n - 1) * n;
                        n++;
                    }
                    JOptionPane.showMessageDialog(null, FractNum);
                }
                else JOptionPane.showMessageDialog(null, "1");
            }
            else if (InputIntegerPositiveNum < 0) JOptionPane.showMessageDialog(null,"Вы ввели отрицательное число");
            else JOptionPane.showMessageDialog(null,"Вы ввели нецелое число");
        }
        else JOptionPane.showMessageDialog(null," Вы ничего не ввели");

    }
}
