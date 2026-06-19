package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import dv0.K0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/k.class */
@StabilityInferred(parameters = 0)
public final class k extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<K0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusWebUIComponent f102003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f102004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f102005n;

    public k() {
        throw null;
    }

    public k(String str, com.bilibili.ogv.infra.jsb.d dVar, TheseusWebUIComponent.a aVar, Map map, h hVar) {
        this.f102003l = new TheseusWebUIComponent(str, dVar, aVar, map, null, null, hVar, 32);
        this.f102004m = LazyKt.lazy(new GS.i(this, 3));
        this.f102005n = true;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        Object objA = this.f102003l.a((K0) viewBinding, continuation);
        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objA = Unit.INSTANCE;
        }
        return objA;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f102003l.f(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f102005n;
    }
}
