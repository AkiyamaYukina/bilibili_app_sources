package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.bilibili.pegasus.data.config.GraduationSeasonGuideConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/J.class */
public final /* synthetic */ class J implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76052a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f76053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f76055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f76056e;

    public /* synthetic */ J(GraduationSeasonGuideConfig graduationSeasonGuideConfig, boolean z6, Modifier modifier, int i7) {
        this.f76055d = graduationSeasonGuideConfig;
        this.f76053b = z6;
        this.f76056e = modifier;
        this.f76054c = i7;
    }

    public /* synthetic */ J(boolean z6, Function0 function0, kntr.app.mall.product.details.page.vm.u uVar, int i7) {
        this.f76053b = z6;
        this.f76055d = function0;
        this.f76056e = uVar;
        this.f76054c = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f76052a) {
            case 0:
                num.getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f76054c | 1);
                O.d((GraduationSeasonGuideConfig) this.f76055d, this.f76053b, (Modifier) this.f76056e, composer, iUpdateChangedFlags);
                break;
            default:
                num.intValue();
                kntr.app.mall.product.details.page.ui.floatingLayer.h.a(this.f76053b, (Function0) this.f76055d, (kntr.app.mall.product.details.page.vm.u) this.f76056e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f76054c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
