package by.maximtihomirov.testmobi;

import android.content.Context;

/**
 * Created by Максим on 06.07.2018.
 */

public class Animal {

    private String nameAnimal;
    private int img;
    private String about="";
    private Context context;

    Animal(String nameAnimal, Context context) {
        this.nameAnimal = nameAnimal;
        this.context = context;
        img = R.drawable.druzhok;
        about = context.getResources().getString(R.string.aboutDefault);
        findAnimal();
    }

    public int getImg() {
        return img;
    }


    public String getAbout() {
        return about;
    }

    private void findAnimal() {
        switch (nameAnimal) {
            case "Обезьяна":
                img = R.drawable.obezyana;
                about = "Обезья́ны — четверорукие млекопитающие, наиболее близкие к человеку по строению тела и происхождению, " +
                        "в широком смысле — все представители отряда приматов. " +
                        "Слово «обезьяна» появилось в древнерусском языке как заимствование из перс";
                break;

            case "Кит":

                break;
            case "Корова":

                break;
            case "Лошадь":

                break;
            case "Собака":

                break;

            case "Крокодил":

                break;
            case "Кобра":

                break;
            case "Варан":

                break;
            case "Аллигатор":

                break;
            case "Анаконда":

                break;

          /*      "Карась"
                "Лещь"
                "Сом"
                "Язь"
                "Форель"

                "Чесночница"
                "Листолаз"
                "Аксолотль"
                "Амбистома"
                "Саламандр"

                "Орел"
                "Индюк"
                "Воробей"
                "Аист"
                "Цапля"

                "Муха"
                "Стрекоза"
                "Комар"
                "Бабочка"
                "Муравей"*/
        }
    }
}
