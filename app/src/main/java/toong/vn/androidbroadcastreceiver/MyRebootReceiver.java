package toong.vn.androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyRebootReceiver extends BroadcastReceiver {

   @Override
   public void onReceive(Context context, Intent intent) {
       Log.i("MyRebootReceiver", "MyRebootReceiver detect "+context.getApplicationContext());
       Toast.makeText(context, "MyRebootReceiver Detected.", Toast.LENGTH_LONG).show();
       context.startActivity(new Intent(context, MainActivity.class));
   }
}