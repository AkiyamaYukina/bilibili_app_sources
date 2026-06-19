package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$collectHalfHistoriesGraph$1;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/q.class */
public final /* synthetic */ class q implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusInteractVideoService f100002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f100003b;

    public /* synthetic */ q(TheseusInteractVideoService theseusInteractVideoService, MutableSharedFlow mutableSharedFlow) {
        this.f100002a = theseusInteractVideoService;
        this.f100003b = mutableSharedFlow;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return TheseusInteractVideoService$collectHalfHistoriesGraph$1.AnonymousClass1.invokeSuspend$lambda$1(this.f100002a, this.f100003b, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue(), ((Long) obj4).longValue(), ((Integer) obj5).intValue());
    }
}
