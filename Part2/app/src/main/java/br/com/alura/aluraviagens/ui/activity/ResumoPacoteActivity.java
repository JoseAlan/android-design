package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DiasUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoPacoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pacote);

        setTitle("Resumo do  Pacote");

        Pacote pacoteSaoPaulo = new Pacote("Sao Paulo", "sao_paulo_sp", 2,
                new BigDecimal(243.99));

        TextView local = findViewById(R.id.resumo_pacote_local);
        local.setText(pacoteSaoPaulo.getLocal());

        ImageView imageView = findViewById(R.id.resumo_pacote_imagem);
        Drawable drawableDaImagem = ResourceUtil
                .devolveDrawable(this, pacoteSaoPaulo.getImagem());
        imageView.setImageDrawable(drawableDaImagem);

        TextView dias = findViewById(R.id.resumo_pacote_dias);
        String diasEmTexto = DiasUtil.formataEmTexto(pacoteSaoPaulo.getDias());
        dias.setText(diasEmTexto);

        TextView preco = findViewById(R.id.resumo_pacote_preco);
        String moedaBrasileira = MoedaUtil.formataParaBrasileiro(pacoteSaoPaulo.getPreco());
        preco.setText(moedaBrasileira);

        TextView data = findViewById(R.id.resumo_pacote_data);
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE,pacoteSaoPaulo.getDias());
        SimpleDateFormat formatoBR   = new SimpleDateFormat("dd/MM");
        String dataIdaFormatada = formatoBR.format(dataIda.getTime());
        String dataVoltaFormatada = formatoBR.format(dataVolta.getTime());
        String dataViagemFormatada = dataIdaFormatada + " - "
                + dataVoltaFormatada + " de "
                + dataVolta.get(Calendar.YEAR);
        data.setText(dataViagemFormatada



        );


    }
}
