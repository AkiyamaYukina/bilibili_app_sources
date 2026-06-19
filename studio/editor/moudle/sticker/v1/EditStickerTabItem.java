package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerBean;
import com.bilibili.studio.editor.moudle.sticker.v1.VideoFxStickerWithCategoryBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/EditStickerTabItem.class */
@Keep
public class EditStickerTabItem implements Comparable<EditStickerTabItem> {
    private long mId;
    private String mName;
    private int mRank;
    private List<EditStickerItem> mStickerItemList;
    private int mType;

    public EditStickerTabItem() {
        this.mName = "";
        this.mStickerItemList = new ArrayList();
    }

    public EditStickerTabItem(VideoFxStickerWithCategoryBean.VideoFxStickerCategoryBean videoFxStickerCategoryBean) {
        this();
        this.mId = videoFxStickerCategoryBean.id;
        this.mRank = videoFxStickerCategoryBean.rank;
        String str = videoFxStickerCategoryBean.name;
        if (str != null) {
            this.mName = str;
        }
        this.mType = videoFxStickerCategoryBean.type;
        List<VideoFxStickerBean.FxDataBean> list = videoFxStickerCategoryBean.stickerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.mStickerItemList.add(new EditStickerItem(list.get(i7)));
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditStickerTabItem editStickerTabItem) {
        return this.mRank - editStickerTabItem.getRank();
    }

    public long getId() {
        return this.mId;
    }

    public String getLabel() {
        return this.mName;
    }

    public int getRank() {
        return this.mRank;
    }

    public List<EditStickerItem> getStickerItemList() {
        return this.mStickerItemList;
    }

    public int getType() {
        return this.mType;
    }

    public void setId(long j7) {
        this.mId = j7;
    }

    public void setLabel(String str) {
        this.mName = str;
    }

    public void setRank(int i7) {
        this.mRank = i7;
    }

    public void setStickerItemList(List<EditStickerItem> list) {
        this.mStickerItemList = list;
    }

    public void setType(int i7) {
        this.mType = i7;
    }
}
