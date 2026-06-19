package com.bilibili.ship.theseus.united.di;

import com.bilibili.app.comm.restrict.RestrictedMode;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideLessonMode$1.class */
final class ExternalClassProvider$provideLessonMode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $lessonMode;
    Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideLessonMode$1$a.class */
    public static final class a implements RestrictedMode.OnStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableStateFlow<Boolean> f98769a;

        public a(MutableStateFlow<Boolean> mutableStateFlow) {
            this.f98769a = mutableStateFlow;
        }

        public final void onChanged(boolean z6) {
            this.f98769a.setValue(Boolean.valueOf(z6));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/ExternalClassProvider$provideLessonMode$1$b.class */
    public static final class b implements com.bilibili.lib.coroutineextension.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f98770a;

        public b(a aVar) {
            this.f98770a = aVar;
        }

        public final void invoke() {
            RestrictedMode.unregisterLessonsChangeListener("player", this.f98770a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalClassProvider$provideLessonMode$1(MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super ExternalClassProvider$provideLessonMode$1> continuation) {
        super(2, continuation);
        this.$lessonMode = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExternalClassProvider$provideLessonMode$1(this.$lessonMode, continuation);
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
            a aVar = new a(this.$lessonMode);
            RestrictedMode.registerLessonsChangeListener("player", aVar);
            bVar = new b(aVar);
            try {
                this.L$0 = bVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                jVar = bVar;
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
                bVar = jVar2;
            } catch (Throwable th2) {
                th = th2;
                jVar.invoke();
                throw th;
            }
        }
        com.bilibili.lib.coroutineextension.j jVar3 = bVar;
        jVar = bVar;
        throw new KotlinNothingValueException();
    }
}
