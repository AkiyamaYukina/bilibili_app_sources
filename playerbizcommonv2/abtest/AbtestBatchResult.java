package com.bilibili.playerbizcommonv2.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/AbtestBatchResult.class */
@StabilityInferred(parameters = 1)
@Bson
public final class AbtestBatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("reply_down_style")
    @Nullable
    private final IntExpData f80802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("play_long_press_speed")
    @Nullable
    private final IntExpData f80803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("video_bg_play_listen")
    @Nullable
    private final StringExpData f80804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("story_video_bg_play_listen")
    @Nullable
    private final StringExpData f80805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("play_comment_fav_icon_display")
    @Nullable
    private final IntExpData f80806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("peak_progress_pm")
    @Nullable
    private final IntExpData f80807f;

    public AbtestBatchResult(@Nullable IntExpData intExpData, @Nullable IntExpData intExpData2, @Nullable StringExpData stringExpData, @Nullable StringExpData stringExpData2, @Nullable IntExpData intExpData3, @Nullable IntExpData intExpData4) {
        this.f80802a = intExpData;
        this.f80803b = intExpData2;
        this.f80804c = stringExpData;
        this.f80805d = stringExpData2;
        this.f80806e = intExpData3;
        this.f80807f = intExpData4;
    }

    @Nullable
    public final StringExpData a() {
        return this.f80804c;
    }

    @Nullable
    public final IntExpData b() {
        return this.f80803b;
    }

    @Nullable
    public final IntExpData c() {
        return this.f80806e;
    }

    @Nullable
    public final IntExpData d() {
        return this.f80807f;
    }

    @Nullable
    public final StringExpData e() {
        return this.f80805d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbtestBatchResult)) {
            return false;
        }
        AbtestBatchResult abtestBatchResult = (AbtestBatchResult) obj;
        return Intrinsics.areEqual(this.f80802a, abtestBatchResult.f80802a) && Intrinsics.areEqual(this.f80803b, abtestBatchResult.f80803b) && Intrinsics.areEqual(this.f80804c, abtestBatchResult.f80804c) && Intrinsics.areEqual(this.f80805d, abtestBatchResult.f80805d) && Intrinsics.areEqual(this.f80806e, abtestBatchResult.f80806e) && Intrinsics.areEqual(this.f80807f, abtestBatchResult.f80807f);
    }

    @Nullable
    public final IntExpData f() {
        return this.f80802a;
    }

    public final int hashCode() {
        IntExpData intExpData = this.f80802a;
        int iHashCode = 0;
        int iHashCode2 = intExpData == null ? 0 : intExpData.hashCode();
        IntExpData intExpData2 = this.f80803b;
        int iHashCode3 = intExpData2 == null ? 0 : intExpData2.hashCode();
        StringExpData stringExpData = this.f80804c;
        int iHashCode4 = stringExpData == null ? 0 : stringExpData.hashCode();
        StringExpData stringExpData2 = this.f80805d;
        int iHashCode5 = stringExpData2 == null ? 0 : stringExpData2.hashCode();
        IntExpData intExpData3 = this.f80806e;
        int iHashCode6 = intExpData3 == null ? 0 : intExpData3.hashCode();
        IntExpData intExpData4 = this.f80807f;
        if (intExpData4 != null) {
            iHashCode = intExpData4.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "AbtestBatchResult(style=" + this.f80802a + ", longPressSpeedExp=" + this.f80803b + ", listenExpData=" + this.f80804c + ", storyListenExpData=" + this.f80805d + ", playerCommentFavExp=" + this.f80806e + ", playerHeatPeakExp=" + this.f80807f + ")";
    }
}
