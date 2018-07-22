package by.maximtihomirov.testmobi;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Toolbar toolbar = findViewById(R.id.toolbar);
        ImageView imageView = findViewById(R.id.imageView);
        TextView about =  findViewById(R.id.about);


        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);

        Intent intent = getIntent();
        String nameAnimal = intent.getStringExtra("NAME_ANIMAL");
        collapsingToolbarLayout.setTitle(nameAnimal);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        } );

        Animal animal = new Animal(nameAnimal,this);



        imageView.setImageResource(animal.getImg());
        String a = animal.getAbout()+animal.getAbout()+ animal.getAbout()+animal.getAbout();
        about.setText(a);

    }
}
