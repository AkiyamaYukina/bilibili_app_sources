package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingButtonComponent.class */
@StabilityInferred(parameters = 0)
public final class VideoSettingButtonComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f83207a;

    public VideoSettingButtonComponent(@NotNull List<c> list) {
        this.f83207a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final com.bilibili.playerbizcommonv2.widget.setting.channel.c r27, androidx.compose.runtime.Composer r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 1237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingButtonComponent.a(com.bilibili.playerbizcommonv2.widget.setting.channel.c, androidx.compose.runtime.Composer, int):void");
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1235410860, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoSettingButtonComponent f83231a;

            {
                this.f83231a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235410860, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingButtonComponent.bindToView.<anonymous> (VideoSettingButtonComponent.kt:50)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-972803572, true, new com.bilibili.bplus.followinglist.opus.list.component.b(1, this.f83231a), composer, 54), composer, 384, 3);
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
        ViewCompositionStrategy.Companion.getClass();
        return com.bilibili.app.gemini.ui.c.b(context, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
    }
}
