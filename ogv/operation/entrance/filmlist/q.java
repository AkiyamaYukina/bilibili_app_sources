package com.bilibili.ogv.operation.entrance.filmlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/q.class */
@StabilityInferred(parameters = 0)
public final class q extends Nj0.c implements Nj0.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OGVFilmListPageItem f70080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final OGVFilmListFragment f70081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f70082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f70083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f70084g = new ExposureEntry(Pl0.b.f19035a, new Wu0.d(this, 2));
    public final int h = 2131499605;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f70085i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f70086j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f70087k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f70088l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f70089m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f70090n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f70091o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f70092p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f70093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f70094r;

    public q(long j7, @NotNull OGVFilmListPageItem oGVFilmListPageItem, @Nullable OGVFilmListFragment oGVFilmListFragment, @NotNull String str, @NotNull String str2) {
        this.f70079b = j7;
        this.f70080c = oGVFilmListPageItem;
        this.f70081d = oGVFilmListFragment;
        this.f70082e = str;
        this.f70083f = str2;
    }

    public static Map n(Map map) {
        Map mutableMap = MapsKt.toMutableMap(map);
        BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
        VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
        mutableMap.put("vip_status", String.valueOf(vipInfo != null ? vipInfo.getVipStatus() : 0));
        VipUserInfo vipInfo2 = biliAccountInfo.getVipInfo();
        int vipType = 0;
        if (vipInfo2 != null) {
            vipType = vipInfo2.getVipType();
        }
        mutableMap.put("vip_type", String.valueOf(vipType));
        return mutableMap;
    }

    @Override // Nj0.c
    public final int m() {
        return this.h;
    }
}
