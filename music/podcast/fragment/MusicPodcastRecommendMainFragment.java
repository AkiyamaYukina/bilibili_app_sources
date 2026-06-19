package com.bilibili.music.podcast.fragment;

import By0.M0;
import Ci0.g;
import Ki0.j;
import Ki0.k;
import Ki0.l;
import Pi0.d;
import Qi0.C2831a;
import Qi0.C2832b;
import Vi0.C2954a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bapis.bilibili.app.listener.v1.TopCard;
import com.bapis.bilibili.app.listener.v1.TopCardType;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.data.MusicRecommendTopCard;
import com.bilibili.music.podcast.data.RecommendListResponseResult;
import com.bilibili.music.podcast.data.s;
import com.bilibili.music.podcast.utils.C5421a;
import com.bilibili.music.podcast.utils.C5431k;
import com.bilibili.music.podcast.utils.F;
import com.bilibili.music.podcast.utils.t;
import com.bilibili.music.podcast.view.MusicTopCarLayout;
import com.bilibili.pvtracker.IPvTracker;
import gi0.AbstractC7320a;
import gi0.C7297A;
import gi0.C7309M;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qi0.n;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastRecommendMainFragment.class */
public final class MusicPodcastRecommendMainFragment extends AbsMusicPodcastRecommendFragment implements IPvTracker, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public C5431k f66695A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public MusicTopCarLayout f66696B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public View f66697C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f66698D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final F f66701z = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final b f66699E = new b(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final a f66700F = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastRecommendMainFragment$a.class */
    public static final class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastRecommendMainFragment f66702a;

        public a(MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment) {
            this.f66702a = musicPodcastRecommendMainFragment;
        }

        @Override // com.bilibili.music.podcast.utils.t
        public final void a(MusicRecommendTopCard musicRecommendTopCard) {
            MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment = this.f66702a;
            MusicPagerReportData musicPagerReportData = musicPodcastRecommendMainFragment.f66538o.f66493f;
            TopCard topCar = musicRecommendTopCard != null ? musicRecommendTopCard.getTopCar() : null;
            Integer numValueOf = topCar != null ? Integer.valueOf(topCar.getPlayStyleValue()) : null;
            String str = musicPagerReportData.f66423b;
            int adapterBindPosition = musicRecommendTopCard != null ? musicRecommendTopCard.getAdapterBindPosition() : 0;
            int iReportCarType = musicRecommendTopCard != null ? musicRecommendTopCard.reportCarType() : 2;
            String title = topCar != null ? topCar.getTitle() : null;
            EventTracking eventTracking = musicRecommendTopCard != null ? musicRecommendTopCard.getEventTracking() : null;
            HashMap map = new HashMap();
            C2954a.a("from_spmid", str, map);
            C2954a.a("pos", String.valueOf(adapterBindPosition + 1), map);
            C2954a.a("card_type", String.valueOf(iReportCarType), map);
            C2954a.a("card_name", title, map);
            C2954a.a("entity", eventTracking != null ? eventTracking.getEntityType() : null, map);
            String entityId = null;
            if (eventTracking != null) {
                entityId = eventTracking.getEntityId();
            }
            C2954a.a("entity_id", entityId, map);
            Neurons.reportClick(true, "listen.audio-detail.head-entry.entry.click", map);
            if ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 1)) {
                musicPodcastRecommendMainFragment.f66533j.d();
            }
        }

        @Override // com.bilibili.music.podcast.utils.t
        public final Ah1.b getHost() {
            return this.f66702a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastRecommendMainFragment$b.class */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastRecommendMainFragment f66703a;

        public b(MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment) {
            this.f66703a = musicPodcastRecommendMainFragment;
        }

        @Override // Ki0.k
        public final void c(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Bundle bundle) {
            MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment = this.f66703a;
            MusicPlayItem musicPlayItemH = musicPodcastRecommendMainFragment.f66533j.h();
            if (musicPlayItemH == null || !Intrinsics.areEqual(String.valueOf(musicPlayItemH.getOid()), musicPodcastRecommendMainFragment.f66538o.d(null))) {
                return;
            }
            s sVar = musicPodcastRecommendMainFragment.f66538o.f66494g;
            sVar.f66495a = musicPlayItemH.getOid();
            sVar.f66496b = musicPlayItemH.getSid();
        }

        @Override // Ki0.k
        public final void e(List list, Bundle bundle) {
            ArrayList arrayList;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("top_car_list");
            MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment = this.f66703a;
            F f7 = musicPodcastRecommendMainFragment.f66701z;
            MusicTopCarLayout musicTopCarLayout = f7.f66906a;
            if (musicTopCarLayout != null) {
                if (parcelableArrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = parcelableArrayList.iterator();
                    while (true) {
                        arrayList = arrayList2;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        TopCard topCar = ((MusicRecommendTopCard) next).getTopCar();
                        Integer numValueOf = topCar != null ? Integer.valueOf(topCar.getCardTypeValue()) : null;
                        TopCardType topCardTypeForNumber = TopCardType.forNumber(numValueOf != null ? numValueOf.intValue() : 0);
                        if (numValueOf != null && topCardTypeForNumber != null && topCardTypeForNumber != TopCardType.UNSPECIFIED) {
                            arrayList2.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                musicTopCarLayout.setData(arrayList);
            }
            MusicTopCarLayout musicTopCarLayout2 = f7.f66906a;
            if (musicTopCarLayout2 == null || ((ArrayList) musicTopCarLayout2.f67128e.f120192a).isEmpty()) {
                ImageView imageView = f7.f66907b;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                View view = f7.f66908c;
                if (view != null) {
                    view.setOnClickListener(null);
                }
            } else {
                ImageView imageView2 = f7.f66907b;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                View view2 = f7.f66908c;
                if (view2 != null) {
                    view2.setOnClickListener(new com.bilibili.bililive.biz.interactionpanel.main.search.ui.k(f7, 1));
                }
            }
            musicPodcastRecommendMainFragment.f66701z.c(musicPodcastRecommendMainFragment.f66538o.f66491d, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastRecommendMainFragment$c.class */
    public static final class c implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicPodcastRecommendMainFragment f66704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MusicPlayVideo f66705b;

        public c(MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment, MusicPlayVideo musicPlayVideo) {
            this.f66704a = musicPodcastRecommendMainFragment;
            this.f66705b = musicPlayVideo;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment = this.f66704a;
                musicPodcastRecommendMainFragment.getLifecycle().removeObserver(this);
                C5431k c5431k = musicPodcastRecommendMainFragment.f66695A;
                if (c5431k != null) {
                    c5431k.b(this.f66705b);
                }
            }
        }
    }

    public static void nf(View view, List list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ViewGroup) {
                    nf(childAt, list);
                } else if (childAt.getTag(2131307716) == null) {
                    ((ArrayList) list).add(childAt);
                }
            }
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        String str = this.f66538o.f66493f.f66425d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        MusicPagerReportData musicPagerReportData = this.f66538o.f66493f;
        Bundle bundle = this.f66539p;
        String str = musicPagerReportData.f66426e;
        String string = bundle.getString("content_session_id", "");
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(string, str)) {
            bundle.putString("content_session_id", str);
        }
        return this.f66539p;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment
    @NotNull
    public final C7309M jf() {
        return new C7309M();
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment
    public final boolean lf() {
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        g gVar;
        IPlayerContainer iPlayerContainer;
        IVideosPlayDirectorService videoPlayDirectorService;
        if (this.f66698D) {
            return true;
        }
        j jVarG = this.f66533j.g();
        Map<String, Object> map = C2832b.f19944a;
        Object objRemove = map.remove("data_router");
        if (!(objRemove instanceof RecommendListResponseResult)) {
            objRemove = null;
        }
        RecommendListResponseResult recommendListResponseResult = (RecommendListResponseResult) objRemove;
        int i7 = 0;
        if (recommendListResponseResult == null) {
            return false;
        }
        if (jVarG != null) {
            jVarG.j(this.f66538o.f66488a);
        }
        if (jVarG instanceof l) {
            ((l) jVarG).e(recommendListResponseResult);
        }
        View view = this.f66530f;
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f66538o.f66490c > 0) {
            BLog.i("MusicPodcastRecommendMainFragment", "play from share");
            d dVar = this.f66533j.f14686l;
            if (dVar != null && (gVar = dVar.f18911a) != null && gVar.f1621j && (iPlayerContainer = gVar.f1614b) != null && (videoPlayDirectorService = iPlayerContainer.getVideoPlayDirectorService()) != null) {
                videoPlayDirectorService.playFromShared();
            }
            AbstractC7320a abstractC7320aKf = kf();
            List<MusicPlayVideo> mPlayList = recommendListResponseResult.getMPlayList();
            abstractC7320aKf.f120288g = new C7297A(mPlayList != null ? (MusicPlayVideo) CollectionsKt.getOrNull(mPlayList, 0) : null, false);
        }
        Object objRemove2 = map.remove("data_router_intent_list_request");
        Object obj = objRemove2;
        if (!(objRemove2 instanceof C2831a)) {
            obj = null;
        }
        C2831a c2831a = (C2831a) obj;
        if (c2831a != null) {
            if (TextUtils.equals(c2831a.f19928a, "dest_history")) {
                RouteRequest.Builder builderExtras = new RouteRequest.Builder("bilibili://podcast/card/transfer").extras(new M0(c2831a, 1));
                builderExtras.requestCode(144);
                BLRouter.routeTo(builderExtras.build(), this);
            } else {
                RouteRequest.Builder builderExtras2 = new RouteRequest.Builder("bilibili://podcast/card/transfer").extras(new M0(c2831a, 1));
                builderExtras2.requestCode(-1);
                BLRouter.routeTo(builderExtras2.build(), this);
            }
        }
        if (c2831a == null) {
            ViewPager2 viewPager2 = this.f66529e;
            if (viewPager2 != null) {
                int childCount = viewPager2.getChildCount();
                while (true) {
                    recyclerView = null;
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = viewPager2.getChildAt(i7);
                    if (childAt instanceof RecyclerView) {
                        recyclerView = (RecyclerView) childAt;
                        break;
                    }
                    i7++;
                }
            } else {
                recyclerView = null;
            }
            if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new n(recyclerView, this));
            }
        }
        this.f66698D = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // Ci0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nd() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "podcast_aid"
            r2 = r6
            com.bilibili.music.podcast.data.r r2 = r2.f66538o
            com.bilibili.music.podcast.data.s r2 = r2.f66494g
            long r2 = r2.f66495a
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r10
            java.lang.String r1 = "podcast_cid"
            r2 = r6
            com.bilibili.music.podcast.data.r r2 = r2.f66538o
            com.bilibili.music.podcast.data.s r2 = r2.f66494g
            long r2 = r2.f66496b
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r6
            Li0.s r0 = r0.f66533j
            com.bilibili.music.podcast.data.MusicPlayItem r0 = r0.h()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L5e
            r0 = r6
            com.bilibili.music.podcast.data.r r0 = r0.f66538o
            com.bilibili.music.podcast.data.s r0 = r0.f66494g
            long r0 = r0.f66496b
            r1 = r11
            long r1 = r1.getSid()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5e
            r0 = r6
            Li0.s r0 = r0.f66533j
            int r0 = r0.i()
            r7 = r0
        L58:
            r0 = r7
            long r0 = (long) r0
            r8 = r0
            goto L8a
        L5e:
            com.bilibili.player.history.MediaHistoryHelper$Companion r0 = com.bilibili.player.history.MediaHistoryHelper.Companion
            com.bilibili.player.history.MediaHistoryHelper r0 = r0.getInstance()
            cq0.b r1 = new cq0.b
            r2 = r1
            r3 = r6
            com.bilibili.music.podcast.data.r r3 = r3.f66538o
            com.bilibili.music.podcast.data.s r3 = r3.f66494g
            long r3 = r3.f66496b
            r2.<init>(r3)
            com.bilibili.player.history.MediaHistoryEntry r0 = r0.read(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L88
            r0 = r11
            int r0 = r0.getProgress()
            r7 = r0
            goto L58
        L88:
            r0 = 0
            r8 = r0
        L8a:
            r0 = r10
            java.lang.String r1 = "podcast_progress"
            r2 = r8
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r0 = r6
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto La7
            r0 = r11
            r1 = -1
            r2 = r10
            r0.setResult(r1, r2)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.MusicPodcastRecommendMainFragment.nd():void");
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 144) {
            Object objRemove = C2832b.f19944a.remove("data_history_item");
            Object obj = objRemove;
            if (!(objRemove instanceof MusicPlayVideo)) {
                obj = null;
            }
            MusicPlayVideo musicPlayVideo = (MusicPlayVideo) obj;
            if (musicPlayVideo == null) {
                return;
            }
            if (this.f66695A == null) {
                this.f66695A = new C5431k(this.f66533j, this.f66529e);
            }
            if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                getLifecycle().addObserver(new c(this, musicPlayVideo));
                return;
            }
            C5431k c5431k = this.f66695A;
            if (c5431k != null) {
                c5431k.b(musicPlayVideo);
            }
        }
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVarG = this.f66533j.g();
        if (jVarG != null) {
            jVarG.x(this.f66699E);
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f66533j.o()) {
            return;
        }
        this.f66533j.d();
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C7309M c7309m = (C7309M) kf();
        Context contextRequireContext = requireContext();
        c7309m.f120134m = this.f66529e;
        c7309m.f120136o = new C5421a(contextRequireContext);
        this.f66696B = (MusicTopCarLayout) fragmentActivityRequireActivity.findViewById(2131307692);
        this.f66697C = fragmentActivityRequireActivity.findViewById(2131313656);
        F f7 = this.f66701z;
        Context contextRequireContext2 = requireContext();
        MusicTopCarLayout musicTopCarLayout = this.f66696B;
        View view2 = this.f66697C;
        ImageView imageView = (ImageView) fragmentActivityRequireActivity.findViewById(2131313657);
        MusicPagerReportData musicPagerReportData = this.f66538o.f66493f;
        a aVar = this.f66700F;
        f7.getClass();
        f7.f66912g = new C5421a(contextRequireContext2);
        f7.f66906a = musicTopCarLayout;
        f7.f66907b = imageView;
        f7.f66908c = view2;
        f7.f66909d = c7309m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (musicTopCarLayout != null) {
            musicTopCarLayout.setPagerReportData(musicPagerReportData);
        }
        if (musicTopCarLayout != null) {
            musicTopCarLayout.setTopCarListener(aVar);
        }
        C5421a c5421a = f7.f66912g;
        C5421a c5421a2 = c5421a;
        if (c5421a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpaceDataProvider");
            c5421a2 = null;
        }
        if (c5421a2.f66968j && musicTopCarLayout != null) {
            musicTopCarLayout.setOutTouchViewColor(ContextCompat.getColor(contextRequireContext2, 2131100750));
        }
        C7309M c7309m2 = f7.f66909d;
        if (c7309m2 != null) {
            c7309m2.f120135n = f7;
        }
        j jVarG = this.f66533j.g();
        if (jVarG != null) {
            jVarG.q(this.f66699E);
        }
        lf();
    }
}
