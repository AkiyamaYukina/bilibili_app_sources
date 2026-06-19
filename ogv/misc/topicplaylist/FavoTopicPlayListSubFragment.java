package com.bilibili.ogv.misc.topicplaylist;

import Pa.B;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.ogv.misc.topicplaylist.TopicPlayListVo;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/FavoTopicPlayListSubFragment.class */
@StabilityInferred(parameters = 0)
public final class FavoTopicPlayListSubFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f69619b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f69621d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f69624g;
    public boolean h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f69620c = LazyKt.lazy(new B(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<TopicPlayListVo.TopicPlayListItemVo> f69622e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f69623f = 20;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f69625i = 1;

    public final void kf(final boolean z6) {
        if (this.f69624g || !this.h) {
            return;
        }
        this.f69624g = true;
        if (z6) {
            this.f69625i++;
            c cVar = this.f69621d;
            if (cVar != null) {
                cVar.showFooterLoading();
            }
        } else {
            c cVar2 = this.f69621d;
            if (cVar2 != null && !cVar2.h.isEmpty()) {
                ((ArrayList) cVar2.h).clear();
                cVar2.hideLoadMore();
            }
            this.f69625i = 1;
        }
        RemoteLogicService remoteLogicService = j.f69663a;
        Single<TopicPlayListVo> topicPlayList = j.f69663a.getTopicPlayList(this.f69625i, this.f69623f);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(topicPlayList.subscribe(new Consumer(this, z6) { // from class: com.bilibili.ogv.misc.topicplaylist.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FavoTopicPlayListSubFragment f69650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f69651b;

            {
                this.f69650a = this;
                this.f69651b = z6;
            }

            public final void accept(Object obj) {
                TopicPlayListVo topicPlayListVo = (TopicPlayListVo) obj;
                FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = this.f69650a;
                favoTopicPlayListSubFragment.setRefreshCompleted();
                favoTopicPlayListSubFragment.f69624g = false;
                List<TopicPlayListVo.TopicPlayListItemVo> list = topicPlayListVo.f69629c;
                boolean z7 = this.f69651b;
                if (list == null || list.isEmpty()) {
                    favoTopicPlayListSubFragment.h = false;
                    if (z7) {
                        c cVar3 = favoTopicPlayListSubFragment.f69621d;
                        if (cVar3 != null) {
                            cVar3.showFooterEmpty();
                            return;
                        }
                        return;
                    }
                    c cVar4 = favoTopicPlayListSubFragment.f69621d;
                    if (cVar4 == null || cVar4.h.isEmpty()) {
                        return;
                    }
                    ((ArrayList) cVar4.h).clear();
                    cVar4.hideLoadMore();
                    return;
                }
                favoTopicPlayListSubFragment.h = topicPlayListVo.a();
                if (!z7) {
                    ((ArrayList) favoTopicPlayListSubFragment.f69622e).clear();
                }
                List<TopicPlayListVo.TopicPlayListItemVo> list2 = favoTopicPlayListSubFragment.f69622e;
                ((ArrayList) list2).addAll(topicPlayListVo.f69629c);
                c cVar5 = favoTopicPlayListSubFragment.f69621d;
                if (cVar5 != null) {
                    cVar5.h = favoTopicPlayListSubFragment.f69622e;
                    cVar5.notifySectionData();
                }
                c cVar6 = favoTopicPlayListSubFragment.f69621d;
                if (cVar6 != null) {
                    cVar6.hideFooter();
                }
            }
        }, new Consumer(this, z6) { // from class: com.bilibili.ogv.misc.topicplaylist.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FavoTopicPlayListSubFragment f69652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f69653b;

            {
                this.f69652a = this;
                this.f69653b = z6;
            }

            public final void accept(Object obj) {
                FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = this.f69652a;
                favoTopicPlayListSubFragment.setRefreshCompleted();
                favoTopicPlayListSubFragment.f69624g = false;
                if (this.f69653b) {
                    favoTopicPlayListSubFragment.f69625i--;
                    c cVar3 = favoTopicPlayListSubFragment.f69621d;
                    if (cVar3 != null) {
                        cVar3.showFooterError();
                    }
                }
            }
        }), getLifecycle());
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        View view = this.f69619b;
        if (view == null) {
            this.f69619b = layoutInflater.inflate(2131494738, (ViewGroup) swipeRefreshLayout, false);
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f69619b);
            }
        }
        this.f69621d = new c(requireContext(), this);
        RecyclerView recyclerView = (RecyclerView) this.f69620c.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.f69621d);
            recyclerView.addOnScrollListener(new h(this));
        }
        this.h = true;
        kf(false);
        return this.f69619b;
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        this.h = true;
        kf(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        if (z6) {
            Neurons.reportExposure$default(false, "main.topic.contents.movie.show", (Map) null, (List) null, 12, (Object) null);
            this.f69624g = false;
        }
    }
}
