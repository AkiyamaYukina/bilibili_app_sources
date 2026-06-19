package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import dv0.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/D.class */
@StabilityInferred(parameters = 0)
public final class D extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<n0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f101450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101451m;

    public D(@NotNull String str, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f101450l = str;
        this.f101451m = aVar;
        l(0.5625f);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        n0 n0Var = (n0) viewBinding;
        n0Var.f117059c.setText(this.f101450l);
        n0Var.f117058b.setOnClickListener(new com.bilibili.biligame.ui.pointmall.record.D(this, 2));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UnitedSeasonPanelDescComponent$bindContent$3(this, n0Var, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n0.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return false;
    }
}
