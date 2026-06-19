package com.bilibili.playset.api;

import com.bilibili.okretro.ServiceGenerator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/l.class */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f84094f;

    public /* synthetic */ l(int i7, long j7, long j8, String str, String str2, String str3) {
        this.f84089a = j7;
        this.f84090b = i7;
        this.f84091c = j8;
        this.f84092d = str;
        this.f84093e = str2;
        this.f84094f = str3;
    }

    public final Object invoke(Object obj) {
        PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
        String str = this.f84093e;
        String str2 = this.f84094f;
        return playSetService.likePlaylist(this.f84089a, this.f84090b, 11, this.f84091c, this.f84092d, str, str2, (String) obj);
    }
}
