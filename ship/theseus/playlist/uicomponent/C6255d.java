package com.bilibili.ship.theseus.playlist.uicomponent;

import com.bilibili.app.comm.supermenu.core.IMenuItem;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.lib.sharewrapper.SocializeMedia;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/d.class */
public final class C6255d extends MenuItemHandler {
    public final boolean handleClick(IMenuItem iMenuItem) {
        return false;
    }

    public final String[] registerActionMenuItems() {
        return new String[]{SocializeMedia.WEIXIN, SocializeMedia.WEIXIN_MONMENT, "QQ", SocializeMedia.QZONE, SocializeMedia.SINA, SocializeMedia.BILI_DYNAMIC, SocializeMedia.COPY};
    }
}
