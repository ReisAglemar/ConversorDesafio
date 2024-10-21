package edu.reis.model;

public class SaidaFormatada {

    public void menu() {
        String menu = """
                
                    ========== Meu Conversor ==========
                
                    Use os Números Para Escolher Uma Conversão
                
                    1- Real Para Dólar.
                    2- Real Para Peso Chileno.
                    3- Real Para Dólar Australiano.
                    4- Dólar Para Real.
                    5- Peso Chileno Para Real.
                    6- Dólar Australiano Para Real.
                
                """;
        System.out.println(menu);
    }

    public void informeValor() {
        String informeValor = """
                
                Informe o Valor Que Deseja Converter.
                
                """;
        System.out.println(informeValor);
    }

    public void novaConversao() {
        String novaConersao = "    Deseja Fazer Nova Consulta (s/n)? ";
        System.out.print(novaConersao);
    }

    public void erroInsercao() {
        String erroInsercao = """
                
                    Verifique o Tipo de Dado informado.
                    Lembre-se, de Usar Vírgula Para os Centavos.
                
                """;
        System.out.println(erroInsercao);
    }

    public void geraExtrato() {
        String extrato = """
                
                ========== Extrato ==========
                """;
        System.out.print(extrato);
    }
}
