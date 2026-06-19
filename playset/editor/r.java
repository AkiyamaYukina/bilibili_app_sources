package com.bilibili.playset.editor;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/r.class */
public final class r implements Function1<String, BiliCall<GeneralResponse<PlaySet>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f84832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f84838g;

    public r(J j7, String str, String str2, String str3, String str4, int i7, long j8) {
        this.f84832a = j7;
        this.f84833b = str;
        this.f84834c = str2;
        this.f84835d = str3;
        this.f84836e = str4;
        this.f84837f = i7;
        this.f84838g = j8;
    }

    public final Object invoke(Object obj) {
        PlaySetService playSetService = this.f84832a.f84747e;
        String str = this.f84835d;
        String str2 = this.f84836e;
        return playSetService.editPlaySet(this.f84833b, this.f84834c, str, str2, this.f84837f, this.f84838g, (String) obj);
    }
}
