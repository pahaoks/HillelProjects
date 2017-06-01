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
public class Player {
    
    private IPlayable player;
    public String name;
    
    public Player(IPlayable playable) {
        this.player = playable;
        System.out.println("Инициализируем плеер: " + playable.GetName());
    }
    
    public Player() {
        
    }
    
    public void Play() {
        player.Play();
    }
    
}
