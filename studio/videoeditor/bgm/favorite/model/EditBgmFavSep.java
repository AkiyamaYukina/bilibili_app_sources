package com.bilibili.studio.videoeditor.bgm.favorite.model;

import com.bilibili.studio.videoeditor.bgm.Bgm;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/favorite/model/EditBgmFavSep.class */
public class EditBgmFavSep extends Bgm {
    public static final int STATUS_EMPTY_FAV = 0;
    public static final int STATUS_HAVE_FAV = 1;
    private static final int STATUS_UNKNOWN = -1;
    private int mSepStatus = -1;

    public int getStatus() {
        return this.mSepStatus;
    }

    public void setStatus(int i7) {
        this.mSepStatus = i7;
    }
}
