package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.authorspace.ui.pages.game.g;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderUIComponent.class */
@StabilityInferred(parameters = 0)
public final class OgvReserveReminderUIComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvReserveReminderVo f93378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f93380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f93381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final e f93382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.music.podcast.moss.b f93383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final f f93384g;

    @NotNull
    public final ExposureEntry h = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new g(this, 3));

    public OgvReserveReminderUIComponent(@NotNull OgvReserveReminderVo ogvReserveReminderVo, long j7, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull e eVar, @NotNull com.bilibili.music.podcast.moss.b bVar, @NotNull f fVar) {
        this.f93378a = ogvReserveReminderVo;
        this.f93379b = j7;
        this.f93380c = stateFlow;
        this.f93381d = stateFlow2;
        this.f93382e = eVar;
        this.f93383f = bVar;
        this.f93384g = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0370  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.runtime.Composer r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponent.a(androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        UIComponent.b bVar = (UIComponent.b) viewEntry;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.a, this.h);
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(-410324159, true, new Function2(this) { // from class: com.bilibili.ship.theseus.ogv.intro.reservereminder.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvReserveReminderUIComponent f93408a;

            {
                this.f93408a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-410324159, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponent.bindToView.<anonymous> (OgvReserveReminderUIComponent.kt:84)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1447790855, true, new YH.a(this.f93408a, 1), composer, 54), composer, 384, 3);
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
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
