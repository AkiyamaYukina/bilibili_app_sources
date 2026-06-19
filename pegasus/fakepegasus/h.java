package com.bilibili.pegasus.fakepegasus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pegasus.api.D;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.PegasusFeedResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/h.class */
@StabilityInferred(parameters = 0)
public final class h extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<BasicIndexItem>> f77454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f77455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f77456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f77457d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/h$a.class */
    public static final class a extends BiliApiDataCallback<PegasusFeedResponse> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f77458b;

        public a(h hVar) {
            this.f77458b = hVar;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(PegasusFeedResponse pegasusFeedResponse) {
            ArrayList arrayList;
            Sequence sequenceAsSequence;
            Sequence sequenceFilterNotNull;
            Sequence sequenceFilter;
            PegasusFeedResponse pegasusFeedResponse2 = pegasusFeedResponse;
            List<BasicIndexItem> list = (pegasusFeedResponse2 == null || (arrayList = pegasusFeedResponse2.items) == null || (sequenceAsSequence = CollectionsKt.asSequence(arrayList)) == null || (sequenceFilterNotNull = SequencesKt.filterNotNull(sequenceAsSequence)) == null || (sequenceFilter = SequencesKt.filter(sequenceFilterNotNull, new UD.l(1))) == null) ? null : SequencesKt.toList(sequenceFilter);
            h hVar = this.f77458b;
            hVar.f77454a.setValue(list);
            hVar.f77456c.setValue(Boolean.FALSE);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            h hVar = this.f77458b;
            hVar.f77454a.setValue(null);
            hVar.f77456c.setValue(Boolean.FALSE);
        }
    }

    public h() {
        MutableLiveData<List<BasicIndexItem>> mutableLiveData = new MutableLiveData<>();
        this.f77454a = mutableLiveData;
        this.f77455b = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.f77456c = mutableLiveData2;
        this.f77457d = mutableLiveData2;
    }

    public final void I0(int i7, int i8) {
        this.f77456c.setValue(Boolean.TRUE);
        a aVar = new a(this);
        BiliCall fakePegasusList = ((D) ServiceGenerator.createService(D.class)).getFakePegasusList(i7, i8);
        com.bilibili.pegasus.api.g gVar = new com.bilibili.pegasus.api.g();
        CollectionsKt.e(gVar.a, new com.bilibili.pegasus.api.c[]{new com.bilibili.pegasus.api.a(), new com.bilibili.pegasus.api.a()});
        fakePegasusList.setParser(gVar).enqueue(aVar);
    }
}
