package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameButtonUserStatus.class */
@Keep
public final class BiliGameButtonUserStatus {

    @JSONField(name = "can_apply")
    private final boolean canApply;

    @JSONField(name = "has_test_qualification")
    private final boolean hasTestQualification;

    @JSONField(name = "is_followed")
    private boolean isFollowed;

    @JSONField(name = "is_version_reserved")
    private boolean isVersionReserved;

    @JSONField(name = "recruit_apply_result")
    private final int recruitApplyResult;

    @JSONField(name = "is_signed_up")
    private final boolean signedUp;

    public final boolean getCanApply() {
        return this.canApply;
    }

    public final boolean getHasTestQualification() {
        return this.hasTestQualification;
    }

    public final int getRecruitApplyResult() {
        return this.recruitApplyResult;
    }

    public final boolean getSignedUp() {
        return this.signedUp;
    }

    public final boolean isFollowed() {
        return this.isFollowed;
    }

    public final boolean isVersionReserved() {
        return this.isVersionReserved;
    }

    public final void setFollowed(boolean z6) {
        this.isFollowed = z6;
    }

    public final void setVersionReserved(boolean z6) {
        this.isVersionReserved = z6;
    }
}
