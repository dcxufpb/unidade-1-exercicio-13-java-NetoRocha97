// package com.example.project;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// public class TestDepartamento {
//     private String brk = System.lineSeparator();

//     private String TEXTO_ESPERADO_DEPARTAMENTO_COMPLETO ="Departamento 1" + brk +
//                                                          "Sigla 1" + brk +
//                                                          "Localização: Local 1" + brk +
//                                                          "Maurício" + brk +
//                                                          "Idade: 30" + brk +
//                                                          "CPF: 999.999.999-99" + brk;

                                                         
//     private String TEXTO_ESPERADO_SEM_SIGLA ="Departamento 1" + brk +
//                                                          "" + brk +
//                                                          "Localização: Local 1" + brk +
//                                                          "Maurício" + brk +
//                                                          "Idade: 30" + brk +
//                                                          "CPF: 999.999.999-99" + brk;
                                                     
                                                     
//     private String TEXTO_ESPERADO_SEM_IDADE ="Departamento 1" + brk +
//                                                          "Sigla 1" + brk +
//                                                          "Localização: Local 1" + brk +
//                                                          "Maurício" + brk +
//                                                          "CPF: 999.999.999-99" + brk;                                                       
                                                      
                                                         
//     private String TEXTO_ESPERADO_SEM_SIGLA_SEM_IDADE ="Departamento 1" + brk +
//                                                          "" + brk +
//                                                          "Localização: Local 1" + brk +
//                                                          "Maurício" + brk +
//                                                          "CPF: 999.999.999-99" + brk;                                                                                                              


//     private String NOME_DEPARTAMENTO = "Departamento 1";
//     private String SIGLA = "Sigla 1";
//     private String LOCALIZACAO = "Local 1";
//     private String NOME_COORDENADOR = "Maurício";
//     private int IDADE = 30;
//     private String CPF = "999.999.999-99";
        
// @Test
//     public void departamentoCompleto() {
//         Departamento departamentoCompleto = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, CPF));
//                 rodarTestarRetorno(TEXTO_ESPERADO_DEPARTAMENTO_COMPLETO, departamentoCompleto);
//     }

// @Test
//     public void siglaVazia() {
//         Departamento siglaVazia = new Departamento(NOME_DEPARTAMENTO, "", LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, CPF));
//                 rodarTestarRetorno(TEXTO_ESPERADO_SEM_SIGLA, siglaVazia);
//     }

// @Test
//     public void idadeVazia() {
//         Departamento idadeVazia = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, 0, CPF));
//                 rodarTestarRetorno(TEXTO_ESPERADO_SEM_IDADE, idadeVazia);
//     }

// @Test
//     public void sigla_idade_vazias() {
//         Departamento sigla_idade_vazias = new Departamento(NOME_DEPARTAMENTO, "", LOCALIZACAO, new Coordenador(NOME_COORDENADOR, 0, CPF));
//                 rodarTestarRetorno(TEXTO_ESPERADO_SEM_SIGLA_SEM_IDADE, sigla_idade_vazias);
//     }    

// @Test
// 	public void nome_departamento_vazio() {
// 		Departamento nome_departamento_vazio = new Departamento("", SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, CPF));
// 		verificarCampoObrigatorio("O campo nome do departamento é obrigatório", nome_departamento_vazio);

// 		Departamento nome_departamento_nulo = new Departamento(null, SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, CPF));
// 		verificarCampoObrigatorio("O campo nome do departamento é obrigatório", nome_departamento_nulo);
//     }
    
// @Test
// 	public void localizacao_departamento_vazia() {
// 		Departamento localizacao_departamento_vazia = new Departamento(NOME_DEPARTAMENTO, SIGLA, "", new Coordenador(NOME_COORDENADOR, IDADE, CPF));
// 		verificarCampoObrigatorio("O campo localização do departamento é obrigatório", localizacao_departamento_vazia);

// 		Departamento localizacao_departamento_nulo = new Departamento(NOME_DEPARTAMENTO, SIGLA, null, new Coordenador(NOME_COORDENADOR, IDADE, CPF));
// 		verificarCampoObrigatorio("O campo localização do departamento é obrigatório", localizacao_departamento_nulo);
//     }
    
// @Test
// 	public void nome_coordenador_vazio() {
// 		Departamento nome_coordenador_vazio = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador("", IDADE, CPF));
// 		verificarCampoObrigatorio("O campo nome do coordenador do departamento é obrigatório", nome_coordenador_vazio);

// 		Departamento nome_coordenador_nulo = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador(null, IDADE, CPF));
// 		verificarCampoObrigatorio("O campo nome do coordenador do departamento é obrigatório", nome_coordenador_nulo);
// 	}
    
// @Test
// 	public void cpf_coordenador_vazio() {
// 		Departamento cpf_coordenador_vazio = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, ""));
// 		verificarCampoObrigatorio("O campo CPF do coordenador do departamento é obrigatório", cpf_coordenador_vazio);

// 		Departamento cpf_coordenador_nulo = new Departamento(NOME_DEPARTAMENTO, SIGLA, LOCALIZACAO, new Coordenador(NOME_COORDENADOR, IDADE, null));
// 		verificarCampoObrigatorio("O campo CPF do coordenador do departamento é obrigatório", cpf_coordenador_nulo);
// 	}
    
//     private void rodarTestarRetorno(String expected, Departamento departamento) {
//     // action
//     String retorno = departamento.dadosDepartamento();
//     // assertion
//     assertEquals(expected, retorno);
//     }

// 	private void verificarCampoObrigatorio(String mensagemEsperada, Departamento departamento) {
// 		try {
// 			departamento.dadosDepartamento();
// 		} catch (RuntimeException e) {
// 			assertEquals(mensagemEsperada, e.getMessage());
// 		}
// 	}
// }