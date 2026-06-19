package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerComponentKt.class */
public final class CheeseBottomContainerComponentKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final d.a aVar, Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1187861093);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1187861093, i8, -1, "com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerComposeView (CheeseBottomContainerComponent.kt:66)");
            }
            final TextStyle t10 = BiliTheme.INSTANCE.getTextStyle(composerStartRestartGroup, BiliTheme.$stable).getT10();
            final float fM3880constructorimpl = Dp.m3880constructorimpl(10);
            final float fM3880constructorimpl2 = Dp.m3880constructorimpl(60);
            final float fM3880constructorimpl3 = Dp.m3880constructorimpl(40);
            final float fM3880constructorimpl4 = Dp.m3880constructorimpl(24);
            final float fM3880constructorimpl5 = Dp.m3880constructorimpl(2);
            final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            State stateCollectAsState = SnapshotStateKt.collectAsState(aVar.f89070b, null, composerStartRestartGroup, 0, 1);
            final State stateCollectAsState2 = SnapshotStateKt.collectAsState(aVar.f89071c, null, composerStartRestartGroup, 0, 1);
            final boolean z6 = ((Boolean) stateCollectAsState.getValue()).booleanValue() || com.bilibili.ship.theseus.united.page.screensize.b.c((WindowSizeClass) stateCollectAsState2.getValue());
            final n nVar = aVar.f89069a;
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(357953875, true, new Function2(z6, fM3880constructorimpl2, nVar, fM3880constructorimpl, fM3880constructorimpl3, view, fM3880constructorimpl4, fM3880constructorimpl5, t10, stateCollectAsState2) { // from class: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f89072a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f89073b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final n f89074c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final float f89075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final float f89076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final View f89077f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final float f89078g;
                public final float h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final TextStyle f89079i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final State f89080j;

                {
                    this.f89072a = z6;
                    this.f89073b = fM3880constructorimpl2;
                    this.f89074c = nVar;
                    this.f89075d = fM3880constructorimpl;
                    this.f89076e = fM3880constructorimpl3;
                    this.f89077f = view;
                    this.f89078g = fM3880constructorimpl4;
                    this.h = fM3880constructorimpl5;
                    this.f89079i = t10;
                    this.f89080j = stateCollectAsState2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:135:0x0a20  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x0db6  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0347  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0569  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0736  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0795  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 3806
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(aVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.a f89081a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89082b;

                {
                    this.f89081a = aVar;
                    this.f89082b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f89082b | 1);
                    CheeseBottomContainerComponentKt.a(this.f89081a, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.CharSequence r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerComponentKt.b(java.lang.CharSequence, androidx.compose.runtime.Composer, int):void");
    }
}
