package com.anwesome.ui.completeballbuttons;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.anwesome.ui.dimensionsutil.DimensionsUtil;

/**
 * Created by anweshmishra on 07/02/17.
 */
public class CompleteBallButton {
    private Activity activity;
    int w,h;
    public CompleteBallButton(Activity activity) {
        this.activity = activity;
        Point size = DimensionsUtil.getDeviceDimension(activity);
        if(size!=null) {
            w = size.x;
            h = size.y;
            Log.d("size",w+","+h);
        }
    }
    public void show() {
        
    }
    private class CompleteBallView extends View {
        private boolean isAnimated = false;
        public CompleteBallView(Context context) {
            super(context);
        }
        public void onDraw(Canvas canvas) {
            if(isAnimated) {
                try {
                    Thread.sleep(50);
                    invalidate();
                } catch (Exception ex) {

                }
            }
        }
        public boolean onTouchEvent(MotionEvent event) {
            if(event.getAction() == MotionEvent.ACTION_DOWN && !isAnimated) {

                isAnimated = true;
            }
            return true;
        }
    }
}
