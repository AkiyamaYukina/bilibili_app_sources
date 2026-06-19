package com.bilibili.playerbizcommonv2.widget.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/U.class */
public final /* synthetic */ class U implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f83154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f83155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f83156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W f83158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f83159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f83160g;

    public /* synthetic */ U(Function1 function1, X x6, Function0 function0, boolean z6, W w7, b0 b0Var, Function0 function02) {
        this.f83154a = function1;
        this.f83155b = x6;
        this.f83156c = function0;
        this.f83157d = z6;
        this.f83158e = w7;
        this.f83159f = b0Var;
        this.f83160g = function02;
    }

    public final Object invoke() {
        Unit unit;
        X x6 = this.f83155b;
        this.f83154a.invoke(x6.f83174g);
        boolean zBooleanValue = ((Boolean) this.f83156c.invoke()).booleanValue();
        boolean z6 = this.f83157d;
        W w7 = this.f83158e;
        if (zBooleanValue) {
            if (z6) {
                w7.f83163a.invoke();
            }
            unit = Unit.INSTANCE;
        } else {
            b0 b0Var = this.f83159f;
            if (!w7.e(x6, b0Var.f83195a, b0Var.f83197c, b0Var.f83196b)) {
                this.f83160g.invoke();
            }
            if (z6) {
                w7.f83163a.invoke();
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
