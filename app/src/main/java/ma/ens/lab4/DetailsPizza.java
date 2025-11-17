package ma.ens.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        Intent intent = getIntent();
        int imageRes = intent.getIntExtra("image", 0);
        String nom = intent.getStringExtra("nom");
        String description = intent.getStringExtra("description");
        String ingredients = intent.getStringExtra("ingredients");
        String preparation = intent.getStringExtra("preparation");

        ImageView imageView = findViewById(R.id.details_image);
        TextView tvNom = findViewById(R.id.details_nom);
        TextView tvDescription = findViewById(R.id.details_description);
        TextView tvIngredients = findViewById(R.id.details_ingredients);
        TextView tvPreparation = findViewById(R.id.details_preparation);

        imageView.setImageResource(imageRes);
        tvNom.setText(nom);
        tvDescription.setText(description);
        tvIngredients.setText(ingredients);
        tvPreparation.setText(preparation);
    }
}