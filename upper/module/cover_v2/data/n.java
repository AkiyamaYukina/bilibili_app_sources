package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplateGroup;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/n.class */
public final class n<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverDataLoader f112817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112818b;

    public n(MultiCoverDataLoader multiCoverDataLoader, MultiCoverDataLoader.b bVar) {
        this.f112817a = multiCoverDataLoader;
        this.f112818b = bVar;
    }

    public final void accept(Object obj) {
        List<MultiCoverTemplateGroup> list = (List) obj;
        this.f112817a.f112779a = list;
        this.f112818b.c(list);
    }
}
