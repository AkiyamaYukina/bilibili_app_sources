package com.bilibili.lib.push;

import androidx.annotation.Nullable;
import com.heytap.msp.push.callback.ICallBackResultService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/w.class */
public final class w implements ICallBackResultService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public OppoPushRegistry f64263a;

    public final void onError(int i7, String str, String str2, String str3) {
        BPushLog.e("OppoPushReceiver", String.format("OppoPushReceiver onError: %d, message: %s", Integer.valueOf(i7), str));
    }

    public final void onGetNotificationStatus(int i7, int i8) {
    }

    public final void onGetPushStatus(int i7, int i8) {
    }

    public final void onRegister(int i7, String str, String str2, String str3) {
        OppoPushRegistry oppoPushRegistry = this.f64263a;
        if (oppoPushRegistry != null) {
            oppoPushRegistry.disposeCommandRegisterResult(i7, str);
        }
    }

    public final void onSetPushTime(int i7, String str) {
    }

    public final void onUnRegister(int i7, String str, String str2) {
    }
}
