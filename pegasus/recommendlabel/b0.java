package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/b0.class */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78680a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f78681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f78683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f78684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f78685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f78686g;

    public /* synthetic */ b0(f0 f0Var, Function1 function1, Function0 function0, Function0 function02, Function2 function2, int i7) {
        this.f78683d = f0Var;
        this.f78684e = function1;
        this.f78681b = function0;
        this.f78685f = function02;
        this.f78686g = function2;
        this.f78682c = i7;
    }

    public /* synthetic */ b0(com.bilibili.vip.cashier2.hangdown.p pVar, String str, String str2, Function0 function0, Modifier modifier, int i7) {
        this.f78683d = pVar;
        this.f78684e = str;
        this.f78685f = str2;
        this.f78681b = function0;
        this.f78686g = modifier;
        this.f78682c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78680a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f78682c | 1);
                Function0 function0 = (Function0) this.f78685f;
                Function2 function2 = (Function2) this.f78686g;
                RecommendLabelFirstPageKt.k((f0) this.f78683d, (Function1) this.f78684e, this.f78681b, function0, function2, (Composer) obj, iUpdateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f78682c | 1);
                Function0 function02 = this.f78681b;
                Modifier modifier = (Modifier) this.f78686g;
                ((com.bilibili.vip.cashier2.hangdown.p) this.f78683d).b((String) this.f78684e, (String) this.f78685f, function02, modifier, (Composer) obj, iUpdateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
