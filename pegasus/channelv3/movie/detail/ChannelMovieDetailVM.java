package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailVM.class */
@StabilityInferred(parameters = 0)
public final class ChannelMovieDetailVM extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f75352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f75354e;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75350a = "ChannelMovieDetailVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f75351b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75355f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75356g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<d>> f75357i = new MutableLiveData<>();

    public final void I0() {
        Resource<d> value = this.f75357i.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            return;
        }
        this.h = true;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieDetailVM$loadDetail$1(this, null), 3, (Object) null);
    }
}
