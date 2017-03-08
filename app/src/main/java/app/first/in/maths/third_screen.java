package app.first.in.maths;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class third_screen extends AppCompatActivity {
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        home= (Button)findViewById(R.id.home);


        Intent next= new Intent(third_screen.this, MainActivity.class);
        startActivity(next);
    }
}
