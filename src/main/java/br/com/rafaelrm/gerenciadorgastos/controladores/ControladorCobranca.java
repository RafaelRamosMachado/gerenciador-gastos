package br.com.rafaelrm.gerenciadorgastos.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelrm.gerenciadorgastos.modelos.Cobranca;
import br.com.rafaelrm.gerenciadorgastos.servicos.ServicoCobranca;

@RestController
@RequestMapping("/gasto")
public class ControladorCobranca {
    private ServicoCobranca servicoCobranca;
    
    public ControladorCobranca(){
        servicoCobranca = new ServicoCobranca();
    }

    @GetMapping("/teste")
    public String testarGasto(){
        return "Gasto Inserido!";
    }

    @GetMapping("/cobrancas")
    public List<Cobranca> retornaCobranca(){
        return servicoCobranca.retornarCobrancas();
    }
}

