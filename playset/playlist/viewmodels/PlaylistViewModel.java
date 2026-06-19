package com.bilibili.playset.playlist.viewmodels;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.playlist.entity.MediaId;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import u1.C8707a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel.class */
@StabilityInferred(parameters = 0)
public final class PlaylistViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ArrayList<MultitypeMedia>> f85526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<MultitypePlaylist.Info> f85527g;

    @NotNull
    public final MutableLiveData<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<a> f85529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Bundle> f85533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f85535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f85537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ArrayList<List<MediaId>> f85539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f85540u;

    public PlaylistViewModel(@NotNull Application application) {
        super(application);
        this.f85522b = 1;
        this.f85523c = 1;
        this.f85524d = 1;
        this.f85525e = 1;
        this.f85526f = new MutableLiveData<>();
        this.f85527g = new MutableLiveData<>();
        this.h = new MutableLiveData<>();
        this.f85528i = new MutableLiveData<>();
        this.f85529j = new MutableLiveData<>();
        this.f85530k = new MutableLiveData<>();
        new MutableLiveData();
        new MutableLiveData();
        this.f85531l = new MutableLiveData<>();
        this.f85532m = new MutableLiveData<>();
        this.f85533n = new MutableLiveData<>();
        this.f85534o = new MutableLiveData<>();
        this.f85535p = new MutableLiveData<>();
        this.f85536q = new MutableLiveData<>();
        this.f85537r = new CompositeDisposable();
        this.f85538s = true;
        this.f85539t = new ArrayList<>();
        this.f85540u = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void I0(long j7, long j8, boolean z6) {
        int i7 = this.f85522b - 1;
        String strP = i7 < this.f85539t.size() ? CollectionsKt.p(this.f85539t.get(i7), ",", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30) : "";
        if (strP.length() == 0) {
            this.f85531l.setValue(Integer.valueOf(z6 ? 2 : 0));
        } else {
            ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).batchQueryMediasInfo(strP, j8, j7).enqueue(new f(this));
        }
    }

    public final void J0(long j7) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModel$clearOfflineMedias$1(this, j7, null), 3, (Object) null);
    }

    public final void K0(int i7, long j7, long j8, @NotNull String str) {
        MutableLiveData<Bundle> mutableLiveData = this.f85533n;
        Bundle bundle = new Bundle();
        bundle.putInt("loading_status", -1);
        mutableLiveData.setValue(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(j7);
        String strA = C8707a.a(i7, ":", sb);
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).deleteMedia(strA, Long.toString(j8)).enqueue(new g(this, str, j7, i7));
    }

    public final void L0(long j7, @NotNull String str) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModel$sortMedias$1(str, j7, this, null), 3, (Object) null);
    }
}
