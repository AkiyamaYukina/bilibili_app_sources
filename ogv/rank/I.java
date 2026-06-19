package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/I.class */
public final class I implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f71846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<Unit> f71847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<T> f71848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PageUiService f71849d;

    public I(T t7, KomponentScope<? super Unit> komponentScope, MutableState<T> mutableState, PageUiService pageUiService) {
        this.f71846a = t7;
        this.f71847b = komponentScope;
        this.f71848c = mutableState;
        this.f71849d = pageUiService;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new H(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f71846a, this.f71847b, this.f71848c, this.f71849d));
    }
}
