package com.joshualiong.tantocuaredeckbuilder;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import tantocuarecardinfo.Card;

/**
 * Created by NintendoM1 on 10/23/2015.
 */
public class ShuffledListActivity extends Activity {
    ListView shuffledList;
    ArrayList<String> listOfMaidNames = new ArrayList<String>();
    ArrayAdapter<String> adapter;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_shuffledlist);

        //Get the list of maid names that was passed in.
        ArrayList<Card> desiredMaids = (ArrayList<Card>)getIntent().getSerializableExtra("Deck");

        //Make it compatible with the adapter
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                convertToStringList(desiredMaids));

        shuffledList = (ListView) findViewById(R.id.shuffledList);
        shuffledList.setAdapter(adapter);
    }

    private ArrayList<String> convertToStringList(ArrayList<Card> list)
    {
        ArrayList<String> listConvertedToString = new ArrayList<String>(list.size());
        for(Card card : list)
            listConvertedToString.add(card.toString());
        return listConvertedToString;
    }

}
