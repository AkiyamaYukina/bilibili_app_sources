package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySeason.class */
@StabilityInferred(parameters = 1)
@Bson
@Keep
public final class PlaySeason {
    public static final int $stable = 0;

    @NotNull
    public static final a Companion = new Object();
    public static final long INVALID_SEASON_ID = -1;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySeason$a.class */
    public static final class a {
    }

    public PlaySeason(long j7, @NotNull String str) {
        this.id = j7;
        this.name = str;
    }

    public static /* synthetic */ PlaySeason copy$default(PlaySeason playSeason, long j7, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = playSeason.id;
        }
        if ((i7 & 2) != 0) {
            str = playSeason.name;
        }
        return playSeason.copy(j7, str);
    }

    public final long component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final PlaySeason copy(long j7, @NotNull String str) {
        return new PlaySeason(j7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaySeason)) {
            return false;
        }
        PlaySeason playSeason = (PlaySeason) obj;
        return this.id == playSeason.id && Intrinsics.areEqual(this.name, playSeason.name);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = com.bilibili.ad.adview.pegasus.banner.topview.res.n.a(this.id, "PlaySeason(id=", ", name=", this.name);
        sbA.append(")");
        return sbA.toString();
    }
}
