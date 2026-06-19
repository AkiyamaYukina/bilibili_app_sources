package com.bilibili.search2.discover;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/p.class */
@StabilityInferred(parameters = 0)
public final class p extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<h> f86455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f86456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<i> f86457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f86458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<l> f86459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f86460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public List<SearchSquareType> f86461g;

    @NotNull
    public final MutableSharedFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f86462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<n> f86463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<n> f86464k;

    public p() {
        MutableLiveData<h> mutableLiveData = new MutableLiveData<>();
        this.f86455a = mutableLiveData;
        this.f86456b = mutableLiveData;
        MutableLiveData<i> mutableLiveData2 = new MutableLiveData<>();
        this.f86457c = mutableLiveData2;
        this.f86458d = mutableLiveData2;
        MutableLiveData<l> mutableLiveData3 = new MutableLiveData<>();
        this.f86459e = mutableLiveData3;
        this.f86460f = mutableLiveData3;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default;
        this.f86462i = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<n> MutableStateFlow = StateFlowKt.MutableStateFlow(new n(false, false));
        this.f86463j = MutableStateFlow;
        this.f86464k = FlowKt.asStateFlow(MutableStateFlow);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(FlowLiveDataConversions.a(mutableLiveData2), FlowLiveDataConversions.a(mutableLiveData3), new SearchDiscoverViewModel$observeDataChanges$1(this, null)), new SearchDiscoverViewModel$observeDataChanges$2(this, null)), ViewModelKt.getViewModelScope(this));
    }
}
