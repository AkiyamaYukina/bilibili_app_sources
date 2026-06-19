package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.operation.UnitedActivityComposeContainerComponent$bindToView$2;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/UnitedActivityComposeContainerComponent$bindToView$2.class */
final class UnitedActivityComposeContainerComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UIComponent.b<ComposeView> $viewEntry;
    private Object L$0;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.operation.UnitedActivityComposeContainerComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/UnitedActivityComposeContainerComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UIComponent.b<ComposeView> $viewEntry;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UIComponent.b<ComposeView> bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewEntry = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$viewEntry, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.operation.UnitedActivityComposeContainerComponent$bindToView$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.operation.UnitedActivityComposeContainerComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/UnitedActivityComposeContainerComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UIComponent.b<ComposeView> $viewEntry;
        int label;
        final g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UIComponent.b<ComposeView> bVar, g gVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$viewEntry = bVar;
            this.this$0 = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public static final Unit invokeSuspend$lambda$0(g gVar, Composer composer, int i7) {
            if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-329823623, i7, -1, "com.bilibili.ship.theseus.ogv.operation.UnitedActivityComposeContainerComponent.bindToView.<anonymous>.<anonymous>.<anonymous> (FloatOperationContainer.kt:145)");
                }
                b.a(gVar.f94121a, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$viewEntry, this.this$0, continuation);
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
            ComposeView composeView = (ComposeView) this.$viewEntry.a;
            final g gVar = this.this$0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-329823623, true, new Function2(gVar) { // from class: com.bilibili.ship.theseus.ogv.operation.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final g f94120a;

                {
                    this.f94120a = gVar;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return UnitedActivityComposeContainerComponent$bindToView$2.AnonymousClass2.invokeSuspend$lambda$0(this.f94120a, (Composer) obj2, iIntValue);
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedActivityComposeContainerComponent$bindToView$2(UIComponent.b<ComposeView> bVar, g gVar, Continuation<? super UnitedActivityComposeContainerComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$viewEntry = bVar;
        this.this$0 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedActivityComposeContainerComponent$bindToView$2 unitedActivityComposeContainerComponent$bindToView$2 = new UnitedActivityComposeContainerComponent$bindToView$2(this.$viewEntry, this.this$0, continuation);
        unitedActivityComposeContainerComponent$bindToView$2.L$0 = obj;
        return unitedActivityComposeContainerComponent$bindToView$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$viewEntry, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$viewEntry, this.this$0, null), 3, (Object) null);
    }
}
