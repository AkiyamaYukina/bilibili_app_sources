package com.bilibili.ogv.operation3.module.hcards2x2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.switchit.i;
import dl0.C6820a;
import java.util.ArrayList;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import ml0.C8011b;
import nl0.C8106C;
import nl0.q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/HCards2x2SupportModule$provide$1$1.class */
final class HCards2x2SupportModule$provide$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<List<i>> $cards$delegate;
    final com.bilibili.ogv.operation3.module.followable.h $createFollowableSeasonModel;
    final C8011b $createOperableModel;
    final a $module;
    final com.bilibili.ogv.operation3.module.switchit.h $switchableModel;
    final KomponentScope<Object> $this_moduleSupport;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.hcards2x2.HCards2x2SupportModule$provide$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/HCards2x2SupportModule$provide$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends com.bilibili.ogv.operation3.module.operablecard.a>, Continuation<? super Unit>, Object> {
        final MutableState<List<i>> $cards$delegate;
        final com.bilibili.ogv.operation3.module.followable.h $createFollowableSeasonModel;
        final C8011b $createOperableModel;
        final com.bilibili.ogv.operation3.module.hcards2x2.a $module;
        final KomponentScope<Object> $this_moduleSupport;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.hcards2x2.HCards2x2SupportModule$provide$1$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/HCards2x2SupportModule$provide$1$1$1$a.class */
        public static final class a implements Function3<Modifier, Composer, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ogv.operation3.module.operablecard.a f71351a;

            public a(com.bilibili.ogv.operation3.module.operablecard.a aVar) {
                this.f71351a = aVar;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                int i7 = iIntValue;
                if ((iIntValue & 6) == 0) {
                    i7 = iIntValue | (composer.changed(modifier) ? 4 : 2);
                }
                if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(506095562, i7, -1, "com.bilibili.ogv.operation3.module.hcards2x2.HCards2x2SupportModule.provide.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HCards2x2SupportModule.kt:58)");
                    }
                    C8106C.b(this.f71351a.f71391a, modifier, 1.76f, 0.0f, composer, ((i7 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ogv.operation3.module.hcards2x2.a aVar, com.bilibili.ogv.operation3.module.followable.h hVar, KomponentScope<Object> komponentScope, C8011b c8011b, MutableState<List<i>> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$module = aVar;
            this.$createFollowableSeasonModel = hVar;
            this.$this_moduleSupport = komponentScope;
            this.$createOperableModel = c8011b;
            this.$cards$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$module, this.$createFollowableSeasonModel, this.$this_moduleSupport, this.$createOperableModel, this.$cards$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(List<com.bilibili.ogv.operation3.module.operablecard.a> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableState<List<i>> mutableState = this.$cards$delegate;
            List<com.bilibili.ogv.operation3.module.operablecard.a> list2 = list;
            com.bilibili.ogv.operation3.module.hcards2x2.a aVar = this.$module;
            com.bilibili.ogv.operation3.module.followable.h hVar = this.$createFollowableSeasonModel;
            KomponentScope<Object> komponentScope = this.$this_moduleSupport;
            C8011b c8011b = this.$createOperableModel;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.bilibili.ogv.operation3.module.operablecard.a aVar2 : list2) {
                C6820a c6820a = aVar.f71354b;
                arrayList.add(new i(new q(aVar2, (c6820a == null || !c6820a.f116485b) ? null : hVar.a(komponentScope, aVar2), ComposableLambdaKt.composableLambdaInstance(506095562, true, new a(aVar2)), null, null, null, 8184), c8011b.a(komponentScope, aVar2, null)));
            }
            mutableState.setValue(arrayList);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCards2x2SupportModule$provide$1$1(com.bilibili.ogv.operation3.module.switchit.h hVar, a aVar, com.bilibili.ogv.operation3.module.followable.h hVar2, KomponentScope<Object> komponentScope, C8011b c8011b, MutableState<List<i>> mutableState, Continuation<? super HCards2x2SupportModule$provide$1$1> continuation) {
        super(2, continuation);
        this.$switchableModel = hVar;
        this.$module = aVar;
        this.$createFollowableSeasonModel = hVar2;
        this.$this_moduleSupport = komponentScope;
        this.$createOperableModel = c8011b;
        this.$cards$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HCards2x2SupportModule$provide$1$1(this.$switchableModel, this.$module, this.$createFollowableSeasonModel, this.$this_moduleSupport, this.$createOperableModel, this.$cards$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> sharedFlowB = this.$switchableModel.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$module, this.$createFollowableSeasonModel, this.$this_moduleSupport, this.$createOperableModel, this.$cards$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowB, anonymousClass1, this) == coroutine_suspended) {
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
