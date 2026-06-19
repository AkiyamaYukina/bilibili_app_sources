package com.bilibili.ship.theseus.ugc.intro.upcenter;

import android.animation.ValueAnimator;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2.class */
public final class UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ValueAnimator $expandAnim;
    final int $index;
    final UgcUpCenterUIComponent.b $state;
    final AppCompatTextView $this_apply;
    final UgcUpCenterUIComponent.c $viewItem;
    int label;
    final UgcUpCenterUIComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        final ValueAnimator $expandAnim;
        final int $index;
        final UgcUpCenterUIComponent.b $state;
        final UgcUpCenterUIComponent.c $viewItem;
        int label;
        final UgcUpCenterUIComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcUpCenterUIComponent ugcUpCenterUIComponent, int i7, UgcUpCenterUIComponent.c cVar, UgcUpCenterUIComponent.b bVar, ValueAnimator valueAnimator, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcUpCenterUIComponent;
            this.$index = i7;
            this.$viewItem = cVar;
            this.$state = bVar;
            this.$expandAnim = valueAnimator;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$index, this.$viewItem, this.$state, this.$expandAnim, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.f97526c.tryEmit(new UgcUpCenterUIComponent.a.e(this.$index, this.$viewItem.f97543a));
            if (!this.$state.f97535a) {
                UgcUpCenterUIComponent.AnonymousClass2.AnonymousClass3.AnonymousClass1.invokeSuspend$onClickExpand(this.$expandAnim, this.this$0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2(AppCompatTextView appCompatTextView, UgcUpCenterUIComponent ugcUpCenterUIComponent, int i7, UgcUpCenterUIComponent.c cVar, UgcUpCenterUIComponent.b bVar, ValueAnimator valueAnimator, Continuation<? super UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2> continuation) {
        super(2, continuation);
        this.$this_apply = appCompatTextView;
        this.this$0 = ugcUpCenterUIComponent;
        this.$index = i7;
        this.$viewItem = cVar;
        this.$state = bVar;
        this.$expandAnim = valueAnimator;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpCenterUIComponent$bindToView$2$3$1$4$tabView$1$2(this.$this_apply, this.this$0, this.$index, this.$viewItem, this.$state, this.$expandAnim, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowA = UIComponentExtKt.a(this.$this_apply);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$index, this.$viewItem, this.$state, this.$expandAnim, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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
