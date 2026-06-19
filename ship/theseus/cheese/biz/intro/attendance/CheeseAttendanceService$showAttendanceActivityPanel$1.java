package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceService$showAttendanceActivityPanel$1.class */
final class CheeseAttendanceService$showAttendanceActivityPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    Object L$0;
    Object L$1;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceService$showAttendanceActivityPanel$1(l lVar, String str, Continuation<? super CheeseAttendanceService$showAttendanceActivityPanel$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$url = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceService$showAttendanceActivityPanel$1(this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                gVar = gVar2;
                th = th;
                gVar.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        l lVar = this.this$0;
        gVar = lVar.f89328g;
        String str2 = this.$url;
        gVar.f("CheeseAttendanceService");
        try {
            WebFloatLayerService webFloatLayerService = lVar.f89327f;
            this.L$0 = gVar;
            this.L$1 = "CheeseAttendanceService";
            this.label = 1;
            if (WebFloatLayerService.f(webFloatLayerService, str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "CheeseAttendanceService";
            gVar.j(str);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            str = "CheeseAttendanceService";
            gVar.j(str);
            throw th;
        }
    }
}
