package com.example.project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    private Loja loja;
    private String datahora;
    private int ccf;
    private int coo;

    public Venda(Loja loja, String datahora, int ccf, int coo) {
        this.loja = loja;
        this.datahora = dataAtual();
        this.ccf = ccf;
        this.coo = coo;
    }

    public Venda(Loja loja, String DATAHORA, String CCF_VENDA, String COO_VENDA) {
	}

	public Loja getLoja() {
        return this.loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String getDataHora(){
        return this.datahora;
    }

    public void setDataHora(String datahora) {
        this.datahora = datahora;
    }

    public int getCcf() {
        return this.ccf;
    }

    public void setCcf(int ccf) {
        this.ccf = ccf;
    }

    public int getCoo() {
        return this.coo;
    }

    public void setCoo(int coo){
        this.coo = coo;
    }

    public static String dataAtual(){
        //Data e hora atuais
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatterData.format(now);
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(now);

        return dataFormatada + " " + horaFormatada + "V";
    }

    public void verificarCampoObrigatorioVenda(){
        if(this.loja == null) {
            throw new RuntimeException("O campo loja deve está preenchida");
        }
        if(this.datahora == null){
            throw new RuntimeException("O campo hora e data são obrigatórios");
        }

        if(this.ccf == 0) {
            throw new RuntimeException("O campo CCF é obrigatório");
        }

        if(this.coo == 0) {
            throw new RuntimeException("O campo COO é obrigatório");
        }
    }

    public String dadosVenda() {

        String _ccf = "CCF:" + this.ccf + " ";
        String _coo = "COO: " + this.coo;

        return dataAtual()+ _ccf + _coo;
        
    }

}