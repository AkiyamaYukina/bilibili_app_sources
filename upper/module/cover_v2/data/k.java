package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplateDefinition;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplateSticker;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/k.class */
public final class k implements com.bilibili.studio.editor.moudle.material.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverTemplate f112813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112815c;

    public k(MultiCoverTemplate multiCoverTemplate, MultiCoverDataLoader.b bVar, int i7) {
        this.f112813a = multiCoverTemplate;
        this.f112814b = bVar;
        this.f112815c = i7;
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onFailed() {
        this.f112814b.b();
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onSuccess(String str) {
        List<MultiCoverTemplateSticker> stickers;
        MultiCoverTemplateDefinition definition = this.f112813a.getDefinition();
        if (definition != null && (stickers = definition.getStickers()) != null) {
            for (MultiCoverTemplateSticker multiCoverTemplateSticker : stickers) {
                if (multiCoverTemplateSticker.getId() == this.f112815c) {
                    multiCoverTemplateSticker.setFilePath(str);
                }
            }
        }
        this.f112814b.c(str);
    }
}
