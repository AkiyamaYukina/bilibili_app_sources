package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayHalfChannelsReply;
import com.bapis.bilibili.playershared.SettingBase;
import com.bapis.bilibili.playershared.SettingGroup;
import com.bapis.bilibili.playershared.SettingItem;
import com.bapis.bilibili.playershared.SettingItemStyle;
import com.bapis.bilibili.playershared.SettingItemType;
import com.bapis.bilibili.playershared.SettingMore;
import com.tencent.map.geolocation.TencentLocation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/i.class */
@StabilityInferred(parameters = 1)
public final class C6425i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PlayHalfChannelsReply f103396a;

    static {
        SettingItem.b base2 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/app/3efff77f861159bc7f66fff8bf9b0d959dd5d470.png").setLeftTitle("不感兴趣").putReport("option", "dislike").setType(SettingItemType.SETTING_DISLIKE).build());
        SettingItemStyle settingItemStyle = SettingItemStyle.SETTING_STYLE_VERTICAL;
        base2.setStyle(settingItemStyle).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/XDn1WQjM1C.png").setLeftTitle("稍后再看").putReport("option", "watchLater").setType(SettingItemType.SETTING_WATCH_LATER).build()).setStyle(settingItemStyle).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/OLeBa7V1IA.png").setLeftTitle("缓存").putReport("option", TencentLocation.CACHE_PROVIDER).setType(SettingItemType.SETTING_DOWNlOAD).build()).setStyle(settingItemStyle).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/wloOyHjlTQ.png").setLeftTitle("小窗播放").putReport("option", "miniPlayer").setType(SettingItemType.SETTING_SMALL_WINDOW).build()).setStyle(settingItemStyle).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/app/4f5e8db7c16b9e334ccaf26618df006e992b4927.png").setLeftTitle("投屏").putReport("option", "screencast").setType(SettingItemType.SETTING_PROJECT).build()).setStyle(settingItemStyle).build();
        SettingItem.b base3 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/Yyavf8OcsM.png").setLeftTitle("倍速").putReport("option", "speed").setType(SettingItemType.SETTING_PLAYBACK_RATE).build());
        SettingItemStyle settingItemStyle2 = SettingItemStyle.SETTING_STYLE_SELECT;
        SettingItem settingItemBuild = base3.setStyle(settingItemStyle2).build();
        SettingItem.b base4 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/lUncFRtBt9.png").setLeftTitle("自动连播").putReport("option", "autoPlayer").setType(SettingItemType.SETTING_PLAYBACK_MODE).build());
        SettingItemStyle settingItemStyle3 = SettingItemStyle.SETTING_STYLE_SWITCH;
        SettingItem settingItemBuild2 = base4.setStyle(settingItemStyle3).build();
        SettingItem settingItemBuild3 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/aKJw1xfGDd.png").setLeftTitle("循环播放").putReport("option", "circle").setType(SettingItemType.SETTING_LOOP_PLAYBACK).build()).setStyle(settingItemStyle2).build();
        SettingItem.b base5 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/OMwp6PPrgB.png").setLeftTitle("定时关闭").putReport("option", "sleepTimer").setType(SettingItemType.SETTING_TIMING_SWITCH).build());
        SettingItemStyle settingItemStyle4 = SettingItemStyle.SETTING_STYLE_MORE;
        SettingItem settingItemBuild4 = base5.setStyle(settingItemStyle4).setMore(SettingMore.newBuilder().setRightIcon("arrow-forward-right-line@900").build()).build();
        SettingItem settingItemBuild5 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/o9XPuaKoha.png").setLeftTitle("后台听视频").putReport("option", "background").setType(SettingItemType.SETTING_BACKGROUND_PLAY).build()).setStyle(settingItemStyle3).build();
        SettingItem settingItemBuild6 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/app/56aa0b9b6ce05800108b38fb1c8bb78b29b757ad.png").setLeftTitle("弹幕设置").putReport("option", "dmSetting").setType(SettingItemType.SETTING_DM).build()).setStyle(settingItemStyle4).setMore(SettingMore.newBuilder().setRightIcon("arrow-forward-right-line@900").build()).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/UQdglEtoe7.png").setLeftTitle("字幕").putReport("option", "subtitle").setType(SettingItemType.SETTING_SUBTITLE).build()).setStyle(settingItemStyle4).setMore(SettingMore.newBuilder().setRightTitle("无网络").build()).build();
        SettingItem settingItemBuild7 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/arv11nFGr6.png").setLeftTitle("镜像翻转").putReport("option", "mirror").setType(SettingItemType.SETTING_FLIP_CONF).build()).setStyle(settingItemStyle3).build();
        SettingItem settingItemBuild8 = SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/TzgNkDfqkC.png").setLeftTitle("更多播放设置").putReport("option", "settingMore").setType(SettingItemType.SETTING_MORE_PLAY).build()).setStyle(settingItemStyle4).setMore(SettingMore.newBuilder().setRightIcon("arrow-forward-right-line@900").build()).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/os4iSjkIdi.png").setLeftTitle("笔记").putReport("option", "note").setType(SettingItemType.SETTING_NOTE).build()).setStyle(settingItemStyle4).setMore(SettingMore.newBuilder().setRightIcon("arrow-forward-right-line@900").build()).build();
        SettingItem.newBuilder().setBase(SettingBase.newBuilder().setLeftIcon("https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/N8bOibjT1O.png").setLeftTitle("播放反馈").putReport("option", "feedback").setType(SettingItemType.SETTING_FEEDBACK).build()).setMore(SettingMore.newBuilder().setRightIcon("arrow-forward-right-line@900").build()).setStyle(settingItemStyle4).build();
        f103396a = PlayHalfChannelsReply.newBuilder().addGroups(SettingGroup.newBuilder().addItems(settingItemBuild).addItems(settingItemBuild2).addItems(settingItemBuild3).addItems(settingItemBuild4).addItems(settingItemBuild5).addItems(settingItemBuild6).addItems(settingItemBuild7).addItems(settingItemBuild8).build()).build();
    }
}
