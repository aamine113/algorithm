package org.exercise;

import java.io.*;
import java.util.*;

public class CountPairs {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchantA(int n, List<Integer> ar) {
        int result = 0;
        Map<Integer, Integer> correspondence = new HashMap<>();
        for (Integer i : ar){
            if (correspondence.containsKey(i)){
                correspondence.replace(i, correspondence.get(i) + 1);
            }
            else {
                correspondence.put(i, 1);
            }
        }

        for (Map.Entry m : correspondence.entrySet()){
            result += ((int) m.getValue()) / 2 ;
        }
        System.out.println(result);
        return result;

    }
    public static int sockMerchantB(int n, List<Integer> ar) {
        int result = 0;
        Set<Integer> colors = new HashSet<>();
        for (Integer i : ar){
            if (!colors.contains(i)){
                colors.add(i);
            }
            else{
                result++;
                colors.remove(i);
            }
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) throws IOException {
        CountPairs.sockMerchantA(6, Arrays.asList(1,1, 3, 1, 2, 1, 3, 3, 3, 3));
        CountPairs.sockMerchantB(6, Arrays.asList(1,1, 3, 1, 2, 1, 3, 3, 3, 3));
    }

}
