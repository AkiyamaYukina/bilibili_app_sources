package com.bilibili.lib.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/MessageReceiver.class */
public final class MessageReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        try {
            if (Intrinsics.areEqual(BPushFoundation.getApp().getPackageName() + ".com.bilibili.push.notification.receiver", intent.getAction())) {
                String stringExtra = intent.getStringExtra("task_id");
                String stringExtra2 = intent.getStringExtra("scheme");
                if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                    BPushLog.e("MessageReceiver", "receive invalid data");
                } else {
                    BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(context, new ClickInfo(stringExtra, stringExtra2));
                    BPushLog.i("MessageReceiver", "receive push notification click");
                }
            } else {
                BPushLog.e("MessageReceiver", "receive invalid intent");
            }
        } catch (Exception e7) {
            BPushLog.e("MessageReceiver", "onReceive failed");
        }
    }
}
