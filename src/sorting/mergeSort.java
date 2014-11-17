package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class mergeSort {
    int[] tempArr;
    int[] copy; // where to store while moving the array back into the original
    // array

    public void sort(int[] arr) {
        tempArr = arr;
        copy = new int[tempArr.length];

        // make a copy


        mergeSortS(0, tempArr.length - 1);
    }

    // separates intwo two recursebly teh array then merges the parts back
    // together
    public void mergeSortS(int s, int l) {// receives start and last elemtn
     
        if (s < l) {
            int middle = s + (l - s) / 2;

            // separate into two parts  recursebly
            mergeSortS(s, middle);
            mergeSortS(middle+1, l);

            // merge in back together
            merge(s, middle, l);

        }
    }

    public void merge(int s, int m, int l) {
        
        for (int i = 0; i < tempArr.length; i++) 
            copy[i] = tempArr[i];
        

        int first = s, second = m + 1; // to mark the beggining of both
        // partitions
        int currentN = s; // to mark position on the new array

        // merge into a new array
        while (first <= m && second <= l) {
            if (copy[first] <= copy[second]) {
                tempArr[currentN] = copy[first];
                first++;
            } else {
                tempArr[currentN] = copy[second];
                second++;
            }
            currentN++;
        }
        // in case the first part is bigger than the second
       while (first <= m) {
            tempArr[currentN] = copy[first];
            first++;
            currentN++;
        }
    }
}
