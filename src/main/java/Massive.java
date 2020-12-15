import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
       /* double[] array = new double[100];
        double MaxElem = array[0];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
            System.out.println(array[i]);
            if (array[i] > MaxElem) MaxElem = array[i];
        }
        System.out.println("");
        System.out.println(MaxElem);
        System.out.println("");
        for (double i : array)
            System.out.println(i);*/
        Double[] InputArray = new Double[3];
        for (int i = 0; i < InputArray.length; i++)
            InputArray[i] = Math.random()*10;
        System.out.print(Arrays.toString(InputArray));
        int j = 0;
        Double SumElemArray = 0.0;
        while (j < InputArray.length){
            SumElemArray += InputArray[j];
            j++;
        }
        System.out.println("");
        System.out.println(SumElemArray);
        Double MultiElemArray = 1.0;
        for (int i = 0; i < InputArray.length; i++)
            MultiElemArray *= InputArray[i];
        System.out.println(MultiElemArray);
    }
}
