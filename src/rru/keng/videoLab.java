package rru.keng;

import rru.keng.R;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class videoLab extends Activity {
    /** Called when the activity is first created. */
	VideoView myVideoView;
	Button btn1,btn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        myVideoView= (VideoView)findViewById(R.id.VideoView01);
        myVideoView.setVideoPath("/sdcard/squirrel.3gp");
       
        
        btn1 = (Button) this.findViewById(R.id.Button01);
        btn1.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  myVideoView.start();
        	  }
        	});
        
        btn2 = (Button) this.findViewById(R.id.Button02);
        btn2.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  myVideoView.pause();
        	  }
        	});
    }
}