package com.bilibili.search2.main;

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
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$observeScreenSizeChange$1.class */
final class SearchRightSideManager$observeScreenSizeChange$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final ComponentActivity $this_observeScreenSizeChange;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRightSideManager$observeScreenSizeChange$1(ComponentActivity componentActivity, Continuation<? super SearchRightSideManager$observeScreenSizeChange$1> continuation) {
        super(2, continuation);
        this.$this_observeScreenSizeChange = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, ComponentActivity componentActivity, Configuration configuration) {
        producerScope.trySend-JP2dKIU(Boolean.valueOf(com.bilibili.search2.component.e.g(componentActivity)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ComponentActivity componentActivity, Consumer consumer) {
        componentActivity.removeOnConfigurationChangedListener(consumer);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchRightSideManager$observeScreenSizeChange$1 searchRightSideManager$observeScreenSizeChange$1 = new SearchRightSideManager$observeScreenSizeChange$1(this.$this_observeScreenSizeChange, continuation);
        searchRightSideManager$observeScreenSizeChange$1.L$0 = obj;
        return searchRightSideManager$observeScreenSizeChange$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.core.util.Consumer, com.bilibili.search2.main.K] */
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
            final ComponentActivity componentActivity = this.$this_observeScreenSizeChange;
            final ?? r02 = new Consumer(producerScope, componentActivity) { // from class: com.bilibili.search2.main.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope f86716a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComponentActivity f86717b;

                {
                    this.f86716a = producerScope;
                    this.f86717b = componentActivity;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj2) {
                    SearchRightSideManager$observeScreenSizeChange$1.invokeSuspend$lambda$0(this.f86716a, this.f86717b, (Configuration) obj2);
                }
            };
            componentActivity.addOnConfigurationChangedListener(r02);
            final ComponentActivity componentActivity2 = this.$this_observeScreenSizeChange;
            Function0 function0 = new Function0(componentActivity2, r02) { // from class: com.bilibili.search2.main.L

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ComponentActivity f86718a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final K f86719b;

                {
                    this.f86718a = componentActivity2;
                    this.f86719b = r02;
                }

                public final Object invoke() {
                    return SearchRightSideManager$observeScreenSizeChange$1.invokeSuspend$lambda$1(this.f86718a, this.f86719b);
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
