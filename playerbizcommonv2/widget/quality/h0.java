package com.bilibili.playerbizcommonv2.widget.quality;

import Di0.C1602f;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bapis.bilibili.playershared.QnGroup;
import com.bapis.bilibili.playershared.QnGroupType;
import com.bapis.bilibili.playershared.StreamInfo;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.Iterator;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kntr.base.imageloader.Pixel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/h0.class */
public final class h0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/h0$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82827a;

        static {
            int[] iArr = new int[QnGroupType.values().length];
            try {
                iArr[QnGroupType.VIP_VISION.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f82827a = iArr;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void a(@NotNull final QnGroup qnGroup, @Nullable final com.bilibili.player.tangram.basic.a aVar, @Nullable final Boolean bool, @NotNull final Function1 function1, @NotNull final ExposureEntry exposureEntry, @NotNull final Function1 function12, @Nullable final Modifier modifier, @Nullable final Function3 function3, @Nullable final Function3 function32, @Nullable Composer composer, final int i7) {
        int i8;
        Object next;
        Composer composerStartRestartGroup = composer.startRestartGroup(583431700);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(qnGroup) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(aVar) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(bool) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | ((32768 & i7) == 0 ? composerStartRestartGroup.changed(exposureEntry) : composerStartRestartGroup.changedInstance(exposureEntry) ? 16384 : 8192);
        }
        int i13 = i12;
        if ((196608 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536);
        }
        int i14 = i13;
        if ((1572864 & i7) == 0) {
            i14 = i13 | (composerStartRestartGroup.changed(modifier) ? 1048576 : 524288);
        }
        int i15 = i14;
        if ((12582912 & i7) == 0) {
            i15 = i14 | (composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304);
        }
        int i16 = i15;
        if ((100663296 & i7) == 0) {
            i16 = i15 | (composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432);
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i16) != 38347922, i16 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583431700, i16, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualityGroup (QualityList2PanelUI.kt:234)");
            }
            Iterator it = qnGroup.getStreamInfosList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (com.bilibili.player.tangram.basic.a.a(k((StreamInfo) next), aVar)) {
                        break;
                    }
                }
            }
            final StreamInfo streamInfo = (StreamInfo) next;
            if (bool != null) {
                composerStartRestartGroup.startReplaceGroup(-715290749);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
                O4.d.c(companion, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
                Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                b(streamInfo, qnGroup, function12, bool, function32, function3, exposureEntry, function1, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), composerStartRestartGroup, 6);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, bool.booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-2035547139, true, new Function3(qnGroup, aVar, streamInfo, function12) { // from class: com.bilibili.playerbizcommonv2.widget.quality.S

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final QnGroup f82738a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final com.bilibili.player.tangram.basic.a f82739b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final StreamInfo f82740c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Function1 f82741d;

                    {
                        this.f82738a = qnGroup;
                        this.f82739b = aVar;
                        this.f82740c = streamInfo;
                        this.f82741d = function12;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:40:0x027a  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
                        /*
                            Method dump skipped, instruction units count: 724
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.S.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870 | ((i16 >> 3) & 112), 30);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-713458866);
                b(streamInfo, qnGroup, function12, bool, function32, function3, exposureEntry, function1, modifier, composerStartRestartGroup, (i16 >> 18) & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(qnGroup, aVar, bool, function1, exposureEntry, function12, modifier, function3, function32, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.Y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final QnGroup f82770a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.player.tangram.basic.a f82771b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Boolean f82772c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function1 f82773d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final ExposureEntry f82774e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function1 f82775f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Modifier f82776g;
                public final Function3 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final Function3 f82777i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final int f82778j;

                {
                    this.f82770a = qnGroup;
                    this.f82771b = aVar;
                    this.f82772c = bool;
                    this.f82773d = function1;
                    this.f82774e = exposureEntry;
                    this.f82775f = function12;
                    this.f82776g = modifier;
                    this.h = function3;
                    this.f82777i = function32;
                    this.f82778j = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82778j | 1);
                    ExposureEntry exposureEntry2 = this.f82774e;
                    Function3 function33 = this.h;
                    Function3 function34 = this.f82777i;
                    h0.a(this.f82770a, this.f82771b, this.f82772c, this.f82773d, exposureEntry2, this.f82775f, this.f82776g, function33, function34, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0385  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bapis.bilibili.playershared.StreamInfo r17, final com.bapis.bilibili.playershared.QnGroup r18, kotlin.jvm.functions.Function1 r19, java.lang.Boolean r20, kotlin.jvm.functions.Function3 r21, kotlin.jvm.functions.Function3 r22, com.bilibili.framework.exposure.core.ExposureEntry r23, kotlin.jvm.functions.Function1 r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.h0.b(com.bapis.bilibili.playershared.StreamInfo, com.bapis.bilibili.playershared.QnGroup, kotlin.jvm.functions.Function1, java.lang.Boolean, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, com.bilibili.framework.exposure.core.ExposureEntry, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-187456625);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-187456625, i8, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualityInfoIcon (QualityList2PanelUI.kt:122)");
            }
            ImageKt.Image(BiliIconfont.INSTANCE.getInfo_help_circle_line_500(composerStartRestartGroup, 6), (String) null, modifier, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText3-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48 | ((i8 << 6) & 896), 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.T

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f82752a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82753b;

                {
                    this.f82752a = modifier;
                    this.f82753b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82753b | 1);
                    h0.c(this.f82752a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.NotNull final java.lang.String r34, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r35, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Color r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Color r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.h0.d(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final java.lang.String r36, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r37, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Color r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Color r39, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.h0.e(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final String str, final boolean z6, @Nullable final Modifier modifier, boolean z7, @Nullable String str2, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32, @Nullable Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        TextStyle textStyleM3586copyp1EtxEg$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(2094399323);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i13 = i9;
        if ((i7 & 48) == 0) {
            i13 = i9 | (composerStartRestartGroup.changed(z6) ? 32 : 16);
        }
        int i14 = i13;
        if ((i7 & 384) == 0) {
            i14 = i13 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        int i15 = i14 | 3072;
        int i16 = i8 & 16;
        if (i16 != 0) {
            i10 = i14 | 27648;
        } else {
            i10 = i15;
            if ((i7 & 24576) == 0) {
                i10 = i15 | (composerStartRestartGroup.changed(str2) ? 16384 : 8192);
            }
        }
        int i17 = i8 & 32;
        if (i17 != 0) {
            i11 = i10 | 196608;
        } else {
            i11 = i10;
            if ((196608 & i7) == 0) {
                i11 = i10 | (composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536);
            }
        }
        int i18 = i8 & 64;
        if (i18 != 0) {
            i12 = i11 | 1572864;
        } else {
            i12 = i11;
            if ((i7 & 1572864) == 0) {
                i12 = i11 | (composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 599187) != 599186, i12 & 1)) {
            if (i16 != 0) {
                str2 = null;
            }
            if (i17 != 0) {
                function3 = null;
            }
            if (i18 != 0) {
                function32 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2094399323, i12, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualityItemUI (QualityList2PanelUI.kt:140)");
            }
            Modifier modifierM1358height3ABfNKs = SizeKt.m1358height3ABfNKs(modifier, Dp.m3880constructorimpl(54));
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1358height3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(1698126967);
                function3.invoke(SizeKt.m1372size3ABfNKs(boxScopeInstance.align(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m3880constructorimpl(10), Dp.m3880constructorimpl(12), 0.0f, 9, null), companion.getTopEnd()), Dp.m3880constructorimpl(16)), composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1698321089);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m1346paddingqDBjuR0$default(companion3, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), companion.getCenterStart());
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            z7 = true;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl3 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl3, measurePolicyRowMeasurePolicy, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            Modifier modifierWeight = RowScopeInstance.INSTANCE.weight(companion3, 1.0f, false);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-757816331);
                BiliTheme biliTheme = BiliTheme.INSTANCE;
                int i19 = BiliTheme.$stable;
                textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i19).getT14b(), biliTheme.getColors(composerStartRestartGroup, i19).getBrand_pink-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-757694687);
                composerStartRestartGroup.startReplaceGroup(1222487390);
                BiliTheme biliTheme2 = BiliTheme.INSTANCE;
                int i20 = BiliTheme.$stable;
                textStyleM3586copyp1EtxEg$default = TextStyle.m3586copyp1EtxEg$default(biliTheme2.getTextStyle(composerStartRestartGroup, i20).getT14(), com.bilibili.ad.adview.story.card.card53.select.basic.t.a(biliTheme2, composerStartRestartGroup, i20), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            BasicTextKt.m1512BasicTextRWo7tUw(str, modifierWeight, textStyleM3586copyp1EtxEg$default, (Function1<? super TextLayoutResult, Unit>) null, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, (i12 & 14) | 1597440, 936);
            if (function32 != null) {
                composerStartRestartGroup.startReplaceGroup(-757334529);
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.J.a(8, 6, composerStartRestartGroup, companion3);
                function32.invoke(companion3, composerStartRestartGroup, Integer.valueOf(6 | ((i12 >> 15) & 112)));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-757234585);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (str2 == null || str2.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(1766331659);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1766084248);
                BiliTheme biliTheme3 = BiliTheme.INSTANCE;
                int i21 = BiliTheme.$stable;
                BasicTextKt.m1512BasicTextRWo7tUw(str2, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme3.getTextStyle(composerStartRestartGroup, i21).getT12(), biliTheme3.getColors(composerStartRestartGroup, i21).getText3-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, companion4.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, ((i12 >> 12) & 14) | 1597440, 938);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z8 = z7;
            final String str3 = str2;
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function3;
            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function34 = function32;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, z6, modifier, z8, str3, function33, function34, i7, i8) { // from class: com.bilibili.playerbizcommonv2.widget.quality.Z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f82779a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f82780b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f82781c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f82782d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f82783e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function3 f82784f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function3 f82785g;
                public final int h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final int f82786i;

                {
                    this.f82779a = str;
                    this.f82780b = z6;
                    this.f82781c = modifier;
                    this.f82782d = z8;
                    this.f82783e = str3;
                    this.f82784f = function33;
                    this.f82785g = function34;
                    this.h = i7;
                    this.f82786i = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                    Function3 function35 = this.f82785g;
                    int i22 = this.f82786i;
                    h0.f(this.f82779a, this.f82780b, this.f82781c, this.f82782d, this.f82783e, this.f82784f, function35, (Composer) obj, iUpdateChangedFlags, i22);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1754121866);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1754121866, i8, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualitySettingUi (QualityList2PanelUI.kt:385)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(2131846773, composerStartRestartGroup, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, modifierWeight$default, biliTheme.getColors(composerStartRestartGroup, i9).getText_white-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, 0, 3072, 57336);
            TextKt.m1772Text4IGK_g(StringResources_androidKt.stringResource(2131851884, composerStartRestartGroup, 0), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12(), composerStartRestartGroup, 0, 3072, 57338);
            ImageKt.Image(BiliIconfont.INSTANCE.getArrow_forward_right_line_500(composerStartRestartGroup, 6), "清晰度设置", SizeKt.m1372size3ABfNKs(companion2, Dp.m3880constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.a0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Modifier f82789a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f82790b;

                {
                    this.f82789a = modifier;
                    this.f82790b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82790b | 1);
                    h0.g(this.f82789a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@NotNull final String str, @Nullable final String str2, @NotNull final Function0 function0, @Nullable final Modifier modifier, @Nullable final Function2 function2, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1292148387);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str2) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function0) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1292148387, i12, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualityTrialPanel (QualityList2PanelUI.kt:86)");
            }
            float f7 = 16;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(PaddingKt.m1346paddingqDBjuR0$default(modifier, Dp.m3880constructorimpl(f7), 0.0f, Dp.m3880constructorimpl(7), 0.0f, 10, null), 0.0f, Dp.m3880constructorimpl(10), 1, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl2 = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str);
            if (str2 != null && str2.length() != 0) {
                int iA = StringsKt.A(str, str2.toString(), 0, false, 6);
                builder.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), iA, str2.toString().length() + iA);
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i13 = BiliTheme.$stable;
            BasicTextKt.m1510BasicTextCL7eQgs(annotatedString, null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i13).getT12(), biliTheme.getColors(composerStartRestartGroup, i13).getText_white-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, TfCode.UNICOM_CDN_FILE_URL_EMPTY_VALUE);
            if (function2 != null) {
                composerStartRestartGroup.startReplaceGroup(720340038);
                com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(2, 6, composerStartRestartGroup, companion3);
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(720429411);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            ImageKt.Image(BiliIconfont.INSTANCE.getXmark_close_line_500(composerStartRestartGroup, 6), (String) null, ClickableKt.m1186clickableoSLSa3U$default(SizeKt.m1372size3ABfNKs(boxScopeInstance.align(companion3, companion.getTopEnd()), Dp.m3880constructorimpl(f7)), false, null, null, null, function0, 15, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i13).getText3-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, str2, function0, modifier, function2, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.W

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f82761a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f82762b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f82763c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f82764d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function2 f82765e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f82766f;

                {
                    this.f82761a = str;
                    this.f82762b = str2;
                    this.f82763c = function0;
                    this.f82764d = modifier;
                    this.f82765e = function2;
                    this.f82766f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82766f | 1);
                    Modifier modifier2 = this.f82764d;
                    Function2 function22 = this.f82765e;
                    h0.h(this.f82761a, this.f82762b, this.f82763c, modifier2, function22, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(@NotNull final sk.a aVar, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-579355811);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579355811, i9, -1, "com.bilibili.playerbizcommonv2.widget.quality.QualityTrialVipTips (QualityList2PanelUI.kt:62)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1286513632);
            String strStringResource = aVar.a;
            boolean z6 = true;
            if (strStringResource != null) {
                z6 = strStringResource.length() == 0;
            }
            if (z6) {
                strStringResource = StringResources_androidKt.stringResource(2131845690, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw(strStringResource, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12(), biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1018);
            ImageKt.Image(BiliIconfont.INSTANCE.getArrow_forward_right_line_500(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(rowScopeInstance.align(Modifier.Companion, companion.getCenterVertically()), Dp.m3880constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, biliTheme.getColors(composerStartRestartGroup, i10).getBrand_pink-0d7_KjU(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(aVar, modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.X

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final sk.a f82767a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f82768b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f82769c;

                {
                    this.f82767a = aVar;
                    this.f82768b = modifier;
                    this.f82769c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82769c | 1);
                    h0.i(this.f82767a, this.f82768b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(@NotNull final StreamInfo streamInfo, final long j7, @NotNull final TextStyle textStyle, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2120421062);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(streamInfo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(j7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(textStyle) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120421062, i11, -1, "com.bilibili.playerbizcommonv2.widget.quality.SimpleQualityItem (QualityList2PanelUI.kt:360)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composerStartRestartGroup);
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BasicTextKt.m1512BasicTextRWo7tUw(streamInfo.getNewDescription(), (Modifier) null, TextStyle.m3586copyp1EtxEg$default(textStyle, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 0, 1018);
            if (streamInfo.getDescriptionImg().length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-924065594);
                BasicTextKt.m1512BasicTextRWo7tUw(" · ", (Modifier) null, TextStyle.m3586copyp1EtxEg$default(textStyle, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, 0, false, 0, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 6, 1018);
                BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(-1081380015, true, new Function3(streamInfo, j7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.U

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StreamInfo f82754a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f82755b;

                    {
                        this.f82754a = streamInfo;
                        this.f82755b = j7;
                    }

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        int i12 = iIntValue;
                        if ((iIntValue & 6) == 0) {
                            i12 = iIntValue | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                        }
                        if (composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1081380015, i12, -1, "com.bilibili.playerbizcommonv2.widget.quality.SimpleQualityItem.<anonymous>.<anonymous> (QualityList2PanelUI.kt:369)");
                            }
                            ImageRequest imageRequest = new ImageRequest(this.f82754a.getDescriptionImg());
                            imageRequest.colorFilter(ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, this.f82755b, 0, 2, null));
                            ImageRequest.noLimitSize-Ic4ZqO0$default(imageRequest, 0, Pixel.constructor-impl(Constraints.m3843getMaxHeightimpl(boxWithConstraintsScope.mo1315getConstraintsmsEJaDk())), 1, (Object) null);
                            BiliImageKt.BiliImage(com.bilibili.ad.adview.story.card.card138.i.a(ContentScale.Companion, imageRequest), SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composer2, 48, 1020);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 7);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-923517824);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(streamInfo, j7, textStyle, modifier, i7) { // from class: com.bilibili.playerbizcommonv2.widget.quality.V

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final StreamInfo f82756a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f82757b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final TextStyle f82758c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f82759d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f82760e;

                {
                    this.f82756a = streamInfo;
                    this.f82757b = j7;
                    this.f82758c = textStyle;
                    this.f82759d = modifier;
                    this.f82760e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f82760e | 1);
                    TextStyle textStyle2 = this.f82758c;
                    Modifier modifier2 = this.f82759d;
                    h0.j(this.f82756a, this.f82757b, textStyle2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final int k(@NotNull StreamInfo streamInfo) {
        int i7;
        int quality = streamInfo.getQuality();
        if (quality < 0) {
            i7 = 0;
        } else {
            i7 = quality;
            if (quality == 15) {
                i7 = 16;
            }
        }
        return i7;
    }
}
