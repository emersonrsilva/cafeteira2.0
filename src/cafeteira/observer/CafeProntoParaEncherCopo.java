/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.observer;

/**
 *
 * @author emerson
 */
public class CafeProntoParaEncherCopo implements CafeteiraObserver {

    @Override
    public void update(EstadoCafeteiraEnum estado) {
        if(estado == EstadoCafeteiraEnum.CAFE_PRONTO_PARA_ENCHER){
            System.out.println("Mistura efetuada com sucesso!\n");
        }
    }
    
}
