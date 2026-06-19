package com.bilibili.mall.kmm.virtumart.api;

import com.bilibili.bililive.biz.entryEffect.model.LiveEntryEffectInfo;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/api/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65686a;

    public final Object invoke(Object obj) {
        switch (this.f65686a) {
            case 0:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.setIgnoreUnknownKeys(true);
                jsonBuilder.setLenient(true);
                return Unit.INSTANCE;
            case 1:
                StatData statData = (StatData) obj;
                return Long.valueOf(statData != null ? statData.f104022d : 0L);
            default:
                return String.valueOf(((LiveEntryEffectInfo) obj).getId());
        }
    }
}
