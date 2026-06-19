package com.bilibili.ship.theseus.united.page.view;

import com.bapis.bilibili.app.viewunite.common.Stat;
import com.bapis.bilibili.app.viewunite.common.StatInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/b.class */
public final class b {
    @NotNull
    public static final StatData a(@NotNull Stat stat) {
        return new StatData(stat.getCoin(), b(stat.getDanmaku()), stat.getFav(), stat.getLike(), stat.getReply(), stat.getShare(), b(stat.getVt()), stat.getFollow());
    }

    @NotNull
    public static final StatInfoData b(@NotNull StatInfo statInfo) {
        return new StatInfoData(statInfo.getValue(), statInfo.getText(), statInfo.getPureText(), statInfo.getIcon());
    }
}
