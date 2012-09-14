package tw.gasol.android;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends RoboActivity {

	@InjectView(R.id.text)
	private TextView mTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mTextView.setText(getString(R.string.hello_roboguice));
	}
}
