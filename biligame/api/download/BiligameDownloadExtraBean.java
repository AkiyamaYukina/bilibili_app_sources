package com.bilibili.biligame.api.download;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiliGamePatchInfo;
import com.bilibili.biligame.api.BiligameHotGame;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameDownloadExtraBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameDownloadExtraBean {
    public static final int $stable = 8;

    @JSONField(name = "ad_info")
    @Nullable
    private BiligameHotGame adGamePkg;

    @JSONField(name = "base_info")
    @Nullable
    private BaseInfoBean baseInfo;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "patch_info")
    @Nullable
    private BiliGamePatchInfo patchInfo;

    @JSONField(name = "pay_link")
    @Nullable
    private PayLinkBean payLink;

    @JSONField(name = "track_info")
    @Nullable
    private BiligameTrackInfo trackInfo;

    @NotNull
    private String trail = "";

    @JSONField(name = "zstd_info")
    @Nullable
    private ZstdPkgInfoBean zstdInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameDownloadExtraBean$BaseInfoBean.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class BaseInfoBean implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "block_num")
        private int blockNum = -1;

        public final int getBlockNum() {
            return this.blockNum;
        }

        public final void setBlockNum(int i7) {
            this.blockNum = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameDownloadExtraBean$PayLinkBean.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class PayLinkBean implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "download_link")
        @NotNull
        private String downloadLink = "";

        @JSONField(name = "download_link2")
        @NotNull
        private String downloadLink2 = "";

        @NotNull
        public final String getDownloadLink() {
            return this.downloadLink;
        }

        @NotNull
        public final String getDownloadLink2() {
            return this.downloadLink2;
        }

        public final void setDownloadLink(@NotNull String str) {
            this.downloadLink = str;
        }

        public final void setDownloadLink2(@NotNull String str) {
            this.downloadLink2 = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameDownloadExtraBean$ZstdPkgInfoBean.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ZstdPkgInfoBean implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "zst_block_size")
        private long zstBlockSize;

        @JSONField(name = "zst_size")
        private long zstSize;

        @JSONField(name = "zst_download_link")
        @NotNull
        private String zstdDownloadLink = "";

        @JSONField(name = "zst_download_link2")
        @NotNull
        private String zstdDownloadLink2 = "";

        @JSONField(name = "zst_md5")
        @NotNull
        private String zstMd5 = "";

        @JSONField(name = "pkg_name")
        @NotNull
        private String pkgName = "";

        @JSONField(name = "zst_strategy")
        private int zstStrategy = -1;

        @JSONField(name = "zst_block_num")
        private int zstBlockNum = -1;

        @NotNull
        public final String getPkgName() {
            return this.pkgName;
        }

        public final int getZstBlockNum() {
            return this.zstBlockNum;
        }

        public final long getZstBlockSize() {
            return this.zstBlockSize;
        }

        @NotNull
        public final String getZstMd5() {
            return this.zstMd5;
        }

        public final long getZstSize() {
            return this.zstSize;
        }

        public final int getZstStrategy() {
            return this.zstStrategy;
        }

        @NotNull
        public final String getZstdDownloadLink() {
            return this.zstdDownloadLink;
        }

        @NotNull
        public final String getZstdDownloadLink2() {
            return this.zstdDownloadLink2;
        }

        public final void setPkgName(@NotNull String str) {
            this.pkgName = str;
        }

        public final void setZstBlockNum(int i7) {
            this.zstBlockNum = i7;
        }

        public final void setZstBlockSize(long j7) {
            this.zstBlockSize = j7;
        }

        public final void setZstMd5(@NotNull String str) {
            this.zstMd5 = str;
        }

        public final void setZstSize(long j7) {
            this.zstSize = j7;
        }

        public final void setZstStrategy(int i7) {
            this.zstStrategy = i7;
        }

        public final void setZstdDownloadLink(@NotNull String str) {
            this.zstdDownloadLink = str;
        }

        public final void setZstdDownloadLink2(@NotNull String str) {
            this.zstdDownloadLink2 = str;
        }
    }

    @Nullable
    public final BiligameHotGame getAdGamePkg() {
        return this.adGamePkg;
    }

    @Nullable
    public final BaseInfoBean getBaseInfo() {
        return this.baseInfo;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final BiliGamePatchInfo getPatchInfo() {
        return this.patchInfo;
    }

    @Nullable
    public final PayLinkBean getPayLink() {
        return this.payLink;
    }

    @Nullable
    public final BiligameTrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    @NotNull
    public final String getTrail() {
        return this.trail;
    }

    @Nullable
    public final ZstdPkgInfoBean getZstdInfo() {
        return this.zstdInfo;
    }

    public final void setAdGamePkg(@Nullable BiligameHotGame biligameHotGame) {
        this.adGamePkg = biligameHotGame;
    }

    public final void setBaseInfo(@Nullable BaseInfoBean baseInfoBean) {
        this.baseInfo = baseInfoBean;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setPatchInfo(@Nullable BiliGamePatchInfo biliGamePatchInfo) {
        this.patchInfo = biliGamePatchInfo;
    }

    public final void setPayLink(@Nullable PayLinkBean payLinkBean) {
        this.payLink = payLinkBean;
    }

    public final void setTrackInfo(@Nullable BiligameTrackInfo biligameTrackInfo) {
        this.trackInfo = biligameTrackInfo;
    }

    public final void setTrail(@NotNull String str) {
        this.trail = str;
    }

    public final void setZstdInfo(@Nullable ZstdPkgInfoBean zstdPkgInfoBean) {
        this.zstdInfo = zstdPkgInfoBean;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean supportZstdDownload() {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.biligame.api.download.BiligameDownloadExtraBean$ZstdPkgInfoBean r0 = r0.zstdInfo
            r9 = r0
            r0 = 0
            r8 = r0
            r0 = r9
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r9
            java.lang.String r0 = r0.getZstdDownloadLink()
            r10 = r0
            r0 = r8
            r7 = r0
            r0 = r10
            if (r0 == 0) goto L6c
            r0 = r10
            int r0 = r0.length()
            if (r0 != 0) goto L2c
            r0 = r8
            r7 = r0
            goto L6c
        L2c:
            r0 = r9
            long r0 = r0.getZstSize()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3b
            r0 = r8
            r7 = r0
            goto L6c
        L3b:
            r0 = r9
            int r0 = r0.getZstStrategy()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L6a
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L6a
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L54
            r0 = r8
            r7 = r0
            goto L6c
        L54:
            r0 = r8
            r7 = r0
            r0 = r9
            int r0 = r0.getZstBlockNum()
            if (r0 <= 0) goto L6c
            r0 = r8
            r7 = r0
            r0 = r9
            long r0 = r0.getZstBlockSize()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6c
        L6a:
            r0 = 1
            r7 = r0
        L6c:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.download.BiligameDownloadExtraBean.supportZstdDownload():boolean");
    }
}
