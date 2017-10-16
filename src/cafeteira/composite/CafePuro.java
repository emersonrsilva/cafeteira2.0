/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.composite;

/**
 *
 * @author emerson
 */
class CafePuro extends CafeComposite {

    public CafePuro(String nome) {
        super(nome);
    }

    @Override
    public float valorTotal(){
        return 1;
    }

    @Override
    public void preparaReceita() {
        
    }
    
}
