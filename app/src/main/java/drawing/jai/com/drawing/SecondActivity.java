package drawing.jai.com.drawing;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by pandj009 on 1/12/18.
 */

public class SecondActivity extends Activity {

    MyCustomDrawingView myCustomDrawingView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myCustomDrawingView = new MyCustomDrawingView(this);
        setContentView(myCustomDrawingView);
    }
}
