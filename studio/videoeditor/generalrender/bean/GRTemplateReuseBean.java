package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.fragment.app.D;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRTemplateReuseBean.class */
@Keep
public final class GRTemplateReuseBean {

    @Nullable
    private List<String> materials;

    @Nullable
    private String name;
    private long templateId;

    @JSONCreator
    public GRTemplateReuseBean(@JSONField(name = "templateId") long j7, @JSONField(name = "materials") @Nullable List<String> list, @JSONField(name = "name") @Nullable String str) {
        this.templateId = j7;
        this.materials = list;
        this.name = str;
    }

    public /* synthetic */ GRTemplateReuseBean(long j7, List list, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, list, (i7 & 4) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GRTemplateReuseBean copy$default(GRTemplateReuseBean gRTemplateReuseBean, long j7, List list, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = gRTemplateReuseBean.templateId;
        }
        if ((i7 & 2) != 0) {
            list = gRTemplateReuseBean.materials;
        }
        if ((i7 & 4) != 0) {
            str = gRTemplateReuseBean.name;
        }
        return gRTemplateReuseBean.copy(j7, list, str);
    }

    public final long component1() {
        return this.templateId;
    }

    @Nullable
    public final List<String> component2() {
        return this.materials;
    }

    @Nullable
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final GRTemplateReuseBean copy(@JSONField(name = "templateId") long j7, @JSONField(name = "materials") @Nullable List<String> list, @JSONField(name = "name") @Nullable String str) {
        return new GRTemplateReuseBean(j7, list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRTemplateReuseBean)) {
            return false;
        }
        GRTemplateReuseBean gRTemplateReuseBean = (GRTemplateReuseBean) obj;
        return this.templateId == gRTemplateReuseBean.templateId && Intrinsics.areEqual(this.materials, gRTemplateReuseBean.materials) && Intrinsics.areEqual(this.name, gRTemplateReuseBean.name);
    }

    @Nullable
    public final List<String> getMaterials() {
        return this.materials;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.templateId);
        List<String> list = this.materials;
        int iHashCode2 = 0;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.name;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final void setMaterials(@Nullable List<String> list) {
        this.materials = list;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.templateId;
        List<String> list = this.materials;
        String str = this.name;
        StringBuilder sb = new StringBuilder("GRTemplateReuseBean(templateId=");
        sb.append(j7);
        sb.append(", materials=");
        sb.append(list);
        return D.a(", name=", str, ")", sb);
    }
}
