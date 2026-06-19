package com.bilibili.ship.theseus.ogv.pay.sponsor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorRankUser.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiSponsorRankUser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(KeySign.UID)
    private final long f94216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f94217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("uname")
    @Nullable
    private final String f94218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("face")
    @Nullable
    private String f94219d;

    public BangumiSponsorRankUser() {
        this(0L, null, null, null, 15);
    }

    public BangumiSponsorRankUser(long j7, String str, String str2, String str3, int i7) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        str = (i7 & 2) != 0 ? null : str;
        str2 = (i7 & 4) != 0 ? null : str2;
        str3 = (i7 & 8) != 0 ? null : str3;
        this.f94216a = j7;
        this.f94217b = str;
        this.f94218c = str2;
        this.f94219d = str3;
    }

    @Nullable
    public final String a() {
        return this.f94219d;
    }

    public final long b() {
        return this.f94216a;
    }

    @Nullable
    public final String c() {
        return this.f94218c;
    }

    public final void d(@Nullable String str) {
        this.f94219d = str;
    }
}
