package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Alan on 22/03/2018.
 */

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    @NonNull
    public static String periodoEmTexto(int pacote) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, pacote);
        SimpleDateFormat formatoBR   = new SimpleDateFormat(DIA_E_MES);
        String dataIdaFormatada = formatoBR.format(dataIda.getTime());
        String dataVoltaFormatada = formatoBR.format(dataVolta.getTime());
        return dataIdaFormatada + " - "
                + dataVoltaFormatada + " de "
                + dataVolta.get(Calendar.YEAR);
    }
}
