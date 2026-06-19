package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.playlist.entity.MediaId;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/j.class */
public final class j extends BiliApiDataCallback<List<? extends MediaId>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f85587e;

    public j(PlaylistViewModel playlistViewModel, boolean z6, long j7, long j8) {
        this.f85584b = playlistViewModel;
        this.f85585c = z6;
        this.f85586d = j7;
        this.f85587e = j8;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(List<? extends MediaId> list) {
        List<? extends MediaId> list2 = list;
        PlaylistViewModel playlistViewModel = this.f85584b;
        Integer value = playlistViewModel.f85531l.getValue();
        if ((value != null && value.intValue() == 3) || list2 == null) {
            return;
        }
        playlistViewModel.f85523c++;
        playlistViewModel.f85539t.clear();
        playlistViewModel.f85539t.addAll(CollectionsKt.chunked(list2, 40));
        playlistViewModel.I0(this.f85586d, this.f85587e, this.f85585c);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaylistViewModel playlistViewModel = this.f85584b;
        if (playlistViewModel.f85522b > 1) {
            playlistViewModel.f85532m.setValue(2);
        } else {
            playlistViewModel.f85531l.setValue(3);
        }
    }
}
