package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f70939a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70940b = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/h$a.class */
    public static final class a extends BiliApiCallback<GeneralResponse<Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f70941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f70942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f70943d;

        public a(long j7, long j8, long j9) {
            this.f70941b = j7;
            this.f70942c = j8;
            this.f70943d = j9;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public void onError(Throwable th) {
            BLog.w("BangumiInlineHistory", androidx.compose.ui.input.pointer.k.b(this.f70942c, "report epId:", " video to history failed : ", th != null ? th.getMessage() : null));
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public void onSuccess(GeneralResponse<Object> generalResponse) {
            long j7 = this.f70941b;
            long j8 = this.f70942c;
            long j9 = this.f70943d;
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "report video to history success sid:", ", epId");
            sbA.append(j8);
            com.bilibili.app.comment3.utils.r.b(j9, ", progress:", "BangumiInlineHistory", sbA);
        }
    }

    private h() {
    }

    private final void b(long j7, long j8, long j9, long j10, long j11, long j12, int i7, int i8, long j13, long j14, String str, BiliApiCallback<GeneralResponse<Object>> biliApiCallback) {
        ((Wh.b) ServiceGenerator.createService(Wh.b.class)).reportProgress(j7, j8, j9, j10, j12, i7, i8, j11, ServerClock.unreliableNow() / ((long) 1000), j13, j14, str).enqueue(biliApiCallback);
    }

    private final long c(long j7) {
        long j8 = j7;
        if (j7 > -1) {
            j8 = j7 / ((long) 1000);
        }
        return j8;
    }

    public final void a(long j7, long j8, long j9, long j10, long j11, long j12, int i7, long j13, long j14, @NotNull BangumiInlineHistoryReportSource bangumiInlineHistoryReportSource) {
        if (j9 <= 0 || j10 <= 0) {
            return;
        }
        if (j11 >= 1000 || j11 == -1) {
            b(j7, j8, j9, j10, c(j11), c(j12), 4, i7, c(j13), c(j14), bangumiInlineHistoryReportSource.getFromId(), new a(j9, j10, j12));
        }
    }
}
