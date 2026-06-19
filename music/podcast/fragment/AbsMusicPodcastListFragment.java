package com.bilibili.music.podcast.fragment;

import Ki0.j;
import Ki0.k;
import Ki0.o;
import Ki0.q;
import Ki0.r;
import Si0.c;
import Ui0.C2908a;
import Ui0.C2910c;
import Ui0.C2911d;
import Yi0.C3136e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.bus.Violet;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.moss.api.NetworkException;
import com.bilibili.lib.theme.R$color;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.data.s;
import com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment;
import com.bilibili.music.podcast.utils.I;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.MusicViewPager2LoadView;
import gi0.AbstractC7320a;
import hi0.AbstractC7445c;
import java.util.LinkedHashMap;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.C8431a;
import qi0.C8432b;
import qi0.C8433c;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment.class */
public abstract class AbsMusicPodcastListFragment extends BaseLoadFragment implements Ah1.b, Ci0.f, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MusicViewPager2LoadView f66499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewPager2 f66500e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C2910c f66502g;
    public boolean h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f66504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f66505k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f66507m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final I f66501f = new I();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Bundle f66503i = new Bundle();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C3136e f66506l = new C3136e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final c f66508n = new c(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final e f66509o = new e(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final h f66510p = new h(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f66511q = new b(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final f f66512r = new f(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final d f66513s = new d(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final g f66514t = new g(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final C8431a f66515u = new PassportObserver(this) { // from class: qi0.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f126003a;

        {
            this.f126003a = this;
        }

        public final void onChange(Topic topic) {
            if ((topic == null ? -1 : AbsMusicPodcastListFragment.a.f66516a[topic.ordinal()]) == 1) {
                this.f126003a.h = true;
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66516a;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f66516a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$b.class */
    public static final class b extends OnBackPressedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            super(true);
            this.f66517a = absMusicPodcastListFragment;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            AbsMusicPodcastListFragment absMusicPodcastListFragment = this.f66517a;
            C2910c c2910c = absMusicPodcastListFragment.f66502g;
            if (c2910c != null) {
                C2908a c2908a = (C2908a) c2910c.f24749a.getValue();
                if (c2908a.c()) {
                    rg.b bVar = c2908a.h;
                    if (bVar == null || !(bVar.a("comment2.page.dialogue") || bVar.a("comment2.page.detail"))) {
                        c2908a.b();
                        return;
                    }
                    return;
                }
            }
            FragmentActivity fragmentActivityP3 = absMusicPodcastListFragment.p3();
            if (fragmentActivityP3 != null) {
                fragmentActivityP3.finish();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$c.class */
    public static final class c implements com.bilibili.music.podcast.view.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66518a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$c$a.class */
        public static final class a implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbsMusicPodcastListFragment f66519a;

            public a(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
                this.f66519a = absMusicPodcastListFragment;
            }

            @Override // Ki0.o
            public final void a(r rVar) {
                AbsMusicPodcastListFragment.jf(this.f66519a, rVar);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$c$b.class */
        public static final class b implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbsMusicPodcastListFragment f66520a;

            public b(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
                this.f66520a = absMusicPodcastListFragment;
            }

            @Override // Ki0.o
            public final void a(r rVar) {
                AbsMusicPodcastListFragment.jf(this.f66520a, rVar);
            }
        }

        public c(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66518a = absMusicPodcastListFragment;
        }

        @Override // com.bilibili.music.podcast.view.i
        public final void a() {
            AbsMusicPodcastListFragment absMusicPodcastListFragment = this.f66518a;
            j jVarG = absMusicPodcastListFragment.mf().g();
            if (jVarG != null) {
                jVarG.d(new q(1, 4, false, false), new b(absMusicPodcastListFragment));
            }
        }

        @Override // com.bilibili.music.podcast.view.i
        public final void b() {
            AbsMusicPodcastListFragment absMusicPodcastListFragment = this.f66518a;
            j jVarG = absMusicPodcastListFragment.mf().g();
            if (jVarG != null) {
                jVarG.d(new q(0, 4, false, false), new a(absMusicPodcastListFragment));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$d.class */
    public static final class d implements C3136e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66521a;

        public d(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66521a = absMusicPodcastListFragment;
        }

        @Override // Yi0.C3136e.a
        public final <T extends IPlayerService> void bindService(PlayerServiceManager.ServiceDescriptor<T> serviceDescriptor, PlayerServiceManager.Client<T> client) {
            this.f66521a.mf().bindService(serviceDescriptor, client);
        }

        @Override // Yi0.C3136e.a
        public final <T extends IPlayerService> void unbindService(PlayerServiceManager.ServiceDescriptor<T> serviceDescriptor, PlayerServiceManager.Client<T> client) {
            this.f66521a.mf().unbindService(serviceDescriptor, client);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$e.class */
    public static final class e implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66522a;

        public e(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66522a = absMusicPodcastListFragment;
        }

        @Override // Si0.c.b
        public final void a(MusicPlayItem musicPlayItem) {
            C2910c c2910c = this.f66522a.f66502g;
            if (c2910c == null) {
                return;
            }
            c2910c.a(musicPlayItem);
        }

        @Override // Si0.c.b
        public final void onDismiss() {
            C2910c c2910c = this.f66522a.f66502g;
            if (c2910c != null) {
                ((C2908a) c2910c.f24749a.getValue()).b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$f.class */
    public static final class f extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66523a;

        public f(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66523a = absMusicPodcastListFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i7) {
            super.onPageSelected(i7);
            AbsMusicPodcastListFragment absMusicPodcastListFragment = this.f66523a;
            if (absMusicPodcastListFragment.f66507m != i7) {
                absMusicPodcastListFragment.f66506l.a();
            }
            absMusicPodcastListFragment.f66507m = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$g.class */
    public static final class g implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66524a;

        public g(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66524a = absMusicPodcastListFragment;
        }

        @Override // Ki0.k
        public final void c(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Bundle bundle) {
            MusicPlayItem musicPlayItemA;
            AbsMusicPodcastListFragment absMusicPodcastListFragment = this.f66524a;
            j jVarG = absMusicPodcastListFragment.mf().g();
            if (jVarG != null) {
                jVarG.A();
            }
            j jVarG2 = absMusicPodcastListFragment.mf().g();
            if (jVarG2 == null || (musicPlayItemA = jVarG2.a()) == null || !Intrinsics.areEqual(String.valueOf(musicPlayItemA.getOid()), absMusicPodcastListFragment.lf().d(null))) {
                return;
            }
            s sVarF = absMusicPodcastListFragment.lf().f();
            sVarF.f66495a = musicPlayItemA.getOid();
            sVarF.f66496b = musicPlayItemA.getSid();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$h.class */
    public static final class h implements C2910c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66525a;

        public h(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66525a = absMusicPodcastListFragment;
        }

        @Override // Ui0.C2910c.a
        public final void a(int i7) {
            this.f66525a.mf().v(i7);
        }

        @Override // Ui0.C2910c.a
        public final MusicPagerReportData b() {
            return this.f66525a.lf().a();
        }

        @Override // Ui0.C2910c.a
        public final void c(long j7, long j8) {
            Violet.INSTANCE.setValue(new C2911d(j7, j8));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastListFragment$i.class */
    public static final class i implements MusicNormalLoadView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastListFragment f66526a;

        public i(AbsMusicPodcastListFragment absMusicPodcastListFragment) {
            this.f66526a = absMusicPodcastListFragment;
        }

        @Override // com.bilibili.music.podcast.view.MusicNormalLoadView.b
        public final void a(int i7, View view) {
            if (i7 == 1) {
                ((TextView) view.findViewById(2131305832)).setTextColor(ContextCompat.getColor(this.f66526a.requireContext(), R$color.Wh0_u));
            }
        }
    }

    public static final void jf(AbsMusicPodcastListFragment absMusicPodcastListFragment, r rVar) {
        String string;
        MusicViewPager2LoadView musicViewPager2LoadView = absMusicPodcastListFragment.f66499d;
        if (musicViewPager2LoadView != null) {
            musicViewPager2LoadView.a(0, false, true);
        }
        int i7 = rVar.f12932a;
        if (i7 == 2) {
            absMusicPodcastListFragment.of(rVar);
            return;
        }
        if (i7 != 3) {
            return;
        }
        if (rVar.f12934c instanceof NetworkException) {
            string = absMusicPodcastListFragment.requireContext().getString(2131846486);
        } else {
            absMusicPodcastListFragment.requireContext().getString(2131841717);
            string = "";
        }
        ToastHelper.showToast(absMusicPodcastListFragment.requireContext(), string, 0);
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public abstract AbstractC7320a kf();

    @NotNull
    public abstract com.bilibili.music.podcast.data.j lf();

    @NotNull
    public abstract Li0.d mf();

    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // Ci0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nd() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment.nd():void");
    }

    public final void nf() {
        AbstractC7320a abstractC7320aKf = kf();
        abstractC7320aKf.f120286e = null;
        abstractC7320aKf.f120285d.clear();
        abstractC7320aKf.f120288g = null;
        abstractC7320aKf.submitList(null);
        j jVarG = mf().g();
        if (jVarG != null) {
            jVarG.d(new q(0, 4, true, false), new C8432b(this));
        }
    }

    public final void of(@NotNull r rVar) {
        MusicViewPager2LoadView musicViewPager2LoadView = this.f66499d;
        if (musicViewPager2LoadView != null && musicViewPager2LoadView.f67152q) {
            musicViewPager2LoadView.setEnableRefresh(rVar.f12936e);
        }
        MusicViewPager2LoadView musicViewPager2LoadView2 = this.f66499d;
        if (musicViewPager2LoadView2 == null || !musicViewPager2LoadView2.f67153r) {
            return;
        }
        musicViewPager2LoadView2.setEnableLoadMore(rVar.f12935d);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        AbstractC7445c abstractC7445cN;
        super.onActivityResult(i7, i8, intent);
        AbstractC7320a abstractC7320a = this.f66501f.f66919b;
        if (abstractC7320a == null || (abstractC7445cN = abstractC7320a.N(abstractC7320a.f120286e)) == null) {
            return;
        }
        abstractC7445cN.t0(i7, i8, intent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131307597) {
            ViewPager2 viewPager2 = this.f66500e;
            int currentItem = viewPager2 != null ? viewPager2.getCurrentItem() : -1;
            AbstractC7320a abstractC7320aKf = kf();
            MusicPlayVideo musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(abstractC7320aKf.getCurrentList(), currentItem);
            if (musicPlayVideo == null) {
                return;
            }
            AbstractC7445c abstractC7445cN = abstractC7320aKf.N(abstractC7320aKf.f120286e);
            int iR0 = abstractC7445cN != null ? abstractC7445cN.r0() : 0;
            p.c(musicPlayVideo, lf().a(), "threepoint", "video");
            int itemType = musicPlayVideo.getItemType();
            if (itemType == 1 || itemType == 3) {
                this.f66506l.c(ContextUtilKt.findFragmentActivityOrNull(view.getContext()), (MusicPlayItem) CollectionsKt.getOrNull(musicPlayVideo.getParts(), iR0), lf().a(), this.f66513s);
            } else {
                ToastHelper.showToast(BiliContext.application(), 2131846569, 0);
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            lf().b(arguments);
            String str = lf().a().f66423b;
            if (str != null) {
                this.f66503i.putString("from_spmid", str);
            }
            String str2 = lf().a().h;
            if (str2 != null) {
                this.f66503i.putString("from_module", str2);
            }
            Integer integer = BundleUtil.getInteger(arguments, GameCardButton.extraParamSource, new Integer[]{-1});
            if ((integer != null && integer.intValue() == 8) || (integer != null && integer.intValue() == 1)) {
                Integer integer2 = BundleUtil.getInteger(arguments, "list_mode", new Integer[]{Integer.valueOf(Ei0.b.a("pref_music_podcast_player_completion_action_key", 4))});
                int iA = Ei0.b.a("pref_music_podcast_player_completion_action_key", 4);
                if (integer2 == null || integer2.intValue() != iA) {
                    mf().y(integer2.intValue());
                }
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499520, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    @CallSuper
    public final void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = this.f66500e;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f66512r);
        }
        BiliAccounts.get(BiliContext.application()).unsubscribe(this.f66515u, new Topic[]{Topic.SIGN_IN});
        j jVarG = mf().g();
        if (jVarG != null) {
            jVarG.x(this.f66514t);
        }
        this.f66501f.e();
        mf().c();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Pi0.d dVarL;
        super.onViewCreated(view, bundle);
        this.f66504j = (ViewGroup) view.findViewById(2131306968);
        this.f66498c = (MusicNormalLoadView) view.findViewById(2131305806);
        this.f66499d = (MusicViewPager2LoadView) view.findViewById(2131316343);
        this.f66500e = (ViewPager2) view.findViewById(2131301482);
        this.f66505k = requireActivity().findViewById(2131307597);
        ViewPager2 viewPager2 = this.f66500e;
        if (viewPager2 != null) {
            viewPager2.setAdapter(kf());
        }
        ViewPager2 viewPager22 = this.f66500e;
        if (viewPager22 != null) {
            viewPager22.setOffscreenPageLimit(2);
        }
        ViewPager2 viewPager23 = this.f66500e;
        if (viewPager23 != null) {
            viewPager23.registerOnPageChangeCallback(this.f66512r);
        }
        View view2 = this.f66505k;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        kf().f120289i = this.f66509o;
        Li0.d dVarMf = mf();
        dVarMf.getClass();
        dVarMf.p(requireActivity());
        Lifecycle lifecycle = getLifecycle();
        dVarMf.f14660f = lifecycle;
        lifecycle.addObserver(dVarMf);
        j jVarG = dVarMf.g();
        if (jVarG != null && (dVarL = dVarMf.l()) != null) {
            dVarL.d(jVarG);
        }
        I i7 = this.f66501f;
        Context contextRequireContext = requireContext();
        Li0.d dVarMf2 = mf();
        ViewPager2 viewPager24 = this.f66500e;
        ViewGroup viewGroup = this.f66504j;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            viewGroup2 = null;
        }
        i7.d(contextRequireContext, this, dVarMf2, viewPager24, viewGroup2, lf());
        mf().f14661g = new C8433c(this);
        j jVarG2 = mf().g();
        if (jVarG2 != null) {
            jVarG2.q(this.f66514t);
        }
        MusicViewPager2LoadView musicViewPager2LoadView = this.f66499d;
        if (musicViewPager2LoadView != null) {
            musicViewPager2LoadView.setListener(this.f66508n);
        }
        this.f66502g = new C2910c(requireActivity(), (ViewGroup) view.findViewById(2131307714), this.f66510p);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), this.f66511q);
        MusicNormalLoadView musicNormalLoadView = this.f66498c;
        if (musicNormalLoadView != null) {
            H60.I i8 = new H60.I(this, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499542);
            aVar.a(2131310274, i8);
            linkedHashMap.put(2, aVar);
            musicNormalLoadView.setLoadContent(linkedHashMap);
        }
        MusicNormalLoadView musicNormalLoadView2 = this.f66498c;
        if (musicNormalLoadView2 != null) {
            musicNormalLoadView2.setLoadViewShowListener(new i(this));
        }
        BiliAccounts.get(BiliContext.application()).subscribe(this.f66515u, new Topic[]{Topic.SIGN_IN});
    }
}
