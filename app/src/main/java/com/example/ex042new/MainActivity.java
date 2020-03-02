package com.example.ex042new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imv;
    ImageButton imb;
    int pv1;
    int pv2;
    int pv3;
    int pb1;
    int pb2;
    int pb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imv=((ImageView)findViewById(R.id.imv));
        imb=((ImageButton)findViewById(R.id.imb));
        pv1=R.drawable.wordnew1;
        pv2=R.drawable.word2;
        pv3=R.drawable.word3;
        pb1=R.drawable.number1;
        pb2=R.drawable.number2;
        pb3=R.drawable.number3new;
    }

    public void click(View view) {
        int r=(int) (Math.random()* ((3-1)+1)+1); //((max - min) + 1) + min;
        if (r==1){
            imb.setImageResource(pb1);
            imv.setImageResource(pv1);
        }
        else if (r==2){
            imb.setImageResource(pb2);
            imv.setImageResource(pv2);
        }
        else{
            imb.setImageResource(pb3);
            imv.setImageResource(pv3);
        }
    }
}
