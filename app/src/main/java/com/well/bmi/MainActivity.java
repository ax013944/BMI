package com.well.bmi;

        import android.content.DialogInterface;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_height;
    private EditText ed_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_height = findViewById(R.id.ed_height);
        ed_weight = findViewById(R.id.ed_weight);
    }
        public void bmi(View view){
            Log.d("MainActivity", "bmi");
            String h =ed_height.getText().toString();
            String w =ed_weight.getText().toString();
            Log.d("MainActivity", w+"/"+h);
            float weight= Float.parseFloat(w);
            float height= Float.parseFloat(h);
            float bmi = weight/(height*height);
            Log.d("MainActivity", bmi+"");
            Toast.makeText(this,"Your BMI is"+bmi,
                    Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this)
                    .setMessage("Your BMI is "+bmi)
            .setTitle("BMI")
            .setPositiveButton("OK",null)
            .setNegativeButton("Clear", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    ed_height.setText(" ");
                    ed_weight.setText("");
                }
            })
            .show();
    }
    }


