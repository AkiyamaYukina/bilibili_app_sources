package com.bilibili.upper.module.template.vm;

import androidx.lifecycle.MutableLiveData;
import tv.danmaku.ijk.media.player.IjkAssetUpdateReason;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/h.class */
public final /* synthetic */ class h implements IjkMediaPlayerItem.IjkMediaPlayerItemAssetUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f114055a;

    public final IjkMediaAsset onAssetUpdate(IjkAssetUpdateReason ijkAssetUpdateReason) {
        int reason = ijkAssetUpdateReason.getReason();
        if (reason != 3 && reason != 4) {
            return null;
        }
        MutableLiveData<Integer> mutableLiveData = this.f114055a.f114059d;
        Integer value = mutableLiveData.getValue();
        if (value != null && value.intValue() == 4) {
            return null;
        }
        mutableLiveData.postValue(4);
        return null;
    }
}
