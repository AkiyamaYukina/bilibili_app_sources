package com.bilibili.player.tangram.basic;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl.class */
public final class QualityPreferenceProviderImpl implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f79294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f79295b = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f79296c = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public l f79297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public c f79298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79299f;

    public QualityPreferenceProviderImpl(@NotNull c cVar) {
        this.f79294a = StateFlowKt.MutableStateFlow(cVar);
    }

    @Nullable
    public final a a() {
        return (a) this.f79296c.getValue();
    }

    @Override // com.bilibili.player.tangram.basic.g
    public final void b(@NotNull c cVar, @Nullable c cVar2) {
        c cVarG = cVar2;
        if (cVar2 == null) {
            cVarG = g();
        }
        this.f79298e = cVarG;
        this.f79294a.setValue(cVar);
        defpackage.a.b("[tangram-basic-QualityPreferenceProviderImpl-setPrioritizedQualityPreference] ", "set prioritized quality to " + cVar + ", restore to " + this.f79298e, "QualityPreferenceProviderImpl-setPrioritizedQualityPreference");
    }

    @Override // com.bilibili.player.tangram.basic.g
    @Nullable
    public final c c() {
        return this.f79298e != null ? (c) this.f79294a.getValue() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.c r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl.d(com.bilibili.player.tangram.basic.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.player.tangram.basic.g
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.l r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.QualityPreferenceProviderImpl.e(com.bilibili.player.tangram.basic.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.g
    @NotNull
    public final c g() {
        return (c) this.f79294a.getValue();
    }
}
