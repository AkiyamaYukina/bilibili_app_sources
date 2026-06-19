package com.bilibili.ogv.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.pegasus.recommendlabel.C5754x;
import com.bilibili.pegasus.recommendlabel.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/e.class */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f72432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f72433d;

    public /* synthetic */ e(int i7, int i8, Object obj, Object obj2) {
        this.f72430a = i8;
        this.f72432c = obj;
        this.f72433d = obj2;
        this.f72431b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f72430a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                j.a((Modifier) this.f72432c, (k) this.f72433d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f72431b | 1));
                break;
            default:
                C5754x.e((f0) this.f72432c, (Function1) this.f72433d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f72431b | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
