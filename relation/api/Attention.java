package com.bilibili.relation.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/Attention.class */
@Keep
public class Attention {
    public int attribute;
    public String face;

    @JSONField(deserialize = false, serialize = false)
    public boolean followed = true;
    public long mid;
    public long mtime;
    public VerifyInfo official_verify;
    public String sign;
    public int special;
    public List<Long> tag;
    public String uname;
    public VipInfo vip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/Attention$VerifyInfo.class */
    @Keep
    public static class VerifyInfo {
        public static final int COMPANY_V = 1;
        public static final int NORMAL = -1;
        public static final int PERSON_V = 0;

        @JSONField(name = "desc")
        public String desc;

        @JSONField(name = "type")
        public int type;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/Attention$VipInfo.class */
    @Keep
    public static class VipInfo {

        @JSONField(name = "vipDueDate")
        public long endTime;

        @JSONField(name = "vipStatus")
        public int vipStatus;

        @JSONField(name = "vipType")
        public int vipType;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isEffectiveYearVip() {
            /*
                r3 = this;
                r0 = r3
                int r0 = r0.vipType
                r1 = 2
                if (r0 != r1) goto L17
                r0 = r3
                int r0 = r0.vipStatus
                r4 = r0
                r0 = 1
                r5 = r0
                r0 = r4
                r1 = 1
                if (r0 != r1) goto L17
                goto L19
            L17:
                r0 = 0
                r5 = r0
            L19:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.relation.api.Attention.VipInfo.isEffectiveYearVip():boolean");
        }
    }
}
