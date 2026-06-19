package com.bilibili.upper.module.cover_v2.presenter;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import px0.e$b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/h.class */
public final class h implements e$b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverCaptionSettingProxy f112842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionListItem f112843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.caption.setting.presenter.d f112844c;

    public h(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, CaptionListItem captionListItem, com.bilibili.studio.editor.moudle.caption.setting.presenter.d dVar) {
        this.f112842a = multiCoverCaptionSettingProxy;
        this.f112843b = captionListItem;
        this.f112844c = dVar;
    }

    @Override // px0.e$b
    public final void a(int i7, String str) {
        this.f112844c.a(i7, str);
    }

    @Override // px0.e$b
    public final void b(String str) {
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112842a;
        CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
        if (captionInfoC != null) {
            captionInfoC.isTemp = false;
        }
        CaptionListItem captionListItem = this.f112843b;
        multiCoverCaptionSettingProxy.a(new b(multiCoverCaptionSettingProxy, captionListItem));
        multiCoverCaptionSettingProxy.a(new ED0.e(captionListItem.getMax(), 1, multiCoverCaptionSettingProxy, str));
        this.f112844c.b(str);
    }
}
