package com.bilibili.studio.module.tuwen.model;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.util.C4638g;
import cf.l;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.w;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoData.class */
@Keep
public final class BCutVideoData implements Serializable {
    public static final int CLIP_TYPE_PIP = 2;
    public static final int CLIP_TYPE_STICKER = 3;
    public static final int CLIP_TYPE_UNDEFINE = 0;
    public static final int CLIP_TYPE_VIDEO = 1;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String MIME_TYPE_IMAGE_PREFIX = "image";

    @NotNull
    public static final String MIME_TYPE_VIDEO_PREFIX = "video";

    @NotNull
    private String clipDescription;

    @NotNull
    private String clipId;
    private int clipPos;
    private int clipType;

    @NotNull
    private String correspondingId;

    @Nullable
    private Integer correspondingNum;

    @Nullable
    private BcutCropParam cropParam;

    @Nullable
    private String detectAvatarFilePath;
    private int detectMode;
    private long duration;

    @NotNull
    private String filePath;
    private long footageDuration;
    private boolean imageOnly;

    @NotNull
    private String mimeType;
    private boolean needImageMatting;
    private boolean needReverse;

    @NotNull
    private String originFilePath;
    private int playStyleFrom;

    @NotNull
    private String playStyleId;

    @NotNull
    private String reversedFilePath;
    private double speed;

    @Nullable
    private BCutVideoTaskInfo taskInfo;
    private long trimIn;
    private long trimOut;

    @Nullable
    private BCutVideoDetectBean videoDetectResult;

    @NotNull
    private String videoId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutVideoData$a.class */
    public static final class a {
    }

    public BCutVideoData() {
        this(null, null, null, 0L, 0L, 0.0d, null, 0L, null, 0L, null, 0, 0, null, false, false, false, null, null, 0, 0, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public BCutVideoData(@NotNull String str, @NotNull String str2, @NotNull String str3, long j7, long j8, double d7, @NotNull String str4, long j9, @NotNull String str5, long j10, @NotNull String str6, int i7, int i8, @NotNull String str7, boolean z6, boolean z7, boolean z8, @NotNull String str8, @NotNull String str9, int i9, int i10, @Nullable String str10, @Nullable BCutVideoDetectBean bCutVideoDetectBean, @Nullable BcutCropParam bcutCropParam) {
        this.videoId = str;
        this.filePath = str2;
        this.originFilePath = str3;
        this.trimIn = j7;
        this.trimOut = j8;
        this.speed = d7;
        this.mimeType = str4;
        this.duration = j9;
        this.reversedFilePath = str5;
        this.footageDuration = j10;
        this.clipId = str6;
        this.clipPos = i7;
        this.clipType = i8;
        this.clipDescription = str7;
        this.imageOnly = z6;
        this.needReverse = z7;
        this.needImageMatting = z8;
        this.correspondingId = str8;
        this.playStyleId = str9;
        this.playStyleFrom = i9;
        this.detectMode = i10;
        this.detectAvatarFilePath = str10;
        this.videoDetectResult = bCutVideoDetectBean;
        this.cropParam = bcutCropParam;
    }

    public /* synthetic */ BCutVideoData(String str, String str2, String str3, long j7, long j8, double d7, String str4, long j9, String str5, long j10, String str6, int i7, int i8, String str7, boolean z6, boolean z7, boolean z8, String str8, String str9, int i9, int i10, String str10, BCutVideoDetectBean bCutVideoDetectBean, BcutCropParam bcutCropParam, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "0" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 0L : j7, (i11 & 16) != 0 ? 0L : j8, (i11 & 32) != 0 ? 1.0d : d7, (i11 & 64) != 0 ? "" : str4, (i11 & 128) != 0 ? 0L : j9, (i11 & 256) != 0 ? "" : str5, (i11 & 512) != 0 ? 0L : j10, (i11 & 1024) != 0 ? CaptureSchema.OLD_INVALID_ID_STRING : str6, (i11 & 2048) != 0 ? -1 : i7, (i11 & 4096) != 0 ? 0 : i8, (i11 & 8192) != 0 ? "" : str7, (i11 & 16384) != 0 ? false : z6, (i11 & 32768) != 0 ? false : z7, (i11 & 65536) != 0 ? false : z8, (i11 & 131072) != 0 ? "" : str8, (i11 & 262144) != 0 ? "" : str9, (i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? 0 : i9, (i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? 0 : i10, (i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? null : str10, (i11 & 4194304) != 0 ? null : bCutVideoDetectBean, (i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? null : bcutCropParam);
    }

    public static /* synthetic */ BCutVideoData copy$default(BCutVideoData bCutVideoData, String str, String str2, String str3, long j7, long j8, double d7, String str4, long j9, String str5, long j10, String str6, int i7, int i8, String str7, boolean z6, boolean z7, boolean z8, String str8, String str9, int i9, int i10, String str10, BCutVideoDetectBean bCutVideoDetectBean, BcutCropParam bcutCropParam, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bCutVideoData.videoId;
        }
        if ((i11 & 2) != 0) {
            str2 = bCutVideoData.filePath;
        }
        if ((i11 & 4) != 0) {
            str3 = bCutVideoData.originFilePath;
        }
        if ((i11 & 8) != 0) {
            j7 = bCutVideoData.trimIn;
        }
        if ((i11 & 16) != 0) {
            j8 = bCutVideoData.trimOut;
        }
        if ((i11 & 32) != 0) {
            d7 = bCutVideoData.speed;
        }
        if ((i11 & 64) != 0) {
            str4 = bCutVideoData.mimeType;
        }
        if ((i11 & 128) != 0) {
            j9 = bCutVideoData.duration;
        }
        if ((i11 & 256) != 0) {
            str5 = bCutVideoData.reversedFilePath;
        }
        if ((i11 & 512) != 0) {
            j10 = bCutVideoData.footageDuration;
        }
        if ((i11 & 1024) != 0) {
            str6 = bCutVideoData.clipId;
        }
        if ((i11 & 2048) != 0) {
            i7 = bCutVideoData.clipPos;
        }
        if ((i11 & 4096) != 0) {
            i8 = bCutVideoData.clipType;
        }
        if ((i11 & 8192) != 0) {
            str7 = bCutVideoData.clipDescription;
        }
        if ((i11 & 16384) != 0) {
            z6 = bCutVideoData.imageOnly;
        }
        if ((i11 & 32768) != 0) {
            z7 = bCutVideoData.needReverse;
        }
        if ((i11 & 65536) != 0) {
            z8 = bCutVideoData.needImageMatting;
        }
        if ((i11 & 131072) != 0) {
            str8 = bCutVideoData.correspondingId;
        }
        if ((i11 & 262144) != 0) {
            str9 = bCutVideoData.playStyleId;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            i9 = bCutVideoData.playStyleFrom;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            i10 = bCutVideoData.detectMode;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            str10 = bCutVideoData.detectAvatarFilePath;
        }
        if ((i11 & 4194304) != 0) {
            bCutVideoDetectBean = bCutVideoData.videoDetectResult;
        }
        if ((i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            bcutCropParam = bCutVideoData.cropParam;
        }
        return bCutVideoData.copy(str, str2, str3, j7, j8, d7, str4, j9, str5, j10, str6, i7, i8, str7, z6, z7, z8, str8, str9, i9, i10, str10, bCutVideoDetectBean, bcutCropParam);
    }

    @NotNull
    public final String component1() {
        return this.videoId;
    }

    public final long component10() {
        return this.footageDuration;
    }

    @NotNull
    public final String component11() {
        return this.clipId;
    }

    public final int component12() {
        return this.clipPos;
    }

    public final int component13() {
        return this.clipType;
    }

    @NotNull
    public final String component14() {
        return this.clipDescription;
    }

    public final boolean component15() {
        return this.imageOnly;
    }

    public final boolean component16() {
        return this.needReverse;
    }

    public final boolean component17() {
        return this.needImageMatting;
    }

    @NotNull
    public final String component18() {
        return this.correspondingId;
    }

    @NotNull
    public final String component19() {
        return this.playStyleId;
    }

    @NotNull
    public final String component2() {
        return this.filePath;
    }

    public final int component20() {
        return this.playStyleFrom;
    }

    public final int component21() {
        return this.detectMode;
    }

    @Nullable
    public final String component22() {
        return this.detectAvatarFilePath;
    }

    @Nullable
    public final BCutVideoDetectBean component23() {
        return this.videoDetectResult;
    }

    @Nullable
    public final BcutCropParam component24() {
        return this.cropParam;
    }

    @NotNull
    public final String component3() {
        return this.originFilePath;
    }

    public final long component4() {
        return this.trimIn;
    }

    public final long component5() {
        return this.trimOut;
    }

    public final double component6() {
        return this.speed;
    }

    @NotNull
    public final String component7() {
        return this.mimeType;
    }

    public final long component8() {
        return this.duration;
    }

    @NotNull
    public final String component9() {
        return this.reversedFilePath;
    }

    @NotNull
    public final BCutVideoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j7, long j8, double d7, @NotNull String str4, long j9, @NotNull String str5, long j10, @NotNull String str6, int i7, int i8, @NotNull String str7, boolean z6, boolean z7, boolean z8, @NotNull String str8, @NotNull String str9, int i9, int i10, @Nullable String str10, @Nullable BCutVideoDetectBean bCutVideoDetectBean, @Nullable BcutCropParam bcutCropParam) {
        return new BCutVideoData(str, str2, str3, j7, j8, d7, str4, j9, str5, j10, str6, i7, i8, str7, z6, z7, z8, str8, str9, i9, i10, str10, bCutVideoDetectBean, bcutCropParam);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCutVideoData)) {
            return false;
        }
        BCutVideoData bCutVideoData = (BCutVideoData) obj;
        return Intrinsics.areEqual(this.videoId, bCutVideoData.videoId) && Intrinsics.areEqual(this.filePath, bCutVideoData.filePath) && Intrinsics.areEqual(this.originFilePath, bCutVideoData.originFilePath) && this.trimIn == bCutVideoData.trimIn && this.trimOut == bCutVideoData.trimOut && Double.compare(this.speed, bCutVideoData.speed) == 0 && Intrinsics.areEqual(this.mimeType, bCutVideoData.mimeType) && this.duration == bCutVideoData.duration && Intrinsics.areEqual(this.reversedFilePath, bCutVideoData.reversedFilePath) && this.footageDuration == bCutVideoData.footageDuration && Intrinsics.areEqual(this.clipId, bCutVideoData.clipId) && this.clipPos == bCutVideoData.clipPos && this.clipType == bCutVideoData.clipType && Intrinsics.areEqual(this.clipDescription, bCutVideoData.clipDescription) && this.imageOnly == bCutVideoData.imageOnly && this.needReverse == bCutVideoData.needReverse && this.needImageMatting == bCutVideoData.needImageMatting && Intrinsics.areEqual(this.correspondingId, bCutVideoData.correspondingId) && Intrinsics.areEqual(this.playStyleId, bCutVideoData.playStyleId) && this.playStyleFrom == bCutVideoData.playStyleFrom && this.detectMode == bCutVideoData.detectMode && Intrinsics.areEqual(this.detectAvatarFilePath, bCutVideoData.detectAvatarFilePath) && Intrinsics.areEqual(this.videoDetectResult, bCutVideoData.videoDetectResult) && Intrinsics.areEqual(this.cropParam, bCutVideoData.cropParam);
    }

    @NotNull
    public final String getClipDescription() {
        return this.clipDescription;
    }

    @NotNull
    public final String getClipId() {
        return this.clipId;
    }

    public final int getClipPos() {
        return this.clipPos;
    }

    public final int getClipType() {
        return this.clipType;
    }

    @NotNull
    public final String getCorrespondingId() {
        return this.correspondingId;
    }

    @Nullable
    public final Integer getCorrespondingNum() {
        return this.correspondingNum;
    }

    @Nullable
    public final BcutCropParam getCropParam() {
        return this.cropParam;
    }

    @Nullable
    public final String getDetectAvatarFilePath() {
        return this.detectAvatarFilePath;
    }

    public final int getDetectMode() {
        return this.detectMode;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFootageDuration() {
        return this.footageDuration;
    }

    public final boolean getImageOnly() {
        return this.imageOnly;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public final boolean getNeedImageMatting() {
        return this.needImageMatting;
    }

    public final boolean getNeedReverse() {
        return this.needReverse;
    }

    @NotNull
    public final String getOriginFilePath() {
        return this.originFilePath;
    }

    public final int getPlayStyleFrom() {
        return this.playStyleFrom;
    }

    @NotNull
    public final String getPlayStyleId() {
        return this.playStyleId;
    }

    @NotNull
    public final String getReversedFilePath() {
        return this.reversedFilePath;
    }

    public final double getSpeed() {
        return this.speed;
    }

    @Nullable
    public final BCutVideoTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public final long getTrimIn() {
        return this.trimIn;
    }

    public final long getTrimOut() {
        return this.trimOut;
    }

    @Nullable
    public final BCutVideoDetectBean getVideoDetectResult() {
        return this.videoDetectResult;
    }

    @NotNull
    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        int iA = I.a(this.detectMode, I.a(this.playStyleFrom, E.a(E.a(z.a(z.a(z.a(E.a(I.a(this.clipType, I.a(this.clipPos, E.a(C3554n0.a(E.a(C3554n0.a(E.a(A.a(this.speed, C3554n0.a(C3554n0.a(E.a(E.a(this.videoId.hashCode() * 31, 31, this.filePath), 31, this.originFilePath), 31, this.trimIn), 31, this.trimOut), 31), 31, this.mimeType), 31, this.duration), 31, this.reversedFilePath), 31, this.footageDuration), 31, this.clipId), 31), 31), 31, this.clipDescription), 31, this.imageOnly), 31, this.needReverse), 31, this.needImageMatting), 31, this.correspondingId), 31, this.playStyleId), 31), 31);
        String str = this.detectAvatarFilePath;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        BCutVideoDetectBean bCutVideoDetectBean = this.videoDetectResult;
        int iHashCode3 = bCutVideoDetectBean == null ? 0 : bCutVideoDetectBean.hashCode();
        BcutCropParam bcutCropParam = this.cropParam;
        if (bcutCropParam != null) {
            iHashCode = bcutCropParam.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final boolean isDetectMode() {
        return this.detectMode > 0;
    }

    public final boolean isImage() {
        return StringsKt.Z(this.mimeType, "image");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isPlayStyle3D() {
        /*
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.filePath
            int r0 = r0.length()
            if (r0 <= 0) goto L33
            r0 = r3
            java.lang.String r0 = r0.playStyleId
            int r0 = r0.length()
            if (r0 <= 0) goto L33
            r0 = r3
            int r0 = r0.playStyleFrom
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L24
            r0 = r4
            if (r0 != 0) goto L33
        L24:
            r0 = r3
            java.lang.String r0 = r0.mimeType
            java.lang.String r1 = "image"
            boolean r0 = kotlin.text.StringsKt.Z(r0, r1)
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = 0
            r5 = r0
        L35:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.module.tuwen.model.BCutVideoData.isPlayStyle3D():boolean");
    }

    public final boolean isPlayStyleAI() {
        return this.filePath.length() > 0 && this.playStyleId.length() > 0 && this.playStyleFrom == 2 && StringsKt.Z(this.mimeType, "image");
    }

    public final void setClipDescription(@NotNull String str) {
        this.clipDescription = str;
    }

    public final void setClipId(@NotNull String str) {
        this.clipId = str;
    }

    public final void setClipPos(int i7) {
        this.clipPos = i7;
    }

    public final void setClipType(int i7) {
        this.clipType = i7;
    }

    public final void setCorrespondingId(@NotNull String str) {
        this.correspondingId = str;
    }

    public final void setCorrespondingNum(@Nullable Integer num) {
        this.correspondingNum = num;
    }

    public final void setCropParam(@Nullable BcutCropParam bcutCropParam) {
        this.cropParam = bcutCropParam;
    }

    public final void setDetectAvatarFilePath(@Nullable String str) {
        this.detectAvatarFilePath = str;
    }

    public final void setDetectMode(int i7) {
        this.detectMode = i7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFilePath(@NotNull String str) {
        this.filePath = str;
    }

    public final void setFootageDuration(long j7) {
        this.footageDuration = j7;
    }

    public final void setImageOnly(boolean z6) {
        this.imageOnly = z6;
    }

    public final void setMimeType(@NotNull String str) {
        this.mimeType = str;
    }

    public final void setNeedImageMatting(boolean z6) {
        this.needImageMatting = z6;
    }

    public final void setNeedReverse(boolean z6) {
        this.needReverse = z6;
    }

    public final void setOriginFilePath(@NotNull String str) {
        this.originFilePath = str;
    }

    public final void setPlayStyleFrom(int i7) {
        this.playStyleFrom = i7;
    }

    public final void setPlayStyleId(@NotNull String str) {
        this.playStyleId = str;
    }

    public final void setReversedFilePath(@NotNull String str) {
        this.reversedFilePath = str;
    }

    public final void setSpeed(double d7) {
        this.speed = d7;
    }

    public final void setTaskInfo(@Nullable BCutVideoTaskInfo bCutVideoTaskInfo) {
        this.taskInfo = bCutVideoTaskInfo;
    }

    public final void setTrimIn(long j7) {
        this.trimIn = j7;
    }

    public final void setTrimOut(long j7) {
        this.trimOut = j7;
    }

    public final void setVideoDetectResult(@Nullable BCutVideoDetectBean bCutVideoDetectBean) {
        this.videoDetectResult = bCutVideoDetectBean;
    }

    public final void setVideoId(@NotNull String str) {
        this.videoId = str;
    }

    @NotNull
    public String toString() {
        String str = this.videoId;
        String str2 = this.filePath;
        String str3 = this.originFilePath;
        long j7 = this.trimIn;
        long j8 = this.trimOut;
        double d7 = this.speed;
        String str4 = this.mimeType;
        long j9 = this.duration;
        String str5 = this.reversedFilePath;
        long j10 = this.footageDuration;
        String str6 = this.clipId;
        int i7 = this.clipPos;
        int i8 = this.clipType;
        String str7 = this.clipDescription;
        boolean z6 = this.imageOnly;
        boolean z7 = this.needReverse;
        boolean z8 = this.needImageMatting;
        String str8 = this.correspondingId;
        String str9 = this.playStyleId;
        int i9 = this.playStyleFrom;
        int i10 = this.detectMode;
        String str10 = this.detectAvatarFilePath;
        BCutVideoDetectBean bCutVideoDetectBean = this.videoDetectResult;
        BcutCropParam bcutCropParam = this.cropParam;
        StringBuilder sbA = b.a("BCutVideoData(videoId=", str, ", filePath=", str2, ", originFilePath=");
        v.a(j7, str3, ", trimIn=", sbA);
        J1.z.a(j8, ", trimOut=", ", speed=", sbA);
        sbA.append(d7);
        sbA.append(", mimeType=");
        sbA.append(str4);
        J1.z.a(j9, ", duration=", ", reversedFilePath=", sbA);
        v.a(j10, str5, ", footageDuration=", sbA);
        bf.a.a(i7, ", clipId=", str6, ", clipPos=", sbA);
        l.a(i8, ", clipType=", ", clipDescription=", str7, sbA);
        C4638g.b(", imageOnly=", ", needReverse=", sbA, z6, z7);
        w.a(", needImageMatting=", ", correspondingId=", str8, sbA, z8);
        bf.a.a(i9, ", playStyleId=", str9, ", playStyleFrom=", sbA);
        l.a(i10, ", detectMode=", ", detectAvatarFilePath=", str10, sbA);
        sbA.append(", videoDetectResult=");
        sbA.append(bCutVideoDetectBean);
        sbA.append(", cropParam=");
        sbA.append(bcutCropParam);
        sbA.append(")");
        return sbA.toString();
    }
}
