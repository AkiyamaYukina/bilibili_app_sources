package com.bilibili.ship.theseus.ugc.intro.videomentioned.module;

import Di0.C1602f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.playerbizcommonv2.videomentioned.A;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.upper.module.contribute.edit.VideoGenerateListenerV4Fragment;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptUpActivityV5;
import com.bilibili.videoshortcut.sidecenter.selection.SideCenterShortcutsFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/VideoMentionedModuleComponent.class */
@StabilityInferred(parameters = 0)
public final class VideoMentionedModuleComponent<E extends UIComponent.ViewEntry> implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final A<E> f97870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f97871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97873d = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new O41.g(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/VideoMentionedModuleComponent$a.class */
    public interface a {
        void a();

        <E extends UIComponent.ViewEntry> void b(@NotNull MentionedCardItem<E> mentionedCardItem);
    }

    public VideoMentionedModuleComponent(@NotNull A<E> a7, @NotNull a aVar, @NotNull StateFlow<Integer> stateFlow) {
        this.f97870a = a7;
        this.f97871b = aVar;
        this.f97872c = stateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final int r8, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r9, final int r10) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.a(int, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final java.lang.String r28, final java.lang.String r29, androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.b(java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.a, this.f97873d);
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(1163596850, true, new Function2(this) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoMentionedModuleComponent f97882a;

            {
                this.f97882a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1163596850, iIntValue, -1, "com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.bindToView.<anonymous> (VideoMentionedModuleComponent.kt:67)");
                    }
                    final VideoMentionedModuleComponent videoMentionedModuleComponent = this.f97882a;
                    final int i7 = 0;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-628036118, true, new Function2(videoMentionedModuleComponent, i7) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f97883a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f97884b;

                        {
                            this.f97883a = i7;
                            this.f97884b = videoMentionedModuleComponent;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            switch (this.f97883a) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-628036118, iIntValue2, -1, "com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.bindToView.<anonymous>.<anonymous> (VideoMentionedModuleComponent.kt:68)");
                                        }
                                        ((VideoMentionedModuleComponent) this.f97884b).e(composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Boolean bool = (Boolean) obj3;
                                    String str = (String) obj4;
                                    VideoGenerateListenerV4Fragment videoGenerateListenerV4Fragment = ((ManuscriptUpActivityV5.g) this.f97884b).a.q1;
                                    if (videoGenerateListenerV4Fragment == null) {
                                        return null;
                                    }
                                    videoGenerateListenerV4Fragment.kf(str, bool.booleanValue());
                                    return null;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1286220360, iIntValue3, -1, "com.bilibili.videoshortcut.sidecenter.selection.SideCenterShortcutsFragment.onCreateView.<anonymous>.<anonymous> (SideCenterShortcutsFragment.kt:57)");
                                        }
                                        SideCenterShortcutsFragment sideCenterShortcutsFragment = (SideCenterShortcutsFragment) this.f97884b;
                                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1679232912, true, new com.bilibili.videoshortcut.sidecenter.selection.f(sideCenterShortcutsFragment, SnapshotStateKt.collectAsState(sideCenterShortcutsFragment.hf().b, null, composer3, 0, 1)), composer3, 54), composer3, 384, 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x0221  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final int r9, androidx.compose.runtime.Composer r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.c(int, androidx.compose.runtime.Composer, int):void");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x026e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final int r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.d(int, androidx.compose.runtime.Composer, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void e(@Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1557618102);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1557618102, i8, -1, "com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.VideoMentionedContainer (VideoMentionedModuleComponent.kt:80)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(this.f97870a.f81980b, null, composerStartRestartGroup, 0, 1);
            Modifier modifierM1169backgroundbw27NRU$default = BackgroundKt.m1169backgroundbw27NRU$default(PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m3880constructorimpl(((Number) SnapshotStateKt.collectAsState(this.f97872c, null, composerStartRestartGroup, 0, 1).getValue()).intValue()), 0.0f, 2, null), BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getBg1-0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1169backgroundbw27NRU$default);
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
            int iIntValue = ((Number) stateCollectAsState.getValue()).intValue();
            int i9 = (i8 << 3) & 112;
            d(iIntValue, composerStartRestartGroup, i9);
            a(((Number) stateCollectAsState.getValue()).intValue(), composerStartRestartGroup, i9);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7) { // from class: com.bilibili.ship.theseus.ugc.intro.videomentioned.module.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoMentionedModuleComponent f97885a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f97886b;

                {
                    this.f97885a = this;
                    this.f97886b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f97886b | 1);
                    this.f97885a.e((Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
