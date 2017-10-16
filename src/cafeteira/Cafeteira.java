/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteira;

import cafeteira.observer.CafeteiraObserver;
import cafeteira.observer.EstadoCafeteiraEnum;
import cafeteira.factory.TipoCafe;
import cafeteira.strategy.CafeteiraStrategy;
import cafeteira.strategy.NivelBaixo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emerson
 */
class Cafeteira {
  private CafeteiraStrategy strategy;
   private List<CafeteiraObserver> observers = new ArrayList<>();
   private EstadoCafeteiraEnum estadoAtual = EstadoCafeteiraEnum.INICIADO;
   float saldoAtual = 0f;
   private TipoCafe tipoCafe;

    void changeNivel(CafeteiraStrategy nivel) {
        this.strategy = nivel;
    }

    public void addObserver(CafeteiraObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(CafeteiraObserver obs) {
        observers.remove(obs);
    }

    private void notifyObservers() {
        for (CafeteiraObserver obs : observers) {
            obs.update(estadoAtual);
        }
    }
    
    protected void addMoeda(float val){
        this.saldoAtual +=  val;
        this.estadoAtual = EstadoCafeteiraEnum.MOEDA_INSERIDA;
        notifyObservers();
    }


    void setTipoCafe(TipoCafe tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    
    void iniciar() {
        tipoCafe.preparaReceita();
        
        if (tipoCafe.valorTotal() <= saldoAtual){
            System.out.println("Preparando cafe: "+tipoCafe.getNome());
            this.estadoAtual = EstadoCafeteiraEnum.CAFE_PRONTO_PARA_ENCHER;
            notifyObservers();
            strategy.execute();
            this.estadoAtual = EstadoCafeteiraEnum.COPO_CHEIO;
        } else {
            this.estadoAtual = EstadoCafeteiraEnum.SALDO_INSUFICIENTE;
        }
        
        notifyObservers();
    }    

}
