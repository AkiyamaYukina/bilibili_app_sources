package com.bilibili.ship.theseus.ogv.videocard;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardButtonVO.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PlayerCardButtonVO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f94662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("start_color")
    private final int f94663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("end_color")
    private final int f94664c;

    public PlayerCardButtonVO(String str, int i7, int i8, int i9) {
        i7 = (i9 & 2) != 0 ? -39271 : i7;
        i8 = (i9 & 4) != 0 ? -39271 : i8;
        this.f94662a = str;
        this.f94663b = i7;
        this.f94664c = i8;
    }

    public final int a() {
        return this.f94664c;
    }

    public final int b() {
        return this.f94663b;
    }

    @NotNull
    public final String c() {
        return this.f94662a;
    }
}
