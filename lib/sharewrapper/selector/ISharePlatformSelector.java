package com.bilibili.lib.sharewrapper.selector;

import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/ISharePlatformSelector.class */
public interface ISharePlatformSelector {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/ISharePlatformSelector$OnItemClickListener.class */
    public interface OnItemClickListener {
        void onItemClick(SharePlatform sharePlatform);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/ISharePlatformSelector$Style.class */
    public enum Style {
        CENTER,
        BOTTOM,
        CENTER_V2,
        BOTTOM_V2
    }

    void dismiss();

    void release();

    void show(String str, Style style, List<SharePlatform> list);
}
