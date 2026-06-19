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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/h.class */
@StabilityInferred(parameters = 0)
public final class h extends com.bilibili.app.gemini.ui.m<Dr0.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f83238a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f83239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f83240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f83241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f83242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final StateFlow<String> f83243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f83244f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f83245g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f83246i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f83247j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final Jr0.f f83248k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f83249l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f83250m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f83251n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f83252o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final VideoSettingType f83253p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public final SingleExposeEntry f83254q;

        public a() {
            throw null;
        }

        public a(String str, String str2, String str3, StateFlow stateFlow, StateFlow stateFlow2, String str4, String str5, Function0 function0, Function0 function02, Jr0.f fVar, int i7, int i8, int i9, int i10, VideoSettingType videoSettingType, SingleExposeEntry singleExposeEntry, int i11) {
            str2 = (i11 & 2) != 0 ? "" : str2;
            str3 = (i11 & 4) != 0 ? "" : str3;
            stateFlow = (i11 & 8) != 0 ? StateFlowKt.MutableStateFlow(Boolean.TRUE) : stateFlow;
            stateFlow2 = (i11 & 16) != 0 ? StateFlowKt.MutableStateFlow("") : stateFlow2;
            str4 = (i11 & 64) != 0 ? "" : str4;
            str5 = (i11 & 128) != 0 ? null : str5;
            function02 = (i11 & 512) != 0 ? null : function02;
            fVar = (i11 & 1024) != 0 ? null : fVar;
            i7 = (i11 & 2048) != 0 ? R$color.Text1 : i7;
            i8 = (i11 & 4096) != 0 ? R$color.Text3 : i8;
            i9 = (i11 & 8192) != 0 ? R$color.Bg1_float : i9;
            i10 = (i11 & 16384) != 0 ? R$color.Line_regular : i10;
            singleExposeEntry = (i11 & 65536) != 0 ? null : singleExposeEntry;
            this.f83239a = str;
            this.f83240b = str2;
            this.f83241c = str3;
            this.f83242d = stateFlow;
            this.f83243e = stateFlow2;
            this.f83244f = "";
            this.f83245g = str4;
            this.h = str5;
            this.f83246i = function0;
            this.f83247j = function02;
            this.f83248k = fVar;
            this.f83249l = i7;
            this.f83250m = i8;
            this.f83251n = i9;
            this.f83252o = i10;
            this.f83253p = videoSettingType;
            this.f83254q = singleExposeEntry;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f83239a, aVar.f83239a) && Intrinsics.areEqual(this.f83240b, aVar.f83240b) && Intrinsics.areEqual(this.f83241c, aVar.f83241c) && Intrinsics.areEqual(this.f83242d, aVar.f83242d) && Intrinsics.areEqual(this.f83243e, aVar.f83243e) && Intrinsics.areEqual(this.f83244f, aVar.f83244f) && Intrinsics.areEqual(this.f83245g, aVar.f83245g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.f83246i, aVar.f83246i) && Intrinsics.areEqual(this.f83247j, aVar.f83247j) && Intrinsics.areEqual(this.f83248k, aVar.f83248k) && this.f83249l == aVar.f83249l && this.f83250m == aVar.f83250m && this.f83251n == aVar.f83251n && this.f83252o == aVar.f83252o && this.f83253p == aVar.f83253p && Intrinsics.areEqual(this.f83254q, aVar.f83254q);
        }

        public final int hashCode() {
            int iA = E.a(E.a(androidx.core.content.b.a(this.f83243e, androidx.core.content.b.a(this.f83242d, E.a(E.a(this.f83239a.hashCode() * 31, 31, this.f83240b), 31, this.f83241c), 31), 31), 31, this.f83244f), 31, this.f83245g);
            String str = this.h;
            int iA2 = C3357h.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83246i);
            Function0<Unit> function0 = this.f83247j;
            int iHashCode = function0 == null ? 0 : function0.hashCode();
            Jr0.f fVar = this.f83248k;
            int iA3 = I.a(this.f83252o, I.a(this.f83251n, I.a(this.f83250m, I.a(this.f83249l, (((iA2 + iHashCode) * 31) + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31), 31), 31);
            int iHashCode2 = this.f83253p.hashCode();
            SingleExposeEntry singleExposeEntry = this.f83254q;
            return ((iHashCode2 + iA3) * 31) + (singleExposeEntry == null ? 0 : singleExposeEntry.hashCode());
        }

        @NotNull
        public final String toString() {
            return "VideoSettingDescription(title=" + this.f83239a + ", iconUrl=" + this.f83240b + ", iconRes=" + this.f83241c + ", visibleFlow=" + this.f83242d + ", descriptionFlow=" + this.f83243e + ", endIconUrl=" + this.f83244f + ", endIconRes=" + this.f83245g + ", titleEndIconRes=" + this.h + ", onClick=" + this.f83246i + ", onTitleEndIconClick=" + this.f83247j + ", badgeInfo=" + this.f83248k + ", textColor=" + this.f83249l + ", descriptionColor=" + this.f83250m + ", backgroundColor=" + this.f83251n + ", bottomSplitColor=" + this.f83252o + ", style=" + this.f83253p + ", exposeEntry=" + this.f83254q + ")";
        }
    }

    public h(@NotNull a aVar) {
        this.f83238a = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new VideoSettingDescriptionComponent$bind$2((Dr0.n) viewBinding, this, null), continuation);
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return Dr0.n.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
