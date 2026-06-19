package com.bilibili.playset.topic;

import Ct0.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.ui.BaseSwipeRefreshFragment;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.topic.CollectionTopicFragment;
import com.bilibili.playset.topic.CollectionTopicTab;
import com.bilibili.playset.topic.RspCollectionTopic;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;
import xs0.C9004a;
import xs0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicFragment.class */
@StabilityInferred(parameters = 0)
public final class CollectionTopicFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TabLayout f85615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewPager f85616g;

    @Nullable
    public TintTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ImageView f85617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f85618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f85619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f85620l = LazyKt.lazy(new d(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C9004a f85621m = new Observer(this) { // from class: xs0.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicFragment f129439a;

        {
            this.f129439a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            TabLayout tabLayout;
            TabLayout.Tab tabAt;
            Pair pair = (Pair) obj;
            int iIntValue = ((Number) pair.getFirst()).intValue();
            CollectionTopicFragment collectionTopicFragment = this.f129439a;
            if (iIntValue == 0) {
                collectionTopicFragment.setRefreshStart();
                ImageView imageView = collectionTopicFragment.f85617i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                TintTextView tintTextView = collectionTopicFragment.h;
                if (tintTextView != null) {
                    tintTextView.setVisibility(8);
                    return;
                }
                return;
            }
            if (iIntValue == 1) {
                collectionTopicFragment.setRefreshCompleted();
                collectionTopicFragment.jf(2131232151, 2131841340);
                return;
            }
            if (iIntValue != 2) {
                return;
            }
            collectionTopicFragment.setRefreshCompleted();
            RspCollectionTopic rspCollectionTopic = (RspCollectionTopic) pair.getSecond();
            if ((rspCollectionTopic != null ? rspCollectionTopic.getTab() : null) == null) {
                collectionTopicFragment.jf(2131235613, 2131842626);
                return;
            }
            SwipeRefreshLayout swipeRefreshLayout = collectionTopicFragment.f64721b;
            int i7 = 0;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(false);
            }
            ImageView imageView2 = collectionTopicFragment.f85617i;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            TintTextView tintTextView2 = collectionTopicFragment.h;
            if (tintTextView2 != null) {
                tintTextView2.setVisibility(8);
            }
            TabLayout tabLayout2 = collectionTopicFragment.f85615f;
            if (tabLayout2 != null) {
                tabLayout2.setVisibility(0);
            }
            ViewPager viewPager = collectionTopicFragment.f85616g;
            if (viewPager != null) {
                viewPager.setVisibility(0);
            }
            ArrayList<Pair> arrayList = new ArrayList();
            CollectionTopicTab tab = rspCollectionTopic.getTab();
            if (tab != null && tab.getTopic()) {
                arrayList.add(TuplesKt.to("new_topic", collectionTopicFragment.getResources().getString(2131842619)));
            }
            CollectionTopicTab tab2 = rspCollectionTopic.getTab();
            if (tab2 != null && tab2.getTag()) {
                arrayList.add(TuplesKt.to("tag", collectionTopicFragment.getResources().getString(2131842511)));
            }
            MutableLiveData mutableLiveData = (MutableLiveData) ((j) collectionTopicFragment.f85620l.getValue()).f129453b.getValue();
            Bundle bundle = new Bundle();
            Pair pair2 = (Pair) CollectionsKt.getOrNull(arrayList, 0);
            bundle.putString("key_from", pair2 != null ? (String) pair2.getFirst() : null);
            bundle.putInt("key_status", 2);
            bundle.putParcelable("key_data", rspCollectionTopic);
            mutableLiveData.setValue(bundle);
            ViewPager viewPager2 = collectionTopicFragment.f85616g;
            if (viewPager2 != null) {
                viewPager2.setAdapter(new C9005b(collectionTopicFragment.getChildFragmentManager(), arrayList));
            }
            if (arrayList.size() <= 0) {
                TabLayout tabLayout3 = collectionTopicFragment.f85615f;
                if (tabLayout3 != null) {
                    tabLayout3.setVisibility(8);
                }
                View view = collectionTopicFragment.f85618j;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            TabLayout tabLayout4 = collectionTopicFragment.f85615f;
            if (tabLayout4 != null) {
                tabLayout4.setVisibility(0);
            }
            View view2 = collectionTopicFragment.f85618j;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            TabLayout tabLayout5 = collectionTopicFragment.f85615f;
            if (tabLayout5 != null) {
                tabLayout5.removeAllTabs();
            }
            TabLayout tabLayout6 = collectionTopicFragment.f85615f;
            if (tabLayout6 != null) {
                for (Pair pair3 : arrayList) {
                    TabLayout.Tab tabNewTab = tabLayout6.newTab();
                    tabNewTab.setText((CharSequence) pair3.getSecond());
                    tabLayout6.addTab(tabNewTab);
                }
            }
            if (collectionTopicFragment.f85619k == null || !(!StringsKt.isBlank(r0))) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                } else if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), collectionTopicFragment.f85619k)) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 <= 0 || (tabLayout = collectionTopicFragment.f85615f) == null || (tabAt = tabLayout.getTabAt(i7)) == null) {
                return;
            }
            tabAt.select();
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/topic/CollectionTopicFragment$a.class */
    public static final class a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionTopicFragment f85622a;

        public a(CollectionTopicFragment collectionTopicFragment) {
            this.f85622a = collectionTopicFragment;
        }

        public final void onTabReselected(TabLayout.Tab tab) {
        }

        public final void onTabSelected(TabLayout.Tab tab) {
            ViewPager viewPager = this.f85622a.f85616g;
            if (viewPager != null) {
                viewPager.setCurrentItem(tab != null ? tab.getPosition() : 0);
            }
        }

        public final void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public final void jf(int i7, int i8) {
        TabLayout tabLayout = this.f85615f;
        if (tabLayout != null) {
            tabLayout.setVisibility(8);
        }
        ViewPager viewPager = this.f85616g;
        if (viewPager != null) {
            viewPager.setVisibility(8);
        }
        ImageView imageView = this.f85617i;
        if (imageView != null) {
            imageView.setImageResource(i7);
        }
        ImageView imageView2 = this.f85617i;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TintTextView tintTextView = this.h;
        if (tintTextView != null) {
            tintTextView.setText(i8);
        }
        TintTextView tintTextView2 = this.h;
        if (tintTextView2 != null) {
            tintTextView2.setVisibility(0);
        }
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499698, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final void onRefresh() {
        super.onRefresh();
        ((j) this.f85620l.getValue()).I0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f85615f = view.findViewById(2131311422);
        this.f85616g = (ViewPager) view.findViewById(2131314745);
        this.h = (TintTextView) view.findViewById(2131310613);
        this.f85617i = (ImageView) view.findViewById(2131304541);
        this.f85618j = view.findViewById(2131311096);
        Bundle arguments = getArguments();
        this.f85619k = arguments != null ? arguments.getString("fav_sub_tab") : null;
        TabLayout tabLayout = this.f85615f;
        if (tabLayout != null) {
            tabLayout.addOnTabSelectedListener(new a(this));
        }
        ((MutableLiveData) ((j) this.f85620l.getValue()).f129452a.getValue()).observe(getViewLifecycleOwner(), this.f85621m);
        ((j) this.f85620l.getValue()).I0();
    }
}
