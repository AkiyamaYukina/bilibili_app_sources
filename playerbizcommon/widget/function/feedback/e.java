package com.bilibili.playerbizcommon.widget.function.feedback;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bilibili.playerbizcommon.widget.function.feedback.d;
import java.lang.ref.WeakReference;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/e.class */
public final class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80679a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Looper looper) {
        super(looper);
        this.f80679a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference<d.a> weakReference = this.f80679a.f80673a;
        if (weakReference == null) {
            return;
        }
        d.a aVar = weakReference.get();
        int i7 = message.what;
        if (i7 == 1) {
            if (aVar != null) {
                aVar.onSuccess();
            }
            BLog.i("PlayerFeedbackTask", "[player] playersetting_feedback_success");
        } else {
            if (i7 != 2) {
                return;
            }
            if (aVar != null) {
                aVar.onFailed();
            }
            BLog.i("PlayerFeedbackTask", "[player] playersetting_feedback_failed");
        }
    }
}
