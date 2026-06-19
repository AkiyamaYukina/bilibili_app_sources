package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/CommonCard.class */
@StabilityInferred(parameters = 0)
@Bson
public final class CommonCard {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("badge_info")
    @Nullable
    private BangumiBadgeInfo f112022d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Map<String, String> f112024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112025g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public transient ExposureEntry f112026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public RoomInfo f112027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public WaitRoom f112028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("room_card")
    @Nullable
    private HotRoom f112029l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f112019a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f112020b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f112021c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f112023e = "";

    @NotNull
    public String h = "";

    @Nullable
    public final HotRoom a() {
        return this.f112029l;
    }

    @Nullable
    public final BangumiBadgeInfo b() {
        return this.f112022d;
    }

    public final void c(@Nullable HotRoom hotRoom) {
        this.f112029l = hotRoom;
    }

    public final void d(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f112022d = bangumiBadgeInfo;
    }
}
