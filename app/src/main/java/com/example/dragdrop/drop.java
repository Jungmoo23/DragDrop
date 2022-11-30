package com.example.dragdrop;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class drop extends View {

    ImageView imageView;
    float x,y,dx,dy;

    public drop(Context context) {
        super(context);
        imageView = findViewById(R.id.imagevieww);
        imageView.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        x = motionEvent.getX();
                        y = motionEvent.getY();
                        return true;
                        case MotionEvent.ACTION_MOVE:
                            dx = motionEvent.getX() - x;
                            dy = motionEvent.getY() - y;

                            imageView.setX(imageView.getX()-x);
                            imageView.setY(imageView.getY()-y);

                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            return true;

                }

                return false;
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
