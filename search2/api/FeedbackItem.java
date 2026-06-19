package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/FeedbackItem.class */
@StabilityInferred(parameters = 0)
public final class FeedbackItem implements Serializable {
    public static final int $stable = 8;
    private boolean isSelected;

    @JSONField(name = "is_user_fill")
    private boolean isUserFill;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "user_fill_limit")
    private int userFillLimit = 200;

    @JSONField(name = "user_fill_title")
    @Nullable
    private String userFillTitle;

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final int getUserFillLimit() {
        return this.userFillLimit;
    }

    @Nullable
    public final String getUserFillTitle() {
        return this.userFillTitle;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isUserFill() {
        return this.isUserFill;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setUserFill(boolean z6) {
        this.isUserFill = z6;
    }

    public final void setUserFillLimit(int i7) {
        this.userFillLimit = i7;
    }

    public final void setUserFillTitle(@Nullable String str) {
        this.userFillTitle = str;
    }
}
