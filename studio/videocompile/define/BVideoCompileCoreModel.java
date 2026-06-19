package com.bilibili.studio.videocompile.define;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.videoeditor.config.BExportConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/define/BVideoCompileCoreModel.class */
@Keep
public final class BVideoCompileCoreModel {
    private int audioBitrate;

    @NotNull
    private BExportConfig exportConfig;
    private int flag;
    private boolean isHardwareEncode;
    private int videoBitrateGrade;
    private int videoResolutionGrade;

    public BVideoCompileCoreModel() {
        this(null, 0, 0, 0, false, 0, 63, null);
    }

    public BVideoCompileCoreModel(@NotNull BExportConfig bExportConfig, int i7, int i8, int i9, boolean z6, int i10) {
        this.exportConfig = bExportConfig;
        this.audioBitrate = i7;
        this.videoBitrateGrade = i8;
        this.videoResolutionGrade = i9;
        this.isHardwareEncode = z6;
        this.flag = i10;
    }

    public /* synthetic */ BVideoCompileCoreModel(BExportConfig bExportConfig, int i7, int i8, int i9, boolean z6, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new BExportConfig() : bExportConfig, (i11 & 2) != 0 ? 320000 : i7, (i11 & 4) != 0 ? 2 : i8, (i11 & 8) != 0 ? 256 : i9, (i11 & 16) != 0 ? true : z6, (i11 & 32) != 0 ? 0 : i10);
    }

    public static /* synthetic */ BVideoCompileCoreModel copy$default(BVideoCompileCoreModel bVideoCompileCoreModel, BExportConfig bExportConfig, int i7, int i8, int i9, boolean z6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bExportConfig = bVideoCompileCoreModel.exportConfig;
        }
        if ((i11 & 2) != 0) {
            i7 = bVideoCompileCoreModel.audioBitrate;
        }
        if ((i11 & 4) != 0) {
            i8 = bVideoCompileCoreModel.videoBitrateGrade;
        }
        if ((i11 & 8) != 0) {
            i9 = bVideoCompileCoreModel.videoResolutionGrade;
        }
        if ((i11 & 16) != 0) {
            z6 = bVideoCompileCoreModel.isHardwareEncode;
        }
        if ((i11 & 32) != 0) {
            i10 = bVideoCompileCoreModel.flag;
        }
        return bVideoCompileCoreModel.copy(bExportConfig, i7, i8, i9, z6, i10);
    }

    @NotNull
    public final BExportConfig component1() {
        return this.exportConfig;
    }

    public final int component2() {
        return this.audioBitrate;
    }

    public final int component3() {
        return this.videoBitrateGrade;
    }

    public final int component4() {
        return this.videoResolutionGrade;
    }

    public final boolean component5() {
        return this.isHardwareEncode;
    }

    public final int component6() {
        return this.flag;
    }

    @NotNull
    public final BVideoCompileCoreModel copy(@NotNull BExportConfig bExportConfig, int i7, int i8, int i9, boolean z6, int i10) {
        return new BVideoCompileCoreModel(bExportConfig, i7, i8, i9, z6, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileCoreModel)) {
            return false;
        }
        BVideoCompileCoreModel bVideoCompileCoreModel = (BVideoCompileCoreModel) obj;
        return Intrinsics.areEqual(this.exportConfig, bVideoCompileCoreModel.exportConfig) && this.audioBitrate == bVideoCompileCoreModel.audioBitrate && this.videoBitrateGrade == bVideoCompileCoreModel.videoBitrateGrade && this.videoResolutionGrade == bVideoCompileCoreModel.videoResolutionGrade && this.isHardwareEncode == bVideoCompileCoreModel.isHardwareEncode && this.flag == bVideoCompileCoreModel.flag;
    }

    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    @NotNull
    public final BExportConfig getExportConfig() {
        return this.exportConfig;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getVideoBitrateGrade() {
        return this.videoBitrateGrade;
    }

    public final int getVideoResolutionGrade() {
        return this.videoResolutionGrade;
    }

    public int hashCode() {
        return Integer.hashCode(this.flag) + z.a(I.a(this.videoResolutionGrade, I.a(this.videoBitrateGrade, I.a(this.audioBitrate, this.exportConfig.hashCode() * 31, 31), 31), 31), 31, this.isHardwareEncode);
    }

    public final boolean isHardwareEncode() {
        return this.isHardwareEncode;
    }

    public final void setAudioBitrate(int i7) {
        this.audioBitrate = i7;
    }

    public final void setExportConfig(@NotNull BExportConfig bExportConfig) {
        this.exportConfig = bExportConfig;
    }

    public final void setFlag(int i7) {
        this.flag = i7;
    }

    public final void setHardwareEncode(boolean z6) {
        this.isHardwareEncode = z6;
    }

    public final void setVideoBitrateGrade(int i7) {
        this.videoBitrateGrade = i7;
    }

    public final void setVideoResolutionGrade(int i7) {
        this.videoResolutionGrade = i7;
    }

    @NotNull
    public String toString() {
        BExportConfig bExportConfig = this.exportConfig;
        int i7 = this.audioBitrate;
        int i8 = this.videoBitrateGrade;
        int i9 = this.videoResolutionGrade;
        boolean z6 = this.isHardwareEncode;
        int i10 = this.flag;
        StringBuilder sb = new StringBuilder("BVideoCompileCoreModel(exportConfig=");
        sb.append(bExportConfig);
        sb.append(", audioBitrate=");
        sb.append(i7);
        sb.append(", videoBitrateGrade=");
        C4690e.a(i8, i9, ", videoResolutionGrade=", ", isHardwareEncode=", sb);
        sb.append(z6);
        sb.append(", flag=");
        sb.append(i10);
        sb.append(")");
        return sb.toString();
    }
}
