package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/f.class */
public final class f implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f72064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<B> f72065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<r> f72066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f72067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f72068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f72069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow<com.bilibili.ogv.rank.api.a> f72070g;
    public final Toaster h;

    /* JADX WARN: Multi-variable type inference failed */
    public f(r rVar, KomponentScope<? super B> komponentScope, MutableState<r> mutableState, l lVar, String str, String str2, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster) {
        this.f72064a = rVar;
        this.f72065b = komponentScope;
        this.f72066c = mutableState;
        this.f72067d = lVar;
        this.f72068e = str;
        this.f72069f = str2;
        this.f72070g = mutableStateFlow;
        this.h = toaster;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new e(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f72064a, this.f72065b, this.f72066c, this.f72067d, this.f72068e, this.f72069f, this.f72070g, this.h));
    }
}
