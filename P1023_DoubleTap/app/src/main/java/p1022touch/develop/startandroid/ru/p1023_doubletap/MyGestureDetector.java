package p1022touch.develop.startandroid.ru.p1023_doubletap;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Vasiliy on 31.01.2017.
 */

public class MyGestureDetector extends GestureDetector.SimpleOnGestureListener {


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d("MyGestureDetector", "onSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.d("MyGestureDetector", "onDoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        //Log.d("MyGestureDetector", "onDoubleTapEvent");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        //Log.d("MyGestureDetector", "onScroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d("MyGestureDetector", "onLongPress");
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.d("MyGestureDetector", "onDown");
        return false;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d("MyGestureDetector", "onFling");
        return false;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.d("MyGestureDetector", "onSingleTapUp");
        return false;
    }
}
