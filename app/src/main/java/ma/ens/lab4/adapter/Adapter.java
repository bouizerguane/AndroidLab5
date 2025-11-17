package ma.ens.lab4.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.ens.lab4.R;
import ma.ens.lab4.entities.Pizza;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;

    private List<Pizza> pizzas;

    public Adapter(Activity activity, List<Pizza> pizzas){
        this.activity = activity;
        this.pizzas=pizzas;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pizzas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.activity_pizza,null);

        TextView id = convertView.findViewById(R.id.id);
        TextView nom =convertView.findViewById(R.id.nom);
        TextView nbIngredient =convertView.findViewById(R.id.nbingr);
        TextView duree =convertView.findViewById(R.id.duree);
        ImageView image = convertView.findViewById(R.id.image);

        id.setText(String.valueOf(pizzas.get(position).getId()));
        nom.setText(pizzas.get(position).getNom());
        nbIngredient.setText(String.valueOf(pizzas.get(position).getNbrIngredients())+" ingrédients");
        duree.setText(pizzas.get(position).getDuree()+" min");
        image.setImageResource(pizzas.get(position).getPhoto());


        return convertView;
    }
}
