package android.and04.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }

    public void onClickTableLayout(View view) {
        Intent intent = new Intent(this, TableActivity.class); startActivity(intent);
    }
    public void onClickLinearLayout(View view) {
        Intent intent = new Intent(this, LinearActivity.class); startActivity(intent);
    }
    public void onClickFrameLayout(View view) {
        Intent intent = new Intent(this, FrameActivity.class); startActivity(intent);
    }
    public void onClickGridLayout(View view) {
        Intent intent = new Intent(this, GridActivity.class); startActivity(intent);
    }


}
