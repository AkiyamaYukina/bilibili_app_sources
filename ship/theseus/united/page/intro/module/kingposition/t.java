package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/t.class */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f100477b;

    public /* synthetic */ t(Object obj, int i7) {
        this.f100476a = i7;
        this.f100477b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f100476a) {
            case 0:
                KingPositionService kingPositionService = (KingPositionService) this.f100477b;
                sh1.o.c(kingPositionService.f100372b, kingPositionService.f100356F, kingPositionService.f100357G, (String) null, (String) null);
                break;
            default:
                APMRecorder aPMRecorder = (APMRecorder) this.f100477b;
                APMRecorder.Companion companion = APMRecorder.Companion;
                aPMRecorder.c();
                break;
        }
    }
}
