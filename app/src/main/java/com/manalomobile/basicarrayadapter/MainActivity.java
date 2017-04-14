package com.manalomobile.basicarrayadapter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IconList.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IconList iconList = new IconList();
        getSupportFragmentManager().beginTransaction().add(R.id.container, iconList).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
