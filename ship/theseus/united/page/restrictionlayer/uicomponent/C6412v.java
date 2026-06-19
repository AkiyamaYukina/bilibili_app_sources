package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kntr.base.imageloader.BiliImageKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/v.class */
@StabilityInferred(parameters = 0)
public final class C6412v implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f102907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f102908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f102909f;

    public C6412v(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7, boolean z6, boolean z7, @NotNull Flow flow, boolean z8) {
        this.f102904a = m7;
        this.f102905b = j7;
        this.f102906c = z6;
        this.f102907d = z7;
        this.f102908e = flow;
        this.f102909f = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x074d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M r14, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.J r15, final boolean r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 2219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6412v.a(com.bilibili.ship.theseus.united.page.restrictionlayer.M, com.bilibili.ship.theseus.united.page.restrictionlayer.J, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void b(@NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(985672178);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(m7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985672178, i8, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingTextUIComponent.ContentBackground (RestrictionChargingTextUIComponent.kt:234)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            String str = m7.f102586n;
            Unit unit = null;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-289269424);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                BiliImageKt.BiliImage(com.bilibili.ad.adview.story.card.card53.select.component.t.a(ContentScale.Companion, Fa.A.a(composerStartRestartGroup, -289269423, str)), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composerStartRestartGroup, 48, 1020);
                composerStartRestartGroup.endReplaceGroup();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                composerStartRestartGroup.startReplaceGroup(-288989400);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m2655getBlack0d7_KjU(), null, 2, null), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(821952361);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, m7, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6412v f102895a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102896b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f102897c;

                {
                    this.f102895a = this;
                    this.f102896b = m7;
                    this.f102897c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102897c | 1);
                    this.f102895a.b(this.f102896b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1260961367, true, new Function2(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6412v f102888a;

            {
                this.f102888a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1260961367, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingTextUIComponent.bindToView.<anonymous> (RestrictionChargingTextUIComponent.kt:51)");
                    }
                    final C6412v c6412v = this.f102888a;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(210427121, true, new Function2(c6412v) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.r

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6412v f102889a;

                        {
                            this.f102889a = c6412v;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(210427121, iIntValue2, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionChargingTextUIComponent.bindToView.<anonymous>.<anonymous> (RestrictionChargingTextUIComponent.kt:52)");
                                }
                                C6412v c6412v2 = this.f102889a;
                                c6412v2.a(c6412v2.f102904a, c6412v2.f102905b, ((Boolean) SnapshotStateKt.collectAsState(c6412v2.f102908e, Boolean.FALSE, null, composer2, 48, 2).getValue()).booleanValue(), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0316  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.united.page.restrictionlayer.M r35, @org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r36, final boolean r37, final boolean r38, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 2221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C6412v.c(com.bilibili.ship.theseus.united.page.restrictionlayer.M, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setClickable(true);
        return new UIComponent.b(composeView);
    }
}
