package p1022touch.develop.startandroid.ru.p1023_doubletap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

// link - http://stackoverflow.com/questions/13530937/how-to-listen-to-doubletap-on-a-view-in-android
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    GestureDetector gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        gd = new GestureDetector(this, new MyGestureDetector());


        //here yourView is the View on which you want to set the double tap action
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gd.onTouchEvent(event);
                return true;
            }
        });
    }



    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.BLUE);
        Log.d("MyGestureDetector", "onClick");
    }
}
