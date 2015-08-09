package cc.felight.com.codecracker2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nripen on 8/5/2015.
 */
public class SimpleCalculatorActivity extends Activity {
    public void calculate(View view){
        EditText etFirstNum=(EditText)findViewById(R.id.etFirstNumber);
        double num1=Double.parseDouble(etFirstNum.getText().toString());
        EditText etSecondNum=(EditText)findViewById(R.id.etSecondNumber);
        double num2=Double.parseDouble(etSecondNum.getText().toString());
        TextView tvResult=(TextView)findViewById(R.id.tvResult);
        switch (view.getId()){
            case R.id.btnAdd : tvResult.setText(" I "+ (num1+num2)+ "U");
                                break;
            case R.id.btnSub : tvResult.setText("  "+ (num1-num2));
                                break;
            case R.id.btnMul : tvResult.setText("  "+ (num1*num2));
                                break;
            case R.id.btnDiv : tvResult.setText("  "+ (num1/num2));
                                break;
            case R.id.btnMod : tvResult.setText("  "+ (num1%num2));
                                break;
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecalculatoractivity_layout);
    }
}
