package a4everstudent.currencyconverter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {



    //TODO: make the currencies choosable - adding function for all
    //TODO: format result with 2 decimals

    public void convert(View view){
        EditText euroField = (EditText) findViewById(R.id.euroField);
        Double euroAmount = Double.parseDouble(euroField.getText().toString());
        Double dollarAmount = euroAmount *1.1196;
        Toast.makeText(getApplicationContext(), "$"+ dollarAmount.toString(), Toast.LENGTH_LONG).show();
        Log.i("euroField", euroField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
