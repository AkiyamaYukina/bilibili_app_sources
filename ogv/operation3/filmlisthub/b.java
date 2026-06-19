package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/b.class */
public final class b implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f71090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<Unit> f71091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<l> f71092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FilmListHubPageModel f71093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Toaster f71094e;

    public b(l lVar, KomponentScope<? super Unit> komponentScope, MutableState<l> mutableState, FilmListHubPageModel filmListHubPageModel, Toaster toaster) {
        this.f71090a = lVar;
        this.f71091b = komponentScope;
        this.f71092c = mutableState;
        this.f71093d = filmListHubPageModel;
        this.f71094e = toaster;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        Unit unit = Unit.INSTANCE;
        VertexContext context = komponentScope.getContext();
        FilmListHubPageModel filmListHubPageModel = this.f71093d;
        return komponentScope.__setContent(new a(unit, context, komponentScope, this.f71090a, this.f71091b, this.f71092c, filmListHubPageModel, this.f71094e));
    }
}
