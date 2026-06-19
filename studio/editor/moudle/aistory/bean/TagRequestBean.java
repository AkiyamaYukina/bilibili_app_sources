package com.bilibili.studio.editor.moudle.aistory.bean;

import J1.M;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/TagRequestBean.class */
@Keep
public final class TagRequestBean {

    @JSONField(name = "need_chinese")
    private boolean need_chinese;

    public TagRequestBean(boolean z6) {
        this.need_chinese = z6;
    }

    public static /* synthetic */ TagRequestBean copy$default(TagRequestBean tagRequestBean, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = tagRequestBean.need_chinese;
        }
        return tagRequestBean.copy(z6);
    }

    public final boolean component1() {
        return this.need_chinese;
    }

    @NotNull
    public final TagRequestBean copy(boolean z6) {
        return new TagRequestBean(z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TagRequestBean) && this.need_chinese == ((TagRequestBean) obj).need_chinese;
    }

    public final boolean getNeed_chinese() {
        return this.need_chinese;
    }

    public int hashCode() {
        return Boolean.hashCode(this.need_chinese);
    }

    public final void setNeed_chinese(boolean z6) {
        this.need_chinese = z6;
    }

    @NotNull
    public String toString() {
        return M.a("TagRequestBean(need_chinese=", ")", this.need_chinese);
    }
}
