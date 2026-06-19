package com.bilibili.studio.videocompile.internal.sdk.meicam;

import Dl0.h;
import J3.B1;
import J3.C1;
import LA0.d;
import LA0.i;
import android.os.Handler;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;
import com.bilibili.studio.videocompile.IBVideoCompileLogger;
import com.bilibili.studio.videocompile.define.BVideoCompileBizConfig;
import com.bilibili.studio.videocompile.define.BVideoCompileCancelFrom;
import com.bilibili.studio.videocompile.define.BVideoCompileRetryType;
import com.bilibili.studio.videocompile.util.BVideoCompileUtil;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/g.class */
public final class g implements i, OA0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BVideoCompileBizConfig f108779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StreamingContext f108780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Timeline f108781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f108782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f108783e = LazyKt.lazy(new B1(9));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f108784f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f108785g;

    @NotNull
    public final QA0.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f108786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f108787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.inline.widgetV3.c f108788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f108789l;

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.studio.videocompile.internal.sdk.meicam.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [QA0.c, java.lang.Object] */
    public g(@NotNull BVideoCompileBizConfig bVideoCompileBizConfig, @NotNull StreamingContext streamingContext, @NotNull Timeline timeline) {
        this.f108779a = bVideoCompileBizConfig;
        this.f108780b = streamingContext;
        this.f108781c = timeline;
        ?? obj = new Object();
        obj.f19718c = -1;
        this.h = obj;
        this.f108786i = LazyKt.lazy(new C1(8));
        ?? obj2 = new Object();
        obj2.f108764a = timeline;
        obj2.f108765b = streamingContext;
        this.f108787j = obj2;
        this.f108788k = new com.bilibili.app.comm.list.common.inline.widgetV3.c(this, 2);
        this.f108789l = new h(this, 3);
    }

    public static final void e(g gVar, d.b bVar, BVideoCompileBizConfig bVideoCompileBizConfig, String str, boolean z6, int i7, String str2, boolean z7) {
        if (!Intrinsics.areEqual(bVideoCompileBizConfig.getActionID(), str)) {
            OA0.b.b(gVar, "recordIllegalCallback " + i7 + " " + str);
            bVar.g(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, str == null ? "" : str, null);
            return;
        }
        if (i7 == 0) {
            gVar.f108782d = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(gA0.a.c), (CoroutineContext) null, (CoroutineStart) null, new MeicamVideoCompiler$setCompileCallback$dealCompileFinishCallback$1(gVar, bVar, z7, null), 3, (Object) null);
        } else if (i7 == 1) {
            BVideoCompileUtil.deleteFile(gVar.f108779a.getOutputFilePath());
            bVar.g(301, "sdk internal cancel", null);
            OA0.b.b(gVar, "sdk internal cancel -> mapping code is 301 errorInfo: " + str2);
        } else if (i7 != 11) {
            BVideoCompileUtil.deleteFile(gVar.f108779a.getOutputFilePath());
            if (z6 && gVar.f108779a.getEnableAutoRetryWithSoftWareEncode() && !gVar.f108785g) {
                bVar.onCompileRetryed(BVideoCompileRetryType.HardwareEncodingError);
                LA0.d dVar = LA0.d.f14467l;
                if (dVar == null) {
                    QA0.a.b("please call BVideoCompiler.init() first!!!", null);
                    IBVideoCompileLogger iBVideoCompileLogger = QA0.b.f19715a;
                    if (iBVideoCompileLogger != null) {
                        iBVideoCompileLogger.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
                    }
                    throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
                }
                dVar.g(BVideoCompileCancelFrom.InternalRetryByHardwareEncodingError, false);
                gVar.f108785g = true;
                ((Handler) gVar.f108783e.getValue()).postDelayed(gVar.f108788k, 1200L);
            } else {
                int i8 = i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? i7 + 330 : 305 : 304 : 303 : 302;
                bVar.g(i8, str2, null);
                StringBuilder sb = new StringBuilder("montage errorCode is ");
                C4690e.a(i7, i8, " mapping code is ", " errorInfo: ", sb);
                sb.append(str2);
                OA0.b.b(gVar, sb.toString());
            }
        } else {
            bVar.onCompileRetryed(BVideoCompileRetryType.HardwareEncodingError);
            OA0.b.a(gVar, "sdk internal retry。 retryType: " + str2);
        }
        LA0.d dVar2 = LA0.d.f14467l;
        if (dVar2 == null) {
            QA0.a.b("please call BVideoCompiler.init() first!!!", null);
            IBVideoCompileLogger iBVideoCompileLogger2 = QA0.b.f19715a;
            if (iBVideoCompileLogger2 != null) {
                iBVideoCompileLogger2.e("BCutVideoCompile>>BVideoCompileProxy INSTANCE", "please call BVideoCompiler.init() first!!!");
            }
            throw new IllegalStateException("please call BVideoCompiler.init() first!!!");
        }
        if (!Intrinsics.areEqual(dVar2.d().getConfig("video_compile_module.use_auto_mode_to_change_video_bit_depth", "true"), "true")) {
            OA0.b.c(gVar, "resetVideoBitDepth:VIDEO_RESOLUTION_BIT_DEPTH_8_BIT");
            gVar.f108781c.changeVideoBitDepth(0);
        } else if (gVar.f108779a.getHdrConfig().getEnableHDR() && gVar.f108779a.getEnableOperatingRate()) {
            OA0.b.c(gVar, "resetVideoBitDepth:VIDEO_RESOLUTION_BIT_DEPTH_AUTO");
            gVar.f108781c.changeVideoBitDepth(2);
        }
    }

    @Override // LA0.i
    @NotNull
    public final a c() {
        return this.f108787j;
    }

    public final void d(boolean z6) {
        boolean zB = b();
        OA0.b.c(this, "cancel:isVideoCompiling=" + zB + ",needStop=" + z6);
        Job job = this.f108782d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Lazy lazy = this.f108783e;
        ((Handler) lazy.getValue()).removeCallbacks(this.f108789l);
        ((Handler) lazy.getValue()).removeCallbacks(this.f108788k);
        if (zB && z6) {
            this.f108780b.stop(4);
        }
    }

    @Override // OA0.a
    @NotNull
    public final String getClassTag() {
        return "MeicamVideoCompiler";
    }
}
