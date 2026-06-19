package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.ship.theseus.united.utils.q;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/i.class */
public final class i extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f100529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f100530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f100531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DetailReserveService f100532e;

    public i(f fVar, DetailReserveService detailReserveService, Ref.BooleanRef booleanRef, MutableStateFlow mutableStateFlow) {
        this.f100529b = booleanRef;
        this.f100530c = fVar;
        this.f100531d = mutableStateFlow;
        this.f100532e = detailReserveService;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(JSONObject jSONObject) {
        this.f100529b.element = false;
        f fVar = this.f100530c;
        fVar.f100519d = false;
        this.f100531d.setValue(Boolean.FALSE);
        DetailReserveService.b(fVar, this.f100532e, true);
        q.b(2131845479);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f100529b.element = false;
        q.b(2131847502);
    }
}
