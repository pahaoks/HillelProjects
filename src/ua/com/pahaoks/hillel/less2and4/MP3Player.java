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
    
    public MP3Player() {
        super("MP3");
    }

    @Override
    public String GetName() {
        return this.name;
    }
    
}
