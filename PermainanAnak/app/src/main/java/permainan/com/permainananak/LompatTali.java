package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LompatTali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lompat_tali);

        Button slt = (Button) findViewById(R.id.slt);
        slt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View slt) {
                Intent myIntent = new Intent(slt.getContext(),Sejarahlt.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cblt = (Button) findViewById(R.id.cblt);
        cblt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cblt) {
                Intent myIntent = new Intent(cblt.getContext(),CaraBermainlt.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
