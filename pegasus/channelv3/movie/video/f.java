package com.bilibili.pegasus.channelv3.movie.video;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/f.class */
@StabilityInferred(parameters = 0)
public final class f extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f75501c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75505g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75499a = "ChannelMovieVideoVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75500b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f75502d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f75503e = "";

    @NotNull
    public PegasusInlineSwitchState h = PegasusInlineSwitchState.ALL_NETWORK;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f75506i = new a(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f75507j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> f75508k = new MutableLiveData<>();

    public final void refresh() {
        Resource<Pair<Boolean, List<BasicIndexItem>>> value = this.f75508k.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            BLog.i(this.f75499a, "can not refresh.");
            return;
        }
        this.f75504f = true;
        a aVar = this.f75506i;
        aVar.f75492d = "";
        aVar.f75493e = true;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieVideoVM$load$1(this, null), 3, (Object) null);
    }
}
