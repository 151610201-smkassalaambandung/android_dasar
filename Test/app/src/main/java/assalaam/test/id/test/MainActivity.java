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

        Button enam =(Button) findViewById(R.id.Button6);
        enam.setOnClickListener(new View.OnClickListener(){

            public void onClick(View enamm){
                Intent myIntent= new Intent(enamm.getContext(),Picker.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button tujuh =(Button) findViewById(R.id.Button7);
        tujuh.setOnClickListener(new View.OnClickListener(){

            public void onClick(View tujuh){
                Intent myIntent= new Intent(tujuh.getContext(),seleksi.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button delapan =(Button) findViewById(R.id.Button8);
        delapan.setOnClickListener(new View.OnClickListener(){

            public void onClick(View delapan){
                Intent myIntent= new Intent(delapan.getContext(),KotakDialog.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button sembilan =(Button) findViewById(R.id.Button9);
        sembilan.setOnClickListener(new View.OnClickListener(){

            public void onClick(View sembilann){
                Intent myIntent= new Intent(sembilann.getContext(),checkBox.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button semb =(Button) findViewById(R.id.Button10);
        semb.setOnClickListener(new View.OnClickListener(){

            public void onClick(View sembb){
                Intent myIntent= new Intent(sembb.getContext(),RadioButton.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button a =(Button) findViewById(R.id.Button11);
        a.setOnClickListener(new View.OnClickListener(){

            public void onClick(View aa){
                Intent myIntent= new Intent(aa.getContext(),playingAudio.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button b =(Button) findViewById(R.id.Button12);
        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bb){
                Intent myIntent= new Intent(bb.getContext(),CallActivity.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button c =(Button) findViewById(R.id.Button13);
        c.setOnClickListener(new View.OnClickListener(){

            public void onClick(View cc){
                Intent myIntent= new Intent(cc.getContext(),CallActivity2.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
