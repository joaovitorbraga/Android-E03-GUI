package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frame = findViewById(R.id.button);
        Button noticia = findViewById(R.id.button2);
        Button previsao = findViewById(R.id.button3);
        Button formulario = findViewById(R.id.button4);

        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_frame = new Intent(MainActivity.this, load.class);
                startActivity(intent_frame);
            }

        });
        noticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_noticia = new Intent(MainActivity.this, noticia.class);
                startActivity(intent_noticia);
            }

        });
        previsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_previsao = new Intent(MainActivity.this, previsao_tempo.class);
                startActivity(intent_previsao);
            }

        });
        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_formulario = new Intent(MainActivity.this, formulario.class);
                startActivity(intent_formulario);
            }

        });
    }
}
