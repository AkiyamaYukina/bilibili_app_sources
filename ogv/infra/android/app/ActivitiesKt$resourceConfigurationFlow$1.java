package com.bilibili.ogv.infra.android.app;

import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import androidx.core.util.Consumer;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/app/ActivitiesKt$resourceConfigurationFlow$1.class */
public final class ActivitiesKt$resourceConfigurationFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Configuration>, Continuation<? super Unit>, Object> {
    final ComponentActivity $this_resourceConfigurationFlow;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitiesKt$resourceConfigurationFlow$1(ComponentActivity componentActivity, Continuation<? super ActivitiesKt$resourceConfigurationFlow$1> continuation) {
        super(2, continuation);
        this.$this_resourceConfigurationFlow = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ComponentActivity componentActivity, Consumer consumer) {
        componentActivity.removeOnConfigurationChangedListener(consumer);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivitiesKt$resourceConfigurationFlow$1 activitiesKt$resourceConfigurationFlow$1 = new ActivitiesKt$resourceConfigurationFlow$1(this.$this_resourceConfigurationFlow, continuation);
        activitiesKt$resourceConfigurationFlow$1.L$0 = obj;
        return activitiesKt$resourceConfigurationFlow$1;
    }

    public final Object invoke(ProducerScope<? super Configuration> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.core.util.Consumer, com.bilibili.ogv.infra.android.app.c] */
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
        ProducerScope producerScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            Configuration configuration = this.$this_resourceConfigurationFlow.getResources().getConfiguration();
            this.L$0 = producerScope2;
            this.label = 1;
            producerScope = producerScope2;
            if (producerScope2.send(configuration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ProducerScope producerScope3 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
        }
        final ProducerScope producerScope4 = producerScope;
        final ?? r02 = new Consumer(producerScope4) { // from class: com.bilibili.ogv.infra.android.app.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProducerScope f67856a;

            {
                this.f67856a = producerScope4;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj2) {
                ChannelsKt.trySendBlocking(this.f67856a, (Configuration) obj2);
            }
        };
        this.$this_resourceConfigurationFlow.addOnConfigurationChangedListener(r02);
        final ComponentActivity componentActivity = this.$this_resourceConfigurationFlow;
        Function0 function0 = new Function0(componentActivity, r02) { // from class: com.bilibili.ogv.infra.android.app.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentActivity f67857a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f67858b;

            {
                this.f67857a = componentActivity;
                this.f67858b = r02;
            }

            public final Object invoke() {
                return ActivitiesKt$resourceConfigurationFlow$1.invokeSuspend$lambda$1(this.f67857a, this.f67858b);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
