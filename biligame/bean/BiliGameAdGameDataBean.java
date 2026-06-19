package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/BiliGameAdGameDataBean.class */
@Keep
public final class BiliGameAdGameDataBean implements Serializable {

    @JSONField(name = TextSource.CFG_SIZE)
    private long pkgSize;

    @JSONField(name = "sign")
    @NotNull
    private String pkgSign = "";

    @JSONField(name = "name")
    @NotNull
    private String pkgName = "";

    @JSONField(name = "version")
    @NotNull
    private String pkgVersion = "";

    @JSONField(name = "download_link")
    @NotNull
    private String pkgLink = "";

    @JSONField(name = "download_link2")
    @NotNull
    private String pkgLink2 = "";

    @JSONField(name = "channel_id")
    @NotNull
    private String channelId = "0";

    @JSONField(name = "multi_pkg_download_mode")
    @NotNull
    private String apkType = BiliGameAdGameDataBeanKt.getAPK_DEFAULT_TYPE();

    public boolean equals(@Nullable Object obj) {
        BiliGameAdGameDataBean biliGameAdGameDataBean = obj instanceof BiliGameAdGameDataBean ? (BiliGameAdGameDataBean) obj : null;
        boolean z6 = false;
        if (biliGameAdGameDataBean != null) {
            z6 = false;
            if (biliGameAdGameDataBean.pkgSize == this.pkgSize) {
                z6 = false;
                if (Intrinsics.areEqual(biliGameAdGameDataBean.pkgSign, this.pkgSign)) {
                    z6 = false;
                    if (Intrinsics.areEqual(biliGameAdGameDataBean.pkgName, this.pkgName)) {
                        z6 = false;
                        if (Intrinsics.areEqual(biliGameAdGameDataBean.pkgVersion, this.pkgVersion)) {
                            z6 = false;
                            if (Intrinsics.areEqual(biliGameAdGameDataBean.pkgLink, this.pkgLink)) {
                                z6 = false;
                                if (Intrinsics.areEqual(biliGameAdGameDataBean.pkgLink2, this.pkgLink2)) {
                                    z6 = false;
                                    if (Intrinsics.areEqual(biliGameAdGameDataBean.apkType, this.apkType)) {
                                        z6 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    @NotNull
    public final String getApkType() {
        return this.apkType;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final String getPkgLink() {
        return this.pkgLink;
    }

    @NotNull
    public final String getPkgLink2() {
        return this.pkgLink2;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    @NotNull
    public final String getPkgSign() {
        return this.pkgSign;
    }

    public final long getPkgSize() {
        return this.pkgSize;
    }

    @NotNull
    public final String getPkgVersion() {
        return this.pkgVersion;
    }

    public final void setApkType(@NotNull String str) {
        this.apkType = str;
    }

    public final void setChannelId(@NotNull String str) {
        this.channelId = str;
    }

    public final void setPkgLink(@NotNull String str) {
        this.pkgLink = str;
    }

    public final void setPkgLink2(@NotNull String str) {
        this.pkgLink2 = str;
    }

    public final void setPkgName(@NotNull String str) {
        this.pkgName = str;
    }

    public final void setPkgSign(@NotNull String str) {
        this.pkgSign = str;
    }

    public final void setPkgSize(long j7) {
        this.pkgSize = j7;
    }

    public final void setPkgVersion(@NotNull String str) {
        this.pkgVersion = str;
    }
}
