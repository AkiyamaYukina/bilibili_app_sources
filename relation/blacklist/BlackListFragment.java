package com.bilibili.relation.blacklist;

import KQ0.e;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.authorspace.ui.nft.utils.r;
import com.bilibili.bililive.biz.livehome.indexfeed.ui.live.play.search.LivePlayTogetherSearchFragment;
import com.bilibili.bililive.infra.skadapterext.EmptyViewData;
import com.bilibili.commons.time.FastDateFormat;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.api.Attention;
import com.bilibili.relation.api.AttentionList;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.blacklist.BlackListFragment;
import com.mall.ui.page.home.view.FlingRecyclerView;
import com.mall.ui.page.ip.view.IPGoodsFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import tv.danmaku.bili.ui.garb.api.collection.BiliCollectionGlobalInfoSideBarData;
import tv.danmaku.bili.ui.garb.manager.CollectionSideManager;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListFragment.class */
public class BlackListFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f86024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f86025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LoadingImageView f86026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f86027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f86028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f86029g;
    public final a h = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListFragment$a.class */
    public final class a extends BiliApiDataCallback<AttentionList> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BlackListFragment f86030b;

        public a(BlackListFragment blackListFragment) {
            this.f86030b = blackListFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            BlackListFragment blackListFragment = this.f86030b;
            return !blackListFragment.isAdded() || blackListFragment.isDetached();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(AttentionList attentionList) {
            List<Attention> list;
            AttentionList attentionList2 = attentionList;
            BlackListFragment blackListFragment = this.f86030b;
            if (attentionList2 == null || (list = attentionList2.list) == null || list.size() == 0) {
                LoadingImageView loadingImageView = blackListFragment.f86026d;
                if (loadingImageView != null) {
                    loadingImageView.setRefreshComplete();
                    blackListFragment.f86026d.setImageResource(2131235613);
                    blackListFragment.f86026d.showEmptyTips(2131841371);
                    return;
                }
                return;
            }
            LoadingImageView loadingImageView2 = blackListFragment.f86026d;
            if (loadingImageView2 != null) {
                loadingImageView2.setRefreshComplete();
                blackListFragment.f86026d.setVisibility(8);
            }
            c cVar = blackListFragment.f86025c;
            List<Attention> list2 = attentionList2.list;
            ((ArrayList) cVar.f86034a).clear();
            ((ArrayList) cVar.f86034a).addAll(list2);
            cVar.notifyDataSetChanged();
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            LoadingImageView loadingImageView = this.f86030b.f86026d;
            if (loadingImageView != null) {
                loadingImageView.setRefreshError();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListFragment$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StaticImageView2 f86031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f86032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f86033c;

        public b(View view) {
            super(view);
            this.f86031a = view.findViewById(2131296796);
            this.f86032b = (TextView) view.findViewById(2131304923);
            this.f86033c = (TextView) view.findViewById(2131296669);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListFragment$c.class */
    public static final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86035b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Attention f86036c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Attention> f86034a = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<Attention> list = this.f86034a;
            return list != null ? ((ArrayList) list).size() : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = ((d) viewHolder).f86037a;
            Attention attention = (Attention) ((ArrayList) this.f86034a).get(i7);
            BiliImageLoader.INSTANCE.with(bVar.f86031a.getContext()).url(attention.face).into(bVar.f86031a);
            bVar.f86033c.setText(viewHolder.itemView.getResources().getString(2131847605, FastDateFormat.getInstance(viewHolder.itemView.getResources().getString(2131823949), Locale.getDefault()).format(attention.mtime * 1000)));
            bVar.f86032b.setText(attention.uname);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.relation.blacklist.BlackListFragment$d] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            ?? viewHolder = new RecyclerView.ViewHolder(p.a(viewGroup, 2131494517, viewGroup, false));
            viewHolder.f86037a = new b(viewHolder.itemView.findViewById(2131304772));
            viewHolder.f86038b = viewHolder.itemView.findViewById(2131304773);
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/blacklist/BlackListFragment$d.class */
    public static final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f86037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f86038b;
    }

    public final void hf() {
        if (this.f86028f == null) {
            return;
        }
        if (getArguments() == null || !getArguments().getBoolean("show_back_button", true)) {
            this.f86028f.setVisibility(8);
            this.f86028f.setOnClickListener(null);
        } else {
            this.f86028f.setVisibility(0);
            final int i7 = 0;
            this.f86028f.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Fs0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f6436a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f6437b;

                {
                    this.f6436a = i7;
                    this.f6437b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String strS;
                    switch (this.f6436a) {
                        case 0:
                            ((BlackListFragment) this.f6437b).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            break;
                        case 1:
                            LivePlayTogetherSearchFragment livePlayTogetherSearchFragment = (LivePlayTogetherSearchFragment) this.f6437b;
                            String str = LivePlayTogetherSearchFragment.g;
                            livePlayTogetherSearchFragment.requireActivity().finish();
                            break;
                        case 2:
                            IPGoodsFragment iPGoodsFragment = (IPGoodsFragment) this.f6437b;
                            e.c(2131830553, 2131830617);
                            FlingRecyclerView flingRecyclerView = iPGoodsFragment.k;
                            if (flingRecyclerView != null) {
                                flingRecyclerView.scrollToPosition(0);
                            }
                            IPGoodsFragment.a aVar = iPGoodsFragment.p;
                            if (aVar != null) {
                                aVar.a(true);
                            }
                            break;
                        case 3:
                            Function0 retryFun = ((EmptyViewData) this.f6437b).getRetryFun();
                            if (retryFun != null) {
                                retryFun.invoke();
                            }
                            break;
                        default:
                            CollectionSideManager collectionSideManager = (CollectionSideManager) this.f6437b;
                            BiliCollectionGlobalInfoSideBarData biliCollectionGlobalInfoSideBarData = collectionSideManager.b;
                            dc1.d dVar = collectionSideManager.a;
                            if (biliCollectionGlobalInfoSideBarData != null && (strS = biliCollectionGlobalInfoSideBarData.s()) != null) {
                                r.c(dVar.a.getContext(), strS, O4.c.c("from", "collect_asset", "f_source", "collection"));
                            }
                            ArrayMap arrayMap = new ArrayMap();
                            arrayMap.put("part_id", String.valueOf(3));
                            Neurons.reportClick(false, "sqzz.dressing.collection.setting-set.click", arrayMap);
                            collectionSideManager.b();
                            collectionSideManager.c(dVar.k.getId(), false);
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hf();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493722, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Drawable drawable;
        super.onViewCreated(view, bundle);
        this.f86027e = (FrameLayout) view.findViewById(2131313551);
        this.f86028f = (ImageView) view.findViewById(2131321843);
        this.f86029g = (TextView) view.findViewById(2131321844);
        if (this.f86027e != null) {
            final int i7 = (int) (getResources().getDisplayMetrics().density * 44.0f);
            ViewCompat.setOnApplyWindowInsetsListener(this.f86027e, new OnApplyWindowInsetsListener(i7) { // from class: Fs0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f6435a;

                {
                    this.f6435a = i7;
                }

                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    int i8 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
                    view2.setPadding(view2.getPaddingLeft(), i8, view2.getPaddingRight(), view2.getPaddingBottom());
                    view2.getLayoutParams().height = this.f6435a + i8;
                    view2.requestLayout();
                    return windowInsetsCompat;
                }
            });
        }
        TextView textView = this.f86029g;
        if (textView != null) {
            textView.setText(2131847631);
        }
        if (this.f86028f != null) {
            hf();
        }
        Garb curGarb = GarbManager.getCurGarb();
        if (!curGarb.isPure()) {
            FrameLayout frameLayout = this.f86027e;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(curGarb.getSecondaryPageColor());
            }
            TextView textView2 = this.f86029g;
            if (textView2 != null) {
                textView2.setTextColor(curGarb.getFontColor());
            }
            ImageView imageView = this.f86028f;
            if (imageView != null && (drawable = imageView.getDrawable()) != null) {
                drawable.mutate().setColorFilter(curGarb.getFontColor(), PorterDuff.Mode.SRC_IN);
            }
        }
        LoadingImageView loadingImageViewAttachTo = LoadingImageView.attachTo((FrameLayout) view.findViewById(2131299396));
        this.f86026d = loadingImageViewAttachTo;
        ((FrameLayout.LayoutParams) loadingImageViewAttachTo.getLayoutParams()).topMargin = getResources().getDisplayMetrics().heightPixels / 3;
        this.f86024b = (RecyclerView) view.findViewById(2131306580);
        this.f86025c = new c();
        this.f86024b.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.f86024b.addItemDecoration(new DividerDecoration(requireContext()));
        this.f86024b.setAdapter(this.f86025c);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new com.bilibili.relation.blacklist.a(this));
        itemTouchHelper.attachToRecyclerView(this.f86024b);
        this.f86024b.addItemDecoration(itemTouchHelper);
        LoadingImageView loadingImageView = this.f86026d;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            this.f86026d.setRefreshing();
        }
        RelationApiManager.getBlackList(BiliAccounts.get(requireContext()).getAccessKey(), this.h);
    }
}
