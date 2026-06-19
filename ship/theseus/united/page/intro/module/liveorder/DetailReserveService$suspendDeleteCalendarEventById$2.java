package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import com.bilibili.lib.calendar.BiliCalendar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$suspendDeleteCalendarEventById$2.class */
final class DetailReserveService$suspendDeleteCalendarEventById$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $businessId;
    int label;
    final DetailReserveService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReserveService$suspendDeleteCalendarEventById$2(String str, DetailReserveService detailReserveService, Continuation<? super DetailReserveService$suspendDeleteCalendarEventById$2> continuation) {
        super(2, continuation);
        this.$businessId = str;
        this.this$0 = detailReserveService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailReserveService$suspendDeleteCalendarEventById$2(this.$businessId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            String str = this.$businessId;
            DetailReserveService detailReserveService = this.this$0;
            long jCheckCalendarEventByBusinessId = BiliCalendar.checkCalendarEventByBusinessId(detailReserveService.f100493a, str);
            if (jCheckCalendarEventByBusinessId > 0) {
                BiliCalendar.deleteCalendarEventById(detailReserveService.f100493a, jCheckCalendarEventByBusinessId);
                DetailReserveService.d(detailReserveService, false);
                BLog.i("DetailReserveService$suspendDeleteCalendarEventById$2-invokeSuspend", "[theseus-united-DetailReserveService$suspendDeleteCalendarEventById$2-invokeSuspend] " + ("DeleteCalendar find and delete calendar, id: " + str));
            }
        } catch (Exception e7) {
            defpackage.a.b("[theseus-united-DetailReserveService$suspendDeleteCalendarEventById$2-invokeSuspend] ", O4.d.a("DeleteCalendar: ", e7.getCause()), "DetailReserveService$suspendDeleteCalendarEventById$2-invokeSuspend");
        }
        return Unit.INSTANCE;
    }
}
