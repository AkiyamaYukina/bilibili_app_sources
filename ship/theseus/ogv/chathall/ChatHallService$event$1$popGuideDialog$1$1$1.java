package com.bilibili.ship.theseus.ogv.chathall;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$event$1$popGuideDialog$1$1$1.class */
public final class ChatHallService$event$1$popGuideDialog$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ChatHallPopDialog $dialog;
    int label;
    final ChatHallService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$event$1$popGuideDialog$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$event$1$popGuideDialog$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final ChatHallPopDialog $dialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatHallPopDialog chatHallPopDialog, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$dialog = chatHallPopDialog;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$dialog, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Dialog, com.bilibili.ship.theseus.ogv.chathall.ChatHallPopDialog, tv.danmaku.bili.widget.BaseDialog] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ?? r02 = this.$dialog;
                this.label = 1;
                r02.show();
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                r02.setOnDismissListener(new i(cancellableContinuationImpl));
                cancellableContinuationImpl.invokeOnCancellation(new j(r02));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    result = Unit.INSTANCE;
                }
                if (result == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$event$1$popGuideDialog$1$1$1(ChatHallService chatHallService, ChatHallPopDialog chatHallPopDialog, Continuation<? super ChatHallService$event$1$popGuideDialog$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = chatHallService;
        this.$dialog = chatHallPopDialog;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatHallService$event$1$popGuideDialog$1$1$1(this.this$0, this.$dialog, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f91711i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dialog, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
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
