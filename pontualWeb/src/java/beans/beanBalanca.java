/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import entidades.Balanca;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanBalanca {

    private Balanca balanca = new Balanca();
    private List<Balanca> balancas = new ArrayList<>();

    public Balanca getBalanca() {
        return balanca;
    }

    public void setBalanca(Balanca balanca) {
        this.balanca = balanca;
    }

    public List<Balanca> getBalancas() {
        return balancas;
    }

    public void setBalancas(List<Balanca> balancas) {
        this.balancas = balancas;
    }

    public beanBalanca() {
    }

}
