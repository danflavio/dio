package poo.model;

public class Endereco {

    public enum TipoEndereco {
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;

    @Override
    public String toString() {
        return "\nEndereco{" +
                "endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
