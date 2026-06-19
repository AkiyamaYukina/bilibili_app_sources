package com.bilibili.ogv.operation3.module.hcards2x2;

import com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/d.class */
public final class d implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateSwitchableModel$invoke$1 f71371a;

    public d(CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1) {
        this.f71371a = createSwitchableModel$invoke$1;
    }

    public final Object invoke() {
        com.bilibili.ogv.operation3.module.switchit.a aVar = this.f71371a.f71420b;
        if (aVar != null) {
            aVar.invoke();
        }
        return Unit.INSTANCE;
    }
}
