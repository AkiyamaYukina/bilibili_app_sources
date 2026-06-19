package com.bilibili.playset.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/b.class */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f84289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f84290e;

    public /* synthetic */ b(int i7, int i8, Object obj, Object obj2, Function function) {
        this.f84286a = i8;
        this.f84288c = obj;
        this.f84289d = function;
        this.f84290e = obj2;
        this.f84287b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f84286a) {
            case 0:
                num.intValue();
                d.a(RecomposeScopeImplKt.updateChangedFlags(this.f84287b | 1), composer, (com.bilibili.playset.detail.data.h) this.f84288c, this.f84289d, (Function1) this.f84290e);
                break;
            default:
                num.getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84287b | 1);
                com.bilibili.ship.theseus.ogv.media.c.a((PlayerToastVo) this.f84288c, this.f84289d, (Modifier) this.f84290e, composer, iUpdateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }
}
