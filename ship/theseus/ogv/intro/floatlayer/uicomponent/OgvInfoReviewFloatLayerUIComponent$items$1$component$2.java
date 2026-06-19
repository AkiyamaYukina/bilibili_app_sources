package com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wl0.InterfaceC8899a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/OgvInfoReviewFloatLayerUIComponent$items$1$component$2.class */
final class OgvInfoReviewFloatLayerUIComponent$items$1$component$2 extends SuspendLambda implements Function2<Fragment, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<InterfaceC8899a> $availableFragment;
    Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/OgvInfoReviewFloatLayerUIComponent$items$1$component$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f93013a;

        public a(c cVar) {
            this.f93013a = cVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f93013a.f93018a.f93030e.invoke((wl0.c) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvInfoReviewFloatLayerUIComponent$items$1$component$2(Ref.ObjectRef<InterfaceC8899a> objectRef, c cVar, Continuation<? super OgvInfoReviewFloatLayerUIComponent$items$1$component$2> continuation) {
        super(2, continuation);
        this.$availableFragment = objectRef;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvInfoReviewFloatLayerUIComponent$items$1$component$2 ogvInfoReviewFloatLayerUIComponent$items$1$component$2 = new OgvInfoReviewFloatLayerUIComponent$items$1$component$2(this.$availableFragment, this.this$0, continuation);
        ogvInfoReviewFloatLayerUIComponent$items$1$component$2.L$0 = obj;
        return ogvInfoReviewFloatLayerUIComponent$items$1$component$2;
    }

    public final Object invoke(Fragment fragment, Continuation<? super Unit> continuation) {
        return create(fragment, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ActivityResultCaller activityResultCaller = (Fragment) this.L$0;
                if (!(activityResultCaller instanceof InterfaceC8899a)) {
                    return Unit.INSTANCE;
                }
                this.$availableFragment.element = activityResultCaller;
                MutableSharedFlow mutableSharedFlowZc = ((InterfaceC8899a) activityResultCaller).zc();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlowZc.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$availableFragment.element = null;
            throw th;
        }
    }
}
