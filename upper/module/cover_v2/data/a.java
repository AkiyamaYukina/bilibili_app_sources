package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate;
import com.bilibili.upper.module.cover_v2.model.template.bean.MultiCoverTemplateDetailResponseBean;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/a.class */
public final class a extends BiliApiDataCallback<MultiCoverTemplateDetailResponseBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader f112797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MultiCoverTemplate f112798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GH0.j f112799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MultiCoverDataLoader.DownloadTask f112800e;

    public a(MultiCoverDataLoader multiCoverDataLoader, MultiCoverTemplate multiCoverTemplate, GH0.j jVar, MultiCoverDataLoader.DownloadTask downloadTask) {
        this.f112797b = multiCoverDataLoader;
        this.f112798c = multiCoverTemplate;
        this.f112799d = jVar;
        this.f112800e = downloadTask;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MultiCoverTemplateDetailResponseBean multiCoverTemplateDetailResponseBean) {
        Map<String, String> templateMaterials;
        MultiCoverTemplateDetailResponseBean multiCoverTemplateDetailResponseBean2 = multiCoverTemplateDetailResponseBean;
        GH0.j jVar = this.f112799d;
        if (multiCoverTemplateDetailResponseBean2 != null && (templateMaterials = multiCoverTemplateDetailResponseBean2.getTemplateMaterials()) != null && !templateMaterials.isEmpty()) {
            this.f112800e.f112784a.setTemplateMaterials(multiCoverTemplateDetailResponseBean2.getTemplateMaterials());
            jVar.invoke(Boolean.TRUE);
            return;
        }
        MultiCoverDataLoader multiCoverDataLoader = this.f112797b;
        MultiCoverTemplate multiCoverTemplate = this.f112798c;
        boolean zA = MultiCoverDataLoader.a(multiCoverDataLoader, multiCoverTemplate);
        BLog.w("MultiCoverDataLoader", "downloadTemplateDetail empty, templateId=" + multiCoverTemplate.getId() + ", definitionOnly=" + zA);
        jVar.invoke(Boolean.valueOf(zA));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        MultiCoverDataLoader multiCoverDataLoader = this.f112797b;
        MultiCoverTemplate multiCoverTemplate = this.f112798c;
        boolean zA = MultiCoverDataLoader.a(multiCoverDataLoader, multiCoverTemplate);
        BLog.w("MultiCoverDataLoader", "downloadTemplateDetail error, templateId=" + multiCoverTemplate.getId() + ", definitionOnly=" + zA, th);
        this.f112799d.invoke(Boolean.valueOf(zA));
    }
}
