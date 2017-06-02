/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.pahaoks.hillel.less2and4;

import java.util.Scanner;

/**
 *
 * @author lutsishinpa
 */
public class Player {
    
    private IPlayable player;
    public String name;
    private ButtonType currentButton;
    
    public Player(IPlayable playable) {
        this.player = playable;
        System.out.println("Инициализируем плеер: " + playable.GetName());
    }
    
    public Player() {
        
    }
    
    public void Play() {
        pressButton(ButtonType.play);
        waitCommand();
    }
    
    public void Stop() {
        pressButton(ButtonType.stop);
    }
    
    public void Next() {
        pressButton(ButtonType.next);
    }
    
    public void Previous() {
        pressButton(ButtonType.previous);
    }
    
    private void pressButton(ButtonType button) {
        currentButton = button;
        AbstractButton.construct(currentButton).pressButton();
    }
    
    private void waitCommand() {
        Scanner in = new Scanner(System.in);
        String commandName;
        ButtonType buttonTypeInput;
        
        System.out.println("Введите название кнопки для управления плеером: play, stop, next, previous или 0 для выключения");
        
        while(true) {
            commandName = in.nextLine().trim();
            
            if (commandName.equals("0"))
                break;
            
            try {
                buttonTypeInput = Enum.valueOf(ButtonType.class, commandName);
            }
            catch (Exception ex) {
                System.out.println("Неверная команда");
                continue;
            }
            
            this.pressButton(buttonTypeInput);
        }
    }
}
