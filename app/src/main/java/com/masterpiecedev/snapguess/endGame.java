package com.masterpiecedev.snapguess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class endGame extends AppCompatActivity {
    celebrities celebrity = new celebrities();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        celebrity.resetNumsUsed();

        setContentView(R.layout.activity_end_game);
        Button back = (Button) this.<View>findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(endGame.this, MainActivity.class);
                startActivity(backButton);
            }
        });
    }
}
