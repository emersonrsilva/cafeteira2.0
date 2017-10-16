/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira;

import cafeteira.observer.CafeteiraObserver;
import cafeteira.observer.EstadoCafeteiraEnum;

/**
 *
 * @author emerson
 */
class SaldoInsuficiente implements CafeteiraObserver {

    @Override
    public void update(EstadoCafeteiraEnum estado) {
        if(estado == EstadoCafeteiraEnum.SALDO_INSUFICIENTE){
            System.out.println("Saldo insufiente!!");
        }
    }

  
    
}
