package com.dni.rck.forjerry;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by rck on 11/11/2015.
 */
public class DrawableObject {
    RectF bounds;
    float xPos, yPos, width, height;
    Bitmap bitmap;

    public DrawableObject(Bitmap bitmap, float xPos, float yPos, float width, float height){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        bounds = new RectF(xPos - .5f*width, yPos - .5f*height, xPos+.5f*width,yPos+.5f * height);
        this.bitmap = bitmap;

    }

    public void update(Canvas canvas){
        bounds.set(xPos - .5f*width, yPos - .5f*height, xPos+.5f*width,yPos+.5f * height);
        canvas.drawBitmap(bitmap,null,bounds,null);
    }
}
