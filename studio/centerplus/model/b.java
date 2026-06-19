package com.bilibili.studio.centerplus.model;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/b.class */
public final class b implements Function0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModLoadFrom f105143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f105146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.studio.centerplus.util.e> f105147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SafeContinuation f105148f;

    public b(ModLoadFrom modLoadFrom, String str, String str2, boolean z6, Ref.ObjectRef objectRef, SafeContinuation safeContinuation) {
        this.f105143a = modLoadFrom;
        this.f105144b = str;
        this.f105145c = str2;
        this.f105146d = z6;
        this.f105147e = objectRef;
        this.f105148f = safeContinuation;
    }

    public final Object invoke() {
        com.bilibili.studio.centerplus.util.e eVar;
        AtomicBoolean atomicBoolean;
        boolean z6 = this.f105146d;
        ModLoadFrom modLoadFrom = this.f105143a;
        String str = this.f105144b;
        String str2 = this.f105145c;
        boolean zB = CenterPlusRepository.b(modLoadFrom, str, str2, z6, false);
        BLog.ifmt("CenterPlusRepository", "loadModResource...ModStateInspector...poolName = " + str + ", modName = " + str2 + ", modResAvailable = " + zB, new Object[0]);
        if (zB && (eVar = (com.bilibili.studio.centerplus.util.e) this.f105147e.element) != null && (atomicBoolean = eVar.f105293e) != null && atomicBoolean.compareAndSet(true, false)) {
            Result.Companion companion = Result.Companion;
            this.f105148f.resumeWith(Result.constructor-impl(Boolean.TRUE));
        }
        return Boolean.valueOf(zB);
    }
}
