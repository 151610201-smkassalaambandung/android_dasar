package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BalapKarung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balap_karung);

        Button sbk = (Button) findViewById(R.id.sbk);
        sbk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sbk) {
                Intent myIntent = new Intent(sbk.getContext(),Sejarahbk.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbbk = (Button) findViewById(R.id.cbbk);
        cbbk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbbk) {
                Intent myIntent = new Intent(cbbk.getContext(),CaraBermainbk.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
