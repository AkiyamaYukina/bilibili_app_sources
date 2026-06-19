package com.bilibili.moduleservice.player;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/player/MiniPlayerAutoPlaySetting.class */
public interface MiniPlayerAutoPlaySetting {
    boolean getSpEnableAutoMiniPlay();

    boolean getSpEnableInnerAutoMiniPlay();

    boolean isAutoMiniPlayChanged();

    boolean isInnerAutoMiniPlayChanged();

    void setAutoMiniPlayChanged(boolean z6);

    void setInnerAutoMiniPlayChanged(boolean z6);

    void setSpEnableAutoMiniPlay(boolean z6);

    void setSpEnableInnerAutoMiniPlay(boolean z6);
}
