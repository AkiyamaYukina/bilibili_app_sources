package com.bilibili.studio.videoeditor.generalrender.bean;

import G0.b;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRUploadInfo.class */
@Keep
public final class GRUploadInfo {

    @Nullable
    private String name;

    @Nullable
    private String scene;

    @Nullable
    private Long templateId;

    @Nullable
    private String url;

    @JSONCreator
    public GRUploadInfo(@JSONField(name = "url") @Nullable String str, @JSONField(name = "scene") @Nullable String str2, @JSONField(name = "name") @Nullable String str3, @JSONField(name = "templateId") @Nullable Long l7) {
        this.url = str;
        this.scene = str2;
        this.name = str3;
        this.templateId = l7;
    }

    public /* synthetic */ GRUploadInfo(String str, String str2, String str3, Long l7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i7 & 8) != 0 ? 0L : l7);
    }

    public static /* synthetic */ GRUploadInfo copy$default(GRUploadInfo gRUploadInfo, String str, String str2, String str3, Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRUploadInfo.url;
        }
        if ((i7 & 2) != 0) {
            str2 = gRUploadInfo.scene;
        }
        if ((i7 & 4) != 0) {
            str3 = gRUploadInfo.name;
        }
        if ((i7 & 8) != 0) {
            l7 = gRUploadInfo.templateId;
        }
        return gRUploadInfo.copy(str, str2, str3, l7);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.scene;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final Long component4() {
        return this.templateId;
    }

    @NotNull
    public final GRUploadInfo copy(@JSONField(name = "url") @Nullable String str, @JSONField(name = "scene") @Nullable String str2, @JSONField(name = "name") @Nullable String str3, @JSONField(name = "templateId") @Nullable Long l7) {
        return new GRUploadInfo(str, str2, str3, l7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRUploadInfo)) {
            return false;
        }
        GRUploadInfo gRUploadInfo = (GRUploadInfo) obj;
        return Intrinsics.areEqual(this.url, gRUploadInfo.url) && Intrinsics.areEqual(this.scene, gRUploadInfo.scene) && Intrinsics.areEqual(this.name, gRUploadInfo.name) && Intrinsics.areEqual(this.templateId, gRUploadInfo.templateId);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final Long getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.scene;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l7 = this.templateId;
        if (l7 != null) {
            iHashCode = l7.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setTemplateId(@Nullable Long l7) {
        this.templateId = l7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.scene;
        String str3 = this.name;
        Long l7 = this.templateId;
        StringBuilder sbA = b.a("GRUploadInfo(url=", str, ", scene=", str2, ", name=");
        sbA.append(str3);
        sbA.append(", templateId=");
        sbA.append(l7);
        sbA.append(")");
        return sbA.toString();
    }
}
