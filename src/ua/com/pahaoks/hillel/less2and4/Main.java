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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IPlayable playable = new DVDPlayer();
        playable.Play();
        
        playable = new MP3Player();
        playable.Play();
        
        new Player(new DVDPlayer()).Play();
        new Player(new MP3Player()).Play();
        
        
    }
    
}