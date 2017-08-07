package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BolaBekel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola_bekel);

        Button sbb = (Button) findViewById(R.id.sbb);
        sbb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sbb) {
                Intent myIntent = new Intent(sbb.getContext(),Sejarahbb.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbbb = (Button) findViewById(R.id.cbbb);
        cbbb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbbk) {
                Intent myIntent = new Intent(cbbk.getContext(),CaraBermainbb.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
