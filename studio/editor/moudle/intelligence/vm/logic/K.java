package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import android.text.TextUtils;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import com.bilibili.studio.videoeditor.bgm.BgmDynamic;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import java.util.List;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/K.class */
public final class K extends BiliApiDataCallback<BgmDynamic> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f107720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntelligenceMusicInfo f107721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f107722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f107723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f107724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I.a f107725g;
    public final Ref.ObjectRef<String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BgmMissionInfo f107726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Ref.ObjectRef<String> f107727j;

    public K(I i7, IntelligenceMusicInfo intelligenceMusicInfo, long j7, String str, List<String> list, I.a aVar, Ref.ObjectRef<String> objectRef, BgmMissionInfo bgmMissionInfo, Ref.ObjectRef<String> objectRef2) {
        this.f107720b = i7;
        this.f107721c = intelligenceMusicInfo;
        this.f107722d = j7;
        this.f107723e = str;
        this.f107724f = list;
        this.f107725g = aVar;
        this.h = objectRef;
        this.f107726i = bgmMissionInfo;
        this.f107727j = objectRef2;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BgmDynamic bgmDynamic) {
        List<String> list;
        List<String> list2;
        BgmDynamic bgmDynamic2 = bgmDynamic;
        int size = (bgmDynamic2 == null || (list2 = bgmDynamic2.cdns) == null) ? 0 : list2.size();
        Ref.ObjectRef<String> objectRef = this.h;
        if (size > 0) {
            objectRef.element = (bgmDynamic2 == null || (list = bgmDynamic2.cdns) == null) ? null : list.get(0);
        }
        boolean zIsEmpty = TextUtils.isEmpty((CharSequence) objectRef.element);
        IntelligenceMusicInfo intelligenceMusicInfo = this.f107721c;
        if (zIsEmpty) {
            BLog.e("NetMusicRecLogic", "downloadMusic getUrlFromMusic fail url=empty");
            long j7 = intelligenceMusicInfo.musicId;
            this.f107720b.getClass();
            C9270a.c(String.valueOf(j7), "music_null");
            this.f107720b.h(this.f107722d, "url=empty", this.f107723e, intelligenceMusicInfo, this.f107724f, this.f107725g);
            return;
        }
        BLog.e("NetMusicRecLogic", "downloadMusic getUrlFromMusic url=" + objectRef.element);
        intelligenceMusicInfo.downloadUrl = (String) objectRef.element;
        this.f107720b.e(this.f107723e, this.f107722d, intelligenceMusicInfo, this.f107726i, this.f107724f, (String) this.f107727j.element, this.f107725g);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        IntelligenceMusicInfo intelligenceMusicInfo = this.f107721c;
        long j7 = intelligenceMusicInfo.musicId;
        this.f107720b.getClass();
        C9270a.c(String.valueOf(j7), "music_null");
        BLog.e("NetMusicRecLogic", "downloadMusic getUrlFromMusic fail");
        this.f107720b.h(this.f107722d, "url=error", this.f107723e, intelligenceMusicInfo, this.f107724f, this.f107725g);
    }
}
