package com.bilibili.ogv.misc.editorrecommend;

import Nl0.e;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerToolbarFragment;
import com.bilibili.ogv.misc.editorrecommend.BangumiEditorRecommendFragment;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.rxjava.c;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import ok0.d;
import ok0.f;
import tv.danmaku.bili.widget.SpacesItemDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiEditorRecommendFragment.class */
public class BangumiEditorRecommendFragment extends BaseSwipeRecyclerToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f68984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f68985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f68986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68987e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f68988f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f68989g = false;
    public f h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiEditorRecommendFragment$a.class */
    public final class a extends SpacesItemDecoration {
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            if (((LinearLayoutManager) recyclerView.getLayoutManager()).getItemViewType(view) == tv.danmaku.bili.widget.section.adapter.a.TYPE_CONTENT_LOAD_MORE) {
                rect.bottom = 0;
                rect.top = 0;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiEditorRecommendFragment$b.class */
    public final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiEditorRecommendFragment f68990b;

        public b(BangumiEditorRecommendFragment bangumiEditorRecommendFragment) {
            this.f68990b = bangumiEditorRecommendFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            this.f68990b.of(true);
        }
    }

    public final void of(final boolean z6) {
        long j7;
        Single<List<BangumiRecommend>> editorRecommendList;
        if (this.f68987e) {
            return;
        }
        if (z6 && this.f68988f) {
            return;
        }
        this.f68988f = false;
        if (!z6 || this.f68984b.getItemCount() <= 1) {
            j7 = 0;
        } else {
            d dVar = this.f68984b;
            BangumiRecommend bangumiRecommend = null;
            if (dVar.getItemCount() > 1) {
                int itemCount = dVar.getItemCount();
                List<BangumiRecommend> list = dVar.f124737f;
                bangumiRecommend = list == null ? null : (BangumiRecommend) ((ArrayList) list).get(itemCount - 2);
            }
            j7 = bangumiRecommend.f68992b;
        }
        this.f68987e = true;
        this.f68984b.showFooterLoading();
        if (this.f68989g) {
            if (this.h == null) {
                this.h = (f) ServiceGenerator.createRetrofitBuilder().baseUrl("https://bangumi.bilibili.com").build().create(f.class);
            }
            editorRecommendList = this.h.getEditorRecommendFall(j7, this.f68985c);
        } else {
            if (this.h == null) {
                this.h = (f) ServiceGenerator.createRetrofitBuilder().baseUrl("https://bangumi.bilibili.com").build().create(f.class);
            }
            editorRecommendList = this.h.getEditorRecommendList(j7, 1);
        }
        c.a(editorRecommendList.subscribe(new Consumer(this, z6) { // from class: ok0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiEditorRecommendFragment f124731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f124732b;

            {
                this.f124731a = this;
                this.f124732b = z6;
            }

            public final void accept(Object obj) {
                List list2 = (List) obj;
                BangumiEditorRecommendFragment bangumiEditorRecommendFragment = this.f124731a;
                bangumiEditorRecommendFragment.setRefreshCompleted();
                bangumiEditorRecommendFragment.f68987e = false;
                bangumiEditorRecommendFragment.hideErrorTips();
                if (list2 == null || list2.size() <= 0) {
                    bangumiEditorRecommendFragment.f68988f = true;
                    bangumiEditorRecommendFragment.f68984b.showFooterEmpty();
                    return;
                }
                d dVar2 = bangumiEditorRecommendFragment.f68984b;
                if (!this.f124732b) {
                    ((ArrayList) dVar2.f124737f).clear();
                }
                ((ArrayList) dVar2.f124737f).addAll(list2);
                dVar2.notifySectionData();
                bangumiEditorRecommendFragment.f68984b.hideFooter();
            }
        }, new Consumer(this) { // from class: ok0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiEditorRecommendFragment f124733a;

            {
                this.f124733a = this;
            }

            public final void accept(Object obj) {
                BangumiEditorRecommendFragment bangumiEditorRecommendFragment = this.f124733a;
                bangumiEditorRecommendFragment.setRefreshCompleted();
                bangumiEditorRecommendFragment.f68987e = false;
                if (bangumiEditorRecommendFragment.f68984b.getItemCount() > 1) {
                    bangumiEditorRecommendFragment.f68984b.showFooterError();
                } else {
                    bangumiEditorRecommendFragment.showErrorTips();
                    bangumiEditorRecommendFragment.f68984b.hideFooter();
                }
            }
        }), getLifecycle());
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerToolbarFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        of(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("SAVED_RECOMMENDS", new ArrayList<>(this.f68984b.f124737f));
        bundle.putString("title", this.f68986d);
        bundle.putString("wid", this.f68985c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter, ok0.d] */
    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerToolbarFragment
    public final void onViewCreated(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.onViewCreated(recyclerView, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        recyclerView.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.Ga1_s));
        recyclerView.setLayoutManager(linearLayoutManager);
        ?? dVar = new d();
        this.f68984b = dVar;
        recyclerView.setAdapter(dVar);
        if (bundle != null) {
            this.f68986d = bundle.getString("title", getString(2131821872));
            this.f68985c = bundle.getString("wid");
            this.f68989g = !TextUtils.isEmpty(r0);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("SAVED_RECOMMENDS");
            d dVar2 = this.f68984b;
            ((ArrayList) dVar2.f124737f).clear();
            ((ArrayList) dVar2.f124737f).addAll(parcelableArrayList);
            dVar2.notifySectionData();
        } else {
            this.f68986d = getArguments().getString("title", getString(2131821872));
            this.f68985c = getArguments().getString("wid");
            this.f68989g = !TextUtils.isEmpty(r0);
            of(false);
        }
        setTitle(this.f68986d);
        recyclerView.addItemDecoration(new SpacesItemDecoration((int) ((((double) getResources().getDimensionPixelSize(2131166076)) * 1.5d) - ((double) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics())))));
        recyclerView.addOnScrollListener(new b(this));
    }
}
