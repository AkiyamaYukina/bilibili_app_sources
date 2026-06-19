package com.bilibili.opd.app.bizcommon.context;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/ActivityLifecycleListener.class */
public interface ActivityLifecycleListener {
    void onActivityResult(Activity activity, int i7, int i8, Intent intent);

    void onCreate(Activity activity, Bundle bundle);

    void onDestroy(Activity activity);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onSaveInstanceState(Activity activity, Bundle bundle);

    void onStart(Activity activity);

    void onStop(Activity activity);
}
