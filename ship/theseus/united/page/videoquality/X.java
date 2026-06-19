package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/X.class */
public final /* synthetic */ class X implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusPlayerQualityService f103844a;

    public /* synthetic */ X(TheseusPlayerQualityService theseusPlayerQualityService) {
        this.f103844a = theseusPlayerQualityService;
    }

    public final Object invoke() {
        TheseusPlayerQualityService theseusPlayerQualityService = this.f103844a;
        BuildersKt.launch$default(theseusPlayerQualityService.f103775b, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayerQualityService$2$1(theseusPlayerQualityService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
