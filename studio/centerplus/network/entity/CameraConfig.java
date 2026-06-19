package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/CameraConfig.class */
@Keep
public class CameraConfig implements Serializable {

    @JSONField(name = "camera_grey")
    public long cameraGrey = 0;

    @JSONField(name = "coo_max_sec")
    public long cooMaxSec;

    @JSONField(name = "coo_min_sec")
    public long cooMinSec;

    @JSONField(name = "dyna_max_sec")
    public long dynaMaxSec;

    @JSONField(name = "dyna_min_sec")
    public long dynaMinSec;

    @JSONField(name = "videoup_max_sec")
    public long videoUpMaxSec;

    @JSONField(name = "videoup_min_sec")
    public long videoUpMinSec;
}
