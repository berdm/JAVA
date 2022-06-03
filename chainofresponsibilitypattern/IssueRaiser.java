/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitypattern;

public class IssueRaiser {
    public Receiver setFirstReceiver;
    public void setFirstErrorHandler(Receiver firstErrorHandler)
    {
        this.setFirstReceiver = firstErrorHandler;
    }
    public void raiseMessage(Message message)
    {
        if(setFirstReceiver !=null)
            setFirstReceiver.handleMessage(message);  
    }
}
