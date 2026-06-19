package com.bilibili.studio.videoeditor.bgm.bgmlist.model;

import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/EditBgmTabList.class */
public class EditBgmTabList extends Bgm {
    private List<BgmTab> mBgmTabList;

    public EditBgmTabList(List<BgmTab> list) {
        this.mBgmTabList = list;
    }

    public List<BgmTab> getBgmTabList() {
        return this.mBgmTabList;
    }
}
