package com.bilibili.ogv.operation.modular.modules.banner;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableArrayList;
import com.bilibili.ogv.opbase.RecommendModule;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/m.class */
@StabilityInferred(parameters = 0)
public final class m extends a implements Nj0.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Ok0.a f70483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f70485k = 2131499613;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f70486l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ObservableArrayList<Nj0.c> f70487m = new ObservableArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f70488n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f70489o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f70490p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f70491q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public Map<String, String> f70492r = MapsKt.emptyMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f70493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f70494t;

    public m(Ok0.a aVar) {
        this.f70483i = aVar;
        int iB = Uj0.c.b(25.0f, aVar.f17876e);
        this.f70493s = iB;
        this.f70494t = -iB;
    }

    public static final void o(m mVar, Context context, RecommendModule recommendModule) {
        String str;
        if (Cj0.a.a(context)) {
            String str2 = recommendModule.f69906g;
            str = str2;
            if (str2 == null) {
                str = "";
            }
        } else {
            String str3 = recommendModule.f69905f;
            str = str3;
            if (str3 == null) {
                str = "";
            }
        }
        if (Intrinsics.areEqual(str, mVar.f70488n)) {
            return;
        }
        mVar.f70488n = str;
        mVar.notifyPropertyChanged(649);
    }

    @Override // Nj0.c
    public final int m() {
        return this.f70485k;
    }

    @Override // com.bilibili.ogv.operation.modular.modules.banner.a
    public final void n(boolean z6) {
        int i7;
        int i8;
        if (!this.f70435d && z6 && (i8 = this.f70493s + (i7 = this.f70494t)) != i7) {
            this.f70494t = i8;
            notifyPropertyChanged(744);
        }
        super.n(z6);
    }
}
