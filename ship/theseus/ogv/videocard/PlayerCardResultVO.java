package com.bilibili.ship.theseus.ogv.videocard;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardResultVO.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayerCardResultVO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("season_id")
    private final long f94666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("action_type")
    private final int f94667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("toast_msg")
    @NotNull
    private final String f94668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("card_list")
    @Nullable
    private final List<PlayerCardVO> f94669d;

    public PlayerCardResultVO(int i7, long j7, @NotNull String str, @Nullable List list) {
        this.f94666a = j7;
        this.f94667b = i7;
        this.f94668c = str;
        this.f94669d = list;
    }

    @Nullable
    public final List<PlayerCardVO> a() {
        return this.f94669d;
    }

    public final long b() {
        return this.f94666a;
    }

    @NotNull
    public final String c() {
        return this.f94668c;
    }

    public final int d() {
        return this.f94667b;
    }
}
