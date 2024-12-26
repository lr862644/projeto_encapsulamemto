package model;

public class Documento{
    private String rg;
    private String cpf;

    public Documento(){

    }
    public Documento(String rg, String cpf){
        this.rg = rg;
        this.cpf = cpf;

    }
    public String getRg(){
        return this.rg;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    @Override
    public String toString(){
        return "\nCPF: " + this.cpf +
                "\nRG: " + this.rg;
    }
}

