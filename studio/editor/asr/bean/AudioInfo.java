package com.bilibili.studio.editor.asr.bean;

import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.room.B;
import com.bilibili.playerbizcommon.features.background.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;
import z4.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AudioInfo.class */
@Keep
public final class AudioInfo {

    @NotNull
    private String audioFilePath;

    @Nullable
    private String cacheKey;

    @NotNull
    private String captionType;
    private long duration;
    private int from;
    private boolean hasExtract;

    @NotNull
    private String id;
    private long inPointUs;
    private long outPointUs;
    private float playRate;

    @Nullable
    private String reportId;
    private long trimInUs;
    private long trimOutUs;

    @Nullable
    private String videoPath;

    public AudioInfo(@NotNull String str, long j7, @NotNull String str2, long j8, long j9, long j10, long j11, float f7, @NotNull String str3, int i7, boolean z6, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.id = str;
        this.duration = j7;
        this.audioFilePath = str2;
        this.trimInUs = j8;
        this.trimOutUs = j9;
        this.inPointUs = j10;
        this.outPointUs = j11;
        this.playRate = f7;
        this.captionType = str3;
        this.from = i7;
        this.hasExtract = z6;
        this.videoPath = str4;
        this.reportId = str5;
        this.cacheKey = str6;
    }

    public /* synthetic */ AudioInfo(String str, long j7, String str2, long j8, long j9, long j10, long j11, float f7, String str3, int i7, boolean z6, String str4, String str5, String str6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0L : j7, str2, (i8 & 8) != 0 ? 0L : j8, (i8 & 16) != 0 ? 0L : j9, (i8 & 32) != 0 ? 0L : j10, (i8 & 64) != 0 ? 0L : j11, (i8 & 128) != 0 ? 1.0f : f7, (i8 & 256) != 0 ? "auto" : str3, (i8 & 512) != 0 ? 0 : i7, (i8 & 1024) != 0 ? false : z6, (i8 & 2048) != 0 ? null : str4, (i8 & 4096) != 0 ? null : str5, (i8 & 8192) != 0 ? null : str6);
    }

    public static /* synthetic */ AudioInfo copy$default(AudioInfo audioInfo, String str, long j7, String str2, long j8, long j9, long j10, long j11, float f7, String str3, int i7, boolean z6, String str4, String str5, String str6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = audioInfo.id;
        }
        if ((i8 & 2) != 0) {
            j7 = audioInfo.duration;
        }
        if ((i8 & 4) != 0) {
            str2 = audioInfo.audioFilePath;
        }
        if ((i8 & 8) != 0) {
            j8 = audioInfo.trimInUs;
        }
        if ((i8 & 16) != 0) {
            j9 = audioInfo.trimOutUs;
        }
        if ((i8 & 32) != 0) {
            j10 = audioInfo.inPointUs;
        }
        if ((i8 & 64) != 0) {
            j11 = audioInfo.outPointUs;
        }
        if ((i8 & 128) != 0) {
            f7 = audioInfo.playRate;
        }
        if ((i8 & 256) != 0) {
            str3 = audioInfo.captionType;
        }
        if ((i8 & 512) != 0) {
            i7 = audioInfo.from;
        }
        if ((i8 & 1024) != 0) {
            z6 = audioInfo.hasExtract;
        }
        if ((i8 & 2048) != 0) {
            str4 = audioInfo.videoPath;
        }
        if ((i8 & 4096) != 0) {
            str5 = audioInfo.reportId;
        }
        if ((i8 & 8192) != 0) {
            str6 = audioInfo.cacheKey;
        }
        return audioInfo.copy(str, j7, str2, j8, j9, j10, j11, f7, str3, i7, z6, str4, str5, str6);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.from;
    }

    public final boolean component11() {
        return this.hasExtract;
    }

    @Nullable
    public final String component12() {
        return this.videoPath;
    }

    @Nullable
    public final String component13() {
        return this.reportId;
    }

    @Nullable
    public final String component14() {
        return this.cacheKey;
    }

    public final long component2() {
        return this.duration;
    }

    @NotNull
    public final String component3() {
        return this.audioFilePath;
    }

    public final long component4() {
        return this.trimInUs;
    }

    public final long component5() {
        return this.trimOutUs;
    }

    public final long component6() {
        return this.inPointUs;
    }

    public final long component7() {
        return this.outPointUs;
    }

    public final float component8() {
        return this.playRate;
    }

    @NotNull
    public final String component9() {
        return this.captionType;
    }

    @NotNull
    public final AudioInfo copy(@NotNull String str, long j7, @NotNull String str2, long j8, long j9, long j10, long j11, float f7, @NotNull String str3, int i7, boolean z6, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new AudioInfo(str, j7, str2, j8, j9, j10, j11, f7, str3, i7, z6, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInfo)) {
            return false;
        }
        AudioInfo audioInfo = (AudioInfo) obj;
        return Intrinsics.areEqual(this.id, audioInfo.id) && this.duration == audioInfo.duration && Intrinsics.areEqual(this.audioFilePath, audioInfo.audioFilePath) && this.trimInUs == audioInfo.trimInUs && this.trimOutUs == audioInfo.trimOutUs && this.inPointUs == audioInfo.inPointUs && this.outPointUs == audioInfo.outPointUs && Float.compare(this.playRate, audioInfo.playRate) == 0 && Intrinsics.areEqual(this.captionType, audioInfo.captionType) && this.from == audioInfo.from && this.hasExtract == audioInfo.hasExtract && Intrinsics.areEqual(this.videoPath, audioInfo.videoPath) && Intrinsics.areEqual(this.reportId, audioInfo.reportId) && Intrinsics.areEqual(this.cacheKey, audioInfo.cacheKey);
    }

    @NotNull
    public final String getAudioFilePath() {
        return this.audioFilePath;
    }

    @Nullable
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final String getCaptionType() {
        return this.captionType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrom() {
        return this.from;
    }

    public final boolean getHasExtract() {
        return this.hasExtract;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getInPointUs() {
        return this.inPointUs;
    }

    public final long getOutPointUs() {
        return this.outPointUs;
    }

    public final float getPlayRate() {
        return this.playRate;
    }

    @Nullable
    public final String getReportId() {
        return this.reportId;
    }

    public final long getTrimInUs() {
        return this.trimInUs;
    }

    public final long getTrimOutUs() {
        return this.trimOutUs;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public int hashCode() {
        int iA = z.a(I.a(this.from, E.a(n.a(this.playRate, C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(E.a(C3554n0.a(this.id.hashCode() * 31, 31, this.duration), 31, this.audioFilePath), 31, this.trimInUs), 31, this.trimOutUs), 31, this.inPointUs), 31, this.outPointUs), 31), 31, this.captionType), 31), 31, this.hasExtract);
        String str = this.videoPath;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.reportId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cacheKey;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setAudioFilePath(@NotNull String str) {
        this.audioFilePath = str;
    }

    public final void setCacheKey(@Nullable String str) {
        this.cacheKey = str;
    }

    public final void setCaptionType(@NotNull String str) {
        this.captionType = str;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFrom(int i7) {
        this.from = i7;
    }

    public final void setHasExtract(boolean z6) {
        this.hasExtract = z6;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setInPointUs(long j7) {
        this.inPointUs = j7;
    }

    public final void setOutPointUs(long j7) {
        this.outPointUs = j7;
    }

    public final void setPlayRate(float f7) {
        this.playRate = f7;
    }

    public final void setReportId(@Nullable String str) {
        this.reportId = str;
    }

    public final void setTrimInUs(long j7) {
        this.trimInUs = j7;
    }

    public final void setTrimOutUs(long j7) {
        this.trimOutUs = j7;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        long j7 = this.duration;
        String str2 = this.audioFilePath;
        long j8 = this.trimInUs;
        long j9 = this.trimOutUs;
        long j10 = this.inPointUs;
        long j11 = this.outPointUs;
        float f7 = this.playRate;
        String str3 = this.captionType;
        int i7 = this.from;
        boolean z6 = this.hasExtract;
        String str4 = this.videoPath;
        String str5 = this.reportId;
        String str6 = this.cacheKey;
        StringBuilder sbA = b.a(j7, "AudioInfo(id=", str, ", duration=");
        B0.b.b(", audioFilePath=", str2, ", trimInUs=", sbA);
        sbA.append(j8);
        J1.z.a(j9, ", trimOutUs=", ", inPointUs=", sbA);
        sbA.append(j10);
        J1.z.a(j11, ", outPointUs=", ", playRate=", sbA);
        sbA.append(f7);
        sbA.append(", captionType=");
        sbA.append(str3);
        sbA.append(", from=");
        d.a(", hasExtract=", ", videoPath=", i7, z6, sbA);
        B.a(str4, ", reportId=", str5, ", cacheKey=", sbA);
        return C8770a.a(sbA, str6, ")");
    }
}
