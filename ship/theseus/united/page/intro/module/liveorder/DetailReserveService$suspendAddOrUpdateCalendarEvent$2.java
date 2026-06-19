package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.calendar.BiliCalendar;
import com.bilibili.lib.calendar.EventBuilder;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$suspendAddOrUpdateCalendarEvent$2.class */
final class DetailReserveService$suspendAddOrUpdateCalendarEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final l $reserveCalendarInfo;
    int label;
    final DetailReserveService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReserveService$suspendAddOrUpdateCalendarEvent$2(l lVar, DetailReserveService detailReserveService, Continuation<? super DetailReserveService$suspendAddOrUpdateCalendarEvent$2> continuation) {
        super(2, continuation);
        this.$reserveCalendarInfo = lVar;
        this.this$0 = detailReserveService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailReserveService$suspendAddOrUpdateCalendarEvent$2(this.$reserveCalendarInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long lBoxLong;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        l lVar = this.$reserveCalendarInfo;
        DetailReserveService detailReserveService = this.this$0;
        String str = lVar.f100543e;
        long jCheckCalendarEventByBusinessId = BiliCalendar.checkCalendarEventByBusinessId(detailReserveService.f100493a, str);
        FragmentActivity fragmentActivity = detailReserveService.f100493a;
        EventBuilder title = new EventBuilder(fragmentActivity).defaultEvent().setBusinessId(str).setTitle(lVar.f100539a);
        long j7 = 1000;
        EventBuilder reminder = title.setStartTime(lVar.f100540b * j7).setEndTime(lVar.f100541c * j7).setDescription(lVar.f100542d).setReminder(true, CollectionsKt.mutableListOf(new Integer[]{Boxing.boxInt(0)}));
        try {
            if (jCheckCalendarEventByBusinessId > 0) {
                lBoxLong = Boxing.boxLong(BiliCalendar.updateCalendarEvent(fragmentActivity, reminder));
            } else {
                BiliCalendar.addCalendarEvent(fragmentActivity, reminder);
                DetailReserveService.d(detailReserveService, true);
                lBoxLong = Unit.INSTANCE;
            }
        } catch (Exception e7) {
            defpackage.a.b("[theseus-united-DetailReserveService$suspendAddOrUpdateCalendarEvent$2-invokeSuspend] ", O4.d.a("EditCalendar: ", e7.getCause()), "DetailReserveService$suspendAddOrUpdateCalendarEvent$2-invokeSuspend");
            lBoxLong = Unit.INSTANCE;
        }
        return lBoxLong;
    }
}
