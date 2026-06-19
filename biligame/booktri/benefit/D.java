package com.bilibili.biligame.booktri.benefit;

import Di0.C1602f;
import G3.U0;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.C4162p;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.ui.unit.TextUnitKt;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.w0;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.compose.widget.BiligameImageKt;
import com.bilibili.biligame.ui.feed.bean.GameFeedItem;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.List;
import java.util.Map;
import kntr.base.account.AccountState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/D.class */
public final class D {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/D$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<BiligameMainGame, Unit> f62260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiligameMainGame f62261b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super BiligameMainGame, Unit> function1, BiligameMainGame biligameMainGame) {
            this.f62260a = function1;
            this.f62261b = biligameMainGame;
        }

        public final Object invoke() {
            this.f62260a.invoke(this.f62261b);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/D$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<BiligameMainGame, Unit> f62262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiligameMainGame f62263b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super BiligameMainGame, Unit> function1, BiligameMainGame biligameMainGame) {
            this.f62262a = function1;
            this.f62263b = biligameMainGame;
        }

        public final Object invoke() {
            this.f62262a.invoke(this.f62263b);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/D$c.class */
    public static final class c implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f62264a;

        public c(List list) {
            this.f62264a = list;
        }

        public final Object invoke(Object obj) {
            this.f62264a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/D$d.class */
    public static final class d implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f62265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f62266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1 f62267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function1 f62268d;

        public d(List list, Map map, Function1 function1, Function1 function12) {
            this.f62265a = list;
            this.f62266b = map;
            this.f62267c = function1;
            this.f62268d = function12;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.String r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.a(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(final C5290a c5290a, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-855656163);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c5290a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-855656163, i10, -1, "com.bilibili.biligame.booktri.benefit.AlreadyBookedContent (BookTriBenefitCaptchaDialog.kt:652)");
            }
            e(function0, ComposableLambdaKt.rememberComposableLambda(-1110833640, true, new Function2(c5290a, function02) { // from class: com.bilibili.biligame.booktri.benefit.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5290a f62424a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f62425b;

                {
                    this.f62424a = c5290a;
                    this.f62425b = function02;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1110833640, iIntValue, -1, "com.bilibili.biligame.booktri.benefit.AlreadyBookedContent.<anonymous> (BookTriBenefitCaptchaDialog.kt:657)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        float f7 = 24;
                        com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composer2, companion);
                        float f8 = 140;
                        BiligameImageKt.BiligameModImage("biligame_book_failed_pink.png", SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8)), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 54, 0, 4092);
                        this.f62424a.getClass();
                        TextKt.m1772Text4IGK_g("恭喜您，您已经预约过了", PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null), BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getGa10-0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130512);
                        com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composer2, companion);
                        D.a("我知道了", this.f62425b, composer2, 6);
                        if (C.a(16, 6, composer2, companion)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i11 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c5290a, function0, function02, i7, i11) { // from class: com.bilibili.biligame.booktri.benefit.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f62426a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f62427b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f62428c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f62429d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Object f62430e;

                {
                    this.f62426a = i11;
                    this.f62430e = c5290a;
                    this.f62427b = function0;
                    this.f62428c = function02;
                    this.f62429d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i12 = this.f62426a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i12) {
                        case 0:
                            D.b((C5290a) this.f62430e, this.f62427b, this.f62428c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f62429d | 1));
                            break;
                        default:
                            kntr.common.comment.page.ui.y.b((AccountState) this.f62430e, this.f62427b, this.f62428c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f62429d | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01f7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final int r26, androidx.compose.runtime.Composer r27, final java.lang.String r28, final java.lang.String r29, final kotlin.jvm.functions.Function1 r30, final boolean r31) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.c(int, androidx.compose.runtime.Composer, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0256  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final android.content.Context r14, final com.bilibili.biligame.booktri.benefit.AbstractC5292c r15, final com.bilibili.biligame.ui.feed.bean.GameFeedItem r16, final java.util.Map r17, final kotlin.jvm.functions.Function1 r18, final kotlin.jvm.functions.Function0 r19, final kotlin.jvm.functions.Function0 r20, final kotlin.jvm.functions.Function0 r21, final kotlin.jvm.functions.Function0 r22, androidx.compose.runtime.Composer r23, final int r24) {
        /*
            Method dump skipped, instruction units count: 1337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.d(android.content.Context, com.bilibili.biligame.booktri.benefit.c, com.bilibili.biligame.ui.feed.bean.GameFeedItem, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x034a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.internal.ComposableLambda r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.e(kotlin.jvm.functions.Function0, androidx.compose.runtime.internal.ComposableLambda, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(final Function0 function0, final ComposableLambda composableLambda, final ComposableLambda composableLambda2, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1634821095);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(composableLambda) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(composableLambda2) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634821095, i10, -1, "com.bilibili.biligame.booktri.benefit.BottomSheetContainerWithFixedHeader (BookTriBenefitCaptchaDialog.kt:792)");
            }
            float fM3880constructorimpl = Dp.m3880constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp * 0.7f);
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM1360heightInVpY3zN4$default = SizeKt.m1360heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, fM3880constructorimpl, 1, null);
            float f7 = 16;
            Modifier modifierClip = ClipKt.clip(modifierM1360heightInVpY3zN4$default, RoundedCornerShapeKt.m1504RoundedCornerShapea9UjIt4$default(Dp.m3880constructorimpl(f7), Dp.m3880constructorimpl(f7), 0.0f, 0.0f, 12, null));
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i11 = BiliTheme.$stable;
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(modifierClip, biliTheme.getColors(composerStartRestartGroup, i11).getWh0-0d7_KjU(), null, 2, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            Object objMutableInteractionSource = objRememberedValue;
            if (objRememberedValue == companion2.getEmpty()) {
                objMutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objMutableInteractionSource);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objMutableInteractionSource;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object u02 = objRememberedValue2;
            if (objRememberedValue2 == companion2.getEmpty()) {
                u02 = new U0(8);
                composerStartRestartGroup.updateRememberedValue(u02);
            }
            Modifier modifierM1182clickableO2vRcR0$default = ClickableKt.m1182clickableO2vRcR0$default(modifierM1169backgroundbw27NRU$default, mutableInteractionSource, null, false, null, null, (Function0) u02, 28, null);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1182clickableO2vRcR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM2296constructorimpl, currentCompositionLocalMap);
            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SpacerKt.Spacer(BackgroundKt.background$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(114)), Brush.Companion.m2579verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(ColorKt.Color(536777654)), Color.m2619boximpl(ColorKt.Color(16683958))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(2131245239, composerStartRestartGroup, 0);
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), companion3.getTopCenter());
            int i12 = Painter.$stable | 48;
            ImageKt.Image(painterPainterResource, "", modifierAlign, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i12, 120);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2296constructorimpl2, currentCompositionLocalMap2);
            Updater.m2304setimpl(composerM2296constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl2, Integer.valueOf(iHashCode2), composerM2296constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composableLambda.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 14));
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(columnScopeInstance.weight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false), scrollStateRememberScrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
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
            O4.d.c(companion4, composerM2296constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2296constructorimpl3, currentCompositionLocalMap3);
            Updater.m2304setimpl(composerM2296constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion4, composerM2296constructorimpl3, Integer.valueOf(iHashCode3), composerM2296constructorimpl3));
            composableLambda2.invoke(composerStartRestartGroup, Integer.valueOf((i10 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(2131245242, composerStartRestartGroup, 0);
            long j7 = biliTheme.getColors(composerStartRestartGroup, i11).getGa7-0d7_KjU();
            Modifier modifierAlign2 = boxScopeInstance.align(companion, companion3.getTopEnd());
            float f8 = 12;
            Modifier modifierM1372size3ABfNKs = SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(modifierAlign2, 0.0f, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8), 0.0f, 9, null), Dp.m3880constructorimpl(24));
            boolean z6 = (i10 & 14) == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new BS0.e(function0, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            IconKt.m2023Iconww6aTOc(painterPainterResource2, "关闭", ClickableKt.m1186clickableoSLSa3U$default(modifierM1372size3ABfNKs, false, null, null, null, (Function0) objRememberedValue3, 15, null), j7, composerStartRestartGroup, i12, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(function0, composableLambda, composableLambda2, i7) { // from class: com.bilibili.biligame.booktri.benefit.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f62464a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComposableLambda f62465b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ComposableLambda f62466c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f62467d;

                {
                    this.f62464a = function0;
                    this.f62465b = composableLambda;
                    this.f62466c = composableLambda2;
                    this.f62467d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f62467d | 1);
                    ComposableLambda composableLambda3 = this.f62465b;
                    ComposableLambda composableLambda4 = this.f62466c;
                    D.f(this.f62464a, composableLambda3, composableLambda4, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(final C5293d c5293d, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1233517597);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c5293d) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        int i10 = i9;
        if ((i7 & 384) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(function02) ? 256 : 128);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233517597, i10, -1, "com.bilibili.biligame.booktri.benefit.ErrorContent (BookTriBenefitCaptchaDialog.kt:692)");
            }
            e(function0, ComposableLambdaKt.rememberComposableLambda(1195876120, true, new Function2(c5293d, function02) { // from class: com.bilibili.biligame.booktri.benefit.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5293d f62447a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f62448b;

                {
                    this.f62447a = c5293d;
                    this.f62448b = function02;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1195876120, iIntValue, -1, "com.bilibili.biligame.booktri.benefit.ErrorContent.<anonymous> (BookTriBenefitCaptchaDialog.kt:697)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        float f7 = 24;
                        com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composer2, companion);
                        float f8 = 140;
                        BiligameImageKt.BiligameModImage("biligame_book_failed_pink.png", SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(f8), Dp.m3880constructorimpl(f8)), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 54, 0, 4092);
                        com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(6, 6, composer2, companion);
                        C5293d c5293d2 = this.f62447a;
                        StringBuilder sbA = androidx.compose.ui.autofill.r.a(c5293d2.f62372a);
                        sbA.append(c5293d2.f62373b);
                        TextKt.m1772Text4IGK_g(sbA.toString(), PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(12), 0.0f, 2, null), BiliTheme.INSTANCE.getColors(composer2, BiliTheme.$stable).getGa10-0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(TextAlign.Companion.m3794getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 130512);
                        com.bilibili.ad.adview.liveroom.answer.fragment.compont.q.a(f7, 6, composer2, companion);
                        D.a("再试一次", this.f62448b, composer2, 6);
                        if (C.a(16, 6, composer2, companion)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i10 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c5293d, function0, function02, i7) { // from class: com.bilibili.biligame.booktri.benefit.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5293d f62449a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f62450b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function0 f62451c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f62452d;

                {
                    this.f62449a = c5293d;
                    this.f62450b = function0;
                    this.f62451c = function02;
                    this.f62452d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f62452d | 1);
                    D.g(this.f62449a, this.f62450b, this.f62451c, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final com.bilibili.biligame.api.BiligameMainGame r26, final com.bilibili.biligame.kntr.common.bean.KBiligame r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.h(com.bilibili.biligame.api.BiligameMainGame, com.bilibili.biligame.kntr.common.bean.KBiligame, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final java.util.List<? extends com.bilibili.biligame.api.BiligameMainGame> r14, final java.util.Map<com.bilibili.biligame.api.BiligameMainGame, com.bilibili.biligame.kntr.common.bean.KBiligame> r15, final kotlin.jvm.functions.Function1<? super com.bilibili.biligame.api.BiligameMainGame, kotlin.Unit> r16, final kotlin.jvm.functions.Function1<? super com.bilibili.biligame.api.BiligameMainGame, kotlin.Unit> r17, androidx.compose.runtime.Composer r18, final int r19) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.D.i(java.util.List, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void j(String str, Function0<Unit> function0, Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(861144121);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(function0) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(861144121, i9, -1, "com.bilibili.biligame.booktri.benefit.SubscribeSection (BookTriBenefitCaptchaDialog.kt:911)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierA = androidx.compose.foundation.text.contextmenu.internal.J.a(PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(30)), Dp.m3880constructorimpl(16), 0.0f, 2, null), 8);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(BackgroundKt.m1169backgroundbw27NRU$default(modifierA, biliTheme.getColors(composerStartRestartGroup, i10).getGa0-0d7_KjU(), null, 2, null), Dp.m3880constructorimpl(12), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1344paddingVpY3zN4$default);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(2131245246, composerStartRestartGroup, 0), "", SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(17), Dp.m3880constructorimpl(14)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
            TextKt.m1772Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), biliTheme.getColors(composerStartRestartGroup, i10).getGa7-0d7_KjU(), w0.a(4, 6, 12, composerStartRestartGroup, companion), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m3827getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (14 & i9) | 3072, 3120, 120816);
            boolean z6 = (i9 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ob1.i(function0, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM1186clickableoSLSa3U$default = ClickableKt.m1186clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1186clickableoSLSa3U$default);
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
            TextKt.m1772Text4IGK_g("去订阅", (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getPi5-0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3078, 0, 131058);
            if (C4162p.a(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C5314z(i7, 0, str, function0));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(final Context context, final C5294e c5294e, final GameFeedItem gameFeedItem, final Map map, final Function1 function1, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1785084226);
        if ((i7 & 48) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c5294e) ? 32 : 16) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 384) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(gameFeedItem) ? 256 : 128);
        }
        int i10 = i9;
        if ((i7 & 3072) == 0) {
            i10 = i9 | (composerStartRestartGroup.changedInstance(map) ? 2048 : 1024);
        }
        int i11 = i10;
        if ((i7 & 24576) == 0) {
            i11 = i10 | (composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192);
        }
        int i12 = i11;
        if ((196608 & i7) == 0) {
            i12 = i11 | (composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536);
        }
        int i13 = i12;
        if ((12582912 & i7) == 0) {
            i13 = i12 | (composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304);
        }
        if (composerStartRestartGroup.shouldExecute((4269201 & i13) != 4269200, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785084226, i13, -1, "com.bilibili.biligame.booktri.benefit.SuccessContent (BookTriBenefitCaptchaDialog.kt:542)");
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            GameOfficialInfo gameOfficialInfo = c5294e.f62381f;
            boolean z6 = gameOfficialInfo != null && gameOfficialInfo.getShowWxOfficialEntrance() == 1;
            boolean zIsEmpty = c5294e.h.isEmpty();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object objMutableStateOf$default = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(c5294e.f62378c.booleanValue()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
            }
            final MutableState mutableState = (MutableState) objMutableStateOf$default;
            ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            final boolean z7 = z6;
            final boolean z8 = !zIsEmpty;
            f(function0, j0.f62423a, ComposableLambdaKt.rememberComposableLambda(-996508031, true, new Function2(c5294e, function1, z7, function03, context2, gameFeedItem, z8, map, mutableState) { // from class: com.bilibili.biligame.booktri.benefit.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5294e f62431a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f62432b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f62433c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function0 f62434d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Context f62435e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final GameFeedItem f62436f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final boolean f62437g;
                public final Map h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final MutableState f62438i;

                {
                    this.f62431a = c5294e;
                    this.f62432b = function1;
                    this.f62433c = z7;
                    this.f62434d = function03;
                    this.f62435e = context2;
                    this.f62436f = gameFeedItem;
                    this.f62437g = z8;
                    this.h = map;
                    this.f62438i = mutableState;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x022e  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x037b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 1028
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.C5302m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 15) & 14) | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(context, c5294e, gameFeedItem, map, function1, function0, function02, function03, i7) { // from class: com.bilibili.biligame.booktri.benefit.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f62439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C5294e f62440b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final GameFeedItem f62441c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Map f62442d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function1 f62443e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Function0 f62444f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function0 f62445g;
                public final Function0 h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final int f62446i;

                {
                    this.f62439a = context;
                    this.f62440b = c5294e;
                    this.f62441c = gameFeedItem;
                    this.f62442d = map;
                    this.f62443e = function1;
                    this.f62444f = function0;
                    this.f62445g = function02;
                    this.h = function03;
                    this.f62446i = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f62446i | 1);
                    Function0 function04 = this.f62445g;
                    Function0 function05 = this.h;
                    D.k(this.f62439a, this.f62440b, this.f62441c, this.f62442d, this.f62443e, this.f62444f, function04, function05, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
