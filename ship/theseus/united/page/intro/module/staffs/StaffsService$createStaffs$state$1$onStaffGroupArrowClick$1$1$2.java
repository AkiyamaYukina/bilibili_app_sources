package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2.class */
public final class StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final StaffsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        int label;
        final StaffsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsService staffsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((A) this.this$0.f101831F.getValue()).j(!this.this$0.f101850t.f());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2(StaffsService staffsService, Continuation<? super StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = staffsService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StaffsService staffsService = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = staffsService.f101850t.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(staffsService, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
