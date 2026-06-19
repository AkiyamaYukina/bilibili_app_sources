package com.bilibili.playset.editor.widget;

import Di0.C1602f;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.image.BiliImageKt;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.util.AppResUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/EditorCommonKt.class */
public final class EditorCommonKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/EditorCommonKt$a.class */
    public static final class a implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Transition f84880a;

        public a(Transition transition) {
            this.f84880a = transition;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            return this.f84880a.getTargetState();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/EditorCommonKt$b.class */
    public static final class b implements Function0<Transition.Segment<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Transition f84881a;

        public b(Transition transition) {
            this.f84881a = transition;
        }

        public final Object invoke() {
            return this.f84881a.getSegment();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final String str, Composer composer, final int i7, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(1535081838);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        int i10 = i9;
        if ((i8 & 48) == 0) {
            i10 = i9 | (composerStartRestartGroup.changed(i7) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 19) != 18, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1535081838, i10, -1, "com.bilibili.playset.editor.widget.CoverPreviewImage (EditorCommon.kt:230)");
            }
            if (str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2(str, i7, i8) { // from class: com.bilibili.playset.editor.widget.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final String f84991a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f84992b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f84993c;

                        {
                            this.f84991a = str;
                            this.f84992b = i7;
                            this.f84993c = i8;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84993c | 1);
                            EditorCommonKt.a(this.f84991a, (Composer) obj, this.f84992b, iUpdateChangedFlags);
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            BiliImageKt.BiliImage(str, i7 == 12 ? SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, C5963m.f85030l, 0.0f, 11, null), C5963m.f85034p) : androidx.compose.foundation.text.contextmenu.internal.J.a(SizeKt.m1374sizeVpY3zN4(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, C5963m.f85030l, 0.0f, 11, null), C5963m.f85032n, C5963m.f85033o), 4), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i10 & 14, 0, 4092);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2(str, i7, i8) { // from class: com.bilibili.playset.editor.widget.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f84994a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f84995b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f84996c;

                {
                    this.f84994a = str;
                    this.f84995b = i7;
                    this.f84996c = i8;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f84996c | 1);
                    EditorCommonKt.a(this.f84994a, (Composer) obj, this.f84995b, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r6, final int r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.b(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(@org.jetbrains.annotations.NotNull final java.lang.String r26, final int r27, final float r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r29, long r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.c(java.lang.String, int, float, kotlin.jvm.functions.Function0, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(@NotNull Modifier modifier, @Nullable Composer composer, int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2134564970);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2134564970, i8, -1, "com.bilibili.playset.editor.widget.PlaySetEditorError (EditorCommon.kt:167)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            Painter painterPainterResource = PainterResources_androidKt.painterResource(2131232151, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m1374sizeVpY3zN4(companion2, Dp.m3880constructorimpl(280), Dp.m3880constructorimpl(158)), (Alignment) null, ContentScale.Companion.getInside(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 25008, 104);
            String strStringResource = StringResources_androidKt.stringResource(2131841340, composerStartRestartGroup, 0);
            int iM3794getCentere0LSkKk = TextAlign.Companion.m3794getCentere0LSkKk();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(10), 0.0f, 0.0f, 13, null), biliTheme.getThemeColors(composerStartRestartGroup, i9).getTextTitle-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3794getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12(), composerStartRestartGroup, 48, 0, 65016);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.bilibili.ogv.kmm.operation.vippreview.l(modifier, i7, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0369  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(@org.jetbrains.annotations.NotNull final java.lang.String r33, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r34, int r35, long r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.e(java.lang.String, kotlin.jvm.functions.Function1, int, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@NotNull final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1397884382);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, 1 & i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1397884382, i8, -1, "com.bilibili.playset.editor.widget.PlaySetEditorLoading (EditorCommon.kt:142)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
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
            String imageUrl = AppResUtil.getImageUrl("img_holder_loading_style1.webp");
            Modifier.Companion companion2 = Modifier.Companion;
            BiliImageKt.BiliImage(imageUrl, SizeKt.m1374sizeVpY3zN4(companion2, Dp.m3880constructorimpl(280), Dp.m3880constructorimpl(158)), (String) null, false, 0, (String) null, false, (Function3) null, (Alignment) null, ContentScale.Companion.getInside(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 805306416, 0, 3580);
            String strStringResource = StringResources_androidKt.stringResource(2131841549, composerStartRestartGroup, 0);
            int iM3794getCentere0LSkKk = TextAlign.Companion.m3794getCentere0LSkKk();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, PaddingKt.m1346paddingqDBjuR0$default(companion2, 0.0f, Dp.m3880constructorimpl(10), 0.0f, 0.0f, 13, null), biliTheme.getThemeColors(composerStartRestartGroup, i9).getTextTitle-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3794getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT12(), composerStartRestartGroup, 48, 0, 65016);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(modifier, i7, i10) { // from class: com.bilibili.playset.editor.widget.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84998a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f84999b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f85000c;

                {
                    this.f84998a = i10;
                    this.f85000c = modifier;
                    this.f84999b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = this.f84998a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i11) {
                        case 0:
                            EditorCommonKt.f((Modifier) this.f85000c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f84999b | 1));
                            break;
                        default:
                            g80.j.e((Function0) this.f85000c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f84999b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0357  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(@org.jetbrains.annotations.NotNull final js0.C7722d r33, @org.jetbrains.annotations.NotNull final java.lang.String r34, final boolean r35, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r36, long r37, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 1804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.g(js0.d, java.lang.String, boolean, kotlin.jvm.functions.Function1, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(final boolean r26, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r27, long r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.h(boolean, kotlin.jvm.functions.Function1, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    public static final Modifier i(@NotNull Modifier modifier, long j7) {
        float f7 = C5963m.f85020a;
        return PaddingKt.m1344paddingVpY3zN4$default(SizeKt.m1358height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m1168backgroundbw27NRU(modifier, j7, RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(C5963m.f85027i)), 0.0f, 1, null), C5963m.f85026g), C5963m.f85030l, 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<com.bilibili.playset.editor.widget.C5951a> j(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super js0.InterfaceC7721c, kotlin.Unit> r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L11
            r0 = 1081455265(0x4075b2a1, float:3.8390276)
            r1 = r14
            r2 = -1
            java.lang.String r3 = "com.bilibili.playset.editor.widget.rememberCoverPickerItems (EditorCommon.kt:99)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L11:
            r0 = 2131851925(0x7f117a95, float:1.9337454E38)
            r1 = r13
            r2 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r2)
            r19 = r0
            r0 = 2131842607(0x7f11562f, float:1.9318555E38)
            r1 = r13
            r2 = 0
            java.lang.String r0 = androidx.compose.ui.res.StringResources_androidKt.stringResource(r0, r1, r2)
            r20 = r0
            r0 = r13
            r1 = r19
            boolean r0 = r0.changed(r1)
            r15 = r0
            r0 = r13
            r1 = r20
            boolean r0 = r0.changed(r1)
            r16 = r0
            r0 = r13
            java.lang.Object r0 = r0.rememberedValue()
            r18 = r0
            r0 = r15
            r1 = r16
            r0 = r0 | r1
            if (r0 != 0) goto L56
            r0 = r18
            r17 = r0
            r0 = r18
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L94
        L56:
            r0 = 2
            com.bilibili.playset.editor.widget.a[] r0 = new com.bilibili.playset.editor.widget.C5951a[r0]
            r1 = r0
            r2 = 0
            com.bilibili.playset.editor.widget.a r3 = new com.bilibili.playset.editor.widget.a
            r4 = r3
            r5 = 2
            r6 = r19
            DR0.b r7 = new DR0.b
            r8 = r7
            r9 = r12
            r10 = 3
            r8.<init>(r9, r10)
            r4.<init>(r5, r6, r7)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            com.bilibili.playset.editor.widget.a r3 = new com.bilibili.playset.editor.widget.a
            r4 = r3
            r5 = 2
            r6 = r20
            DW.b r7 = new DW.b
            r8 = r7
            r9 = r12
            r10 = 6
            r8.<init>(r9, r10)
            r4.<init>(r5, r6, r7)
            r1[r2] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r17 = r0
            r0 = r13
            r1 = r17
            r0.updateRememberedValue(r1)
        L94:
            r0 = r17
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto La3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La3:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.EditorCommonKt.j(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):java.util.List");
    }
}
