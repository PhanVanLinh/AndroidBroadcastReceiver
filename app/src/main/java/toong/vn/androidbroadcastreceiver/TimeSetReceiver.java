package toong.vn.androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class TimeSetReceiver extends BroadcastReceiver {

   @Override
   public void onReceive(Context context, Intent intent) {
       Log.i("TimeSetReceiver", "sss: "+context.getApplicationContext());
       Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
   }
}