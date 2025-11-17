package ma.ens.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import ma.ens.lab4.adapter.Adapter;
import ma.ens.lab4.entities.Pizza;
import ma.ens.lab4.service.PizzaService;

public class ListPizzaActivity extends AppCompatActivity {

    ListView liste = null;
    PizzaService ps = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        ps = new PizzaService();
        // Pizza 1
        ps.create(new Pizza(
                "Margherita",
                5,
                R.mipmap.pizza1,
                15.5,
                "Tomate, Mozzarella, Basilic, Huile d'olive, Origan",
                "La pizza classique italienne avec des ingrédients frais",
                "Étaler la pâte, ajouter la sauce tomate, la mozzarella et cuire au four 15 min"
        ));

        // Pizza 2
        ps.create(new Pizza(
                "Pepperoni",
                6,
                R.mipmap.pizza2,
                18.0,
                "Tomate, Mozzarella, Pepperoni, Poivrons, Oignons, Champignons",
                "Pizza américaine avec du pepperoni épicé",
                "Étaler la pâte, sauce tomate, fromage, pepperoni et cuire 18 min"
        ));

        // Pizza 3
        ps.create(new Pizza(
                "4 Fromages",
                4,
                R.mipmap.pizza3,
                20.0,
                "Mozzarella, Gorgonzola, Parmesan, Chèvre",
                "Pizza crémeuse avec un mélange de 4 fromages italiens",
                "Étaler la pâte, répartir les 4 fromages et cuire 20 min"
        ));

        // Pizza 4
        ps.create(new Pizza(
                "Végétarienne",
                7,
                R.mipmap.pizza4,
                16.5,
                "Tomate, Mozzarella, Poivrons, Champignons, Olives, Oignons, Maïs",
                "Pizza saine et colorée pour les amateurs de légumes",
                "Étaler la pâte, ajouter tous les légumes et cuire 16 min"
        ));

        // Pizza 5
        ps.create(new Pizza(
                "Hawaïenne",
                5,
                R.mipmap.pizza5,
                17.0,
                "Tomate, Mozzarella, Jambon, Ananas, Fromage",
                "Pizza sucrée-salée avec de l'ananas frais",
                "Étaler la pâte, sauce tomate, jambon, ananas et cuire 17 min"
        ));

        // Pizza 6
        ps.create(new Pizza(
                "Calzone",
                6,
                R.mipmap.pizza6,
                22.0,
                "Tomate, Mozzarella, Jambon, Champignons, Œuf",
                "Pizza pliée en demi-cercle, cuite au four",
                "Étaler la pâte, garnir, plier en deux et cuire 22 min"
        ));

        // Pizza 7
        ps.create(new Pizza(
                "Napolitaine",
                5,
                R.mipmap.pizza7,
                14.0,
                "Tomate, Mozzarella, Anchois, Câpres, Olives",
                "Pizza traditionnelle de Naples",
                "Étaler la pâte fine, garnir et cuire à haute température 14 min"
        ));

        // Pizza 8
        ps.create(new Pizza(
                "Mexicaine",
                7,
                R.mipmap.pizza8,
                19.0,
                "Tomate, Mozzarella, Viande hachée, Piments, Oignons, Poivrons, Maïs",
                "Pizza épicée aux saveurs mexicaines",
                "Étaler la pâte, sauce tomate épicée, garniture et cuire 19 min"
        ));

        // Pizza 9
        ps.create(new Pizza(
                "Fruits de Mer",
                8,
                R.mipmap.pizza9,
                21.0,
                "Tomate, Mozzarella, Crevettes, Moules, Calamars, Ail, Persil",
                "Pizza raffinée aux fruits de mer frais",
                "Étaler la pâte, sauce tomate, fruits de mer et cuire 21 min"
        ));

        // Pizza 10
        ps.create(new Pizza(
                "Royale",
                8,
                R.mipmap.pizza10,
                18.5,
                "Tomate, Mozzarella, Jambon, Champignons, Bacon, Œuf, Fromage",
                "Pizza complète avec une garniture généreuse",
                "Étaler la pâte, toutes les garnitures et cuire 18 min"
        ));
        liste = findViewById(R.id.liste);
        Adapter adapter = new Adapter(this, ps.findAll());
        liste.setAdapter(adapter);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                List<Pizza> pizzas = ps.findAll();
                Pizza selectedPizza = pizzas.get(position);
                Intent i = new Intent(ListPizzaActivity.this, DetailsPizza.class);
                i.putExtra("image", selectedPizza.getPhoto());
                i.putExtra("nom", selectedPizza.getNom());
                i.putExtra("description", selectedPizza.getDescription());
                i.putExtra("ingredients", selectedPizza.getDetailsIngredient());
                i.putExtra("preparation", selectedPizza.getPreparation());

                startActivity(i);
            }
        });
    }
}