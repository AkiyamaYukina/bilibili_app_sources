package com.bilibili.opd.app.bizcommon.bilicaptcha;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/VerfyConfBean.class */
@Keep
public class VerfyConfBean {

    @Nullable
    private Object bizData;

    @Nullable
    private String business;

    @Nullable
    private Long customerId;

    @Nullable
    private String h5Url;

    @Nullable
    private String msg;

    @Nullable
    private String naUrl;

    @Nullable
    private Integer open;

    @Nullable
    private String pcUrl;

    @Nullable
    private Integer type;

    @Nullable
    private Object verifyConf;

    @Nullable
    private String verifyMethod;

    @Nullable
    private String verifyRelation;

    @Nullable
    private Integer verifyType;

    @Nullable
    private String voucher;

    @Nullable
    public final Object getBizData() {
        return this.bizData;
    }

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    @Nullable
    public final Long getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getH5Url() {
        return this.h5Url;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getNaUrl() {
        return this.naUrl;
    }

    @Nullable
    public final Integer getOpen() {
        return this.open;
    }

    @Nullable
    public final String getPcUrl() {
        return this.pcUrl;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Object getVerifyConf() {
        return this.verifyConf;
    }

    @Nullable
    public final String getVerifyMethod() {
        return this.verifyMethod;
    }

    @Nullable
    public final String getVerifyRelation() {
        return this.verifyRelation;
    }

    @Nullable
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    @Nullable
    public final String getVoucher() {
        return this.voucher;
    }

    public final void setBizData(@Nullable Object obj) {
        this.bizData = obj;
    }

    public final void setBusiness(@Nullable String str) {
        this.business = str;
    }

    public final void setCustomerId(@Nullable Long l7) {
        this.customerId = l7;
    }

    public final void setH5Url(@Nullable String str) {
        this.h5Url = str;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setNaUrl(@Nullable String str) {
        this.naUrl = str;
    }

    public final void setOpen(@Nullable Integer num) {
        this.open = num;
    }

    public final void setPcUrl(@Nullable String str) {
        this.pcUrl = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setVerifyConf(@Nullable Object obj) {
        this.verifyConf = obj;
    }

    public final void setVerifyMethod(@Nullable String str) {
        this.verifyMethod = str;
    }

    public final void setVerifyRelation(@Nullable String str) {
        this.verifyRelation = str;
    }

    public final void setVerifyType(@Nullable Integer num) {
        this.verifyType = num;
    }

    public final void setVoucher(@Nullable String str) {
        this.voucher = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean verifyValid() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Integer r0 = r0.open
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lc
            goto L2a
        Lc:
            r0 = r6
            int r0 = r0.intValue()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L2a
            r0 = r3
            java.lang.String r0 = r0.naUrl
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2a
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L2c
        L2a:
            r0 = 0
            r5 = r0
        L2c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.bilicaptcha.VerfyConfBean.verifyValid():boolean");
    }
}
