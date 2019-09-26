package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Pagamento;
import br.ufpa.facomp.jsf.repository.PagamentoRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class PagamentoBean implements Serializable {

    private String buscaPagamento="";
    
    @Autowired
    private PagamentoRepository repositorio;

    private Pagamento pagamento = new Pagamento();

    private List<Pagamento> lista = new ArrayList<>();

    public void salvar() {
        repositorio.save(pagamento);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        pagamento = new Pagamento();
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }



    public String getBuscaPagamento() {
        return buscaPagamento;
    }

    public void setBuscaPagamento(String buscaPagamento) {
        this.buscaPagamento = buscaPagamento;
    }
}