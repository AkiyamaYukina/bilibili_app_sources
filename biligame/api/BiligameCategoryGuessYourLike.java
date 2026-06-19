package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCategoryGuessYourLike.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameCategoryGuessYourLike {
    public static final int $stable = 8;

    @JSONField(name = "game_count")
    private int gameCount;

    @JSONField(name = "icon_list")
    @Nullable
    private List<String> tagIcon;

    @JSONField(name = "tag_id")
    @NotNull
    private String tagId = "";

    @JSONField(name = "name")
    @NotNull
    private String tagName = "";

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(BiligameCategoryGuessYourLike.class, obj != null ? obj.getClass() : null) && Intrinsics.areEqual(this.tagId, ((BiligameCategoryGuessYourLike) obj).tagId);
    }

    public final int getGameCount() {
        return this.gameCount;
    }

    @Nullable
    public final List<String> getTagIcon() {
        return this.tagIcon;
    }

    @NotNull
    public final String getTagId() {
        return this.tagId;
    }

    @NotNull
    public final String getTagName() {
        return this.tagName;
    }

    public int hashCode() {
        return this.tagId.hashCode();
    }

    public final void setGameCount(int i7) {
        this.gameCount = i7;
    }

    public final void setTagIcon(@Nullable List<String> list) {
        this.tagIcon = list;
    }

    public final void setTagId(@NotNull String str) {
        this.tagId = str;
    }

    public final void setTagName(@NotNull String str) {
        this.tagName = str;
    }
}
