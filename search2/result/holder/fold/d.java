package com.bilibili.search2.result.holder.fold;

import Bl.h1;
import Ps0.D;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.MainThread;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import dt0.AbstractC6843f;
import j4.t;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/fold/d.class */
@StabilityInferred(parameters = 0)
public final class d extends AbstractC6843f<D> implements Fi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h1 f88148a;

    public d(@NotNull h1 h1Var) {
        super(h1Var.a);
        this.f88148a = h1Var;
    }

    public final void Q(@NotNull RecyclerView.ViewHolder viewHolder, boolean z6) {
        RecyclerView recyclerView;
        RecyclerView.ItemAnimator itemAnimator;
        t.a("animatorRemoveState: ", "SearchFoldHolder", z6);
        if (z6) {
            return;
        }
        Fragment fragment = getFragment();
        SearchResultAllFragment searchResultAllFragment = fragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment : null;
        if (searchResultAllFragment == null || (recyclerView = searchResultAllFragment.h) == null || (itemAnimator = recyclerView.getItemAnimator()) == null) {
            return;
        }
        itemAnimator.isRunning(new RecyclerView.ItemAnimator.a(this) { // from class: com.bilibili.search2.result.holder.fold.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f88144a;

            {
                this.f88144a = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.a
            public final void a() {
                BLog.i("SearchFoldHolder", "allAnimFinished");
                d dVar = this.f88144a;
                dVar.getClass();
                Fragment fragment2 = dVar.getFragment();
                SearchResultAllFragment searchResultAllFragment2 = fragment2 instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment2 : null;
                if (searchResultAllFragment2 != null) {
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment2.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchFoldHolder$animatorRemoveState$1$1$1(searchResultAllFragment2, null), 3, (Object) null);
                }
            }
        });
    }

    @Override // dt0.AbstractC6839b
    public final void bind() {
        String strTakeIfNotEmpty;
        String title = ((D) getData()).getTitle();
        h1 h1Var = this.f88148a;
        if (title == null || (strTakeIfNotEmpty = ListExtentionsKt.takeIfNotEmpty(title)) == null) {
            h1Var.b.setText(h1Var.a.getContext().getString(2131854777));
        } else {
            h1Var.b.setText(strTakeIfNotEmpty);
        }
        h1Var.a.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.fold.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f88145a;

            {
                this.f88145a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.fold.d, dt0.b, dt0.f] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ?? r02 = this.f88145a;
                String moduleType = r02.getModuleType();
                BaseSearchItem baseSearchItem = (BaseSearchItem) r02.getData();
                String strD = Xs0.b.d((BaseSearchItem) r02.getData(), "fold", null, 2);
                D d7 = (D) r02.getBindData();
                Xs0.b.i("search.search-result.search-card.all.click", null, moduleType, baseSearchItem, null, null, strD, null, null, MapsKt.mapOf(new Pair[]{TuplesKt.to("guide_content", String.valueOf(d7 != null ? d7.getTitle() : null)), TuplesKt.to("param", String.valueOf(((D) r02.getData()).getParam()))}), false, null, 7040);
                Fragment fragment = r02.getFragment();
                SearchResultAllFragment searchResultAllFragment = fragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment : null;
                if (searchResultAllFragment != null) {
                    RecyclerView recyclerView = searchResultAllFragment.h;
                    if ((recyclerView != null ? ListExtentionsKt.getFirstCompleteVisible(recyclerView) : -1) <= r02.getBindingAdapterPosition()) {
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchFoldHolder$doBatchChange$1(r02, searchResultAllFragment, null), 3, (Object) null);
                        return;
                    }
                    Rect rect = new Rect();
                    r02.itemView.getGlobalVisibleRect(rect);
                    int height = (r02.itemView.getHeight() - rect.height()) + 1;
                    int iHeight = rect.height();
                    StringBuilder sb = new StringBuilder("rect:");
                    sb.append(rect);
                    sb.append("  height=");
                    sb.append(iHeight);
                    sb.append(" offset=");
                    Z.b(height, "SearchFoldHolder", sb);
                    RecyclerView recyclerView2 = searchResultAllFragment.h;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollBy(0, -height);
                    }
                    searchResultAllFragment.bg(-height);
                    final SearchResultAllFragment searchResultAllFragment2 = searchResultAllFragment;
                    MainThread.postOnMainThread(new Function0(r02, searchResultAllFragment2) { // from class: com.bilibili.search2.result.holder.fold.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final d f88146a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final SearchResultAllFragment f88147b;

                        {
                            this.f88146a = r02;
                            this.f88147b = searchResultAllFragment2;
                        }

                        public final Object invoke() {
                            SearchResultAllFragment searchResultAllFragment3 = this.f88147b;
                            d dVar = this.f88146a;
                            dVar.getClass();
                            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment3.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchFoldHolder$doBatchChange$1(dVar, searchResultAllFragment3, null), 3, (Object) null);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        });
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        Xs0.b.k("search.search-result.search-card.all.show", getModuleType(), (BaseSearchItem) getData(), Xs0.b.b(((D) getData()).getLinkType(), "fold"), MapsKt.mapOf(TuplesKt.to("param", String.valueOf(((D) getData()).getParam()))), false, null, null, null, 992);
    }
}
