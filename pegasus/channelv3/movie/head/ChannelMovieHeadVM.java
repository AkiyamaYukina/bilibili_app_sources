package com.bilibili.pegasus.channelv3.movie.head;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bapis.bilibili.app.interfaces.v1.MediaCommentReply;
import com.bapis.bilibili.app.interfaces.v1.MediaTabReply;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.channelv3.utils.ChannelStatus;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import to0.AbstractC8675a;
import yo0.C9069c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/ChannelMovieHeadVM.class */
@StabilityInferred(parameters = 0)
public final class ChannelMovieHeadVM extends AbstractC8675a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MediaCommentReply f75381c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f75379a = "ChannelMovieHeadVM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75380b = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f75382d = new c(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final o f75383e = new o(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final p f75384f = new p(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<C9069c<MediaTabReply>> f75385g = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<c> h = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<o> f75386i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<Boolean>> f75387j = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<p> f75388k = new MutableLiveData<>();

    @Override // to0.AbstractC8675a
    public final boolean I0() {
        C9069c<MediaTabReply> value = this.f75385g.getValue();
        return (value != null ? value.f129754a : null) == ChannelStatus.SUCCESS;
    }

    @Override // to0.AbstractC8675a
    public final void J0(@NotNull Map<String, String> map) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieHeadVM$loadHeader$1(this, map, null), 3, (Object) null);
    }
}
