package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import Di0.C1602f;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2;
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
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2.class */
final class OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UIComponent.b<ComposeView> $viewEntry;
    private Object L$0;
    int label;
    final t this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2$1.class */
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

        /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UIComponent.b<ComposeView> $viewEntry;
        int label;
        final t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UIComponent.b<ComposeView> bVar, t tVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$viewEntry = bVar;
            this.this$0 = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public static final Unit invokeSuspend$lambda$0(t tVar, Composer composer, int i7) {
            if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(168192176, i7, -1, "com.bilibili.ship.theseus.ogv.intro.limitedtimefree.OgvLimitedTimeFreeTicketsComposeContainerComponent.bindToView.<anonymous>.<anonymous>.<anonymous> (OgvLimitedTimeFreeTicketsComponentB.kt:65)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer);
                O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                r.b(tVar.f93276a, composer, 0);
                composer.endNode();
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
            final t tVar = this.this$0;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(168192176, true, new Function2(tVar) { // from class: com.bilibili.ship.theseus.ogv.intro.limitedtimefree.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final t f93275a;

                {
                    this.f93275a = tVar;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2.AnonymousClass2.invokeSuspend$lambda$0(this.f93275a, (Composer) obj2, iIntValue);
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2(UIComponent.b<ComposeView> bVar, t tVar, Continuation<? super OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.$viewEntry = bVar;
        this.this$0 = tVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2 ogvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2 = new OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2(this.$viewEntry, this.this$0, continuation);
        ogvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2.L$0 = obj;
        return ogvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2;
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
