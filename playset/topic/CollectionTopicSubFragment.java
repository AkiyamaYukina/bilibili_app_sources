package com.bilibili.playset.topic;

import Ct0.h;
import F3.C1865x4;
import aC.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseSwipeRefreshFragment;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetAppService;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.dialog.OperateItem;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.bilibili.playset.topic.CollectionTopicItem;
import com.bilibili.playset.topic.CollectionTopicSubFragment;
import com.bilibili.playset.topic.RspCollectionTopic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.g;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;
import xs0.c;
import xs0.d;
import xs0.i;
import xs0.j;
import xs0.m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicSubFragment.class */
@StabilityInferred(parameters = 0)
public final class CollectionTopicSubFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f85623f;
    public boolean h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public m f85626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f85627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public RecyclerView f85628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TintTextView f85629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ImageView f85630n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85624g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85625i = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f85631o = LazyKt.lazy(new C1865x4(12));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final b f85632p = new b(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playset.playlist.helper.a f85633q = new com.bilibili.playset.playlist.helper.a(new h(2, this));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f85634r = LazyKt.lazy(new k(this, 6));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playset.checkin.fragment.h f85635s = new com.bilibili.playset.checkin.fragment.h(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final c f85636t = new Observer(this) { // from class: xs0.c

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicSubFragment f129441a;

        {
            this.f129441a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Integer pageIndex;
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("key_from");
            CollectionTopicSubFragment collectionTopicSubFragment = this.f129441a;
            if (Intrinsics.areEqual(string, collectionTopicSubFragment.f85623f)) {
                int i7 = bundle.getInt("key_status");
                boolean z6 = true;
                if (i7 == 0) {
                    collectionTopicSubFragment.h = true;
                    return;
                }
                if (i7 == 1) {
                    collectionTopicSubFragment.h = false;
                    m mVar = collectionTopicSubFragment.f85626j;
                    if (mVar != null) {
                        mVar.N(4);
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    return;
                }
                collectionTopicSubFragment.h = false;
                RspCollectionTopic rspCollectionTopic = (RspCollectionTopic) bundle.getParcelable("key_data");
                List<CollectionTopicItem> items = rspCollectionTopic != null ? rspCollectionTopic.getItems(collectionTopicSubFragment.f85623f) : null;
                collectionTopicSubFragment.f85625i = (rspCollectionTopic == null || (pageIndex = rspCollectionTopic.getPageIndex(collectionTopicSubFragment.f85623f)) == null) ? collectionTopicSubFragment.f85625i + 1 : pageIndex.intValue();
                collectionTopicSubFragment.jf(items, true);
                if ((items != null ? items.size() : 0) < 20) {
                    z6 = false;
                }
                collectionTopicSubFragment.f85624g = z6;
                if (z6) {
                    m mVar2 = collectionTopicSubFragment.f85626j;
                    if (mVar2 != null) {
                        mVar2.N(2);
                        return;
                    }
                    return;
                }
                m mVar3 = collectionTopicSubFragment.f85626j;
                if (mVar3 != null) {
                    mVar3.N(3);
                }
            }
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final d f85637u = new Observer(this) { // from class: xs0.d

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicSubFragment f129442a;

        {
            this.f129442a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            CollectionTopicItem collectionTopicItem;
            Bundle bundle = (Bundle) obj;
            String string = bundle.getString("key_from");
            CollectionTopicSubFragment collectionTopicSubFragment = this.f129442a;
            if (Intrinsics.areEqual(string, collectionTopicSubFragment.f85623f)) {
                int i7 = bundle.getInt("key_status");
                int i8 = 0;
                if (i7 == 0) {
                    collectionTopicSubFragment.f85627k = TintProgressDialog.show(collectionTopicSubFragment.getContext(), null, collectionTopicSubFragment.getResources().getString(2131842520), true, false);
                    return;
                }
                if (i7 == 1) {
                    TintProgressDialog tintProgressDialog = collectionTopicSubFragment.f85627k;
                    if (tintProgressDialog != null) {
                        tintProgressDialog.dismiss();
                    }
                    ToastHelper.showToastShort(collectionTopicSubFragment.getContext(), 2131841692);
                    return;
                }
                if (i7 != 2) {
                    return;
                }
                TintProgressDialog tintProgressDialog2 = collectionTopicSubFragment.f85627k;
                if (tintProgressDialog2 != null) {
                    tintProgressDialog2.dismiss();
                }
                int i9 = bundle.getInt("key_data_index", -1);
                long j7 = bundle.getLong("key_data_id");
                m mVar = collectionTopicSubFragment.f85626j;
                if (mVar == null || (collectionTopicItem = (CollectionTopicItem) CollectionsKt.getOrNull(mVar.f129469g, i9)) == null || collectionTopicItem.getId() != j7) {
                    m mVar2 = collectionTopicSubFragment.f85626j;
                    if (mVar2 != null) {
                        for (Object obj2 : (ArrayList) mVar2.f129469g) {
                            if (i8 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((CollectionTopicItem) obj2).getId() == j7) {
                                ((ArrayList) mVar2.f129469g).remove(i8);
                                if (((ArrayList) mVar2.f129469g).isEmpty()) {
                                    mVar2.notifyDataSetChanged();
                                } else {
                                    mVar2.notifyItemRemoved(i8);
                                }
                            }
                            i8++;
                        }
                    }
                } else {
                    m mVar3 = collectionTopicSubFragment.f85626j;
                    if (mVar3 != null) {
                        ((ArrayList) mVar3.f129469g).remove(i9);
                        if (((ArrayList) mVar3.f129469g).isEmpty()) {
                            mVar3.notifyDataSetChanged();
                        } else {
                            mVar3.notifyItemRemoved(i9);
                        }
                    }
                }
                m mVar4 = collectionTopicSubFragment.f85626j;
                if (mVar4 == null || ((ArrayList) mVar4.f129469g).size() != 0) {
                    return;
                }
                collectionTopicSubFragment.kf(2131235613, 2131842626);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicSubFragment$a.class */
    public static final class a implements PlaylistDetailBottomSheet.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicSubFragment f85638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CollectionTopicItem f85639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85640c;

        public a(CollectionTopicSubFragment collectionTopicSubFragment, CollectionTopicItem collectionTopicItem, int i7) {
            this.f85638a = collectionTopicSubFragment;
            this.f85639b = collectionTopicItem;
            this.f85640c = i7;
        }

        @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
        public final void h(int i7) {
            if (i7 == 12) {
                CollectionTopicSubFragment collectionTopicSubFragment = this.f85638a;
                String strMf = collectionTopicSubFragment.mf();
                CollectionTopicItem collectionTopicItem = this.f85639b;
                long id = collectionTopicItem != null ? collectionTopicItem.getId() : 0L;
                HashMap mapA = g.a(4, "entity", strMf);
                mapA.put("entity_id", Long.toString(id));
                mapA.put("action", "collect");
                mapA.put("action_type", "0");
                Neurons.reportClick(false, "main.my-favorite.favorite-feeds.topic-card.click", mapA);
                j jVarNf = collectionTopicSubFragment.nf();
                long id2 = 0;
                if (collectionTopicItem != null) {
                    id2 = collectionTopicItem.getId();
                }
                String str = collectionTopicSubFragment.f85623f;
                jVarNf.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("key_from", str);
                MutableLiveData mutableLiveData = (MutableLiveData) jVarNf.f129455d.getValue();
                bundle.putInt("key_status", 0);
                mutableLiveData.setValue(bundle);
                xs0.g gVar = new xs0.g(jVarNf, bundle, this.f85640c, id2);
                if (Intrinsics.areEqual(str, "new_topic")) {
                    ((PlaySetAppService) ServiceGenerator.createService(PlaySetAppService.class)).deleteTopic(id2).enqueue(gVar);
                } else {
                    ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).deleteTag(id2).enqueue(gVar);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicSubFragment$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicSubFragment f85641a;

        public b(CollectionTopicSubFragment collectionTopicSubFragment) {
            this.f85641a = collectionTopicSubFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            int childCount;
            if (i8 > 0 && (childCount = recyclerView.getChildCount()) > 0 && (recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1)) instanceof xs0.k)) {
                CollectionTopicSubFragment collectionTopicSubFragment = this.f85641a;
                if (collectionTopicSubFragment.h || !collectionTopicSubFragment.f85624g) {
                    return;
                }
                collectionTopicSubFragment.lf();
            }
        }
    }

    public final void jf(List list, boolean z6) {
        m mVar;
        m mVar2;
        ImageView imageView = this.f85630n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TintTextView tintTextView = this.f85629m;
        if (tintTextView != null) {
            tintTextView.setVisibility(8);
        }
        RecyclerView recyclerView = this.f85628l;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        if (!z6 && (mVar2 = this.f85626j) != null) {
            ((ArrayList) mVar2.f129469g).clear();
            mVar2.notifyDataSetChanged();
        }
        if (list == null || (mVar = this.f85626j) == null) {
            return;
        }
        ((ArrayList) mVar.f129469g).addAll(list);
        mVar.notifyDataSetChanged();
    }

    public final void kf(int i7, int i8) {
        RecyclerView recyclerView = this.f85628l;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        ImageView imageView = this.f85630n;
        if (imageView != null) {
            imageView.setImageResource(i7);
        }
        ImageView imageView2 = this.f85630n;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TintTextView tintTextView = this.f85629m;
        if (tintTextView != null) {
            tintTextView.setText(i8);
        }
        TintTextView tintTextView2 = this.f85629m;
        if (tintTextView2 != null) {
            tintTextView2.setVisibility(0);
        }
    }

    public final void lf() {
        CollectionTopicItem collectionTopicItem;
        this.h = true;
        j jVarNf = nf();
        m mVar = this.f85626j;
        long id = (mVar == null || (collectionTopicItem = (CollectionTopicItem) CollectionsKt.lastOrNull(mVar.f129469g)) == null) ? 0L : collectionTopicItem.getId();
        int i7 = this.f85625i;
        String str = this.f85623f;
        jVarNf.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("key_from", str);
        MutableLiveData mutableLiveData = (MutableLiveData) jVarNf.f129454c.getValue();
        bundle.putInt("key_status", 0);
        mutableLiveData.setValue(bundle);
        ((PlaySetAppService) ServiceGenerator.createService(PlaySetAppService.class)).getTopic(20, i7 + 1, id, str).enqueue(new i(jVarNf, bundle));
    }

    public final String mf() {
        String str = this.f85623f;
        return Intrinsics.areEqual(str, "new_topic") ? "newtopic" : Intrinsics.areEqual(str, "tag") ? "topic" : "";
    }

    public final j nf() {
        return (j) this.f85634r.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [xs0.e] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_type") : null;
        this.f85623f = string;
        this.f85626j = new m(string, new Zs.b(this, 5), new Function2(this) { // from class: xs0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CollectionTopicSubFragment f129443a;

            {
                this.f129443a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj).intValue();
                ArrayList<OperateItem> arrayList = PlaylistDetailBottomSheet.f84715e;
                PlaylistDetailBottomSheet playlistDetailBottomSheetA = PlaylistDetailBottomSheet.a.a(9);
                CollectionTopicSubFragment collectionTopicSubFragment = this.f129443a;
                playlistDetailBottomSheetA.f84727d.f84729b = new CollectionTopicSubFragment.a(collectionTopicSubFragment, (CollectionTopicItem) obj2, iIntValue);
                playlistDetailBottomSheetA.show(collectionTopicSubFragment.getChildFragmentManager(), "PlaylistDetailBottomSheet");
                return Unit.INSTANCE;
            }
        }, new Zs0.a(2, this));
        ((MutableLiveData) nf().f129453b.getValue()).observe(this, this.f85635s);
        ((MutableLiveData) nf().f129454c.getValue()).observe(this, this.f85636t);
        ((MutableLiveData) nf().f129455d.getValue()).observe(this, this.f85637u);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499702, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final void onRefresh() {
        super.onRefresh();
        com.bilibili.playset.playlist.helper.a aVar = this.f85633q;
        aVar.f85322b = -1;
        aVar.f85323c = -1;
        j jVarNf = nf();
        String str = this.f85623f;
        jVarNf.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("key_from", str);
        MutableLiveData mutableLiveData = (MutableLiveData) jVarNf.f129453b.getValue();
        bundle.putInt("key_status", 0);
        mutableLiveData.setValue(bundle);
        ((PlaySetAppService) ServiceGenerator.createService(PlaySetAppService.class)).getTopic(20, 1, 0L, str).enqueue(new xs0.h(jVarNf, bundle));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f85626j;
        if ((mVar != null ? ((ArrayList) mVar.f129469g).size() : 0) == 0) {
            setRefreshStart();
            onRefresh();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f85628l = (RecyclerView) view.findViewById(2131306595);
        this.f85629m = (TintTextView) view.findViewById(2131310613);
        this.f85630n = (ImageView) view.findViewById(2131304541);
        RecyclerView recyclerView = this.f85628l;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f85628l;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f85632p);
        }
        RecyclerView recyclerView3 = this.f85628l;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.f85633q);
        }
        RecyclerView recyclerView4 = this.f85628l;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f85626j);
        }
    }
}
