package model;

public class Endereco {

    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private Integer numero;
    private String complemento;
    private String codigoRastreio;
    private Pessoa pessoa;


    public Endereco() {

    }

    public Endereco(
        String pais,
        String estado,
        String bairro,
        String cidade,
        String rua,
        String cep,
        Integer numero,
        String complemento,
        String codigoRastreio,
        Pessoa pessoa
    ){
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.codigoRastreio = codigoRastreio;
        this.pessoa = pessoa;

    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public Pessoa getPessoa(){
        return this.pessoa;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public String getCodigoRastreio() {
        return this.codigoRastreio;
    }

    public void setCodigoRastreio(String codigoRastreio) {
        this.codigoRastreio = codigoRastreio;
    }

    @Override
    public String toString() {
        return
                        "\npais: " +pais +
                        "\ncidade: " + this.cidade +
                        "\nbairro: " + this.bairro +
                        "\nrua: " + this.rua +
                        "\ncep: " + this.cep +
                        "\nnumero: " + this.numero +
                        "\ncomplemento: " + this.complemento +
                        "\nPessoa: " + this.pessoa +
                        "\ncodigoRastreio: " + this.codigoRastreio;
    }
    }




