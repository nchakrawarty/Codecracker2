package cc.felight.com.codecracker2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Nripen on 8/7/2015.
 */
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class AlgorithmBenchmark extends ActionBarActivity {

    private static int[] array;
    private EditText etArraySize;
    private TextView tvResult,tvBubbleSortResult,tvSelectionSortResult;
    private RadioGroup rgCase;
    public void doCalculation(View view){
        int size =0;
        try{
            size= Integer.parseInt(etArraySize.getText().toString());

        }catch (Exception ex){
            tvResult.setText("Please Enter a Number");
        }

        switch (view.getId()){
            case R.id.btnGenerateArray:

                switch (rgCase.getCheckedRadioButtonId()){
                    case R.id.rbBestCase:
                        array = Calculator.generateNaturalArray(size);

                        tvResult.setText("sorted array of size" + size+"is Generated" );
                        break;

                    case R.id.rbAverageCase:
                        array = Calculator.generateRandomIntArray(size);

                        tvResult.setText("Random array of size" + size+"is Generated" );
                        break;
                    case R.id.rbWorstCase:
                        //array = Calculator.reverseOfArray(size);
                        break;
                }
                break;
            case R.id.btnBubbleSort:
                int[] bubbleArray = Calculator.cloneArray(array);
                long bstart = System.currentTimeMillis();
                Calculator.bubbleSort(bubbleArray);
                tvBubbleSortResult.setText("" + (System.currentTimeMillis() - bstart) + "milli seconds");
                break;


            case R.id.btnSelectionSort:
                int[] selectionArray = Calculator.cloneArray(array);
                long sstart = System.currentTimeMillis();
                //Calculator.bubbleSort(selectionArray);

                tvSelectionSortResult.setText("" + (System.currentTimeMillis() - sstart)+ "milli seconds");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algorithmbenchmark_layout);
        etArraySize = (EditText)findViewById(R.id.etArraySize);
        tvResult = (TextView)findViewById(R.id.tvstatus);
        tvSelectionSortResult=(TextView)findViewById(R.id.tvSelectionSortResult);
        tvBubbleSortResult=(TextView)findViewById(R.id.tvBubbleSortResult);
        rgCase = (RadioGroup)findViewById(R.id.rgCase);
    }


}

