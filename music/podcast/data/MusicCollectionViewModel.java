package com.bilibili.music.podcast.data;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.music.podcast.collection.api.PlaySetGroups;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicCollectionViewModel.class */
public final class MusicCollectionViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, PlaySetGroups>> f66418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, String>> f66419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Bundle>> f66420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f66421e;

    public MusicCollectionViewModel(@NotNull Application application) {
        super(application);
        this.f66418b = new MutableLiveData<>();
        this.f66419c = new MutableLiveData<>();
        this.f66420d = new MutableLiveData<>();
        new MutableLiveData();
        new MutableLiveData();
        this.f66421e = new MutableLiveData<>();
    }

    public final void I0(long j7) {
        this.f66419c.setValue(TuplesKt.to(0, (Object) null));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MusicCollectionViewModel$clearInvalidData$1(j7, this, null), 3, (Object) null);
    }

    public final void J0(long j7, @NotNull String str) {
        this.f66421e.setValue(0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MusicCollectionViewModel$sortData$1(str, j7, this, null), 3, (Object) null);
    }
}
