package com.bilibili.studio.videoeditor.capturev3.services;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureCategoryFilterBean;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureIntroBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureMakeupEntity;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/services/BiliCapturePreBeanV3.class */
@Keep
public class BiliCapturePreBeanV3 {

    @JSONField(name = "filter_with_category")
    public List<CaptureCategoryFilterBean> captureCategoryFilters;

    @JSONField(name = "intros")
    public List<CaptureIntroBeanV3> captureIntros;

    @JSONField(name = "makeups")
    public List<CaptureMakeupEntity> makeups;

    @JSONField(name = "server_ts")
    public long serverTimestamp;
}
