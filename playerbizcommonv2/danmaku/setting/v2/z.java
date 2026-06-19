package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/z.class */
@StabilityInferred(parameters = 1)
public final class z implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81507b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/z$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81511d;

        public a(String str, String str2, int i7, int i8) {
            i7 = (i8 & 16) != 0 ? R$color.Text2 : i7;
            this.f81508a = str;
            this.f81509b = str2;
            this.f81510c = 45;
            this.f81511d = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81508a, aVar.f81508a) && Intrinsics.areEqual(this.f81509b, aVar.f81509b) && this.f81510c == aVar.f81510c && this.f81511d == aVar.f81511d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81511d) + androidx.compose.animation.core.I.a(this.f81510c, I.E.a(androidx.compose.animation.core.I.a(2131238702, this.f81508a.hashCode() * 31, 31), 31, this.f81509b), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ResetConfig(title=");
            sb.append(this.f81508a);
            sb.append(", icon=2131238702, iconDesc=");
            sb.append(this.f81509b);
            sb.append(", height=");
            sb.append(this.f81510c);
            sb.append(", textColor=");
            return C4277b.a(this.f81511d, ")", sb);
        }
    }

    public z(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f81506a = aVar;
        this.f81507b = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1607130702, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z f81505a;

            {
                this.f81505a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1607130702, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsResetComponent.bindToView.<anonymous> (DanmakuSettingsResetComponent.kt:44)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1344523414, true, new com.bilibili.ad.reward.activity.t(this.f81505a, 2), composer, 54), composer, 384, 3);
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

    @NotNull
    public final Object contentEqualityKey() {
        return this.f81506a.f81508a;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81506a.f81508a;
    }
}
