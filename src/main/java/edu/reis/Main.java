package edu.reis;

import edu.reis.model.SaidaFormatada;
import edu.reis.service.Conversao;
import edu.reis.service.Requisicao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String continuar = "s";
        String moedaBase = "";
        String moedaAlvo = "";
        int operacao = 0;
        double valor;

        Scanner sc = new Scanner(System.in);
        SaidaFormatada sf = new SaidaFormatada();
        Requisicao requisicao = new Requisicao();

        List<Conversao> conversoes = new ArrayList<>();

        while (continuar.equalsIgnoreCase("s")) {
            try {


                sf.menu();
                operacao = sc.nextInt();
                sc.nextLine();

                switch (operacao) {
                    case 1:
                        moedaBase = "BRL";
                        moedaAlvo = "USD";
                        break;

                    case 2:
                        moedaBase = "BRL";
                        moedaAlvo = "CLP";
                        break;

                    case 3:
                        moedaBase = "BRL";
                        moedaAlvo = "AUD";
                        break;

                    case 4:
                        moedaBase = "USD";
                        moedaAlvo = "BRL";
                        break;

                    case 5:
                        moedaBase = "CLP";
                        moedaAlvo = "BRL";
                        break;

                    case 6:
                        moedaBase = "AUD";
                        moedaAlvo = "BRL";
                        break;

                    default:
                        System.out.println("Operação Invalida!");
                }

                if (operacao >= 1 && operacao <= 6) {
                    sf.informeValor();
                    valor = sc.nextDouble();
                    sc.nextLine();

                    Conversao conversao = requisicao.conversao(moedaBase, moedaAlvo, valor);
                    conversao.resultado();
                    conversoes.add(conversao);

                    sf.novaConversao();
                    continuar = sc.nextLine();
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                sf.erroInsercao();
            }
        }

        sc.close();
        sf.geraExtrato();

        for (Conversao conversao : conversoes) {
            conversao.resultado();
        }

    }
}