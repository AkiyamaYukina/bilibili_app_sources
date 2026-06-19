package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$DetailScrollComponent$bindToView$2.class */
final class DetailScrollButtonService$DetailScrollComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UIComponent.b<FrameLayout> $viewEntry;
    private Object L$0;
    int label;
    final DetailScrollButtonService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailScrollButtonService$DetailScrollComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$DetailScrollComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UIComponent.b<FrameLayout> $viewEntry;
        int label;
        final DetailScrollButtonService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailScrollButtonService detailScrollButtonService, UIComponent.b<FrameLayout> bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailScrollButtonService;
            this.$viewEntry = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$viewEntry, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            DetailScrollButtonService detailScrollButtonService;
            ViewGroup viewGroup;
            dv0.G g7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DetailScrollButtonService detailScrollButtonService2 = this.this$0;
                    ViewGroup viewGroup2 = (ViewGroup) this.$viewEntry.a;
                    this.label = 1;
                    if (DetailScrollButtonService.a(detailScrollButtonService2, viewGroup2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (g7 != null) {
                    viewGroup.removeView(g7.f116767a);
                    detailScrollButtonService.f100960o = null;
                }
                return Unit.INSTANCE;
            } finally {
                detailScrollButtonService = this.this$0;
                viewGroup = (ViewGroup) this.$viewEntry.a;
                detailScrollButtonService.f100964s = false;
                g7 = detailScrollButtonService.f100960o;
                if (g7 != null) {
                    viewGroup.removeView(g7.f116767a);
                    detailScrollButtonService.f100960o = null;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailScrollButtonService$DetailScrollComponent$bindToView$2(DetailScrollButtonService detailScrollButtonService, UIComponent.b<FrameLayout> bVar, Continuation<? super DetailScrollButtonService$DetailScrollComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = detailScrollButtonService;
        this.$viewEntry = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailScrollButtonService$DetailScrollComponent$bindToView$2 detailScrollButtonService$DetailScrollComponent$bindToView$2 = new DetailScrollButtonService$DetailScrollComponent$bindToView$2(this.this$0, this.$viewEntry, continuation);
        detailScrollButtonService$DetailScrollComponent$bindToView$2.L$0 = obj;
        return detailScrollButtonService$DetailScrollComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$viewEntry, null), 3, (Object) null);
    }
}
