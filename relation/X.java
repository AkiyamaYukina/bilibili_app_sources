package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.fastjson.JSON;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.history.ui.HistoryContentFragment;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.relation.api.RelationApiCallback;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.api.ResponseChangeRelation;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/X.class */
@StabilityInferred(parameters = 0)
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<Long, Pair<Y, Integer>> f85989b = new TreeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Map<Long, Pair<Y, Integer>>> f85990c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/X$a.class */
    public static final class a implements RelationApiCallback<ResponseChangeRelation> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f85991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f85993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Fragment f85995e;

        public a(X x6, long j7, boolean z6, int i7, Fragment fragment) {
            this.f85991a = x6;
            this.f85992b = j7;
            this.f85993c = z6;
            this.f85994d = i7;
            this.f85995e = fragment;
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final boolean isCancel() {
            return this.f85995e.isDetached();
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onDataSuccess(ResponseChangeRelation responseChangeRelation) {
            this.f85991a.a(new Y(Status.SUCCESS, this.f85992b, !this.f85993c, null, this.f85994d));
        }

        @Override // com.bilibili.relation.api.RelationApiCallback
        public final void onError(Throwable th) {
            Throwable biliApiException = th;
            if (th == null) {
                biliApiException = new BiliApiException();
            }
            this.f85991a.a(new Y(Status.ERROR, this.f85992b, this.f85993c, biliApiException, this.f85994d));
        }
    }

    public X(@NotNull HistoryContentFragment historyContentFragment, @NotNull HistoryContentFragment.d dVar) {
        MutableLiveData<Map<Long, Pair<Y, Integer>>> mutableLiveData = new MutableLiveData<>();
        this.f85990c = mutableLiveData;
        mutableLiveData.observe(historyContentFragment, new V(dVar));
    }

    public final void a(Y y6) {
        this.f85988a++;
        ((TreeMap) this.f85989b).put(Long.valueOf(y6.f85997b), new Pair(y6, Integer.valueOf(this.f85988a)));
        this.f85990c.postValue(this.f85989b);
    }

    public final void b(@NotNull Fragment fragment, long j7, boolean z6, @Nullable HashMap<String, String> map) {
        Pair pair = (Pair) ((TreeMap) this.f85989b).get(Long.valueOf(j7));
        if (pair != null && ((Y) pair.getFirst()).f85996a == Status.LOADING) {
            a((Y) pair.getFirst());
            return;
        }
        int i7 = z6 ? 2 : 1;
        a(new Y(Status.LOADING, j7, z6, null, i7));
        RelationApiManager.modifyRelation(j7, i7, 230, null, null, "main.my-history.0.0", map != null ? JSON.toJSONString(map) : null, new a(this, j7, z6, i7, fragment));
    }
}
