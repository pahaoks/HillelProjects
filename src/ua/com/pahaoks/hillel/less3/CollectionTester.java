/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less3;

/**
 *
 * @author lutsishinpa
 */
public class CollectionTester {
    
    public static void Test(Runnable runnable) {
        System.out.println("Проверяем класс: " + runnable.getClass().getSimpleName());
        runnable.run();
    }
    
}
