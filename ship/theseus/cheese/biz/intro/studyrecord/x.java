package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import dv0.K0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/x.class */
@StabilityInferred(parameters = 0)
public final class x extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<K0> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusWebUIComponent f90287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f90288m;

    public x(@NotNull TheseusWebUIComponent theseusWebUIComponent) {
        this.f90287l = theseusWebUIComponent;
        l(0.0f);
        this.f90288m = true;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        Object objA = this.f90287l.a((K0) viewBinding, continuation);
        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objA = Unit.INSTANCE;
        }
        return objA;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f90287l.f(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return this.f90288m;
    }
}
