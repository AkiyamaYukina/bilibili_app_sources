package com.bilibili.search2.discover;

import Ps0.F;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.search2.api.NegativeFeedback;
import com.bilibili.search2.api.SearchReferral;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/o.class */
public final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f86452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<F> f86453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f86454c;

    public o(p pVar) {
        this.f86454c = pVar;
    }

    @Override // com.bilibili.search2.discover.k
    public final void a(List<F> list) {
        this.f86453b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.search2.discover.k
    public final void b(List<SearchReferral.Guess> list) {
        p pVar = this.f86454c;
        MutableLiveData<h> mutableLiveData = pVar.f86455a;
        MutableLiveData mutableLiveData2 = pVar.f86456b;
        h hVar = (h) mutableLiveData2.getValue();
        NegativeFeedback negativeFeedback = null;
        String str = hVar != null ? hVar.f86436b : null;
        h hVar2 = (h) mutableLiveData2.getValue();
        if (hVar2 != null) {
            negativeFeedback = hVar2.f86437c;
        }
        mutableLiveData.setValue(new h(list, str, negativeFeedback));
    }

    @Override // com.bilibili.search2.discover.k
    public final void c() {
        this.f86452a = true;
    }

    @Override // com.bilibili.search2.discover.k
    public final boolean d() {
        return this.f86452a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.search2.discover.k
    public final void e(List<F> list) {
        p pVar = this.f86454c;
        MutableLiveData<i> mutableLiveData = pVar.f86457c;
        MutableLiveData mutableLiveData2 = pVar.f86458d;
        i iVar = (i) mutableLiveData2.getValue();
        String str = iVar != null ? iVar.f86441b : null;
        i iVar2 = (i) mutableLiveData2.getValue();
        mutableLiveData.setValue(new i(list, str, iVar2 != null ? iVar2.f86442c : false, null, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.search2.discover.k
    public final void f(List<SearchSquareType> list) {
        p pVar = this.f86454c;
        pVar.f86461g = list;
        for (SearchSquareType searchSquareType : list) {
            try {
                String type = searchSquareType.getType();
                String title = searchSquareType.getTitle();
                List<?> list2 = searchSquareType.getList();
                if (Intrinsics.areEqual(SquareTypes.TRENDING.getType(), type)) {
                    pVar.f86459e.setValue(new l(list2, title, searchSquareType.getSearchRankingMeta()));
                } else if (Intrinsics.areEqual(SquareTypes.RECOMMEND.getType(), type)) {
                    com.bilibili.search2.stardust.expose.a.a(searchSquareType.getBoardExpandTimeMs(), searchSquareType.getBoardCloseTimeMs());
                    pVar.f86455a.setValue(new h(list2, title, searchSquareType.getNegativeFeedback()));
                } else if (Intrinsics.areEqual(SquareTypes.HISTORY.getType(), type)) {
                    if (list2 != null) {
                        if ((!list2.isEmpty() ? list2 : null) != null) {
                            pVar.f86457c.setValue(new i(list2, title, searchSquareType.getSearchButtonOptWithSort(), null, 24));
                        }
                    }
                    i iVar = (i) pVar.f86458d.getValue();
                    searchSquareType.setList(iVar != null ? iVar.f86440a : null);
                }
            } catch (ClassCastException e7) {
                BLog.e(e7.getMessage());
            }
        }
    }

    @Override // com.bilibili.search2.discover.k
    public final List<F> getHistoryList() {
        return this.f86453b;
    }
}
