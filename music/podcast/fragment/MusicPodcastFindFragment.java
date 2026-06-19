package com.bilibili.music.podcast.fragment;

import Vi0.C2955b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.CardModule;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.PickCard;
import com.bapis.bilibili.app.listener.v1.PickFeedReq;
import com.bapis.bilibili.app.listener.v1.PickFeedResp;
import com.bapis.bilibili.app.listener.v1.PkcmCenterButton;
import com.bapis.bilibili.app.listener.v1.PkcmHeader;
import com.bilibili.ad.adview.videodetail.endpage.cards.j;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.x;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.a;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment.class */
public final class MusicPodcastFindFragment extends SwipeRefreshFragment implements PageAdapter.Page, IPvTracker, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final d f66632A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final f f66633B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7324e f66634k = new C7324e(new C7325f(true));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f66635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MusicNormalLoadView f66636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public List<com.bilibili.music.podcast.data.e> f66637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f66638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f66639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public View f66640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public TextView f66641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f66642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public String f66643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public String f66644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f66645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f66646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f66647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final b f66648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final l<com.bilibili.music.podcast.data.e> f66649z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$a.class */
    public interface a<T> {
        void onDataSuccess(@Nullable T t7);

        void onError();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$b.class */
    public static final class b implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66650a;

        public b(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66650a = musicPodcastFindFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            RecyclerView recyclerView = this.f66650a.f66799e;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i7 == 1 ? 0 : recyclerView.getContext().getResources().getDimensionPixelSize(2131166703));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$c.class */
    public static final class c implements a<com.bilibili.music.podcast.data.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66651a;

        public c(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66651a = musicPodcastFindFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.d dVar) {
            com.bilibili.music.podcast.data.d dVar2 = dVar;
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66651a;
            if (dVar2 == null) {
                musicPodcastFindFragment.qf(true);
                return;
            }
            musicPodcastFindFragment.qf(false);
            List<com.bilibili.music.podcast.data.e> list = dVar2.f66453a;
            musicPodcastFindFragment.f66637n = list;
            musicPodcastFindFragment.f66634k.submitList(list);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onError() {
            this.f66651a.qf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66652a;

        public d(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66652a = musicPodcastFindFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            f fVar = this.f66652a.f66633B;
            if (i7 == 0) {
                fVar.f66655b.f66649z.b();
            } else {
                fVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            f fVar = this.f66652a.f66633B;
            RecyclerView recyclerView2 = fVar.f66655b.f66799e;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, fVar.f66654a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$e.class */
    public static final class e implements InterfaceC5426f<com.bilibili.music.podcast.data.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66653a;

        public e(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66653a = musicPodcastFindFragment;
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
                MusicPodcastFindFragment musicPodcastFindFragment = this.f66653a;
                String str = musicPodcastFindFragment.f66642s;
                String str2 = musicPodcastFindFragment.f66643t;
                com.bilibili.music.podcast.data.a aVar = (com.bilibili.music.podcast.data.a) eVar2;
                p.e(str, str2, aVar.f66429a.f66457d, aVar.f66445r, musicPodcastFindFragment.f66644u);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$f.class */
    public static final class f implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastFindFragment f66655b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$f$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastFindFragment f66656a;

            public a(MusicPodcastFindFragment musicPodcastFindFragment) {
                this.f66656a = musicPodcastFindFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicPodcastFindFragment musicPodcastFindFragment = this.f66656a;
                musicPodcastFindFragment.f66649z.a(musicPodcastFindFragment.f66634k.N(i7, i8));
            }
        }

        public f(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66655b = musicPodcastFindFragment;
            this.f66654a = new a(musicPodcastFindFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66655b;
            RecyclerView recyclerView = musicPodcastFindFragment.f66799e;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66654a);
            }
            musicPodcastFindFragment.f66649z.b();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$g.class */
    public static final class g implements a<com.bilibili.music.podcast.data.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66657a;

        public g(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66657a = musicPodcastFindFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.d dVar) {
            com.bilibili.music.podcast.data.d dVar2 = dVar;
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66657a;
            musicPodcastFindFragment.lf();
            if (dVar2 == null) {
                musicPodcastFindFragment.qf(true);
                return;
            }
            musicPodcastFindFragment.qf(false);
            List<com.bilibili.music.podcast.data.e> list = dVar2.f66453a;
            musicPodcastFindFragment.f66637n = list;
            musicPodcastFindFragment.f66634k.submitList(list);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onError() {
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66657a;
            musicPodcastFindFragment.lf();
            musicPodcastFindFragment.qf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$h.class */
    public static final class h implements a<com.bilibili.music.podcast.data.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastFindFragment f66658a;

        public h(MusicPodcastFindFragment musicPodcastFindFragment) {
            this.f66658a = musicPodcastFindFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.d dVar) {
            com.bilibili.music.podcast.data.d dVar2 = dVar;
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66658a;
            musicPodcastFindFragment.f66634k.O(0);
            musicPodcastFindFragment.f66796b = false;
            if (dVar2 == null || dVar2.f66453a.isEmpty()) {
                musicPodcastFindFragment.f66797c = true;
            } else {
                musicPodcastFindFragment.f66637n.addAll(dVar2.f66453a);
                musicPodcastFindFragment.f66634k.submitList(musicPodcastFindFragment.f66637n);
            }
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.a
        public final void onError() {
            Resources resources;
            final MusicPodcastFindFragment musicPodcastFindFragment = this.f66658a;
            musicPodcastFindFragment.f66634k.O(0);
            HandlerThreads.postDelayed(0, new Runnable(musicPodcastFindFragment) { // from class: qi0.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicPodcastFindFragment f126013a;

                {
                    this.f126013a = musicPodcastFindFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f126013a.f66796b = false;
                }
            }, 100L);
            Context context = musicPodcastFindFragment.getContext();
            Context context2 = musicPodcastFindFragment.getContext();
            ToastHelper.showToastShort(context, (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(2131841717));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastFindFragment$i.class */
    public static final class i extends com.bilibili.music.podcast.moss.a<com.bilibili.music.podcast.data.d, PickFeedResp> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastFindFragment f66659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<com.bilibili.music.podcast.data.d> f66660c;

        public i(MusicPodcastFindFragment musicPodcastFindFragment, a<com.bilibili.music.podcast.data.d> aVar) {
            this.f66659b = musicPodcastFindFragment;
            this.f66660c = aVar;
        }

        @Override // com.bilibili.music.podcast.moss.a
        public final com.bilibili.music.podcast.data.d d(PickFeedResp pickFeedResp) {
            String str;
            PickFeedResp pickFeedResp2 = pickFeedResp;
            com.bilibili.music.podcast.data.d dVar = null;
            if (pickFeedResp2 != null) {
                this.f66659b.f66638o = pickFeedResp2.getOffset();
                List<PickCard> cardsList = pickFeedResp2.getCardsList();
                if (cardsList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (PickCard pickCard : cardsList) {
                        String cardName = pickCard.getCardName();
                        if (cardName != null && cardName.length() != 0) {
                            arrayList.add(new com.bilibili.music.podcast.data.c(pickCard.getPickId(), pickCard.getCardId(), pickCard.getCardName()));
                        }
                        Iterator it = pickCard.getModulesList().iterator();
                        int i7 = 0;
                        String str2 = "";
                        while (true) {
                            String str3 = str2;
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                CardModule cardModule = (CardModule) next;
                                if (cardModule.hasModuleHeader()) {
                                    String title = cardModule.getModuleHeader().getTitle();
                                    if (title == null) {
                                        title = "";
                                    }
                                    PkcmHeader moduleHeader = cardModule.getModuleHeader();
                                    arrayList.add(new com.bilibili.music.podcast.data.h(moduleHeader.getTitle(), pickCard.getPickId(), pickCard.getCardId(), moduleHeader.getDesc(), moduleHeader.getBtnIcon(), moduleHeader.getBtnText(), moduleHeader.getBtnUri()));
                                    str = title;
                                } else if (cardModule.hasModuleArchive()) {
                                    com.bilibili.music.podcast.data.a aVarA = a.C0380a.a(cardModule.getModuleArchive(), pickCard.getCardId(), pickCard.getPickId(), str3);
                                    aVarA.f66445r = i7 - 1;
                                    if (i7 == pickCard.getModulesCount() - 1) {
                                        aVarA.f66447t = true;
                                    }
                                    arrayList.add(aVarA);
                                    str = str3;
                                } else {
                                    str = str3;
                                    if (cardModule.hasModuleCbtn()) {
                                        PkcmCenterButton moduleCbtn = cardModule.getModuleCbtn();
                                        arrayList.add(new com.bilibili.music.podcast.data.g(pickCard.getCardId(), pickCard.getPickId(), moduleCbtn.getIconHead(), moduleCbtn.getIconTail(), moduleCbtn.getTitle(), moduleCbtn.getUri()));
                                        str = str3;
                                    }
                                }
                                i7++;
                                str2 = str;
                            }
                        }
                    }
                    dVar = new com.bilibili.music.podcast.data.d(arrayList);
                }
            }
            return dVar;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            MusicPodcastFindFragment musicPodcastFindFragment = this.f66659b;
            return musicPodcastFindFragment.isDetached() || musicPodcastFindFragment.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(Object obj) {
            this.f66660c.onDataSuccess((com.bilibili.music.podcast.data.d) obj);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            this.f66660c.onError();
        }
    }

    public MusicPodcastFindFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f66635l = LazyKt.lazy(lazyThreadSafetyMode, new Rs.d(this, 5));
        this.f66637n = new ArrayList();
        this.f66639p = true;
        new Bundle();
        this.f66642s = "";
        this.f66643t = "";
        this.f66644u = "";
        this.f66645v = LazyKt.lazy(lazyThreadSafetyMode, new Ns.c(this, 3));
        this.f66646w = LazyKt.lazy(lazyThreadSafetyMode, new x(this, 4));
        this.f66647x = LazyKt.lazy(lazyThreadSafetyMode, new j(this, 4));
        this.f66648y = new b(this);
        this.f66649z = new l<>(new e(this));
        this.f66632A = new d(this);
        this.f66633B = new f(this);
    }

    public final boolean canScrollUp() {
        return false;
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "listen.audio-list.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        String str = this.f66642s;
        String strOf = of();
        String str2 = this.f66644u;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", "find");
        String str3 = strOf;
        if (strOf == null) {
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
        return true;
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final void mf() {
        pf(false, (g) this.f66646w.getValue());
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final void nf() {
        HandlerThreads.post(0, new com.bilibili.bililive.biz.livehome.indexfeed.ui.live.home.topview.j(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String of() {
        /*
            r4 = this;
            r0 = r4
            android.os.Bundle r0 = r0.getArguments()
            r5 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r5
            java.lang.String r1 = "key_page_title"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            r6 = r0
            goto L1a
        L18:
            r0 = 0
            r6 = r0
        L1a:
            r0 = r6
            if (r0 == 0) goto L2d
            r0 = r6
            r5 = r0
            r0 = r6
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L2a
            goto L2d
        L2a:
            goto L52
        L2d:
            r0 = r4
            android.content.Context r0 = r0.getContext()
            r6 = r0
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L52
            r0 = r6
            android.content.res.Resources r0 = r0.getResources()
            r6 = r0
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L52
            r0 = r6
            r1 = 2131831735(0x7f112bb7, float:1.9296504E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L2a
            r0 = r7
            r5 = r0
        L52:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.MusicPodcastFindFragment.of():java.lang.String");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        FragmentActivity fragmentActivityP3;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 2131302935 || (fragmentActivityP3 = p3()) == null) {
            return;
        }
        fragmentActivityP3.finish();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("from_spmid");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f66642s = str;
            String string2 = arguments.getString("from_route");
            String str2 = string2;
            if (string2 == null) {
                str2 = "";
            }
            this.f66643t = str2;
            String string3 = arguments.getString(GameCardButton.extraParamSource);
            if (string3 == null) {
                string3 = "";
            }
            this.f66644u = string3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499514, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.f66799e;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f66632A);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f66639p) {
            MusicNormalLoadView musicNormalLoadView = this.f66636m;
            MusicNormalLoadView musicNormalLoadView2 = musicNormalLoadView;
            if (musicNormalLoadView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
                musicNormalLoadView2 = null;
            }
            musicNormalLoadView2.a(1);
            pf(false, (c) this.f66645v.getValue());
            this.f66639p = false;
        }
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setPadding(view.getPaddingLeft(), ((Number) this.f66635l.getValue()).intValue() + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        this.f66641r = (TextView) view.findViewById(2131308958);
        View viewFindViewById = view.findViewById(2131302935);
        this.f66640q = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        String strOf = of();
        TextView textView = this.f66641r;
        if (textView != null) {
            textView.setText(strOf);
        }
        MusicNormalLoadView musicNormalLoadView = (MusicNormalLoadView) view.findViewById(2131305806);
        this.f66636m = musicNormalLoadView;
        MusicNormalLoadView musicNormalLoadView2 = musicNormalLoadView;
        if (musicNormalLoadView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadView");
            musicNormalLoadView2 = null;
        }
        Pa.j jVar = new Pa.j(this, 4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
        MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499545);
        aVar.a(2131310274, jVar);
        linkedHashMap.put(2, aVar);
        musicNormalLoadView2.setLoadContent(linkedHashMap);
        RecyclerView recyclerView = this.f66799e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setAdapter(this.f66634k);
            recyclerView.addOnScrollListener(this.f66632A);
        }
        C7325f c7325f = this.f66634k.f120304b;
        MusicPagerReportData musicPagerReportData = new MusicPagerReportData();
        musicPagerReportData.f66423b = this.f66642s;
        musicPagerReportData.f66427f = this.f66643t;
        musicPagerReportData.f66428g = this.f66644u;
        c7325f.f120309b = musicPagerReportData;
        this.f66634k.f120307e = this.f66633B;
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().a(this, this.f66648y);
    }

    public final void pf(boolean z6, a<com.bilibili.music.podcast.data.d> aVar) {
        long j7 = z6 ? this.f66638o : 0L;
        i iVar = new i(this, aVar);
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).pickFeed(PickFeedReq.newBuilder().setOffset(j7).build(), new com.bilibili.music.podcast.moss.d(iVar, iVar));
    }

    public final void qf(boolean z6) {
        MusicNormalLoadView musicNormalLoadView = null;
        if (z6) {
            MusicNormalLoadView musicNormalLoadView2 = this.f66636m;
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
        MusicNormalLoadView musicNormalLoadView3 = this.f66636m;
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
