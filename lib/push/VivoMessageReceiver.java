package com.bilibili.lib.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/VivoMessageReceiver.class */
public class VivoMessageReceiver extends OpenClientPushMessageReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f64232b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f64233a = new Handler(Looper.getMainLooper());

    public final void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        Map params = uPSNotificationMessage.getParams();
        if (params == null || params.isEmpty()) {
            return;
        }
        BPushManagerServiceProvider.INSTANCE.get().resolveNotificationClicked(context, new ClickInfo((String) params.get("task_id"), (String) params.get("scheme")));
    }

    public final void onReceiveRegId(Context context, String str) {
        this.f64233a.post(new GY.b(str, 1));
    }
}
