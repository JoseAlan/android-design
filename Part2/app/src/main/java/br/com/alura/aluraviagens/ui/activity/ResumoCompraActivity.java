package br.com.alura.aluraviagens.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigDecimal;

import br.com.alura.aluraviagens.R;
import br.com.alura.aluraviagens.model.Pacote;
import br.com.alura.aluraviagens.util.DataUtil;
import br.com.alura.aluraviagens.util.MoedaUtil;
import br.com.alura.aluraviagens.util.ResourceUtil;

public class ResumoCompraActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Resumo da compra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_compra);
        setTitle(TITULO_APPBAR);

        Pacote pacoteSaoPaulo = new Pacote("Sao Paulo", "sao_paulo_sp", 2,
                new BigDecimal(243.99));

        mostraImagem(pacoteSaoPaulo);

        mostraLocal(pacoteSaoPaulo);

        mostraDataViagem(pacoteSaoPaulo);

        mostraPreco(pacoteSaoPaulo);

    }

    private void mostraPreco(Pacote pacote) {
        TextView preco = findViewById(R.id.resumo_compra_preco_pacote);
        String formatoBrasileiro = MoedaUtil.formataParaBrasileiro(pacote.getPreco());
        preco.setText(formatoBrasileiro);
    }

    private void mostraDataViagem(Pacote pacote) {
        TextView dataViagem = findViewById(R.id.resumo_compra_data_viagem);
        String dataViagemFormatada = DataUtil.periodoEmTexto(pacote.getDias());
        dataViagem.setText(dataViagemFormatada);
    }

    private void mostraLocal(Pacote pacote) {
        TextView local = findViewById(R.id.resumo_compra_local_pacote);
        local.setText(pacote.getLocal());
    }

    private void mostraImagem(Pacote pacote) {
        ImageView local = findViewById(R.id.resumo_compra_imagem_local);
        Drawable drawable = ResourceUtil.devolveDrawable(this, pacote.getImagem());
        local.setImageDrawable(drawable);
    }
}
