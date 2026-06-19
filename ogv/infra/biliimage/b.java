package com.bilibili.ogv.infra.biliimage;

import com.bilibili.lib.image2.bean.ImageDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/biliimage/b.class */
public final class b implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageDataSource<Object> f67863a;

    public b(ImageDataSource<Object> imageDataSource) {
        this.f67863a = imageDataSource;
    }

    public final Object invoke(Object obj) {
        this.f67863a.close();
        return Unit.INSTANCE;
    }
}
