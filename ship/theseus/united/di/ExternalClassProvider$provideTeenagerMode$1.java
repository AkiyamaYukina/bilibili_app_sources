package com.bilibili.ship.theseus.united.di;

import com.bilibili.teenagersmode.TeenagersMode;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideTeenagerMode$1.class */
final class ExternalClassProvider$provideTeenagerMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $teenagerMode;
    Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideTeenagerMode$1$a.class */
    public static final class a implements TeenagersMode.OnTeenagersModeChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableStateFlow<Boolean> f98771a;

        public a(MutableStateFlow<Boolean> mutableStateFlow) {
            this.f98771a = mutableStateFlow;
        }

        @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
        public final void onStateChange(boolean z6, boolean z7) {
            this.f98771a.setValue(Boolean.valueOf(z6));
        }

        @Override // com.bilibili.teenagersmode.TeenagersMode.OnTeenagersModeChangeListener
        public final void onTeenagerModePageShow(boolean z6) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideTeenagerMode$1$b.class */
    public static final class b implements com.bilibili.lib.coroutineextension.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f98772a;

        public b(a aVar) {
            this.f98772a = aVar;
        }

        public final void invoke() {
            TeenagersMode.getInstance().unregisterListener(this.f98772a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalClassProvider$provideTeenagerMode$1(MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super ExternalClassProvider$provideTeenagerMode$1> continuation) {
        super(2, continuation);
        this.$teenagerMode = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExternalClassProvider$provideTeenagerMode$1(this.$teenagerMode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.lib.coroutineextension.j bVar;
        com.bilibili.lib.coroutineextension.j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = new a(this.$teenagerMode);
            TeenagersMode.getInstance().registerListener(aVar);
            bVar = new b(aVar);
            try {
                this.L$0 = bVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                bVar.invoke();
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
                bVar = jVar2;
            } catch (Throwable th2) {
                th = th2;
                bVar = jVar;
                bVar.invoke();
                throw th;
            }
        }
        com.bilibili.lib.coroutineextension.j jVar3 = bVar;
        jVar = bVar;
        throw new KotlinNothingValueException();
    }
}
