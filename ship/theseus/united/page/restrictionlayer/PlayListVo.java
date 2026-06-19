package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayListVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayListVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PlayListItemVo> f102622a;

    public PlayListVo(@NotNull List<PlayListItemVo> list) {
        this.f102622a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayListVo) && Intrinsics.areEqual(this.f102622a, ((PlayListVo) obj).f102622a);
    }

    public final int hashCode() {
        return this.f102622a.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("PlayListVo(playList=", ")", this.f102622a);
    }
}
