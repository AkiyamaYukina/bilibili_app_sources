package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.stepbystep.StepByStepBottomSheetLoginActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/w.class */
@StabilityInferred(parameters = 1)
public final class w implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f96101a;

    public w(@NotNull String str) {
        this.f96101a = str;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1484472955);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1484472955, i8, -1, "com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportPageAreaComponent.PageAreaNotSupportUI (PlaylistNotSupportPageAreaComponent.kt:33)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-495133133, true, new com.bilibili.bplus.followinglist.page.search.result.a(this, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = 0;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7, i9) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f96098a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f96099b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f96100c;

                {
                    this.f96098a = i9;
                    this.f96100c = this;
                    this.f96099b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    Integer num = (Integer) obj2;
                    switch (this.f96098a) {
                        case 0:
                            num.intValue();
                            ((w) this.f96100c).a(composer2, RecomposeScopeImplKt.updateChangedFlags(this.f96099b | 1));
                            break;
                        default:
                            num.getClass();
                            iZ0.c.b((Modifier) this.f96100c, composer2, RecomposeScopeImplKt.updateChangedFlags(this.f96099b | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1482296020, true, new Function2(this, i7) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f96097b;

            {
                this.f96096a = i7;
                this.f96097b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = this.f96097b;
                boolean z6 = false;
                switch (this.f96096a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1482296020, iIntValue, -1, "com.bilibili.ship.theseus.playlist.uicomponent.PlaylistNotSupportPageAreaComponent.bindToView.<anonymous> (PlaylistNotSupportPageAreaComponent.kt:28)");
                            }
                            ((w) obj3).a(composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        Composer composer2 = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i8 = StepByStepBottomSheetLoginActivity.C;
                        if ((iIntValue2 & 3) != 2) {
                            z6 = true;
                        }
                        if (composer2.shouldExecute(z6, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1057102952, iIntValue2, -1, "tv.danmaku.bili.stepbystep.StepByStepBottomSheetLoginActivity.onCreate.<anonymous> (StepByStepBottomSheetLoginActivity.kt:115)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-648685744, true, new tv.danmaku.bili.stepbystep.f((StepByStepBottomSheetLoginActivity) obj3), composer2, 54), composer2, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
