package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.playlist.entity.MediaId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/m.class */
public final class m extends BiliApiDataCallback<List<? extends MediaId>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85592b;

    public m(PlaylistViewModel playlistViewModel) {
        this.f85592b = playlistViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(List<? extends MediaId> list) {
        List<? extends MediaId> list2 = list;
        if (list2 != null) {
            PlaylistViewModel playlistViewModel = this.f85592b;
            playlistViewModel.f85523c++;
            if (playlistViewModel.f85539t.size() < 1) {
                return;
            }
            ArrayList<List<MediaId>> arrayList = playlistViewModel.f85539t;
            List<MediaId> listRemove = arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listRemove);
            arrayList2.addAll(list2);
            playlistViewModel.f85539t.addAll(CollectionsKt.chunked(arrayList2, 40));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
    }
}
