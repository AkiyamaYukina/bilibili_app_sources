package com.bilibili.studio.comm.manager.hdr;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/hdr/UpperHdrCodecInfo.class */
@Keep
public class UpperHdrCodecInfo {

    @JSONField(name = "encoder_support_hdr")
    public boolean encoderSupportHdr = false;

    @JSONField(name = "decoder_support_hdr")
    public boolean decoderSupportHdr = false;

    @JSONField(name = "support_decoders")
    public List<String> supportDecoders = new ArrayList();

    @JSONField(name = "support_encoders")
    public List<String> supportEncoders = new ArrayList();
}
