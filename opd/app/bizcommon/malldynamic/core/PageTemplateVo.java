package com.bilibili.opd.app.bizcommon.malldynamic.core;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/PageTemplateVo.class */
@Keep
public final class PageTemplateVo {

    @Nullable
    private PageTemplate pageTemplate;

    public PageTemplateVo() {
        this(null, 1, null);
    }

    public PageTemplateVo(@Nullable PageTemplate pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

    public /* synthetic */ PageTemplateVo(PageTemplate pageTemplate, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : pageTemplate);
    }

    public static /* synthetic */ PageTemplateVo copy$default(PageTemplateVo pageTemplateVo, PageTemplate pageTemplate, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pageTemplate = pageTemplateVo.pageTemplate;
        }
        return pageTemplateVo.copy(pageTemplate);
    }

    @Nullable
    public final PageTemplate component1() {
        return this.pageTemplate;
    }

    @NotNull
    public final PageTemplateVo copy(@Nullable PageTemplate pageTemplate) {
        return new PageTemplateVo(pageTemplate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageTemplateVo) && Intrinsics.areEqual(this.pageTemplate, ((PageTemplateVo) obj).pageTemplate);
    }

    @Nullable
    public final PageTemplate getPageTemplate() {
        return this.pageTemplate;
    }

    public int hashCode() {
        PageTemplate pageTemplate = this.pageTemplate;
        return pageTemplate == null ? 0 : pageTemplate.hashCode();
    }

    public final void setPageTemplate(@Nullable PageTemplate pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

    @NotNull
    public String toString() {
        return "PageTemplateVo(pageTemplate=" + this.pageTemplate + ")";
    }
}
