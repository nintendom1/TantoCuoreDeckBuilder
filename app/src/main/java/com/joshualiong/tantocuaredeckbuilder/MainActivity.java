package com.joshualiong.tantocuaredeckbuilder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import tantocuarecardinfo.Card;
import tantocuarecardinfo.TantoCuoreOriginalDeck;

public class MainActivity extends AppCompatActivity {

    TantoCuoreOriginalDeck tantoCuoreOriginalDeck;
    final int NUMBER_OF_MAIDS = 10;

    //UI Elements
    Button shuffleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hook activities here
        final Context context = this;
        shuffleButton = (Button) findViewById(R.id.shuffleButton);
        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ShuffledListActivity.class);
                intent.putExtra("Deck", ShuffleCards());
                startActivity(intent);
            }
        });
    }

    public ArrayList<Card> ShuffleCards() {
        if (tantoCuoreOriginalDeck == null)
            tantoCuoreOriginalDeck = new TantoCuoreOriginalDeck();
        else //reset the cards
            tantoCuoreOriginalDeck.ResetDeck();

        //Draw ten random cards as the shuffled output.
        ArrayList<Card> listOfMaid = new ArrayList<Card>(NUMBER_OF_MAIDS);
        for(int i = 0; i < NUMBER_OF_MAIDS && tantoCuoreOriginalDeck.HasCardsToDraw(); i++)
        {
            listOfMaid.add((Card)tantoCuoreOriginalDeck.DrawRandomCard());
        }

        return listOfMaid;
    }
}
