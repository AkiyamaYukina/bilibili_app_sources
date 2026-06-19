package com.bilibili.lib.push;

import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/MiMessageReceiver.class */
public final class MiMessageReceiver extends PushMessageReceiver {
    public static final String TAG = "MiMessageReceiver";

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageArrived(context, miPushMessage);
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageClicked(context, miPushMessage);
        Map extra = miPushMessage.getExtra();
        BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(context, new ClickInfo(extra != null ? (String) extra.get("task_id") : null, miPushMessage.getContent()));
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceivePassThroughMessage(context, miPushMessage);
        BPushLog.i(TAG, "pass through message: " + miPushMessage);
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        super.onReceiveRegisterResult(context, miPushCommandMessage);
        String command = miPushCommandMessage.getCommand();
        BPushLog.i(TAG, "onReceiveRegisterResult: " + miPushCommandMessage.toString());
        if ("register".equals(command)) {
            IPushRegistry pushRegistry = BPushManagerServiceProvider.INSTANCE.get().getPushRegistry();
            if (pushRegistry instanceof MiPushRegistry) {
                ((MiPushRegistry) pushRegistry).disposeCommandRegisterResult(context, miPushCommandMessage);
            }
        }
    }
}
