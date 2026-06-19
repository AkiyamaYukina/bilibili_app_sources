package com.bilibili.studio.videocompile.define;

import I.E;
import O4.a;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.room.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileBizConfig.class */
@Keep
public final class BVideoCompileBizConfig {

    @NotNull
    private String actionID;

    @NotNull
    private String bizFrom;

    @NotNull
    private BVideoCompileCoreModel compileModel;

    @NotNull
    private String copyToAlbumOption;
    private boolean enableAutoRetryWithSoftWareEncode;
    private boolean enableDeleteSanBoxFile;
    private boolean enableOperatingRate;
    private boolean enableSmartOptimize;
    private boolean enableVFR;

    @NotNull
    private EventExtraInfo eventExtraInfo;
    private boolean forceBySpaceNotEnough;

    @NotNull
    private BVideoCompileH265Config h265Config;

    @NotNull
    private BVideoCompileHDRConfig hdrConfig;

    @NotNull
    private String outputFilePath;
    private boolean setCompileCallback4;
    private boolean skipVideoTranscode;

    @NotNull
    private String source;

    public BVideoCompileBizConfig() {
        this(null, null, null, null, false, null, null, false, false, null, false, null, false, 8191, null);
    }

    public BVideoCompileBizConfig(@NotNull BVideoCompileCoreModel bVideoCompileCoreModel, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, @NotNull BVideoCompileH265Config bVideoCompileH265Config, @NotNull BVideoCompileHDRConfig bVideoCompileHDRConfig, boolean z7, boolean z8, @NotNull String str4, boolean z9, @NotNull String str5, boolean z10) {
        this.compileModel = bVideoCompileCoreModel;
        this.outputFilePath = str;
        this.bizFrom = str2;
        this.source = str3;
        this.enableSmartOptimize = z6;
        this.h265Config = bVideoCompileH265Config;
        this.hdrConfig = bVideoCompileHDRConfig;
        this.enableVFR = z7;
        this.enableAutoRetryWithSoftWareEncode = z8;
        this.copyToAlbumOption = str4;
        this.enableOperatingRate = z9;
        this.actionID = str5;
        this.skipVideoTranscode = z10;
        this.eventExtraInfo = new EventExtraInfo(null, null, null, 7, null);
    }

    public /* synthetic */ BVideoCompileBizConfig(BVideoCompileCoreModel bVideoCompileCoreModel, String str, String str2, String str3, boolean z6, BVideoCompileH265Config bVideoCompileH265Config, BVideoCompileHDRConfig bVideoCompileHDRConfig, boolean z7, boolean z8, String str4, boolean z9, String str5, boolean z10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new BVideoCompileCoreModel(null, 0, 0, 0, false, 0, 63, null) : bVideoCompileCoreModel, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? true : z6, (i7 & 32) != 0 ? new BVideoCompileH265Config(false, 0.0f, 3, null) : bVideoCompileH265Config, (i7 & 64) != 0 ? new BVideoCompileHDRConfig(false, false, 0, 0, 15, null) : bVideoCompileHDRConfig, (i7 & 128) != 0 ? true : z7, (i7 & 256) != 0 ? true : z8, (i7 & 512) != 0 ? "0" : str4, (i7 & 1024) != 0 ? true : z9, (i7 & 2048) != 0 ? "" : str5, (i7 & 4096) != 0 ? false : z10);
    }

    public static /* synthetic */ BVideoCompileBizConfig copy$default(BVideoCompileBizConfig bVideoCompileBizConfig, BVideoCompileCoreModel bVideoCompileCoreModel, String str, String str2, String str3, boolean z6, BVideoCompileH265Config bVideoCompileH265Config, BVideoCompileHDRConfig bVideoCompileHDRConfig, boolean z7, boolean z8, String str4, boolean z9, String str5, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bVideoCompileCoreModel = bVideoCompileBizConfig.compileModel;
        }
        if ((i7 & 2) != 0) {
            str = bVideoCompileBizConfig.outputFilePath;
        }
        if ((i7 & 4) != 0) {
            str2 = bVideoCompileBizConfig.bizFrom;
        }
        if ((i7 & 8) != 0) {
            str3 = bVideoCompileBizConfig.source;
        }
        if ((i7 & 16) != 0) {
            z6 = bVideoCompileBizConfig.enableSmartOptimize;
        }
        if ((i7 & 32) != 0) {
            bVideoCompileH265Config = bVideoCompileBizConfig.h265Config;
        }
        if ((i7 & 64) != 0) {
            bVideoCompileHDRConfig = bVideoCompileBizConfig.hdrConfig;
        }
        if ((i7 & 128) != 0) {
            z7 = bVideoCompileBizConfig.enableVFR;
        }
        if ((i7 & 256) != 0) {
            z8 = bVideoCompileBizConfig.enableAutoRetryWithSoftWareEncode;
        }
        if ((i7 & 512) != 0) {
            str4 = bVideoCompileBizConfig.copyToAlbumOption;
        }
        if ((i7 & 1024) != 0) {
            z9 = bVideoCompileBizConfig.enableOperatingRate;
        }
        if ((i7 & 2048) != 0) {
            str5 = bVideoCompileBizConfig.actionID;
        }
        if ((i7 & 4096) != 0) {
            z10 = bVideoCompileBizConfig.skipVideoTranscode;
        }
        return bVideoCompileBizConfig.copy(bVideoCompileCoreModel, str, str2, str3, z6, bVideoCompileH265Config, bVideoCompileHDRConfig, z7, z8, str4, z9, str5, z10);
    }

    @NotNull
    public final BVideoCompileCoreModel component1() {
        return this.compileModel;
    }

    @NotNull
    public final String component10() {
        return this.copyToAlbumOption;
    }

    public final boolean component11() {
        return this.enableOperatingRate;
    }

    @NotNull
    public final String component12() {
        return this.actionID;
    }

    public final boolean component13() {
        return this.skipVideoTranscode;
    }

    @NotNull
    public final String component2() {
        return this.outputFilePath;
    }

    @NotNull
    public final String component3() {
        return this.bizFrom;
    }

    @NotNull
    public final String component4() {
        return this.source;
    }

    public final boolean component5() {
        return this.enableSmartOptimize;
    }

    @NotNull
    public final BVideoCompileH265Config component6() {
        return this.h265Config;
    }

    @NotNull
    public final BVideoCompileHDRConfig component7() {
        return this.hdrConfig;
    }

    public final boolean component8() {
        return this.enableVFR;
    }

    public final boolean component9() {
        return this.enableAutoRetryWithSoftWareEncode;
    }

    @NotNull
    public final BVideoCompileBizConfig copy(@NotNull BVideoCompileCoreModel bVideoCompileCoreModel, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, @NotNull BVideoCompileH265Config bVideoCompileH265Config, @NotNull BVideoCompileHDRConfig bVideoCompileHDRConfig, boolean z7, boolean z8, @NotNull String str4, boolean z9, @NotNull String str5, boolean z10) {
        return new BVideoCompileBizConfig(bVideoCompileCoreModel, str, str2, str3, z6, bVideoCompileH265Config, bVideoCompileHDRConfig, z7, z8, str4, z9, str5, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileBizConfig)) {
            return false;
        }
        BVideoCompileBizConfig bVideoCompileBizConfig = (BVideoCompileBizConfig) obj;
        return Intrinsics.areEqual(this.compileModel, bVideoCompileBizConfig.compileModel) && Intrinsics.areEqual(this.outputFilePath, bVideoCompileBizConfig.outputFilePath) && Intrinsics.areEqual(this.bizFrom, bVideoCompileBizConfig.bizFrom) && Intrinsics.areEqual(this.source, bVideoCompileBizConfig.source) && this.enableSmartOptimize == bVideoCompileBizConfig.enableSmartOptimize && Intrinsics.areEqual(this.h265Config, bVideoCompileBizConfig.h265Config) && Intrinsics.areEqual(this.hdrConfig, bVideoCompileBizConfig.hdrConfig) && this.enableVFR == bVideoCompileBizConfig.enableVFR && this.enableAutoRetryWithSoftWareEncode == bVideoCompileBizConfig.enableAutoRetryWithSoftWareEncode && Intrinsics.areEqual(this.copyToAlbumOption, bVideoCompileBizConfig.copyToAlbumOption) && this.enableOperatingRate == bVideoCompileBizConfig.enableOperatingRate && Intrinsics.areEqual(this.actionID, bVideoCompileBizConfig.actionID) && this.skipVideoTranscode == bVideoCompileBizConfig.skipVideoTranscode;
    }

    @NotNull
    public final String getActionID() {
        return this.actionID;
    }

    @NotNull
    public final String getBizFrom() {
        return this.bizFrom;
    }

    @NotNull
    public final BVideoCompileCoreModel getCompileModel() {
        return this.compileModel;
    }

    @NotNull
    public final String getCopyToAlbumOption() {
        return this.copyToAlbumOption;
    }

    public final boolean getEnableAutoRetryWithSoftWareEncode() {
        return this.enableAutoRetryWithSoftWareEncode;
    }

    public final boolean getEnableDeleteSanBoxFile() {
        return this.enableDeleteSanBoxFile;
    }

    public final boolean getEnableOperatingRate() {
        return this.enableOperatingRate;
    }

    public final boolean getEnableSmartOptimize() {
        return this.enableSmartOptimize;
    }

    public final boolean getEnableVFR() {
        return this.enableVFR;
    }

    @NotNull
    public final EventExtraInfo getEventExtraInfo() {
        return this.eventExtraInfo;
    }

    public final boolean getForceBySpaceNotEnough() {
        return this.forceBySpaceNotEnough;
    }

    @NotNull
    public final BVideoCompileH265Config getH265Config() {
        return this.h265Config;
    }

    @NotNull
    public final BVideoCompileHDRConfig getHdrConfig() {
        return this.hdrConfig;
    }

    @NotNull
    public final String getOutputFilePath() {
        return this.outputFilePath;
    }

    public final boolean getSetCompileCallback4() {
        return this.setCompileCallback4;
    }

    public final boolean getSkipVideoTranscode() {
        return this.skipVideoTranscode;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iA = z.a(E.a(E.a(E.a(this.compileModel.hashCode() * 31, 31, this.outputFilePath), 31, this.bizFrom), 31, this.source), 31, this.enableSmartOptimize);
        return Boolean.hashCode(this.skipVideoTranscode) + E.a(z.a(E.a(z.a(z.a((this.hdrConfig.hashCode() + ((this.h265Config.hashCode() + iA) * 31)) * 31, 31, this.enableVFR), 31, this.enableAutoRetryWithSoftWareEncode), 31, this.copyToAlbumOption), 31, this.enableOperatingRate), 31, this.actionID);
    }

    public final void setActionID(@NotNull String str) {
        this.actionID = str;
    }

    public final void setBizFrom(@NotNull String str) {
        this.bizFrom = str;
    }

    public final void setCompileModel(@NotNull BVideoCompileCoreModel bVideoCompileCoreModel) {
        this.compileModel = bVideoCompileCoreModel;
    }

    public final void setCopyToAlbumOption(@NotNull String str) {
        this.copyToAlbumOption = str;
    }

    public final void setEnableAutoRetryWithSoftWareEncode(boolean z6) {
        this.enableAutoRetryWithSoftWareEncode = z6;
    }

    public final void setEnableDeleteSanBoxFile(boolean z6) {
        this.enableDeleteSanBoxFile = z6;
    }

    public final void setEnableOperatingRate(boolean z6) {
        this.enableOperatingRate = z6;
    }

    public final void setEnableSmartOptimize(boolean z6) {
        this.enableSmartOptimize = z6;
    }

    public final void setEnableVFR(boolean z6) {
        this.enableVFR = z6;
    }

    public final void setEventExtraInfo(@NotNull EventExtraInfo eventExtraInfo) {
        this.eventExtraInfo = eventExtraInfo;
    }

    public final void setForceBySpaceNotEnough(boolean z6) {
        this.forceBySpaceNotEnough = z6;
    }

    public final void setH265Config(@NotNull BVideoCompileH265Config bVideoCompileH265Config) {
        this.h265Config = bVideoCompileH265Config;
    }

    public final void setHdrConfig(@NotNull BVideoCompileHDRConfig bVideoCompileHDRConfig) {
        this.hdrConfig = bVideoCompileHDRConfig;
    }

    public final void setOutputFilePath(@NotNull String str) {
        this.outputFilePath = str;
    }

    public final void setSetCompileCallback4(boolean z6) {
        this.setCompileCallback4 = z6;
    }

    public final void setSkipVideoTranscode(boolean z6) {
        this.skipVideoTranscode = z6;
    }

    public final void setSource(@NotNull String str) {
        this.source = str;
    }

    @NotNull
    public String toString() {
        BVideoCompileCoreModel bVideoCompileCoreModel = this.compileModel;
        String str = this.outputFilePath;
        String str2 = this.bizFrom;
        String str3 = this.source;
        boolean z6 = this.enableSmartOptimize;
        BVideoCompileH265Config bVideoCompileH265Config = this.h265Config;
        BVideoCompileHDRConfig bVideoCompileHDRConfig = this.hdrConfig;
        boolean z7 = this.enableVFR;
        boolean z8 = this.enableAutoRetryWithSoftWareEncode;
        String str4 = this.copyToAlbumOption;
        boolean z9 = this.enableOperatingRate;
        EventExtraInfo eventExtraInfo = this.eventExtraInfo;
        boolean z10 = this.skipVideoTranscode;
        StringBuilder sb = new StringBuilder("BVideoCompileBizConfig(compileModel=");
        sb.append(bVideoCompileCoreModel);
        sb.append(", outputFilePath='");
        sb.append(str);
        sb.append("', bizFrom='");
        B.a(str2, "', source='", str3, "', enableSmartOptimize=", sb);
        sb.append(z6);
        sb.append(", enableH265=");
        sb.append(bVideoCompileH265Config);
        sb.append(", enableHDR=");
        sb.append(bVideoCompileHDRConfig);
        sb.append(", enableVFR=");
        sb.append(z7);
        sb.append(", enableAutoRetryWithSoftWareEncode=");
        a.d(", enableCopyToAlbum=", str4, ", enableOperatingRate=", sb, z8);
        a.d(", ", str4, " eventExtraInfo=", sb, z9);
        sb.append(eventExtraInfo);
        sb.append(", skipVideoTranscode=");
        sb.append(z10);
        sb.append(")");
        return sb.toString();
    }
}
