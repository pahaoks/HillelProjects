/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lutsishinpa
 */
public class MapTest implements Runnable {

    @Override
    public void run() {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Asassins Creed", 4);
        map.put("Resident Evil", 2);
        map.put("Warcraft", 5);
        map.put("Mummy", 3);
        map.put("Mission Impossible", 4);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Фильм: " + entry.getKey() + ", Оценка: " + entry.getValue());
        }
    } 
    
}
