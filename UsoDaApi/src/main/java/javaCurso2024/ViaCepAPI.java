package javaCurso2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCepAPI {

    private static final String URL_VIA_CEP = "https://viacep.com.br/ws/";

    public static String buscarEndereco(String cep) {
        try {
            // Cria a URL para a requisição
            URL url = new URL(URL_VIA_CEP + cep + "/json/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Verifica se a resposta foi bem-sucedida
            if (conn.getResponseCode() == 200) {
                // Lê a resposta da API
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder resposta = new StringBuilder();
                String linha;

                while ((linha = reader.readLine()) != null) {
                    resposta.append(linha);
                }
                reader.close();
                return resposta.toString(); // Retorna a resposta como String
            } else {
                return "Erro: " + conn.getResponseMessage();
            }
        } catch (Exception e) {
            return "Ocorreu um erro: " + e.getMessage();
        }
        
    }
}
