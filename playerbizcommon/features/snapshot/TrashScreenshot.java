package com.bilibili.playerbizcommon.features.snapshot;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/snapshot/TrashScreenshot.class */
public class TrashScreenshot extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        Uri uri = Uri.parse(extras.getString("tv.danmaku.player.screenshot.trashscreenshot.SNAPSHOT_URI"));
        if (uri != null) {
            try {
                context.getContentResolver().delete(uri, null, null);
            } catch (SecurityException e7) {
                BLog.i("TrashScreenshot", e7);
            }
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(789);
    }
}
