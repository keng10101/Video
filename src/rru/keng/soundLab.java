package rru.keng;





import rru.keng.R;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class soundLab extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer mpMediaPlayer;
	Button btn1,btn2;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        mpMediaPlayer=MediaPlayer.create(this,R.raw.leona);
        //mpMediaPlayer.setLooping(true);
        //mpMediaPlayer.start();
        
        btn1 = (Button) this.findViewById(R.id.Button01);
        btn1.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  mpMediaPlayer.start();
        		  mpMediaPlayer.setLooping(true);
        	  }
        	});
        btn2 = (Button) this.findViewById(R.id.Button02);
        btn2.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  mpMediaPlayer.pause();
        	  }
        	});
        
         }
	@Override
    public void onDestroy()
    {
    	super.onDestroy();
    	mpMediaPlayer.release();
    }
}