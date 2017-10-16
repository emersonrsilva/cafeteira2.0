/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.strategy;

import cafeteira.strategy.NivelBaixo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emerson
 */
public class NivelAlto  implements CafeteiraStrategy{

    @Override
    public void execute() {
        try {
            System.out.println("enchendo a caneca");
            Thread.sleep(10000);
            System.out.println("caneca cheia\n=============");
        } catch (InterruptedException ex) {
            Logger.getLogger(NivelBaixo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}