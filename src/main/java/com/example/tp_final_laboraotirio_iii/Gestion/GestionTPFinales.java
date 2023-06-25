package com.example.tp_final_laboraotirio_iii.Gestion;

import com.example.tp_final_laboraotirio_iii.TpFinales.TPFinalMalenia;

import java.util.Arrays;

public class GestionTPFinales {

//region Malenia

    public String[] getArregloPreguntasMalenia (){
        TPFinalMalenia textoMelina = new TPFinalMalenia();
        return Arrays.copyOf(textoMelina.getPreguntas(), textoMelina.getPreguntas().length);
    }

    //endregion
}
