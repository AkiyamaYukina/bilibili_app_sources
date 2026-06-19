package com.bilibili.studio.editor.moudle.editormain.track.beans;

import Bw0.c;
import J1.z;
import W60.F;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.media3.common.G;
import cf.i;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialMultiInfo.class */
@Keep
public final class BiliEditorMaterialMultiInfo extends BiliEditorBaseMaterialInfo {

    @NotNull
    public static final a Companion = new Object();
    public static final int DX_POSITION = 1;
    public static final int DX_TIME = 1000;

    @NotNull
    public static final String KEY_CAPTION_BIND_TTS_INFO = "key_caption_bind_tts_info";

    @NotNull
    public static final String KEY_CAPTION_INFO = "key_caption_info";

    @NotNull
    public static final String KEY_MUSIC_INFO = "key_music_info";

    @NotNull
    public static final String KEY_RECORD_INFO = "key_record_info";

    @NotNull
    public static final String KEY_STICKER_INFO = "key_sticker_info";
    private long addTime;
    private int bottomPos;
    private int captionType;
    private long inPoint;

    @Nullable
    private String labelFilePath;

    @Nullable
    private Integer labelResId;

    @Nullable
    private String labelText;
    private int leftPos;

    @NotNull
    private final BiliEditorMaterialType materialType;
    private long outPoint;
    private int rightPos;

    @NotNull
    private MaterialState state;
    private int topPos;
    private int trackIndex;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialMultiInfo$a.class */
    public static final class a {
    }

    public BiliEditorMaterialMultiInfo(@NotNull BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, long j9, int i7, @NotNull MaterialState materialState, @Nullable String str, @Nullable Integer num, @Nullable String str2, int i8, int i9, int i10, int i11, int i12) {
        super(null, null, 3, null);
        this.materialType = biliEditorMaterialType;
        this.inPoint = j7;
        this.outPoint = j8;
        this.addTime = j9;
        this.captionType = i7;
        this.state = materialState;
        this.labelText = str;
        this.labelResId = num;
        this.labelFilePath = str2;
        this.leftPos = i8;
        this.rightPos = i9;
        this.topPos = i10;
        this.bottomPos = i11;
        this.trackIndex = i12;
    }

    public /* synthetic */ BiliEditorMaterialMultiInfo(BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, long j9, int i7, MaterialState materialState, String str, Integer num, String str2, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(biliEditorMaterialType, (i13 & 2) != 0 ? 0L : j7, (i13 & 4) != 0 ? 0L : j8, (i13 & 8) != 0 ? 0L : j9, (i13 & 16) != 0 ? -1 : i7, (i13 & 32) != 0 ? MaterialState.FIXED : materialState, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : num, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? 0 : i8, (i13 & 1024) != 0 ? 0 : i9, (i13 & 2048) != 0 ? 0 : i10, (i13 & 4096) != 0 ? 0 : i11, (i13 & 8192) != 0 ? 0 : i12);
    }

    public static /* synthetic */ BiliEditorMaterialMultiInfo copy$default(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, long j9, int i7, MaterialState materialState, String str, Integer num, String str2, int i8, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            biliEditorMaterialType = biliEditorMaterialMultiInfo.materialType;
        }
        if ((i13 & 2) != 0) {
            j7 = biliEditorMaterialMultiInfo.inPoint;
        }
        if ((i13 & 4) != 0) {
            j8 = biliEditorMaterialMultiInfo.outPoint;
        }
        if ((i13 & 8) != 0) {
            j9 = biliEditorMaterialMultiInfo.addTime;
        }
        if ((i13 & 16) != 0) {
            i7 = biliEditorMaterialMultiInfo.captionType;
        }
        if ((i13 & 32) != 0) {
            materialState = biliEditorMaterialMultiInfo.state;
        }
        if ((i13 & 64) != 0) {
            str = biliEditorMaterialMultiInfo.labelText;
        }
        if ((i13 & 128) != 0) {
            num = biliEditorMaterialMultiInfo.labelResId;
        }
        if ((i13 & 256) != 0) {
            str2 = biliEditorMaterialMultiInfo.labelFilePath;
        }
        if ((i13 & 512) != 0) {
            i8 = biliEditorMaterialMultiInfo.leftPos;
        }
        if ((i13 & 1024) != 0) {
            i9 = biliEditorMaterialMultiInfo.rightPos;
        }
        if ((i13 & 2048) != 0) {
            i10 = biliEditorMaterialMultiInfo.topPos;
        }
        if ((i13 & 4096) != 0) {
            i11 = biliEditorMaterialMultiInfo.bottomPos;
        }
        if ((i13 & 8192) != 0) {
            i12 = biliEditorMaterialMultiInfo.trackIndex;
        }
        return biliEditorMaterialMultiInfo.copy(biliEditorMaterialType, j7, j8, j9, i7, materialState, str, num, str2, i8, i9, i10, i11, i12);
    }

    @NotNull
    public final BiliEditorMaterialType component1() {
        return this.materialType;
    }

    public final int component10() {
        return this.leftPos;
    }

    public final int component11() {
        return this.rightPos;
    }

    public final int component12() {
        return this.topPos;
    }

    public final int component13() {
        return this.bottomPos;
    }

    public final int component14() {
        return this.trackIndex;
    }

    public final long component2() {
        return this.inPoint;
    }

    public final long component3() {
        return this.outPoint;
    }

    public final long component4() {
        return this.addTime;
    }

    public final int component5() {
        return this.captionType;
    }

    @NotNull
    public final MaterialState component6() {
        return this.state;
    }

    @Nullable
    public final String component7() {
        return this.labelText;
    }

    @Nullable
    public final Integer component8() {
        return this.labelResId;
    }

    @Nullable
    public final String component9() {
        return this.labelFilePath;
    }

    @NotNull
    public final BiliEditorMaterialMultiInfo copy(@NotNull BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, long j9, int i7, @NotNull MaterialState materialState, @Nullable String str, @Nullable Integer num, @Nullable String str2, int i8, int i9, int i10, int i11, int i12) {
        return new BiliEditorMaterialMultiInfo(biliEditorMaterialType, j7, j8, j9, i7, materialState, str, num, str2, i8, i9, i10, i11, i12);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliEditorMaterialMultiInfo)) {
            return false;
        }
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = (BiliEditorMaterialMultiInfo) obj;
        return this.materialType == biliEditorMaterialMultiInfo.materialType && this.inPoint == biliEditorMaterialMultiInfo.inPoint && this.outPoint == biliEditorMaterialMultiInfo.outPoint && this.addTime == biliEditorMaterialMultiInfo.addTime && this.captionType == biliEditorMaterialMultiInfo.captionType && this.state == biliEditorMaterialMultiInfo.state && Intrinsics.areEqual(this.labelText, biliEditorMaterialMultiInfo.labelText) && Intrinsics.areEqual(this.labelResId, biliEditorMaterialMultiInfo.labelResId) && Intrinsics.areEqual(this.labelFilePath, biliEditorMaterialMultiInfo.labelFilePath) && this.leftPos == biliEditorMaterialMultiInfo.leftPos && this.rightPos == biliEditorMaterialMultiInfo.rightPos && this.topPos == biliEditorMaterialMultiInfo.topPos && this.bottomPos == biliEditorMaterialMultiInfo.bottomPos && this.trackIndex == biliEditorMaterialMultiInfo.trackIndex;
    }

    public final long getAddTime() {
        return this.addTime;
    }

    public final int getBottomPos() {
        return this.bottomPos;
    }

    public final int getCaptionType() {
        return this.captionType;
    }

    public final int getHeight() {
        return this.bottomPos - this.topPos;
    }

    public final long getInPoint() {
        return this.inPoint;
    }

    @Nullable
    public final String getLabelFilePath() {
        return this.labelFilePath;
    }

    @Nullable
    public final Integer getLabelResId() {
        return this.labelResId;
    }

    @Nullable
    public final String getLabelText() {
        return this.labelText;
    }

    public final int getLeftPos() {
        return this.leftPos;
    }

    @NotNull
    public final BiliEditorMaterialType getMaterialType() {
        return this.materialType;
    }

    public final long getOutPoint() {
        return this.outPoint;
    }

    public final int getRightPos() {
        return this.rightPos;
    }

    @NotNull
    public final MaterialState getState() {
        return this.state;
    }

    public final int getTopPos() {
        return this.topPos;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public int hashCode() {
        int iA = I.a(this.captionType, C3554n0.a(C3554n0.a(C3554n0.a(this.materialType.hashCode() * 31, 31, this.inPoint), 31, this.outPoint), 31, this.addTime), 31);
        int iHashCode = this.state.hashCode();
        String str = this.labelText;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.labelResId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str2 = this.labelFilePath;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return Integer.hashCode(this.trackIndex) + I.a(this.bottomPos, I.a(this.topPos, I.a(this.rightPos, I.a(this.leftPos, (((((((iHashCode + iA) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31, 31), 31), 31), 31);
    }

    public final boolean isAsrCaption() {
        return c.a(this.captionType);
    }

    public final boolean isAudioMaterial() {
        BiliEditorMaterialType biliEditorMaterialType = this.materialType;
        return biliEditorMaterialType == BiliEditorMaterialType.TYPE_MUSIC || biliEditorMaterialType == BiliEditorMaterialType.TYPE_RECORD;
    }

    public final boolean isCaptionMaterial() {
        return this.materialType == BiliEditorMaterialType.TYPE_CAPTION;
    }

    public final boolean isMusicMaterial() {
        return this.materialType == BiliEditorMaterialType.TYPE_MUSIC;
    }

    public final boolean isRecordMaterial() {
        return this.materialType == BiliEditorMaterialType.TYPE_RECORD;
    }

    public final boolean isStickerMaterial() {
        return this.materialType == BiliEditorMaterialType.TYPE_STICKER;
    }

    public final void setAddTime(long j7) {
        this.addTime = j7;
    }

    public final void setBottomPos(int i7) {
        this.bottomPos = i7;
    }

    public final void setCaptionType(int i7) {
        this.captionType = i7;
    }

    public final void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public final void setLabelFilePath(@Nullable String str) {
        this.labelFilePath = str;
    }

    public final void setLabelResId(@Nullable Integer num) {
        this.labelResId = num;
    }

    public final void setLabelText(@Nullable String str) {
        this.labelText = str;
    }

    public final void setLeftPos(int i7) {
        this.leftPos = i7;
    }

    public final void setOutPoint(long j7) {
        this.outPoint = j7;
    }

    public final void setRightPos(int i7) {
        this.rightPos = i7;
    }

    public final void setState(@NotNull MaterialState materialState) {
        this.state = materialState;
    }

    public final void setTopPos(int i7) {
        this.topPos = i7;
    }

    public final void setTrackIndex(int i7) {
        this.trackIndex = i7;
    }

    @NotNull
    public String toString() {
        BiliEditorMaterialType biliEditorMaterialType = this.materialType;
        long j7 = this.inPoint;
        long j8 = this.outPoint;
        long j9 = this.addTime;
        int i7 = this.captionType;
        MaterialState materialState = this.state;
        String str = this.labelText;
        Integer num = this.labelResId;
        String str2 = this.labelFilePath;
        int i8 = this.leftPos;
        int i9 = this.rightPos;
        int i10 = this.topPos;
        int i11 = this.bottomPos;
        int i12 = this.trackIndex;
        StringBuilder sb = new StringBuilder("BiliEditorMaterialMultiInfo(materialType=");
        sb.append(biliEditorMaterialType);
        sb.append(", inPoint=");
        sb.append(j7);
        z.a(j8, ", outPoint=", ", addTime=", sb);
        G.a(i7, j9, ", captionType=", sb);
        sb.append(", state=");
        sb.append(materialState);
        sb.append(", labelText=");
        sb.append(str);
        sb.append(", labelResId=");
        sb.append(num);
        sb.append(", labelFilePath=");
        sb.append(str2);
        F.b(i8, i9, ", leftPos=", ", rightPos=", sb);
        F.b(i10, i11, ", topPos=", ", bottomPos=", sb);
        return i.a(i12, ", trackIndex=", ")", sb);
    }
}
