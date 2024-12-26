package model;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String telefone;
    private Documento documento;

    public Pessoa() {

    }

    public Pessoa(String nome, Integer idade, String telefone, Documento documento) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.documento = documento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Documento getDocumento() {
        return this.documento;
    }

    public void setDocumento(Documento documento){
        this.documento = documento;
    }

    @Override
    public String toString(){
        return
                "Nome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nTelefone: " + this.telefone +
                "\nDocumento: " + this.documento;

    }
}

