/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilitypattern;

public class Message {
    public String text;
    public MessagePriority priority;
    public Message(String msg, MessagePriority p)
    {
        text = msg;
        this.priority = p;
    }   
 }
