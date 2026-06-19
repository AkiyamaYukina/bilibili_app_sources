package com.bilibili.playerbizcommonv2.widget.subtitle;

import Di0.C1602f;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.bapis.bilibili.community.service.dm.v1.SubtitleType;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt.class */
public final class SubtitleAndAiComposeKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, final List<LanguageItem> list, final float f7, float f8, Composer composer, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1089304125);
        if ((i8 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(i7) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i13 = i10;
        if ((i8 & 48) == 0) {
            i13 = i10 | (composerStartRestartGroup.changedInstance(list) ? 32 : 16);
        }
        if ((i8 & 384) == 0) {
            i11 = i13 | (composerStartRestartGroup.changed(f7) ? 256 : 128);
        } else {
            i11 = i13;
        }
        int i14 = i9 & 8;
        if (i14 != 0) {
            i12 = i11 | 3072;
        } else {
            i12 = i11;
            if ((i8 & 3072) == 0) {
                i12 = i11 | (composerStartRestartGroup.changed(f8) ? 2048 : 1024);
            }
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, 1 & i12)) {
            if (i14 != 0) {
                f8 = Dp.m3880constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1089304125, i12, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.AiBadge (SubtitleAndAiCompose.kt:149)");
            }
            LanguageItem languageItem = list != null ? (LanguageItem) CollectionsKt.getOrNull(list, i7) : null;
            if (languageItem == null || languageItem.h() != 2) {
                composerStartRestartGroup.startReplaceGroup(-1313122363);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1313402014);
                Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, f7, 0.0f, f8, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(2131244499, composerStartRestartGroup, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, SearchBangumiItem.TYPE_FULLNET_VARIETY);
                composerStartRestartGroup.endNode();
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
            final float f9 = f8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, list, f7, f9, i8, i9) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f83468a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f83469b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f83470c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final float f83471d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f83472e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f83473f;

                {
                    this.f83468a = i7;
                    this.f83469b = list;
                    this.f83470c = f7;
                    this.f83471d = f9;
                    this.f83472e = i8;
                    this.f83473f = i9;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83472e | 1);
                    float f10 = this.f83471d;
                    int i15 = this.f83473f;
                    SubtitleAndAiComposeKt.a(this.f83468a, this.f83469b, this.f83470c, f10, (Composer) obj, iUpdateChangedFlags, i15);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r14, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.C5829a r15, @org.jetbrains.annotations.Nullable final java.util.List r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.b(androidx.compose.ui.Modifier, com.bilibili.playerbizcommonv2.widget.setting.a, java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final tv.danmaku.biliplayerv2.ScreenModeType r13, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.C5829a r14, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.service.ai.a r15, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r16, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r17, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.c(tv.danmaku.biliplayerv2.ScreenModeType, com.bilibili.playerbizcommonv2.widget.setting.a, com.bilibili.playerbizcommonv2.service.ai.a, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0361  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.NotNull final java.lang.String r27, final boolean r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1 r29, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r30, long r31, long r33, long r35, long r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.d(androidx.compose.ui.Modifier, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, long, long, long, long, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x023e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1 r20, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r21, float r22, float r23, final long r24, final long r26, final long r28, final long r30, boolean r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.e(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, float, float, long, long, long, long, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r10, final float r11, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r12, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r13, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.f(androidx.compose.ui.Modifier, float, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x035a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r26, @org.jetbrains.annotations.NotNull final java.lang.String r27, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r28, @org.jetbrains.annotations.NotNull final androidx.compose.runtime.internal.ComposableLambda r29, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function2 r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.g(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.internal.ComposableLambda, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03d6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(@org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.subtitle.q0 r14, @org.jetbrains.annotations.NotNull final tv.danmaku.biliplayerv2.ScreenModeType r15, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.setting.C5829a r16, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.widget.subtitle.w0 r17, @org.jetbrains.annotations.NotNull final com.bilibili.playerbizcommonv2.service.ai.a r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r20, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0 r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 1543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.h(com.bilibili.playerbizcommonv2.widget.subtitle.q0, tv.danmaku.biliplayerv2.ScreenModeType, com.bilibili.playerbizcommonv2.widget.setting.a, com.bilibili.playerbizcommonv2.widget.subtitle.w0, com.bilibili.playerbizcommonv2.service.ai.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r14, @org.jetbrains.annotations.NotNull final java.lang.String r15, @org.jetbrains.annotations.NotNull final java.lang.String r16, @org.jetbrains.annotations.Nullable final com.bilibili.lib.media.resource.LanguageItem r17, @org.jetbrains.annotations.NotNull final java.util.List r18, final boolean r19, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2 r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, final int r22) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.i(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, com.bilibili.lib.media.resource.LanguageItem, java.util.List, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(@NotNull final String str, @NotNull final String str2, @Nullable final LanguageItem languageItem, @NotNull final C5887t c5887t, final boolean z6, @Nullable Composer composer, final int i7) {
        int i8;
        long jA;
        TextStyle t14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-799378305);
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
            i10 = i9 | (composerStartRestartGroup.changedInstance(languageItem) ? 256 : 128);
        }
        int i11 = i10;
        if ((i7 & 3072) == 0) {
            i11 = i10 | (composerStartRestartGroup.changed(c5887t) ? 2048 : 1024);
        }
        int i12 = i11;
        if ((i7 & 24576) == 0) {
            i12 = i11 | (composerStartRestartGroup.changed(z6) ? 16384 : 8192);
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799378305, i12, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleRelatedListItem (SubtitleAndAiCompose.kt:466)");
            }
            boolean z7 = languageItem != null && languageItem.b() && Intrinsics.areEqual(c5887t.f83777a, "nodisplay");
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            O4.d.c(companion3, composerM2296constructorimpl, measurePolicyRowMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean zAreEqual = z6 ? Intrinsics.areEqual(c5887t.f83777a, str) || Intrinsics.areEqual(c5887t.f83777a, str2) : Intrinsics.areEqual(c5887t.f83777a, str);
            if (!zAreEqual || z7) {
                composerStartRestartGroup.startReplaceGroup(-575650003);
                jA = com.bilibili.app.comm.aphro.mediaselect.compose.x0.a(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            } else {
                composerStartRestartGroup.startReplaceGroup(-575650842);
                jA = com.bilibili.ad.adview.pegasus.holders.inline.card134.C.b(BiliTheme.INSTANCE, composerStartRestartGroup, BiliTheme.$stable);
            }
            if (c5887t.f83779c == null || !(!StringsKt.isBlank(r0))) {
                composerStartRestartGroup.startReplaceGroup(-664077921);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-665184032);
                Modifier modifierWeight = rowScopeInstance.weight(PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false);
                if (z7) {
                    composerStartRestartGroup.startReplaceGroup(-575640345);
                    t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14b();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-575639386);
                    t14 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT14();
                }
                composerStartRestartGroup.endReplaceGroup();
                if (z7) {
                    jA = Color.m2628copywmQWz5c$default(jA, 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                TextKt.m1772Text4IGK_g(c5887t.f83779c, modifierWeight, jA, 0L, (FontStyle) null, (zAreEqual || z7) ? FontWeight.Companion.getBold() : FontWeight.Companion.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3799getStarte0LSkKk()), 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, 0, 3120, 54744);
                if (c5887t.f83780d == SubtitleType.AI) {
                    composerStartRestartGroup.startReplaceGroup(-664516447);
                    Modifier modifierM1346paddingqDBjuR0$default = PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(4), 0.0f, Dp.m3880constructorimpl(!z6 ? 8 : 4), 0.0f, 10, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1346paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    O4.d.c(companion3, composerM2296constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
                    Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion3, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(2131244499, composerStartRestartGroup, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, SearchBangumiItem.TYPE_FULLNET_VARIETY);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-664087841);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, str2, languageItem, c5887t, z6, i7) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f83555a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f83556b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final LanguageItem f83557c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final C5887t f83558d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f83559e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f83560f;

                {
                    this.f83555a = str;
                    this.f83556b = str2;
                    this.f83557c = languageItem;
                    this.f83558d = c5887t;
                    this.f83559e = z6;
                    this.f83560f = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f83560f | 1);
                    C5887t c5887t2 = this.f83558d;
                    boolean z8 = this.f83559e;
                    SubtitleAndAiComposeKt.j(this.f83555a, this.f83556b, this.f83557c, c5887t2, z8, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0205  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final tv.danmaku.biliplayerv2.ScreenModeType r20, final com.bilibili.playerbizcommonv2.widget.subtitle.w0 r21, final com.bilibili.playerbizcommonv2.service.ai.a r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 1945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt.k(tv.danmaku.biliplayerv2.ScreenModeType, com.bilibili.playerbizcommonv2.widget.subtitle.w0, com.bilibili.playerbizcommonv2.service.ai.a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
