package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
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
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/D.class */
@StabilityInferred(parameters = 0)
public final class D implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f81268d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f81269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f81270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f81271c = LazyKt.lazy(new L3.P(5));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/D$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f81272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<b> f81274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f81275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DanmakuSettingsStyle f81276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81278g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81279i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f81280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f81281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f81282l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f81283m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f81284n;

        public a() {
            throw null;
        }

        public a(StateFlow stateFlow, String str, List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            DanmakuSettingsStyle danmakuSettingsStyle = DanmakuSettingsStyle.MIDDLE;
            i7 = (i16 & 32) != 0 ? R$color.Bg1_float : i7;
            i8 = (i16 & 64) != 0 ? R$color.Text1 : i8;
            i9 = (i16 & 128) != 0 ? R$color.Brand_pink : i9;
            i10 = (i16 & 256) != 0 ? R$color.Pi3 : i10;
            i11 = (i16 & 512) != 0 ? R$color.Ga2 : i11;
            i12 = (i16 & 1024) != 0 ? R$color.Text1 : i12;
            i13 = (i16 & 2048) != 0 ? R$color.Line_regular : i13;
            i14 = (i16 & 4096) != 0 ? R$color.Text_white : i14;
            i15 = (i16 & 8192) != 0 ? R$color.Text_white : i15;
            this.f81272a = stateFlow;
            this.f81273b = str;
            this.f81274c = list;
            this.f81275d = true;
            this.f81276e = danmakuSettingsStyle;
            this.f81277f = i7;
            this.f81278g = i8;
            this.h = i9;
            this.f81279i = i10;
            this.f81280j = i11;
            this.f81281k = i12;
            this.f81282l = i13;
            this.f81283m = i14;
            this.f81284n = i15;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f81272a, aVar.f81272a) && Intrinsics.areEqual(this.f81273b, aVar.f81273b) && Intrinsics.areEqual(this.f81274c, aVar.f81274c) && this.f81275d == aVar.f81275d && this.f81276e == aVar.f81276e && this.f81277f == aVar.f81277f && this.f81278g == aVar.f81278g && this.h == aVar.h && this.f81279i == aVar.f81279i && this.f81280j == aVar.f81280j && this.f81281k == aVar.f81281k && this.f81282l == aVar.f81282l && this.f81283m == aVar.f81283m && this.f81284n == aVar.f81284n;
        }

        public final int hashCode() {
            int iA = androidx.compose.animation.z.a(e0.a(I.E.a(this.f81272a.hashCode() * 31, 31, this.f81273b), 31, this.f81274c), 31, this.f81275d);
            return Integer.hashCode(this.f81284n) + androidx.compose.animation.core.I.a(this.f81283m, androidx.compose.animation.core.I.a(this.f81282l, androidx.compose.animation.core.I.a(this.f81281k, androidx.compose.animation.core.I.a(this.f81280j, androidx.compose.animation.core.I.a(this.f81279i, androidx.compose.animation.core.I.a(this.h, androidx.compose.animation.core.I.a(this.f81278g, androidx.compose.animation.core.I.a(this.f81277f, (this.f81276e.hashCode() + iA) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            List<b> list = this.f81274c;
            StringBuilder sb = new StringBuilder("SelectorConfig(selectedIndexFlow=");
            sb.append(this.f81272a);
            sb.append(", title=");
            M6.f.a(this.f81273b, ", list=", ", needVibrate=", sb, list);
            sb.append(this.f81275d);
            sb.append(", style=");
            sb.append(this.f81276e);
            sb.append(", bgColor=");
            sb.append(this.f81277f);
            sb.append(", titleTextColor=");
            sb.append(this.f81278g);
            sb.append(", thumbColor=");
            sb.append(this.h);
            sb.append(", activeTrackColor=");
            sb.append(this.f81279i);
            sb.append(", inactiveTrackColor=");
            sb.append(this.f81280j);
            sb.append(", descColor=");
            sb.append(this.f81281k);
            sb.append(", dividerColor=");
            sb.append(this.f81282l);
            sb.append(", activeTickColor=");
            sb.append(this.f81283m);
            sb.append(", inactiveTickColor=");
            return C4277b.a(this.f81284n, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/D$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81286b;

        public b(@NotNull String str, int i7) {
            this.f81285a = str;
            this.f81286b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f81285a, bVar.f81285a) && this.f81286b == bVar.f81286b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f81286b) + (this.f81285a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SelectorOption(description=");
            sb.append(this.f81285a);
            sb.append(", value=");
            return C4277b.a(this.f81286b, ")", sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D(@NotNull a aVar, @NotNull Function1<? super Integer, Unit> function1) {
        this.f81269a = aVar;
        this.f81270b = function1;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-552441080, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final D f81261a;

            {
                this.f81261a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.A.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return Unit.INSTANCE;
    }

    @NotNull
    public final Object contentEqualityKey() {
        return this.f81269a.f81272a.getValue();
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
        return new UIComponent.b(composeView);
    }

    @NotNull
    public final Object identityEqualityKey() {
        return this.f81269a.f81273b;
    }
}
