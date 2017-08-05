package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorBeratBadan extends AppCompatActivity {

    private float height;
    private float weight;
    private float BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_berat_badan);

        final Button Hitung = (Button) findViewById(R.id.hitung);
        final EditText height_value = (EditText) findViewById(R.id.height);
        final EditText weight_value = (EditText) findViewById(R.id.weight);
        final TextView Result = (TextView) findViewById(R.id.result);

        Hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (height_value.getText().length()>0 && weight_value.getText().length()>0){
                    height= Float.parseFloat(height_value.getText().toString());
                    weight= Float.parseFloat(weight_value.getText().toString());
                    BMI= KalkulasiPerhitungan(weight,height);

                    if (BMI<16){
                        Result.setText("Your BMI"+BMI+"Cungkring");
                    } else if (BMI<18.5){
                        Result.setText("Your BMI"+BMI+"Peot");
                    } else if (BMI<25){
                        Result.setText("Your BMI"+BMI+"Normal");
                    } else if (BMI<30){
                        Result.setText("Your BMI"+BMI+"Rada Gendut");
                    } else {
                        Result.setText("Your BMI"+BMI+"Obesitas");
                    }
                }
            }

            private float KalkulasiPerhitungan(float weight, float height) {
                height = (height/100);
                return (float) (weight/(height*height));
            }
        });
    }
}
