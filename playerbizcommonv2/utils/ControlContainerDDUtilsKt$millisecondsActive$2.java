package com.bilibili.playerbizcommonv2.utils;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/ControlContainerDDUtilsKt$millisecondsActive$2.class */
final class ControlContainerDDUtilsKt$millisecondsActive$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Function0<Unit> $onClick;
    final IControlContainerService $service;
    final View $this_millisecondsActive;
    final boolean $vibrator;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.ControlContainerDDUtilsKt$millisecondsActive$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/ControlContainerDDUtilsKt$millisecondsActive$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IControlContainerService $service;
        final View $this_millisecondsActive;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.ControlContainerDDUtilsKt$millisecondsActive$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/ControlContainerDDUtilsKt$millisecondsActive$2$2$a.class */
        public static final class a implements ControlContainerVisibleObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f81905a;

            public a(View view) {
                this.f81905a = view;
            }

            public final void onControlContainerVisibleChanged(boolean z6) {
                this.f81905a.setAlpha(z6 ? 1.0f : 0.5f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(View view, IControlContainerService iControlContainerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_millisecondsActive = view;
            this.$service = iControlContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_millisecondsActive, this.$service, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.$this_millisecondsActive.setAlpha(this.$service.isShowing() ? 1.0f : 0.5f);
                aVar = new a(this.$this_millisecondsActive);
                this.$service.registerControlContainerVisible(aVar);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.$service.unregisterControlContainerVisible(aVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    aVar = aVar2;
                    th = th2;
                    this.$service.unregisterControlContainerVisible(aVar);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlContainerDDUtilsKt$millisecondsActive$2(View view, boolean z6, Function0<Unit> function0, IControlContainerService iControlContainerService, Continuation<? super ControlContainerDDUtilsKt$millisecondsActive$2> continuation) {
        super(2, continuation);
        this.$this_millisecondsActive = view;
        this.$vibrator = z6;
        this.$onClick = function0;
        this.$service = iControlContainerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(CoroutineScope coroutineScope, View view, boolean z6, Function0 function0, IControlContainerService iControlContainerService, View view2) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ControlContainerDDUtilsKt$millisecondsActive$2$1$1(view, z6, function0, iControlContainerService, null), 3, (Object) null);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ControlContainerDDUtilsKt$millisecondsActive$2 controlContainerDDUtilsKt$millisecondsActive$2 = new ControlContainerDDUtilsKt$millisecondsActive$2(this.$this_millisecondsActive, this.$vibrator, this.$onClick, this.$service, continuation);
        controlContainerDDUtilsKt$millisecondsActive$2.L$0 = obj;
        return controlContainerDDUtilsKt$millisecondsActive$2;
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
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        final View view = this.$this_millisecondsActive;
        final boolean z6 = this.$vibrator;
        final Function0<Unit> function0 = this.$onClick;
        final IControlContainerService iControlContainerService = this.$service;
        view.setOnClickListener(new View.OnClickListener(coroutineScope, view, z6, function0, iControlContainerService) { // from class: com.bilibili.playerbizcommonv2.utils.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f81908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f81909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f81910c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Function0 f81911d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final IControlContainerService f81912e;

            {
                this.f81908a = coroutineScope;
                this.f81909b = view;
                this.f81910c = z6;
                this.f81911d = function0;
                this.f81912e = iControlContainerService;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ControlContainerDDUtilsKt$millisecondsActive$2.invokeSuspend$lambda$0(this.f81908a, this.f81909b, this.f81910c, this.f81911d, this.f81912e, view2);
            }
        });
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$this_millisecondsActive, this.$service, null), 3, (Object) null);
    }
}
