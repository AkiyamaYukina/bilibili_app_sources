package com.bilibili.ogv.community;

import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.ogv.community.api.BangumiCommunityApiService;
import com.bilibili.okretro.ServiceGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uj0.InterfaceC8737a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BangumiCommunityApiService f67525a = (BangumiCommunityApiService) ServiceGenerator.createService(BangumiCommunityApiService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final InterfaceC8737a f67526b = (InterfaceC8737a) ServiceGenerator.createService(InterfaceC8737a.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final com.bilibili.ogv.community.a<Long, Boolean> f67527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final com.bilibili.ogv.community.a<Long, a> f67528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static float f67529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static AccountInfo f67530f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/c$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67532b;

        public a(int i7, boolean z6) {
            this.f67531a = i7;
            this.f67532b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f67531a == aVar.f67531a && this.f67532b == aVar.f67532b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f67532b) + (Integer.hashCode(this.f67531a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CoinData(paidCoinCount=");
            sb.append(this.f67531a);
            sb.append(", originalSeason=");
            return androidx.appcompat.app.i.a(sb, this.f67532b, ")");
        }
    }

    static {
        com.bilibili.ogv.community.a<Long, Boolean> aVar = new com.bilibili.ogv.community.a<>();
        b.a(aVar);
        f67527c = aVar;
        com.bilibili.ogv.community.a<Long, a> aVar2 = new com.bilibili.ogv.community.a<>();
        b.a(aVar2);
        f67528d = aVar2;
    }
}
