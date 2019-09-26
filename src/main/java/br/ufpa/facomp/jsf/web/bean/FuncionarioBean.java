package br.ufpa.facomp.jsf.web.bean;

import br.ufpa.facomp.jsf.domain.Funcionario;
import br.ufpa.facomp.jsf.repository.FuncionarioRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class FuncionarioBean implements Serializable {

   

    @Autowired
    private FuncionarioRepository repositorio;

    private Funcionario funcionario = new Funcionario();

    public void salvar() {
        repositorio.save(funcionario);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        funcionario = new Funcionario();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
