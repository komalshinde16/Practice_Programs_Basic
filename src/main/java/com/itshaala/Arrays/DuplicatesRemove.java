package com.itshaala.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesRemove {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,1,2,3,4};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num:array){
            set.add(num);
        }
        System.out.println(set);

    }
}
