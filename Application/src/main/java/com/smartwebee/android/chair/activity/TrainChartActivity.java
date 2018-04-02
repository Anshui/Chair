package com.smartwebee.android.chair.activity;

import android.Manifest;
import android.content.pm.PermissionInfo;
import android.os.Build;
import android.os.Bundle;

import com.smartwebee.android.chair.R;

import java.security.Permission;

public class TrainChartActivity extends BleSppActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_chart);

    }
}
