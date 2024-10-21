package edu.reis.service;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {

    private final Gson gson = new Gson();

    public Conversao conversao(String moedaBase, String moedaAlvo, double valor) {

        String chave = "8c95361da440122c932a799c";
        String uri = "https://v6.exchangerate-api.com/v6/" + chave + "/pair/" + moedaBase + "/" + moedaAlvo + "/" + valor;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Conversao parcial = gson.fromJson(json, Conversao.class);

            // foi necessário para passar o valor que o usuário quer converter ao record
            Conversao concluida = new Conversao(
                    parcial.conversion_result(),
                    parcial.base_code(),
                    parcial.target_code(),
                    valor);

            return concluida;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

}
