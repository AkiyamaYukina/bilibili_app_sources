package com.bilibili.ship.theseus.ugc.playercontainer;

import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCActionDelegate$fullscreen2Story$1.class */
public final class UGCActionDelegate$fullscreen2Story$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $actionType;
    final boolean $backToStory;
    int label;
    final UGCActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCActionDelegate$fullscreen2Story$1(UGCActionDelegate uGCActionDelegate, boolean z6, String str, Continuation<? super UGCActionDelegate$fullscreen2Story$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCActionDelegate;
        this.$backToStory = z6;
        this.$actionType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UGCActionDelegate uGCActionDelegate, boolean z6, String str) {
        uGCActionDelegate.f98256x.d();
        uGCActionDelegate.f98256x.a(str, z6);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCActionDelegate$fullscreen2Story$1(this.this$0, this.$backToStory, this.$actionType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final UGCActionDelegate uGCActionDelegate = this.this$0;
            StoryTransitionAnimService storyTransitionAnimService = uGCActionDelegate.f98225A;
            final boolean z6 = this.$backToStory;
            final String str = this.$actionType;
            Function0 function0 = new Function0(uGCActionDelegate, z6, str) { // from class: com.bilibili.ship.theseus.ugc.playercontainer.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UGCActionDelegate f98345a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f98346b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f98347c;

                {
                    this.f98345a = uGCActionDelegate;
                    this.f98346b = z6;
                    this.f98347c = str;
                }

                public final Object invoke() {
                    return UGCActionDelegate$fullscreen2Story$1.invokeSuspend$lambda$0(this.f98345a, this.f98346b, this.f98347c);
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
