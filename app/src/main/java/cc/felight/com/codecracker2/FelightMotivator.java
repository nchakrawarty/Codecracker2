package cc.felight.com.codecracker2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nripen on 8/5/2015.
 */
public class FelightMotivator extends Activity{
    ArrayList<String> textList;
    TextView tvText;
    int count=0;
    public void text(View view){

        switch (view.getId()){

            case R.id.btnLeft:tvText.setText(textList.get(count--));
            break;

            case R.id.btnRight: Intent intentGreet = new Intent(this,GreetUserActivity.class);
                startActivity(intentGreet);
                break;
        }
    }
    public void fillthetext(){
        textList.add("Hello world was the first android project");
        textList.add("simple calculator is second android project");
        textList.add("Greet user was third android project");
        textList.add("this is the fourth  android project");
        textList.add("Page number 6");
        textList.add("7");
        textList.add("8");
        textList.add("9");
        textList.add("The end");
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.felightmotivator_layout);
        tvText=(TextView)findViewById(R.id.tvText);
        textList=new ArrayList<String>();
        fillthetext();


    }
}


