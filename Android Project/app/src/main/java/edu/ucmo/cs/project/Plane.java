package edu.ucmo.cs.project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;


public class Plane {

    Bitmap plane[]=new Bitmap[8];
    int planex, planey, velocity, planeFrame;
    Random random;

    public Plane(Context context) {

        plane[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.plane1);
        plane[1]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2);
        plane[2]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane3);
        plane[3]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane4);
        plane[4]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane5);
        plane[5]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane6);
        plane[6]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane7);
        plane[7]=BitmapFactory.decodeResource(context.getResources(),R.drawable.plane8);
        random=new Random();
        resetposition();


    }

    public Bitmap getBitmap(){
        return plane[planeFrame];
    }
    public int getWidth(){
        return plane[0].getWidth();
    }
    public int getHeight(){
        return plane[0].getHeight();
    }
    public void resetposition(){
        planex=GameView.dWidth+random.nextInt(1200);
        planey=random.nextInt(300);
        velocity= 8+random.nextInt(13);
        planeFrame=0;

    }
}
