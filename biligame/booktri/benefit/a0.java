package com.bilibili.biligame.booktri.benefit;

import Jm0.C2423A;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.bili.fullscreen.state.M1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/a0.class */
public final /* synthetic */ class a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f62356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f62357c;

    public /* synthetic */ a0(int i7, Object obj, Function function) {
        this.f62355a = i7;
        this.f62356b = function;
        this.f62357c = obj;
    }

    public final Object invoke() {
        switch (this.f62355a) {
            case 0:
                this.f62356b.invoke((UserCouponsDetailBean) this.f62357c);
                break;
            case 1:
                C2423A c2423a = (C2423A) this.f62357c;
                this.f62356b.invoke(c2423a.f11501b.getValue(), c2423a.f11502c.getValue(), Long.valueOf(c2423a.h));
                break;
            default:
                this.f62356b.invoke(Boolean.valueOf(((M1) this.f62357c).c));
                break;
        }
        return Unit.INSTANCE;
    }
}
