package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/k0.class */
public final class k0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/k0$a.class */
    public static final class a implements androidx.compose.ui.window.n {
        @Override // androidx.compose.ui.window.n
        public final long a(y0.g gVar, long j7, LayoutDirection layoutDirection, long j8) {
            return IntOffset.m3940constructorimpl((((long) (gVar.f129545c - ((int) (j8 >> 32)))) << 32) | (((long) (gVar.f129544b - ((int) (j8 & 4294967295L)))) & 4294967295L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Type inference failed for: r0v114, types: [androidx.compose.ui.window.n, java.lang.Object] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r26, androidx.compose.ui.Modifier r27, java.lang.String r28, java.lang.String r29, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.k0.a(java.lang.String, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(String str, Modifier modifier, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1600080550, 6, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualitySwitchUI.<anonymous>.TextDescription (TheseusPlayerQualitySwitchWidget.kt:236)");
        }
        TextKt.m1772Text4IGK_g(str, modifier, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m3586copyp1EtxEg$default(BiliTheme.INSTANCE.getTextStyle(composer, BiliTheme.$stable).getT14(), Color.Companion.m2666getWhite0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer, 48, 3072, 57340);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
