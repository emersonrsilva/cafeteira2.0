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
public interface CafeteiraObserver {
    void update(EstadoCafeteiraEnum estado);
}
