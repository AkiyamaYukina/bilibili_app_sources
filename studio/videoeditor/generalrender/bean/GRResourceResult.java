package com.bilibili.studio.videoeditor.generalrender.bean;

import android.support.v4.media.a;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRResourceResult.class */
@Keep
public final class GRResourceResult {

    @Nullable
    private String url;

    @JSONCreator
    public GRResourceResult() {
        this(null, 1, null);
    }

    @JSONCreator
    public GRResourceResult(@JSONField(name = "url") @Nullable String str) {
        this.url = str;
    }

    public /* synthetic */ GRResourceResult(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ GRResourceResult copy$default(GRResourceResult gRResourceResult, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = gRResourceResult.url;
        }
        return gRResourceResult.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final GRResourceResult copy(@JSONField(name = "url") @Nullable String str) {
        return new GRResourceResult(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GRResourceResult) && Intrinsics.areEqual(this.url, ((GRResourceResult) obj).url);
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return str == null ? 0 : str.hashCode();
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return a.a("GRResourceResult(url=", this.url, ")");
    }
}
