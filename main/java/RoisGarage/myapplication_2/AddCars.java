package RoisGarage.myapplication_2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



 public class AddCars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText year = findViewById(R.id.year);
                EditText model = findViewById(R.id.model);
                EditText brand = findViewById(R.id.brand);
                EditText price = findViewById(R.id.price);
                Car Car = null; new Car(R.drawable.car1,brand.getText().toString(),model.getText().toString(),year.getText().toString(),price.getText().toString());
                Intent i = null; new Intent();
                i.putExtra("car",Car);
                setResult(1,i);
                finish();



            }
        });

    }
}
