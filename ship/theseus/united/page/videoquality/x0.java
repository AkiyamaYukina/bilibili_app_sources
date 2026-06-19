package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/x0.class */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f103966a;

    public final Object invoke(Object obj) {
        Unit unit;
        if (((Boolean) obj).booleanValue()) {
            y0 y0Var = this.f103966a;
            BuildersKt.launch$default(y0Var.f103987c, (CoroutineContext) null, (CoroutineStart) null, new TheseusQualitySetting$openQualitySettingLayer$1$1(y0Var, null), 3, (Object) null);
            unit = Unit.INSTANCE;
        } else {
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
