/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lutsishinpa
 */
public class SetTest implements Runnable {

    @Override
    public void run() {
        Set<String> set = new HashSet<>(Arrays.asList("А", "B", "C", "D", "D", "E"));
        
        for (String el : set) {
            System.out.println(el);
        }
    } 
    
}
