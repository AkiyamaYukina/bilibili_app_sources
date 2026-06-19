package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/g.class */
public final class C5787g {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final java.lang.String r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.NotNull final androidx.compose.ui.text.TextStyle r28, final long r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r31, long r32, final long r34, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5787g.a(java.lang.String, java.lang.String, androidx.compose.ui.text.TextStyle, long, androidx.compose.ui.text.TextStyle, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @NotNull
    public static final Modifier b(@NotNull Modifier modifier, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i7) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1742864115, i7, -1, "com.bilibili.playerbizcommonv2.danmaku.setting.v2.clickableWithoutRipple (DanmakuSettingsCompose.kt:99)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Object objMutableInteractionSource = objRememberedValue;
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objMutableInteractionSource);
        }
        Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(modifier, (MutableInteractionSource) objMutableInteractionSource, null, false, null, null, function0, 28, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierM1182clickableO2vRcR0$default;
    }

    @NotNull
    public static final Modifier c(@NotNull Modifier modifier, final boolean z6, final long j7) {
        return DrawModifierKt.drawWithContent(modifier, new Function1(z6, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f81424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f81425b;

            {
                this.f81424a = z6;
                this.f81425b = j7;
            }

            public final Object invoke(Object obj) {
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                contentDrawScope.drawContent();
                if (this.f81424a) {
                    DrawScope.m2903drawLineNGM6Ib0$default(contentDrawScope, this.f81425b, Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(contentDrawScope.mo1270toPx0680j_4(r.f81461a))) << 32)), Offset.m2447constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() >> 32)))) << 32)), contentDrawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(1)), 0, null, 0.0f, null, 0, 496, null);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Composable
    public static final int d(@ColorRes int i7, @Nullable Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809458134, i8, -1, "com.bilibili.playerbizcommonv2.danmaku.setting.v2.getColor (DanmakuSettingsCompose.kt:106)");
        }
        int color = ContextCompat.getColor((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), i7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return color;
    }
}
