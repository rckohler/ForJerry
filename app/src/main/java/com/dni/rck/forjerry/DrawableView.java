package com.dni.rck.forjerry;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by rck on 12/10/2015.
 */
public class DrawableView extends View {
    DrawableObject d;
    public DrawableView(Context context){
        super(context);
        d = new DrawableObject(MainActivity.b,100f,100f,100f,100f);
    }
    protected void onDraw(Canvas canvas) {
            d.update(canvas);
        try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.err.println("Draw error");
            }
    }
}
