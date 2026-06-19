package com.bilibili.music.podcast.fragment;

import AL.r;
import AL.t;
import By0.K0;
import Vi0.C2954a;
import Vi0.C2955b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.MedialistReq;
import com.bapis.bilibili.app.listener.v1.MedialistUpInfo;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.app.preferences.fragment.J0;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.music.podcast.collection.data.UpperCardDetailItem;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import com.bilibili.music.podcast.utils.l;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.utils.q;
import com.bilibili.music.podcast.view.MusicAppBarStateChangeListener;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import gi0.C7301E;
import gi0.C7317V;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.u;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment.class */
public final class MusicPodcastUpperFragment extends AbsListDetailFragment implements View.OnClickListener, IPvTracker {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f66755D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final a f66756E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final c f66757F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final r f66758G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final b f66759H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final l<UpperCardDetailItem> f66760I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final d f66761J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final f f66762K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final J0 f66763L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AppBarLayout f66764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f66765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f66766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Toolbar f66767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f66768g;

    @Nullable
    public RelativeLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public FrameLayout f66769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f66770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public BiliImageView f66771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f66772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f66773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TextView f66774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public RecyclerView f66775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public BiliImageView f66776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public View f66778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public TextView f66779s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f66781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f66782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f66783w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public MedialistUpInfo f66785y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f66786z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C7317V f66780t = new C7317V();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f66784x = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public String f66752A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public String f66753B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public String f66754C = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$a.class */
    public static final class a extends MusicAppBarStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66787b;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.fragment.MusicPodcastUpperFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$a$a.class */
        public static final /* synthetic */ class C0382a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f66788a;

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
                f66788a = iArr;
            }
        }

        public a(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66787b = musicPodcastUpperFragment;
        }

        @Override // com.bilibili.music.podcast.view.MusicAppBarStateChangeListener
        public final void a(MusicAppBarStateChangeListener.State state) {
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66787b;
            Context context = musicPodcastUpperFragment.getContext();
            if (context == null) {
                return;
            }
            int i7 = state == null ? -1 : C0382a.f66788a[state.ordinal()];
            if (i7 == 1) {
                ImageView imageView = musicPodcastUpperFragment.f66765d;
                if (imageView != null) {
                    imageView.setColorFilter(ContextCompat.getColor(context, 2131103878));
                }
                TextView textView = musicPodcastUpperFragment.f66768g;
                if (textView != null) {
                    textView.setText(musicPodcastUpperFragment.f66781u);
                }
                TextView textView2 = musicPodcastUpperFragment.f66768g;
                if (textView2 != null) {
                    textView2.setTextColor(-1);
                }
                TextView textView3 = musicPodcastUpperFragment.f66779s;
                if (textView3 != null) {
                    textView3.setTextColor(ContextCompat.getColor(context, 2131103878));
                    return;
                }
                return;
            }
            if (i7 == 2 || i7 == 3) {
                ImageView imageView2 = musicPodcastUpperFragment.f66765d;
                if (imageView2 != null) {
                    imageView2.setColorFilter(ContextCompat.getColor(context, R$color.Ga7_u));
                }
                TextView textView4 = musicPodcastUpperFragment.f66768g;
                if (textView4 != null) {
                    textView4.setText(musicPodcastUpperFragment.f66781u);
                }
                TextView textView5 = musicPodcastUpperFragment.f66768g;
                if (textView5 != null) {
                    textView5.setTextColor(ContextCompat.getColor(context, R$color.Text1));
                }
                TextView textView6 = musicPodcastUpperFragment.f66779s;
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
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66787b;
            float fCoerceAtLeast = RangesKt.coerceAtLeast(f7 / (totalScrollRange - (musicPodcastUpperFragment.f66766e != null ? r0.getScrimVisibleHeightTrigger() : 0)), 0.0f);
            int color = ContextCompat.getColor(appBarLayout.getContext(), R$color.f64616Wh0);
            Toolbar toolbar = musicPodcastUpperFragment.f66767f;
            if (toolbar != null) {
                toolbar.setBackgroundColor(Color.argb((int) (Math.min(fCoerceAtLeast, 1.0f) * Color.alpha(color)), Color.red(color), Color.green(color), Color.blue(color)));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$b.class */
    public static final class b implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66789a;

        public b(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66789a = musicPodcastUpperFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            Context context;
            Resources resources;
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66789a;
            View view = musicPodcastUpperFragment.f66778r;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            int i8 = 0;
            int dimensionPixelSize = (i7 == 1 || (context = musicPodcastUpperFragment.getContext()) == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166703);
            if (marginLayoutParams != null) {
                i8 = marginLayoutParams.bottomMargin;
            }
            if (i8 == dimensionPixelSize) {
                return;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = dimensionPixelSize;
            }
            View view2 = musicPodcastUpperFragment.f66778r;
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$c.class */
    public static final class c extends com.bilibili.music.podcast.view.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66790b;

        public c(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66790b = musicPodcastUpperFragment;
        }

        @Override // com.bilibili.music.podcast.view.l
        public final void onLastItemVisible(int i7) {
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66790b;
            if (musicPodcastUpperFragment.f66755D || i7 == 0) {
                return;
            }
            musicPodcastUpperFragment.jf(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66791a;

        public d(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66791a = musicPodcastUpperFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            f fVar = this.f66791a.f66762K;
            if (i7 == 0) {
                fVar.f66794b.f66760I.b();
            } else {
                fVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            f fVar = this.f66791a.f66762K;
            RecyclerView recyclerView2 = fVar.f66794b.f66775o;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, fVar.f66793a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$e.class */
    public static final class e implements InterfaceC5426f<UpperCardDetailItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66792a;

        public e(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66792a = musicPodcastUpperFragment;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(UpperCardDetailItem upperCardDetailItem) {
            PlayItem item = upperCardDetailItem.getItem();
            return item != null ? item.hasEt() : false;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(UpperCardDetailItem upperCardDetailItem) {
            UpperCardDetailItem upperCardDetailItem2 = upperCardDetailItem;
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66792a;
            String str = musicPodcastUpperFragment.f66752A;
            String str2 = musicPodcastUpperFragment.f66753B;
            PlayItem item = upperCardDetailItem2.getItem();
            p.e(str, str2, item != null ? item.getEt() : null, upperCardDetailItem2.getReportPosition(), musicPodcastUpperFragment.f66754C);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$f.class */
    public static final class f implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastUpperFragment f66794b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastUpperFragment$f$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastUpperFragment f66795a;

            public a(MusicPodcastUpperFragment musicPodcastUpperFragment) {
                this.f66795a = musicPodcastUpperFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66795a;
                l<UpperCardDetailItem> lVar = musicPodcastUpperFragment.f66760I;
                C7317V c7317v = musicPodcastUpperFragment.f66780t;
                c7317v.getClass();
                ArrayList arrayList = new ArrayList();
                if (i7 <= i8) {
                    while (true) {
                        UpperCardDetailItem upperCardDetailItem = (UpperCardDetailItem) CollectionsKt.getOrNull(c7317v.f120223b, i7);
                        if (upperCardDetailItem != null && !upperCardDetailItem.isReported()) {
                            arrayList.add(upperCardDetailItem);
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

        public f(MusicPodcastUpperFragment musicPodcastUpperFragment) {
            this.f66794b = musicPodcastUpperFragment;
            this.f66793a = new a(musicPodcastUpperFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastUpperFragment musicPodcastUpperFragment = this.f66794b;
            RecyclerView recyclerView = musicPodcastUpperFragment.f66775o;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66793a);
            }
            musicPodcastUpperFragment.f66760I.b();
        }
    }

    public MusicPodcastUpperFragment() {
        new Bundle();
        this.f66756E = new a(this);
        this.f66757F = new c(this);
        this.f66758G = new r(this, 7);
        this.f66759H = new b(this);
        this.f66760I = new l<>(new e(this));
        this.f66761J = new d(this);
        this.f66762K = new f(this);
        this.f66763L = new J0(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "listen.audio-list.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        String str = this.f66752A;
        String str2 = this.f66781u;
        String str3 = this.f66754C;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", "playlist_up");
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        bundleM.putString("page_name", str4);
        String str5 = str3;
        if (str3 == null) {
            str5 = "";
        }
        bundleM.putString(GameCardButton.extraParamSource, str5);
        return bundleM;
    }

    public final void jf(boolean z6) {
        if (z6) {
            MusicNormalLoadView musicNormalLoadView = this.f66777q;
            if (musicNormalLoadView != null) {
                musicNormalLoadView.a(1);
            }
            ConstraintLayout constraintLayout = this.f66770j;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(4);
            }
        } else {
            C7301E c7301e = this.f66780t.f120301a;
            if (c7301e != null) {
                c7301e.setupView(0);
            }
        }
        long j7 = this.f66782v;
        long j8 = this.f66783w;
        String str = this.f66784x;
        u uVar = new u(this, z6);
        MedialistReq.b bVarNewBuilder = MedialistReq.newBuilder();
        bVarNewBuilder.setListType(j7).setBizId(j8).setOffset(str);
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).medialist(bVarNewBuilder.build(), new com.bilibili.music.podcast.moss.d(uVar, uVar));
    }

    /* JADX WARN: Type inference failed for: r0v65, types: [Qi0.c, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        CharSequence text;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 2131304804) {
            if (numValueOf != null && numValueOf.intValue() == 2131302936) {
                requireActivity().finish();
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2131315898) {
                String str = this.f66752A;
                TextView textView = this.f66779s;
                String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
                String str2 = this.f66754C;
                HashMap map = new HashMap();
                C2954a.a("from_spmid", str, map);
                C2954a.a("entry_name", string, map);
                C2954a.a(GameCardButton.extraParamSource, str2, map);
                Neurons.reportClick(true, "listen.audio-list.top-entry.entry.click", map);
                Context context = getContext();
                MedialistUpInfo medialistUpInfo = this.f66785y;
                Long lValueOf = null;
                if (medialistUpInfo != null) {
                    lValueOf = Long.valueOf(medialistUpInfo.getMid());
                }
                if (lValueOf != null) {
                    RouteRequest.Builder builder = new RouteRequest.Builder(Uri.parse("bilibili://space/:mid/"));
                    builder.getExtras().put(EditCustomizeSticker.TAG_MID, String.valueOf(lValueOf.longValue()));
                    BLRouter.routeTo(builder.build(), context);
                    return;
                }
                return;
            }
            return;
        }
        String str3 = this.f66752A;
        String str4 = this.f66754C;
        Context context2 = getContext();
        String string2 = null;
        if (context2 != null) {
            Resources resources = context2.getResources();
            string2 = null;
            if (resources != null) {
                string2 = resources.getString(2131842629);
            }
        }
        HashMap map2 = new HashMap();
        C2954a.a("from_spmid", str3, map2);
        C2954a.a(GameCardButton.extraParamSource, str4, map2);
        C2954a.a("entry_name", string2, map2);
        Neurons.reportClick(true, "listen.audio-list.head-entry.entry.click", map2);
        Context context3 = getContext();
        ?? obj = new Object();
        obj.f19946b = -1L;
        obj.f19948d = -1L;
        obj.f19949e = -1L;
        obj.f19950f = -1;
        obj.f19951g = -1L;
        obj.h = "";
        obj.f19954k = -1L;
        MedialistUpInfo medialistUpInfo2 = this.f66785y;
        String name = "";
        if (medialistUpInfo2 != null) {
            name = medialistUpInfo2.getName();
            if (name == null) {
                name = "";
            }
        }
        obj.h = name;
        obj.f19952i = this.f66752A;
        obj.f19953j = "listen.audio-list.head-entry.entry";
        long j7 = this.f66783w;
        long j8 = this.f66782v;
        obj.f19947c = 8;
        obj.f19946b = j7;
        obj.f19951g = j8;
        if (context3 == null) {
            return;
        }
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://podcast/playlist").extras(new K0(obj, 1)).build(), context3);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        long j7;
        long j8;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                j7 = Long.parseLong(arguments.getString("key_upper_list_type"));
            } catch (NumberFormatException e7) {
                j7 = 0;
            }
            this.f66782v = j7;
            try {
                j8 = Long.parseLong(arguments.getString("key_upper_biz_id"));
            } catch (NumberFormatException e8) {
                j8 = 0;
            }
            this.f66783w = j8;
            String string = arguments.getString("from_spmid");
            String str = string;
            if (string == null) {
                str = "";
            }
            this.f66752A = str;
            String string2 = arguments.getString("from_route");
            String str2 = string2;
            if (string2 == null) {
                str2 = "";
            }
            this.f66753B = str2;
            String string3 = arguments.getString(GameCardButton.extraParamSource);
            String str3 = string3;
            if (string3 == null) {
                str3 = "";
            }
            this.f66754C = str3;
            Bundle arguments2 = getArguments();
            String string4 = "";
            if (arguments2 != null) {
                string4 = arguments2.getString("key_page_title");
                if (string4 == null) {
                    string4 = "";
                }
            }
            this.f66781u = string4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.recyclerview.widget.RecyclerView$Adapter, gi0.V] */
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
        View viewInflate = layoutInflater.inflate(2131497821, viewGroup, false);
        if (viewInflate != null) {
            this.f66764c = viewInflate.findViewById(2131296803);
            this.f66765d = (ImageView) viewInflate.findViewById(2131302936);
            this.f66766e = viewInflate.findViewById(2131299012);
            this.f66767f = (Toolbar) viewInflate.findViewById(2131308880);
            this.f66768g = (TextView) viewInflate.findViewById(2131313485);
            this.f66776p = viewInflate.findViewById(2131307715);
            this.h = (RelativeLayout) viewInflate.findViewById(2131299009);
            this.f66769i = (FrameLayout) viewInflate.findViewById(2131304842);
            this.f66770j = (ConstraintLayout) viewInflate.findViewById(2131304804);
            this.f66771k = viewInflate.findViewById(2131302595);
            this.f66772l = (TextView) viewInflate.findViewById(2131302577);
            this.f66773m = (TextView) viewInflate.findViewById(2131302610);
            this.f66774n = (TextView) viewInflate.findViewById(2131302606);
            this.f66775o = (RecyclerView) viewInflate.findViewById(2131310640);
            this.f66777q = (MusicNormalLoadView) viewInflate.findViewById(2131305806);
            this.f66778r = viewInflate.findViewById(2131310546);
            this.f66779s = (TextView) viewInflate.findViewById(2131315898);
        }
        ImageView imageView = this.f66765d;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = this.f66770j;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        TextView textView = this.f66779s;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        MusicNormalLoadView musicNormalLoadView = this.f66777q;
        if (musicNormalLoadView != null) {
            t tVar = new t(this, 3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499505);
            aVar.a(2131310274, tVar);
            linkedHashMap.put(2, aVar);
            musicNormalLoadView.setLoadContent(linkedHashMap);
        }
        BiliImageLoader.INSTANCE.with(this).url("").into(this.f66771k);
        CollapsingToolbarLayout collapsingToolbarLayout = this.f66766e;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setTitle("");
        }
        AppBarLayout appBarLayout = this.f66764c;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener(this.f66756E);
        }
        ?? r02 = this.f66780t;
        r02.f120224c = new qi0.t(this);
        r02.f120225d = this.f66758G;
        r02.f120226e = this.f66762K;
        r02.f120228g = this.f66497b;
        RecyclerView recyclerView = this.f66775o;
        if (recyclerView != 0) {
            recyclerView.setAdapter(r02);
        }
        RecyclerView recyclerView2 = this.f66775o;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f66757F);
        }
        RecyclerView recyclerView3 = this.f66775o;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.f66761J);
        }
        Toolbar toolbar = this.f66767f;
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
        a.C0391a.a().a(this, this.f66759H);
        return viewInflate;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsListDetailFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AppBarLayout appBarLayout = this.f66764c;
        if (appBarLayout != null) {
            appBarLayout.removeOnOffsetChangedListener(this.f66756E);
        }
        RecyclerView recyclerView = this.f66775o;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f66757F);
        }
        RecyclerView recyclerView2 = this.f66775o;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f66761J);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getParentFragmentManager().setFragmentResultListener("play_index_change", getViewLifecycleOwner(), this.f66763L);
        getParentFragmentManager().setFragmentResultListener("playing_highlight_check", getViewLifecycleOwner(), this.f66763L);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        jf(true);
    }
}
