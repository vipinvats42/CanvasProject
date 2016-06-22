package com.example.tapesh.canvasproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));

    }

   public class  MyView extends View
   {
       Paint paint;
      public MyView(Context context)
       {
          super(context);
         paint=new Paint();

       }


     @Override
       public void onDraw(Canvas canvas)
     {
        super.onDraw(canvas);
         int x=getWidth();
         int y=getHeight();
         int radius=100;
         Paint paint=new Paint();
         paint.setStyle(Paint.Style.FILL);
         paint.setColor(Color.WHITE);
         canvas.drawPaint(paint);
         // Use Color.parseColor to define HTML colors
         paint.setColor(Color.parseColor("#CD5C5C"));
         canvas.drawCircle(x / 2, y / 2, radius, paint);

     }

   }
}
