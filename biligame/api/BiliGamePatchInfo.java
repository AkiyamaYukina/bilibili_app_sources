package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiliGamePatchInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliGamePatchInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "pkg_version")
    private int pkgVersion;

    @JSONField(name = "updated_pkg_info_list")
    @NotNull
    private List<UpdatedPkgInfo> updatedPkgInfoList = new ArrayList();

    @JSONField(name = "whole_pkg_sign")
    @NotNull
    private String wholePkgSign = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiliGamePatchInfo$UpdatedPkgInfo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class UpdatedPkgInfo implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "pkg_his_size")
        private long pkgHisSize;

        @JSONField(name = "pkg_size")
        private long pkgSize;

        @JSONField(name = "pkg_his_version")
        private int pkgVersion;

        @JSONField(name = "pkg_his_sign")
        @NotNull
        private String pkgHisSign = "";

        @JSONField(name = "pkg_sign")
        @NotNull
        private String pkgSign = "";

        @JSONField(name = "pkg_link")
        @NotNull
        private String pkgLink = "";

        @JSONField(name = "pkg_link2")
        @NotNull
        private String pkgLink2 = "";

        @NotNull
        public final String getPkgHisSign() {
            return this.pkgHisSign;
        }

        public final long getPkgHisSize() {
            return this.pkgHisSize;
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
        public final String getPkgSign() {
            return this.pkgSign;
        }

        public final long getPkgSize() {
            return this.pkgSize;
        }

        public final int getPkgVersion() {
            return this.pkgVersion;
        }

        public final void setPkgHisSign(@NotNull String str) {
            this.pkgHisSign = str;
        }

        public final void setPkgHisSize(long j7) {
            this.pkgHisSize = j7;
        }

        public final void setPkgLink(@NotNull String str) {
            this.pkgLink = str;
        }

        public final void setPkgLink2(@NotNull String str) {
            this.pkgLink2 = str;
        }

        public final void setPkgSign(@NotNull String str) {
            this.pkgSign = str;
        }

        public final void setPkgSize(long j7) {
            this.pkgSize = j7;
        }

        public final void setPkgVersion(int i7) {
            this.pkgVersion = i7;
        }
    }

    public final int getPkgVersion() {
        return this.pkgVersion;
    }

    @NotNull
    public final List<UpdatedPkgInfo> getUpdatedPkgInfoList() {
        return this.updatedPkgInfoList;
    }

    @NotNull
    public final String getWholePkgSign() {
        return this.wholePkgSign;
    }

    public final void setPkgVersion(int i7) {
        this.pkgVersion = i7;
    }

    public final void setUpdatedPkgInfoList(@NotNull List<UpdatedPkgInfo> list) {
        this.updatedPkgInfoList = list;
    }

    public final void setWholePkgSign(@NotNull String str) {
        this.wholePkgSign = str;
    }
}
