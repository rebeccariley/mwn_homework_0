package rebeccariley.mwnhomework0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Logging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
        Log.i("onCreate", "function entered");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logging, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * @brief Adds logging capabilities to onStart()
     */
    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart", "function entered");
    }

    /**
     * @brief Adds logging capabilities to onResume()
     */
    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", "function entered");
    }

    /**
     * @brief Adds logging capabilities to onPause()
     */
    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", "function entered");
    }

    /**
     * @brief Adds logging capabilities to onRestart()
     */
    @Override
    public void onRestart() {
        super.onRestart();
        Log.i("onRestart", "function entered");
    }

    /**
     * @brief Adds logging capabilities to onStop()
     */
    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop", "function entered");
    }

    /**
     * @brief Adds logging capabilities to onDestroy()
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "function entered");
    }
}
