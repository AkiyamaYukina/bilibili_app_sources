package com.bilibili.opd.app.bizcommon.malldynamic.core;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/PageTemplateBaseBean.class */
@Keep
public final class PageTemplateBaseBean extends DynamicBaseModel {

    /* JADX INFO: renamed from: vo, reason: collision with root package name */
    @Nullable
    private PageTemplateVo f74007vo;

    public PageTemplateBaseBean() {
        this(null, 1, null);
    }

    public PageTemplateBaseBean(@Nullable PageTemplateVo pageTemplateVo) {
        this.f74007vo = pageTemplateVo;
    }

    public /* synthetic */ PageTemplateBaseBean(PageTemplateVo pageTemplateVo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : pageTemplateVo);
    }

    public static /* synthetic */ PageTemplateBaseBean copy$default(PageTemplateBaseBean pageTemplateBaseBean, PageTemplateVo pageTemplateVo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pageTemplateVo = pageTemplateBaseBean.f74007vo;
        }
        return pageTemplateBaseBean.copy(pageTemplateVo);
    }

    @Nullable
    public final PageTemplateVo component1() {
        return this.f74007vo;
    }

    @NotNull
    public final PageTemplateBaseBean copy(@Nullable PageTemplateVo pageTemplateVo) {
        return new PageTemplateBaseBean(pageTemplateVo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageTemplateBaseBean) && Intrinsics.areEqual(this.f74007vo, ((PageTemplateBaseBean) obj).f74007vo);
    }

    @Nullable
    public final PageTemplateVo getVo() {
        return this.f74007vo;
    }

    public int hashCode() {
        PageTemplateVo pageTemplateVo = this.f74007vo;
        return pageTemplateVo == null ? 0 : pageTemplateVo.hashCode();
    }

    public final void setVo(@Nullable PageTemplateVo pageTemplateVo) {
        this.f74007vo = pageTemplateVo;
    }

    @NotNull
    public String toString() {
        return "PageTemplateBaseBean(vo=" + this.f74007vo + ")";
    }
}
