package com.example.mysmall;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import net.wequick.small.Small;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LaunchActivity extends AppCompatActivity {

    private static final String TAG=LaunchActivity.class.getSimpleName();

    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;

    private View mContentView;
    private View mControlsView;
    private boolean mVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_launch);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.fullscreen_content);


        Small.setUp(this, new net.wequick.small.Bundle.OnLoadListener() {
            @Override
            public void onStart(int bundleCount, int upgradeBundlesCount, long upgradeBundlesSize) {

            }

            @Override
            public void onProgress(int bundleIndex, String bundleName, long loadedSize, long bundleSize) {

            }

            @Override
            public void onComplete(Boolean success) {
                Log.d(TAG, "~~~~~~~onComplete~~~~~~~~~");
                Small.openUri("pluginc", LaunchActivity.this);
                Log.d(TAG, "~~~~~~~onComplete~  end~~~~~~~~");

            }
        });
    }





}
