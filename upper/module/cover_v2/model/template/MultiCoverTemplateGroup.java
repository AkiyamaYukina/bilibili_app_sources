package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplateGroup.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateGroup {
    public static final int $stable = 8;

    @Nullable
    private String id;

    @Nullable
    private String name;

    @NotNull
    private List<MultiCoverTemplate> templates = new ArrayList();

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<MultiCoverTemplate> getTemplates() {
        return this.templates;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTemplates(@NotNull List<MultiCoverTemplate> list) {
        this.templates = list;
    }
}
