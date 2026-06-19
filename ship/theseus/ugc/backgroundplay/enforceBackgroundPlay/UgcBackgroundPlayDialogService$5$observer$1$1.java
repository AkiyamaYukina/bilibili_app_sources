package com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay;

import androidx.lifecycle.Lifecycle;
import com.bilibili.playerbizcommonv2.widget.background.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$5$observer$1$1.class */
public final class UgcBackgroundPlayDialogService$5$observer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Lifecycle.Event $event;
    int label;
    final UgcBackgroundPlayDialogService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$5$observer$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/enforceBackgroundPlay/UgcBackgroundPlayDialogService$5$observer$1$1$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Boolean> {
        public AnonymousClass1(Object obj) {
            super(0, obj, UgcBackgroundPlayDialogService.class, "matchTrigger", "matchTrigger()Z", 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x027a, code lost:
        
            if (kotlin.time.Duration.compareTo-LRDsOJo(r0, kotlin.time.DurationKt.toDuration(((java.lang.Number) com.bilibili.playerbizcommonv2.widget.background.g.f82321q.getValue()).longValue(), kotlin.time.DurationUnit.SECONDS)) > 0) goto L67;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x023c  */
        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean m9268invoke() {
            /*
                Method dump skipped, instruction units count: 653
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.backgroundplay.enforceBackgroundPlay.UgcBackgroundPlayDialogService$5$observer$1$1.AnonymousClass1.m9268invoke():java.lang.Boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcBackgroundPlayDialogService$5$observer$1$1(UgcBackgroundPlayDialogService ugcBackgroundPlayDialogService, Lifecycle.Event event, Continuation<? super UgcBackgroundPlayDialogService$5$observer$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcBackgroundPlayDialogService;
        this.$event = event;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcBackgroundPlayDialogService$5$observer$1$1(this.this$0, this.$event, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            g gVarB = this.this$0.b();
            Lifecycle.Event event = this.$event;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (gVarB.f(event, anonymousClass1, this) == coroutine_suspended) {
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
