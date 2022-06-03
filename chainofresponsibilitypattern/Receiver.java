/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitypattern;

public interface Receiver {
    
    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReceiver);   
}
