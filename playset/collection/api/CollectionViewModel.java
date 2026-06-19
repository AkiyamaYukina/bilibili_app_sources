package com.bilibili.playset.collection.api;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetGroups;
import com.bilibili.playset.api.PlaySetService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.C8707a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/CollectionViewModel.class */
@StabilityInferred(parameters = 0)
public class CollectionViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, PlaySetGroups>> f84209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, String>> f84210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Bundle>> f84211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Bundle>> f84212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Bundle>> f84213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f84214g;

    public CollectionViewModel(@NotNull Application application) {
        super(application);
        this.f84209b = new MutableLiveData<>();
        this.f84210c = new MutableLiveData<>();
        this.f84211d = new MutableLiveData<>();
        this.f84212e = new MutableLiveData<>();
        this.f84213f = new MutableLiveData<>();
        this.f84214g = new MutableLiveData<>();
    }

    public final void I0(int i7, long j7, @Nullable String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("group_type", i7);
        bundle.putLong("folder_id", j7);
        this.f84212e.setValue(TuplesKt.to(0, bundle));
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).unFavPlaySet(j7, "from_spmid", "main.my-favorite.0.0", str).enqueue(new a(this, bundle));
    }

    public final void J0(int i7, long j7, long j8, @NotNull String str) {
        Bundle bundle = new Bundle();
        bundle.putString("data_key", str);
        bundle.putLong("media_id", j7);
        bundle.putInt("media_type", i7);
        bundle.putLong("group_id", j8);
        this.f84211d.setValue(TuplesKt.to(0, bundle));
        StringBuilder sb = new StringBuilder();
        sb.append(j7);
        String strA = C8707a.a(i7, ":", sb);
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).deleteMedia(strA, Long.toString(j8)).enqueue(new b(this, bundle));
    }

    public final void K0(long j7) {
        this.f84210c.setValue(TuplesKt.to(0, (Object) null));
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new CollectionViewModel$clearInvalidData$1(j7, this, null), 3, (Object) null);
    }

    public final void L0(long j7, @NotNull String str) {
        this.f84214g.setValue(0);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new CollectionViewModel$sortData$1(str, j7, this, null), 3, (Object) null);
    }
}
