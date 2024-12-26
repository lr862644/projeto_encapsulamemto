import model.Documento;
import model.Endereco;
import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();

        endereco.setPais("Brasil");
        endereco.setEstado("Goias");
        endereco.setCidade("São Mateus");
        endereco.setBairro("Vila Nova");
        endereco.setRua("Honduras");
        endereco.setCep("29948-535");
        endereco.setNumero(279965586);
        endereco.setComplemento("Casa");
        endereco.setCodigoRastreio("BR85695125");

        pessoa.setNome("Natan");
        pessoa.setIdade(25);
        pessoa.setTelefone("254165");

        Documento documento = new Documento("4125637", "12345678925");
        pessoa.setDocumento(documento);

        endereco.setPessoa(pessoa);
        System.out.println(endereco);

    }
}
