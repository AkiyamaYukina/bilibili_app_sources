package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/J.class */
public final class J extends VB0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f107713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntelligenceMusicInfo f107714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f107716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f107718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I.a f107719g;

    public J(long j7, IntelligenceMusicInfo intelligenceMusicInfo, I.a aVar, I i7, String str, String str2, List list) {
        this.f107713a = i7;
        this.f107714b = intelligenceMusicInfo;
        this.f107715c = j7;
        this.f107716d = str;
        this.f107717e = str2;
        this.f107718f = list;
        this.f107719g = aVar;
    }

    @Override // VB0.a
    public final void onError(String str) {
        long j7 = this.f107714b.musicId;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = this.f107715c;
        this.f107713a.getClass();
        Xz0.d.g(2, 1006, 4, jCurrentTimeMillis - j8, String.valueOf(j7));
        this.f107713a.f(this.f107715c, "MP net error", this.f107717e, this.f107714b, this.f107718f, this.f107719g);
    }

    @Override // VB0.a
    public final void onFinish() {
        IntelligenceMusicInfo intelligenceMusicInfo = this.f107714b;
        long j7 = intelligenceMusicInfo.musicId;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = this.f107715c;
        this.f107713a.getClass();
        Xz0.d.g(1, -1, 4, jCurrentTimeMillis - j8, String.valueOf(j7));
        intelligenceMusicInfo.localMarkPointPath = this.f107716d;
        List<String> list = this.f107718f;
        this.f107713a.g(this.f107715c, this.f107717e, intelligenceMusicInfo, list, this.f107719g);
    }
}
