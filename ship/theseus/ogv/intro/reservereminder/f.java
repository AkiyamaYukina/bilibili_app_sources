package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvReserveReminderVo f93414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvReserveReminderUIComponentService f93415b;

    public /* synthetic */ f(OgvReserveReminderVo ogvReserveReminderVo, OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService) {
        this.f93414a = ogvReserveReminderVo;
        this.f93415b = ogvReserveReminderUIComponentService;
    }

    public final Object invoke() {
        if (this.f93414a.h) {
            this.f93415b.f93389e.a();
        }
        return Unit.INSTANCE;
    }
}
