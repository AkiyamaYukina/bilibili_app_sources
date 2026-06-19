package com.bilibili.ogv.secondary;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/s.class */
public final class s implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f72934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<Unit> f72935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<I> f72936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PageUiService f72937d;

    public s(I i7, KomponentScope<? super Unit> komponentScope, MutableState<I> mutableState, PageUiService pageUiService) {
        this.f72934a = i7;
        this.f72935b = komponentScope;
        this.f72936c = mutableState;
        this.f72937d = pageUiService;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new r(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f72934a, this.f72935b, this.f72936c, this.f72937d));
    }
}
