package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Consulta;
import br.ufpa.facomp.jsf.domain.enumeration.TipoPagamento;
import br.ufpa.facomp.jsf.domain.enumeration.TipoProcedimento;
import br.ufpa.facomp.jsf.repository.ConsultaRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ConsultaBean implements Serializable {

    private String buscaConsulta="";

    @Autowired
    private ConsultaRepository repositorio;

    private Consulta consulta = new Consulta();

    private List<Consulta> lista = new ArrayList<>();

    public void excluir(){
        if(consulta!=null){
            repositorio.delete(consulta);
            JSFUtil.adicionarMsgGlobalExclusaoSucesso();
            consulta = new Consulta();
        }
    }

    public void atualizar(){
        if(consulta!=null && consulta.getId()!= null && consulta.getId()>0){
            repositorio.save(consulta);
            JSFUtil.adicionarMsgGlobalAlteracaoSucesso();
            consulta = new Consulta();
        }else
            JSFUtil.setErro("Precisa selecionar um funcionario já existente para atualizar");
    }
    public void salvar() {
        repositorio.save(consulta);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        consulta = new Consulta();
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public List<Consulta> getLista() {
        lista = repositorio.findAllByPessoaNomeContaining(buscaConsulta);
        return lista;
    }

    public String getBuscaConsulta() {
        return buscaConsulta;
    }

    public void setBuscaConsulta(String buscaConsulta) {
        this.buscaConsulta = buscaConsulta;
    }

    public TipoProcedimento[] procedimento(){
        return TipoProcedimento.values();
    }
    
    public TipoPagamento[] pagamento(){
        return TipoPagamento.values();
    }
}
