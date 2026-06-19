package com.bilibili.ship.theseus.united.page.interactvideo.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.tencent.map.geolocation.TencentLocation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoInvalidSeekArea$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_InvalidSeekArea")
@Keep
public final class InteractiveVideoInvalidSeekArea$Request {
    public static final int $stable = 8;

    @JSONField(name = EditCustomizeSticker.TAG_DURATION)
    private double duration;

    @JSONField(name = TencentLocation.FAKE)
    private double fake;

    @JSONField(name = "start_time")
    private double startTime;

    public final double getDuration() {
        return this.duration;
    }

    public final double getFake() {
        return this.fake;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public final void setDuration(double d7) {
        this.duration = d7;
    }

    public final void setFake(double d7) {
        this.fake = d7;
    }

    public final void setStartTime(double d7) {
        this.startTime = d7;
    }
}
