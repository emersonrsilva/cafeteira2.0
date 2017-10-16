/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.composite;

import cafeteira.factory.TipoCafe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emerson
 */
public class Expresso extends CafeComposite {

    public Expresso(String nome) {
        super(nome);
    }

    @Override
    public void preparaReceita() {
        children.add(new CafePuro("Cafe Puro"));
        children.add(new Agua("Agua"));
    }

}
