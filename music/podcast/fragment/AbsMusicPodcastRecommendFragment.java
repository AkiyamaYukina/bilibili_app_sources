package com.bilibili.music.podcast.fragment;

import Ki0.j;
import Ki0.o;
import Ki0.q;
import Li0.s;
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
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.base.BiliContext;
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
import com.bilibili.music.podcast.data.r;
import com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment;
import com.bilibili.music.podcast.utils.I;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.view.MusicCommentCoordinatorLayout;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.MusicViewPager2LoadView;
import gi0.AbstractC7320a;
import gi0.C7309M;
import hi0.AbstractC7445c;
import java.util.LinkedHashMap;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.C8434d;
import qi0.C8435e;
import qi0.C8436f;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment.class */
public abstract class AbsMusicPodcastRecommendFragment extends BaseLoadFragment implements PageAdapter.Page, Ah1.b, Ci0.f, View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MusicViewPager2LoadView f66528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewPager2 f66529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public View f66530f;
    public ViewGroup h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public C2910c f66535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MusicCommentCoordinatorLayout f66536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f66537n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f66540q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C3136e f66531g = new C3136e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f66532i = LazyKt.lazy(new Rk0.a(this, 4));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final s f66533j = new Li0.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final I f66534k = new I();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final r f66538o = new r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Bundle f66539p = new Bundle();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final c f66541r = new c(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final e f66542s = new e(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f66543t = new h(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final f f66544u = new f(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final b f66545v = new b(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final C8434d f66546w = new PassportObserver(this) { // from class: qi0.d

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f126006a;

        {
            this.f126006a = this;
        }

        public final void onChange(Topic topic) {
            if ((topic == null ? -1 : AbsMusicPodcastRecommendFragment.a.f66549a[topic.ordinal()]) == 1) {
                this.f126006a.f66537n = true;
            }
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final g f66547x = new g(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final d f66548y = new d(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66549a;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f66549a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$b.class */
    public static final class b extends OnBackPressedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66550a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            super(true);
            this.f66550a = absMusicPodcastRecommendFragment;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment = this.f66550a;
            C2910c c2910c = absMusicPodcastRecommendFragment.f66535l;
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
            FragmentActivity fragmentActivityP3 = absMusicPodcastRecommendFragment.p3();
            if (fragmentActivityP3 != null) {
                fragmentActivityP3.finish();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$c.class */
    public static final class c implements com.bilibili.music.podcast.view.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66551a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$c$a.class */
        public static final class a implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbsMusicPodcastRecommendFragment f66552a;

            public a(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
                this.f66552a = absMusicPodcastRecommendFragment;
            }

            @Override // Ki0.o
            public final void a(Ki0.r rVar) {
                String string;
                AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment = this.f66552a;
                MusicViewPager2LoadView musicViewPager2LoadView = absMusicPodcastRecommendFragment.f66528d;
                if (musicViewPager2LoadView != null) {
                    musicViewPager2LoadView.a(0, false, true);
                }
                int i7 = rVar.f12932a;
                if (i7 == 3) {
                    if (rVar.f12934c instanceof NetworkException) {
                        string = absMusicPodcastRecommendFragment.requireContext().getString(2131846486);
                    } else {
                        absMusicPodcastRecommendFragment.requireContext().getString(2131841717);
                        string = "";
                    }
                    ToastHelper.showToast(absMusicPodcastRecommendFragment.requireContext(), string, 0);
                    return;
                }
                if (i7 != 5) {
                    return;
                }
                MusicViewPager2LoadView musicViewPager2LoadView2 = absMusicPodcastRecommendFragment.f66528d;
                if (musicViewPager2LoadView2 != null && musicViewPager2LoadView2.f67152q) {
                    musicViewPager2LoadView2.setEnableRefresh(rVar.f12936e);
                }
                MusicViewPager2LoadView musicViewPager2LoadView3 = absMusicPodcastRecommendFragment.f66528d;
                if (musicViewPager2LoadView3 == null || !musicViewPager2LoadView3.f67153r) {
                    return;
                }
                musicViewPager2LoadView3.setEnableLoadMore(rVar.f12935d);
            }
        }

        public c(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66551a = absMusicPodcastRecommendFragment;
        }

        @Override // com.bilibili.music.podcast.view.i
        public final void b() {
            AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment = this.f66551a;
            j jVarG = absMusicPodcastRecommendFragment.f66533j.g();
            if (jVarG != null) {
                jVarG.d(new q(0, 6, false, false), new a(absMusicPodcastRecommendFragment));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$d.class */
    public static final class d implements C3136e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66553a;

        public d(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66553a = absMusicPodcastRecommendFragment;
        }

        @Override // Yi0.C3136e.a
        public final <T extends IPlayerService> void bindService(PlayerServiceManager.ServiceDescriptor<T> serviceDescriptor, PlayerServiceManager.Client<T> client) {
            this.f66553a.f66533j.bindService(serviceDescriptor, client);
        }

        @Override // Yi0.C3136e.a
        public final <T extends IPlayerService> void unbindService(PlayerServiceManager.ServiceDescriptor<T> serviceDescriptor, PlayerServiceManager.Client<T> client) {
            this.f66553a.f66533j.unbindService(serviceDescriptor, client);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$e.class */
    public static final class e implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66554a;

        public e(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66554a = absMusicPodcastRecommendFragment;
        }

        @Override // Si0.c.b
        public final void a(MusicPlayItem musicPlayItem) {
            C2910c c2910c = this.f66554a.f66535l;
            if (c2910c == null) {
                return;
            }
            c2910c.a(musicPlayItem);
        }

        @Override // Si0.c.b
        public final void onDismiss() {
            C2910c c2910c = this.f66554a.f66535l;
            if (c2910c != null) {
                ((C2908a) c2910c.f24749a.getValue()).b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$f.class */
    public static final class f implements MusicCommentCoordinatorLayout.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66555a;

        public f(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66555a = absMusicPodcastRecommendFragment;
        }

        @Override // com.bilibili.music.podcast.view.MusicCommentCoordinatorLayout.a
        public final boolean a() {
            C2910c c2910c = this.f66555a.f66535l;
            boolean z6 = false;
            if (c2910c != null) {
                z6 = false;
                if (((C2908a) c2910c.f24749a.getValue()).c()) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$g.class */
    public static final class g extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66556a;

        public g(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66556a = absMusicPodcastRecommendFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i7) {
            super.onPageSelected(i7);
            AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment = this.f66556a;
            if (absMusicPodcastRecommendFragment.f66540q != i7) {
                absMusicPodcastRecommendFragment.f66531g.a();
            }
            absMusicPodcastRecommendFragment.f66540q = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$h.class */
    public static final class h implements C2910c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66557a;

        public h(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66557a = absMusicPodcastRecommendFragment;
        }

        @Override // Ui0.C2910c.a
        public final void a(int i7) {
            this.f66557a.f66533j.v(i7);
        }

        @Override // Ui0.C2910c.a
        public final MusicPagerReportData b() {
            return this.f66557a.f66538o.f66493f;
        }

        @Override // Ui0.C2910c.a
        public final void c(long j7, long j8) {
            Violet.INSTANCE.setValue(new C2911d(j7, j8));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/AbsMusicPodcastRecommendFragment$i.class */
    public static final class i implements MusicNormalLoadView.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbsMusicPodcastRecommendFragment f66558a;

        public i(AbsMusicPodcastRecommendFragment absMusicPodcastRecommendFragment) {
            this.f66558a = absMusicPodcastRecommendFragment;
        }

        @Override // com.bilibili.music.podcast.view.MusicNormalLoadView.b
        public final void a(int i7, View view) {
            if (i7 == 1) {
                ((TextView) view.findViewById(2131305832)).setTextColor(ContextCompat.getColor(this.f66558a.requireContext(), R$color.Text_white));
            }
        }
    }

    public final boolean canScrollUp() {
        return false;
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public abstract C7309M jf();

    @NotNull
    public final AbstractC7320a kf() {
        return (AbstractC7320a) this.f66532i.getValue();
    }

    public boolean lf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    @Override // com.bilibili.music.podcast.fragment.BaseLoadFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void loadData() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment.loadData():void");
    }

    public final void mf() {
        AbstractC7320a abstractC7320aKf = kf();
        abstractC7320aKf.f120286e = null;
        abstractC7320aKf.f120285d.clear();
        abstractC7320aKf.f120288g = null;
        abstractC7320aKf.submitList(null);
        if (BiliAccounts.get(getContext()).isLogin()) {
            j jVarG = this.f66533j.g();
            if (jVarG != null) {
                jVarG.d(new q(0, 6, true, false), new C8435e(this));
                return;
            }
            return;
        }
        MusicNormalLoadView musicNormalLoadView = this.f66527c;
        if (musicNormalLoadView != null) {
            musicNormalLoadView.a(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        AbstractC7445c abstractC7445cN;
        super.onActivityResult(i7, i8, intent);
        AbstractC7320a abstractC7320a = this.f66534k.f66919b;
        if (abstractC7320a == null || (abstractC7445cN = abstractC7320a.N(abstractC7320a.f120286e)) == null) {
            return;
        }
        abstractC7445cN.t0(i7, i8, intent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131307597) {
            ViewPager2 viewPager2 = this.f66529e;
            MusicPlayVideo musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(kf().getCurrentList(), viewPager2 != null ? viewPager2.getCurrentItem() : -1);
            if (musicPlayVideo == null) {
                return;
            }
            AbstractC7320a abstractC7320aKf = kf();
            AbstractC7445c abstractC7445cN = abstractC7320aKf.N(abstractC7320aKf.f120286e);
            int iR0 = abstractC7445cN != null ? abstractC7445cN.r0() : 0;
            p.c(musicPlayVideo, this.f66538o.f66493f, "threepoint", "video");
            int itemType = musicPlayVideo.getItemType();
            if (itemType == 1 || itemType == 3) {
                this.f66531g.c(ContextUtilKt.findFragmentActivityOrNull(view.getContext()), (MusicPlayItem) CollectionsKt.getOrNull(musicPlayVideo.getParts(), iR0), this.f66538o.f66493f, this.f66548y);
            } else {
                ToastHelper.showToast(BiliContext.application(), 2131846569, 0);
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f66538o.b(arguments);
            String str = this.f66538o.f66493f.f66423b;
            if (str != null) {
                this.f66539p.putString("from_spmid", str);
            }
            String str2 = this.f66538o.f66493f.h;
            if (str2 != null) {
                this.f66539p.putString("from_module", str2);
            }
            Integer integer = BundleUtil.getInteger(arguments, "list_mode", new Integer[]{Integer.valueOf(Ei0.b.a("pref_music_podcast_player_recommend_completion_action_key", 0))});
            int iA = Ei0.b.a("pref_music_podcast_player_recommend_completion_action_key", 0);
            if (integer == null || integer.intValue() != iA) {
                this.f66533j.y(integer.intValue());
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499519, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = this.f66529e;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f66547x);
        }
        BiliAccounts.get(BiliContext.application()).unsubscribe(this.f66546w, new Topic[]{Topic.SIGN_IN});
        this.f66534k.e();
        s sVar = this.f66533j;
        sVar.f14661g = null;
        sVar.c();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Pi0.d dVarL;
        Pi0.d dVarL2;
        super.onViewCreated(view, bundle);
        this.h = (ViewGroup) view.findViewById(2131306968);
        this.f66527c = (MusicNormalLoadView) view.findViewById(2131305806);
        this.f66528d = (MusicViewPager2LoadView) view.findViewById(2131316343);
        this.f66536m = (MusicCommentCoordinatorLayout) view.findViewById(2131307714);
        this.f66530f = requireActivity().findViewById(2131307597);
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(2131301482);
        this.f66529e = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setAdapter(kf());
        }
        ViewPager2 viewPager22 = this.f66529e;
        if (viewPager22 != null) {
            viewPager22.setOffscreenPageLimit(2);
        }
        ViewPager2 viewPager23 = this.f66529e;
        if (viewPager23 != null) {
            viewPager23.registerOnPageChangeCallback(this.f66547x);
        }
        View view2 = this.f66530f;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        MusicCommentCoordinatorLayout musicCommentCoordinatorLayout = this.f66536m;
        MusicCommentCoordinatorLayout musicCommentCoordinatorLayout2 = musicCommentCoordinatorLayout;
        if (musicCommentCoordinatorLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommentView");
            musicCommentCoordinatorLayout2 = null;
        }
        musicCommentCoordinatorLayout2.setMusicStateCallback(this.f66544u);
        kf().f120289i = this.f66542s;
        r rVar = this.f66538o;
        int i7 = rVar.f66490c;
        if (i7 > 0) {
            s sVar = this.f66533j;
            String str = rVar.f66492e;
            sVar.getClass();
            sVar.z(requireActivity(), i7, str);
            Lifecycle lifecycle = getLifecycle();
            sVar.f14660f = lifecycle;
            lifecycle.addObserver(sVar);
            j jVarG = sVar.g();
            if (jVarG != null && (dVarL2 = sVar.l()) != null) {
                dVarL2.d(jVarG);
            }
        } else {
            s sVar2 = this.f66533j;
            sVar2.getClass();
            sVar2.p(requireActivity());
            Lifecycle lifecycle2 = getLifecycle();
            sVar2.f14660f = lifecycle2;
            lifecycle2.addObserver(sVar2);
            j jVarG2 = sVar2.g();
            if (jVarG2 != null && (dVarL = sVar2.l()) != null) {
                dVarL.d(jVarG2);
            }
        }
        I i8 = this.f66534k;
        Context contextRequireContext = requireContext();
        s sVar3 = this.f66533j;
        ViewPager2 viewPager24 = this.f66529e;
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            viewGroup = null;
        }
        i8.d(contextRequireContext, this, sVar3, viewPager24, viewGroup, this.f66538o);
        this.f66533j.f14661g = new C8436f(this);
        MusicViewPager2LoadView musicViewPager2LoadView = this.f66528d;
        if (musicViewPager2LoadView != null) {
            musicViewPager2LoadView.setEnableRefresh(false);
            musicViewPager2LoadView.setListener(this.f66541r);
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        MusicCommentCoordinatorLayout musicCommentCoordinatorLayout3 = this.f66536m;
        if (musicCommentCoordinatorLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCommentView");
            musicCommentCoordinatorLayout3 = null;
        }
        this.f66535l = new C2910c(fragmentActivityRequireActivity, musicCommentCoordinatorLayout3, this.f66543t);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), this.f66545v);
        MusicNormalLoadView musicNormalLoadView = this.f66527c;
        if (musicNormalLoadView != null) {
            bp.i iVar = new bp.i(this, 4);
            bp.j jVar = new bp.j(this, 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499542);
            aVar.a(2131310274, jVar);
            linkedHashMap.put(2, aVar);
            MusicNormalLoadView.a aVar2 = new MusicNormalLoadView.a(2131499543);
            aVar2.a(2131305884, iVar);
            linkedHashMap.put(4, aVar2);
            musicNormalLoadView.setLoadContent(linkedHashMap);
        }
        MusicNormalLoadView musicNormalLoadView2 = this.f66527c;
        if (musicNormalLoadView2 != null) {
            musicNormalLoadView2.setLoadViewShowListener(new i(this));
        }
        BiliAccounts.get(BiliContext.application()).subscribe(this.f66546w, new Topic[]{Topic.SIGN_IN});
    }
}
