package com.bilibili.studio.editor.moudle.editormain.track.material.multitrack;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import cf.l;
import com.bilibili.playerbizcommon.features.background.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/multitrack/TrackAdsorbBean.class */
@Keep
public final class TrackAdsorbBean {

    @NotNull
    public static final a Companion = new Object();
    public static final int REFRENCELINE_TYPE_CAPTION = 2;
    public static final int REFRENCELINE_TYPE_INDICATOR = 0;
    public static final int REFRENCELINE_TYPE_MUSIC = 5;
    public static final int REFRENCELINE_TYPE_RECORD = 4;
    public static final int REFRENCELINE_TYPE_STICKER = 1;
    public static final int REFRENCELINE_TYPE_USER_TRACK_VIDEO = 3;

    @NotNull
    private final String id;
    private final long time;

    @NotNull
    private String trackTag;
    private final int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/multitrack/TrackAdsorbBean$a.class */
    public static final class a {
    }

    public TrackAdsorbBean() {
        this(null, 0L, 0, null, 15, null);
    }

    public TrackAdsorbBean(@NotNull String str, long j7, int i7, @NotNull String str2) {
        this.id = str;
        this.time = j7;
        this.type = i7;
        this.trackTag = str2;
    }

    public /* synthetic */ TrackAdsorbBean(String str, long j7, int i7, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0L : j7, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? "" : str2);
    }

    public static /* synthetic */ TrackAdsorbBean copy$default(TrackAdsorbBean trackAdsorbBean, String str, long j7, int i7, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = trackAdsorbBean.id;
        }
        if ((i8 & 2) != 0) {
            j7 = trackAdsorbBean.time;
        }
        if ((i8 & 4) != 0) {
            i7 = trackAdsorbBean.type;
        }
        if ((i8 & 8) != 0) {
            str2 = trackAdsorbBean.trackTag;
        }
        return trackAdsorbBean.copy(str, j7, i7, str2);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final long component2() {
        return this.time;
    }

    public final int component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.trackTag;
    }

    @NotNull
    public final TrackAdsorbBean copy(@NotNull String str, long j7, int i7, @NotNull String str2) {
        return new TrackAdsorbBean(str, j7, i7, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackAdsorbBean)) {
            return false;
        }
        TrackAdsorbBean trackAdsorbBean = (TrackAdsorbBean) obj;
        return Intrinsics.areEqual(this.id, trackAdsorbBean.id) && this.time == trackAdsorbBean.time && this.type == trackAdsorbBean.type && Intrinsics.areEqual(this.trackTag, trackAdsorbBean.trackTag);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTrackTag() {
        return this.trackTag;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.trackTag.hashCode() + I.a(this.type, C3554n0.a(this.id.hashCode() * 31, 31, this.time), 31);
    }

    public final void setTrackTag(@NotNull String str) {
        this.trackTag = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        long j7 = this.time;
        int i7 = this.type;
        String str2 = this.trackTag;
        StringBuilder sbA = b.a(j7, "TrackAdsorbBean(id=", str, ", time=");
        l.a(i7, ", type=", ", trackTag=", str2, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
