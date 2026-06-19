package com.bilibili.playerbizcommonv2.widget.setting;

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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/J.class */
@StabilityInferred(parameters = 1)
public final class J implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final G f83095a;

    public J(@NotNull G g7) {
        this.f83095a = g7;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1352896886, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.widget.setting.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final J f83093a;

            {
                this.f83093a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1352896886, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingSelectComposeComponent.bindToView.<anonymous> (PlayerSettingCompose.kt:320)");
                    }
                    ThemeStrategy themeStrategy = ThemeStrategy.ForceDay;
                    final J j7 = this.f83093a;
                    BiliThemeKt.BiliTheme(themeStrategy, false, ComposableLambdaKt.rememberComposableLambda(-539197762, true, new Function2(j7) { // from class: com.bilibili.playerbizcommonv2.widget.setting.I

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final J f83094a;

                        {
                            this.f83094a = j7;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-539197762, iIntValue2, -1, "com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingSelectComposeComponent.bindToView.<anonymous>.<anonymous> (PlayerSettingCompose.kt:321)");
                                }
                                PlayerSettingComposeKt.f(this.f83094a.f83095a, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 390, 2);
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
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
