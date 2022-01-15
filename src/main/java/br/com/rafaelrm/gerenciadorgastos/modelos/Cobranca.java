package br.com.rafaelrm.gerenciadorgastos.modelos;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cobranca {
    private String descricaoGasto;
    private Double valor;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataVencimento;
    private Boolean quitada;
    
}
