package br.ufpa.facomp.jsf.web.bean;


import br.ufpa.facomp.jsf.domain.Pessoa;
import br.ufpa.facomp.jsf.repository.PessoaRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Named
@ViewScoped
public class PessoaBean implements Serializable {

    private String buscaNome="";

    @Autowired
    private PessoaRepository repositorio;

    private Pessoa pessoa = new Pessoa();

    private List<Pessoa> lista = new ArrayList<>();

    public void excluir(){
        if(pessoa!=null){
            repositorio.delete(pessoa);
            JSFUtil.adicionarMsgGlobalExclusaoSucesso();
            pessoa = new Pessoa();
        }
    }

    public void atualizar(){
        if(pessoa!=null && pessoa.getId()!= null && pessoa.getId()>0){
            repositorio.save(pessoa);
            JSFUtil.adicionarMsgGlobalAlteracaoSucesso();
            pessoa = new Pessoa();
        }else
            JSFUtil.setErro("Precisa selecionar um automóvel já existente para atualizar");
    }
    public void salvar() {
  
        repositorio.save(pessoa);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        pessoa = new Pessoa();
    }


    public List<Pessoa> getLista() {
        lista = repositorio.findAllByNomeContaining(buscaNome);
        return lista;
    }

    public String getBuscaNome() {
        return buscaNome;
    }

    public void setBuscaNome(String buscaNome) {
        this.buscaNome = buscaNome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
