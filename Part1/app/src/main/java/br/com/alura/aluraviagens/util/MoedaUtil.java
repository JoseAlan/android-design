package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Alan on 17/03/2018.
 */

public class MoedaUtil {

    public static final String LINGUAGEM = "pt";
    public static final String PAIS = "br";
    public static final String FORMATO_PADRAO = "R$";
    public static final String FORMATO_DESEJADO = "R$ ";

    public static String formataParaBrasileiro(BigDecimal valor) {
        NumberFormat formatoBR = DecimalFormat
                .getCurrencyInstance(new Locale(LINGUAGEM, PAIS));
        return formatoBR.format(valor).replace(FORMATO_PADRAO, FORMATO_DESEJADO);
    }
}
