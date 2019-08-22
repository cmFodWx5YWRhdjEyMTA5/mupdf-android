package com.github.react.sextant.learning;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * 新建一个继承View类的自定义组件，在构造方法中初始化view的初始坐标
 * **/

public class FrameView extends View {

    public float bitmapX;
    public float bitmapY;

    public FrameView(Context context){
        //constructor 初始坐标
        super(context);
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.my_future_girlfriend);

        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);

        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
