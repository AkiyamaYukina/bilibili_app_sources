package com.bilibili.lib.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bilibili.gripper.GripperExecute;
import com.bilibili.lib.performance.EntryAwait;
import com.bilibili.lib.tribe.core.internal.Hooks;
import lf0.ActivityC7846a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/VivoMessageActivity.class */
@EntryAwait(create = {"infra.opt.awaitPush"})
public class VivoMessageActivity extends ActivityC7846a {
    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2 = "";
        super.onCreate(bundle);
        GripperExecute.Companion.of().await("infra.opt.awaitPush");
        Log.e("VivoPush", "start vivopush activity");
        Intent intent = getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("task_id");
                try {
                    stringExtra2 = intent.getStringExtra("scheme");
                } catch (Exception e7) {
                }
            } catch (Exception e8) {
                stringExtra = "";
            }
            BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(this, new ClickInfo(stringExtra, stringExtra2));
        }
        finish();
    }
}
