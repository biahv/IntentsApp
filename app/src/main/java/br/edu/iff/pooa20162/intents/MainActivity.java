package br.edu.iff.pooa20162.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText url = (EditText) findViewById(R.id.etURL);
        Button ok = (Button) findViewById(R.id.btUrl);

        ok.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view){
                Uri uri = Uri.parse(url.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        final EditText etNome = (EditText) findViewById(R.id.etNome);

        Button btOutra = (Button) findViewById(R.id.btSegunda);
        btOutra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SegundaActivity.class);
                intent.putExtra("nome",etNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
