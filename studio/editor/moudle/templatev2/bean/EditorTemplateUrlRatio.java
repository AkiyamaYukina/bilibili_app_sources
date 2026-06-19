package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateUrlRatio.class */
@Keep
public final class EditorTemplateUrlRatio implements Serializable {

    @JvmField
    @JSONField(name = "download_url")
    @Nullable
    public String downloadUrl;

    @JvmField
    @JSONField(name = "ratio")
    @Nullable
    public String ratio;

    public boolean equals(@Nullable Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(EditorTemplateUrlRatio.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        EditorTemplateUrlRatio editorTemplateUrlRatio = (EditorTemplateUrlRatio) obj;
        if (!Intrinsics.areEqual(editorTemplateUrlRatio.ratio, this.ratio) || !Intrinsics.areEqual(editorTemplateUrlRatio.downloadUrl, this.downloadUrl)) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        String str = this.ratio;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.downloadUrl;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }
}
