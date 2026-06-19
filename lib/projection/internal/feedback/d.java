package com.bilibili.lib.projection.internal.feedback;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.projection.internal.feedback.c;
import java.lang.ref.WeakReference;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/d.class */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f63204a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Looper looper) {
        super(looper);
        this.f63204a = cVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.f63204a;
        WeakReference<c.a> weakReference = cVar.f63200b;
        if (weakReference == null) {
            return;
        }
        c.a aVar = weakReference.get();
        int i7 = message.what;
        if (i7 == 1) {
            Context context = cVar.f63199a;
            ToastHelper.showToastShort(context, context.getString(2131847269));
            if (aVar != null) {
                aVar.onSuccess();
            }
            BLog.i("PlayerFeedbackTask", "[player] projection_feedback_success");
            return;
        }
        if (i7 != 2) {
            return;
        }
        Context context2 = cVar.f63199a;
        ToastHelper.showToastShort(context2, context2.getString(2131847111));
        if (aVar != null) {
            aVar.onFailed();
        }
        BLog.i("PlayerFeedbackTask", "[player] projection_feedback_failed");
    }
}
