package com.bilibili.music.podcast.fragment;

import com.bapis.bilibili.app.listener.v1.PlayHistoryResp;
import com.bilibili.music.podcast.data.i;
import com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/a.class */
public final class a extends com.bilibili.music.podcast.moss.a<i, PlayHistoryResp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MusicPodcastHistoryFragment f66805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MusicPodcastHistoryFragment.a<i> f66808e;

    public a(MusicPodcastHistoryFragment musicPodcastHistoryFragment, boolean z6, int i7, MusicPodcastHistoryFragment.a<i> aVar) {
        this.f66805b = musicPodcastHistoryFragment;
        this.f66806c = z6;
        this.f66807d = i7;
        this.f66808e = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.music.podcast.data.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.bilibili.music.podcast.data.i] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // com.bilibili.music.podcast.moss.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.music.podcast.data.i d(com.bapis.bilibili.app.listener.v1.PlayHistoryResp r6) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.a.d(java.lang.Object):java.lang.Object");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66805b;
        return musicPodcastHistoryFragment.isDetached() || musicPodcastHistoryFragment.activityDie();
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Object obj) {
        this.f66808e.onDataSuccess((i) obj);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f66808e.onError();
    }
}
