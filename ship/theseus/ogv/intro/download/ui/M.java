package com.bilibili.ship.theseus.ogv.intro.download.ui;

import Di0.C1602f;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/M.class */
public final class M {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final OgvBadgeInfo ogvBadgeInfo, @NotNull final TextStyle textStyle, final long j7, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-652172672);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(ogvBadgeInfo) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(j7) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 2048 : 1024);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652172672, i10, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.BadgeText (DownloadFloatLayerUI.kt:192)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
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
            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            TextKt.m1772Text4IGK_g(ogvBadgeInfo.f94347a, BoxScopeInstance.INSTANCE.align(SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), companion.getCenter()), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, i10 & 896, ((i10 << 15) & 3670016) | 3120, 54776);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(ogvBadgeInfo, textStyle, j7, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvBadgeInfo f92655a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TextStyle f92656b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f92657c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Modifier f92658d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f92659e;

                {
                    this.f92655a = ogvBadgeInfo;
                    this.f92656b = textStyle;
                    this.f92657c = j7;
                    this.f92658d = modifier;
                    this.f92659e = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92659e | 1);
                    long j8 = this.f92657c;
                    Modifier modifier2 = this.f92658d;
                    M.a(this.f92655a, this.f92656b, j8, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03ee  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.download.ui.n0 r16, @org.jetbrains.annotations.Nullable final com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r17, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r18, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.M.b(com.bilibili.ship.theseus.ogv.intro.download.ui.n0, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final int i7, Composer composer, final Modifier modifier, final String str, final boolean z6) {
        int i8;
        long jA;
        TextStyle t14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1466381219);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(str) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(modifier) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, 1 & i10)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1466381219, i10, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadTabItem (DownloadFloatLayerUI.kt:211)");
            }
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(-443073753);
                jA = com.bilibili.ad.composecomponent.button.livereverse.t.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-443072702);
                jA = Li0.e.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            O4.d.c(companion, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(Modifier.Companion, Dp.m3880constructorimpl(14), 0.0f, 2, null);
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(890375943);
                t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14b();
            } else {
                composerStartRestartGroup.startReplaceGroup(890376902);
                t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14();
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m1772Text4IGK_g(str, modifierM1344paddingVpY3zN4$default, jA, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, ((i10 >> 3) & 14) | 48, 0, 65016);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier, str, z6) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f92422a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f92423b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f92424c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f92425d;

                {
                    this.f92422a = z6;
                    this.f92423b = str;
                    this.f92424c = modifier;
                    this.f92425d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    M.c(RecomposeScopeImplKt.updateChangedFlags(this.f92425d | 1), (Composer) obj, this.f92424c, this.f92423b, this.f92422a);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
