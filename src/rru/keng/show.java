package rru.keng;

import rru.keng.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class show extends Activity {
    /** Called when the activity is first created. */
	Button btn1,btn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn1 = (Button) this.findViewById(R.id.Button01);
        btn1.setOnClickListener(new OnClickListener() {
        	  public void onClick(View v) {
        		             		
        		  Intent StartGameIntent = new Intent(v.getContext(),videoLab.class);
                  startActivity(StartGameIntent);                 
        	  }
        	});
        btn2=(Button)this.findViewById(R.id.Button02);
        btn2.setOnClickListener(new OnClickListener() {
      	  public void onClick(View v) {
      		             		
      		  Intent StartGameIntent = new Intent(v.getContext(),soundLab.class);
                startActivity(StartGameIntent);                 
      	  }
      	});
    }
}