package com.bilibili.ogv.operation.entrance.rank;

import A50.O;
import A50.P;
import Ek0.I;
import Ik0.h;
import Tl0.f;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment;
import com.bilibili.ogv.operation.entrance.rank.BangumiRankFragment;
import com.bilibili.ogv.operation.entrance.rank.BangumiRankInfoVo;
import com.bilibili.ogv.operation.entrance.rank.RankItem;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiRankFragment extends BaseSwipeRecyclerViewFragment implements IPvTracker {
    public int h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70183i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f70184j = "firstVisibleToUser";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Bundle f70185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f70186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public b f70187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ComposeView f70188n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankFragment$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<C0426a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f70189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<String> f70190b;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation.entrance.rank.BangumiRankFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankFragment$a$a.class */
        public final class C0426a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final TextView f70191a;

            public C0426a(@NotNull View view) {
                super(view);
                this.f70191a = (TextView) view.findViewById(2131313979);
            }
        }

        public a(@NotNull Context context, @NotNull List<String> list) {
            this.f70189a = context;
            this.f70190b = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f70190b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            ((C0426a) viewHolder).f70191a.setText(this.f70190b.get(i7));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0426a(LayoutInflater.from(this.f70189a).inflate(2131499653, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankFragment$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BangumiRankFragment f70192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<RankItem> f70194c = new ArrayList();

        public b(@NotNull BangumiRankFragment bangumiRankFragment, int i7) {
            this.f70192a = bangumiRankFragment;
            this.f70193b = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f70194c).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01a5  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            /*
                Method dump skipped, instruction units count: 775
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.rank.BangumiRankFragment.b.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            int i8 = h.f10317c;
            I iInflate = I.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            BangumiRankFragment bangumiRankFragment = this.f70192a;
            iInflate.setLifecycleOwner(bangumiRankFragment);
            return new h(iInflate, bangumiRankFragment);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankFragment$c.class */
    public static final class c extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiRankFragment f70195a;

        public c(BangumiRankFragment bangumiRankFragment) {
            this.f70195a = bangumiRankFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            String str;
            return (i7 != 0 || (str = this.f70195a.f70186l) == null || StringsKt.isBlank(str)) ? 1 : 2;
        }
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment
    public final void addLoadingView(@Nullable ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            this.f70188n = new ComposeView(frameLayout.getContext(), null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ComposeView composeView = this.f70188n;
            if (composeView != null) {
                composeView.setLayoutParams(layoutParams);
            }
            ComposeView composeView2 = this.f70188n;
            if (composeView2 != null) {
                composeView2.setVisibility(8);
            }
            frameLayout.addView(this.f70188n);
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.ranking-pgc.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        if (this.f70185k == null) {
            this.f70185k = new Bundle();
        }
        Bundle bundle = this.f70185k;
        if (bundle != null) {
            bundle.putString("rank_tab", String.valueOf(this.h));
        }
        return this.f70185k;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f70183i = bundle != null ? bundle.getBoolean(this.f70184j) : false;
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final void onRefresh() {
        List<RankItem> list;
        ComposeView composeView;
        super.onRefresh();
        setRefreshStart();
        b bVar = this.f70187m;
        if (bVar != null && (list = bVar.f70194c) != null && ((ArrayList) list).isEmpty() && (composeView = this.f70188n) != null) {
            f.a(composeView);
        }
        Single<BangumiRankInfoVo> rankList = Dk0.b.f2961a.getRankList(this.h, 0);
        Functions.v vVar = Functions.a;
        com.bilibili.okretro.call.rxjava.c.a(rankList.subscribe(new Consumer(this) { // from class: Ik0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRankFragment f10308a;

            {
                this.f10308a = this;
            }

            public final void accept(Object obj) {
                List<RankItem> list2;
                List<RankItem> list3;
                BangumiRankInfoVo bangumiRankInfoVo = (BangumiRankInfoVo) obj;
                BangumiRankFragment bangumiRankFragment = this.f10308a;
                ComposeView composeView2 = bangumiRankFragment.f70188n;
                if (composeView2 != null) {
                    composeView2.setVisibility(8);
                }
                bangumiRankFragment.setRefreshCompleted();
                List<RankItem> list4 = bangumiRankInfoVo.f70198c;
                if (list4.isEmpty()) {
                    ComposeView composeView3 = bangumiRankFragment.f70188n;
                    if (composeView3 != null) {
                        O o7 = new O(bangumiRankFragment, 1);
                        composeView3.setVisibility(0);
                        composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-89638534, true, new Tl0.e(o7, 0)));
                        return;
                    }
                    return;
                }
                BangumiRankFragment.b bVar2 = bangumiRankFragment.f70187m;
                if (bVar2 != null && (list3 = bVar2.f70194c) != null) {
                    ((ArrayList) list3).clear();
                }
                BangumiRankFragment.b bVar3 = bangumiRankFragment.f70187m;
                if (bVar3 != null && (list2 = bVar3.f70194c) != null) {
                    ((ArrayList) list2).addAll(list4);
                }
                BangumiRankFragment.b bVar4 = bangumiRankFragment.f70187m;
                if (bVar4 != null) {
                    bVar4.notifyDataSetChanged();
                }
            }
        }, new Consumer(this) { // from class: Ik0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiRankFragment f10309a;

            {
                this.f10309a = this;
            }

            public final void accept(Object obj) {
                BangumiRankFragment bangumiRankFragment = this.f10309a;
                bangumiRankFragment.setRefreshCompleted();
                bangumiRankFragment.showErrorTips();
            }
        }), getLifecycle());
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(this.f70184j, this.f70183i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    @Override // com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.rank.BangumiRankFragment.onViewCreated(androidx.recyclerview.widget.RecyclerView, android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        super.setUserVisibleCompat(z6);
        if (this.f70183i) {
            this.f70183i = false;
        }
        if (!z6 || (recyclerView = this.f64719f) == null || (adapter = recyclerView.getAdapter()) == null || adapter.getItemCount() != 0) {
            return;
        }
        onRefresh();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment
    public final void showErrorTips() {
        ComposeView composeView = this.f70188n;
        if (composeView != null) {
            f.b(composeView, new P(this, 1));
        }
    }
}
