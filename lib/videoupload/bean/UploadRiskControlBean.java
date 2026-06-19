package com.bilibili.lib.videoupload.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/bean/UploadRiskControlBean.class */
@Keep
public class UploadRiskControlBean implements Serializable {

    @JSONField(name = "error_msg")
    public String errorMsg;

    @JSONField(name = "v_voucher")
    public String vVoucher;

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadRiskControlBean{vVoucher='");
        sb.append(this.vVoucher);
        sb.append("', errorMsg='");
        return C8770a.a(sb, this.errorMsg, "'}");
    }
}
