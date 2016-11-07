/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entidades.DetalheOrdemServico;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanDetalheOrdemServico {

    private DetalheOrdemServico detalhe = new DetalheOrdemServico();
    private List<DetalheOrdemServico> detalhes = new ArrayList<>();

    public DetalheOrdemServico getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(DetalheOrdemServico detalhe) {
        this.detalhe = detalhe;
    }

    public List<DetalheOrdemServico> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<DetalheOrdemServico> detalhes) {
        this.detalhes = detalhes;
    }
    
    
    public beanDetalheOrdemServico() {
    }
    
}
