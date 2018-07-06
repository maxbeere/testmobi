package by.maximtihomirov.testmobi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<MyModel> myModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView typeName = findViewById(R.id.typeName);
        Intent intent = getIntent();
        String typeAnimal = intent.getStringExtra("TYPE");
        typeName.setText(typeAnimal);

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        InitData initData = new InitData(typeAnimal, this);
        myModel = initData.getData();
        initAdapter();

    }



    private void initAdapter() {
        Adapter adapter = new Adapter(myModel);
        recyclerView.setAdapter(adapter);

    }
}
