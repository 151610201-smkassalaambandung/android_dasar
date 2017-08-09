package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kelereng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelereng);

        Button sk = (Button) findViewById(R.id.sk);
        sk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sk) {
                Intent myIntent = new Intent(sk.getContext(),Sejarahk.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbk = (Button) findViewById(R.id.cbk);
        cbk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbk) {
                Intent myIntent = new Intent(cbk.getContext(),CaraBermaink.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
