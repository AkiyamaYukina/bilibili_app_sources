package com.bilibili.music.podcast.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bapis.bilibili.app.listener.v1.MainFavMusicSubTabListReq;
import com.bapis.bilibili.app.listener.v1.MusicMoss;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.music.podcast.data.MainFavMusicMenu;
import com.bilibili.music.podcast.moss.d;
import com.bilibili.music.podcast.view.r;
import gi0.C7334o;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ni0.AbstractC8096b;
import ni0.C8097c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.C8438h;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MainFavMenuFragment.class */
public final class MainFavMenuFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C7334o f66586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public r f66587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66588d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f66590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public LinearLayout f66591g;

    @Nullable
    public ImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f66592i;

    /* JADX INFO: renamed from: com.bilibili.music.podcast.fragment.MainFavMenuFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MainFavMenuFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e7) {
                BLog.e("MainFavMusicFragment", e7.getMessage());
            }
        }
    }

    public final void kf() {
        if (this.f66589e) {
            return;
        }
        setRefreshStart();
        LinearLayout linearLayout = this.f66591g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.f66589e = true;
        C8438h c8438h = new C8438h(this);
        new MusicMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).mainFavMusicSubTabList(MainFavMusicSubTabListReq.newBuilder().build(), new d(c8438h, c8438h));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        Bundle extras;
        boolean[] zArr;
        AbstractC8096b abstractC8096b;
        int i9;
        int i10;
        MainFavMusicMenu mainFavMusicMenu;
        super.onActivityResult(i7, i8, intent);
        C7334o c7334o = this.f66586b;
        if (c7334o == null || i8 != -1 || i7 != 42 || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        long j7 = BundleUtil.getLong(extras, "key_menu_id", new long[]{0});
        String string = BundleUtil.getString(extras, "key_name", new String[]{""});
        String string2 = BundleUtil.getString(extras, "key_desc", new String[]{""});
        boolean z6 = BundleUtil.getBoolean(extras, "key_is_public", new boolean[]{true});
        C8097c c8097c = c7334o.f124238a;
        Iterator<T> it = c8097c.f124231a.iterator();
        int i11 = 0;
        int itemCount = 0;
        int i12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            zArr = c8097c.f124232b;
            MainFavMusicMenu mainFavMusicMenu2 = null;
            if (!zHasNext) {
                abstractC8096b = null;
                i9 = i12;
                i10 = -1;
                mainFavMusicMenu = null;
                break;
            }
            AbstractC8096b abstractC8096b2 = (AbstractC8096b) it.next();
            Iterator it2 = abstractC8096b2.getItems().iterator();
            i12 = 0;
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i13 = -1;
                    break;
                }
                Object next = it2.next();
                i12++;
                if ((next instanceof MainFavMusicMenu) && ((MainFavMusicMenu) next).getId() == j7) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                Object orNull = CollectionsKt.getOrNull(abstractC8096b2.getItems(), i13);
                if (orNull instanceof MainFavMusicMenu) {
                    mainFavMusicMenu2 = (MainFavMusicMenu) orNull;
                }
                int i14 = i12;
                mainFavMusicMenu = mainFavMusicMenu2;
                i10 = i11;
                i9 = i14;
                abstractC8096b = abstractC8096b2;
            } else {
                itemCount += zArr[i11] ? abstractC8096b2.getItemCount() + 1 : 1;
                i11++;
            }
        }
        if (mainFavMusicMenu == null || abstractC8096b == null) {
            return;
        }
        mainFavMusicMenu.setTitle(string);
        mainFavMusicMenu.setDesc(string2);
        mainFavMusicMenu.setPublic(z6);
        if (i10 < 0 || !zArr[i10]) {
            return;
        }
        c7334o.notifyItemChanged(itemCount + i9);
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499517, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        kf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f66588d) {
            kf();
            this.f66588d = false;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f66590f = (RecyclerView) view.findViewById(2131306595);
        this.f66591g = (LinearLayout) view.findViewById(2131305755);
        this.h = (ImageView) view.findViewById(2131304541);
        this.f66592i = (TextView) view.findViewById(2131310613);
        RecyclerView recyclerView = this.f66590f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        if (this.f66586b != null) {
            r rVar = this.f66587c;
            if (rVar != null) {
                rVar.a();
            }
            this.f66587c = new r(this.f66590f, this.f66586b);
            RecyclerView recyclerView2 = this.f66590f;
            if (recyclerView2 != null) {
                recyclerView2.stopScroll();
            }
            RecyclerView recyclerView3 = this.f66590f;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(this.f66587c);
            }
            RecyclerView recyclerView4 = this.f66590f;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(this.f66586b);
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (this.f66588d) {
            kf();
            this.f66588d = false;
        }
    }
}
