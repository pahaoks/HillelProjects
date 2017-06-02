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
public abstract class AbstractButton implements IButton {
    
    private ButtonType buttonType;
    
    public void setButtonType(ButtonType type) {
        this.buttonType = type;
    }
    
    public void pressButton() {
        System.out.println("Нажата кнопка " + buttonType.name());
        
        this.doAction();
    }
    
    public abstract void doAction();
    
    public static AbstractButton construct(ButtonType type) {
        AbstractButton button;
        
        switch (type) {
            case play: button = new PlayButton();
                break;
            case stop: button = new StopButton();
                break;
            case next: button = new NextButton();
                break;
            case previous: button = new PreviousButton();
                break;
            default: return null;        
        }
        
        button.setButtonType(type);
        return button;
    }
}
