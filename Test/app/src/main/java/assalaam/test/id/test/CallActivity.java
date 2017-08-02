package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Button next= (Button) findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View bebek) {
                Intent myIntent = new Intent(bebek.getContext(), CallActivity2.class);
                startActivityForResult(myIntent,0);
            }
        });
    }
}
