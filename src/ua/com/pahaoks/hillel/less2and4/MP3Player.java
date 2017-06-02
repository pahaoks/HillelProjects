/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less2and4;

/**
 *
 * @author lutsishinpa
 */
public class MP3Player extends Player implements IPlayable {

    @Override
    public void Play() {
        System.out.println("MP3 is playing good music");
    }
    
    public MP3Player() {
        this.name = "MP3";
    }

    @Override
    public String GetName() {
        return this.name;
    }
    
}
