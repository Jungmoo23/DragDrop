package com.example.dragdrop;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imagevieww);

//        imageView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//
//                switch (motionEvent.getAction()){
//                    case MotionEvent.ACTION_DOWN:
//                        x=motionEvent.getX();
//                        y=motionEvent.getY();
//                        Log.d("test","Actiondown");
//                        return true;
//                    case MotionEvent.ACTION_MOVE:
//                        imageView.invalidate();
//                        dx = motionEvent.getX()-x;
//                        dy = motionEvent.getY()-y;
//
//                        imageView.setX(imageView.getX()+dx);
//                        imageView.setY(imageView.getY()+dy);
//                        imageView.invalidate();
//                        x = motionEvent.getX();
//                        y =motionEvent.getY();
//                        Log.d("test","ActionMove");
//
//                        return true;
//                        case MotionEvent.ACTION_UP:
//                            imageView.invalidate();
//                            return true;
//                }
//                return false;
//            }
//        });

    }

    float x,y;
    float dx,dy;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_DOWN){
            x=event.getX();
            y=event.getY();
        }

        if(event.getAction() == MotionEvent.ACTION_MOVE){
            dx = event.getX()-x;
            dy = event.getY()-y;

            imageView.setX(imageView.getX()+dx);
            imageView.setY(imageView.getY()+dy);

            x= event.getX();
            y=event.getY();
        }

        return super.onTouchEvent(event);
    }

}