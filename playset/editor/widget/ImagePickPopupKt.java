package com.bilibili.playset.editor.widget;

import Di0.C1602f;
import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt.class */
public final class ImagePickPopupKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5951a f84900a;

        public a(C5951a c5951a) {
            this.f84900a = c5951a;
        }

        public final Object invoke() {
            this.f84900a.f84982c.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt$b.class */
    public static final class b implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f84901a;

        public b(List list) {
            this.f84901a = list;
        }

        public final Object invoke(Object obj) {
            this.f84901a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/ImagePickPopupKt$c.class */
    public static final class c implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f84902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f84903b;

        public c(List list, List list2) {
            this.f84902a = list;
            this.f84903b = list2;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 749
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.ImagePickPopupKt.c.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final int r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, @org.jetbrains.annotations.NotNull final java.util.List r14, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.ImagePickPopupKt.a(int, androidx.compose.runtime.Composer, java.util.List, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0358  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.util.List<com.bilibili.playset.editor.widget.C5951a> r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.widget.ImagePickPopupKt.b(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final C5951a c5951a, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-540547182);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(c5951a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540547182, i8, -1, "com.bilibili.playset.editor.widget.PopupItem (ImagePickPopup.kt:172)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierA = Fa.z.a(200, companion, 0.0f, 1, (Object) null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            String str = c5951a.f84980a;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            int iM3799getStarte0LSkKk = TextAlign.Companion.m3799getStarte0LSkKk();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i9 = BiliTheme.$stable;
            float f7 = 12;
            TextKt.m1772Text4IGK_g(str2, RowScope.weight$default(rowScopeInstance, PaddingKt.m1346paddingqDBjuR0$default(companion, Dp.m3880constructorimpl(16), 0.0f, Dp.m3880constructorimpl(f7), 0.0f, 10, null), 1.0f, false, 2, null), biliTheme.getColors(composerStartRestartGroup, i9).getText1-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3787boximpl(iM3799getStarte0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i9).getT14(), composerStartRestartGroup, 0, 0, 65016);
            if (c5951a.f84981b) {
                IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) LA.f.b(composerStartRestartGroup, -311298106), 2131238689), composerStartRestartGroup, 0), (String) null, SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3880constructorimpl(20), 0.0f, 11, null), Dp.m3880constructorimpl(f7)), biliTheme.getColors(composerStartRestartGroup, i9).getText3-0d7_KjU(), composerStartRestartGroup, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-310861812);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(c5951a, i7) { // from class: com.bilibili.playset.editor.widget.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5951a f85056a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f85057b;

                {
                    this.f85056a = c5951a;
                    this.f85057b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f85057b | 1);
                    ImagePickPopupKt.c(this.f85056a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
