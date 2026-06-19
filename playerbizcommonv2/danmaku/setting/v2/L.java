package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/L.class */
@StabilityInferred(parameters = 1)
public final class L implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f81364b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/L$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f81367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81370f;

        public /* synthetic */ a(String str, DanmakuSettingsStyle danmakuSettingsStyle, int i7, int i8, int i9) {
            this(str, "", danmakuSettingsStyle, i7, i8, i9);
        }

        public a(@NotNull String str, @NotNull String str2, @NotNull DanmakuSettingsStyle danmakuSettingsStyle, @ColorRes int i7, @ColorRes int i8, @ColorRes int i9) {
            this.f81365a = str;
            this.f81366b = str2;
            this.f81367c = danmakuSettingsStyle;
            this.f81368d = i7;
            this.f81369e = i8;
            this.f81370f = i9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81365a, aVar.f81365a) && Intrinsics.areEqual(this.f81366b, aVar.f81366b) && this.f81367c == aVar.f81367c && this.f81368d == aVar.f81368d && this.f81369e == aVar.f81369e && this.f81370f == aVar.f81370f;
        }

        public final int hashCode() {
            int iA = I.E.a(this.f81365a.hashCode() * 31, 31, this.f81366b);
            return Integer.hashCode(this.f81370f) + androidx.compose.animation.core.I.a(this.f81369e, androidx.compose.animation.core.I.a(this.f81368d, (this.f81367c.hashCode() + iA) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleConfig(title=");
            sb.append(this.f81365a);
            sb.append(", subtitle=");
            sb.append(this.f81366b);
            sb.append(", style=");
            sb.append(this.f81367c);
            sb.append(", bgColor=");
            sb.append(this.f81368d);
            sb.append(", textColor=");
            sb.append(this.f81369e);
            sb.append(", dividerColor=");
            return C4277b.a(this.f81370f, ")", sb);
        }
    }

    public L(@NotNull a aVar, @NotNull Function0<Unit> function0) {
        this.f81363a = aVar;
        this.f81364b = function0;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-308890068, true, new com.bilibili.bplus.im.communication.H(this, 1)));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return this.f81363a.f81365a;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81363a.f81365a;
    }
}
