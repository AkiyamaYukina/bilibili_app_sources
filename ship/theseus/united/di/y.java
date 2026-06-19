package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.TabControl;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/y.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class y implements Factory<com.bilibili.ship.theseus.united.page.danmaku.m> {
    public static com.bilibili.ship.theseus.united.page.danmaku.m a(ViewReply viewReply) {
        TabControl danmakuEntrance = viewReply.getTab().getDanmakuEntrance();
        return (com.bilibili.ship.theseus.united.page.danmaku.m) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.united.page.danmaku.m(new com.bilibili.ship.theseus.united.page.tab.TabControl(0.0f, 8, danmakuEntrance.getDisableClickTip(), danmakuEntrance.getLimit(), danmakuEntrance.getDisable())));
    }
}
