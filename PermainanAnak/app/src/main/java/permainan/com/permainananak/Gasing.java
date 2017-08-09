package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gasing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasing);

        Button sg = (Button) findViewById(R.id.sg);
        sg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sg) {
                Intent myIntent = new Intent(sg.getContext(),Sejarahg.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbg = (Button) findViewById(R.id.cbg);
        cbg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbg) {
                Intent myIntent = new Intent(cbg.getContext(),CaraBermaing.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
