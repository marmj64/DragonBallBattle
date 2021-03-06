package com.example.john.dragonballbattle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FighterSelectionActivity extends AppCompatActivity {
    private Spinner charSpinner;
    private TextView moveList;
    private Fighter selectedFighter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighter_selection);
        charSpinner = (Spinner) findViewById(R.id.fighterSelectionCharSpinner);
        moveList = (TextView) findViewById(R.id.fighterSelectionMoveList);
        populateSpinner();
    }

    private Fighter[] loadFighters(){
        Fighter[] fighters = new Fighter[15];

        fighters[0] = new Goku();
        fighters[1] = new Gohan();
        fighters[2] = new Beerus();
        fighters[3] = new Cell();
        fighters[4] = new Frieza();
        fighters[5] = new Hit();
        fighters[6] = new KidBuu();
        fighters[7] = new Krillin();
        fighters[8] = new MasterRoshi();
        fighters[9] = new Monaka();
        fighters[10] = new Piccolo();
        fighters[11] = new Tien();
        fighters[12] = new Trunks();
        fighters[13] = new Vegeta();
        fighters[14] = new Yamcha();

        return fighters;
    }

    private String[] getFighterNames(){
        String[] names = new String[15];
        Fighter[] fighters = loadFighters();
        for(int i = 0; i < loadFighters().length; i++){
            names[i] = fighters[i].getName();
        }
        return names;
    }

    private void populateSpinner(){
        //Fighter selectedFigher = new Fighter();
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, getFighterNames());
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        charSpinner.setAdapter(adapter);
        charSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               // Fighter currentFighter = new Fighter();
                String text = charSpinner.getSelectedItem().toString();
               // currentFighter =
                Fighter[] array = loadFighters();
                selectedFighter = array[charSpinner.getSelectedItemPosition()];
                moveList.setText("Normal: " + selectedFighter.getNormal() + "\nStrong: " + selectedFighter.getStrong() + "\nDefense: " + selectedFighter.getDefense() + "\nSpecial: " + selectedFighter.getSpecial());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        populateMoves();
    }


    private void populateMoves(){

        String move1 ;
        String move2;
        String move3;
        String move4;
       // moveList.setText();
    }
}
