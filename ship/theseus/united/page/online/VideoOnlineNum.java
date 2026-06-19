package com.bilibili.ship.theseus.united.page.online;

import J1.M;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNum.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VideoOnlineNum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("online_show")
    private final boolean f102099a;

    public VideoOnlineNum() {
        this(false, 1);
    }

    public VideoOnlineNum(boolean z6, int i7) {
        this.f102099a = (i7 & 1) != 0 ? false : z6;
    }

    public final boolean a() {
        return this.f102099a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoOnlineNum) && this.f102099a == ((VideoOnlineNum) obj).f102099a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102099a);
    }

    @NotNull
    public final String toString() {
        return M.a("VideoOnlineNum(show=", ")", this.f102099a);
    }
}
