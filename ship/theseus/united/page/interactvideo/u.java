package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.okretro.GeneralResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/u.class */
public final class u implements Callback<GeneralResponse<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.app.gemini.ugc.feature.interactivevideo.k f100008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100009b;

    public u(int i7, com.bilibili.app.gemini.ugc.feature.interactivevideo.k kVar) {
        this.f100008a = kVar;
        this.f100009b = i7;
    }

    public final void onFailure(Call<GeneralResponse<Object>> call, Throwable th) {
        this.f100008a.onFailed();
    }

    public final void onResponse(Call<GeneralResponse<Object>> call, Response<GeneralResponse<Object>> response) {
        this.f100008a.a(this.f100009b);
    }
}
