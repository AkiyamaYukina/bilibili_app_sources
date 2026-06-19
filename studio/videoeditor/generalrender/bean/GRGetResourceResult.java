package com.bilibili.studio.videoeditor.generalrender.bean;

import G0.b;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.adcommon.utils.c;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRGetResourceResult.class */
@Keep
public final class GRGetResourceResult {

    @Nullable
    private Long duration;

    @Nullable
    private Long fileSize;

    @Nullable
    private String mimeType;

    @Nullable
    private String source;

    @Nullable
    private String sourceType;

    @JSONCreator
    public GRGetResourceResult() {
        this(null, null, null, null, null, 31, null);
    }

    @JSONCreator
    public GRGetResourceResult(@JSONField(name = "mimeType") @Nullable String str, @JSONField(name = "sourceType") @Nullable String str2, @JSONField(name = GameCardButton.extraParamSource) @Nullable String str3, @JSONField(name = "fileSize") @Nullable Long l7, @JSONField(name = EditCustomizeSticker.TAG_DURATION) @Nullable Long l8) {
        this.mimeType = str;
        this.sourceType = str2;
        this.source = str3;
        this.fileSize = l7;
        this.duration = l8;
    }

    public /* synthetic */ GRGetResourceResult(String str, String str2, String str3, Long l7, Long l8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : l7, (i7 & 16) != 0 ? null : l8);
    }

    public static /* synthetic */ GRGetResourceResult copy$default(GRGetResourceResult gRGetResourceResult, String str, String str2, String str3, Long l7, Long l8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRGetResourceResult.mimeType;
        }
        if ((i7 & 2) != 0) {
            str2 = gRGetResourceResult.sourceType;
        }
        if ((i7 & 4) != 0) {
            str3 = gRGetResourceResult.source;
        }
        if ((i7 & 8) != 0) {
            l7 = gRGetResourceResult.fileSize;
        }
        if ((i7 & 16) != 0) {
            l8 = gRGetResourceResult.duration;
        }
        return gRGetResourceResult.copy(str, str2, str3, l7, l8);
    }

    @Nullable
    public final String component1() {
        return this.mimeType;
    }

    @Nullable
    public final String component2() {
        return this.sourceType;
    }

    @Nullable
    public final String component3() {
        return this.source;
    }

    @Nullable
    public final Long component4() {
        return this.fileSize;
    }

    @Nullable
    public final Long component5() {
        return this.duration;
    }

    @NotNull
    public final GRGetResourceResult copy(@JSONField(name = "mimeType") @Nullable String str, @JSONField(name = "sourceType") @Nullable String str2, @JSONField(name = GameCardButton.extraParamSource) @Nullable String str3, @JSONField(name = "fileSize") @Nullable Long l7, @JSONField(name = EditCustomizeSticker.TAG_DURATION) @Nullable Long l8) {
        return new GRGetResourceResult(str, str2, str3, l7, l8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRGetResourceResult)) {
            return false;
        }
        GRGetResourceResult gRGetResourceResult = (GRGetResourceResult) obj;
        return Intrinsics.areEqual(this.mimeType, gRGetResourceResult.mimeType) && Intrinsics.areEqual(this.sourceType, gRGetResourceResult.sourceType) && Intrinsics.areEqual(this.source, gRGetResourceResult.source) && Intrinsics.areEqual(this.fileSize, gRGetResourceResult.fileSize) && Intrinsics.areEqual(this.duration, gRGetResourceResult.duration);
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Long getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        String str = this.mimeType;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.sourceType;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.source;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l7 = this.fileSize;
        int iHashCode5 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.duration;
        if (l8 != null) {
            iHashCode = l8.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public final void setDuration(@Nullable Long l7) {
        this.duration = l7;
    }

    public final void setFileSize(@Nullable Long l7) {
        this.fileSize = l7;
    }

    public final void setMimeType(@Nullable String str) {
        this.mimeType = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    public final void setSourceType(@Nullable String str) {
        this.sourceType = str;
    }

    @NotNull
    public String toString() {
        String str = this.mimeType;
        String str2 = this.sourceType;
        String str3 = this.source;
        Long l7 = this.fileSize;
        Long l8 = this.duration;
        StringBuilder sbA = b.a("GRGetResourceResult(mimeType=", str, ", sourceType=", str2, ", source=");
        sbA.append(str3);
        sbA.append(", fileSize=");
        sbA.append(l7);
        sbA.append(", duration=");
        return c.a(sbA, l8, ")");
    }
}
