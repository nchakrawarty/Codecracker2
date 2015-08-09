package cc.felight.com.codecracker2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Nripen on 8/8/2015.
 */
public class MasterNavigatorActivity extends Activity {


    public void navigate(View view){

        switch (view.getId())
        {
            case R.id.btm1:
                Intent intentGreet = new Intent(this,GreetUserActivity.class);
                startActivity(intentGreet);
                break;

            case R.id.btm2:
                Intent intentCalc = new Intent(this,SimpleCalculatorActivity.class);
                startActivity(intentCalc);
                break;
            case R.id.btm3:
                Intent intentMotivate = new Intent(this,FelightMotivator.class);
                startActivity(intentMotivate);
                break;
            case R.id.btm5:
                Intent intentSpl = new Intent(this,AlgorithmBenchmark.class);
                startActivity(intentSpl);
                break;
            default:
                break;
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masternavigator_layout);

    }

}
