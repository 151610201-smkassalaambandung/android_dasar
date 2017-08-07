package permainan.com.permainananak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button mulai = (Button) findViewById(R.id.mulai);
        mulai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View mulaii) {
                Intent myIntent = new Intent(mulaii.getContext(),Pilihan.class);
                startActivityForResult(myIntent,0);
            }
        });

        ImageButton info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View infoo) {
                Intent myIntent = new Intent(infoo.getContext(),Info.class);
                startActivityForResult(myIntent,0);
            }
        });

        ImageButton as = (ImageButton) findViewById(R.id.assalaam);
        as.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View as) {
                Intent myIntent = new Intent(as.getContext(),Web.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
