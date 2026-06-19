package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.features.background.b;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRContribute.class */
@Keep
public final class GRContribute {

    @Nullable
    private HashMap<String, String> loggerExtra;

    @Nullable
    private String name;

    @Nullable
    private String param;
    private long templateId;

    @JSONCreator
    public GRContribute() {
        this(null, 0L, null, null, 15, null);
    }

    @JSONCreator
    public GRContribute(@JSONField(name = "param") @Nullable String str, @JSONField(name = "templateId") long j7, @JSONField(name = "loggerExtra") @Nullable HashMap<String, String> map, @JSONField(name = "name") @Nullable String str2) {
        this.param = str;
        this.templateId = j7;
        this.loggerExtra = map;
        this.name = str2;
    }

    public /* synthetic */ GRContribute(String str, long j7, HashMap map, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j7, (i7 & 4) != 0 ? null : map, (i7 & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GRContribute copy$default(GRContribute gRContribute, String str, long j7, HashMap map, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRContribute.param;
        }
        if ((i7 & 2) != 0) {
            j7 = gRContribute.templateId;
        }
        if ((i7 & 4) != 0) {
            map = gRContribute.loggerExtra;
        }
        if ((i7 & 8) != 0) {
            str2 = gRContribute.name;
        }
        return gRContribute.copy(str, j7, map, str2);
    }

    @Nullable
    public final String component1() {
        return this.param;
    }

    public final long component2() {
        return this.templateId;
    }

    @Nullable
    public final HashMap<String, String> component3() {
        return this.loggerExtra;
    }

    @Nullable
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final GRContribute copy(@JSONField(name = "param") @Nullable String str, @JSONField(name = "templateId") long j7, @JSONField(name = "loggerExtra") @Nullable HashMap<String, String> map, @JSONField(name = "name") @Nullable String str2) {
        return new GRContribute(str, j7, map, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRContribute)) {
            return false;
        }
        GRContribute gRContribute = (GRContribute) obj;
        return Intrinsics.areEqual(this.param, gRContribute.param) && this.templateId == gRContribute.templateId && Intrinsics.areEqual(this.loggerExtra, gRContribute.loggerExtra) && Intrinsics.areEqual(this.name, gRContribute.name);
    }

    @Nullable
    public final HashMap<String, String> getLoggerExtra() {
        return this.loggerExtra;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.param;
        int iHashCode = 0;
        int iA = C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.templateId);
        HashMap<String, String> map = this.loggerExtra;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str2 = this.name;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    public final void setLoggerExtra(@Nullable HashMap<String, String> map) {
        this.loggerExtra = map;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    @NotNull
    public String toString() {
        String str = this.param;
        long j7 = this.templateId;
        HashMap<String, String> map = this.loggerExtra;
        String str2 = this.name;
        StringBuilder sbA = b.a(j7, "GRContribute(param=", str, ", templateId=");
        sbA.append(", loggerExtra=");
        sbA.append(map);
        sbA.append(", name=");
        sbA.append(str2);
        sbA.append(")");
        return sbA.toString();
    }
}
