package com.bilibili.ship.theseus.ugc.intro.mhy;

import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService$create$1.class */
public final class UgcStarRailService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final a $starRail;
    final MutableStateFlow<d.C0840d> $stateFlow;
    int label;
    final UgcStarRailService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $starRail;
        final MutableStateFlow<d.C0840d> $stateFlow;
        private Object L$0;
        int label;
        final UgcStarRailService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, MutableStateFlow<d.C0840d> mutableStateFlow, UgcStarRailService ugcStarRailService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$starRail = aVar;
            this.$stateFlow = mutableStateFlow;
            this.this$0 = ugcStarRailService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$starRail, this.$stateFlow, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List mutableList = CollectionsKt.toMutableList(this.$starRail.f97083b);
            a aVar = this.$starRail;
            MutableStateFlow<d.C0840d> mutableStateFlow = this.$stateFlow;
            UgcStarRailService ugcStarRailService = this.this$0;
            int i7 = 0;
            for (Object obj2 : mutableList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                b bVar = (b) obj2;
                if (bVar.f97088e == 0) {
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcStarRailService$create$1$1$1$1(bVar, aVar, mutableStateFlow, ugcStarRailService, null), 3, (Object) null);
                }
                i7++;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcStarRailService$create$1(a aVar, MutableStateFlow<d.C0840d> mutableStateFlow, UgcStarRailService ugcStarRailService, Continuation<? super UgcStarRailService$create$1> continuation) {
        super(1, continuation);
        this.$starRail = aVar;
        this.$stateFlow = mutableStateFlow;
        this.this$0 = ugcStarRailService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcStarRailService$create$1(this.$starRail, this.$stateFlow, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$starRail, this.$stateFlow, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
