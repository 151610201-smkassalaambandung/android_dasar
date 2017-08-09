package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Congklak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congklak);

        Button sc = (Button) findViewById(R.id.sc);
        sc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sc) {
                Intent myIntent = new Intent(sc.getContext(),Sejarahc.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbc = (Button) findViewById(R.id.cbc);
        cbc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbc) {
                Intent myIntent = new Intent(cbc.getContext(),CaraBermainc.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
