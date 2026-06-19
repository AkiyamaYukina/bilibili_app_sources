package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/UserInfo.class */
@Keep
public class UserInfo {
    public static final int AUTHENTICATION_TYPE_ENTERPRISE = 3;
    public static final int AUTHENTICATION_TYPE_PERSONAL = 2;
    public static final int AUTHENTICATION_TYPE_SPECIALITY = 1;
    public static final int TYPE_ACCOUNT_CHANGE = 2;
    public static final int TYPE_ACCOUNT_NEW = 1;
    public static final int VERIFY_TYPE_ENTERPRISE = 1;
    public static final int VERIFY_TYPE_PERSONAL = 0;
    public static final int VERIFY_TYPE_SPECIAL = 2;

    @JSONField(name = "attestation_display")
    public RecommendComment.AttestationDisplay attestationDisplay;

    @JSONField(name = "face")
    public String face;

    @JSONField(name = "is_followed")
    public boolean followed;

    @JSONField(name = "level")
    public int level;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    public long mid;

    @JSONField(name = "uname")
    public String name;

    @JSONField(name = "type")
    public int type;

    @JSONField(name = KeySign.UID)
    public long uid;

    @JSONField(name = "verify_desc")
    public String verifyDesc;

    @JSONField(name = "verify_type")
    public int verifyType;

    public long getMid() {
        long j7 = this.mid;
        if (j7 <= 0) {
            j7 = this.uid;
        }
        return j7;
    }
}
