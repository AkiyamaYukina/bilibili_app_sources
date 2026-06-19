package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$collectHalfHistoriesGraph$1;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/p.class */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusInteractVideoService f100000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f100001b;

    public /* synthetic */ p(TheseusInteractVideoService theseusInteractVideoService, MutableSharedFlow mutableSharedFlow) {
        this.f100000a = theseusInteractVideoService;
        this.f100001b = mutableSharedFlow;
    }

    public final Object invoke() {
        return TheseusInteractVideoService$collectHalfHistoriesGraph$1.AnonymousClass1.invokeSuspend$lambda$0(this.f100000a, this.f100001b);
    }
}
