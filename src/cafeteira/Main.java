/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira;

import cafeteira.factory.TipoCafe;
import cafeteira.factory.TipoCafeFactory;
import cafeteira.observer.CafeProntoParaEncherCopo;
import cafeteira.strategy.NivelAlto;
import cafeteira.strategy.NivelBaixo;
import cafeteira.factory.TipoCafeEnum;

/**
 *
 * @author emerson
 */
public class Main {

    public static void main(String[] args) {
        Cafeteira cafeteira = new Cafeteira();
        cafeteira.addMoeda(3f);

        // factory tipo de cafe
        TipoCafe tipoCafe = TipoCafeFactory.getCapsula(TipoCafeEnum.EXPRESSO);

        cafeteira.setTipoCafe(tipoCafe);
        
        // strategy nivel de cafe
        cafeteira.changeNivel(new NivelBaixo());

        // observer quando a caneca estiver cheia
        cafeteira.addObserver(new CafeProntoParaEncherCopo());
        // observer quando a caneca estiver cheia
        cafeteira.addObserver(new SaldoInsuficiente());

        cafeteira.iniciar();
        
        // factory tipo de cafe
        TipoCafe tipoCafe2 = TipoCafeFactory.getCapsula(TipoCafeEnum.CAPUCCINO);

        cafeteira.setTipoCafe(tipoCafe2);


        // strategy nivel de cafe
        cafeteira.changeNivel(new NivelAlto());
        cafeteira.iniciar();

        
    }
}
