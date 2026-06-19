package com.bilibili.studio.videoeditor.bgm.bgmlist.model;

import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmTab;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/EditBgmTabSep.class */
public class EditBgmTabSep extends Bgm {
    private BgmTab mBgmTab;

    public EditBgmTabSep(BgmTab bgmTab) {
        this.mBgmTab = bgmTab;
    }

    public BgmTab getBgmTab() {
        return this.mBgmTab;
    }

    public String getTabName() {
        BgmTab bgmTab = this.mBgmTab;
        return bgmTab == null ? "" : bgmTab.name;
    }
}
