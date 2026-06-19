package com.bilibili.music.podcast.collection;

import Va.f;
import Vi0.C2955b;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.exoplayer.analytics.C4667i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bapis.bilibili.app.listener.v1.FavFolderListReq;
import com.bapis.bilibili.app.listener.v1.FavItem;
import com.bapis.bilibili.app.listener.v1.FavItemDelReq;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bilibili.app.comm.comment2.comments.view.J;
import com.bilibili.app.comm.comment2.comments.view.K;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.music.podcast.collection.MusicPodcastPrimaryFavFragment;
import com.bilibili.music.podcast.collection.api.PlaySet;
import com.bilibili.music.podcast.collection.api.PlaySetGroups;
import com.bilibili.music.podcast.collection.api.PlaySetPageData;
import com.bilibili.music.podcast.collection.enums.CollectionTypeEnum;
import com.bilibili.music.podcast.data.MusicCollectionViewModel;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.k;
import com.bilibili.music.podcast.data.m;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.InterfaceC5427g;
import com.bilibili.music.podcast.utils.l;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.music.podcast.utils.q;
import com.bilibili.music.podcast.view.MusicNormalLoadView;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import com.bilibili.music.podcast.view.r;
import com.bilibili.playset.C5898c;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.bilibili.pvtracker.IPvTracker;
import ii0.C7582d;
import ii0.C7583e;
import ii0.C7584f;
import ii0.C7588j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import ji0.C7687a;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import li0.InterfaceC7859b;
import mi0.AbstractC8000a;
import mi0.InterfaceC8001b;
import ni0.C8097c;
import ni0.C8098d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment.class */
public final class MusicPodcastPrimaryFavFragment extends BaseSwipeRefreshFragment implements PlaylistDetailBottomSheet.c, PageAdapter.Page, IPvTracker, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final l<InterfaceC7859b> f66375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final c f66376B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final e f66377C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RecyclerView f66380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MusicNormalLoadView f66381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f66382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C5898c f66383g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C7588j f66384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public r f66385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f66386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public PlaySetGroups.DefaultFolderGroup f66387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public MusicCollectionViewModel f66388m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public InterfaceC7859b f66389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.accounts.cookie.c f66390o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public View f66392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f66393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f66394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public String f66395t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final C7582d f66396u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final J f66397v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final K f66398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final C7583e f66399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final C7584f f66400y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final b f66401z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f66378b = "MusicPlaySetFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f66379c = "favorite";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f66391p = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f66403b;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f66402a = iArr;
            int[] iArr2 = new int[CollectionTypeEnum.values().length];
            try {
                iArr2[CollectionTypeEnum.SEASON.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[CollectionTypeEnum.UGC_SEASON.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[CollectionTypeEnum.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[CollectionTypeEnum.FOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
            f66403b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$b.class */
    public static final class b implements MusicBottomPlayView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastPrimaryFavFragment f66404a;

        public b(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment) {
            this.f66404a = musicPodcastPrimaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.view.mini.MusicBottomPlayView.a
        public final void onStateChange(int i7) {
            RecyclerView recyclerView = this.f66404a.f66380d;
            if (recyclerView != null) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i7 == 1 ? 0 : recyclerView.getContext().getResources().getDimensionPixelSize(2131166703));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$c.class */
    public static final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastPrimaryFavFragment f66405a;

        public c(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment) {
            this.f66405a = musicPodcastPrimaryFavFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            e eVar = this.f66405a.f66377C;
            if (i7 == 0) {
                eVar.f66408b.f66375A.b();
            } else {
                eVar.getClass();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            e eVar = this.f66405a.f66377C;
            RecyclerView recyclerView2 = eVar.f66408b.f66380d;
            if (recyclerView2 != null) {
                C2955b.a(recyclerView2, eVar.f66407a);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$d.class */
    public static final class d implements InterfaceC5426f<InterfaceC7859b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastPrimaryFavFragment f66406a;

        public d(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment) {
            this.f66406a = musicPodcastPrimaryFavFragment;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(InterfaceC7859b interfaceC7859b) {
            return interfaceC7859b.getEventTracking() != null;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(InterfaceC7859b interfaceC7859b) {
            InterfaceC7859b interfaceC7859b2 = interfaceC7859b;
            MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = this.f66406a;
            p.e(musicPodcastPrimaryFavFragment.f66393r, musicPodcastPrimaryFavFragment.f66394s, interfaceC7859b2.getEventTracking(), interfaceC7859b2.getReportPosition(), musicPodcastPrimaryFavFragment.f66395t);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$e.class */
    public static final class e implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f66407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPodcastPrimaryFavFragment f66408b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/MusicPodcastPrimaryFavFragment$e$a.class */
        public static final class a implements InterfaceC5427g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastPrimaryFavFragment f66409a;

            public a(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment) {
                this.f66409a = musicPodcastPrimaryFavFragment;
            }

            @Override // com.bilibili.music.podcast.utils.InterfaceC5427g
            public final void a(int i7, int i8) {
                List items;
                MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = this.f66409a;
                l<InterfaceC7859b> lVar = musicPodcastPrimaryFavFragment.f66375A;
                C7588j c7588j = musicPodcastPrimaryFavFragment.f66384i;
                ArrayList arrayList = null;
                if (c7588j != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (i7 <= i8) {
                        while (true) {
                            C8097c c8097c = c7588j.f124238a;
                            C8098d c8098dA = c8097c.a(i7);
                            int i9 = c8098dA.f124237d;
                            Object orNull = CollectionsKt.getOrNull(c8097c.f124231a, c8098dA.f124234a);
                            AbstractC8000a abstractC8000a = orNull instanceof AbstractC8000a ? (AbstractC8000a) orNull : null;
                            if (i9 == 1) {
                                InterfaceC8001b interfaceC8001b = (abstractC8000a == null || (items = abstractC8000a.getItems()) == null) ? null : (InterfaceC8001b) CollectionsKt.getOrNull(items, c8098dA.f124235b);
                                if (interfaceC8001b instanceof InterfaceC7859b) {
                                    arrayList2.add(interfaceC8001b);
                                }
                            }
                            if (i7 == i8) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                lVar.a(arrayList);
            }
        }

        public e(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment) {
            this.f66408b = musicPodcastPrimaryFavFragment;
            this.f66407a = new a(musicPodcastPrimaryFavFragment);
        }

        @Override // com.bilibili.music.podcast.utils.q
        public final void a() {
            MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = this.f66408b;
            RecyclerView recyclerView = musicPodcastPrimaryFavFragment.f66380d;
            if (recyclerView != null) {
                C2955b.a(recyclerView, this.f66407a);
            }
            musicPodcastPrimaryFavFragment.f66375A.b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [ii0.e] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ii0.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ii0.d] */
    public MusicPodcastPrimaryFavFragment() {
        new Bundle();
        this.f66393r = "";
        this.f66394s = "";
        this.f66395t = "";
        this.f66396u = new Observer(this) { // from class: ii0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastPrimaryFavFragment f121737a;

            {
                this.f121737a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicPodcastPrimaryFavFragment.kf(this.f121737a, (Pair) obj);
            }
        };
        this.f66397v = new J(this, 1);
        this.f66398w = new K(this, 1);
        this.f66399x = new Observer(this) { // from class: ii0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastPrimaryFavFragment f121738a;

            {
                this.f121738a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Integer) obj).intValue() == 1) {
                    MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = this.f121738a;
                    Runnable cVar = new com.bilibili.lib.accounts.cookie.c(musicPodcastPrimaryFavFragment, 2);
                    musicPodcastPrimaryFavFragment.f66390o = cVar;
                    musicPodcastPrimaryFavFragment.f66380d.postDelayed(cVar, 1000L);
                }
            }
        };
        this.f66400y = new PassportObserver(this) { // from class: ii0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastPrimaryFavFragment f121739a;

            {
                this.f121739a = this;
            }

            public final void onChange(Topic topic) {
                if ((topic == null ? -1 : MusicPodcastPrimaryFavFragment.a.f66402a[topic.ordinal()]) == 1) {
                    this.f121739a.mf();
                }
            }
        };
        this.f66401z = new b(this);
        this.f66375A = new l<>(new d(this));
        this.f66376B = new c(this);
        this.f66377C = new e(this);
    }

    public static void kf(MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment, Pair pair) {
        PlaySetPageData playSetPageData;
        int iIntValue = ((Number) pair.component1()).intValue();
        PlaySetGroups playSetGroups = (PlaySetGroups) pair.component2();
        if (iIntValue == 0) {
            if (musicPodcastPrimaryFavFragment.f66391p) {
                MusicNormalLoadView musicNormalLoadView = musicPodcastPrimaryFavFragment.f66381e;
                if (musicNormalLoadView != null) {
                    musicNormalLoadView.a(1);
                }
            } else {
                musicPodcastPrimaryFavFragment.setRefreshStart();
            }
            musicPodcastPrimaryFavFragment.h = true;
            return;
        }
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                return;
            }
            musicPodcastPrimaryFavFragment.setRefreshCompleted();
            MusicNormalLoadView musicNormalLoadView2 = musicPodcastPrimaryFavFragment.f66381e;
            if (musicNormalLoadView2 != null) {
                musicNormalLoadView2.a(2);
            }
            musicPodcastPrimaryFavFragment.h = false;
            return;
        }
        musicPodcastPrimaryFavFragment.setRefreshCompleted();
        if (playSetGroups == null) {
            MusicNormalLoadView musicNormalLoadView3 = musicPodcastPrimaryFavFragment.f66381e;
            if (musicNormalLoadView3 != null) {
                musicNormalLoadView3.a(2);
            }
        } else {
            musicPodcastPrimaryFavFragment.f66391p = false;
            MusicNormalLoadView musicNormalLoadView4 = musicPodcastPrimaryFavFragment.f66381e;
            if (musicNormalLoadView4 != null) {
                musicNormalLoadView4.a(Integer.MIN_VALUE);
            }
            SwipeRefreshLayout swipeRefreshLayout = musicPodcastPrimaryFavFragment.mSwipeRefreshLayout;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(true);
            }
            musicPodcastPrimaryFavFragment.f66387l = playSetGroups.defaultFolderGroup;
            if (musicPodcastPrimaryFavFragment.f66380d != null) {
                ArrayList arrayList = new ArrayList();
                PlaySetGroups.DefaultFolderGroup defaultFolderGroup = playSetGroups.defaultFolderGroup;
                if (defaultFolderGroup != null) {
                    List<InterfaceC8001b> items = defaultFolderGroup.getItems();
                    InterfaceC8001b interfaceC8001b = items.isEmpty() ? null : (InterfaceC8001b) C4667i.a(1, items);
                    boolean z6 = interfaceC8001b instanceof C7687a;
                    C7687a c7687a = z6 ? (C7687a) interfaceC8001b : new C7687a();
                    if (defaultFolderGroup.hasMore) {
                        c7687a.f122433a = 1;
                    } else {
                        c7687a.f122433a = 3;
                    }
                    if (!z6) {
                        items.add(c7687a);
                    }
                    arrayList.add(defaultFolderGroup);
                }
                List<PlaySetGroups.OtherFolderGroup> list = playSetGroups.otherFolderGroups;
                if (list != null) {
                    for (PlaySetGroups.OtherFolderGroup otherFolderGroup : list) {
                        if (otherFolderGroup != null && (playSetPageData = otherFolderGroup.pageData) != null) {
                            if (playSetPageData.list == null) {
                                playSetPageData.list = new ArrayList();
                            }
                            if (otherFolderGroup.getGroupType() != 3) {
                                List<InterfaceC8001b> items2 = otherFolderGroup.getItems();
                                InterfaceC8001b interfaceC8001b2 = items2.isEmpty() ? null : (InterfaceC8001b) C4667i.a(1, items2);
                                boolean z7 = interfaceC8001b2 instanceof C7687a;
                                C7687a c7687a2 = z7 ? (C7687a) interfaceC8001b2 : new C7687a();
                                if (otherFolderGroup.pageData.hasMore) {
                                    c7687a2.f122433a = 1;
                                } else {
                                    c7687a2.f122433a = 3;
                                }
                                if (!z7) {
                                    items2.add(c7687a2);
                                }
                            }
                            arrayList.add(otherFolderGroup);
                        }
                    }
                }
                C7588j c7588j = musicPodcastPrimaryFavFragment.f66384i;
                if (c7588j != null) {
                    int itemCount = c7588j.getItemCount();
                    musicPodcastPrimaryFavFragment.f66384i.f124238a.f124231a.clear();
                    musicPodcastPrimaryFavFragment.f66384i.notifyItemRangeRemoved(0, itemCount);
                }
                Bundle arguments = musicPodcastPrimaryFavFragment.getArguments();
                int iIntValue2 = 1;
                if (arguments != null) {
                    String string = arguments.getString("primary_expand_index");
                    iIntValue2 = 1;
                    if (string != null) {
                        Integer intOrNull = StringsKt.toIntOrNull(string);
                        iIntValue2 = 1;
                        if (intOrNull != null) {
                            iIntValue2 = intOrNull.intValue();
                        }
                    }
                }
                C7588j c7588j2 = new C7588j(musicPodcastPrimaryFavFragment, arrayList, iIntValue2);
                musicPodcastPrimaryFavFragment.f66384i = c7588j2;
                c7588j2.f121749i = musicPodcastPrimaryFavFragment.f66380d;
                c7588j2.f121750j = musicPodcastPrimaryFavFragment.f66377C;
                r rVar = musicPodcastPrimaryFavFragment.f66385j;
                if (rVar != null) {
                    rVar.a();
                }
                musicPodcastPrimaryFavFragment.f66385j = new r(musicPodcastPrimaryFavFragment.f66380d, musicPodcastPrimaryFavFragment.f66384i);
                musicPodcastPrimaryFavFragment.f66380d.stopScroll();
                musicPodcastPrimaryFavFragment.f66380d.addItemDecoration(musicPodcastPrimaryFavFragment.f66385j);
                musicPodcastPrimaryFavFragment.f66380d.setAdapter(musicPodcastPrimaryFavFragment.f66384i);
                C7588j c7588j3 = musicPodcastPrimaryFavFragment.f66384i;
                if (c7588j3 != null) {
                    MusicPagerReportData musicPagerReportData = new MusicPagerReportData();
                    musicPagerReportData.f66423b = musicPodcastPrimaryFavFragment.f66393r;
                    musicPagerReportData.f66427f = musicPodcastPrimaryFavFragment.f66394s;
                    musicPagerReportData.f66428g = musicPodcastPrimaryFavFragment.f66395t;
                    c7588j3.f121751k = musicPagerReportData;
                }
                musicPodcastPrimaryFavFragment.f66384i.registerAdapterDataObserver(musicPodcastPrimaryFavFragment.f66383g.f84125n);
            }
        }
        musicPodcastPrimaryFavFragment.h = false;
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
        CharSequence text;
        String str = this.f66393r;
        TextView textView = this.f66382f;
        String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
        String str2 = this.f66395t;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("from_spmid", str, "page_type", "fav");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
    public final void h(int i7) {
        PlaySet playSet;
        if (i7 == 6) {
            InterfaceC7859b interfaceC7859b = this.f66389n;
            if (interfaceC7859b != null) {
                FavItem favItemBuild = FavItem.newBuilder().setFid(interfaceC7859b.getFolderId()).setItemType(interfaceC7859b.getItemType()).setMid(interfaceC7859b.getCreatorId()).setOid(interfaceC7859b.getId()).build();
                MusicCollectionViewModel musicCollectionViewModel = this.f66388m;
                String key = interfaceC7859b.getKey();
                long id = interfaceC7859b.getId();
                PlaySetGroups.DefaultFolderGroup defaultFolderGroup = this.f66387l;
                int i8 = (defaultFolderGroup == null || (playSet = defaultFolderGroup.detail) == null) ? -1 : playSet.coverType;
                long jNf = nf();
                musicCollectionViewModel.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("data_key", key);
                bundle.putLong("media_id", id);
                bundle.putInt("media_type", i8);
                bundle.putLong("group_id", jNf);
                musicCollectionViewModel.f66420d.setValue(TuplesKt.to(0, bundle));
                long fid = favItemBuild.getFid();
                k kVar = new k(musicCollectionViewModel, bundle);
                new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favItemDel(FavItemDelReq.newBuilder().setFid(fid).setFolderType(i8).setFav(favItemBuild).build(), new com.bilibili.music.podcast.moss.d(kVar, kVar));
            }
        } else if (i7 == 8) {
            new AlertDialog.Builder(getContext()).setTitle("").setMessage(getString(2131842576)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841455, new DialogInterface.OnClickListener(this) { // from class: ii0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MusicPodcastPrimaryFavFragment f121740a;

                {
                    this.f121740a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    MusicPodcastPrimaryFavFragment musicPodcastPrimaryFavFragment = this.f121740a;
                    musicPodcastPrimaryFavFragment.f66388m.I0(musicPodcastPrimaryFavFragment.nf());
                    dialogInterface.dismiss();
                }
            }).show();
        }
        this.f66389n = null;
    }

    public final void lf() {
        TintProgressDialog tintProgressDialog = this.f66386k;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    public final void mf() {
        this.f66391p = true;
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        if (BiliAccounts.get(getContext()).isLogin()) {
            of();
            return;
        }
        MusicNormalLoadView musicNormalLoadView = this.f66381e;
        if (musicNormalLoadView != null) {
            musicNormalLoadView.a(3);
        }
    }

    public final long nf() {
        PlaySet playSet;
        PlaySetGroups.DefaultFolderGroup defaultFolderGroup = this.f66387l;
        return (defaultFolderGroup == null || (playSet = defaultFolderGroup.detail) == null) ? -1L : playSet.id;
    }

    public final void of() {
        if (this.h || this.f66388m == null) {
            return;
        }
        this.h = true;
        long jMid = BiliAccounts.get(getContext()).mid();
        MusicCollectionViewModel musicCollectionViewModel = this.f66388m;
        musicCollectionViewModel.f66418b.setValue(TuplesKt.to(0, (Object) null));
        m mVar = new m(jMid, musicCollectionViewModel);
        new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favFolderList(FavFolderListReq.newBuilder().build(), new com.bilibili.music.podcast.moss.d(mVar, mVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        if (i7 == 300 && i8 == -1 && intent != null) {
            long j7 = BundleUtil.getLong(intent.getExtras(), "playlistId", new long[]{-1});
            if (BundleUtil.getBoolean(intent.getExtras(), "key_result_is_create_folder", new boolean[]{false})) {
                setRefreshStart();
                of();
                return;
            } else {
                if (j7 == -1 || this.f66384i == null) {
                    return;
                }
                BundleUtil.getBoolean(intent.getExtras(), "is_delete", new boolean[]{false});
                return;
            }
        }
        if (i7 == 2 && i8 == -1) {
            if (intent == null) {
                setRefreshStart();
                of();
                return;
            }
            String stringExtra = intent.getStringExtra("api_params_sort_record");
            if (TextUtils.isEmpty(stringExtra)) {
                setRefreshStart();
                of();
            } else {
                setRefreshStart();
                this.f66388m.J0(nf(), stringExtra);
            }
        }
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
    @RequiresApi(21)
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle != null || (arguments = getArguments()) == null) {
            return;
        }
        this.f66379c = arguments.getString("tab", "favorite");
        String string = arguments.getString("from_spmid");
        String str = string;
        if (string == null) {
            str = "";
        }
        this.f66393r = str;
        String string2 = arguments.getString("from_route");
        String str2 = string2;
        if (string2 == null) {
            str2 = "";
        }
        this.f66394s = str2;
        String string3 = arguments.getString(GameCardButton.extraParamSource);
        if (string3 == null) {
            string3 = "";
        }
        this.f66395t = string3;
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @NotNull SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499521, (ViewGroup) swipeRefreshLayout, false);
        MusicNormalLoadView musicNormalLoadView = (MusicNormalLoadView) viewInflate.findViewById(2131305806);
        this.f66381e = musicNormalLoadView;
        if (musicNormalLoadView != null) {
            View.OnClickListener bVar = new Pa.b(this, 2);
            View.OnClickListener fVar = new f(this, 2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(1, new MusicNormalLoadView.a(2131499546));
            MusicNormalLoadView.a aVar = new MusicNormalLoadView.a(2131499545);
            aVar.a(2131310274, fVar);
            linkedHashMap.put(2, aVar);
            HashMap map = new HashMap(linkedHashMap);
            MusicNormalLoadView.a aVar2 = new MusicNormalLoadView.a(2131499544);
            aVar2.a(2131305884, bVar);
            map.put(3, aVar2);
            musicNormalLoadView.setLoadContent(map);
        }
        TextView textView = (TextView) viewInflate.findViewById(2131308958);
        this.f66382f = textView;
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
                        string = resources.getString(2131842645);
                    }
                }
            }
            textView.setText(string);
        }
        View viewFindViewById = viewInflate.findViewById(2131302935);
        this.f66392q = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131306580);
        this.f66380d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, getContext()) { // from class: com.bilibili.music.podcast.collection.MusicPodcastPrimaryFavFragment.onCreateView.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicPodcastPrimaryFavFragment f66410a;

            {
                this.f66410a = this;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (IndexOutOfBoundsException e7) {
                    BLog.e(this.f66410a.f66378b, e7.getMessage());
                }
            }
        });
        if (this.f66380d.getItemAnimator() == null || this.f66383g == null) {
            C5898c c5898c = new C5898c();
            this.f66383g = c5898c;
            c5898c.setAddDuration(200L);
            this.f66383g.setRemoveDuration(200L);
            C5898c c5898c2 = this.f66383g;
            RecyclerView recyclerView2 = this.f66380d;
            c5898c2.f84123l = recyclerView2;
            recyclerView2.setItemAnimator(c5898c2);
        }
        if (this.f66384i != null) {
            r rVar = this.f66385j;
            if (rVar != null) {
                rVar.a();
            }
            this.f66385j = new r(this.f66380d, this.f66384i);
            this.f66380d.stopScroll();
            this.f66380d.addItemDecoration(this.f66385j);
            this.f66380d.setAdapter(this.f66384i);
            C7588j c7588j = this.f66384i;
            if (c7588j != null) {
                c7588j.f121750j = this.f66377C;
            }
        }
        this.f66380d.addOnScrollListener(this.f66376B);
        MusicCollectionViewModel musicCollectionViewModel = (MusicCollectionViewModel) new ViewModelProvider(this).get(MusicCollectionViewModel.class);
        this.f66388m = musicCollectionViewModel;
        musicCollectionViewModel.f66418b.observe(getViewLifecycleOwner(), this.f66396u);
        this.f66388m.f66420d.observe(getViewLifecycleOwner(), this.f66397v);
        this.f66388m.f66419c.observe(getViewLifecycleOwner(), this.f66398w);
        this.f66388m.f66421e.observe(getViewLifecycleOwner(), this.f66399x);
        BiliAccounts.get(BiliContext.application()).subscribe(this.f66400y, new Topic[]{Topic.SIGN_IN});
        if (StringsKt.equals("favorite", this.f66379c, true) && this.f66384i == null) {
            mf();
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RecyclerView recyclerView = this.f66380d;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.f66390o);
        }
        RecyclerView recyclerView2 = this.f66380d;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f66376B);
        }
        lf();
        BiliAccounts.get(BiliContext.application()).unsubscribe(this.f66400y, new Topic[]{Topic.SIGN_IN});
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        of();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R$color.f64616Wh0));
        Context contextRequireContext = requireContext();
        int statusBarHeight = contextRequireContext == null ? 0 : StatusBarCompat.getStatusBarHeight(contextRequireContext);
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        Context contextRequireContext2 = requireContext();
        view.setPadding(paddingLeft, paddingTop + (contextRequireContext2 == null ? 0 : StatusBarCompat.getStatusBarHeight(contextRequireContext2)), view.getPaddingRight(), view.getPaddingBottom());
        SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setProgressViewOffset(false, statusBarHeight, ((int) DpUtils.dp2px(requireContext(), 64.0f)) + statusBarHeight);
        }
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().a(this, this.f66401z);
    }
}
