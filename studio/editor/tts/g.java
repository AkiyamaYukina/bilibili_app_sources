package com.bilibili.studio.editor.tts;

import android.content.Context;
import androidx.compose.animation.core.I;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f108351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<String> f108352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f108353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, ? extends Object> f108354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f108355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<? super List<Pair<TtsInputBean, String>>, Unit> f108356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function2<? super Long, ? super Throwable, Unit> f108357g;

    public g() {
        throw null;
    }

    public g(Context context, List list, String str, Map map, int i7, Function1 function1, Function2 function2, int i8) {
        list = (i8 & 2) != 0 ? null : list;
        str = (i8 & 4) != 0 ? null : str;
        this.f108351a = context;
        this.f108352b = list;
        this.f108353c = str;
        this.f108354d = map;
        this.f108355e = i7;
        this.f108356f = function1;
        this.f108357g = function2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f108351a, gVar.f108351a) && Intrinsics.areEqual(this.f108352b, gVar.f108352b) && Intrinsics.areEqual(this.f108353c, gVar.f108353c) && Intrinsics.areEqual(this.f108354d, gVar.f108354d) && this.f108355e == gVar.f108355e && Intrinsics.areEqual(this.f108356f, gVar.f108356f) && Intrinsics.areEqual(this.f108357g, gVar.f108357g);
    }

    public final int hashCode() {
        int iHashCode = this.f108351a.hashCode();
        List<String> list = this.f108352b;
        int iHashCode2 = 0;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.f108353c;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return this.f108357g.hashCode() + O4.b.a(I.a(this.f108355e, J2.g.a(((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31, this.f108354d, 31), 31), 31, this.f108356f);
    }

    @NotNull
    public final String toString() {
        Context context = this.f108351a;
        List<String> list = this.f108352b;
        Map<String, ? extends Object> map = this.f108354d;
        StringBuilder sb = new StringBuilder("TtsRequest(context=");
        sb.append(context);
        sb.append(", sentences=");
        sb.append(list);
        sb.append(", longContent=");
        C7416u.a(sb, this.f108353c, ", params=", map, ", bizType=");
        sb.append(this.f108355e);
        sb.append(", onSuccess=");
        sb.append(this.f108356f);
        sb.append(", onFail=");
        sb.append(this.f108357g);
        sb.append(")");
        return sb.toString();
    }
}
