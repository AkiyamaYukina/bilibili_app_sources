package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/u.class */
public final /* synthetic */ class C5456u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68160a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f68161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f68163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function f68164e;

    public /* synthetic */ C5456u(C5437a.d dVar, Modifier modifier, Function2 function2, int i7) {
        this.f68163d = dVar;
        this.f68161b = modifier;
        this.f68164e = function2;
        this.f68162c = i7;
    }

    public /* synthetic */ C5456u(Function1 function1, Function0 function0, Modifier modifier, int i7) {
        this.f68163d = function1;
        this.f68164e = function0;
        this.f68161b = modifier;
        this.f68162c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f68160a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68162c | 1);
                B.a((C5437a.d) this.f68163d, this.f68161b, this.f68164e, composer, iUpdateChangedFlags);
                break;
            default:
                kntr.app.article.publish.ui.component.dialog.e.a(RecomposeScopeImplKt.updateChangedFlags(this.f68162c | 1), composer, this.f68161b, this.f68164e, (Function1) this.f68163d);
                break;
        }
        return Unit.INSTANCE;
    }
}
