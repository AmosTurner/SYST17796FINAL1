/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateNet;

/**
 *
 * @author amost
 */
public class CalculateNet {

    public static int calculateNet (int hours, int rate, int tax) {
        int gross = hours * rate;
        int net = gross - tax;
        return net;
    }
    
}

