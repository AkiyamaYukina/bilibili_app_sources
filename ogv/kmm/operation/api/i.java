package com.bilibili.ogv.kmm.operation.api;

import PX0.S;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import io.ktor.client.HttpClient;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpClient f68002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f68004c;

    @Inject
    public i(@NotNull HttpClient httpClient, @Nullable Tk0.a aVar, @NotNull String str, @Nullable String str2) {
        this.f68002a = httpClient;
        this.f68003b = str;
        this.f68004c = str2;
    }

    public final void a(S s7) {
        s7.append("fnval", String.valueOf(PlayUrlFlagsManager.getFnVal()));
        s7.append("fnver", String.valueOf(PlayUrlFlagsManager.getFnVer()));
        s7.append("fourk", IjkOptionsHelper.isSupport4K() ? "1" : "0");
        s7.append("long_edge", String.valueOf(dj1.b.b));
        s7.append("short_edge", String.valueOf(dj1.b.c));
        s7.append("qn_policy", PlayerSettingHelper.isQualityAutoSwitch() ? "1" : "0");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:8))(0)|9|70|(2:11|(2:13|(4:15|16|46|(4:48|(2:54|(1:56)(2:57|58))(1:53)|64|65)(3:59|60|61))(2:21|22))(2:23|24))(8:25|26|27|28|29|30|31|(2:33|34)(1:35))|36|37|68|38|41|42|(2:44|45)|46|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0218, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a6 A[Catch: Exception -> 0x0085, CancellationException -> 0x0089, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0089, Exception -> 0x0085, blocks: (B:16:0x007d, B:48:0x02a6, B:51:0x02b6, B:54:0x02c0, B:56:0x02c7, B:57:0x02e3, B:58:0x02ec, B:59:0x02ed, B:59:0x02ed, B:60:0x02f0, B:61:0x02f9, B:24:0x00fa, B:36:0x01ec, B:41:0x021b, B:26:0x0107, B:28:0x019e, B:30:0x01a4), top: B:70:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ed A[Catch: Exception -> 0x0085, Exception -> 0x0085, CancellationException -> 0x0089, CancellationException -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0089, Exception -> 0x0085, blocks: (B:16:0x007d, B:48:0x02a6, B:51:0x02b6, B:54:0x02c0, B:56:0x02c7, B:57:0x02e3, B:58:0x02ec, B:59:0x02ed, B:59:0x02ed, B:60:0x02f0, B:61:0x02f9, B:24:0x00fa, B:36:0x01ec, B:41:0x021b, B:26:0x0107, B:28:0x019e, B:30:0x01a4), top: B:70:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(final long r8, @org.jetbrains.annotations.NotNull final java.lang.String r10, final boolean r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.api.i.b(long, java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:7))(0)|8|56|(2:10|(2:12|(4:14|15|43|(3:45|50|51)(2:46|47))(2:20|21))(2:22|23))(6:24|25|26|27|28|(2:30|31)(1:32))|33|34|54|35|38|39|(2:41|42)|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0208, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0289 A[Catch: Exception -> 0x0080, CancellationException -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0084, Exception -> 0x0080, blocks: (B:15:0x0078, B:45:0x0289, B:46:0x0292, B:47:0x029e, B:23:0x00ec, B:33:0x01db, B:38:0x020b, B:25:0x00f9, B:27:0x0119), top: B:56:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0292 A[Catch: Exception -> 0x0080, CancellationException -> 0x0084, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0084, Exception -> 0x0080, blocks: (B:15:0x0078, B:45:0x0289, B:46:0x0292, B:47:0x029e, B:23:0x00ec, B:33:0x01db, B:38:0x020b, B:25:0x00f9, B:27:0x0119), top: B:56:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.Nullable final java.lang.String r7, @org.jetbrains.annotations.Nullable final java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9, final boolean r10) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.api.i.c(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }
}
