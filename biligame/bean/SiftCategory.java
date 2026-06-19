package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/SiftCategory.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SiftCategory {
    public static final int $stable = 8;

    @Nullable
    private List<GameCategoryItem> list;

    @Nullable
    private String title;

    @Nullable
    private String type;

    public SiftCategory() {
        this(null, null, null, 7, null);
    }

    public SiftCategory(@Nullable String str, @Nullable String str2, @Nullable List<GameCategoryItem> list) {
        this.type = str;
        this.title = str2;
        this.list = list;
    }

    public /* synthetic */ SiftCategory(String str, String str2, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : list);
    }

    @Nullable
    public final List<GameCategoryItem> getList() {
        return this.list;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setList(@Nullable List<GameCategoryItem> list) {
        this.list = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
