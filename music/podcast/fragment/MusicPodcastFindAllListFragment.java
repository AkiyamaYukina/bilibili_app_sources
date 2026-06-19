package com.bilibili.music.podcast.fragment;

import Vi0.C2955b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.CardModule;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.PickCardDetailReq;
import com.bapis.bilibili.app.listener.v1.PickCardDetailResp;
import com.bapis.bilibili.app.listener.v1.PkcmHeader;
import com.bilibili.app.comm.comment2.comments.view.E;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.music.podcast.data.a;
import com.bilibili.music.podcast.data.h;
import com.bilibili.music.podcast.fragment.MusicPodcastFindFragment;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import com.bilibili.music.podcast.utils.l;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.utils.q;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import com.bilibili.pvtracker.IPvTracker;
import gi0.C7324e;
import gi0.C7325f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment.class */
public final class MusicPodcastFindAllListFragment extends SwipeRefreshFragment implements IPvTracker {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7324e f66607k = new C7324e(new C7325f(false));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f66608l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f66609m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MusicNormalLoadView f66610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public List<? extends com.bilibili.music.podcast.data.e> f66611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f66612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f66613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f66614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f66615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f66616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f66617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final l<com.bilibili.music.podcast.data.e> f66618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final c f66619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final e f66620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final a f66621y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$a.class */
    public static final class a implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66622a;

        public a(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66622a = musicPodcastFindAllListFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            RecyclerView recyclerView = this.f66622a.f66799e;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i7 == 1 ? 0 : recyclerView.getContext().getResources().getDimensionPixelSize(2131166703));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$b.class */
    public static final class b implements MusicPodcastFindFragment.a<com.bilibili.music.podcast.data.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66623a;

        public b(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66623a = musicPodcastFindAllListFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.d dVar) {
            com.bilibili.music.podcast.data.d dVar2 = dVar;
            MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66623a;
            if (dVar2 == null) {
                musicPodcastFindAllListFragment.pf(true);
                return;
            }
            musicPodcastFindAllListFragment.pf(false);
            List<com.bilibili.music.podcast.data.e> list = dVar2.f66453a;
            musicPodcastFindAllListFragment.f66611o = list;
            musicPodcastFindAllListFragment.f66607k.submitList(list);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onError() {
            this.f66623a.pf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$c.class */
    public static final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66624a;

        public c(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66624a = musicPodcastFindAllListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            e eVar = this.f66624a.f66620x;
            if (i7 == 0) {
                eVar.f66627b.f66618v.b();
            } else {
                eVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            e eVar = this.f66624a.f66620x;
            RecyclerView recyclerView2 = eVar.f66627b.f66799e;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, eVar.f66626a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$d.class */
    public static final class d implements InterfaceC5426f<com.bilibili.music.podcast.data.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66625a;

        public d(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66625a = musicPodcastFindAllListFragment;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(com.bilibili.music.podcast.data.e eVar) {
            com.bilibili.music.podcast.data.e eVar2 = eVar;
            return (eVar2 instanceof com.bilibili.music.podcast.data.a) && ((com.bilibili.music.podcast.data.a) eVar2).f66429a.f66457d != null;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(com.bilibili.music.podcast.data.e eVar) {
            com.bilibili.music.podcast.data.e eVar2 = eVar;
            if (eVar2 instanceof com.bilibili.music.podcast.data.a) {
                MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66625a;
                String str = musicPodcastFindAllListFragment.f66613q;
                String str2 = musicPodcastFindAllListFragment.f66614r;
                com.bilibili.music.podcast.data.a aVar = (com.bilibili.music.podcast.data.a) eVar2;
                p.e(str, str2, aVar.f66429a.f66457d, aVar.f66445r, musicPodcastFindAllListFragment.f66615s);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$e.class */
    public static final class e implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66627b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$e$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastFindAllListFragment f66628a;

            public a(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
                this.f66628a = musicPodcastFindAllListFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66628a;
                musicPodcastFindAllListFragment.f66618v.a(musicPodcastFindAllListFragment.f66607k.N(i7, i8));
            }
        }

        public e(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66627b = musicPodcastFindAllListFragment;
            this.f66626a = new a(musicPodcastFindAllListFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66627b;
            RecyclerView recyclerView = musicPodcastFindAllListFragment.f66799e;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66626a);
            }
            musicPodcastFindAllListFragment.f66618v.b();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$f.class */
    public static final class f implements MusicPodcastFindFragment.a<com.bilibili.music.podcast.data.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66629a;

        public f(MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66629a = musicPodcastFindAllListFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.d dVar) {
            com.bilibili.music.podcast.data.d dVar2 = dVar;
            MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66629a;
            musicPodcastFindAllListFragment.lf();
            if (dVar2 == null) {
                musicPodcastFindAllListFragment.pf(true);
                return;
            }
            musicPodcastFindAllListFragment.pf(false);
            List<com.bilibili.music.podcast.data.e> list = dVar2.f66453a;
            musicPodcastFindAllListFragment.f66611o = list;
            musicPodcastFindAllListFragment.f66607k.submitList(list);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onError() {
            MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66629a;
            musicPodcastFindAllListFragment.lf();
            musicPodcastFindAllListFragment.pf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindAllListFragment$g.class */
    public static final class g extends com.bilibili.music.podcast.moss.a<com.bilibili.music.podcast.data.d, PickCardDetailResp> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastFindFragment.a<com.bilibili.music.podcast.data.d> f66630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MusicPodcastFindAllListFragment f66631c;

        public g(MusicPodcastFindFragment.a<com.bilibili.music.podcast.data.d> aVar, MusicPodcastFindAllListFragment musicPodcastFindAllListFragment) {
            this.f66630b = aVar;
            this.f66631c = musicPodcastFindAllListFragment;
        }

        @Override // com.bilibili.music.podcast.moss.a
        public final com.bilibili.music.podcast.data.d d(PickCardDetailResp pickCardDetailResp) {
            com.bilibili.music.podcast.data.d dVar;
            List modulesList;
            PickCardDetailResp pickCardDetailResp2 = pickCardDetailResp;
            if (pickCardDetailResp2 == null || (modulesList = pickCardDetailResp2.getModulesList()) == null) {
                dVar = null;
            } else {
                long cardId = pickCardDetailResp2.getCardId();
                long pickId = pickCardDetailResp2.getPickId();
                ArrayList arrayList = new ArrayList();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                boolean z6 = true;
                int i7 = 0;
                String title = "";
                for (Object obj : modulesList) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    CardModule cardModule = (CardModule) obj;
                    if (cardModule.hasModuleHeader()) {
                        title = cardModule.getModuleHeader().getTitle();
                        if (title == null) {
                            title = "";
                        }
                        PkcmHeader moduleHeader = cardModule.getModuleHeader();
                        h hVar = new h(moduleHeader.getTitle(), pickId, cardId, moduleHeader.getDesc(), moduleHeader.getBtnIcon(), moduleHeader.getBtnText(), moduleHeader.getBtnUri());
                        arrayList.add(hVar);
                        objectRef.element = hVar;
                    } else if (cardModule.hasModuleArchive()) {
                        com.bilibili.music.podcast.data.a aVarA = a.C0380a.a(cardModule.getModuleArchive(), cardId, pickId, title);
                        aVarA.f66445r = i7 - 1;
                        if (z6 && aVarA.f66446s) {
                            z6 = false;
                        }
                        arrayList.add(aVarA);
                    }
                    i7++;
                }
                h hVar2 = (h) objectRef.element;
                if (hVar2 != null) {
                    hVar2.h = z6;
                }
                dVar = new com.bilibili.music.podcast.data.d(arrayList);
            }
            return dVar;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            MusicPodcastFindAllListFragment musicPodcastFindAllListFragment = this.f66631c;
            return musicPodcastFindAllListFragment.isDetached() || musicPodcastFindAllListFragment.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(Object obj) {
            this.f66630b.onDataSuccess((com.bilibili.music.podcast.data.d) obj);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            this.f66630b.onError();
        }
    }

    public MusicPodcastFindAllListFragment() {
        new ArrayList();
        this.f66612p = true;
        new Bundle();
        this.f66613q = "";
        this.f66614r = "";
        this.f66615s = "";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f66616t = LazyKt.lazy(lazyThreadSafetyMode, new com.bilibili.biligame.ui.home.dialog.a(this, 6));
        this.f66617u = LazyKt.lazy(lazyThreadSafetyMode, new Rs.c(this, 5));
        this.f66618v = new l<>(new d(this));
        this.f66619w = new c(this);
        this.f66620x = new e(this);
        this.f66621y = new a(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "listen.audio-list.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Resources resources;
        String str = this.f66613q;
        Context context = getContext();
        String string = (context == null || (resources = context.getResources()) == null) ? null : resources.getString(2131845968);
        String str2 = this.f66615s;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", "playlist_find");
        String str3 = string;
        if (string == null) {
            str3 = "";
        }
        bundleM.putString("page_name", str3);
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        bundleM.putString(GameCardButton.extraParamSource, str4);
        return bundleM;
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final boolean kf() {
        return false;
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final void mf() {
        of((f) this.f66617u.getValue());
    }

    public final void of(MusicPodcastFindFragment.a<com.bilibili.music.podcast.data.d> aVar) {
        long j7 = this.f66608l;
        if (j7 != -1) {
            long j8 = this.f66609m;
            if (j8 != -1) {
                g gVar = new g(aVar, this);
                new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).pickCardDetail(PickCardDetailReq.newBuilder().setCardId(j8).setPickId(j7).build(), new com.bilibili.music.podcast.moss.d(gVar, gVar));
                return;
            }
        }
        ToastHelper.showToastShort(getContext(), 2131831730);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r6, @org.jetbrains.annotations.Nullable android.view.ViewGroup r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.MusicPodcastFindAllListFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.f66799e;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f66619w);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f66612p) {
            MusicNormalLoadView musicNormalLoadView = this.f66610n;
            MusicNormalLoadView musicNormalLoadView2 = musicNormalLoadView;
            if (musicNormalLoadView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
                musicNormalLoadView2 = null;
            }
            musicNormalLoadView2.a(1);
            of((b) this.f66616t.getValue());
            this.f66612p = false;
        }
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        MusicNormalLoadView musicNormalLoadView = (MusicNormalLoadView) view.findViewById(2131305806);
        this.f66610n = musicNormalLoadView;
        MusicNormalLoadView musicNormalLoadView2 = musicNormalLoadView;
        if (musicNormalLoadView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
            musicNormalLoadView2 = null;
        }
        E e7 = new E(this, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
        MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499545);
        aVar.a(2131310274, e7);
        linkedHashMap.put(2, aVar);
        musicNormalLoadView2.setLoadContent(linkedHashMap);
        RecyclerView recyclerView = this.f66799e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setAdapter(this.f66607k);
            recyclerView.addOnScrollListener(this.f66619w);
        }
        this.f66607k.f120307e = this.f66620x;
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().a(this, this.f66621y);
    }

    public final void pf(boolean z6) {
        MusicNormalLoadView musicNormalLoadView = null;
        if (z6) {
            MusicNormalLoadView musicNormalLoadView2 = this.f66610n;
            if (musicNormalLoadView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
                musicNormalLoadView2 = null;
            }
            musicNormalLoadView2.a(2);
            SwipeRefreshLayout swipeRefreshLayout = this.f66798d;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setVisibility(8);
                return;
            }
            return;
        }
        MusicNormalLoadView musicNormalLoadView3 = this.f66610n;
        if (musicNormalLoadView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
        } else {
            musicNormalLoadView = musicNormalLoadView3;
        }
        musicNormalLoadView.a(Integer.MIN_VALUE);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f66798d;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setVisibility(0);
        }
    }
}
