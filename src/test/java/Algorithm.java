import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Algorithm {


    @Test
    void shouldUseBubbleSort() {
        int[] array = {6,2,3,4,1,5};
        System.out.println(Arrays.toString(array));
        for (int i=0; i< array.length - 1; i++){
            for (int j=0; j<array.length-1-i; j++){
                if (array[j] > array[j+1]) {
                    var temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = {6,2,3,4,1,5};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

    @Test
    void shouldUseSelectionSort() {
        int[] array = {6,2,3,4,1,5};
        for (var i=0; i <array.length;i++){
            for (var j = 1; j<array.length-1-i; j++){
                if (array[i] > array[j]){
                    var temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(array));

    }
}
