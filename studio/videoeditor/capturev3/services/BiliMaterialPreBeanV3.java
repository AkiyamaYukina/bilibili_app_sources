package com.bilibili.studio.videoeditor.capturev3.services;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureCropCpu;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureLatestBeanV3;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/services/BiliMaterialPreBeanV3.class */
@Keep
public class BiliMaterialPreBeanV3 {

    @JSONField(name = "splitbk_cpus")
    public CaptureCropCpu cropCpu;

    @JSONField(name = "latests")
    public Map<String, CaptureLatestBeanV3> latests;
}
