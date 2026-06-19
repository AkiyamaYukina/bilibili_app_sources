package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.ship.theseus.united.page.tab.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1.class */
final class IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Flow<Boolean> $selectedFlow;
    final j.a $vm;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final j.a $vm;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$vm, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            j.a aVar = this.$vm;
            if (z6 != aVar.f103196b) {
                aVar.f103196b = z6;
                aVar.notifyPropertyChanged(550);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1(Flow<Boolean> flow, j.a aVar, Continuation<? super IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1> continuation) {
        super(1, continuation);
        this.$selectedFlow = flow;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new IntroductionTabPageProvider$provide$1$1$newTabUIComponent$1(this.$selectedFlow, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flow = this.$selectedFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$vm, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
