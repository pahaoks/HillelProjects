/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lutsishinpa
 */
public class ArrayListTest implements Runnable {

    @Override
    public void run() {
        List<String> arrayList = new ArrayList<>(Arrays.asList("А", "B", "C", "D"));
        
        for (String el : arrayList) {
            System.out.println(el);
        }
    }
}
