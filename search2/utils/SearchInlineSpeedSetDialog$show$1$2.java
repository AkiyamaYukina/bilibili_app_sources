package com.bilibili.search2.utils;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/SearchInlineSpeedSetDialog$show$1$2.class */
public final class SearchInlineSpeedSetDialog$show$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $it;
    int label;
    final SearchInlineSpeedSetDialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/SearchInlineSpeedSetDialog$show$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchInlineSpeedSetDialog f88801a;

        public a(SearchInlineSpeedSetDialog searchInlineSpeedSetDialog) {
            this.f88801a = searchInlineSpeedSetDialog;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f88801a.f88800d.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInlineSpeedSetDialog$show$1$2(FragmentActivity fragmentActivity, SearchInlineSpeedSetDialog searchInlineSpeedSetDialog, Continuation<? super SearchInlineSpeedSetDialog$show$1$2> continuation) {
        super(2, continuation);
        this.$it = fragmentActivity;
        this.this$0 = searchInlineSpeedSetDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchInlineSpeedSetDialog$show$1$2(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ScreenAdjustUtilsKt.windowSizeFlow(this.$it));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
