package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureCropCpu.class */
@Keep
public class CaptureCropCpu {

    @JSONField(name = Constant.SDK_OS)
    public List<String> whiteList;
}
