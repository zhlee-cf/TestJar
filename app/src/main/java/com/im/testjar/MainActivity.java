package com.im.testjar;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.im.openimlib.app.OpenIM;
import com.im.openimlib.fragment.ConversationListFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Context username password
        OpenIM.init(this, "lizhcf", "123123");

        initView();
    }
    private void initView() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_frame, new ConversationListFragment()).commit();
    }
}
