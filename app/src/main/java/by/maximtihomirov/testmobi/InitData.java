package by.maximtihomirov.testmobi;

import android.content.Context;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Максим on 06.07.2018.
 */

public class InitData {

    private String typeAnumal;
    private List<MyModel> myModel = new ArrayList<>();
    private Context context;


    InitData(String typeAnumal, Context context) {
        this.typeAnumal = typeAnumal;
        this.context = context;
    }

    public List<MyModel> getData() {

        if (context.getResources().getString(R.string.mammals).equals(typeAnumal)) {

            myModel.add(new MyModel("Обезьяна"));
            myModel.add(new MyModel("Кит"));
            myModel.add(new MyModel("Корова"));
            myModel.add(new MyModel("Лошадь"));
            myModel.add(new MyModel("Собака"));

        } else if (context.getResources().getString(R.string.reptiles).equals(typeAnumal)){
            myModel.add(new MyModel("Крокодил"));
            myModel.add(new MyModel("Кобра"));
            myModel.add(new MyModel("Варан"));
            myModel.add(new MyModel("Аллигатор"));
            myModel.add(new MyModel("Анаконда"));

        }else if (context.getResources().getString(R.string.fish).equals(typeAnumal)) {
            myModel.add(new MyModel("Карась"));
            myModel.add(new MyModel("Лещь"));
            myModel.add(new MyModel("Сом"));
            myModel.add(new MyModel("Язь"));
            myModel.add(new MyModel("Форель"));

        } else if (context.getResources().getString(R.string.freshwater).equals(typeAnumal)){
            myModel.add(new MyModel("Чесночница"));
            myModel.add(new MyModel("Листолаз"));
            myModel.add(new MyModel("Аксолотль"));
            myModel.add(new MyModel("Амбистома"));
            myModel.add(new MyModel("Саламандра"));

        }else if (context.getResources().getString(R.string.birds).equals(typeAnumal)) {
            myModel.add(new MyModel("Орел"));
            myModel.add(new MyModel("Индюк"));
            myModel.add(new MyModel("Воробей"));
            myModel.add(new MyModel("Аист"));
            myModel.add(new MyModel("Цапля"));

        } else if (context.getResources().getString(R.string.insecticides).equals(typeAnumal)){
            myModel.add(new MyModel("Муха"));
            myModel.add(new MyModel("Стрекоза"));
            myModel.add(new MyModel("Комар"));
            myModel.add(new MyModel("Бабочка"));
            myModel.add(new MyModel("Муравей"));
        }


            return myModel;
    }
}
