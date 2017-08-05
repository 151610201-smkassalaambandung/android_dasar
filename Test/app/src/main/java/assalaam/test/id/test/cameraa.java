package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.ImageButton;
import android.view.View;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;




public class cameraa extends AppCompatActivity {

    ImageButton btnSwitch;
    MediaPlayer mp;
    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    Parameters param;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameraa);

        btnSwitch =(ImageButton) findViewById(R.id.btnSwitch);

        hasFlash = getApplicationContext().getPackageManager()
                .hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if (!hasFlash){
            AlertDialog alert = new AlertDialog.Builder(cameraa.this).create();
            alert.setTitle("Does't Support" );
            alert.setMessage("Punten Gentos HP na");
            alert.setButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.show();
            return;
        }
        getCamera();
        toggleButtonImage();
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFlashOn) {
                    turnOffFlash();
                } else {
                    turnOnFlash();
                }
            }
        });
    }
    private void getCamera(){
        if (camera == null){
            try{
                camera =Camera.open();
                param= camera.getParameters();
            } catch (RuntimeException e){
                Log.e("Camera Error.Error:",e.getMessage());
            }
        }
    }

    private void turnOnFlash(){
        if (!isFlashOn) {
            if (camera == null || param == null){
                return;
            }

            playSound();
            param = camera.getParameters();
            param.setFlashMode(Parameters.FLASH_MODE_TORCH);
            camera.setParameters(param);
            camera.startPreview();
            isFlashOn=true;
            toggleButtonImage();
        }
    }

    private void turnOffFlash(){
        if (isFlashOn){
            if (camera == null || param == null){
                return;
            }
            playSound();
            param=camera.getParameters();
            param.setFlashMode(Parameters.FLASH_MODE_OFF);
            camera.setParameters(param);
            camera.stopPreview();
            isFlashOn=false;
            toggleButtonImage();
        }
    }



    private void playSound(){
        if (isFlashOn){
            mp= MediaPlayer.create(cameraa.this, R.raw.light_switch_off);
        } else {
            mp = MediaPlayer.create(cameraa.this, R.raw.light_switch_on);
        }
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
        mp.start();
    }
    private void toggleButtonImage(){
        if (isFlashOn){
            btnSwitch.setImageResource(R.drawable.btn_switch_on);
        } else {
            btnSwitch.setImageResource(R.drawable.btn_switch_off);
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    @Override
    protected void onPause(){
        super.onPause();
        turnOffFlash();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (hasFlash)
            turnOnFlash();
    }

    @Override
    protected void onStart(){
        super.onStart();
        getCamera();

    }

    @Override
    protected void onStop(){
        super.onStop();

        if (camera != null){
            camera.release();
            camera= null;
        }


    }
}
