package com.bilibili.mall.kmm.detailVideo.api;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/api/a.class */
public final /* synthetic */ class a implements Function1 {
    public final Object invoke(Object obj) {
        JsonBuilder jsonBuilder = (JsonBuilder) obj;
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        return Unit.INSTANCE;
    }
}
