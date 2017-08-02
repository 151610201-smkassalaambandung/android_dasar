package assalaam.test.id.test;

import java.io.IOException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class playingAudio extends AppCompatActivity {

    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;
    private Button btnPause;
    private Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        keterangan=(TextView)findViewById(R.id.ket);
        keterangan.setText("Silakan klik tombol play");
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        mainkan=(ImageButton)findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        });
    }
    public void go(){
        mp=MediaPlayer.create(playingAudio.this, R.raw.contoh);
        try{
            mp.prepare();
        } catch (IllegalStateException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            public void onCompletion(MediaPlayer arg0) {
                mainkan.setEnabled(true);
                keterangan.setText("Silakan klik tombol play");
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }
    /** State Awal / Pertama Dijalankan */
    public void stateAwal(){
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

    /** Dijalankan Oleh Tombol Pause */
    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }

    /** Dijalankan Oleh Tombol Stop */
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
    }
}
