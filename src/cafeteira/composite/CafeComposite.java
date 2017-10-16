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
public abstract class CafeComposite implements TipoCafe {

    protected List<CafeComposite> children = new ArrayList<>();
    protected String nome;

    public CafeComposite(String nome) {
        this.nome = nome;
    }

    public void add(CafeComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    public void print() {
        for (CafeComposite letter : children) {
            letter.print();
        }
    }

    @Override
    public float valorTotal() {
        float valor = 0f;
        System.out.println("Para "+nome+" vou adicionar");
        for (CafeComposite ingrediente : children) {
            System.out.println(ingrediente.getNome()+" - R$"+ingrediente.valorTotal());
            valor += ingrediente.valorTotal();
        }

        return valor;
    }

    public String getNome(){
        return nome;
    }

}
