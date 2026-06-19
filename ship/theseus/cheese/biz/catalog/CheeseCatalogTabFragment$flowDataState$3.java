package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.airbnb.lottie.LottieAnimationView;
import fu0.C7200w;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$3.class */
final class CheeseCatalogTabFragment$flowDataState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment$flowDataState$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final CheeseCatalogTabFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogTabFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            LottieAnimationView lottieAnimationView;
            LottieAnimationView lottieAnimationView2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
            cheeseCatalogTabFragment.f89139k = z6;
            bu0.c cVar = cheeseCatalogTabFragment.f89141m;
            cVar.f57022c = z6;
            cVar.notifyItemChanged(cVar.f57021b, "playing_change");
            if (z6) {
                C7200w c7200w = cheeseCatalogTabFragment.f89138j;
                if (c7200w != null && (lottieAnimationView2 = c7200w.f119622b) != null) {
                    lottieAnimationView2.playAnimation();
                }
            } else {
                C7200w c7200w2 = cheeseCatalogTabFragment.f89138j;
                if (c7200w2 != null && (lottieAnimationView = c7200w2.f119622b) != null) {
                    lottieAnimationView.pauseAnimation();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$flowDataState$3(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super CheeseCatalogTabFragment$flowDataState$3> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$flowDataState$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
            MutableStateFlow<Boolean> mutableStateFlow = cheeseCatalogTabFragment.f89131b.f89129y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCatalogTabFragment, null);
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
