package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.ThemeDayNight;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/A.class */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SolidColor f102500a = new SolidColor(Color.Companion.m2664getTransparent0d7_KjU(), null);

    @Composable
    public static final void a(@NotNull final y yVar, @NotNull final Modifier modifier, @Nullable AnnotatedString annotatedString, @Nullable TextStyle textStyle, @Nullable Function1<? super TextLayoutResult, Unit> function1, int i7, boolean z6, int i8, int i9, @Nullable Map<String, InlineTextContent> map, @Nullable ColorProducer colorProducer, @Nullable Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ColorProducer colorProducer2;
        Map<String, InlineTextContent> map2;
        int i19;
        Function1<? super TextLayoutResult, Unit> function12;
        AnnotatedString annotatedString2;
        Map<String, InlineTextContent> mapEmptyMap;
        AnnotatedString annotatedString3;
        int i20;
        TextStyle textStyle2;
        int i21;
        ColorProducer colorProducer3;
        Integer numO;
        Integer numO2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1443366925);
        if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(yVar) : composerStartRestartGroup.changedInstance(yVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i22 = i13;
        if ((i10 & 48) == 0) {
            i22 = i13 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        int i23 = i22;
        if ((i10 & 384) == 0) {
            i23 = i22 | 128;
        }
        int i24 = i12 & 4;
        if (i24 != 0) {
            i14 = i23 | 3072;
        } else {
            i14 = i23;
            if ((i10 & 3072) == 0) {
                i14 = i23 | (composerStartRestartGroup.changed(textStyle) ? 2048 : 1024);
            }
        }
        int i25 = i14 | 24576;
        int i26 = i12 & 16;
        if (i26 != 0) {
            i15 = 221184 | i14;
        } else {
            i15 = i25;
            if ((196608 & i10) == 0) {
                i15 = i25 | (composerStartRestartGroup.changed(i7) ? 131072 : 65536);
            }
        }
        int i27 = 1572864 | i15;
        int i28 = i12 & 64;
        if (i28 != 0) {
            i16 = 14155776 | i15;
        } else {
            i16 = i27;
            if ((12582912 & i10) == 0) {
                i16 = i27 | (composerStartRestartGroup.changed(i8) ? 8388608 : 4194304);
            }
        }
        int i29 = i16 | 905969664;
        int i30 = i11 | 6;
        if (composerStartRestartGroup.shouldExecute(((306783379 & i29) == 306783378 && (i30 & 3) == 2) ? false : true, i29 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                TextVo data = yVar.getData();
                boolean z7 = BiliTheme.INSTANCE.getDayNightTheme(composerStartRestartGroup, BiliTheme.$stable) == ThemeDayNight.Night;
                String strJ = data.j();
                String str = data.f102705a;
                if (strJ == null || strJ.length() == 0) {
                    annotatedString2 = new AnnotatedString(str, null, 2, null);
                } else {
                    String strA = B0.a.a(data.j(), " ", str);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(strA);
                    String strJ2 = data.j();
                    if (strJ2.length() > 0) {
                        builder.addStyle(new SpanStyle(ColorKt.Color((!z7 || (numO2 = data.o()) == null) ? data.n() : numO2.intValue()), TextUnitKt.getSp(10), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61436, (DefaultConstructorMarker) null), 0, strJ2.length());
                    }
                    if (str.length() > 0) {
                        builder.addStyle(new SpanStyle(ColorKt.Color((!z7 || (numO = data.o()) == null) ? data.n() : numO.intValue()), TextUnitKt.getSp(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null), data.j().length(), strA.length());
                    }
                    annotatedString2 = builder.toAnnotatedString();
                }
                TextStyle textStyle3 = i24 != 0 ? null : textStyle;
                if (i26 != 0) {
                    i7 = TextOverflow.Companion.m3826getClipgIe3tQ8();
                }
                if (i28 != 0) {
                    i8 = Integer.MAX_VALUE;
                }
                mapEmptyMap = MapsKt.emptyMap();
                annotatedString3 = annotatedString2;
                i20 = i29 & (-897);
                function1 = null;
                textStyle2 = textStyle3;
                i19 = i7;
                z6 = true;
                i21 = 1;
                colorProducer3 = null;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i20 = i29 & (-897);
                annotatedString3 = annotatedString;
                textStyle2 = textStyle;
                i19 = i7;
                i21 = i9;
                mapEmptyMap = map;
                colorProducer3 = colorProducer;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443366925, i20, i30, "com.bilibili.ship.theseus.united.page.restrictionlayer.Content (OperationText.kt:47)");
            }
            yVar.b(annotatedString3, modifier, textStyle2, function1, i19, z6, i8, i21, mapEmptyMap, colorProducer3, composerStartRestartGroup, ((i20 >> 3) & 268435454) | ((i30 << 27) & 1879048192), i20 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            AnnotatedString annotatedString4 = annotatedString3;
            map2 = mapEmptyMap;
            ColorProducer colorProducer4 = colorProducer3;
            annotatedString = annotatedString4;
            textStyle = textStyle2;
            function12 = function1;
            i17 = i8;
            i18 = i21;
            colorProducer2 = colorProducer4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i17 = i8;
            i18 = i9;
            colorProducer2 = colorProducer;
            map2 = map;
            i19 = i7;
            function12 = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final AnnotatedString annotatedString5 = annotatedString;
            final TextStyle textStyle4 = textStyle;
            final Function1<? super TextLayoutResult, Unit> function13 = function12;
            final int i31 = i19;
            final boolean z8 = z6;
            final int i32 = i17;
            final int i33 = i18;
            final Map<String, InlineTextContent> map3 = map2;
            final ColorProducer colorProducer5 = colorProducer2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(yVar, modifier, annotatedString5, textStyle4, function13, i31, z8, i32, i33, map3, colorProducer5, i10, i11, i12) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final y f102920a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f102921b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final AnnotatedString f102922c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final TextStyle f102923d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function1 f102924e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f102925f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final boolean f102926g;
                public final int h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final int f102927i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final Map f102928j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final ColorProducer f102929k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final int f102930l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final int f102931m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final int f102932n;

                {
                    this.f102920a = yVar;
                    this.f102921b = modifier;
                    this.f102922c = annotatedString5;
                    this.f102923d = textStyle4;
                    this.f102924e = function13;
                    this.f102925f = i31;
                    this.f102926g = z8;
                    this.h = i32;
                    this.f102927i = i33;
                    this.f102928j = map3;
                    this.f102929k = colorProducer5;
                    this.f102930l = i10;
                    this.f102931m = i11;
                    this.f102932n = i12;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102930l | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f102931m);
                    ColorProducer colorProducer6 = this.f102929k;
                    int i34 = this.f102932n;
                    A.a(this.f102920a, this.f102921b, this.f102922c, this.f102923d, this.f102924e, this.f102925f, this.f102926g, this.h, this.f102927i, this.f102928j, colorProducer6, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i34);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
