/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less2;

/**
 *
 * @author lutsishinpa
 */
public class DVDPlayer extends Player implements IPlayable {
    
    @Override
    public void Play() {
        System.out.println("DVD is playing good film");
    }
    
    public DVDPlayer() {
        this.name = "DVD";
    }

    @Override
    public String GetName() {
        return this.name;
    }
    
}
