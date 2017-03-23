package rk.diraj.mydiet;

//MyDiet app by Diraj Ravikumar (13255244)

import android.support.v7.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //text box
        final TextView quoteLabel = (TextView) findViewById(R.id.quoteLabel);
        //button
        Button pressme = (Button) findViewById(R.id.pressme);

        //code behind how to randomise quotes
        final String[] quotes = {"This is a salad!", "Eat healthy!", "Exercise all day!", "Be persistent"};
        int rando = (int) ((Math.random() * 10) + 1);

        //code behind how to randomise image
        int[] photos = {R.drawable.healthy_food_0, R.drawable.healthy_food_1,R.drawable.healthy_food_2};
        ImageView image = (ImageView) findViewById(R.id.imageview1);
        Random ran=new Random();
        int i=ran.nextInt(photos.length);
        image.setImageResource(photos[i]);

        //button function
        pressme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //randomises quotes
                int rando = (int) (Math.random() * 4);
                quoteLabel.setText(quotes[rando]);
                Random ran=new Random();

                //randomises pics
                int[] photos = {R.drawable.healthy_food_0, R.drawable.healthy_food_1,R.drawable.healthy_food_2};
                ImageView image = (ImageView) findViewById(R.id.imageview1);
                int k = ran.nextInt(photos.length);
                image.setImageResource(photos[k]);
            }
        });

    }
}
