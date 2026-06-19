package com.bilibili.playset.editor;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.playset.editor.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/p.class */
public final class C5949p implements Function1<String, BiliCall<GeneralResponse<PlaySet>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f84825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84830f;

    public C5949p(J j7, String str, String str2, String str3, String str4, int i7) {
        this.f84825a = j7;
        this.f84826b = str;
        this.f84827c = str2;
        this.f84828d = str3;
        this.f84829e = str4;
        this.f84830f = i7;
    }

    public final Object invoke(Object obj) {
        PlaySetService playSetService = this.f84825a.f84747e;
        String str = this.f84827c;
        String str2 = this.f84828d;
        return playSetService.createPlaySet(this.f84826b, str, str2, this.f84829e, this.f84830f, (String) obj);
    }
}
