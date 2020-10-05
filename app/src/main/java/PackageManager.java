import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PackageManager extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_PACKAGE_ADDED))
        {
            Toast.makeText(context, "Application added", Toast.LENGTH_SHORT).show();
        }
        else if (intent.getAction().equals(Intent.ACTION_PACKAGE_REMOVED))
        {
            Toast.makeText(context, "Application Removed", Toast.LENGTH_SHORT).show();
        }
    }
}
