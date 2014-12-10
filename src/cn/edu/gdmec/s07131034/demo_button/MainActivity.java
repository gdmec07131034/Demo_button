package cn.edu.gdmec.s07131034.demo_button;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private Button button;
	private EditText et;
	private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById(R.id.button1);
        
        et = (EditText) findViewById(R.id.editText1);
        
        tv = (TextView) findViewById(R.id.textView1);
        
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String text = et.getText().toString();
				
				tv.setText(text);
			}});
    }

//    public void doClick(View v){
//    	Log.i("info", "button 按钮被点击了！！！");
//    }

}
