package com.bilibili.search2.result.widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/LoadMoreListener$bind$1.class */
final class LoadMoreListener$bind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RecyclerView $recyclerView;
    Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/LoadMoreListener$bind$1$a.class */
    public static final class a implements com.bilibili.lib.coroutineextension.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f88596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f88597b;

        public a(RecyclerView recyclerView, d dVar) {
            this.f88596a = recyclerView;
            this.f88597b = dVar;
        }

        public final void invoke() {
            RecyclerView recyclerView = this.f88596a;
            d dVar = this.f88597b;
            recyclerView.removeOnChildAttachStateChangeListener(dVar);
            recyclerView.removeOnScrollListener(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreListener$bind$1(RecyclerView recyclerView, d dVar, Continuation<? super LoadMoreListener$bind$1> continuation) {
        super(2, continuation);
        this.$recyclerView = recyclerView;
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadMoreListener$bind$1(this.$recyclerView, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.lib.coroutineextension.j aVar;
        Throwable th;
        com.bilibili.lib.coroutineextension.j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            RecyclerView recyclerView = this.$recyclerView;
            d dVar = this.this$0;
            recyclerView.addOnChildAttachStateChangeListener(dVar);
            recyclerView.addOnScrollListener(dVar);
            aVar = new a(recyclerView, dVar);
            try {
                this.L$0 = aVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                jVar = aVar;
                jVar.invoke();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
            jVar = jVar2;
            try {
                ResultKt.throwOnFailure(obj);
                aVar = jVar2;
            } catch (Throwable th3) {
                th = th3;
                jVar.invoke();
                throw th;
            }
        }
        com.bilibili.lib.coroutineextension.j jVar3 = aVar;
        jVar = aVar;
        throw new KotlinNothingValueException();
    }
}
