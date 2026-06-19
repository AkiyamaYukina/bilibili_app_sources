package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMyInfo.class */
@Keep
public class BiligameMyInfo {
    public static final int FEMALE = 2;
    public static final int MALE = 1;

    @JSONField(name = "attestation_display")
    public RecommendComment.AttestationDisplay attestationDisplay;
    public String face;

    @JSONField(name = "growth_level")
    public RecommendComment.CommentGrowthLevel growPlanLevel;
    public String level;
    public long mid;

    @JSONField(name = "official_verify")
    public OfficialVerify officialVerify;
    public int sex;
    public String uname;
    public Vip vip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMyInfo$OfficialVerify.class */
    @Keep
    public class OfficialVerify {
        public String desc;
        final BiligameMyInfo this$0;
        public int type;

        public OfficialVerify(BiligameMyInfo biligameMyInfo) {
            this.this$0 = biligameMyInfo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMyInfo$Vip.class */
    @Keep
    public class Vip {

        @JSONField(name = "vip_status")
        public int status;
        final BiligameMyInfo this$0;

        @JSONField(name = "vip_type")
        public int type;

        public Vip(BiligameMyInfo biligameMyInfo) {
            this.this$0 = biligameMyInfo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean officialIsValid() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.biligame.api.BiligameMyInfo$OfficialVerify r0 = r0.officialVerify
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L23
            r0 = r7
            int r0 = r0.type
            r4 = r0
            r0 = 1
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L25
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L23
            r0 = r6
            r5 = r0
            goto L25
        L23:
            r0 = 0
            r5 = r0
        L25:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.BiligameMyInfo.officialIsValid():boolean");
    }

    public boolean sexIsValid() {
        int i7 = this.sex;
        boolean z6 = true;
        if (i7 != 1) {
            z6 = i7 == 2;
        }
        return z6;
    }
}
