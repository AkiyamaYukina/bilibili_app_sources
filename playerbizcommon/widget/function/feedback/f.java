package com.bilibili.playerbizcommon.widget.function.feedback;

import Od0.m;
import android.text.format.DateFormat;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.droid.thread.HandlerThreads;
import kntr.base.laser.api.ILaser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/f.class */
public final class f implements ILaser.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80680a;

    public f(d dVar) {
        this.f80680a = dVar;
    }

    public final void onFailed(int i7, String str) {
        this.f80680a.f80674b.sendEmptyMessage(2);
    }

    public final void onSuccess(int i7, String str) {
        d dVar = this.f80680a;
        if (i7 == 0 && str.length() != 0) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = dVar.f80676d;
            if (Intrinsics.areEqual(dVar.f80675c, "70")) {
                long j7 = dVar.f80677e;
                long j8 = dVar.f80678f;
                CharSequence charSequence = DateFormat.format("yyyy-MM-dd kk:mm", System.currentTimeMillis());
                StringBuilder sbA = z.a(j7, "avid: ", " cid: ");
                sbA.append(j8);
                sbA.append(" 弹幕无法显示，时间：");
                sbA.append((Object) charSequence);
                objectRef.element = sbA.toString();
            }
            HandlerThreads.post(1, new m(objectRef, str, dVar));
        }
        dVar.f80674b.sendEmptyMessage(1);
    }
}
