package com.bilibili.mini.player.common.manager;

import Aj.f;
import android.app.Application;
import androidx.annotation.MainThread;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import uh0.C8732a;
import uh0.C8734c;
import vh0.AbstractC8809a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/c.class */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f66064b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f66065a = e.f66066b;

    @MainThread
    public final void a(@NotNull C8734c c8734c) {
        e eVar = this.f66065a;
        eVar.getClass();
        C8734c c8734c2 = e.f66076m;
        if (Intrinsics.areEqual(c8734c2, c8734c)) {
            BLog.i("MiniPlayerManager", "commit a same request to mini player manager");
            return;
        }
        BiliCardPlayerScene.stop$default(((C8732a) e.f66070f.getValue()).f127866a, false, 1, (Object) null);
        boolean z6 = !Intrinsics.areEqual(c8734c2 != null ? c8734c2.f127868b : null, c8734c.f127868b);
        C8734c c8734c3 = e.f66076m;
        AbstractC8809a abstractC8809a = c8734c3 != null ? c8734c3.f127873g : null;
        if (c8734c2 != null) {
            e.a(z6);
        } else {
            Lazy lazy = Aj.f.p;
            f.a.a().b("MiniPlayer");
        }
        e.f66076m = c8734c;
        e.f66068d = true;
        Job job = e.f66077n;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = e.f66078o;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        e.f66077n = BuildersKt.launch$default(eVar, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerManagerDelegate$startPlay$1(z6, abstractC8809a, c8734c, null), 3, (Object) null);
    }

    @NotNull
    public final Application b() {
        this.f66065a.getClass();
        return e.f66069e;
    }

    public final int c() {
        this.f66065a.getClass();
        return BiliCardPlayerScene.prepareForShare$default(((C8732a) e.f66070f.getValue()).f127866a, false, 1, (Object) null);
    }
}
