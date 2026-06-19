package com.bilibili.biligame.card.newcard.download;

import androidx.annotation.Keep;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/download/CardDownloadInfo.class */
@Keep
public final class CardDownloadInfo {
    private long currentLength;

    @Nullable
    private String downloadButtonText;
    private int installedVersion;
    private int percent;

    @Nullable
    private String pkgName;
    private int status;
    private long totalLength;

    public final long getCurrentLength() {
        return this.currentLength;
    }

    @Nullable
    public final String getDownloadButtonText() {
        return this.downloadButtonText;
    }

    public final int getInstalledVersion() {
        return this.installedVersion;
    }

    public final int getPercent() {
        return this.percent;
    }

    @Nullable
    public final String getPkgName() {
        return this.pkgName;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTotalLength() {
        return this.totalLength;
    }

    public final boolean isUpdateGame(@Nullable BiliGameCardDataBean biliGameCardDataBean) {
        String androidPkgVer;
        if (biliGameCardDataBean == null || (androidPkgVer = biliGameCardDataBean.getAndroidPkgVer()) == null || androidPkgVer.length() == 0) {
            return false;
        }
        try {
            String androidPkgVer2 = biliGameCardDataBean.getAndroidPkgVer();
            int i7 = androidPkgVer2 != null ? Integer.parseInt(androidPkgVer2) : 0;
            int i8 = this.installedVersion;
            boolean z6 = false;
            if (1 <= i8) {
                z6 = false;
                if (i8 < i7) {
                    z6 = true;
                }
            }
            return z6;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public final void setCurrentLength(long j7) {
        this.currentLength = j7;
    }

    public final void setDownloadButtonText(@Nullable String str) {
        this.downloadButtonText = str;
    }

    public final void setInstalledVersion(int i7) {
        this.installedVersion = i7;
    }

    public final void setPercent(int i7) {
        this.percent = i7;
    }

    public final void setPkgName(@Nullable String str) {
        this.pkgName = str;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTotalLength(long j7) {
        this.totalLength = j7;
    }
}
