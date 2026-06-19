package com.bilibili.ship.theseus.united.page.intro.module.season;

import Wq0.m0;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/N.class */
public final class N extends m0 {
    @Override // Wq0.m0
    public final boolean c(ShareOnlineParams shareOnlineParams, String str) {
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1738246558) {
            if (!str.equals(SocializeMedia.WEIXIN)) {
                return false;
            }
            if (shareOnlineParams == null) {
                return true;
            }
            shareOnlineParams.shareMode = 4;
            return true;
        }
        if (iHashCode != 2592) {
            if (iHashCode != 77564797 || !str.equals(SocializeMedia.QZONE)) {
                return false;
            }
        } else if (!str.equals("QQ")) {
            return false;
        }
        if (shareOnlineParams == null) {
            return true;
        }
        shareOnlineParams.shareMode = 7;
        return true;
    }
}
