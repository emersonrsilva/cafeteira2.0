/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.composite;

import cafeteira.factory.TipoCafe;

/**
 *
 * @author emerson
 */
public class Capuccino extends CafeComposite {

    public Capuccino(String nome) {
        super(nome);
    }

   @Override
    public void preparaReceita() {
        children.add(new CafePuro("CafePuro"));
        children.add(new Leite("Leite"));
        children.add(new Agua("Agua"));
    }
   
}
