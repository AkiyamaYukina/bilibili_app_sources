package com.bilibili.ship.theseus.ogv.intro.role;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.J;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.iconfont.BiliIconfont;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.framework.exposure.core.ExposureEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/j.class */
@StabilityInferred(parameters = 0)
public final class j implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f93475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f93476b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/j$a.class */
    public static final class a implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93477a;

        public a(List list) {
            this.f93477a = list;
        }

        public final Object invoke(Object obj) {
            this.f93477a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/j$b.class */
    public static final class b implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f93478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f93479b;

        public b(List list, j jVar) {
            this.f93478a = list;
            this.f93479b = jVar;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i7;
            LazyItemScope lazyItemScope = (LazyItemScope) obj;
            int iIntValue = ((Number) obj2).intValue();
            Composer composer = (Composer) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
            } else {
                i7 = iIntValue2;
            }
            int i8 = i7;
            if ((iIntValue2 & 48) == 0) {
                i8 = i7 | (composer.changed(iIntValue) ? 32 : 16);
            }
            if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, i8, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                k kVar = (k) this.f93478a.get(iIntValue);
                composer.startReplaceGroup(-1903914370);
                this.f93479b.a(kVar, composer, ExposureEntry.$stable << 3);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public j(@NotNull e eVar, @NotNull ExposureEntry exposureEntry) {
        this.f93475a = eVar;
        this.f93476b = exposureEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final com.bilibili.ship.theseus.ogv.intro.role.k r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.j.a(com.bilibili.ship.theseus.ogv.intro.role.k, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final java.util.List<com.bilibili.ship.theseus.ogv.intro.role.k> r15, final float r16, androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.j.b(java.util.List, float, androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-208110187, true, new YI0.d(this, 1)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void c(final e eVar, final Modifier modifier, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1065730651);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(eVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1065730651, i9, -1, "com.bilibili.ship.theseus.ogv.intro.role.OgvRoleUIComponent.OgvRolesTitle (OgvRoleUIComponent.kt:64)");
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
            String str = (String) eVar.f93458b.getValue();
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i10 = BiliTheme.$stable;
            long j7 = biliTheme.getColors(composerStartRestartGroup, i10).getText1-0d7_KjU();
            TextStyle t14 = biliTheme.getTextStyle(composerStartRestartGroup, i10).getT14();
            Modifier.Companion companion3 = Modifier.Companion;
            TextKt.m1772Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), j7, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, t14, composerStartRestartGroup, 0, 0, 65528);
            if (((List) eVar.f93460d.getValue()).size() > 1) {
                composerStartRestartGroup.startReplaceGroup(-926596723);
                TextKt.m1772Text4IGK_g((String) eVar.f93459c.getValue(), (Modifier) null, biliTheme.getColors(composerStartRestartGroup, i10).getText3-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composerStartRestartGroup, i10).getT12(), composerStartRestartGroup, 0, 0, 65530);
                J.a(2, 6, composerStartRestartGroup, companion3);
                IconKt.m1714Iconww6aTOc(BiliIconfont.INSTANCE.getArrow_forward_right_line_500(composerStartRestartGroup, 6), (String) null, SizeKt.m1372size3ABfNKs(rowScopeInstance.align(companion3, companion.getCenterVertically()), Dp.m3880constructorimpl(16)), biliTheme.getColors(composerStartRestartGroup, i10).getGraph_medium-0d7_KjU(), composerStartRestartGroup, Painter.$stable | 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-926023967);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, eVar, modifier, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.role.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final j f93464a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final e f93465b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Modifier f93466c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f93467d;

                {
                    this.f93464a = this;
                    this.f93465b = eVar;
                    this.f93466c = modifier;
                    this.f93467d = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f93467d | 1);
                    e eVar2 = this.f93465b;
                    Modifier modifier2 = this.f93466c;
                    this.f93464a.c(eVar2, modifier2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
