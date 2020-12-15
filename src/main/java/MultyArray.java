import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MultyArray {
    public static void main(String[] args) {
      /*  String[][] array = new String[2][2];
        array[0][0] = "00";
        array[0][1] = "01";
        array[1][0] = "10";
        array[1][1] = "11";
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                System.out.println(array[i][j]);*/
       int[][] InputArray = new int[2][3];
       int[] InputOneArray = new int[2];
       int SumArray = 0;
       int SumRowsArray = 0;
       for (int i = 0; i < InputArray.length; i++) {
           for (int j = 0; j < InputArray.length; j++) {
               InputArray[i][j] = (int) (Math.random() * 10 + 3);
               SumArray += InputArray[i][j];
               System.out.print((i+1) +"-я строка двумерного массива " + InputArray[i][j] + " ");
               SumRowsArray +=InputArray[i][j];
                   }
           InputOneArray[i] = SumRowsArray;
           System.out.println("");
           System.out.println("Сумма строк массива " + SumRowsArray);
           SumRowsArray = 0;
           System.out.println("");
            }
       System.out.println("Сумма всех чисел двумерного массива " + SumArray);
       System.out.println("Массив сумм каждой строки " + Arrays.toString(InputOneArray));
               }

}
