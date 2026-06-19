package com.bilibili.studio.videoeditor.generalrender.bean;

import G0.b;
import androidx.annotation.Keep;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRUrlBean.class */
@Keep
public final class GRUrlBean {

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;

    @Nullable
    private String hintMsg;

    @Nullable
    private String url;

    @JSONCreator
    public GRUrlBean() {
        this(null, null, null, null, 15, null);
    }

    @JSONCreator
    public GRUrlBean(@JSONField(name = "url") @Nullable String str, @JSONField(name = "hintMsg") @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.url = str;
        this.hintMsg = str2;
        this.fileName = str3;
        this.filePath = str4;
    }

    public /* synthetic */ GRUrlBean(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ GRUrlBean copy$default(GRUrlBean gRUrlBean, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRUrlBean.url;
        }
        if ((i7 & 2) != 0) {
            str2 = gRUrlBean.hintMsg;
        }
        if ((i7 & 4) != 0) {
            str3 = gRUrlBean.fileName;
        }
        if ((i7 & 8) != 0) {
            str4 = gRUrlBean.filePath;
        }
        return gRUrlBean.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @Nullable
    public final String component2() {
        return this.hintMsg;
    }

    @Nullable
    public final String component3() {
        return this.fileName;
    }

    @Nullable
    public final String component4() {
        return this.filePath;
    }

    @NotNull
    public final GRUrlBean copy(@JSONField(name = "url") @Nullable String str, @JSONField(name = "hintMsg") @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new GRUrlBean(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRUrlBean)) {
            return false;
        }
        GRUrlBean gRUrlBean = (GRUrlBean) obj;
        return Intrinsics.areEqual(this.url, gRUrlBean.url) && Intrinsics.areEqual(this.hintMsg, gRUrlBean.hintMsg) && Intrinsics.areEqual(this.fileName, gRUrlBean.fileName) && Intrinsics.areEqual(this.filePath, gRUrlBean.filePath);
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getHintMsg() {
        return this.hintMsg;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.hintMsg;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fileName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.filePath;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setHintMsg(@Nullable String str) {
        this.hintMsg = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.fileName, ", filePath=", this.filePath, ")", b.a("GRUrlBean(url=", this.url, ", hintMsg=", this.hintMsg, ", fileName="));
    }
}
