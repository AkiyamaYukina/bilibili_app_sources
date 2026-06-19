package com.bilibili.ship.theseus.ugc.endpage;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.r;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2.class */
final class UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCHorizontalFullScreenEndPageWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget, Continuation<? super UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2> continuation) {
        super(2, continuation);
        this.this$0 = uGCHorizontalFullScreenEndPageWidget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget) {
        BLog.i("animationListener trigger Expose check");
        bY.c<RecyclerView> cVar = uGCHorizontalFullScreenEndPageWidget.f96526J;
        bY.c<RecyclerView> cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exposeClient");
            cVar2 = null;
        }
        cVar2.h();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        RecyclerView recyclerView = this.this$0.f96523G;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        final UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget = this.this$0;
        Function0 function0 = new Function0(uGCHorizontalFullScreenEndPageWidget) { // from class: com.bilibili.ship.theseus.ugc.endpage.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCHorizontalFullScreenEndPageWidget f96606a;

            {
                this.f96606a = uGCHorizontalFullScreenEndPageWidget;
            }

            public final Object invoke() {
                return UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2.invokeSuspend$lambda$0(this.f96606a);
            }
        };
        this.label = 2;
        if (r.a(recyclerView2, function0, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
