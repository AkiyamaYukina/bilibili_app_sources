package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.content.Context;
import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$initCheeseBottomView$1$1.class */
final class CheeseBottomContainerService$initCheeseBottomView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final n $it;
    final ViewGroup $viewGroup;
    int label;
    final CheeseBottomContainerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$initCheeseBottomView$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$initCheeseBottomView$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
        final ViewGroup $viewGroup;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewGroup viewGroup, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewGroup = viewGroup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewGroup, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<? super Unit> continuation) {
            return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewGroup.addView(((UIComponent.ViewEntry) this.L$0).getRoot());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$initCheeseBottomView$1$1(n nVar, CheeseBottomContainerService cheeseBottomContainerService, ViewGroup viewGroup, Continuation<? super CheeseBottomContainerService$initCheeseBottomView$1$1> continuation) {
        super(2, continuation);
        this.$it = nVar;
        this.this$0 = cheeseBottomContainerService;
        this.$viewGroup = viewGroup;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$initCheeseBottomView$1$1(this.$it, this.this$0, this.$viewGroup, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            n nVar = this.$it;
            CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
            d dVar = new d(new d.a(nVar, cheeseBottomContainerService.f89039q.f100022c, cheeseBottomContainerService.f89040r.f102939c));
            Context context = cheeseBottomContainerService.f89026c;
            ViewGroup viewGroup = this.$viewGroup;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(viewGroup, null);
            this.label = 1;
            if (UIComponentKt.b(dVar, context, viewGroup, anonymousClass1, this, 4) == coroutine_suspended) {
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
