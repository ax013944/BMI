package com.well.bmi;

        import android.content.DialogInterface;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    private EditText ed_height;
    private EditText ed_weight;
private Button help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

    private void findview() {
        ed_height = findViewById(R.id.ed_height);
        ed_weight = findViewById(R.id.ed_weight);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "onclick:help");
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(R.string.bmi_info)
            .setPositiveButton(R.string.ok,null)
             .show();

            }
        });
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
            Toast.makeText(this,getString(R.string.your_bmi_is)+bmi,
                    Toast.LENGTH_LONG).show();
            new AlertDialog.Builder(this)
                    .setMessage(getString(R.string.your_bmi_is) + bmi)
            .setTitle("BMI")
            .setPositiveButton(R.string.ok,null)
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


