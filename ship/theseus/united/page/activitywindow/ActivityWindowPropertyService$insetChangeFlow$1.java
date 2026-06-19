package com.bilibili.ship.theseus.united.page.activitywindow;

import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$insetChangeFlow$1.class */
final class ActivityWindowPropertyService$insetChangeFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Pair<? extends WindowInsetsControllerCompat, ? extends Integer>>, Continuation<? super Unit>, Object> {
    final WindowInsetsControllerCompat $this_insetChangeFlow;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWindowPropertyService$insetChangeFlow$1(WindowInsetsControllerCompat windowInsetsControllerCompat, Continuation<? super ActivityWindowPropertyService$insetChangeFlow$1> continuation) {
        super(2, continuation);
        this.$this_insetChangeFlow = windowInsetsControllerCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, WindowInsetsControllerCompat windowInsetsControllerCompat, int i7) {
        BLog.i("ActivityWindowPropertyService$insetChangeFlow$1-invokeSuspend$lambda$0", "[theseus-united-ActivityWindowPropertyService$insetChangeFlow$1-invokeSuspend$lambda$0] windows inset change");
        ChannelsKt.trySendBlocking(producerScope, new Pair(windowInsetsControllerCompat, Integer.valueOf(i7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(WindowInsetsControllerCompat windowInsetsControllerCompat, WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        windowInsetsControllerCompat.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivityWindowPropertyService$insetChangeFlow$1 activityWindowPropertyService$insetChangeFlow$1 = new ActivityWindowPropertyService$insetChangeFlow$1(this.$this_insetChangeFlow, continuation);
        activityWindowPropertyService$insetChangeFlow$1.L$0 = obj;
        return activityWindowPropertyService$insetChangeFlow$1;
    }

    public final Object invoke(ProducerScope<? super Pair<WindowInsetsControllerCompat, Integer>> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, com.bilibili.ship.theseus.united.page.activitywindow.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ?? r02 = new WindowInsetsControllerCompat.OnControllableInsetsChangedListener(producerScope) { // from class: com.bilibili.ship.theseus.united.page.activitywindow.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope f98869a;

                {
                    this.f98869a = producerScope;
                }

                @Override // androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsControllerCompat windowInsetsControllerCompat, int i8) {
                    ActivityWindowPropertyService$insetChangeFlow$1.invokeSuspend$lambda$0(this.f98869a, windowInsetsControllerCompat, i8);
                }
            };
            this.$this_insetChangeFlow.addOnControllableInsetsChangedListener(r02);
            final WindowInsetsControllerCompat windowInsetsControllerCompat = this.$this_insetChangeFlow;
            Function0 function0 = new Function0(windowInsetsControllerCompat, r02) { // from class: com.bilibili.ship.theseus.united.page.activitywindow.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WindowInsetsControllerCompat f98870a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i f98871b;

                {
                    this.f98870a = windowInsetsControllerCompat;
                    this.f98871b = r02;
                }

                public final Object invoke() {
                    return ActivityWindowPropertyService$insetChangeFlow$1.invokeSuspend$lambda$1(this.f98870a, this.f98871b);
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
