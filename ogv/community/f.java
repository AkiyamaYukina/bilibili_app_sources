package com.bilibili.ogv.community;

import com.bilibili.playset.api.m;
import com.bilibili.pvtracker.PageViewTracker;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/f.class */
public final /* synthetic */ class f implements SingleOnSubscribe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f67540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f67541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f67542g;

    public /* synthetic */ f(String str, boolean z6, String str2, String str3, String str4, long j7, long j8) {
        this.f67536a = str;
        this.f67537b = z6;
        this.f67538c = str2;
        this.f67539d = str3;
        this.f67540e = str4;
        this.f67541f = j7;
        this.f67542g = j8;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        String accessKey = com.bilibili.ogv.infra.account.a.f67852b.getAccessKey();
        boolean z6 = this.f67537b;
        String str = this.f67538c;
        String str2 = z6 ? str : null;
        if (z6) {
            str = null;
        }
        m.b(accessKey, this.f67536a, str2, str, new HashMap(), this.f67539d, this.f67540e, PageViewTracker.getInstance().currentPolarisActionId(), new g(this.f67541f, this.f67542g, z6, singleEmitter));
    }
}
