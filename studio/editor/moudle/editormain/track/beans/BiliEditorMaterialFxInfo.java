package com.bilibili.studio.editor.moudle.editormain.track.beans;

import J1.z;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialFxInfo.class */
@Keep
public final class BiliEditorMaterialFxInfo extends BiliEditorBaseMaterialInfo {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String KEY_CAPTION_INFO = "key_caption_info";

    @Nullable
    private final String label;
    private int leftPos;
    private final long leftTime;

    @Nullable
    private final mD0.a materialInfo;

    @NotNull
    private final BiliEditorMaterialType materialType;
    private int rightPos;
    private final long rightTime;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialFxInfo$a.class */
    public static final class a {
    }

    public BiliEditorMaterialFxInfo(@NotNull BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, int i7, int i8, @Nullable String str, @Nullable mD0.a aVar) {
        super(null, null, 3, null);
        this.materialType = biliEditorMaterialType;
        this.leftTime = j7;
        this.rightTime = j8;
        this.leftPos = i7;
        this.rightPos = i8;
        this.label = str;
        this.materialInfo = aVar;
    }

    public static /* synthetic */ BiliEditorMaterialFxInfo copy$default(BiliEditorMaterialFxInfo biliEditorMaterialFxInfo, BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, int i7, int i8, String str, mD0.a aVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            biliEditorMaterialType = biliEditorMaterialFxInfo.materialType;
        }
        if ((i9 & 2) != 0) {
            j7 = biliEditorMaterialFxInfo.leftTime;
        }
        if ((i9 & 4) != 0) {
            j8 = biliEditorMaterialFxInfo.rightTime;
        }
        if ((i9 & 8) != 0) {
            i7 = biliEditorMaterialFxInfo.leftPos;
        }
        if ((i9 & 16) != 0) {
            i8 = biliEditorMaterialFxInfo.rightPos;
        }
        if ((i9 & 32) != 0) {
            str = biliEditorMaterialFxInfo.label;
        }
        if ((i9 & 64) != 0) {
            aVar = biliEditorMaterialFxInfo.materialInfo;
        }
        return biliEditorMaterialFxInfo.copy(biliEditorMaterialType, j7, j8, i7, i8, str, aVar);
    }

    @NotNull
    public final BiliEditorMaterialType component1() {
        return this.materialType;
    }

    public final long component2() {
        return this.leftTime;
    }

    public final long component3() {
        return this.rightTime;
    }

    public final int component4() {
        return this.leftPos;
    }

    public final int component5() {
        return this.rightPos;
    }

    @Nullable
    public final String component6() {
        return this.label;
    }

    @Nullable
    public final mD0.a component7() {
        return this.materialInfo;
    }

    @NotNull
    public final BiliEditorMaterialFxInfo copy(@NotNull BiliEditorMaterialType biliEditorMaterialType, long j7, long j8, int i7, int i8, @Nullable String str, @Nullable mD0.a aVar) {
        return new BiliEditorMaterialFxInfo(biliEditorMaterialType, j7, j8, i7, i8, str, aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliEditorMaterialFxInfo)) {
            return false;
        }
        BiliEditorMaterialFxInfo biliEditorMaterialFxInfo = (BiliEditorMaterialFxInfo) obj;
        return this.materialType == biliEditorMaterialFxInfo.materialType && this.leftTime == biliEditorMaterialFxInfo.leftTime && this.rightTime == biliEditorMaterialFxInfo.rightTime && this.leftPos == biliEditorMaterialFxInfo.leftPos && this.rightPos == biliEditorMaterialFxInfo.rightPos && Intrinsics.areEqual(this.label, biliEditorMaterialFxInfo.label) && Intrinsics.areEqual(this.materialInfo, biliEditorMaterialFxInfo.materialInfo);
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final int getLeftPos() {
        return this.leftPos;
    }

    public final long getLeftTime() {
        return this.leftTime;
    }

    @Nullable
    public final mD0.a getMaterialInfo() {
        return this.materialInfo;
    }

    @NotNull
    public final BiliEditorMaterialType getMaterialType() {
        return this.materialType;
    }

    public final int getRightPos() {
        return this.rightPos;
    }

    public final long getRightTime() {
        return this.rightTime;
    }

    public int hashCode() {
        int iA = I.a(this.rightPos, I.a(this.leftPos, C3554n0.a(C3554n0.a(this.materialType.hashCode() * 31, 31, this.leftTime), 31, this.rightTime), 31), 31);
        String str = this.label;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        mD0.a aVar = this.materialInfo;
        if (aVar != null) {
            iHashCode = aVar.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    public final void setLeftPos(int i7) {
        this.leftPos = i7;
    }

    public final void setRightPos(int i7) {
        this.rightPos = i7;
    }

    @NotNull
    public String toString() {
        BiliEditorMaterialType biliEditorMaterialType = this.materialType;
        long j7 = this.leftTime;
        long j8 = this.rightTime;
        int i7 = this.leftPos;
        int i8 = this.rightPos;
        String str = this.label;
        mD0.a aVar = this.materialInfo;
        StringBuilder sb = new StringBuilder("BiliEditorMaterialFxInfo(materialType=");
        sb.append(biliEditorMaterialType);
        sb.append(", leftTime=");
        sb.append(j7);
        z.a(j8, ", rightTime=", ", leftPos=", sb);
        C4690e.a(i7, i8, ", rightPos=", ", label=", sb);
        sb.append(str);
        sb.append(", materialInfo=");
        sb.append(aVar);
        sb.append(")");
        return sb.toString();
    }
}
