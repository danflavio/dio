package poo;

import poo.model.Cliente;
import poo.model.Endereco;
import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "75091432";

        Cliente cliente = new Cliente();
        cliente.setDocumento("73127264100");

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!" + endereco.toString());
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicionar o endereco: " + e.getMessage());
        }

    }

}
