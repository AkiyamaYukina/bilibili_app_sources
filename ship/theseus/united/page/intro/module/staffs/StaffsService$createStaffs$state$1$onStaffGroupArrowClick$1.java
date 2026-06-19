package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1.class */
public final class StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final StaffsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1(StaffsService staffsService, Continuation<? super StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1> continuation) {
        super(2, continuation);
        this.this$0 = staffsService;
    }

    private static final Unit invokeSuspend$lambda$0(StaffsService staffsService, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1(staffsService, null));
        cVar.b(new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2(staffsService, null));
        cVar.b(new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3(staffsService, null));
        cVar.b(new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$4(staffsService, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StaffsService staffsService = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(staffsService, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
