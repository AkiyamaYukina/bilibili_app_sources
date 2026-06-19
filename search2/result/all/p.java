package com.bilibili.search2.result.all;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchVideoItem;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.base.SearchState;
import dt0.AbstractC6843f;
import dt0.C6846i;
import dt0.InterfaceC6847j;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/p.class */
@StabilityInferred(parameters = 0)
public class p extends com.bilibili.search2.result.base.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BaseFragment f87307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Z7.g f87308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6846i f87309g;

    @NotNull
    public final Os0.f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f87310i;

    /* JADX WARN: Illegal instructions before constructor call */
    public p(BaseFragment baseFragment, Function1 function1, int i7) {
        function1 = (i7 & 2) != 0 ? new J9.c(2) : function1;
        if (q.f87311e == null) {
            synchronized (q.class) {
                try {
                    if (q.f87311e == null) {
                        q.f87311e = new q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q qVar = q.f87311e;
        super(function1);
        this.f87307e = baseFragment;
        this.f87308f = qVar;
        this.f87309g = (C6846i) new ViewModelProvider(baseFragment).get(C6846i.class);
        this.h = new Os0.f(baseFragment.getLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.search2.result.base.w, com.bilibili.search2.result.all.AbstractC6048b
    /* JADX INFO: renamed from: T */
    public void O(@NotNull AbstractC6843f<BaseSearchItem> abstractC6843f, int i7) {
        BaseSearchItem baseSearchItemQ = Q(i7);
        if (baseSearchItemQ == null) {
            return;
        }
        if (Intrinsics.areEqual(baseSearchItemQ.getGoTo(), "av")) {
            if (!(baseSearchItemQ instanceof SearchVideoItem)) {
                return;
            }
            SearchVideoItem searchVideoItem = (SearchVideoItem) baseSearchItemQ;
            searchVideoItem.setArea("info");
            searchVideoItem.setEventId("flow.search-list-result.card-field.0.click");
        }
        InterfaceC6847j interfaceC6847j = abstractC6843f instanceof InterfaceC6847j ? (InterfaceC6847j) abstractC6843f : null;
        if (interfaceC6847j != null) {
            interfaceC6847j.h(this.f87310i);
        }
        super.O(abstractC6843f, i7);
    }

    @Override // com.bilibili.search2.result.base.w, com.bilibili.search2.result.all.AbstractC6048b, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final AbstractC6843f onCreateViewHolder(int i7, @NotNull ViewGroup viewGroup) {
        AbstractC6843f abstractC6843fOnCreateViewHolder = super.onCreateViewHolder(i7, viewGroup);
        abstractC6843fOnCreateViewHolder.bindFragment(this.f87307e);
        return abstractC6843fOnCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.search2.result.base.w, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@NotNull AbstractC6843f<BaseSearchItem> abstractC6843f) {
        super.onViewAttachedToWindow(abstractC6843f);
        if (abstractC6843f instanceof Os0.a) {
            Os0.a aVar = (Os0.a) abstractC6843f;
            Os0.f fVar = this.h;
            fVar.getClass();
            aVar.visible();
            aVar.attach();
            if (fVar.f18033c) {
                aVar.startScroll();
            }
            ((ArrayList) fVar.f18032b).add(aVar);
        }
        abstractC6843f.onAttachedToWindow();
        if (abstractC6843f.getBindingAdapterPosition() == 7) {
            BaseFragment baseFragment = this.f87307e;
            LifecycleCoroutineScope lifecycleScope = null;
            SearchResultAllFragment searchResultAllFragment = baseFragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) baseFragment : null;
            if (searchResultAllFragment == null || !((SearchState) ((SearchResultAllViewModel) searchResultAllFragment.rf()).f87499f.getValue()).getEnableRefresh()) {
                return;
            }
            View view = searchResultAllFragment.getView();
            View rootView = view != null ? view.getRootView() : null;
            Context context = searchResultAllFragment.getContext();
            FragmentActivity fragmentActivityP3 = searchResultAllFragment.p3();
            if (fragmentActivityP3 != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivityP3);
            }
            if (rootView == null || context == null || lifecycleScope == null) {
                return;
            }
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SearchResultAllAdapter$tryToShowGuidePopup$1$1$1(context, this, rootView, searchResultAllFragment, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    @Nullable
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public AbstractC6843f P(int i7, @NotNull ViewGroup viewGroup) {
        if (GAdBizKt.getGAdSearch().isAdViewType(i7)) {
            return new Ys0.g(GAdBizKt.getGAdSearch().getAdView(viewGroup, i7, new C6060n(this)), new HH.B(this, 2));
        }
        T7.a.a(i7, "createHolder auto gen failed!!! viewType=", "SearchResultAllAdapter");
        int i8 = C6053g.f87282b;
        return C6053g.a.a(viewGroup);
    }

    public final void a0(boolean z6) {
        this.h.a(z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.h.f18035e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.h.f18035e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        ExposeItem exposeItem = (AbstractC6843f) viewHolder;
        super.onViewDetachedFromWindow(exposeItem);
        exposeItem.onDetachedFromWindow();
        if (exposeItem instanceof Os0.a) {
            Os0.a aVar = (Os0.a) exposeItem;
            Os0.f fVar = this.h;
            fVar.getClass();
            aVar.invisible();
            aVar.detach();
            ((ArrayList) fVar.f18032b).remove(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC6843f abstractC6843f = (AbstractC6843f) viewHolder;
        super.onViewRecycled(abstractC6843f);
        abstractC6843f.onRecycled();
    }
}
