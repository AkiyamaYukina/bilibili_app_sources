package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.analytics.C;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRTemplateReuseInfo.class */
@Keep
public final class GRTemplateReuseInfo {

    @Nullable
    private String id;

    @Nullable
    private List<String> materials;

    @JSONCreator
    public GRTemplateReuseInfo(@JSONField(name = "id") @Nullable String str, @JSONField(name = "materials") @Nullable List<String> list) {
        this.id = str;
        this.materials = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GRTemplateReuseInfo copy$default(GRTemplateReuseInfo gRTemplateReuseInfo, String str, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRTemplateReuseInfo.id;
        }
        if ((i7 & 2) != 0) {
            list = gRTemplateReuseInfo.materials;
        }
        return gRTemplateReuseInfo.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final List<String> component2() {
        return this.materials;
    }

    @NotNull
    public final GRTemplateReuseInfo copy(@JSONField(name = "id") @Nullable String str, @JSONField(name = "materials") @Nullable List<String> list) {
        return new GRTemplateReuseInfo(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRTemplateReuseInfo)) {
            return false;
        }
        GRTemplateReuseInfo gRTemplateReuseInfo = (GRTemplateReuseInfo) obj;
        return Intrinsics.areEqual(this.id, gRTemplateReuseInfo.id) && Intrinsics.areEqual(this.materials, gRTemplateReuseInfo.materials);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getMaterials() {
        return this.materials;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list = this.materials;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMaterials(@Nullable List<String> list) {
        this.materials = list;
    }

    @NotNull
    public String toString() {
        return C.a("GRTemplateReuseInfo(id=", this.id, ", materials=", ")", this.materials);
    }
}
