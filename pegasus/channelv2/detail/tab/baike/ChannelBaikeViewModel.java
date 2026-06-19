package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeFeedReq;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeInfo;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigationItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigationReq;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeTree;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeTreePart;
import com.bilibili.search2.api.SearchBangumiItem;
import fo0.C7131a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeViewModel.class */
@StabilityInferred(parameters = 0)
public final class ChannelBaikeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75076a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75079d;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f75091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f75092r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f75077b = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75080e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public PegasusInlineSwitchState f75081f = PegasusInlineSwitchState.ALL_NETWORK;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C7131a f75082g = new C7131a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ChannelBaikeNavigationReq f75083i = new ChannelBaikeNavigationReq(0, 1, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ChannelBaikeFeedReq f75084j = new ChannelBaikeFeedReq(0, 0, 0, null, null, null, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<List<ChannelBaikeNavigationItem>>> f75085k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<Pair<Long, List<FeedItem>>>> f75086l = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<List<FeedItem>>> f75087m = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Resource<List<FeedItem>>> f75088n = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ChannelBaikeTree> f75089o = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ChannelBaikeInfo> f75090p = new MutableLiveData<>();

    public ChannelBaikeViewModel() {
        Boolean bool = Boolean.TRUE;
        this.f75091q = new MutableLiveData<>(bool);
        this.f75092r = new MutableLiveData<>(bool);
    }

    @Nullable
    public final Long I0(int i7) {
        List list;
        ChannelBaikeNavigationItem channelBaikeNavigationItem;
        Resource<List<ChannelBaikeNavigationItem>> value = this.f75085k.getValue();
        return (value == null || (list = (List) value.getData()) == null || (channelBaikeNavigationItem = (ChannelBaikeNavigationItem) CollectionsKt.getOrNull(list, i7)) == null) ? null : Long.valueOf(channelBaikeNavigationItem.getNid());
    }

    @Nullable
    public final Integer J0(@Nullable Long l7) {
        List<ChannelBaikeTreePart> treePart;
        ChannelBaikeTree value = this.f75089o.getValue();
        return (value == null || (treePart = value.getTreePart()) == null) ? null : Integer.valueOf(ListExtentionsKt.takeItemIndex(treePart, new C61.a(l7, 3)));
    }

    public final void K0() {
        if (Intrinsics.areEqual(this.f75092r.getValue(), Boolean.FALSE)) {
            return;
        }
        MutableLiveData<Resource<List<FeedItem>>> mutableLiveData = this.f75088n;
        Resource<List<FeedItem>> value = mutableLiveData.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            return;
        }
        mutableLiveData.setValue(Resource.a.c(Resource.Companion));
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.h = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelBaikeViewModel$loadMoreFeedIfCould$1(this, null), 3, (Object) null);
    }

    public final void L0() {
        MutableLiveData<Resource<List<ChannelBaikeNavigationItem>>> mutableLiveData = this.f75085k;
        Resource<List<ChannelBaikeNavigationItem>> value = mutableLiveData.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            return;
        }
        mutableLiveData.setValue(Resource.a.c(Resource.Companion));
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.h = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelBaikeViewModel$loadNavigation$1(this, null), 3, (Object) null);
    }

    public final void M0() {
        if (Intrinsics.areEqual(this.f75091q.getValue(), Boolean.FALSE)) {
            return;
        }
        MutableLiveData<Resource<List<FeedItem>>> mutableLiveData = this.f75087m;
        Resource<List<FeedItem>> value = mutableLiveData.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            return;
        }
        mutableLiveData.setValue(Resource.a.c(Resource.Companion));
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.h = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelBaikeViewModel$loadPreFeedIfCould$1(this, null), 3, (Object) null);
    }

    public final void N0(long j7) {
        MutableLiveData<Resource<Pair<Long, List<FeedItem>>>> mutableLiveData = this.f75086l;
        Resource<Pair<Long, List<FeedItem>>> value = mutableLiveData.getValue();
        if ((value != null ? value.getStatus() : null) == Status.LOADING) {
            return;
        }
        mutableLiveData.setValue(Resource.a.c(Resource.Companion));
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.h = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ChannelBaikeViewModel$reloadFeed$1(this, j7, null), 3, (Object) null);
    }
}
