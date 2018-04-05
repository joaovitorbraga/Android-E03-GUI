package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<Place> lugares;
    private Context context;

    public MyAdapter (Context context) {
        this.context = context;
        lugares = new ArrayList<>();

        Place Konoha = new Place("Konoha", R.drawable.konoha, 42.0, 5.0, "Vila Oculta da Folha, encontra se no País do Fogo. Cidade dos maiores ninjas de todos os tempos");
        lugares.add(Konoha);
        Place Magnolia = new Place("Magnolia", R.drawable.magnolia, 156.5, 4.0, "Cidade da Guilda Fairy Tail, onde podemos presenciar varios magos lutando");
        lugares.add(Magnolia);
        Place Resembool = new Place("Resembool", R.drawable.resembool, 500.0, 3.5, "Cidade do interior onde Edward Elric e seu irmão Alphonse, tentaram ressucitar sua mãe");
        lugares.add(Resembool);
        Place SoulSociety = new Place("SoulSociety", R.drawable.soulsociety, 0.1, 5.0, "Local de descanço das boas almas abençoadas pelos Shinigamis");
        lugares.add(SoulSociety);
    }



    @Override
    public int getCount() {
        return this.lugares.size();
    }

    @Override
    public Object getItem(int i) {
        return this.lugares.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place lugares = this.lugares.get(i);

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        ImageView lblImagem = newView.findViewById(R.id.img_place_photo);
        TextView lblName = newView.findViewById(R.id.txt_place_name);
        TextView lblDistance = newView.findViewById(R.id.txt_place_distance);
        RatingBar lblRate = newView.findViewById(R.id.rating);
        TextView lblDescription = newView.findViewById(R.id.txt_place_description);

        lblImagem.setImageResource(lugares.getPhotoId());
        lblName.setText(lugares.getName());
        lblDistance.setText(lugares.getDistance().toString());
        lblRate.setRating(lugares.getRate().floatValue());
        lblDescription.setText(lugares.getDescription());



        return newView;
    }
}