package cc.felight.com.codecracker2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nripen on 8/4/2015.
 */
public class GreetUserActivity extends Activity {
    private EditText first;
    private EditText last;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetuser_layout);
        first =(EditText)findViewById(R.id.etFirstName);
        last = (EditText)findViewById(R.id.etlastname);
        tvResult = (TextView)findViewById(R.id.tvResult);
    }
    public void greetuser(View view){
        //System.out.println("Greet user method called");

        tvResult.setText("Namasthe" + first.getText() + "" + last.getText());
    }
}