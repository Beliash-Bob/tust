import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
    int InputPositiveNum;
    while (true){
        InputPositiveNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Введите положительное число"));
        if (InputPositiveNum > 0) {JOptionPane.showMessageDialog(null,"Спасибо!"); break;}
        else continue;

    }

    }
}
