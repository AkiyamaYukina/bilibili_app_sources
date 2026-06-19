package com.bilibili.lib.push;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.lib.tribe.core.internal.Hooks;
import lf0.ActivityC7846a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/NotificationIntentActivity.class */
public class NotificationIntentActivity extends ActivityC7846a {
    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BPushLog.i("NotificationIntentActivity", "NotificationIntentActivity onCreate");
        String stringExtra = getIntent().getStringExtra("task_id");
        String stringExtra2 = getIntent().getStringExtra("scheme");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            BPushLog.e("NotificationIntentActivity", "NotificationIntentActivity receive invalid data");
        } else {
            BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(this, new ClickInfo(stringExtra, stringExtra2));
            BPushLog.i("NotificationIntentActivity", "NotificationIntentActivity receive push notification click");
        }
        finish();
    }
}
