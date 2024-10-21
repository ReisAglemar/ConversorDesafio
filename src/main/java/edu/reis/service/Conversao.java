package edu.reis.service;

public record Conversao(double conversion_result, String base_code, String target_code, double valor) {

    public void resultado() {
        String resultado = """
                
                ========== %s para %s ==========
                
                    Valor em %s: %.2f
                    Valor em %s: %.2f
                
                """.formatted(base_code, target_code, base_code, valor, target_code, conversion_result);
        System.out.println(resultado);
    }
}
