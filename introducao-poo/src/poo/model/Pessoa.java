package poo.model;

public class Pessoa {
    public enum TipoPessoa {FISICA, JURIDICA}
    public Integer codigo;
    public String nome;
    private String documento;
    private TipoPessoa tipo;
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;


    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        }

        if (documento.length() == TAMANHO_CPF) {
            setDocumento(documento, TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento Inválido para pessoa física ou jurídica.");
        }

    }

    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        setTipo(tipo);
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
}
