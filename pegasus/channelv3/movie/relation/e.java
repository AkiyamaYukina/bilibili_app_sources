package com.bilibili.pegasus.channelv3.movie.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv3.movie.ChannelMoviePV;
import com.bilibili.pegasus.channelv3.movie.ChannelMovieSpmid;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/e.class */
@StabilityInferred(parameters = 0)
public class e extends ViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f75471e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75474i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75467a = "ChannelMovieRelationVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ChannelMovieSpmid f75468b = ChannelMovieSpmid.CHANNEL_MOVIE_RELATION_SPMID;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ChannelMoviePV f75469c = ChannelMoviePV.CHANNEL_MOVIE_RELATION_PV;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75470d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f75472f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f75473g = "";

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f75475j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final d f75476k = new d(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f75477l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> f75478m = new MutableLiveData<>();

    public final void refresh() {
        Resource<Pair<Boolean, List<BasicIndexItem>>> value = this.f75478m.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            BLog.i(this.f75467a, "can not refresh.");
            return;
        }
        this.f75474i = true;
        d dVar = this.f75476k;
        dVar.f75464d = "";
        dVar.f75465e = true;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieRelationVM$load$1(this, null), 3, (Object) null);
    }
}
