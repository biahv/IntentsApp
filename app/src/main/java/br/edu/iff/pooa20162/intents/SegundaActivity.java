package br.edu.iff.pooa20162.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String nome = (String) intent.getSerializableExtra("nome");



        TextView texto = (TextView) findViewById(R.id.TxNome);
        texto.setText("Olá "+ nome+", seja bem-vindo");
    }
}
