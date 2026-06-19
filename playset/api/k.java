package com.bilibili.playset.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.ServiceGenerator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/k.class */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONObject f84086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f84087g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f84088i;

    public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, String str7, String str8) {
        this.f84081a = str;
        this.f84082b = str2;
        this.f84083c = str3;
        this.f84084d = str4;
        this.f84085e = str5;
        this.f84086f = jSONObject;
        this.f84087g = str6;
        this.h = str7;
        this.f84088i = str8;
    }

    public final Object invoke(Object obj) {
        PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
        String string = this.f84086f.toString();
        return playSetService.favBatchVideo(this.f84081a, this.f84082b, this.f84083c, this.f84084d, this.f84085e, string, this.f84087g, this.h, this.f84088i, (String) obj);
    }
}
