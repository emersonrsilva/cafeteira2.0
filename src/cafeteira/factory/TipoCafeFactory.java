/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.factory;

import cafeteira.composite.Capuccino;
import cafeteira.composite.Expresso;

/**
 *
 * @author emerson
 */
public class TipoCafeFactory {
   public static TipoCafe getCapsula(TipoCafeEnum tipo){   
        if(tipo == TipoCafeEnum.EXPRESSO){
            return new Expresso("Expresso");
        } else {
            return new Capuccino("Capuccino");
        }
    } 
}
