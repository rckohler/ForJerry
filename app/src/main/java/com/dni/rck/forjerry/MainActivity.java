package com.dni.rck.forjerry;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    static Bitmap b;
    static DrawableView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadBitmaps();
        v = new DrawableView(this);
        setContentView(v);
    }

    private void loadBitmaps(){
        b = BitmapFactory.decodeResource(getResources(),R.drawable.horse);
    }
}
