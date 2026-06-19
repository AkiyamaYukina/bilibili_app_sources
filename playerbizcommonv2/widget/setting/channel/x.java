package com.bilibili.playerbizcommonv2.widget.setting.channel;

import I.E;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.C3357h;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.view.PlayerSwitch;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/x.class */
@StabilityInferred(parameters = 0)
public final class x extends com.bilibili.app.gemini.ui.m<Dr0.t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f83316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f83317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public WeakReference<Dr0.t> f83318c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/x$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f83321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f83322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f83323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Jr0.f f83324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f83325g;

        @Nullable
        public final Function0<Unit> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f83326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f83327j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f83328k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f83329l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f83330m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f83331n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f83332o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final VideoSettingType f83333p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f83334q;

        public a() {
            throw null;
        }

        public a(String str, String str2, String str3, StateFlow stateFlow, Function0 function0, Jr0.f fVar, String str4, Function0 function02, boolean z6, int i7, int i8, int i9, int i10, int i11, int i12, VideoSettingType videoSettingType, Function0 function03, int i13) {
            str2 = (i13 & 2) != 0 ? "" : str2;
            str3 = (i13 & 4) != 0 ? "" : str3;
            fVar = (i13 & 32) != 0 ? null : fVar;
            str4 = (i13 & 64) != 0 ? "" : str4;
            function02 = (i13 & 128) != 0 ? null : function02;
            z6 = (i13 & 256) != 0 ? false : z6;
            i7 = (i13 & 512) != 0 ? R$color.Text1 : i7;
            i8 = (i13 & 1024) != 0 ? R$color.Bg1_float : i8;
            i9 = (i13 & 2048) != 0 ? R$color.Line_regular : i9;
            i10 = (i13 & 4096) != 0 ? R$color.Graph_white : i10;
            i11 = (i13 & 8192) != 0 ? R$color.Pi5 : i11;
            i12 = (i13 & 16384) != 0 ? R$color.Graph_bg_thick : i12;
            function03 = (i13 & 65536) != 0 ? null : function03;
            this.f83319a = str;
            this.f83320b = str2;
            this.f83321c = str3;
            this.f83322d = stateFlow;
            this.f83323e = function0;
            this.f83324f = fVar;
            this.f83325g = str4;
            this.h = function02;
            this.f83326i = z6;
            this.f83327j = i7;
            this.f83328k = i8;
            this.f83329l = i9;
            this.f83330m = i10;
            this.f83331n = i11;
            this.f83332o = i12;
            this.f83333p = videoSettingType;
            this.f83334q = function03;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f83319a, aVar.f83319a) && Intrinsics.areEqual(this.f83320b, aVar.f83320b) && Intrinsics.areEqual(this.f83321c, aVar.f83321c) && Intrinsics.areEqual(this.f83322d, aVar.f83322d) && Intrinsics.areEqual(this.f83323e, aVar.f83323e) && Intrinsics.areEqual(this.f83324f, aVar.f83324f) && Intrinsics.areEqual(this.f83325g, aVar.f83325g) && Intrinsics.areEqual(this.h, aVar.h) && this.f83326i == aVar.f83326i && this.f83327j == aVar.f83327j && this.f83328k == aVar.f83328k && this.f83329l == aVar.f83329l && this.f83330m == aVar.f83330m && this.f83331n == aVar.f83331n && this.f83332o == aVar.f83332o && this.f83333p == aVar.f83333p && Intrinsics.areEqual(this.f83334q, aVar.f83334q);
        }

        public final int hashCode() {
            int iA = C3357h.a(androidx.core.content.b.a(this.f83322d, E.a(E.a(this.f83319a.hashCode() * 31, 31, this.f83320b), 31, this.f83321c), 31), 31, this.f83323e);
            Jr0.f fVar = this.f83324f;
            int iA2 = E.a((iA + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f83325g);
            Function0<Unit> function0 = this.h;
            int iA3 = I.a(this.f83332o, I.a(this.f83331n, I.a(this.f83330m, I.a(this.f83329l, I.a(this.f83328k, I.a(this.f83327j, androidx.compose.animation.z.a((iA2 + (function0 == null ? 0 : function0.hashCode())) * 31, 31, this.f83326i), 31), 31), 31), 31), 31), 31);
            int iHashCode = this.f83333p.hashCode();
            Function0<Unit> function02 = this.f83334q;
            return ((iHashCode + iA3) * 31) + (function02 == null ? 0 : function02.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoSettingSwitch(title=");
            sb.append(this.f83319a);
            sb.append(", iconUrl=");
            sb.append(this.f83320b);
            sb.append(", iconRes=");
            sb.append(this.f83321c);
            sb.append(", checkedFlow=");
            sb.append(this.f83322d);
            sb.append(", onSwitchClick=");
            sb.append(this.f83323e);
            sb.append(", badgeInfo=");
            sb.append(this.f83324f);
            sb.append(", titleEndIconRes=");
            sb.append(this.f83325g);
            sb.append(", onTitleEndIconClick=");
            sb.append(this.h);
            sb.append(", backgroundAnimation=");
            sb.append(this.f83326i);
            sb.append(", textColor=");
            sb.append(this.f83327j);
            sb.append(", backgroundColor=");
            sb.append(this.f83328k);
            sb.append(", bottomSplitColor=");
            sb.append(this.f83329l);
            sb.append(", switchCircleColor=");
            sb.append(this.f83330m);
            sb.append(", switchOnRectColor=");
            sb.append(this.f83331n);
            sb.append(", switchOffRectColor=");
            sb.append(this.f83332o);
            sb.append(", style=");
            sb.append(this.f83333p);
            sb.append(", onBind=");
            return Y0.c.a(sb, this.f83334q, ")");
        }
    }

    public x(@NotNull a aVar) {
        this.f83316a = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoSettingSwitchComponent$bind$2(this, (Dr0.t) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.t.inflate(LayoutInflater.from(context), viewGroup, false);
    }

    public final void c(int i7, int i8, int i9) {
        Dr0.t tVar;
        PlayerSwitch playerSwitch;
        WeakReference<Dr0.t> weakReference = this.f83318c;
        if (weakReference == null || (tVar = weakReference.get()) == null || (playerSwitch = tVar.f3149f) == null) {
            return;
        }
        playerSwitch.a(i7, i8, i9, i9);
    }
}
