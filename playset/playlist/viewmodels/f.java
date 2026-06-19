package com.bilibili.playset.playlist.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.MultitypeMedia;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/f.class */
public final class f extends BiliApiDataCallback<ArrayList<MultitypeMedia>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85577b;

    public f(PlaylistViewModel playlistViewModel) {
        this.f85577b = playlistViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ArrayList<MultitypeMedia> arrayList) {
        ArrayList<MultitypeMedia> arrayList2 = arrayList;
        PlaylistViewModel playlistViewModel = this.f85577b;
        Integer value = playlistViewModel.f85531l.getValue();
        if ((value != null && value.intValue() == 3) || arrayList2 == null) {
            return;
        }
        playlistViewModel.f85526f.setValue(arrayList2);
        boolean zIsEmpty = arrayList2.isEmpty();
        MutableLiveData<Integer> mutableLiveData = playlistViewModel.f85531l;
        if (!zIsEmpty) {
            mutableLiveData.setValue(0);
            playlistViewModel.f85522b++;
        } else if (playlistViewModel.f85522b > 1) {
            playlistViewModel.f85532m.setValue(1);
        } else {
            mutableLiveData.setValue(2);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaylistViewModel playlistViewModel = this.f85577b;
        if (playlistViewModel.f85522b > 1) {
            playlistViewModel.f85532m.setValue(2);
        } else {
            playlistViewModel.f85531l.setValue(3);
        }
    }
}
