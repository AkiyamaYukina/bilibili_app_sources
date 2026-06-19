package com.bilibili.ship.theseus.united.page.error;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$1.class */
final class TheseusPlayErrorStateService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final j this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$1$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f99583a;

            static {
                int[] iArr = new int[PlayerAvailability.values().length];
                try {
                    iArr[PlayerAvailability.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f99583a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayErrorStateService$1(j jVar, Continuation<? super TheseusPlayErrorStateService$1> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayErrorStateService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = jVar.f99631b.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
