package org.mmodroid.mmfont_sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import org.mmodroid.mmfont_sample.R;

public class MainActivity extends Activity {

	TextView version, tv_mm3, tv_ygk, tv_mymm, tv_masterpiece, tv_zg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setView();
		setText();
	}

	private void setView() {
		version = (TextView) findViewById(R.id.version);
		tv_mm3 = (TextView) findViewById(R.id.cv_mm3);
		tv_ygk = (TextView) findViewById(R.id.cv_ygk);
		tv_mymm = (TextView) findViewById(R.id.cv_mymm);
		tv_masterpiece = (TextView) findViewById(R.id.cv_masterpiece);
		tv_zg = (TextView) findViewById(R.id.cv_zg);
	}

	private void setText() {
		version.setText("Device name - "
				+ String.valueOf(android.os.Build.MANUFACTURER) + " "
				+ String.valueOf(android.os.Build.MODEL)
				+ "\nAPI version is - "
				+ String.valueOf(android.os.Build.VERSION.SDK_INT));
		tv_mm3.setText("မြန်မာစာသည် တို့စာ။");
		tv_ygk.setText("မြန်မာစာသည် တို့စာ။");
		tv_mymm.setText("မြန်မာစာသည် တို့စာ။");
		tv_masterpiece.setText("မြန်မာစာသည် တို့စာ။");
		tv_zg.setText("ေဇာ္က ကေနသည္။");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
