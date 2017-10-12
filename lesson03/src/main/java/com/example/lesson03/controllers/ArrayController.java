package com.example.lesson03.controllers;

import com.example.lesson03.models.ArrayResultModel;
import com.example.lesson03.services.ArrayGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/array")
@EnableAutoConfiguration
public class ArrayController {

    @Autowired
    private ArrayGenerator arrayGenerator;

    @RequestMapping(value = "/generate", method = RequestMethod.GET)
    @ResponseBody
    public ArrayResultModel generate(@RequestParam(value="length", required=false, defaultValue="1000")int length){
        long startTime = System.nanoTime();
        int[] array = arrayGenerator.generateRandomSeqArray(length);
        long endTime = System.nanoTime();

        ArrayResultModel result = new ArrayResultModel(startTime, endTime, (endTime - startTime) / 1000000.0, array);

        return  result;
    }
}
