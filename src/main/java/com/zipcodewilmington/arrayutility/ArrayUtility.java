package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

   T[] newArr;

    public ArrayUtility(T[] newArr) {
        this.newArr = newArr;
    }

    public T[] removeValue(T valueToRemove) {

        return (T[]) valueToRemove;
    }



    public T countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {

        return null;
    }


    public T getNumberOfOccurrences(T valueToEvaluate) {

        return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
      int length1 = newArr.length;
      int length2 = arrayToMerge.length;
      int comboL = length2+length1;
      T[] resultArr = Arrays.copyOf(newArr,length1+ length2);
      System.arraycopy(arrayToMerge,0,resultArr,length1,length2);

        Map<T, Integer> counMap = new HashMap<>();//Hashmap to store count of each object

        //Iterate through array to count occurences of each object
        for (T object : resultArr) {
            if (counMap.containsKey(object)) {
                counMap.put((T) object, counMap.get(object) + 1);
            } else counMap.put((T) object, 1);
        }

        //Variables to track the most frequent object and its counts
        T mostfreq = null;
        int maxCount = 0;

        //Iterate through the countMap to find the object with highest count
        for (Map.Entry<T, Integer> entry : counMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostfreq = (T) entry.getKey();
                ;
            }
        }
        System.out.println(newArr);
        return  mostfreq;
    }
}
