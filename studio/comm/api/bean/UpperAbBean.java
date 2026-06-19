package com.bilibili.studio.comm.api.bean;

import androidx.annotation.Keep;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/api/bean/UpperAbBean.class */
@Keep
public class UpperAbBean {
    private final String value;

    public UpperAbBean(String str) {
        this.value = str;
    }

    public boolean isUpperA() {
        return "a".equals(this.value);
    }

    public boolean isUpperB() {
        return "b".equals(this.value);
    }

    public boolean isUpperC() {
        return DynamicModel.KEY_ABBR_DYNAMIC_CMD.equals(this.value);
    }

    public String toString() {
        return C8770a.a(new StringBuilder("UpperAbBean{value='"), this.value, "'}");
    }
}
