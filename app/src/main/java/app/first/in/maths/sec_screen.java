package app.first.in.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sec_screen extends AppCompatActivity {
    Button yes,no,clue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_screen);

        yes=(Button)findViewById(R.id.btn_yes);
        no=(Button)findViewById(R.id.btn_n);
        clue = (Button)findViewById(R.id.btn_clue);


        clue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(sec_screen.this, clue.class);
                startActivity(n);
            }
        });


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sec_screen.this, "Great!", Toast.LENGTH_LONG).show();

            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nxt = new Intent(sec_screen.this, third_screen.class);
                startActivity(nxt);


            }
        });
    }
}
