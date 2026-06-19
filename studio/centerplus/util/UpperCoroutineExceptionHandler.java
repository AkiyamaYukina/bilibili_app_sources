package com.bilibili.studio.centerplus.util;

import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/UpperCoroutineExceptionHandler.class */
public final class UpperCoroutineExceptionHandler implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineExceptionHandler.Key f105280a = CoroutineExceptionHandler.Key;

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.util.UpperCoroutineExceptionHandler$handleException$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/UpperCoroutineExceptionHandler$handleException$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CoroutineContext $context;
        final Throwable $exception;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoroutineContext coroutineContext, Throwable th, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = coroutineContext;
            this.$exception = th;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$exception, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$context.get(CoroutineName.Key) + ", " + ExceptionsKt.stackTraceToString(this.$exception);
            BLog.e("UpperCoroutineExceptionHandler", str);
            Xz0.d.f28458a.getClass();
            Xz0.d.K("UpperCoroutineExceptionHandler", str);
            return Unit.INSTANCE;
        }
    }

    public final <R> R fold(R r7, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) function2.invoke(r7, this);
    }

    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.a.a(this, key);
    }

    public final CoroutineContext.Key getKey() {
        return this.f105280a;
    }

    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new AnonymousClass1(coroutineContext, th, null), 2, (Object) null);
    }

    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.a.b(this, key);
    }

    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }
}
