package com.bilibili.music.podcast.fragment;

import AK0.s;
import K7.O;
import Pa.v;
import Pa.w;
import Pa.z;
import Qi0.C2832b;
import Vi0.C2955b;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.PlayHistoryReq;
import com.bapis.bilibili.pagination.Pagination;
import com.bilibili.app.comm.comment2.comments.view.L;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.commons.time.FastDateFormat;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.utils.H;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import com.bilibili.music.podcast.utils.l;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.utils.q;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import com.bilibili.pvtracker.IPvTracker;
import gI0.ViewOnClickListenerC7256f;
import gi0.C7301E;
import gi0.C7304H;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment.class */
public final class MusicPodcastHistoryFragment extends SwipeRefreshFragment implements View.OnClickListener, IPvTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final e f66661A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final g f66662B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Nt.a f66663C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Lazy f66664D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final b f66665E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f66666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ImageView f66667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66668m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66670o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f66675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public String f66676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public String f66677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f66678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f66679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f66680y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final l<MusicPlayVideo> f66681z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f66669n = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f66671p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f66672q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f66673r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final C7304H f66674s = new C7304H();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$a.class */
    public interface a<T> {
        void onDataSuccess(@Nullable T t7);

        void onError();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$b.class */
    public static final class b implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66682a;

        public b(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66682a = musicPodcastHistoryFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            RecyclerView recyclerView = this.f66682a.f66799e;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i7 == 1 ? 0 : recyclerView.getContext().getResources().getDimensionPixelSize(2131166703));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$c.class */
    public static final class c implements a<com.bilibili.music.podcast.data.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66683a;

        public c(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66683a = musicPodcastHistoryFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.i iVar) {
            MusicPodcastHistoryFragment.of(this.f66683a, iVar);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onError() {
            this.f66683a.qf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$d.class */
    public static final class d implements Function2<MusicPlayVideo, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66684a;

        public d(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66684a = musicPodcastHistoryFragment;
        }

        public final Object invoke(Object obj, Object obj2) {
            MusicPlayVideo musicPlayVideo = (MusicPlayVideo) obj;
            int iIntValue = ((Number) obj2).intValue();
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66684a;
            p.d(musicPodcastHistoryFragment.f66671p, musicPodcastHistoryFragment.f66672q, musicPlayVideo.getEventTracking(), iIntValue, musicPodcastHistoryFragment.f66673r);
            String notPlayMessage = musicPlayVideo.getNotPlayMessage();
            String str = notPlayMessage;
            if (notPlayMessage == null) {
                str = "";
            }
            if (musicPlayVideo.getPlayable() < 0) {
                String string = str;
                if (StringsKt.isBlank(str)) {
                    string = musicPodcastHistoryFragment.getResources().getString(2131841518);
                }
                ToastHelper.showToastShort(musicPodcastHistoryFragment.getContext(), string);
            } else if (musicPlayVideo.getPlayable() > 0) {
                String string2 = str;
                if (StringsKt.isBlank(str)) {
                    string2 = musicPodcastHistoryFragment.getResources().getString(2131846164);
                }
                ToastHelper.showToastShort(musicPodcastHistoryFragment.getContext(), string2);
            } else {
                C2832b.a(musicPlayVideo, "data_history_item");
                FragmentActivity fragmentActivityP3 = musicPodcastHistoryFragment.p3();
                if (fragmentActivityP3 != null) {
                    fragmentActivityP3.setResult(-1);
                }
                FragmentActivity fragmentActivityP32 = musicPodcastHistoryFragment.p3();
                if (fragmentActivityP32 != null) {
                    fragmentActivityP32.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$e.class */
    public static final class e extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66685a;

        public e(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66685a = musicPodcastHistoryFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            g gVar = this.f66685a.f66662B;
            if (i7 == 0) {
                gVar.f66688b.f66681z.b();
            } else {
                gVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            g gVar = this.f66685a.f66662B;
            RecyclerView recyclerView2 = gVar.f66688b.f66799e;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, gVar.f66687a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$f.class */
    public static final class f implements InterfaceC5426f<MusicPlayVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66686a;

        public f(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66686a = musicPodcastHistoryFragment;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            return (musicPlayVideo2.getEventTracking() == null || musicPlayVideo2.isReported()) ? false : true;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66686a;
            p.e(musicPodcastHistoryFragment.f66671p, musicPodcastHistoryFragment.f66672q, musicPlayVideo2.getEventTracking(), musicPlayVideo2.getReportPosition(), musicPodcastHistoryFragment.f66673r);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$g.class */
    public static final class g implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66688b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$g$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastHistoryFragment f66689a;

            public a(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
                this.f66689a = musicPodcastHistoryFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66689a;
                l<MusicPlayVideo> lVar = musicPodcastHistoryFragment.f66681z;
                C7304H c7304h = musicPodcastHistoryFragment.f66674s;
                c7304h.getClass();
                ArrayList arrayList = new ArrayList();
                if (i7 <= i8) {
                    while (true) {
                        MusicPlayVideo musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(c7304h.f120109b, i7);
                        if (musicPlayVideo != null && !musicPlayVideo.isReported()) {
                            arrayList.add(musicPlayVideo);
                        }
                        if (i7 == i8) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                lVar.a(arrayList);
            }
        }

        public g(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66688b = musicPodcastHistoryFragment;
            this.f66687a = new a(musicPodcastHistoryFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66688b;
            RecyclerView recyclerView = musicPodcastHistoryFragment.f66799e;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66687a);
            }
            musicPodcastHistoryFragment.f66681z.b();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$h.class */
    public static final class h implements a<com.bilibili.music.podcast.data.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66690a;

        public h(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66690a = musicPodcastHistoryFragment;
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.i iVar) {
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66690a;
            musicPodcastHistoryFragment.lf();
            MusicPodcastHistoryFragment.of(musicPodcastHistoryFragment, iVar);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onError() {
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66690a;
            musicPodcastHistoryFragment.lf();
            musicPodcastHistoryFragment.qf(true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastHistoryFragment$i.class */
    public static final class i implements a<com.bilibili.music.podcast.data.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastHistoryFragment f66691a;

        public i(MusicPodcastHistoryFragment musicPodcastHistoryFragment) {
            this.f66691a = musicPodcastHistoryFragment;
        }

        /* JADX WARN: Type inference failed for: r0v16, types: [androidx.recyclerview.widget.RecyclerView$Adapter, gi0.H, java.lang.Object] */
        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onDataSuccess(com.bilibili.music.podcast.data.i iVar) {
            C7301E c7301e;
            com.bilibili.music.podcast.data.i iVar2 = iVar;
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66691a;
            musicPodcastHistoryFragment.f66796b = false;
            boolean z6 = false;
            if (iVar2 != null) {
                z6 = false;
                if (iVar2.f66471a) {
                    z6 = true;
                }
            }
            musicPodcastHistoryFragment.f66670o = z6;
            List<MusicPlayVideo> list = iVar2 != null ? iVar2.f66472b : null;
            if (list == null || list.isEmpty()) {
                musicPodcastHistoryFragment.f66797c = true;
                return;
            }
            ?? r02 = musicPodcastHistoryFragment.f66674s;
            List<MusicPlayVideo> list2 = iVar2.f66472b;
            r02.getClass();
            if (list2 != null && !((ArrayList) list2).isEmpty()) {
                r02.f120109b.addAll(list2);
                r02.notifyDataSetChanged();
            }
            if (!musicPodcastHistoryFragment.f66670o || (c7301e = musicPodcastHistoryFragment.f66674s.f120301a) == null) {
                return;
            }
            c7301e.setupView(3);
        }

        @Override // com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.a
        public final void onError() {
            MusicPodcastHistoryFragment musicPodcastHistoryFragment = this.f66691a;
            C7301E c7301e = musicPodcastHistoryFragment.f66674s.f120301a;
            if (c7301e != null) {
                c7301e.setupView(2);
            }
            HandlerThreads.postDelayed(0, new Vc.d(musicPodcastHistoryFragment, 3), 100L);
        }
    }

    public MusicPodcastHistoryFragment() {
        new Bundle();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f66675t = LazyKt.lazy(lazyThreadSafetyMode, new s(this, 9));
        this.f66676u = "";
        this.f66677v = "";
        this.f66678w = LazyKt.lazy(lazyThreadSafetyMode, new v(this, 2));
        this.f66679x = LazyKt.lazy(lazyThreadSafetyMode, new w(this, 4));
        this.f66680y = LazyKt.lazy(lazyThreadSafetyMode, new AL.c(this, 5));
        this.f66681z = new l<>(new f(this));
        this.f66661A = new e(this);
        this.f66662B = new g(this);
        this.f66663C = new Nt.a(this, 5);
        this.f66664D = LazyKt.lazy(lazyThreadSafetyMode, new z(this, 3));
        this.f66665E = new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView$Adapter, gi0.H, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void of(com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment r3, com.bilibili.music.podcast.data.i r4) {
        /*
            r0 = r4
            if (r0 == 0) goto L16
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r0 = r4
            boolean r0 = r0.f66471a
            r1 = 1
            if (r0 != r1) goto L16
            r0 = 1
            r5 = r0
            goto L18
        L16:
            r0 = 0
            r5 = r0
        L18:
            r0 = r3
            r1 = r5
            r0.f66670o = r1
            r0 = r4
            if (r0 == 0) goto L29
            r0 = r4
            java.util.List<com.bilibili.music.podcast.data.MusicPlayVideo> r0 = r0.f66472b
            r6 = r0
            goto L2b
        L29:
            r0 = 0
            r6 = r0
        L2b:
            r0 = r6
            if (r0 != 0) goto L37
            r0 = r3
            r1 = 1
            r0.qf(r1)
            goto L70
        L37:
            r0 = r3
            r1 = 0
            r0.qf(r1)
            r0 = r3
            gi0.H r0 = r0.f66674s
            r3 = r0
            r0 = r4
            java.util.List<com.bilibili.music.podcast.data.MusicPlayVideo> r0 = r0.f66472b
            r4 = r0
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r0 = r4
            if (r0 == 0) goto L70
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            goto L70
        L5c:
            r0 = r3
            java.util.ArrayList<com.bilibili.music.podcast.data.MusicPlayVideo> r0 = r0.f120109b
            r0.clear()
            r0 = r3
            java.util.ArrayList<com.bilibili.music.podcast.data.MusicPlayVideo> r0 = r0.f120109b
            r1 = r4
            boolean r0 = r0.addAll(r1)
            r0 = r3
            r0.notifyDataSetChanged()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment.of(com.bilibili.music.podcast.fragment.MusicPodcastHistoryFragment, com.bilibili.music.podcast.data.i):void");
    }

    public static void pf(MusicPodcastHistoryFragment musicPodcastHistoryFragment, boolean z6, int i7, a aVar, int i8) {
        if ((i8 & 1) != 0) {
            z6 = false;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if (musicPodcastHistoryFragment.f66670o) {
            musicPodcastHistoryFragment.lf();
            return;
        }
        String str = "";
        if (z6) {
            musicPodcastHistoryFragment.f66676u = "";
            musicPodcastHistoryFragment.f66677v = "";
        }
        if (!z6) {
            if (i7 == 0) {
                str = musicPodcastHistoryFragment.f66677v;
            } else if (i7 == 1) {
                str = musicPodcastHistoryFragment.f66676u;
            }
        }
        Pagination paginationBuild = Pagination.newBuilder().setPageSize(20).setNext(str).build();
        FastDateFormat fastDateFormat = H.f66914a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        long jA = O.a(calendar, 13, 0, 14, 0) / ((long) 1000);
        com.bilibili.music.podcast.fragment.a aVar2 = new com.bilibili.music.podcast.fragment.a(musicPodcastHistoryFragment, z6, i7, aVar);
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).playHistory(PlayHistoryReq.newBuilder().setPagination(paginationBuild).setLocalTodayZero(jA).build(), new com.bilibili.music.podcast.moss.d(aVar2, aVar2));
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "listen.audio-list.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        CharSequence text;
        String str = this.f66671p;
        TextView textView = this.f66666k;
        String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
        String str2 = this.f66673r;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", "history");
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
    public final int jf() {
        return 0;
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final boolean kf() {
        return true;
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final void mf() {
        pf(this, false, 1, (h) this.f66679x.getValue(), 1);
    }

    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment
    public final void nf() {
        HandlerThreads.post(0, new L(this, 2));
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
            this.f66671p = str;
            String string2 = arguments.getString("from_route");
            String str2 = string2;
            if (string2 == null) {
                str2 = "";
            }
            this.f66672q = str2;
            String string3 = arguments.getString(GameCardButton.extraParamSource);
            if (string3 == null) {
                string3 = "";
            }
            this.f66673r = string3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131497843, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f66669n) {
            MusicNormalLoadView musicNormalLoadView = this.f66668m;
            if (musicNormalLoadView != null) {
                musicNormalLoadView.a(1);
            }
            pf(this, true, 0, (c) this.f66678w.getValue(), 2);
            this.f66669n = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.music.podcast.fragment.SwipeRefreshFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setPadding(view.getPaddingLeft(), ((Number) this.f66675t.getValue()).intValue() + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        this.f66666k = (TextView) view.findViewById(2131308958);
        this.f66667l = (ImageView) view.findViewById(2131302935);
        TextView textView = this.f66666k;
        if (textView != null) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("key_page_title", "") : null;
            if (string == null || StringsKt.isBlank(string)) {
                Context context = getContext();
                string = null;
                if (context != null) {
                    Resources resources = context.getResources();
                    string = null;
                    if (resources != null) {
                        string = resources.getString(2131831735);
                    }
                }
            }
            textView.setText(string);
        }
        MusicNormalLoadView musicNormalLoadView = (MusicNormalLoadView) view.findViewById(2131305806);
        this.f66668m = musicNormalLoadView;
        if (musicNormalLoadView != null) {
            ViewOnClickListenerC7256f viewOnClickListenerC7256f = new ViewOnClickListenerC7256f(this, 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499545);
            aVar.a(2131310274, viewOnClickListenerC7256f);
            linkedHashMap.put(2, aVar);
            musicNormalLoadView.setLoadContent(linkedHashMap);
        }
        ImageView imageView = this.f66667l;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        RecyclerView recyclerView = this.f66799e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setAdapter(this.f66674s);
            recyclerView.addOnScrollListener(this.f66661A);
        }
        C7304H c7304h = this.f66674s;
        c7304h.f120111d = this.f66663C;
        c7304h.f120112e = this.f66662B;
        c7304h.f120110c = (d) this.f66664D.getValue();
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().a(this, this.f66665E);
    }

    public final void qf(boolean z6) {
        if (z6) {
            MusicNormalLoadView musicNormalLoadView = this.f66668m;
            if (musicNormalLoadView != null) {
                musicNormalLoadView.a(2);
            }
            SwipeRefreshLayout swipeRefreshLayout = this.f66798d;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setVisibility(8);
                return;
            }
            return;
        }
        MusicNormalLoadView musicNormalLoadView2 = this.f66668m;
        if (musicNormalLoadView2 != null) {
            musicNormalLoadView2.a(Integer.MIN_VALUE);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f66798d;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setVisibility(0);
        }
    }
}
