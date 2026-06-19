package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$fullscreen2Story$1.class */
public final class CheesePlayerActionDelegateImpl$fullscreen2Story$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $backToStory;
    int label;
    final CheesePlayerActionDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePlayerActionDelegateImpl$fullscreen2Story$1(CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl, boolean z6, Continuation<? super CheesePlayerActionDelegateImpl$fullscreen2Story$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePlayerActionDelegateImpl;
        this.$backToStory = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl, boolean z6) {
        cheesePlayerActionDelegateImpl.f90370m.d();
        cheesePlayerActionDelegateImpl.f90370m.a("4", z6);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePlayerActionDelegateImpl$fullscreen2Story$1(this.this$0, this.$backToStory, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.this$0;
            StoryTransitionAnimService storyTransitionAnimService = cheesePlayerActionDelegateImpl.f90373p;
            final boolean z6 = this.$backToStory;
            Function0 function0 = new Function0(cheesePlayerActionDelegateImpl, z6) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheesePlayerActionDelegateImpl f90391a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f90392b;

                {
                    this.f90391a = cheesePlayerActionDelegateImpl;
                    this.f90392b = z6;
                }

                public final Object invoke() {
                    return CheesePlayerActionDelegateImpl$fullscreen2Story$1.invokeSuspend$lambda$0(this.f90391a, this.f90392b);
                }
            };
            this.label = 1;
            if (storyTransitionAnimService.a(function0, true, this) == coroutine_suspended) {
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
