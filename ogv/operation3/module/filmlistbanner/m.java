package com.bilibili.ogv.operation3.module.filmlistbanner;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.H;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.ogv.operation3.module.filmlistbanner.c;
import com.bilibili.search2.api.SearchBangumiItem;
import jl0.C7707a;
import kntr.app.mall.mall.base.ui.z;
import kntr.base.imageloader.BiliImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/m.class */
public final class m {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(final int i7, @Nullable Composer composer, @Nullable Modifier modifier, final boolean z6) {
        int i8;
        Modifier modifier2;
        long jM2628copywmQWz5c$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(800460578);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z6) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8 | 48;
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(800460578, i9, -1, "com.bilibili.ogv.operation3.module.filmlistbanner.FilmListHubBannerDotItem (FilmListHubBannerUi.kt:19)");
            }
            Modifier modifierM1374sizeVpY3zN4 = SizeKt.m1374sizeVpY3zN4(companion, Dp.m3880constructorimpl(z6 ? 8 : 4), Dp.m3880constructorimpl(4));
            if (z6) {
                composerStartRestartGroup.startReplaceGroup(863004588);
                jM2628copywmQWz5c$default = BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_white-0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(863094457);
                jM2628copywmQWz5c$default = Color.m2628copywmQWz5c$default(BiliTheme.INSTANCE.getColors(composerStartRestartGroup, BiliTheme.$stable).getGraph_white-0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            BoxKt.Box(H.a(2, modifierM1374sizeVpY3zN4, jM2628copywmQWz5c$default), composerStartRestartGroup, 0);
            modifier2 = companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                modifier2 = companion;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, modifier3, z6) { // from class: com.bilibili.ogv.operation3.module.filmlistbanner.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f71313a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f71314b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f71315c;

                {
                    this.f71313a = z6;
                    this.f71314b = modifier3;
                    this.f71315c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.a(RecomposeScopeImplKt.updateChangedFlags(this.f71315c | 1), (Composer) obj, this.f71314b, this.f71313a);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@NotNull final c.C0444c c0444c, @Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497078638);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(c0444c) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changed(modifier) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497078638, i9, -1, "com.bilibili.ogv.operation3.module.filmlistbanner.InnerTabItem (FilmListHubBannerUi.kt:42)");
            }
            BiliImageKt.BiliImage(C7707a.a(c0444c.f71271a, null, null, false, false, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI), modifier, (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, b.f71265a, (Function4) null, composerStartRestartGroup, (i9 & 112) | 100663296, 764);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i10 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(i7, i10, modifier, c0444c) { // from class: com.bilibili.ogv.operation3.module.filmlistbanner.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f71309a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f71310b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f71311c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f71312d;

                {
                    this.f71309a = i10;
                    this.f71312d = c0444c;
                    this.f71310b = modifier;
                    this.f71311c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = this.f71309a;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i11) {
                        case 0:
                            m.b((c.C0444c) this.f71312d, this.f71310b, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f71311c | 1));
                            break;
                        default:
                            z.a((kntr.common.compose.pulltorefresh.j) this.f71312d, this.f71310b, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f71311c | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
