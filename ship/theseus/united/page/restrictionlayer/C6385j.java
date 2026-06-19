package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/j.class */
public final class C6385j implements y, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6383h f102749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextVo f102750b;

    public C6385j(C6386k c6386k, TextVo textVo) {
        this.f102749a = new C6383h(textVo.l(), c6386k.f102751a, textVo.f102713j);
        this.f102750b = textVo;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.x
    public final Modifier a(Modifier modifier) {
        return this.f102749a.a(modifier);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.y
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i7, boolean z6, int i8, int i9, Map map, ColorProducer colorProducer, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-1593133797);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593133797, i10, i11, "com.bilibili.ship.theseus.united.page.restrictionlayer.CreateOperationText.invoke.<no name provided>.InternalContent (OperationText.kt:83)");
        }
        TextStyle textStyleMerge = ((TextStyle) composer.consume(TextKt.getLocalTextStyle())).merge(textStyle);
        composer.startReplaceGroup(-1993198607);
        ThemeDayNight dayNightTheme = BiliTheme.INSTANCE.getDayNightTheme(composer, BiliTheme.$stable);
        ThemeDayNight themeDayNight = ThemeDayNight.Night;
        TextVo textVo = this.f102750b;
        Integer numO = dayNightTheme == themeDayNight ? textVo.o() : Integer.valueOf(textVo.n());
        long jM2665getUnspecified0d7_KjU = (numO == null || numO.intValue() == 0) ? Color.Companion.m2665getUnspecified0d7_KjU() : ColorKt.Color(numO.intValue());
        composer.endReplaceGroup();
        BasicTextKt.m1510BasicTextCL7eQgs(annotatedString, modifier, TextStyle.m3593mergedA7vx0o$default(textStyleMerge, jM2665getUnspecified0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null), function1, i7, z6, i8, i9, map, colorProducer, null, composer, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), 0, 1024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.y
    @Composable
    public final Brush c(Composer composer, int i7) {
        Integer numB;
        composer.startReplaceGroup(817315948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(817315948, i7, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.CreateOperationText.invoke.<no name provided>.backgroundBrush (OperationText.kt:109)");
        }
        TextVo textVo = this.f102750b;
        GradientColorVo gradientColorVoF = textVo.f();
        if (gradientColorVoF != null && (numB = gradientColorVoF.b()) != null) {
            long jColor = ColorKt.Color(numB.intValue());
            Integer numA = textVo.f().a();
            if (numA != null) {
                Brush brushM2571horizontalGradient8A3gB4$default = Brush.Companion.m2571horizontalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(jColor), Color.m2619boximpl(ColorKt.Color(numA.intValue()))}), 0.0f, 0.0f, 0, 14, (Object) null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return brushM2571horizontalGradient8A3gB4$default;
            }
        }
        Integer numC = BiliTheme.INSTANCE.getDayNightTheme(composer, BiliTheme.$stable) == ThemeDayNight.Night ? textVo.c() : textVo.b();
        if (numC == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        SolidColor solidColor = new SolidColor(ColorKt.Color(numC.intValue()), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return solidColor;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.y
    public final TextVo getData() {
        return this.f102750b;
    }
}
