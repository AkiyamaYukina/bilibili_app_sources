package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.internal.StabilityInferred;
import bl0.C5115a;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import com.bilibili.ogv.secondary.C5524e;
import javax.inject.Inject;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/C.class */
@StabilityInferred(parameters = 0)
public final class C implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.e f72725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5115a f72726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f72728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C5524e f72729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final q f72730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Fl0.c f72731g;

    @NotNull
    public final MutableStateFlow<MoreLoadingState> h = StateFlowKt.MutableStateFlow(MoreLoadingState.IDLE);

    @Inject
    public C(@NotNull com.bilibili.ogv.secondary.api.e eVar, @NotNull C5115a c5115a, @NotNull String str, @NotNull String str2, @NotNull C5524e c5524e, @NotNull q qVar, @NotNull Fl0.c cVar) {
        this.f72725a = eVar;
        this.f72726b = c5115a;
        this.f72727c = str;
        this.f72728d = str2;
        this.f72729e = c5524e;
        this.f72730f = qVar;
        this.f72731g = cVar;
    }

    @Override // com.bilibili.ogv.secondary.part.D
    @NotNull
    public final MutableStateFlow<MoreLoadingState> a() {
        return this.h;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.bilibili.ogv.secondary.part.D
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.C.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
