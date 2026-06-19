package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import javax.inject.Inject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/i.class */
@StabilityInferred(parameters = 0)
public final class C6435i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public volatile com.bilibili.player.tangram.basic.a f103879a;

    @Inject
    public C6435i() {
    }

    public final boolean a() {
        return this.f103879a != null && BiliAccountInfo.Companion.get().isEffectiveVip();
    }
}
