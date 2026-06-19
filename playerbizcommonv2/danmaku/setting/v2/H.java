package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import L3.T;
import WI0.U;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.theme.R$color;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/H.class */
@StabilityInferred(parameters = 0)
public final class H implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f81328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f81329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f81330d = LazyKt.lazy(new T(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/H$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f81332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f81333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StateFlow<Float> f81334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f81335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f81336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final List<C0530a> f81337g;

        @NotNull
        public final DanmakuSettingsStyle h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81338i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81339j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f81340k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f81341l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f81342m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f81343n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f81344o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f81345p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f81346q;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.H$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/H$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0530a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f81347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f81348b;

            public C0530a(@NotNull String str, float f7) {
                this.f81347a = str;
                this.f81348b = f7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0530a)) {
                    return false;
                }
                C0530a c0530a = (C0530a) obj;
                return Intrinsics.areEqual(this.f81347a, c0530a.f81347a) && Float.compare(this.f81348b, c0530a.f81348b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f81348b) + (this.f81347a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Step(description=" + this.f81347a + ", progress=" + this.f81348b + ")";
            }
        }

        public a() {
            throw null;
        }

        public a(String str, float f7, float f8, StateFlow stateFlow, List list, DanmakuSettingsStyle danmakuSettingsStyle, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            list = (i16 & 64) != 0 ? CollectionsKt.emptyList() : list;
            danmakuSettingsStyle = (i16 & 128) != 0 ? DanmakuSettingsStyle.MIDDLE : danmakuSettingsStyle;
            i7 = (i16 & 256) != 0 ? R$color.Bg1_float : i7;
            i8 = (i16 & 512) != 0 ? R$color.Text1 : i8;
            i11 = (i16 & 4096) != 0 ? R$color.Ga2 : i11;
            i12 = (i16 & 8192) != 0 ? R$color.Text1 : i12;
            i13 = (i16 & 16384) != 0 ? R$color.Line_regular : i13;
            i14 = (32768 & i16) != 0 ? R$color.Text_white : i14;
            i15 = (i16 & 65536) != 0 ? R$color.Text_white : i15;
            this.f81331a = str;
            this.f81332b = f7;
            this.f81333c = f8;
            this.f81334d = stateFlow;
            this.f81335e = false;
            this.f81336f = true;
            this.f81337g = list;
            this.h = danmakuSettingsStyle;
            this.f81338i = i7;
            this.f81339j = i8;
            this.f81340k = i9;
            this.f81341l = i10;
            this.f81342m = i11;
            this.f81343n = i12;
            this.f81344o = i13;
            this.f81345p = i14;
            this.f81346q = i15;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81331a, aVar.f81331a) && Float.compare(this.f81332b, aVar.f81332b) == 0 && Float.compare(this.f81333c, aVar.f81333c) == 0 && Intrinsics.areEqual(this.f81334d, aVar.f81334d) && this.f81335e == aVar.f81335e && this.f81336f == aVar.f81336f && Intrinsics.areEqual(this.f81337g, aVar.f81337g) && this.h == aVar.h && this.f81338i == aVar.f81338i && this.f81339j == aVar.f81339j && this.f81340k == aVar.f81340k && this.f81341l == aVar.f81341l && this.f81342m == aVar.f81342m && this.f81343n == aVar.f81343n && this.f81344o == aVar.f81344o && this.f81345p == aVar.f81345p && this.f81346q == aVar.f81346q;
        }

        public final int hashCode() {
            int iA = e0.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.core.content.b.a(this.f81334d, androidx.compose.animation.n.a(this.f81333c, androidx.compose.animation.n.a(this.f81332b, this.f81331a.hashCode() * 31, 31), 31), 31), 31, this.f81335e), 31, this.f81336f), 31, this.f81337g);
            return Integer.hashCode(this.f81346q) + androidx.compose.animation.core.I.a(this.f81345p, androidx.compose.animation.core.I.a(this.f81344o, androidx.compose.animation.core.I.a(this.f81343n, androidx.compose.animation.core.I.a(this.f81342m, androidx.compose.animation.core.I.a(this.f81341l, androidx.compose.animation.core.I.a(this.f81340k, androidx.compose.animation.core.I.a(this.f81339j, androidx.compose.animation.core.I.a(this.f81338i, (this.h.hashCode() + iA) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            List<C0530a> list = this.f81337g;
            StringBuilder sb = new StringBuilder("SliderConfig(title=");
            sb.append(this.f81331a);
            sb.append(", min=");
            sb.append(this.f81332b);
            sb.append(", max=");
            sb.append(this.f81333c);
            sb.append(", valueFlow=");
            sb.append(this.f81334d);
            sb.append(", touchEnabled=");
            sb.append(this.f81335e);
            sb.append(", needVibrate=");
            K7.L.b(sb, this.f81336f, ", steps=", list, ", style=");
            sb.append(this.h);
            sb.append(", bgColor=");
            sb.append(this.f81338i);
            sb.append(", titleTextColor=");
            sb.append(this.f81339j);
            sb.append(", thumbColor=");
            sb.append(this.f81340k);
            sb.append(", activeTrackColor=");
            sb.append(this.f81341l);
            sb.append(", inactiveTrackColor=");
            sb.append(this.f81342m);
            sb.append(", descColor=");
            sb.append(this.f81343n);
            sb.append(", dividerColor=");
            sb.append(this.f81344o);
            sb.append(", activeTickColor=");
            sb.append(this.f81345p);
            sb.append(", inactiveTickColor=");
            return C4277b.a(this.f81346q, ")", sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(@NotNull a aVar, @NotNull Function1<? super Float, Unit> function1, @NotNull Function1<? super Float, Unit> function12) {
        this.f81327a = aVar;
        this.f81328b = function1;
        this.f81329c = function12;
    }

    public static final float a(State<Float> state) {
        return state.getValue().floatValue();
    }

    public final a.C0530a b(float f7) {
        a aVar = this.f81327a;
        a.C0530a c0530a = (a.C0530a) CollectionsKt.firstOrNull(aVar.f81337g);
        if (c0530a == null) {
            return null;
        }
        float fAbs = Math.abs(c0530a.f81348b - f7);
        for (a.C0530a c0530a2 : aVar.f81337g) {
            float fAbs2 = Math.abs(c0530a2.f81348b - f7);
            if (fAbs2 < fAbs) {
                c0530a = c0530a2;
                fAbs = fAbs2;
            }
        }
        return c0530a;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-938359476, true, new U(this, 2)));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return this.f81327a.h;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81327a.f81331a;
    }
}
