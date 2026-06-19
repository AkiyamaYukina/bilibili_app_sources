package com.bilibili.search2.main;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$init$4.class */
final class SearchRightSideManager$init$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6042i $fragmentManager;
    int label;
    final M this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.main.SearchRightSideManager$init$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$init$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final C6042i $fragmentManager;
        boolean Z$0;
        int label;
        final M this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(M m7, C6042i c6042i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = m7;
            this.$fragmentManager = c6042i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$fragmentManager, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Exception {
            BiliMainSearchResultFragment biliMainSearchResultFragmentD;
            ConstraintLayout constraintLayout;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            this.this$0.f86726g = z6;
            BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF = this.$fragmentManager.f();
            if ((biliMainSearchSuggestFragmentF == null || !biliMainSearchSuggestFragmentF.isVisible()) && z6 && (biliMainSearchResultFragmentD = this.$fragmentManager.d()) != null && biliMainSearchResultFragmentD.isVisible()) {
                C6042i c6042i = this.$fragmentManager;
                OH.e eVar = c6042i.f86836b;
                if (eVar != null && (constraintLayout = ((M) eVar.b).f86722c) != null) {
                    constraintLayout.setVisibility(0);
                }
                cJ.u uVar = c6042i.f86837c;
                if (uVar != null) {
                    uVar.invoke();
                }
            } else {
                this.$fragmentManager.g();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRightSideManager$init$4(M m7, C6042i c6042i, Continuation<? super SearchRightSideManager$init$4> continuation) {
        super(2, continuation);
        this.this$0 = m7;
        this.$fragmentManager = c6042i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchRightSideManager$init$4(this.this$0, this.$fragmentManager, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliMainSearchActivity biliMainSearchActivity = this.this$0.f86721b.get();
            if (biliMainSearchActivity != null) {
                this.this$0.getClass();
                Flow flowCallbackFlow = FlowKt.callbackFlow(new SearchRightSideManager$observeScreenSizeChange$1(biliMainSearchActivity, null));
                if (flowCallbackFlow != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$fragmentManager, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCallbackFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
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
