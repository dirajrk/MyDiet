package rk.diraj.mydiet;

//MyDiet app by Diraj Ravikumar (13255244)

import android.support.v7.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //text box
        final TextView quoteLabel = (TextView) findViewById(R.id.quoteLabel);

        //code behind how to randomise quotes
        final String[] quotes = {"This is a salad!", "Eat healthy!", "Exercise all day!", "Be persistent"};
        int rando = (int) ((Math.random() * 10) + 1);
        int random = (int) (Math.random() * 4);
        quoteLabel.setText(quotes[random]);

        //code behind how to randomise image
        int[] photos = {R.drawable.healthy_food_0, R.drawable.healthy_food_1,R.drawable.healthy_food_2};
        ImageView image = (ImageView) findViewById(R.id.imageview1);
        Random ran=new Random();
        int i=ran.nextInt(photos.length);
        image.setImageResource(photos[i]);

    }
}
