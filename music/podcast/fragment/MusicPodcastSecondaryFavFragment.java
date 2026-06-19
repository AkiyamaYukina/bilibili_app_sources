package com.bilibili.music.podcast.fragment;

import By0.K0;
import Qi0.C2831a;
import Qi0.C2836f;
import Vi0.C2954a;
import Vi0.C2955b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.material3.C4238w6;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.FavFolder;
import com.bapis.bilibili.app.listener.v1.FavFolderDetailReq;
import com.bapis.bilibili.app.listener.v1.FavItem;
import com.bapis.bilibili.app.listener.v1.FavItemDelReq;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.router.Router;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.music.podcast.collection.data.FavFolderDetailItem;
import com.bilibili.music.podcast.fragment.MusicPodcastSecondaryFavFragment;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import com.bilibili.music.podcast.utils.l;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.utils.q;
import com.bilibili.music.podcast.view.MusicAppBarStateChangeListener;
import com.bilibili.music.podcast.view.MusicFavDetailBottomSheet;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.pegasus.holders.W0;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import gi0.C7301E;
import gi0.C7312P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.o;
import qi0.r;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment.class */
public final class MusicPodcastSecondaryFavFragment extends AbsListDetailFragment implements View.OnClickListener, MusicFavDetailBottomSheet.b, IPvTracker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f66706A;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f66711F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final a f66712G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final c f66713H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final W0 f66714I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final b f66715J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final l<FavFolderDetailItem> f66716K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final d f66717L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final f f66718M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final o f66719N;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AppBarLayout f66720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f66721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f66722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Toolbar f66723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f66724g;

    @Nullable
    public RelativeLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f66725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BiliImageView f66726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f66727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f66728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f66729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public RecyclerView f66730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public BiliImageView f66731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public View f66733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public TextView f66734r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f66736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f66737u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f66738v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f66740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public FavFolder f66741y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f66742z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final C7312P f66735s = new C7312P();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public String f66739w = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public String f66707B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public String f66708C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public String f66709D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public String f66710E = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$a.class */
    public static final class a extends MusicAppBarStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66743b;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.fragment.MusicPodcastSecondaryFavFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$a$a.class */
        public static final /* synthetic */ class C0381a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f66744a;

            static {
                int[] iArr = new int[MusicAppBarStateChangeListener.State.values().length];
                try {
                    iArr[MusicAppBarStateChangeListener.State.EXPANDED.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[MusicAppBarStateChangeListener.State.COLLAPSED.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[MusicAppBarStateChangeListener.State.IDLE.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f66744a = iArr;
            }
        }

        public a(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66743b = musicPodcastSecondaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.view.MusicAppBarStateChangeListener
        public final void a(MusicAppBarStateChangeListener.State state) {
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66743b;
            Context context = musicPodcastSecondaryFavFragment.getContext();
            if (context == null) {
                return;
            }
            int i7 = state == null ? -1 : C0381a.f66744a[state.ordinal()];
            if (i7 == 1) {
                ImageView imageView = musicPodcastSecondaryFavFragment.f66721d;
                if (imageView != null) {
                    imageView.setColorFilter(ContextCompat.getColor(context, 2131103878));
                }
                TextView textView = musicPodcastSecondaryFavFragment.f66724g;
                if (textView != null) {
                    textView.setText(musicPodcastSecondaryFavFragment.f66736t);
                }
                TextView textView2 = musicPodcastSecondaryFavFragment.f66724g;
                if (textView2 != null) {
                    textView2.setTextColor(-1);
                }
                TextView textView3 = musicPodcastSecondaryFavFragment.f66734r;
                if (textView3 != null) {
                    textView3.setTextColor(ContextCompat.getColor(context, 2131103878));
                    return;
                }
                return;
            }
            if (i7 == 2 || i7 == 3) {
                ImageView imageView2 = musicPodcastSecondaryFavFragment.f66721d;
                if (imageView2 != null) {
                    imageView2.setColorFilter(ContextCompat.getColor(context, R$color.Ga7_u));
                }
                TextView textView4 = musicPodcastSecondaryFavFragment.f66724g;
                if (textView4 != null) {
                    String str = musicPodcastSecondaryFavFragment.f66710E;
                    String str2 = str;
                    if (StringsKt.isBlank(str)) {
                        str2 = musicPodcastSecondaryFavFragment.f66739w;
                    }
                    textView4.setText(str2);
                }
                TextView textView5 = musicPodcastSecondaryFavFragment.f66724g;
                if (textView5 != null) {
                    textView5.setTextColor(ContextCompat.getColor(context, R$color.Text1));
                }
                TextView textView6 = musicPodcastSecondaryFavFragment.f66734r;
                if (textView6 != null) {
                    textView6.setTextColor(ContextCompat.getColor(context, R$color.Ga7_u));
                }
            }
        }

        @Override // com.bilibili.music.podcast.view.MusicAppBarStateChangeListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            super.onOffsetChanged(appBarLayout, i7);
            if (appBarLayout == null) {
                return;
            }
            int iAbs = Math.abs(i7);
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            float f7 = iAbs;
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66743b;
            float fCoerceAtLeast = RangesKt.coerceAtLeast(f7 / (totalScrollRange - (musicPodcastSecondaryFavFragment.f66722e != null ? r0.getScrimVisibleHeightTrigger() : 0)), 0.0f);
            int color = ContextCompat.getColor(appBarLayout.getContext(), R$color.f64616Wh0);
            Toolbar toolbar = musicPodcastSecondaryFavFragment.f66723f;
            if (toolbar != null) {
                toolbar.setBackgroundColor(Color.argb((int) (Math.min(fCoerceAtLeast, 1.0f) * Color.alpha(color)), Color.red(color), Color.green(color), Color.blue(color)));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$b.class */
    public static final class b implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66745a;

        public b(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66745a = musicPodcastSecondaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            Context context;
            Resources resources;
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66745a;
            View view = musicPodcastSecondaryFavFragment.f66733q;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            int i8 = 0;
            int dimensionPixelSize = (i7 == 1 || (context = musicPodcastSecondaryFavFragment.getContext()) == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166703);
            if (marginLayoutParams != null) {
                i8 = marginLayoutParams.bottomMargin;
            }
            if (i8 == dimensionPixelSize) {
                return;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = dimensionPixelSize;
            }
            View view2 = musicPodcastSecondaryFavFragment.f66733q;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$c.class */
    public static final class c extends com.bilibili.music.podcast.view.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66746b;

        public c(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66746b = musicPodcastSecondaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.view.l
        public final void onLastItemVisible(int i7) {
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66746b;
            if (musicPodcastSecondaryFavFragment.f66711F || i7 == 0) {
                return;
            }
            musicPodcastSecondaryFavFragment.jf(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66747a;

        public d(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66747a = musicPodcastSecondaryFavFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            f fVar = this.f66747a.f66718M;
            if (i7 == 0) {
                fVar.f66750b.f66716K.b();
            } else {
                fVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            f fVar = this.f66747a.f66718M;
            RecyclerView recyclerView2 = fVar.f66750b.f66730n;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, fVar.f66749a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$e.class */
    public static final class e implements InterfaceC5426f<FavFolderDetailItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66748a;

        public e(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66748a = musicPodcastSecondaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(FavFolderDetailItem favFolderDetailItem) {
            FavItem item = favFolderDetailItem.getItem();
            return item != null ? item.hasEt() : false;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(FavFolderDetailItem favFolderDetailItem) {
            FavFolderDetailItem favFolderDetailItem2 = favFolderDetailItem;
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66748a;
            String str = musicPodcastSecondaryFavFragment.f66707B;
            String str2 = musicPodcastSecondaryFavFragment.f66708C;
            FavItem item = favFolderDetailItem2.getItem();
            p.e(str, str2, item != null ? item.getEt() : null, favFolderDetailItem2.getReportPosition(), musicPodcastSecondaryFavFragment.f66709D);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$f.class */
    public static final class f implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastSecondaryFavFragment f66750b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastSecondaryFavFragment$f$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastSecondaryFavFragment f66751a;

            public a(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
                this.f66751a = musicPodcastSecondaryFavFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66751a;
                l<FavFolderDetailItem> lVar = musicPodcastSecondaryFavFragment.f66716K;
                C7312P c7312p = musicPodcastSecondaryFavFragment.f66735s;
                c7312p.getClass();
                ArrayList arrayList = new ArrayList();
                if (i7 <= i8) {
                    while (true) {
                        FavFolderDetailItem favFolderDetailItem = (FavFolderDetailItem) CollectionsKt.getOrNull(c7312p.f120142b, i7);
                        if (favFolderDetailItem != null && !favFolderDetailItem.isReported()) {
                            arrayList.add(favFolderDetailItem);
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

        public f(MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment) {
            this.f66750b = musicPodcastSecondaryFavFragment;
            this.f66749a = new a(musicPodcastSecondaryFavFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f66750b;
            RecyclerView recyclerView = musicPodcastSecondaryFavFragment.f66730n;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66749a);
            }
            musicPodcastSecondaryFavFragment.f66716K.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [qi0.o] */
    public MusicPodcastSecondaryFavFragment() {
        new Bundle();
        this.f66712G = new a(this);
        this.f66713H = new c(this);
        this.f66714I = new W0(this, 3);
        this.f66715J = new b(this);
        this.f66716K = new l<>(new e(this));
        this.f66717L = new d(this);
        this.f66718M = new f(this);
        this.f66719N = new FragmentResultListener(this) { // from class: qi0.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastSecondaryFavFragment f126017a;

            {
                this.f126017a = this;
            }

            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                int iHashCode = str.hashCode();
                MusicPodcastSecondaryFavFragment musicPodcastSecondaryFavFragment = this.f126017a;
                if (iHashCode != -736662808) {
                    if (iHashCode == 743081900 && str.equals("playing_highlight_check")) {
                        BaseAdapter baseAdapter = musicPodcastSecondaryFavFragment.f66735s;
                        baseAdapter.getClass();
                        baseAdapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                if (str.equals("play_index_change")) {
                    Pair serializable = bundle.getSerializable("play_index_old");
                    Pair pair = serializable instanceof Pair ? serializable : null;
                    Pair serializable2 = bundle.getSerializable("play_index_new");
                    Pair pair2 = serializable2 instanceof Pair ? serializable2 : null;
                    bundle.getBundle("play_index_extra");
                    Object first = pair != null ? pair.getFirst() : null;
                    Integer num = first instanceof Integer ? (Integer) first : null;
                    Object first2 = pair2 != null ? pair2.getFirst() : null;
                    Integer num2 = null;
                    if (first2 instanceof Integer) {
                        num2 = (Integer) first2;
                    }
                    BaseAdapter baseAdapter2 = musicPodcastSecondaryFavFragment.f66735s;
                    baseAdapter2.getClass();
                    if (num2 == null || num == null || num2.intValue() < 0) {
                        return;
                    }
                    baseAdapter2.notifyDataSetChanged();
                }
            }
        };
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "listen.audio-list.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        String str = this.f66707B;
        String str2 = this.f66738v == 21 ? "playlist_all" : "playlist_collect";
        String str3 = this.f66736t;
        String str4 = this.f66709D;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", str2);
        String str5 = str3;
        if (str3 == null) {
            str5 = "";
        }
        bundleM.putString("page_name", str5);
        String str6 = str4;
        if (str4 == null) {
            str6 = "";
        }
        bundleM.putString(GameCardButton.extraParamSource, str6);
        return bundleM;
    }

    @Override // com.bilibili.music.podcast.view.MusicFavDetailBottomSheet.b
    public final void h(int i7) {
        if (i7 == 6) {
            if (!BiliAccounts.get(getContext()).isLogin()) {
                Router.Companion.global().with(this).forResult(1001).open("activity://main/login/");
                return;
            }
            FavItem item = this.f66735s.f120142b.get(this.f66740x).getItem();
            if (item == null) {
                return;
            }
            long j7 = this.f66737u;
            int i8 = this.f66738v;
            r rVar = new r(this);
            new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favItemDel(FavItemDelReq.newBuilder().setFid(j7).setFolderType(i8).setFav(item).build(), new com.bilibili.music.podcast.moss.d(rVar, rVar));
        }
    }

    public final void jf(boolean z6) {
        FavItem favItem;
        if (z6) {
            MusicNormalLoadView musicNormalLoadView = this.f66732p;
            if (musicNormalLoadView != null) {
                musicNormalLoadView.a(1);
            }
            ConstraintLayout constraintLayout = this.f66725i;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
            favItem = null;
        } else {
            FavFolderDetailItem favFolderDetailItem = (FavFolderDetailItem) CollectionsKt.lastOrNull(this.f66735s.f120142b);
            FavItem item = favFolderDetailItem != null ? favFolderDetailItem.getItem() : null;
            if (item == null) {
                return;
            }
            C7301E c7301e = this.f66735s.f120301a;
            favItem = item;
            if (c7301e != null) {
                c7301e.setupView(0);
                favItem = item;
            }
        }
        long j7 = this.f66737u;
        int i7 = this.f66738v;
        FavItem favItem2 = z6 ? null : favItem;
        qi0.q qVar = new qi0.q(this, z6);
        FavFolderDetailReq.b bVarNewBuilder = FavFolderDetailReq.newBuilder();
        FavFolderDetailReq.b folderType = bVarNewBuilder.setFid(j7).setFolderType(i7);
        boolean z7 = false;
        if (favItem2 == null) {
            z7 = true;
        }
        folderType.setNeedFolderInfo(z7);
        if (favItem2 != null) {
            bVarNewBuilder.setLastItem(favItem2);
        }
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favFolderDetail(bVarNewBuilder.build(), new com.bilibili.music.podcast.moss.d(qVar, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.graphics.drawable.Drawable] */
    public final void kf(String str) {
        com.bilibili.music.podcast.view.f fVar;
        RoundingParams cornersRadius = new RoundingParams().setCornersRadius(DpUtils.dp2px(getContext(), 4.0f));
        ImageRequestBuilder imageRequestBuilderRoundingParams = BiliImageLoader.INSTANCE.with(this).url(str).roundingParams(cornersRadius);
        Context context = getContext();
        if (context != null) {
            int iDp2px = (int) DpUtils.dp2px(context, 36.0f);
            fVar = new com.bilibili.music.podcast.view.f(context, ContextCompat.getColor(context, R$color.Ga2), iDp2px, iDp2px, cornersRadius, false, 32);
        } else {
            fVar = null;
        }
        ImageRequestBuilder.placeholderImageDrawable$default(imageRequestBuilderRoundingParams, fVar, (ScaleType) null, 2, (Object) null).into(this.f66726j);
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [Qi0.c, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 2131304804) {
            if (numValueOf != null && numValueOf.intValue() == 2131302936) {
                requireActivity().finish();
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131308528) {
                String str = this.f66707B;
                TextView textView = this.f66734r;
                String string = null;
                if (textView != null) {
                    CharSequence text = textView.getText();
                    string = null;
                    if (text != null) {
                        string = text.toString();
                    }
                }
                String str2 = this.f66709D;
                HashMap map = new HashMap();
                C2954a.a("from_spmid", str, map);
                C2954a.a("entry_name", string, map);
                C2954a.a(GameCardButton.extraParamSource, str2, map);
                Neurons.reportClick(true, "listen.audio-list.top-entry.entry.click", map);
                Context context = getContext();
                C2831a c2831a = new C2831a();
                c2831a.f19934g = this.f66707B;
                c2831a.f19928a = "dest_primary_fav";
                c2831a.h = this.f66708C;
                c2831a.f19935i = "listen.audio-list.top-entry.entry";
                C2836f.e(context, c2831a);
                return;
            }
            return;
        }
        long j7 = this.f66737u;
        if (j7 <= 0) {
            return;
        }
        HashMap map2 = new HashMap(2);
        C2954a.a("operatertrack_id", String.valueOf(j7), map2);
        C2954a.a("module_type", MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, map2);
        Neurons.reportClick(true, "listen.audio-collect.audio-list.more.click", map2);
        String str3 = this.f66707B;
        String str4 = this.f66709D;
        Context context2 = getContext();
        String string2 = null;
        if (context2 != null) {
            Resources resources = context2.getResources();
            string2 = null;
            if (resources != null) {
                string2 = resources.getString(2131842629);
            }
        }
        HashMap map3 = new HashMap();
        C2954a.a("from_spmid", str3, map3);
        C2954a.a(GameCardButton.extraParamSource, str4, map3);
        C2954a.a("entry_name", string2, map3);
        Neurons.reportClick(true, "listen.audio-list.head-entry.entry.click", map3);
        Context context3 = getContext();
        ?? obj = new Object();
        obj.f19946b = -1L;
        obj.f19948d = -1L;
        obj.f19949e = -1L;
        obj.f19950f = -1;
        obj.f19951g = -1L;
        obj.h = "";
        obj.f19954k = -1L;
        FavFolder favFolder = this.f66741y;
        String name = "";
        if (favFolder != null) {
            name = favFolder.getName();
            if (name == null) {
                name = "";
            }
        }
        obj.h = name;
        obj.f19952i = this.f66707B;
        obj.f19953j = "listen.audio-list.head-entry.entry";
        long j8 = this.f66737u;
        long j9 = this.f66738v;
        obj.f19947c = 4;
        obj.f19946b = j8;
        obj.f19951g = j9;
        if (context3 == null) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://podcast/playlist").extras(new K0(obj, 1)).build(), context3);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        long j7;
        int i7;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                j7 = Long.parseLong(arguments.getString("key_secondary_fav_folder_fid"));
            } catch (NumberFormatException e7) {
                j7 = 0;
            }
            this.f66737u = j7;
            try {
                i7 = Integer.parseInt(arguments.getString("key_secondary_fav_folder_type"));
            } catch (NumberFormatException e8) {
                i7 = 0;
            }
            this.f66738v = i7;
            String string = arguments.getString("from_spmid");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f66707B = str;
            String string2 = arguments.getString("from_route");
            String str2 = string2;
            if (string2 == null) {
                str2 = "";
            }
            this.f66708C = str2;
            String string3 = arguments.getString(GameCardButton.extraParamSource);
            String str3 = string3;
            if (string3 == null) {
                str3 = "";
            }
            this.f66709D = str3;
            String string4 = arguments.getString("key_page_title");
            if (string4 == null) {
                string4 = "";
            }
            this.f66710E = string4;
            String str4 = string4;
            if (StringsKt.isBlank(string4)) {
                int i8 = this.f66738v;
                String string5 = (i8 == 2 || i8 == 11 || i8 != 21) ? getResources().getString(2131842645) : getResources().getString(2131842603);
                str4 = string5;
            }
            this.f66736t = str4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.recyclerview.widget.RecyclerView$Adapter, gi0.P] */
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
    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131497820, viewGroup, false);
        if (viewInflate != null) {
            this.f66720c = viewInflate.findViewById(2131296803);
            this.f66721d = (ImageView) viewInflate.findViewById(2131302936);
            this.f66722e = viewInflate.findViewById(2131299012);
            this.f66723f = (Toolbar) viewInflate.findViewById(2131308880);
            this.f66724g = (TextView) viewInflate.findViewById(2131313485);
            this.f66731o = viewInflate.findViewById(2131307715);
            this.h = (RelativeLayout) viewInflate.findViewById(2131299009);
            viewInflate.findViewById(2131304842);
            this.f66725i = (ConstraintLayout) viewInflate.findViewById(2131304804);
            this.f66726j = viewInflate.findViewById(2131302595);
            this.f66727k = (TextView) viewInflate.findViewById(2131302577);
            this.f66728l = (TextView) viewInflate.findViewById(2131302607);
            this.f66729m = (TextView) viewInflate.findViewById(2131302606);
            this.f66730n = (RecyclerView) viewInflate.findViewById(2131310640);
            this.f66732p = (MusicNormalLoadView) viewInflate.findViewById(2131305806);
            this.f66733q = viewInflate.findViewById(2131310546);
            this.f66734r = (TextView) viewInflate.findViewById(2131308528);
        }
        ImageView imageView = this.f66721d;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = this.f66725i;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        TextView textView = this.f66734r;
        if (textView != null) {
            textView.setVisibility(StringsKt.isBlank(this.f66710E) ? 8 : 0);
            textView.setOnClickListener(this);
        }
        MusicNormalLoadView musicNormalLoadView = this.f66732p;
        if (musicNormalLoadView != null) {
            Nt.e eVar = new Nt.e(this, 7);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499505);
            aVar.a(2131310274, eVar);
            linkedHashMap.put(2, aVar);
            musicNormalLoadView.setLoadContent(linkedHashMap);
        }
        kf("");
        CollapsingToolbarLayout collapsingToolbarLayout = this.f66722e;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle("");
        }
        AppBarLayout appBarLayout = this.f66720c;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(this.f66712G);
        }
        ?? r02 = this.f66735s;
        r02.f120143c = new C4238w6(this, 1);
        r02.f120144d = new qi0.p(this);
        r02.f120145e = this.f66714I;
        r02.f120146f = this.f66718M;
        r02.h = this.f66497b;
        RecyclerView recyclerView = this.f66730n;
        if (recyclerView != 0) {
            recyclerView.setAdapter(r02);
        }
        RecyclerView recyclerView2 = this.f66730n;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f66713H);
        }
        RecyclerView recyclerView3 = this.f66730n;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.f66717L);
        }
        Toolbar toolbar = this.f66723f;
        if (toolbar != null) {
            int paddingLeft = toolbar.getPaddingLeft();
            int paddingTop = toolbar.getPaddingTop();
            Context context = toolbar.getContext();
            toolbar.setPadding(paddingLeft, paddingTop + (context == null ? 0 : StatusBarCompat.getStatusBarHeight(context)), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null) {
            int paddingLeft2 = relativeLayout.getPaddingLeft();
            int paddingTop2 = relativeLayout.getPaddingTop();
            Context context2 = relativeLayout.getContext();
            relativeLayout.setPadding(paddingLeft2, paddingTop2 + (context2 == null ? 0 : StatusBarCompat.getStatusBarHeight(context2)), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        }
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().a(this, this.f66715J);
        return viewInflate;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsListDetailFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AppBarLayout appBarLayout = this.f66720c;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.f66712G);
        }
        RecyclerView recyclerView = this.f66730n;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f66713H);
        }
        RecyclerView recyclerView2 = this.f66730n;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f66717L);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getParentFragmentManager().setFragmentResultListener("play_index_change", getViewLifecycleOwner(), this.f66719N);
        getParentFragmentManager().setFragmentResultListener("playing_highlight_check", getViewLifecycleOwner(), this.f66719N);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        jf(true);
    }
}
