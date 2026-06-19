package com.bilibili.ship.theseus.united.page;

import android.view.View;
import com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$attachStateFlow$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$attachStateFlow$1.class */
final class TheseusIntroductionFragment$attachStateFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final View $this_attachStateFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$attachStateFlow$1$a.class */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<Boolean> f98805a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ProducerScope<? super Boolean> producerScope) {
            this.f98805a = producerScope;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f98805a.trySend-JP2dKIU(Boolean.TRUE);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.f98805a.trySend-JP2dKIU(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusIntroductionFragment$attachStateFlow$1(View view, Continuation<? super TheseusIntroductionFragment$attachStateFlow$1> continuation) {
        super(2, continuation);
        this.$this_attachStateFlow = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(View view, a aVar) {
        view.removeOnAttachStateChangeListener(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusIntroductionFragment$attachStateFlow$1 theseusIntroductionFragment$attachStateFlow$1 = new TheseusIntroductionFragment$attachStateFlow$1(this.$this_attachStateFlow, continuation);
        theseusIntroductionFragment$attachStateFlow$1.L$0 = obj;
        return theseusIntroductionFragment$attachStateFlow$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            producerScope.trySend-JP2dKIU(Boxing.boxBoolean(this.$this_attachStateFlow.isAttachedToWindow()));
            final a aVar = new a(producerScope);
            this.$this_attachStateFlow.addOnAttachStateChangeListener(aVar);
            final View view = this.$this_attachStateFlow;
            Function0 function0 = new Function0(view, aVar) { // from class: com.bilibili.ship.theseus.united.page.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f99305a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TheseusIntroductionFragment$attachStateFlow$1.a f99306b;

                {
                    this.f99305a = view;
                    this.f99306b = aVar;
                }

                public final Object invoke() {
                    return TheseusIntroductionFragment$attachStateFlow$1.invokeSuspend$lambda$0(this.f99305a, this.f99306b);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
