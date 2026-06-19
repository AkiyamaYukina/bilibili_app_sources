package com.bilibili.ogv.bdesign.tab;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/m.class */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f67478a = Dp.m3880constructorimpl(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f67479b = Dp.m3880constructorimpl(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f67480c = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f67481d = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r16, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r17, long r18, long r20, float r22, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function3 r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2 r24, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r25, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.tab.m.a(int, androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    public static final void b(final int i7, final Function3 function3, final ScrollState scrollState, final Modifier modifier, final long j7, final long j8, final float f7, final Function2 function2, final ComposableLambda composableLambda, Composer composer, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-479201774);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(i7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function3) ? 32 : 16);
        }
        int i11 = i10;
        if ((i8 & 384) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(scrollState) ? 256 : 128);
        }
        int i12 = i11;
        if ((i8 & 3072) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        int i13 = i12;
        if ((i8 & 24576) == 0) {
            i13 = i12 | (composerStartRestartGroup.changed(j7) ? 16384 : 8192);
        }
        int i14 = i13;
        if ((196608 & i8) == 0) {
            i14 = i13 | (composerStartRestartGroup.changed(j8) ? 131072 : 65536);
        }
        int i15 = i14;
        if ((1572864 & i8) == 0) {
            i15 = i14 | (composerStartRestartGroup.changed(f7) ? 1048576 : 524288);
        }
        int i16 = i15;
        if ((i8 & 12582912) == 0) {
            i16 = i15 | (composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304);
        }
        int i17 = i16;
        if ((100663296 & i8) == 0) {
            i17 = i16 | (composerStartRestartGroup.changedInstance(composableLambda) ? 67108864 : 33554432);
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i17) != 38347922, i17 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-479201774, i17, -1, "com.bilibili.ogv.bdesign.tab.XXScrollableTabRowWithSubcomposeImpl (XXScrollableTabRow.kt:69)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1376018515, true, new Function2(scrollState, f7, composableLambda, function2, function3, i7) { // from class: com.bilibili.ogv.bdesign.tab.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ScrollState f67444a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f67445b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ComposableLambda f67446c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function2 f67447d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function3 f67448e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f67449f;

                {
                    this.f67444a = scrollState;
                    this.f67445b = f7;
                    this.f67446c = composableLambda;
                    this.f67447d = function2;
                    this.f67448e = function3;
                    this.f67449f = i7;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0167  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
                    /*
                        Method dump skipped, instruction units count: 422
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.tab.h.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54);
            int i18 = i17 >> 6;
            SurfaceKt.m2090SurfaceT9BRK9s(modifier, null, j7, j8, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i17 >> 9) & 14) | 12582912 | (i18 & 896) | (i18 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, function3, scrollState, modifier, j7, j8, f7, function2, composableLambda, i8) { // from class: com.bilibili.ogv.bdesign.tab.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f67450a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function3 f67451b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ScrollState f67452c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f67453d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f67454e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final long f67455f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final float f67456g;
                public final Function2 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final ComposableLambda f67457i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final int f67458j;

                {
                    this.f67450a = i7;
                    this.f67451b = function3;
                    this.f67452c = scrollState;
                    this.f67453d = modifier;
                    this.f67454e = j7;
                    this.f67455f = j8;
                    this.f67456g = f7;
                    this.h = function2;
                    this.f67457i = composableLambda;
                    this.f67458j = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67458j | 1);
                    Function2 function22 = this.h;
                    ComposableLambda composableLambda2 = this.f67457i;
                    m.b(this.f67450a, this.f67451b, this.f67452c, this.f67453d, this.f67454e, this.f67455f, this.f67456g, function22, composableLambda2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.Modifier c(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier.Companion r8, @org.jetbrains.annotations.NotNull com.bilibili.ogv.bdesign.tab.e r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.bdesign.tab.m.c(androidx.compose.ui.Modifier$Companion, com.bilibili.ogv.bdesign.tab.e, androidx.compose.runtime.Composer):androidx.compose.ui.Modifier");
    }
}
