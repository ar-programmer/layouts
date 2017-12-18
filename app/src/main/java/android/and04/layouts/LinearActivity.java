package android.and04.layouts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    public void onClickTableLayout(View view) {
        Intent intent = new Intent(this, TableActivity.class); startActivity(intent);
    }
    public void onClickRelativeLayout(View view) {
        Intent intent = new Intent(this, RelativeActivity.class); startActivity(intent);
    }
    public void onClickFrameLayout(View view) {
        Intent intent = new Intent(this, FrameActivity.class); startActivity(intent);
    }
    public void onClickGridLayout(View view) {
        Intent intent = new Intent(this, GridActivity.class); startActivity(intent);
    }

    public void onButtonClick(View view)
    {
        Intent intent = null;
        switch (view.getId())
        {
            case R.id.button_TableLayout:
                intent = new Intent(this, TableActivity.class); break;
            case R.id.button_RelativeLayout:
                intent = new Intent(this, RelativeActivity.class); break;
            case R.id.button_FrameLayout:
                intent = new Intent(this, FrameActivity.class); break;
            case R.id.button_GridLayout:
                intent = new Intent(this, GridActivity.class);
                break;
            default: break;
        }
        if (intent != null) startActivity(intent);
    }
}
