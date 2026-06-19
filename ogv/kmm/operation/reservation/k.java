package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/k.class */
public final class k implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState f68681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f68682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.vippreview.a f68683f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/k$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableState f68685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f68686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.vippreview.a f68687d;

        public a(Modifier modifier, MutableState mutableState, e eVar, com.bilibili.ogv.kmm.operation.vippreview.a aVar) {
            this.f68684a = modifier;
            this.f68685b = mutableState;
            this.f68686c = eVar;
            this.f68687d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(2130683901);
                MutableState mutableState = this.f68685b;
                boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                Object obj3 = objRememberedValue;
                if (objRememberedValue == companion.getEmpty()) {
                    obj3 = f.f68667a;
                    composer.updateRememberedValue(obj3);
                }
                EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) obj3));
                ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, 0, null, 6, null);
                Object objRememberedValue2 = composer.rememberedValue();
                Object obj4 = objRememberedValue2;
                if (objRememberedValue2 == companion.getEmpty()) {
                    obj4 = g.f68668a;
                    composer.updateRememberedValue(obj4);
                }
                AnimatedVisibilityKt.AnimatedVisibility(zBooleanValue, this.f68684a, enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) obj4)), (String) null, ComposableLambdaKt.rememberComposableLambda(-550140956, true, new j(mutableState, this.f68686c, this.f68687d), composer, 54), composer, 200064, 16);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public k(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, MutableState mutableState, e eVar, com.bilibili.ogv.kmm.operation.vippreview.a aVar) {
        this.f68679b = vertexContext;
        this.f68680c = komponentScope;
        this.f68681d = mutableState;
        this.f68682e = eVar;
        this.f68683f = aVar;
        this.f68678a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(k.class);
    }

    public final Object getKey() {
        return this.f68680c.getKey();
    }

    public final Object getState() {
        return this.f68678a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68679b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68681d, this.f68682e, this.f68683f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
