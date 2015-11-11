package com.joshualiong.tantocuaredeckbuilder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;

import junit.framework.Assert;

import java.util.ArrayList;

import adapter.CardArrayAdapter;
import tantocuarecardinfo.Card;
import tantocuarecardinfo.TantoCuoreOriginalDeck;

/**
 * Created by NintendoM1 on 11/10/2015.
 */
public class FilterListActivity extends Activity {

    ListView lv;
    ArrayList<Card> cardList;
    CardArrayAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.single_listview_item);

        lv = (ListView) findViewById(R.id.listview);
        displayCardList();
    }

    private void displayCardList() {
        cardList = TantoCuoreOriginalDeck.GetCopyOfAllCards();
        cardAdapter = new CardArrayAdapter(cardList, this);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(cardAdapter);
    }
}
