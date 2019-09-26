
package br.ufpa.facomp.jsf.web.bean;
import br.ufpa.facomp.jsf.domain.Consultorio;
import br.ufpa.facomp.jsf.repository.ConsultorioRepository;
import br.ufpa.facomp.jsf.web.util.JSFUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ConsultorioBean implements Serializable {

    @Autowired
    private ConsultorioRepository repositorio;

    private Consultorio consultorio = new Consultorio();

    public void salvar() {
        repositorio.save(consultorio);
        JSFUtil.adicionarMsgGlobalCadastroSucesso();
        consultorio = new Consultorio();
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

}
