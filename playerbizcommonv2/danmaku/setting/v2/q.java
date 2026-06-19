package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/q.class */
@StabilityInferred(parameters = 0)
public final class q implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Bs.w f81453b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/q$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f81454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f81456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81460g;

        public a() {
            throw null;
        }

        public a(MutableStateFlow mutableStateFlow, String str, int i7, int i8, int i9, int i10) {
            DanmakuSettingsStyle danmakuSettingsStyle = DanmakuSettingsStyle.MIDDLE;
            this.f81454a = mutableStateFlow;
            this.f81455b = str;
            this.f81456c = danmakuSettingsStyle;
            this.f81457d = i7;
            this.f81458e = i8;
            this.f81459f = i9;
            this.f81460g = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81454a, aVar.f81454a) && Intrinsics.areEqual(this.f81455b, aVar.f81455b) && this.f81456c == aVar.f81456c && this.f81457d == aVar.f81457d && this.f81458e == aVar.f81458e && this.f81459f == aVar.f81459f && this.f81460g == aVar.f81460g;
        }

        public final int hashCode() {
            int iA = I.E.a(this.f81454a.hashCode() * 31, 31, this.f81455b);
            return Integer.hashCode(this.f81460g) + androidx.compose.animation.core.I.a(this.f81459f, androidx.compose.animation.core.I.a(this.f81458e, androidx.compose.animation.core.I.a(this.f81457d, (this.f81456c.hashCode() + iA) * 31, 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtraConfig(availableFlow=");
            sb.append(this.f81454a);
            sb.append(", title=");
            sb.append(this.f81455b);
            sb.append(", style=");
            sb.append(this.f81456c);
            sb.append(", bgColor=");
            sb.append(this.f81457d);
            sb.append(", selectorBgColor=");
            sb.append(this.f81458e);
            sb.append(", textColor=");
            sb.append(this.f81459f);
            sb.append(", dividerColor=");
            return C4277b.a(this.f81460g, ")", sb);
        }
    }

    public q(@NotNull a aVar, @NotNull Bs.w wVar) {
        this.f81452a = aVar;
        this.f81453b = wVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-822647598, true, new com.bilibili.bplus.followinglist.dialog.cocreate.n(this, 1)));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return this.f81452a.f81455b;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81452a.f81455b;
    }
}
