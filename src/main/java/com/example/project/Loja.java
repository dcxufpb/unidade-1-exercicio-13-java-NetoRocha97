package com.example.project;

public class Loja {

    private String nomeLoja;
    private Endereco endereco;
    private String telefone;
    private String observacao;
    private String cnpj;
    private String inscricaoEstadual;

    public Loja(String nomeLoja, Endereco endereco, String telefone,
                String observacao, String cnpj, String inscricaoEstadual) {
        this.nomeLoja = nomeLoja;
        this.endereco = endereco;
        this.telefone = telefone;
        this.observacao = observacao;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static boolean isEmpty(String input){
		if (input == null){
			return true;
		}
		
		if (input.equals("")){
			return true;
		}

		else{
			return false;
		}
	}

    public static String brk = System.lineSeparator();

    public void validarCamposObrigatorio(){
        
        if (isEmpty(this.getNomeLoja())){
			throw new RuntimeException ("O campo nome da loja é obrigatório");
        }
        
        if(isEmpty(this.getCnpj())){
            throw new RuntimeException("O campo cnpj da loja é obrigatório");
        }

        if(isEmpty(this.getInscricaoEstadual())){
            throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
        }
}
    public String dadosLoja() {

        String _telefone = isEmpty(getTelefone()) ? "" : "Tel " + getTelefone();
        _telefone = (!_telefone.isEmpty() && !isEmpty(endereco.getCep())) ? " " + _telefone : _telefone;
		
		String _observacao = isEmpty(getObservacao()) ? "" : getObservacao();				
		String _cnpj = "CNPJ: " + getCnpj();
        String _ie = "IE: " + getInscricaoEstadual();
        

        String retornoLoja = getNomeLoja() + brk;
        retornoLoja += endereco.dadosEndereco();
        retornoLoja += _telefone + brk;
		retornoLoja += _observacao + brk;
		retornoLoja += _cnpj + brk;
        retornoLoja += _ie + brk;   
        
        return retornoLoja;

    }

}