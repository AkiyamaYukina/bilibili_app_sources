package com.bilibili.upper.module.cover.editor;

import androidx.annotation.Keep;
import com.bilibili.upper.module.cover.entity.CoverEditorCaptionInfo;
import com.bilibili.upper.module.cover.entity.CoverEditorImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/editor/CoverEditorInfo.class */
@Keep
public class CoverEditorInfo {
    private ArrayList<CoverEditorCaptionInfo> mCaptionEditorList = new ArrayList<>();
    private CoverEditorImageInfo mCoverEditorImageInfo = new CoverEditorImageInfo();
    private long mCurrentApplyCaptionId;

    @NotNull
    public ArrayList<CoverEditorCaptionInfo> getCaptionEditorList() {
        return this.mCaptionEditorList;
    }

    @NotNull
    public ArrayList<CoverEditorCaptionInfo> getCaptionEditorListClone() {
        ArrayList<CoverEditorCaptionInfo> arrayList = new ArrayList<>();
        ArrayList<CoverEditorCaptionInfo> arrayList2 = this.mCaptionEditorList;
        if (arrayList2 == null) {
            return arrayList;
        }
        Iterator<CoverEditorCaptionInfo> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m10646clone());
        }
        return arrayList;
    }

    @NotNull
    public CoverEditorImageInfo getCoverEditorImageInfo() {
        return this.mCoverEditorImageInfo;
    }

    public long getCurrentApplyCaptionId() {
        return this.mCurrentApplyCaptionId;
    }

    public void setCaptionEditorEntity(@NotNull ArrayList<CoverEditorCaptionInfo> arrayList) {
        this.mCaptionEditorList = arrayList;
    }

    public void setCoverEditorImageInfo(@NotNull CoverEditorImageInfo coverEditorImageInfo) {
        this.mCoverEditorImageInfo = coverEditorImageInfo;
    }

    public void setCurrentApplyCaptionId(long j7) {
        this.mCurrentApplyCaptionId = j7;
    }
}
