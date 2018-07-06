package by.maximtihomirov.testmobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Intent intent = getIntent();
        String nameAnimal = intent.getStringExtra("NAME_ANIMAL");

        Animal animal = new Animal(nameAnimal,this);

        ImageView imageView = findViewById(R.id.imageView);
        TextView about =  findViewById(R.id.about);

        imageView.setImageResource(animal.getImg());
        about.setText(animal.getAbout());
    }
}
