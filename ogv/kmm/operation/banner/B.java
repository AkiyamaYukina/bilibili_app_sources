package com.bilibili.ogv.kmm.operation.banner;

import Di0.C1602f;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.comm.aphro.mediaselect.compose.x0;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import jl0.C7707a;
import kntr.base.imageloader.BiliImageKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/B.class */
public final class B {
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.banner.C5437a.d r33, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r34, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2 r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.banner.B.a(com.bilibili.ogv.kmm.operation.banner.a$d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final int i7, @Nullable Composer composer, @Nullable final Modifier modifier, final boolean z6) {
        int i8;
        long jM2628copywmQWz5c$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(178073754);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178073754, i9, -1, "com.bilibili.ogv.kmm.operation.banner.BannerDotItem (BannerUi.kt:30)");
            }
            Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(modifier, Dp.m3880constructorimpl(z6 ? 12 : 5), Dp.m3880constructorimpl(5));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(710937685);
                jM2628copywmQWz5c$default = x0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(711026562);
                jM2628copywmQWz5c$default = Color.m2628copywmQWz5c$default(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText_white-0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            BoxKt.Box(com.bilibili.ad.adview.liveroom.answer.fragment.compont.H.a((float) 2.5d, modifierM1374sizeVpY3zN4, jM2628copywmQWz5c$default), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, z6) { // from class: com.bilibili.ogv.kmm.operation.banner.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f68173a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f68174b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f68175c;

                {
                    this.f68173a = z6;
                    this.f68174b = modifier;
                    this.f68175c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    B.b(RecomposeScopeImplKt.updateChangedFlags(this.f68175c | 1), (Composer) obj, this.f68174b, this.f68173a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.banner.C5437a.d r11, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.kmm.operation.banner.T r12, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.kmm.operation.banner.CreateHdrImageModel$invoke$1 r13, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.banner.B.c(com.bilibili.ogv.kmm.operation.banner.a$d, com.bilibili.ogv.kmm.operation.banner.T, com.bilibili.ogv.kmm.operation.banner.CreateHdrImageModel$invoke$1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull final C5437a.d dVar, final float f7, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-431312095);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(dVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(f7) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, 1 & i10)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-431312095, i10, -1, "com.bilibili.ogv.kmm.operation.banner.BannerTitle (BannerUi.kt:162)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (StringsKt.isBlank(dVar.f68081c)) {
                composerStartRestartGroup.startReplaceGroup(-1767564863);
                BasicTextKt.m1512BasicTextRWo7tUw(CollectionsKt.p(StringsKt.chunked(dVar.f68080b, 9), "\n", (CharSequence) null, (CharSequence) null, (Function1) null, 62), (Modifier) null, new TextStyle(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getText_white-0d7_KjU(), TextUnitKt.getSp(20), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.Companion.m3794getCentere0LSkKk(), 0, TextUnitKt.getSp(28), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613368, (DefaultConstructorMarker) null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 2, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1767056835);
                BiliImageKt.BiliImage(C7707a.a(dVar.f68081c, ContentScale.Companion.getFillHeight(), companion.getCenter(), false, false, null, null, 121), SizeKt.m1358height3ABfNKs(SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), f7), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 0, 1020);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(4, 6, composerStartRestartGroup, Modifier.Companion);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            BasicTextKt.m1512BasicTextRWo7tUw(dVar.f68082d, (Modifier) null, TextStyle.m3586copyp1EtxEg$default(biliTheme.getTextStyle(composerStartRestartGroup, i11).getT13(), Color.m2628copywmQWz5c$default(biliTheme.getColors(composerStartRestartGroup, i11).getText_white-0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (Function1<? super TextLayoutResult, Unit>) null, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composerStartRestartGroup, 1597440, 938);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(dVar, f7, modifier, i7) { // from class: com.bilibili.ogv.kmm.operation.banner.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5437a.d f68155a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f68156b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f68157c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f68158d;

                {
                    this.f68155a = dVar;
                    this.f68156b = f7;
                    this.f68157c = modifier;
                    this.f68158d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f68158d | 1);
                    float f8 = this.f68156b;
                    Modifier modifier2 = this.f68157c;
                    B.d(this.f68155a, f8, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x038a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.banner.C5437a.d r14, @org.jetbrains.annotations.Nullable final com.bilibili.ogv.kmm.operation.banner.CreateHdrImageModel$invoke$1 r15, final float r16, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.banner.B.e(com.bilibili.ogv.kmm.operation.banner.a$d, com.bilibili.ogv.kmm.operation.banner.CreateHdrImageModel$invoke$1, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
