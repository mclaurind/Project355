package com.app.luver;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.daprlabs.cardstack.SwipeDeck;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // on below line we are creating variable
    // for our array list and swipe deck.
    private SwipeDeck cardStack;
    private ArrayList<QuestionModal> questionModalArrayListModalArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our array list and swipe deck.
        questionModalArrayListModalArrayList = new ArrayList<>();
        cardStack = (SwipeDeck) findViewById(R.id.swipe_deck);

        // on below line we are adding data to our array list.
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 1","Are you looking for a long-term romantic relationship?", R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 2","Are you looking for friends?",  R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 3","Do you want kids one day?",  R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 4","Are you into monogamy?", R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 5","Does astrology matter when in relationships?", R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 6","Have you ever been in a relationship?", R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 7","Are you looking for hookups?",  R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 8","Have you ever cheated on someone?",  R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 9","Do you get jealous easily?", R.drawable.questioncover));
        questionModalArrayListModalArrayList.add(new QuestionModal("                      Question 10","Would you compromise your happiness for the success of a relationship?", R.drawable.questioncover));
        // on below line we are creating a variable for our adapter class and passing array list to it.
        final DeckAdapter adapter = new DeckAdapter(questionModalArrayListModalArrayList, this);

        // on below line we are setting adapter to our card stack.
        cardStack.setAdapter(adapter);

        // on below line we are setting event callback to our card stack.
        cardStack.setEventCallback(new SwipeDeck.SwipeEventCallback() {
            @Override
            public void cardSwipedLeft(int position) {
                // user answer is "no" so swipe left
                Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardSwipedRight(int position) {
                //  user answer is "yes" so swipe left
                Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardsDepleted() {
                // this method is called when user has completed the questionnaire
                Toast.makeText(MainActivity.this, "Evaluating answers...", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void cardActionDown() {
                // this method is called when card is swiped down.
                Log.i("TAG", "CARDS MOVED DOWN");
            }

            @Override
            public void cardActionUp() {
                // this method is called when card is moved up.
                Log.i("TAG", "CARDS MOVED UP");
            }
        });
    }
}
