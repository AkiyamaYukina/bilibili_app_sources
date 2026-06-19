package com.bilibili.studio.editor.frame;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.constraintlayout.widget.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/frame/FrameZipInfo.class */
@Keep
public final class FrameZipInfo {

    @NotNull
    private final String filePath;
    private final int frameCount;

    @Nullable
    private String remoteFileName;

    public FrameZipInfo() {
        this(null, 0, null, 7, null);
    }

    public FrameZipInfo(@NotNull String str, int i7, @Nullable String str2) {
        this.filePath = str;
        this.frameCount = i7;
        this.remoteFileName = str2;
    }

    public /* synthetic */ FrameZipInfo(String str, int i7, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ FrameZipInfo copy$default(FrameZipInfo frameZipInfo, String str, int i7, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = frameZipInfo.filePath;
        }
        if ((i8 & 2) != 0) {
            i7 = frameZipInfo.frameCount;
        }
        if ((i8 & 4) != 0) {
            str2 = frameZipInfo.remoteFileName;
        }
        return frameZipInfo.copy(str, i7, str2);
    }

    @NotNull
    public final String component1() {
        return this.filePath;
    }

    public final int component2() {
        return this.frameCount;
    }

    @Nullable
    public final String component3() {
        return this.remoteFileName;
    }

    @NotNull
    public final FrameZipInfo copy(@NotNull String str, int i7, @Nullable String str2) {
        return new FrameZipInfo(str, i7, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameZipInfo)) {
            return false;
        }
        FrameZipInfo frameZipInfo = (FrameZipInfo) obj;
        return Intrinsics.areEqual(this.filePath, frameZipInfo.filePath) && this.frameCount == frameZipInfo.frameCount && Intrinsics.areEqual(this.remoteFileName, frameZipInfo.remoteFileName);
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    @Nullable
    public final String getRemoteFileName() {
        return this.remoteFileName;
    }

    public int hashCode() {
        int iA = I.a(this.frameCount, this.filePath.hashCode() * 31, 31);
        String str = this.remoteFileName;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setRemoteFileName(@Nullable String str) {
        this.remoteFileName = str;
    }

    @NotNull
    public String toString() {
        String str = this.filePath;
        int i7 = this.frameCount;
        return C8770a.a(e.a(i7, "FrameZipInfo(filePath=", str, ", frameCount=", ", remoteFileName="), this.remoteFileName, ")");
    }
}
