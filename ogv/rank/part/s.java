package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/s.class */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72121a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Modifier f72122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f72124d;

    public /* synthetic */ s(int i7, Modifier modifier, Function1 function1) {
        this.f72122b = modifier;
        this.f72124d = function1;
        this.f72123c = i7;
    }

    public /* synthetic */ s(PartReadyUiService partReadyUiService, Modifier modifier, int i7) {
        this.f72124d = partReadyUiService;
        this.f72122b = modifier;
        this.f72123c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f72121a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                ((PartReadyUiService) this.f72124d).a(this.f72122b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f72123c | 1));
                break;
            default:
                kntr.app.tribee.operation.page.p.a(this.f72122b, (Function1) this.f72124d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f72123c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
