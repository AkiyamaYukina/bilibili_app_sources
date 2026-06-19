package com.bilibili.pegasus.verticaltab;

import G3.r;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.verticaltab.api.model.EmptyItem;
import com.bilibili.pegasus.verticaltab.api.model.FooterLoadingItem;
import com.bilibili.pegasus.verticaltab.api.model.VerticalTabConfig;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/l.class */
@StabilityInferred(parameters = 0)
public final class l extends ViewModel {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f78981i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Sp0.a f78974a = new Sp0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Tp0.b f78975b = new Tp0.b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BasicIndexItem>> f78976c = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Tp0.a<Integer>> f78977d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<VerticalTabConfig> f78978e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f78979f = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f78980g = LazyKt.lazy(new B21.k(9));

    @NotNull
    public final Lazy h = LazyKt.lazy(new r(8));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final i f78982j = new i(this, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f78983k = new a(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final j f78984l = new j(this, 0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/l$a.class */
    public static final class a extends com.bilibili.pegasus.utils.k<VideoStatusMessage, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f78985a;

        public a(l lVar) {
            this.f78985a = lVar;
        }

        @Override // com.bilibili.pegasus.utils.k
        public final void a(Map<Long, VideoStatusMessage> map) {
            Sequence sequenceAsSequence;
            HashMap map2 = new HashMap();
            l lVar = this.f78985a;
            List<BasicIndexItem> value = lVar.f78976c.getValue();
            if (value != null && (sequenceAsSequence = CollectionsKt.asSequence(value)) != null) {
                int i7 = 0;
                for (Object obj : sequenceAsSequence) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Fn0.g gVar = (BasicIndexItem) obj;
                    Fn0.g gVar2 = gVar instanceof Fn0.g ? gVar : null;
                    if (gVar2 != null) {
                        VideoStatusMessage videoStatusMessage = (VideoStatusMessage) ((HashMap) map).get(Long.valueOf(gVar2.getAid()));
                        if (videoStatusMessage != null) {
                            map2.put(Integer.valueOf(i7), videoStatusMessage);
                            gVar2.updateByMsg(videoStatusMessage);
                        }
                    }
                    i7++;
                }
            }
            lVar.J0();
        }
    }

    public final void I0(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        MutableLiveData<List<BasicIndexItem>> mutableLiveData = this.f78976c;
        List<BasicIndexItem> value = mutableLiveData.getValue();
        if (value == null || value.isEmpty()) {
            List<BasicIndexItem> value2 = mutableLiveData.getValue();
            if (value2 != null) {
                value2.add((EmptyItem) this.h.getValue());
            }
        } else {
            List<BasicIndexItem> value3 = mutableLiveData.getValue();
            if (value3 != null && (CollectionsKt.last(value3) instanceof FooterLoadingItem)) {
                value3.remove(CollectionsKt.getLastIndex(value3));
            }
            List<BasicIndexItem> value4 = mutableLiveData.getValue();
            if (!((value4 != null ? (BasicIndexItem) CollectionsKt.getOrNull(value4, 0) : null) instanceof EmptyItem)) {
                this.f78977d.setValue(new Tp0.a<>(2131845224));
            }
        }
        J0();
    }

    public final void J0() {
        MutableLiveData<List<BasicIndexItem>> mutableLiveData = this.f78976c;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    public final void refresh() {
        Job job = this.f78981i;
        boolean z6 = job != null && true == job.isActive();
        Tp0.b bVar = this.f78975b;
        if (z6 && bVar.f24216a) {
            return;
        }
        Job job2 = this.f78981i;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        bVar.f24216a = true;
        bVar.f24217b = 0;
        this.f78981i = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new VerticalTabViewModel$load$1(this, null), 3, (Object) null);
    }
}
