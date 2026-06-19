package com.bilibili.upper.module.template.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/i.class */
public final /* synthetic */ class i implements IMediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f114056a;

    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8, Bundle bundle) {
        Integer value;
        if (i7 != 702) {
            return true;
        }
        j jVar = this.f114056a;
        MutableLiveData<Integer> mutableLiveData = jVar.f114059d;
        Integer value2 = mutableLiveData.getValue();
        if ((value2 == null || value2.intValue() != 4) && ((value = mutableLiveData.getValue()) == null || value.intValue() != 2)) {
            return true;
        }
        jVar.L0();
        return true;
    }
}
