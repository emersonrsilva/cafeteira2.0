/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira.factory;

/**
 *
 * @author emerson
 */
public interface TipoCafe {
    public abstract void preparaReceita();
    public abstract  float valorTotal();
    public abstract  String getNome();
}
