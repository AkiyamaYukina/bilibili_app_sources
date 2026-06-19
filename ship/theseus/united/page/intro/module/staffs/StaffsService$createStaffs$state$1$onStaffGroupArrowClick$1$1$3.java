package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3.class */
public final class StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final StaffsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3(StaffsService staffsService, Continuation<? super StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = staffsService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(StaffsService staffsService, boolean z6) {
        return ((A) staffsService.f101831F.getValue()).c();
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final StaffsService staffsService = this.this$0;
            BackActionRepository backActionRepository = staffsService.f101846p;
            Function1<? super Boolean, Boolean> function1 = new Function1(staffsService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final StaffsService f101783a;

                {
                    this.f101783a = staffsService;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$3.invokeSuspend$lambda$0(this.f101783a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
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
