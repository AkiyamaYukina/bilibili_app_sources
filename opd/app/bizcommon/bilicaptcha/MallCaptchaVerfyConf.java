package com.bilibili.opd.app.bizcommon.bilicaptcha;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/MallCaptchaVerfyConf.class */
@Keep
public class MallCaptchaVerfyConf {

    @Nullable
    private VerfyConfBean verfyConf;

    @Nullable
    public final VerfyConfBean getVerfyConf() {
        return this.verfyConf;
    }

    public final void setVerfyConf(@Nullable VerfyConfBean verfyConfBean) {
        this.verfyConf = verfyConfBean;
    }

    public final boolean verfyValid() {
        VerfyConfBean verfyConfBean = this.verfyConf;
        boolean z6 = false;
        if (verfyConfBean != null) {
            Integer open = verfyConfBean.getOpen();
            if (open == null) {
                z6 = false;
            } else {
                z6 = false;
                if (open.intValue() == 1) {
                    String naUrl = verfyConfBean.getNaUrl();
                    z6 = false;
                    if (naUrl != null) {
                        z6 = naUrl.length() != 0;
                    }
                }
            }
        }
        return z6;
    }
}
