package com.bilibili.playerbizcommonv2.danmaku.input;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80987a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f80989c;

    public /* synthetic */ f(g gVar, boolean z6) {
        this.f80989c = gVar;
        this.f80988b = z6;
    }

    public /* synthetic */ f(boolean z6, Function0 function0) {
        this.f80988b = z6;
        this.f80989c = function0;
    }

    public final Object invoke() {
        switch (this.f80987a) {
            case 0:
                g gVar = (g) this.f80989c;
                return new com.bilibili.playerbizcommonv2.danmaku.input.widget.h(gVar, gVar.f80990a, gVar.f80994e, this.f80988b);
            default:
                if (this.f80988b) {
                    ((Function0) this.f80989c).invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
