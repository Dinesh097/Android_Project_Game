package edu.ucmo.cs.project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[]= new Bitmap[17];
    int explosionFrame=0;
    int explosionX,explosionY;

    public Explosion(Context context){
        explosion[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive1);
        explosion[1]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive2);
        explosion[2]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive3);
        explosion[3]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive4);
        explosion[4]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive5);
        explosion[5]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive6);
        explosion[6]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive7);
        explosion[7]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive8);
        explosion[8]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive9);
        explosion[9]= BitmapFactory.decodeResource(context.getResources(),R.drawable.explosive10);
    }

    public Bitmap getExplosion(int explosionFrame){
        return explosion[explosionFrame];

    }
    public int getExplosionWidth(){
        return explosion[0].getWidth();
    }
    public int getExplosionHeight(){
        return explosion[0].getHeight();
    }
}
