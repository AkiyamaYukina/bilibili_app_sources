package com.bilibili.opd.app.bizcommon.malldynamic.core;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/PageTemplate.class */
@Keep
public final class PageTemplate {

    @Nullable
    private List<String> feedsInsert;

    @Nullable
    private TemplateNode moduleInfo;

    public PageTemplate() {
        this(null, null, 3, null);
    }

    public PageTemplate(@Nullable TemplateNode templateNode, @Nullable List<String> list) {
        this.moduleInfo = templateNode;
        this.feedsInsert = list;
    }

    public /* synthetic */ PageTemplate(TemplateNode templateNode, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : templateNode, (i7 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageTemplate copy$default(PageTemplate pageTemplate, TemplateNode templateNode, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            templateNode = pageTemplate.moduleInfo;
        }
        if ((i7 & 2) != 0) {
            list = pageTemplate.feedsInsert;
        }
        return pageTemplate.copy(templateNode, list);
    }

    @Nullable
    public final TemplateNode component1() {
        return this.moduleInfo;
    }

    @Nullable
    public final List<String> component2() {
        return this.feedsInsert;
    }

    @NotNull
    public final PageTemplate copy(@Nullable TemplateNode templateNode, @Nullable List<String> list) {
        return new PageTemplate(templateNode, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageTemplate)) {
            return false;
        }
        PageTemplate pageTemplate = (PageTemplate) obj;
        return Intrinsics.areEqual(this.moduleInfo, pageTemplate.moduleInfo) && Intrinsics.areEqual(this.feedsInsert, pageTemplate.feedsInsert);
    }

    @Nullable
    public final List<String> getFeedsInsert() {
        return this.feedsInsert;
    }

    @Nullable
    public final TemplateNode getModuleInfo() {
        return this.moduleInfo;
    }

    public int hashCode() {
        TemplateNode templateNode = this.moduleInfo;
        int iHashCode = 0;
        int iHashCode2 = templateNode == null ? 0 : templateNode.hashCode();
        List<String> list = this.feedsInsert;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setFeedsInsert(@Nullable List<String> list) {
        this.feedsInsert = list;
    }

    public final void setModuleInfo(@Nullable TemplateNode templateNode) {
        this.moduleInfo = templateNode;
    }

    @NotNull
    public String toString() {
        return "PageTemplate(moduleInfo=" + this.moduleInfo + ", feedsInsert=" + this.feedsInsert + ")";
    }
}
