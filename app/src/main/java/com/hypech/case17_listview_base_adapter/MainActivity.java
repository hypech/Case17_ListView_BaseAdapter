package com.hypech.case17_listview_base_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataModel> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList = findViewById(R.id.mylist);

        feedData();

        Adapter mAdapter = new Adapter((LinkedList<DataModel>) mData, this);
        myList.setAdapter(mAdapter);
    }

    private void feedData() {
        mData = new LinkedList<DataModel>();
        mData.add(new DataModel("Megan Fox", "In 2007, she had her breakout role alongside Shia LaBeouf in ‘Transformers’.", R.mipmap.megan));
        mData.add(new DataModel("Scarlett Johansson", "Scarlett Johansson is an American actress and singer. Johansson is one of the world’s highest-paid actress. She has made multiple appearances in the Forbes Celebrity 100, and she has a star on the Hollywood Walk of Fame", R.mipmap.scarlett));
        mData.add(new DataModel("Jessica Alba", "Her rose to prominence came when she was 19 years old when he was the lead actress of the series ‘Dark Angel’. ", R.mipmap.jessica));
        mData.add(new DataModel("Charlize Theron", "She is best known for her performance in the films ‘Mighty Joe Young’, and ‘The Cider House Rules’.", R.mipmap.charlie));
        mData.add(new DataModel("Kate Upton", "Upton has also appeared in the films ‘Tower Heist’, ‘The Other Woman’ and ‘The Layover’. ", R.mipmap.kate));
        mData.add(new DataModel("Natalie Portman", "She gained international recognition for starring in ‘Star Wars: Episode I – The Phantom Menace’.", R.mipmap.natalie));
        mData.add(new DataModel("Mila Kunis", "She appears 7th on this compilation of the hottest women in 2019.", R.mipmap.mila));
        mData.add(new DataModel("Adriana Lima", "Adriana Lima is a Brazilian model and actress, best known for being a ‘Victoria’s Secret Angel’.", R.mipmap.adrinana));
    }
}