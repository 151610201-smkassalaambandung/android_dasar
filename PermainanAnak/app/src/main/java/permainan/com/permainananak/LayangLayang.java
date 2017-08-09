package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayangLayang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang_layang);

        Button sll = (Button) findViewById(R.id.sll);
        sll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View sll) {
                Intent myIntent = new Intent(sll.getContext(),Sejarahll.class);
                startActivityForResult(myIntent,0);
            }
        });

        Button cbll = (Button) findViewById(R.id.cbll);
        cbll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View cbll) {
                Intent myIntent = new Intent(cbll.getContext(),CaraBermainll.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
