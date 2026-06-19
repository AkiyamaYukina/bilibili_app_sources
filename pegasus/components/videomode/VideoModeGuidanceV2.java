package com.bilibili.pegasus.components.videomode;

import F3.E6;
import F3.F6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import aq0.W0;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zo0.C9208a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceV2.class */
@StabilityInferred(parameters = 0)
public final class VideoModeGuidanceV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f77184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W0 f77186c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f77188e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f77187d = new Runnable(this) { // from class: com.bilibili.pegasus.components.videomode.j

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoModeGuidanceV2 f77223a;

        {
            this.f77223a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoModeGuidanceV2 videoModeGuidanceV2 = this.f77223a;
            BLog.i("[Pegasus]VideoModeGuidance", "dismiss by time out");
            videoModeGuidanceV2.a();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f77189f = ListExtentionsKt.lazyUnsafe(new E6(9));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f77190g = ListExtentionsKt.lazyUnsafe(new F6(6));

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.pegasus.components.videomode.j] */
    public VideoModeGuidanceV2(@NotNull Fragment fragment, int i7) {
        this.f77184a = fragment;
        this.f77185b = i7;
    }

    public final void a() {
        Job job;
        BLog.i("[Pegasus]VideoModeGuidance", "dismiss video mode guidance.");
        if (Ao0.i.f376a && f()) {
            Ao0.i.a(c().c());
        }
        C9208a.f130340a.getClass();
        if (C9208a.a()) {
            Job job2 = this.f77188e;
            if (job2 != null && job2.isActive() && (job = this.f77188e) != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f77188e = null;
        } else {
            View view = this.f77184a.getView();
            if (view != null) {
                view.removeCallbacks(this.f77187d);
            }
        }
        W0 w02 = this.f77186c;
        if (w02 != null) {
            ViewParent parent = w02.f53910a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                W0 w03 = this.f77186c;
                W0 w04 = w03;
                if (w03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    w04 = null;
                }
                viewGroup.removeView(w04.f53910a);
            }
        }
        f fVar = g.f77220a;
        if (fVar != null) {
            fVar.f77209a.removeVisibleStateChangeListener(fVar.f77216i);
            fVar.b();
            g.f77220a = null;
        }
    }

    public final a b() {
        int i7 = this.f77185b;
        return (i7 == 1 || i7 == 2) ? c().a() : null;
    }

    public final c c() {
        return (c) this.f77190g.getValue();
    }

    public final void d() {
        StringBuilder sb = new StringBuilder("handleClose, triggerWay = ");
        int i7 = this.f77185b;
        sb.append(i7);
        BLog.i("[Pegasus]VideoModeGuidance", sb.toString());
        if (f()) {
            Ao0.i.a(c().b());
        }
        k.a(VideoModeGuideClickArea.CLOSE_BUTTON, i7);
        a();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void e() {
        StringBuilder sb = new StringBuilder("handleGotoSetting, triggerWay = ");
        int i7 = this.f77185b;
        sb.append(i7);
        BLog.i("[Pegasus]VideoModeGuidance", sb.toString());
        BLRouter.routeTo$default(new RouteRequest.Builder("bilibili://pegasus/setting/recommend").extras((Function1) new Object()).build(), (Context) null, 2, (Object) null);
        if (f()) {
            Ao0.i.a(c().b());
        }
        k.a(VideoModeGuideClickArea.OPEN_BUTTON, i7);
        a();
    }

    public final boolean f() {
        return this.f77185b != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.videomode.VideoModeGuidanceV2.g():boolean");
    }
}
