package com.bilibili.lib.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bilibili.gripper.GripperExecute;
import com.bilibili.lib.performance.EntryAwait;
import com.bilibili.lib.tribe.core.internal.Hooks;
import lf0.ActivityC7846a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/MiPushMessageActivity.class */
@EntryAwait(create = {"infra.opt.awaitPush"})
public class MiPushMessageActivity extends ActivityC7846a {
    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3 = "";
        super.onCreate(bundle);
        GripperExecute.Companion.of().await("infra.opt.awaitPush");
        Log.e("MiPush", "start mipush activity");
        Intent intent = getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("task_id");
                try {
                    stringExtra2 = intent.getStringExtra("scheme");
                    try {
                        stringExtra3 = intent.getStringExtra("button");
                    } catch (Exception e7) {
                    }
                } catch (Exception e8) {
                    stringExtra2 = "";
                }
            } catch (Exception e9) {
                stringExtra = "";
                stringExtra2 = "";
            }
            ClickInfo clickInfo = new ClickInfo(stringExtra, stringExtra2);
            clickInfo.addExtraInfo("button", stringExtra3);
            BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(this, clickInfo);
        }
        finish();
    }
}
