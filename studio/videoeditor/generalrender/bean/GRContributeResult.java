package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRContributeResult.class */
@Keep
public final class GRContributeResult {

    @Nullable
    private String aid;

    @Nullable
    private String bvid;

    @JSONCreator
    public GRContributeResult() {
        this(null, null, 3, null);
    }

    @JSONCreator
    public GRContributeResult(@JSONField(name = "aid") @Nullable String str, @JSONField(name = "bvid") @Nullable String str2) {
        this.aid = str;
        this.bvid = str2;
    }

    public /* synthetic */ GRContributeResult(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ GRContributeResult copy$default(GRContributeResult gRContributeResult, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRContributeResult.aid;
        }
        if ((i7 & 2) != 0) {
            str2 = gRContributeResult.bvid;
        }
        return gRContributeResult.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.aid;
    }

    @Nullable
    public final String component2() {
        return this.bvid;
    }

    @NotNull
    public final GRContributeResult copy(@JSONField(name = "aid") @Nullable String str, @JSONField(name = "bvid") @Nullable String str2) {
        return new GRContributeResult(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRContributeResult)) {
            return false;
        }
        GRContributeResult gRContributeResult = (GRContributeResult) obj;
        return Intrinsics.areEqual(this.aid, gRContributeResult.aid) && Intrinsics.areEqual(this.bvid, gRContributeResult.bvid);
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getBvid() {
        return this.bvid;
    }

    public int hashCode() {
        String str = this.aid;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.bvid;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setBvid(@Nullable String str) {
        this.bvid = str;
    }

    @NotNull
    public String toString() {
        return p.a("GRContributeResult(aid=", this.aid, ", bvid=", this.bvid, ")");
    }
}
