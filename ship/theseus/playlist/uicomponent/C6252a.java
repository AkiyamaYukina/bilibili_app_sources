package com.bilibili.ship.theseus.playlist.uicomponent;

import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/a.class */
public final /* synthetic */ class C6252a implements ShareOnlineParams.ShareItemHandler {
    @Override // com.bilibili.lib.sharewrapper.online.ShareOnlineParams.ShareItemHandler
    public final void onPreShare(ShareOnlineParams shareOnlineParams, String str) {
        if (shareOnlineParams != null) {
            shareOnlineParams.shareMode = Intrinsics.areEqual(str, SocializeMedia.SINA) ? 21 : 3;
        }
    }
}
