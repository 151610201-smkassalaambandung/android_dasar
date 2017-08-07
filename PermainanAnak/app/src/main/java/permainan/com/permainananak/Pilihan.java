package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pilihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        Button a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View aa) {
                Intent myIntent = new Intent(aa.getContext(),BalapKarung.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View bb) {
                Intent myIntent = new Intent(bb.getContext(),BolaBekel.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cc) {
                Intent myIntent = new Intent(cc.getContext(),Congklak.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(),Egrang.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button e = (Button) findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ee) {
                Intent myIntent = new Intent(ee.getContext(),Engklek.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ff) {
                Intent myIntent = new Intent(ff.getContext(),Gasing.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button g = (Button) findViewById(R.id.button7);
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View gg) {
                Intent myIntent = new Intent(gg.getContext(),Kelereng.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View hh) {
                Intent myIntent = new Intent(hh.getContext(),LayangLayang.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button i = (Button) findViewById(R.id.button9);
        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View ii) {
                Intent myIntent = new Intent(ii.getContext(),LompatTali.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button j = (Button) findViewById(R.id.button10);
        j.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View jj) {
                Intent myIntent = new Intent(jj.getContext(),PetakUmpet.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
