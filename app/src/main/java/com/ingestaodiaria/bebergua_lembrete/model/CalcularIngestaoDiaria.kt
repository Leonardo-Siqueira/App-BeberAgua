package com.ingestaodiaria.bebergua_lembrete.model

class CalcularIngestaoDiaria {

    private val ML_JOVEM = 40.0
    private val ML_ADULTO = 35.0
    private val ML_IDOSO = 30.0
    private val ML_MAIS_DE_66_ANOS = 25.0

    private var resultado_ml = 0.0
    private var resultado_total_ml = 0.0

    fun calcularTotalMl(peso: Double, idade: Int) {

        if (idade <= 17) {
            resultado_ml = peso * ML_JOVEM
            resultado_total_ml = resultado_ml
        } else if (idade <= 55) {
            resultado_ml = peso * ML_ADULTO
            resultado_total_ml = resultado_ml
        } else if (idade <= 65) {
            resultado_ml = peso * ML_IDOSO
            resultado_total_ml = resultado_ml
        } else {
            resultado_ml = peso * ML_MAIS_DE_66_ANOS
            resultado_total_ml = resultado_ml
        }
    }

    fun resultadoML(): Double {
        return resultado_total_ml
    }
}