package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Engklek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engklek);

        Button sen = (Button) findViewById(R.id.sen);
        sen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sen) {
                Intent myIntent = new Intent(sen.getContext(),Sejarahen.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cben = (Button) findViewById(R.id.cben);
        cben.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cben) {
                Intent myIntent = new Intent(cben.getContext(),CaraBermainen.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
