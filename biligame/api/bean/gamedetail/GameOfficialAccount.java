package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameOfficialAccount.class */
@Keep
public class GameOfficialAccount implements Serializable {

    @JSONField(name = "attestation_display")
    public RecommendComment.AttestationDisplay attestationDisplay;
    public String face;

    @JSONField(name = "is_followed")
    public boolean followed;
    public long mid;
    public String uname;

    @Nullable
    @JSONField(name = "official_verify")
    public VerifyInfo verifyInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameOfficialAccount$VerifyInfo.class */
    @Keep
    public static class VerifyInfo implements Serializable {
        public static final int TYPE_COMPANY = 1;
        public static final int TYPE_NONE = -1;
        public static final int TYPE_PERSONAL = 0;
        public String desc;
        public int type;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VerifyInfo verifyInfo = (VerifyInfo) obj;
            if (this.type != verifyInfo.type) {
                return false;
            }
            return Objects.equals(this.desc, verifyInfo.desc);
        }

        public int hashCode() {
            int i7 = this.type;
            String str = this.desc;
            return (i7 * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameOfficialAccount)) {
            return false;
        }
        GameOfficialAccount gameOfficialAccount = (GameOfficialAccount) obj;
        if (this.mid == gameOfficialAccount.mid && Objects.equals(this.uname, gameOfficialAccount.uname) && Objects.equals(this.face, gameOfficialAccount.face) && Objects.equals(this.attestationDisplay, gameOfficialAccount.attestationDisplay)) {
            return Objects.equals(this.verifyInfo, gameOfficialAccount.verifyInfo);
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.mid;
        int i7 = (int) (j7 ^ (j7 >>> 32));
        String str = this.uname;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.face;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        VerifyInfo verifyInfo = this.verifyInfo;
        int iHashCode4 = verifyInfo != null ? verifyInfo.hashCode() : 0;
        RecommendComment.AttestationDisplay attestationDisplay = this.attestationDisplay;
        if (attestationDisplay != null) {
            iHashCode = attestationDisplay.hashCode();
        }
        return (((((((i7 * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }
}
