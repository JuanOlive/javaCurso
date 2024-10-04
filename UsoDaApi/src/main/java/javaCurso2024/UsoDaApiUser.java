package javaCurso2024;

import java.util.Scanner;
import org.json.JSONObject;


public class UsoDaApiUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu CEP:");
        String cep = scan.next();

        // Chama o método da API
        String resposta = ViaCepAPI.buscarEndereco(cep);
        
        // Verifica se a resposta não é um erro
        if (!resposta.contains("Erro") && !resposta.contains("Ocorreu")) {
            // Cria um objeto JSON a partir da resposta
            JSONObject endereco = new JSONObject(resposta);
            
            // Exibe as informações do endereço
            System.out.println("Endereço:");
            System.out.println("Logradouro: " + endereco.getString("logradouro"));
            System.out.println("Bairro: " + endereco.getString("bairro"));
            System.out.println("Cidade: " + endereco.getString("localidade"));
            System.out.println("Estado: " + endereco.getString("uf"));
        } else {
            // Exibe mensagem de erro
            System.out.println(resposta);
        }
        
        scan.close(); // Fecha o scanner
    }
}
