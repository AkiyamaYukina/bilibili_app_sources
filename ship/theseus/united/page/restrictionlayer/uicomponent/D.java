package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

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
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.restrictionlayer.BackgroundVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6378c;
import com.bilibili.ship.theseus.united.page.restrictionlayer.QRCode;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/D.class */
@StabilityInferred(parameters = 0)
public final class D implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextVo f102764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f102765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final BackgroundVo f102766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C6378c> f102767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final QRCode f102768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f102769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ExposureEntry f102770g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102771i;

    public D(@Nullable TextVo textVo, @Nullable TextVo textVo2, @Nullable BackgroundVo backgroundVo, @NotNull List list, @Nullable QRCode qRCode, boolean z6, @Nullable ExposureEntry exposureEntry, boolean z7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102764a = textVo;
        this.f102765b = textVo2;
        this.f102766c = backgroundVo;
        this.f102767d = list;
        this.f102768e = qRCode;
        this.f102769f = z6;
        this.f102770g = exposureEntry;
        this.h = z7;
        this.f102771i = j7;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1250098727);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250098727, i8, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionMultipleDevicesUIComponent.Content (RestrictionMultipleDevicesUIComponent.kt:54)");
            }
            final boolean z6 = !this.h;
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1018257263, true, new Function2(this, z6) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final D f102760a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f102761b;

                {
                    this.f102760a = this;
                    this.f102761b = z6;
                }

                /* JADX WARN: Removed duplicated region for block: B:112:0x07a8  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x043f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 2081
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.B.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.C

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final D f102762a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f102763b;

                {
                    this.f102762a = this;
                    this.f102763b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f102763b | 1);
                    this.f102762a.a((Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1341445103, true, new Function2(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f102759a;

            {
                this.f102759a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1341445103, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionMultipleDevicesUIComponent.bindToView.<anonymous> (RestrictionMultipleDevicesUIComponent.kt:41)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(2082419033, true, new com.bilibili.bplus.im.communication.widget.k(this.f102759a, 1), composer, 54), composer, 384, 3);
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

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setClickable(true);
        return new UIComponent.b(composeView);
    }
}
