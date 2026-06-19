package com.bilibili.ship.theseus.ogv.chathall;

import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.mobile.BLHumanActionParamsType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/r.class */
public final class r implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f91792a;

    public r(s sVar) {
        this.f91792a = sVar;
    }

    public final void onImageLoadFailed(Throwable th) {
        super.onImageLoadFailed(th);
        s sVar = this.f91792a;
        if (sVar.f91795c) {
            sVar.f91795c = false;
            sVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_RESULT_ROTATE);
        }
    }

    public final void onImageSet(ImageInfo imageInfo) {
        super.onImageSet(imageInfo);
        s sVar = this.f91792a;
        if (true == sVar.f91795c) {
            return;
        }
        sVar.f91795c = true;
        sVar.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_RESULT_ROTATE);
    }
}
