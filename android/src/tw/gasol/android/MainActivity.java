package tw.gasol.android;

import roboguice.activity.RoboActivity;
import android.os.Bundle;

public class MainActivity extends RoboActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
