package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lugaresListView = findViewById(R.id.lugares_list);
        lugaresListView.setAdapter(new MyAdapter(this));
    }
}
