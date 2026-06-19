package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import fu0.C7200w;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$5.class */
final class CheeseCatalogTabFragment$flowDataState$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment$flowDataState$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final CheeseCatalogTabFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCatalogTabFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            FrameLayout frameLayout;
            FrameLayout frameLayout2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            C7200w c7200w = this.this$0.f89138j;
            if (c7200w != null && (frameLayout2 = c7200w.f119626f) != null) {
                frameLayout2.setPaddingRelative(DimenUtilsKt.dpToPx(i7), frameLayout2.getPaddingTop(), DimenUtilsKt.dpToPx(i7), frameLayout2.getPaddingBottom());
            }
            C7200w c7200w2 = this.this$0.f89138j;
            if (c7200w2 != null && (frameLayout = c7200w2.f119624d) != null) {
                int i8 = i7 - 6;
                frameLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i8), frameLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i8), frameLayout.getPaddingBottom());
            }
            C7200w c7200w3 = this.this$0.f89138j;
            if (c7200w3 != null && (recyclerView = c7200w3.f119623c) != null) {
                recyclerView.setPaddingRelative(DimenUtilsKt.dpToPx(i7), recyclerView.getPaddingTop(), DimenUtilsKt.dpToPx(i7), recyclerView.getPaddingBottom());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$flowDataState$5(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super CheeseCatalogTabFragment$flowDataState$5> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$flowDataState$5(this.this$0, continuation);
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
            StateFlow<Integer> stateFlow = cheeseCatalogTabFragment.h.f100021b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCatalogTabFragment, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
