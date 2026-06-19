package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.calendar.BiliCalendar;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderUIComponentService$create$1.class */
public final class OgvReserveReminderUIComponentService$create$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $reserved;
    final OgvReserveReminderVo $vo;
    Object L$0;
    int label;
    final OgvReserveReminderUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvReserveReminderUIComponentService$create$1(MutableStateFlow<Boolean> mutableStateFlow, OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService, OgvReserveReminderVo ogvReserveReminderVo, Continuation<? super OgvReserveReminderUIComponentService$create$1> continuation) {
        super(2, continuation);
        this.$reserved = mutableStateFlow;
        this.this$0 = ogvReserveReminderUIComponentService;
        this.$vo = ogvReserveReminderVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvReserveReminderUIComponentService$create$1(this.$reserved, this.this$0, this.$vo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableStateFlow<Boolean> mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<Boolean> mutableStateFlow2 = this.$reserved;
            OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService = this.this$0;
            OgvReserveReminderVo.CalendarInfo calendarInfo = this.$vo.f93396d;
            String str = calendarInfo != null ? calendarInfo.f93405e : null;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            FragmentActivity fragmentActivity = ogvReserveReminderUIComponentService.f93386b;
            if (str2.length() == 0) {
                obj = Boxing.boxBoolean(false);
            } else {
                try {
                } catch (Exception e7) {
                    defpackage.a.b("[theseus-ogv-OgvReserveReminderUIComponentService-checkCalendarReserved] ", C4496a.a("ReserveReminder checkCalendar: ", e7.getMessage()), "OgvReserveReminderUIComponentService-checkCalendarReserved");
                    z6 = false;
                }
                if (BiliCalendar.hasCalendarPermission(fragmentActivity)) {
                    if (BiliCalendar.checkCalendarEventByBusinessId(fragmentActivity, str2) <= 0) {
                        z6 = false;
                    }
                    obj = Boxing.boxBoolean(z6);
                } else {
                    obj = Boxing.boxBoolean(false);
                }
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow = mutableStateFlow2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableStateFlow.setValue(obj);
        return Unit.INSTANCE;
    }
}
