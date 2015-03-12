package local.jhansche.robotium179;

import android.app.Activity;
import android.content.Intent;

public class LaunchActivity extends Activity {
    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}