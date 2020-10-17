package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestVenda {

    private void verificarCampoObrigatorio(String mensagemEsperada, Venda venda) {
        try {
            venda.dadosVenda();
        } catch (RuntimeException e) {
            assertEquals(mensagemEsperada, e.getMessage());
        }
    }
        
        private String NOME_LOJA = "Loja 1";
	    private String LOGRADOURO = "Log 1";
	    private int NUMERO = 10;
	    private String COMPLEMENTO = "C1";
	    private String BAIRRO = "Bai 1";
	    private String MUNICIPIO = "Mun 1";
	    private String ESTADO = "E1";
	    private String CEP = "11111-111";
	    private String TELEFONE = "(11) 1111-1111";
	    private String OBSERVACAO = "Obs 1";
	    private String CNPJ = "11.111.111/1111-11";
	    private String INSCRICAO_ESTADUAL = "123456789";
        private String DATAHORA = "25/11/2020 10:30:40";
        private String CCF_VENDA = "021784";
        private String COO_VENDA = "035804";

        @Test
        public void validarLoja() {
            Venda lojaNulo = new Venda(null, DATAHORA, CCF_VENDA, COO_VENDA);
            verificarCampoObrigatorio("O campo loja deve está preenchida", lojaNulo);
        }

        @Test
        public  void validarDataHora() {
            Venda datahoraNulos = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), null, CCF_VENDA, COO_VENDA);
            verificarCampoObrigatorio("O campo hora e data são obrigatórios", datahoraNulos);

            Venda datahoraVazios = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), "", CCF_VENDA, COO_VENDA);
            verificarCampoObrigatorio("O campo hora e data são obrigatórios", datahoraVazios);
        }

        @Test
        public void validarCcf() {
            Venda ccfNulo = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), DATAHORA, null, COO_VENDA);
            verificarCampoObrigatorio("O campo CCF é obrigatório", ccfNulo);

            Venda ccfVazio = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), DATAHORA, "", COO_VENDA);
            verificarCampoObrigatorio("O campo CCF é obrigatório", ccfVazio);
        }
        
        @Test
        public void validarCoo() {
            Venda cooNulo = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), DATAHORA, CCF_VENDA, null);
            verificarCampoObrigatorio("O campo CCF é obrigatório", cooNulo);

            Venda cooVazio = new Venda(new Loja(NOME_LOJA, new Endereco(LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, MUNICIPIO, ESTADO, CEP), 
            TELEFONE, OBSERVACAO, CNPJ, INSCRICAO_ESTADUAL), DATAHORA, CCF_VENDA, "");
            verificarCampoObrigatorio("O campo CCF é obrigatório", cooVazio);
        }

}