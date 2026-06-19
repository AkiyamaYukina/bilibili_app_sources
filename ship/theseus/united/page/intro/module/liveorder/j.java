package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.ship.theseus.united.utils.q;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/j.class */
public final class j extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f100533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f100534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f100535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DetailReserveService f100536e;

    public j(f fVar, DetailReserveService detailReserveService, Ref.BooleanRef booleanRef, MutableStateFlow mutableStateFlow) {
        this.f100533b = booleanRef;
        this.f100534c = fVar;
        this.f100535d = mutableStateFlow;
        this.f100536e = detailReserveService;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(JSONObject jSONObject) {
        this.f100533b.element = false;
        f fVar = this.f100534c;
        fVar.f100519d = true;
        this.f100535d.setValue(Boolean.TRUE);
        DetailReserveService.b(fVar, this.f100536e, true);
        q.b(2131845529);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f100533b.element = false;
        q.b(2131847109);
    }
}
