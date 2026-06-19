package com.bilibili.studio.videoeditor.generalrender.bean;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.exifinterface.media.a;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRXmlBean.class */
@Keep
public final class GRXmlBean {

    @Nullable
    private String config;

    @Nullable
    private String name;

    @Nullable
    private String scene;
    private long templateId;
    private long ttl;

    @JSONCreator
    public GRXmlBean() {
        this(null, null, null, 0L, 0L, 31, null);
    }

    @JSONCreator
    public GRXmlBean(@JSONField(name = "name") @Nullable String str, @JSONField(name = "config") @Nullable String str2, @JSONField(name = "scene") @Nullable String str3, @JSONField(name = "templateId") long j7, @JSONField(name = "ttl") long j8) {
        this.name = str;
        this.config = str2;
        this.scene = str3;
        this.templateId = j7;
        this.ttl = j8;
    }

    public /* synthetic */ GRXmlBean(String str, String str2, String str3, long j7, long j8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? 0L : j7, (i7 & 16) != 0 ? 0L : j8);
    }

    public static /* synthetic */ GRXmlBean copy$default(GRXmlBean gRXmlBean, String str, String str2, String str3, long j7, long j8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRXmlBean.name;
        }
        if ((i7 & 2) != 0) {
            str2 = gRXmlBean.config;
        }
        if ((i7 & 4) != 0) {
            str3 = gRXmlBean.scene;
        }
        if ((i7 & 8) != 0) {
            j7 = gRXmlBean.templateId;
        }
        if ((i7 & 16) != 0) {
            j8 = gRXmlBean.ttl;
        }
        return gRXmlBean.copy(str, str2, str3, j7, j8);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.config;
    }

    @Nullable
    public final String component3() {
        return this.scene;
    }

    public final long component4() {
        return this.templateId;
    }

    public final long component5() {
        return this.ttl;
    }

    @NotNull
    public final GRXmlBean copy(@JSONField(name = "name") @Nullable String str, @JSONField(name = "config") @Nullable String str2, @JSONField(name = "scene") @Nullable String str3, @JSONField(name = "templateId") long j7, @JSONField(name = "ttl") long j8) {
        return new GRXmlBean(str, str2, str3, j7, j8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRXmlBean)) {
            return false;
        }
        GRXmlBean gRXmlBean = (GRXmlBean) obj;
        return Intrinsics.areEqual(this.name, gRXmlBean.name) && Intrinsics.areEqual(this.config, gRXmlBean.config) && Intrinsics.areEqual(this.scene, gRXmlBean.scene) && this.templateId == gRXmlBean.templateId && this.ttl == gRXmlBean.ttl;
    }

    @Nullable
    public final String getConfig() {
        return this.config;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.config;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.scene;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Long.hashCode(this.ttl) + C3554n0.a(((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.templateId);
    }

    public final void setConfig(@Nullable String str) {
        this.config = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    public final void setTtl(long j7) {
        this.ttl = j7;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.config;
        String str3 = this.scene;
        long j7 = this.templateId;
        long j8 = this.ttl;
        StringBuilder sbA = b.a("GRXmlBean(name=", str, ", config=", str2, ", scene=");
        v.a(j7, str3, ", templateId=", sbA);
        return a.a(j8, ", ttl=", ")", sbA);
    }
}
