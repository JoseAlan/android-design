package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

/**
 * Created by Alan on 17/03/2018.
 */

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int quantDias) {
        if (quantDias > 1) {
            return quantDias + PLURAL;
        }
        return quantDias + SINGULAR;


    }

}