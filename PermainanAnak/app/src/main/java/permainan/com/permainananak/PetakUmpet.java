package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PetakUmpet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petak_umpet);

        Button spu = (Button) findViewById(R.id.spu);
        spu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View spu) {
                Intent myIntent = new Intent(spu.getContext(),Sejaeahpu.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbpu = (Button) findViewById(R.id.cbpu);
        cbpu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbpu) {
                Intent myIntent = new Intent(cbpu.getContext(),CaraBermainpu.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
