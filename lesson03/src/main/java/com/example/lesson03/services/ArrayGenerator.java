package com.example.lesson03.services;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class ArrayGenerator {
    public int[] generateRandomSeqArray(int length) {
        Random random = new Random();
        int[] values = new int[length];
        for(int i = 0; i< length; i++)
            values[i] = (i << 3) + random.nextInt(8);  // i * 8 + Random(0~8); 保证不重复

        return values;
    }
}
