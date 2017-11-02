package toong.vn.androidbroadcastreceiver;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by PhanVanLinh on 03/11/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class MyApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyApp", "onCreate");
        Toast.makeText(this, "onCreate.", Toast.LENGTH_LONG).show();
    }
}
