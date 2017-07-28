package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button satu =(Button) findViewById(R.id.Button1);
        satu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View satuu){
                Intent myIntent= new Intent(satuu.getContext(),LinearLayoutSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button dua =(Button) findViewById(R.id.Button2);
        dua.setOnClickListener(new View.OnClickListener(){

            public void onClick(View duaa){
                Intent myIntent= new Intent(duaa.getContext(),RelativeLayoutSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button tiga =(Button) findViewById(R.id.Button3);
        tiga.setOnClickListener(new View.OnClickListener(){

            public void onClick(View tigaa){
                Intent myIntent= new Intent(tigaa.getContext(),LayoutTabel.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button empat =(Button) findViewById(R.id.Button4);
        empat.setOnClickListener(new View.OnClickListener(){

            public void onClick(View empatt){
                Intent myIntent= new Intent(empatt.getContext(),TampilanGambar.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button lima =(Button) findViewById(R.id.Button5);
        lima.setOnClickListener(new View.OnClickListener(){

            public void onClick(View limaa){
                Intent myIntent= new Intent(limaa.getContext(),AutoCompleteSederhana.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
