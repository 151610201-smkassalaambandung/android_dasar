package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Egrang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egrang);

        Button se = (Button) findViewById(R.id.se);
        se.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View se) {
                Intent myIntent = new Intent(se.getContext(),Sejarahe.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbe = (Button) findViewById(R.id.cbe);
        cbe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbe) {
                Intent myIntent = new Intent(cbe.getContext(),CaraBermaine.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
