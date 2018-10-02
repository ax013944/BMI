package com.well.bmi;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Editable;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void bmi(View view){
            Log.d("MainActivity", "bmi");
            EditText ed_weight = findViewById(R.id.ed_weight);
            EditText ed_height = findViewById(R.id.ed_height);
            String w =ed_weight.getText().toString();
            String h =ed_height.getText().toString();
            Log.d("MainActivity", w+"/"+h);
            float weight= Float.parseFloat(w);
            float height= Float.parseFloat(h);
            float bmi = weight/(height*height);
            Log.d("MainActivity", bmi+"");
        }
    }

