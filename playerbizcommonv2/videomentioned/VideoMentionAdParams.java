package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/VideoMentionAdParams.class */
@StabilityInferred(parameters = 1)
public final class VideoMentionAdParams {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f82002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f82003b;

    public VideoMentionAdParams() {
        this(null, null, 3, null);
    }

    public VideoMentionAdParams(@Nullable String str, @Nullable String str2) {
        this.f82002a = str;
        this.f82003b = str2;
    }

    public /* synthetic */ VideoMentionAdParams(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ VideoMentionAdParams copy$default(VideoMentionAdParams videoMentionAdParams, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = videoMentionAdParams.f82002a;
        }
        if ((i7 & 2) != 0) {
            str2 = videoMentionAdParams.f82003b;
        }
        return videoMentionAdParams.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82002a;
    }

    @Nullable
    public final String component2() {
        return this.f82003b;
    }

    @NotNull
    public final VideoMentionAdParams copy(@Nullable String str, @Nullable String str2) {
        return new VideoMentionAdParams(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMentionAdParams)) {
            return false;
        }
        VideoMentionAdParams videoMentionAdParams = (VideoMentionAdParams) obj;
        return Intrinsics.areEqual(this.f82002a, videoMentionAdParams.f82002a) && Intrinsics.areEqual(this.f82003b, videoMentionAdParams.f82003b);
    }

    @Nullable
    public final String getAdTrackId() {
        return this.f82002a;
    }

    @Nullable
    public final String getBizExtra() {
        return this.f82003b;
    }

    public int hashCode() {
        int iHashCode = 0;
        String str = this.f82002a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f82003b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoMentionAdParams(adTrackId=");
        sb.append(this.f82002a);
        sb.append(", bizExtra=");
        return C8770a.a(sb, this.f82003b, ")");
    }
}
