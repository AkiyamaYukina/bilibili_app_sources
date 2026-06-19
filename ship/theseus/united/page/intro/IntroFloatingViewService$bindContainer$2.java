package com.bilibili.ship.theseus.united.page.intro;

import android.content.Context;
import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroFloatingViewService$bindContainer$2.class */
public final class IntroFloatingViewService$bindContainer$2 extends SuspendLambda implements Function2<UIComponent<?>, Continuation<? super Unit>, Object> {
    final ViewGroup $container;
    Object L$0;
    int label;
    final IntroFloatingViewService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroFloatingViewService$bindContainer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroFloatingViewService$bindContainer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
        final ViewGroup $container;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewGroup viewGroup, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$container = viewGroup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$container, continuation);
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
            this.$container.addView(((UIComponent.ViewEntry) this.L$0).getRoot());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroFloatingViewService$bindContainer$2(ViewGroup viewGroup, IntroFloatingViewService introFloatingViewService, Continuation<? super IntroFloatingViewService$bindContainer$2> continuation) {
        super(2, continuation);
        this.$container = viewGroup;
        this.this$0 = introFloatingViewService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntroFloatingViewService$bindContainer$2 introFloatingViewService$bindContainer$2 = new IntroFloatingViewService$bindContainer$2(this.$container, this.this$0, continuation);
        introFloatingViewService$bindContainer$2.L$0 = obj;
        return introFloatingViewService$bindContainer$2;
    }

    public final Object invoke(UIComponent<?> uIComponent, Continuation<? super Unit> continuation) {
        return create(uIComponent, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent uIComponent = (UIComponent) this.L$0;
            this.$container.removeAllViews();
            if (uIComponent != null) {
                Context context = this.this$0.f100033a;
                ViewGroup viewGroup = this.$container;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(viewGroup, null);
                this.label = 1;
                if (UIComponentKt.b(uIComponent, context, viewGroup, anonymousClass1, this, 4) == coroutine_suspended) {
                    return coroutine_suspended;
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
