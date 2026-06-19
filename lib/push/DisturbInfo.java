package com.bilibili.lib.push;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/DisturbInfo.class */
@Keep
class DisturbInfo {
    private boolean isBadgeAiNoDisturb = true;
    private boolean isBadgeDayVisitNoDisturb = true;
    private boolean isHoldOutNoDistrub = false;

    public boolean isBadgeAiNoDisturb() {
        return this.isBadgeAiNoDisturb;
    }

    public boolean isBadgeDayVisitNoDisturb() {
        return this.isBadgeDayVisitNoDisturb;
    }

    public boolean isHoldOutNoDistrub() {
        return this.isHoldOutNoDistrub;
    }

    public boolean isNotDisturb() {
        return this.isBadgeAiNoDisturb || this.isBadgeDayVisitNoDisturb || this.isHoldOutNoDistrub;
    }

    public void setBadgeAiNoDisturb(boolean z6) {
        this.isBadgeAiNoDisturb = z6;
    }

    public void setBadgeDayVisitNoDisturb(boolean z6) {
        this.isBadgeDayVisitNoDisturb = z6;
    }

    public void setHoldOutNoDistrub(boolean z6) {
        this.isHoldOutNoDistrub = z6;
    }
}
