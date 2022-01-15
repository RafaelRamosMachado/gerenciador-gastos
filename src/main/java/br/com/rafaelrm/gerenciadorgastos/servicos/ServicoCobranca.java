package br.com.rafaelrm.gerenciadorgastos.servicos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.rafaelrm.gerenciadorgastos.modelos.Cobranca;

public class ServicoCobranca {
    
    private List<Cobranca> cobrancas;
    private Cobranca cobranca1 = new Cobranca();
    private Cobranca cobranca2 = new Cobranca();
    public List<Cobranca> retornarCobrancas(){
        
        popularCobranca();
        return cobrancas;
    }

    private void popularCobranca(){
        cobrancas = new ArrayList<Cobranca>();
        cobranca1.setDescricaoGasto("Supermercado");
        cobranca1.setValor(180.90);
        cobranca1.setDataEntrada(LocalDateTime.now());
        cobranca1.setDataVencimento(LocalDateTime.now().plusDays(10));
        cobranca1.setQuitada(true);

        cobranca2.setDescricaoGasto("Luz");
        cobranca2.setValor(210.90);
        cobranca2.setDataEntrada(LocalDateTime.now());
        cobranca2.setDataVencimento(LocalDateTime.now().plusDays(20));
        cobranca2.setQuitada(false);

        cobrancas.add(cobranca1);
        cobrancas.add(cobranca2);
    }
}
