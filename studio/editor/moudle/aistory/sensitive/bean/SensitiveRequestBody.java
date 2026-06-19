package com.bilibili.studio.editor.moudle.aistory.sensitive.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/bean/SensitiveRequestBody.class */
@Keep
public final class SensitiveRequestBody {

    @JSONField(name = "contents")
    @NotNull
    private final List<SensitiveRequestBean> contents;

    public SensitiveRequestBody(@NotNull List<SensitiveRequestBean> list) {
        this.contents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SensitiveRequestBody copy$default(SensitiveRequestBody sensitiveRequestBody, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = sensitiveRequestBody.contents;
        }
        return sensitiveRequestBody.copy(list);
    }

    @NotNull
    public final List<SensitiveRequestBean> component1() {
        return this.contents;
    }

    @NotNull
    public final SensitiveRequestBody copy(@NotNull List<SensitiveRequestBean> list) {
        return new SensitiveRequestBody(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveRequestBody) && Intrinsics.areEqual(this.contents, ((SensitiveRequestBody) obj).contents);
    }

    @NotNull
    public final List<SensitiveRequestBean> getContents() {
        return this.contents;
    }

    public int hashCode() {
        return this.contents.hashCode();
    }

    @NotNull
    public String toString() {
        return k.a("SensitiveRequestBody(contents=", ")", this.contents);
    }
}
