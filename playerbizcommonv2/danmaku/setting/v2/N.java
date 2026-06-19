package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import L3.c0;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/N.class */
@StabilityInferred(parameters = 1)
public final class N implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81373b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/N$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f81378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81380g;

        public a(String str, int i7, int i8, int i9, boolean z6) {
            z6 = (i9 & 2) != 0 ? false : z6;
            i7 = (i9 & 32) != 0 ? R$color.Text1 : i7;
            i8 = (i9 & 64) != 0 ? R$color.Text2 : i8;
            this.f81374a = str;
            this.f81375b = z6;
            this.f81376c = 2131846653;
            this.f81377d = 2131238665;
            this.f81378e = "";
            this.f81379f = i7;
            this.f81380g = i8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81374a, aVar.f81374a) && this.f81375b == aVar.f81375b && this.f81376c == aVar.f81376c && this.f81377d == aVar.f81377d && Intrinsics.areEqual(this.f81378e, aVar.f81378e) && this.f81379f == aVar.f81379f && this.f81380g == aVar.f81380g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81380g) + androidx.compose.animation.core.I.a(this.f81379f, I.E.a(androidx.compose.animation.core.I.a(this.f81377d, androidx.compose.animation.core.I.a(this.f81376c, androidx.compose.animation.z.a(this.f81374a.hashCode() * 31, 31, this.f81375b), 31), 31), 31, this.f81378e), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleConfig(title=");
            sb.append(this.f81374a);
            sb.append(", showAction=");
            sb.append(this.f81375b);
            sb.append(", actionText=");
            sb.append(this.f81376c);
            sb.append(", actionIconRes=");
            sb.append(this.f81377d);
            sb.append(", actionIconDesc=");
            sb.append(this.f81378e);
            sb.append(", titleTextColor=");
            sb.append(this.f81379f);
            sb.append(", actionTextColor=");
            return C4277b.a(this.f81380g, ")", sb);
        }
    }

    public /* synthetic */ N(a aVar) {
        this(aVar, new c0(7));
    }

    public N(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f81372a = aVar;
        this.f81373b = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-2118695470, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final N f81371a;

            {
                this.f81371a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2118695470, iIntValue, -1, "com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsTitleComponent.bindToView.<anonymous> (DanmakuSettingsTitleComponent.kt:46)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1856088182, true, new Ea.C(this.f81371a, 1), composer, 54), composer, 384, 3);
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
        return Boolean.valueOf(this.f81372a.f81375b);
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81372a.f81374a;
    }
}
