package model;

/**
 * Created by matheus on 01/02/17.
 */

public class Medico {
    private String nome;
    private String endereco;
    private String telefone;
    private String crm;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String especialidade;


    public Medico (String nome,String endereco, String telefone, String crm, String especialidade){
        this.nome = nome;
        this.endereco = endereco;
        this.crm= crm;
        this.especialidade = especialidade;
        this.telefone = telefone;

    }

    public Medico() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


}
