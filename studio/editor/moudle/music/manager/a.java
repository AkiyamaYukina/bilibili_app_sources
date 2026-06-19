package com.bilibili.studio.editor.moudle.music.manager;

import androidx.annotation.Nullable;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmDynamic;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/a.class */
public final class a extends BiliApiDataCallback<BgmDynamic> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bgm f107899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MusicDownloadData f107900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f107901d;

    public a(b bVar, Bgm bgm, MusicDownloadData musicDownloadData) {
        this.f107901d = bVar;
        this.f107899b = bgm;
        this.f107900c = musicDownloadData;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(@Nullable BgmDynamic bgmDynamic) {
        List<String> list;
        BgmDynamic bgmDynamic2 = bgmDynamic;
        MusicDownloadData musicDownloadData = this.f107900c;
        b bVar = this.f107901d;
        if (bgmDynamic2 == null || (list = bgmDynamic2.cdns) == null || list.size() <= 0) {
            b.a(bVar, musicDownloadData);
        } else {
            this.f107899b.playurl = bgmDynamic2.cdns.get(0);
            bVar.e(musicDownloadData);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        b.a(this.f107901d, this.f107900c);
        long j7 = this.f107899b.sid;
        Xz0.d dVar = Xz0.d.f28458a;
        String string = Long.valueOf(j7).toString();
        dVar.getClass();
        Xz0.d.y("editor", "error", "bgm", string, "get play url failed");
    }
}
