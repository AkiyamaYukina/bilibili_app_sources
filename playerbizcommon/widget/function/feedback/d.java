package com.bilibili.playerbizcommon.widget.function.feedback;

import android.app.Application;
import android.os.Looper;
import com.bilibili.base.BiliContext;
import com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackFragment;
import dagger.hilt.EntryPoints;
import java.lang.ref.WeakReference;
import java.util.List;
import kntr.base.laser.api.ILaser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/d.class */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final WeakReference<a> f80673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f80674b = new e(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f80675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f80676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f80677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f80678f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/d$a.class */
    public interface a {
        void onFailed();

        void onSuccess();
    }

    public d(PlayerFeedbackFragment.b bVar, String str, String str2, long j7, long j8) {
        this.f80675c = str;
        this.f80676d = str2;
        this.f80677e = j7;
        this.f80678f = j8;
        this.f80673a = new WeakReference<>(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILaser laser;
        try {
            Application application = BiliContext.application();
            if (application == null || (laser = ((ILaser.Fetcher) EntryPoints.get(application, ILaser.Fetcher.class)).getLaser()) == null) {
                return;
            }
            laser.upload(new ILaser.Request("PlayerFeedback", (String) null, (List) null, 6, (DefaultConstructorMarker) null), new f(this));
        } catch (Exception e7) {
            BLog.e("PlayerFeedbackTask", "player feedback upload failed!", e7);
        }
    }
}
