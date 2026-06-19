package com.bilibili.studio.editor.moudle.sticker.v1;

import Uu.a;
import androidx.annotation.Keep;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/BatchEditStickerAndCaptionData.class */
@Keep
public final class BatchEditStickerAndCaptionData {

    @NotNull
    private final ArrayList<Long> deleteCaptionList;

    @NotNull
    private final ArrayList<Pair<Integer, Long>> deleteStickerList;

    @NotNull
    private final ArrayList<Long> editCaptionList;

    @NotNull
    private final ArrayList<Pair<Integer, Long>> editStickerList;

    @Nullable
    private final CaptionInfo selectCaptionInfo;

    public BatchEditStickerAndCaptionData(@NotNull ArrayList<Long> arrayList, @NotNull ArrayList<Long> arrayList2, @NotNull ArrayList<Pair<Integer, Long>> arrayList3, @NotNull ArrayList<Pair<Integer, Long>> arrayList4, @Nullable CaptionInfo captionInfo) {
        this.deleteCaptionList = arrayList;
        this.editCaptionList = arrayList2;
        this.deleteStickerList = arrayList3;
        this.editStickerList = arrayList4;
        this.selectCaptionInfo = captionInfo;
    }

    public /* synthetic */ BatchEditStickerAndCaptionData(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, CaptionInfo captionInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, arrayList3, arrayList4, (i7 & 16) != 0 ? null : captionInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchEditStickerAndCaptionData copy$default(BatchEditStickerAndCaptionData batchEditStickerAndCaptionData, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, CaptionInfo captionInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            arrayList = batchEditStickerAndCaptionData.deleteCaptionList;
        }
        if ((i7 & 2) != 0) {
            arrayList2 = batchEditStickerAndCaptionData.editCaptionList;
        }
        if ((i7 & 4) != 0) {
            arrayList3 = batchEditStickerAndCaptionData.deleteStickerList;
        }
        if ((i7 & 8) != 0) {
            arrayList4 = batchEditStickerAndCaptionData.editStickerList;
        }
        if ((i7 & 16) != 0) {
            captionInfo = batchEditStickerAndCaptionData.selectCaptionInfo;
        }
        return batchEditStickerAndCaptionData.copy(arrayList, arrayList2, arrayList3, arrayList4, captionInfo);
    }

    @NotNull
    public final ArrayList<Long> component1() {
        return this.deleteCaptionList;
    }

    @NotNull
    public final ArrayList<Long> component2() {
        return this.editCaptionList;
    }

    @NotNull
    public final ArrayList<Pair<Integer, Long>> component3() {
        return this.deleteStickerList;
    }

    @NotNull
    public final ArrayList<Pair<Integer, Long>> component4() {
        return this.editStickerList;
    }

    @Nullable
    public final CaptionInfo component5() {
        return this.selectCaptionInfo;
    }

    @NotNull
    public final BatchEditStickerAndCaptionData copy(@NotNull ArrayList<Long> arrayList, @NotNull ArrayList<Long> arrayList2, @NotNull ArrayList<Pair<Integer, Long>> arrayList3, @NotNull ArrayList<Pair<Integer, Long>> arrayList4, @Nullable CaptionInfo captionInfo) {
        return new BatchEditStickerAndCaptionData(arrayList, arrayList2, arrayList3, arrayList4, captionInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchEditStickerAndCaptionData)) {
            return false;
        }
        BatchEditStickerAndCaptionData batchEditStickerAndCaptionData = (BatchEditStickerAndCaptionData) obj;
        return Intrinsics.areEqual(this.deleteCaptionList, batchEditStickerAndCaptionData.deleteCaptionList) && Intrinsics.areEqual(this.editCaptionList, batchEditStickerAndCaptionData.editCaptionList) && Intrinsics.areEqual(this.deleteStickerList, batchEditStickerAndCaptionData.deleteStickerList) && Intrinsics.areEqual(this.editStickerList, batchEditStickerAndCaptionData.editStickerList) && Intrinsics.areEqual(this.selectCaptionInfo, batchEditStickerAndCaptionData.selectCaptionInfo);
    }

    @NotNull
    public final ArrayList<Long> getDeleteCaptionList() {
        return this.deleteCaptionList;
    }

    @NotNull
    public final ArrayList<Pair<Integer, Long>> getDeleteStickerList() {
        return this.deleteStickerList;
    }

    @NotNull
    public final ArrayList<Long> getEditCaptionList() {
        return this.editCaptionList;
    }

    @NotNull
    public final ArrayList<Pair<Integer, Long>> getEditStickerList() {
        return this.editStickerList;
    }

    @Nullable
    public final CaptionInfo getSelectCaptionInfo() {
        return this.selectCaptionInfo;
    }

    public int hashCode() {
        int iA = a.a(a.a(a.a(this.deleteCaptionList.hashCode() * 31, 31, this.editCaptionList), 31, this.deleteStickerList), 31, this.editStickerList);
        CaptionInfo captionInfo = this.selectCaptionInfo;
        return iA + (captionInfo == null ? 0 : captionInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "BatchEditStickerAndCaptionData(deleteCaptionList=" + this.deleteCaptionList + ", editCaptionList=" + this.editCaptionList + ", deleteStickerList=" + this.deleteStickerList + ", editStickerList=" + this.editStickerList + ", selectCaptionInfo=" + this.selectCaptionInfo + ")";
    }
}
