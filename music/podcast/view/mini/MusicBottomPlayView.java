package com.bilibili.music.podcast.view.mini;

import By0.K0;
import ES0.Q;
import ES0.S;
import ES0.T;
import ES0.U;
import ES0.V;
import Ii0.C2300b;
import Ii0.InterfaceC2299a;
import Ki0.j;
import Ki0.k;
import Ki0.o;
import Ki0.p;
import Ki0.q;
import Li0.d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import cj0.C5263a;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.utils.InterfaceC5426f;
import com.bilibili.music.podcast.utils.n;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.music.podcast.view.mini.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pi0.AlertDialogC8304d;
import pi0.InterfaceC8301a;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView.class */
public final class MusicBottomPlayView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f67279p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f67280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f67281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f67282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f67283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f67284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ValueAnimator f67285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Li0.d f67286g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public AlertDialogC8304d f67287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f67288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final n<MusicPlayVideo> f67289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final d f67290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final b f67291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final c f67292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final f f67293o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$a.class */
    public interface a {
        void onStateChange(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$b.class */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicBottomPlayView f67294a;

        public b(MusicBottomPlayView musicBottomPlayView) {
            this.f67294a = musicBottomPlayView;
        }

        @Override // Ki0.k
        public final void a(List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            MusicBottomPlayView musicBottomPlayView = this.f67294a;
            AlertDialogC8304d alertDialogC8304d2 = musicBottomPlayView.f67287i;
            if (alertDialogC8304d2 == null || !alertDialogC8304d2.isShowing() || (alertDialogC8304d = musicBottomPlayView.f67287i) == null) {
                return;
            }
            alertDialogC8304d.d(list);
        }

        @Override // Ki0.k
        public final void b(List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            MusicBottomPlayView musicBottomPlayView = this.f67294a;
            AlertDialogC8304d alertDialogC8304d2 = musicBottomPlayView.f67287i;
            if (alertDialogC8304d2 == null || !alertDialogC8304d2.isShowing() || (alertDialogC8304d = musicBottomPlayView.f67287i) == null) {
                return;
            }
            alertDialogC8304d.b(list);
        }

        @Override // Ki0.k
        public final void c(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Bundle bundle) {
            AlertDialogC8304d alertDialogC8304d;
            if (((Number) pair2.getFirst()).intValue() >= 0) {
                if (((Number) pair2.getFirst()).intValue() == ((Number) pair.getFirst()).intValue() && ((Number) pair2.getSecond()).intValue() == ((Number) pair.getSecond()).intValue()) {
                    return;
                }
                int i7 = MusicBottomPlayView.f67279p;
                MusicBottomPlayView musicBottomPlayView = this.f67294a;
                musicBottomPlayView.g();
                Li0.d dVar = musicBottomPlayView.f67286g;
                MusicPlayItem musicPlayItemH = dVar != null ? dVar.h() : null;
                Li0.d dVar2 = musicBottomPlayView.f67286g;
                MusicPlayVideo musicPlayVideoG = null;
                if (dVar2 != null) {
                    j jVarG = dVar2.g();
                    musicPlayVideoG = null;
                    if (jVarG != null) {
                        musicPlayVideoG = jVarG.g();
                    }
                }
                AlertDialogC8304d alertDialogC8304d2 = musicBottomPlayView.f67287i;
                if (alertDialogC8304d2 != null && alertDialogC8304d2.isShowing() && (alertDialogC8304d = musicBottomPlayView.f67287i) != null) {
                    alertDialogC8304d.e(musicPlayItemH);
                }
                Li0.d dVar3 = musicBottomPlayView.f67286g;
                if (dVar3 == null || dVar3.f14659e || musicPlayVideoG == null) {
                    return;
                }
                musicBottomPlayView.f67289k.a(CollectionsKt.listOf(musicPlayVideoG));
                musicBottomPlayView.f67289k.b();
            }
        }

        @Override // Ki0.k
        public final void d(int i7, List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            MusicBottomPlayView musicBottomPlayView = this.f67294a;
            AlertDialogC8304d alertDialogC8304d2 = musicBottomPlayView.f67287i;
            if (alertDialogC8304d2 == null || !alertDialogC8304d2.isShowing() || (alertDialogC8304d = musicBottomPlayView.f67287i) == null) {
                return;
            }
            alertDialogC8304d.c(i7, list);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$c.class */
    public static final class c implements InterfaceC8301a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicBottomPlayView f67295a;

        public c(MusicBottomPlayView musicBottomPlayView) {
            this.f67295a = musicBottomPlayView;
        }

        @Override // pi0.InterfaceC8301a
        public final MusicPlayItem a() {
            j jVarG;
            Li0.d dVar = this.f67295a.f67286g;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.a();
        }

        @Override // pi0.InterfaceC8301a
        public final void b(MusicPlayItem musicPlayItem) {
            j jVarG;
            List<MusicPlayVideo> listR;
            Pair pair;
            Li0.d dVar;
            MusicBottomPlayView musicBottomPlayView = this.f67295a;
            Li0.d dVar2 = musicBottomPlayView.f67286g;
            if (dVar2 == null || (jVarG = dVar2.g()) == null || (listR = jVarG.r()) == null) {
                return;
            }
            Pair pair2 = new Pair(-1, -1);
            Iterator<T> it = listR.iterator();
            int i7 = 0;
            while (true) {
                pair = pair2;
                if (!it.hasNext()) {
                    break;
                }
                MusicPlayVideo musicPlayVideo = (MusicPlayVideo) it.next();
                if (musicPlayVideo.getOid() == musicPlayItem.getOid()) {
                    pair = new Pair(Integer.valueOf(i7), Integer.valueOf(musicPlayVideo.getParts().indexOf(musicPlayItem)));
                    break;
                }
                i7++;
            }
            if (((Number) pair.getFirst()).intValue() < 0 || ((Number) pair.getSecond()).intValue() < 0 || (dVar = musicBottomPlayView.f67286g) == null) {
                return;
            }
            dVar.r(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }

        @Override // pi0.InterfaceC8301a
        public final boolean c() {
            Li0.d dVar = this.f67295a.f67286g;
            return dVar != null ? dVar.o() : false;
        }

        @Override // pi0.InterfaceC8301a
        public final void d(q qVar, o oVar) {
            j jVarG;
            Li0.d dVar = this.f67295a.f67286g;
            if (dVar == null || (jVarG = dVar.g()) == null) {
                return;
            }
            jVarG.d(qVar, oVar);
        }

        @Override // pi0.InterfaceC8301a
        public final int e() {
            Li0.d dVar = this.f67295a.f67286g;
            return dVar != null ? dVar.k() : 0;
        }

        @Override // pi0.InterfaceC8301a
        public final p f() {
            j jVarG;
            Li0.d dVar = this.f67295a.f67286g;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.f();
        }

        @Override // pi0.InterfaceC8301a
        public final void g(List<MusicPlayVideo> list) {
            j jVarG;
            Li0.d dVar = this.f67295a.f67286g;
            if (dVar == null || (jVarG = dVar.g()) == null) {
                return;
            }
            jVarG.k(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // pi0.InterfaceC8301a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<com.bilibili.music.podcast.data.MusicPlayVideo> h() {
            /*
                r2 = this;
                r0 = r2
                com.bilibili.music.podcast.view.mini.MusicBottomPlayView r0 = r0.f67295a
                Li0.d r0 = r0.f67286g
                r3 = r0
                r0 = r3
                if (r0 == 0) goto L22
                r0 = r3
                Ki0.j r0 = r0.g()
                r3 = r0
                r0 = r3
                if (r0 == 0) goto L22
                r0 = r3
                java.util.List r0 = r0.h()
                r4 = r0
                r0 = r4
                r3 = r0
                r0 = r4
                if (r0 != 0) goto L26
            L22:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
                r3 = r0
            L26:
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.mini.MusicBottomPlayView.c.h():java.util.List");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$d.class */
    public static final class d implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicBottomPlayView f67296a;

        public d(MusicBottomPlayView musicBottomPlayView) {
            this.f67296a = musicBottomPlayView;
        }

        public final void onPlayerStateChanged(int i7) {
            MusicBottomPlayView musicBottomPlayView = this.f67296a;
            if (i7 == 4) {
                musicBottomPlayView.getMPausePlay().setImageLevel(1);
                MusicBottomPlayView.c(musicBottomPlayView);
            } else if (i7 == 5) {
                musicBottomPlayView.getMPausePlay().setImageLevel(0);
                musicBottomPlayView.h();
            } else {
                if (i7 != 6) {
                    return;
                }
                musicBottomPlayView.getMPausePlay().setImageLevel(0);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$e.class */
    public static final class e implements InterfaceC5426f<MusicPlayVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicBottomPlayView f67297a;

        public e(MusicBottomPlayView musicBottomPlayView) {
            this.f67297a = musicBottomPlayView;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            return (musicPlayVideo2.getEventTracking() == null || musicPlayVideo2.isMiniReported()) ? false : true;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            Li0.d dVar = this.f67297a.f67286g;
            Bundle bundleP = null;
            j jVarG = dVar != null ? dVar.g() : null;
            if (jVarG != null) {
                bundleP = jVarG.p();
            }
            com.bilibili.music.podcast.utils.p.a(musicPlayVideo2, MusicBottomPlayView.d(bundleP), "mini");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/mini/MusicBottomPlayView$f.class */
    public static final class f implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicBottomPlayView f67298a;

        public f(MusicBottomPlayView musicBottomPlayView) {
            this.f67298a = musicBottomPlayView;
        }

        public final void onResolveFailed(Video video, Video.PlayableParams playableParams, String str) {
            Lifecycle.State currentState;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            MusicBottomPlayView musicBottomPlayView = this.f67298a;
            if (zIsEmpty) {
                str = musicBottomPlayView.getContext().getString(2131841717);
            }
            Context context = musicBottomPlayView.getContext();
            Li0.d dVar = musicBottomPlayView.f67286g;
            Lifecycle lifecycle = dVar != null ? dVar.f14660f : null;
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            if ((lifecycle == null || (currentState = lifecycle.getCurrentState()) == null) ? true : currentState.isAtLeast(Lifecycle.State.STARTED)) {
                ToastHelper.showToast(context, str, 0);
            }
        }
    }

    public MusicBottomPlayView(@NotNull Context context) {
        this(context, null);
    }

    public MusicBottomPlayView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67280a = LazyKt.lazy(new Q(this, 2));
        this.f67281b = LazyKt.lazy(new S(this, 2));
        this.f67282c = LazyKt.lazy(new Bc.f(this, 2));
        this.f67283d = LazyKt.lazy(new T(this, 2));
        this.f67284e = LazyKt.lazy(new U(this, 1));
        this.f67288j = LazyKt.lazy(new V(this, 1));
        this.f67289k = new n<>(new e(this));
        this.f67290l = new d(this);
        this.f67291m = new b(this);
        this.f67292n = new c(this);
        this.f67293o = new f(this);
        View.inflate(context, 2131499488, this);
        setVisibility(4);
        setOnClickListener(new View.OnClickListener(this, context) { // from class: cj0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicBottomPlayView f58948a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f58949b;

            {
                this.f58948a = this;
                this.f58949b = context;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [Qi0.c, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicBottomPlayView musicBottomPlayView = this.f58948a;
                Context context2 = this.f58949b;
                d dVar = musicBottomPlayView.f67286g;
                if (dVar != null && dVar.k() == 3) {
                    if (context2 == null) {
                        return;
                    }
                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://podcast/legacy").extras(new Function1(0) { // from class: Qi0.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f19955a;

                        {
                            this.f19955a = i;
                        }

                        public final Object invoke(Object obj) {
                            switch (this.f19955a) {
                                case 0:
                                    ((MutableBundleLike) obj).put("continue_play", "true");
                                    break;
                                default:
                                    GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                                    graphicsLayerScope.setShape(RoundedCornerShapeKt.m1502RoundedCornerShape0680j_4(Dp.m3880constructorimpl(22)));
                                    graphicsLayerScope.setClip(true);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }).build(), context2);
                    return;
                }
                ?? obj = new Object();
                obj.f19946b = -1L;
                obj.f19948d = -1L;
                obj.f19949e = -1L;
                obj.f19950f = -1;
                obj.f19951g = -1L;
                obj.h = "";
                obj.f19954k = -1L;
                obj.f19945a = true;
                if (context2 == null) {
                    return;
                }
                BLRouter.routeTo(new RouteRequest.Builder("bilibili://podcast/playlist").extras(new K0(obj, 1)).build(), context2);
            }
        });
        getMPlayListMenu().setOnClickListener(this);
        getMPausePlay().setOnClickListener(this);
    }

    public static final void b(MusicBottomPlayView musicBottomPlayView) {
        Li0.d dVar = musicBottomPlayView.f67286g;
        int i7 = 0;
        int iJ = dVar != null ? dVar.j() : 0;
        Li0.d dVar2 = musicBottomPlayView.f67286g;
        if (dVar2 != null) {
            i7 = dVar2.i();
        }
        if (i7 < 0 || iJ <= 0) {
            return;
        }
        SimpleProgressView mSimpleProgress = musicBottomPlayView.getMSimpleProgress();
        mSimpleProgress.getClass();
        mSimpleProgress.f67301c = (iJ <= 0 || i7 < 0) ? 0.0f : i7 / iJ;
        mSimpleProgress.invalidate();
    }

    public static final void c(MusicBottomPlayView musicBottomPlayView) {
        musicBottomPlayView.getMRefreshRunnable().run();
    }

    public static MusicPagerReportData d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        MusicPagerReportData musicPagerReportData = new MusicPagerReportData();
        musicPagerReportData.f66423b = bundle.getString("from_spmid", "");
        musicPagerReportData.f66427f = bundle.getString("from_route", "");
        return musicPagerReportData;
    }

    public static final void e(MusicBottomPlayView musicBottomPlayView, FragmentActivity fragmentActivity) {
        InterfaceC2299a interfaceC2299a;
        j jVarG;
        Li0.d dVar;
        Pi0.d dVarL;
        musicBottomPlayView.i();
        FragmentActivity fragmentActivity2 = null;
        if (fragmentActivity != null) {
            fragmentActivity2 = fragmentActivity;
        }
        C2300b c2300b = (C2300b) C2300b.f10294c.getValue();
        c2300b.getClass();
        C2300b.C0055b c0055b = (C2300b.C0055b) ((HashMap) c2300b.f10295a).get("music_player_tag");
        if (c0055b != null) {
            c2300b.a(c0055b, fragmentActivity2, "music_player_tag");
            interfaceC2299a = c0055b.f10300b;
        } else {
            Pi0.d dVar2 = new Pi0.d();
            dVar2.f18917g = -1;
            C2300b.C0055b c0055b2 = new C2300b.C0055b(c2300b, "music_player_tag", dVar2);
            c2300b.a(c0055b2, fragmentActivity2, "music_player_tag");
            ((HashMap) c2300b.f10295a).put("music_player_tag", c0055b2);
            interfaceC2299a = dVar2;
        }
        int iF = ((Pi0.d) interfaceC2299a).f();
        if (iF == 1 || iF == 2 || iF == 3) {
            musicBottomPlayView.f67286g = new Li0.d();
        }
        if (fragmentActivity != null && (dVar = musicBottomPlayView.f67286g) != null) {
            dVar.p(fragmentActivity);
            Lifecycle lifecycle = fragmentActivity.getLifecycle();
            dVar.f14660f = lifecycle;
            lifecycle.addObserver(dVar);
            j jVarG2 = dVar.g();
            if (jVarG2 != null && (dVarL = dVar.l()) != null) {
                dVarL.d(jVarG2);
            }
        }
        if (musicBottomPlayView.h) {
            return;
        }
        musicBottomPlayView.h = true;
        Li0.d dVar3 = musicBottomPlayView.f67286g;
        if (dVar3 != null) {
            d dVar4 = musicBottomPlayView.f67290l;
            Collections.SafeIteratorList<PlayerStateObserver> safeIteratorList = dVar3.f14658d;
            if (!safeIteratorList.contains(dVar4)) {
                safeIteratorList.add(dVar4);
            }
        }
        b bVar = musicBottomPlayView.f67291m;
        Li0.d dVar5 = musicBottomPlayView.f67286g;
        if (dVar5 != null && (jVarG = dVar5.g()) != null) {
            jVarG.q(bVar);
        }
        Li0.d dVar6 = musicBottomPlayView.f67286g;
        if (dVar6 != null) {
            f fVar = musicBottomPlayView.f67293o;
            Collections.SafeIteratorList<IVideosPlayDirectorService.VideoPlayEventListener> safeIteratorList2 = dVar6.f14656b;
            if (safeIteratorList2.contains(fVar)) {
                return;
            }
            safeIteratorList2.add(fVar);
        }
    }

    private final TextView getMAuthor() {
        return (TextView) this.f67282c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getMPausePlay() {
        return (ImageView) this.f67283d.getValue();
    }

    private final ImageView getMPlayListMenu() {
        return (ImageView) this.f67284e.getValue();
    }

    private final Runnable getMRefreshRunnable() {
        return (Runnable) this.f67288j.getValue();
    }

    private final SimpleProgressView getMSimpleProgress() {
        return (SimpleProgressView) this.f67280a.getValue();
    }

    private final TextView getMTitle() {
        return (TextView) this.f67281b.getValue();
    }

    public final void f(@Nullable FragmentActivity fragmentActivity, boolean z6, boolean z7) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (fragmentActivity == null) {
            return;
        }
        Li0.d dVar = this.f67286g;
        if (dVar == null || !dVar.o()) {
            e(this, fragmentActivity);
        }
        Li0.d dVar2 = this.f67286g;
        j jVarG = dVar2 != null ? dVar2.g() : null;
        int iV = jVarG != null ? jVarG.v() : 0;
        Li0.d dVar3 = this.f67286g;
        int iM = dVar3 != null ? dVar3.m() : 0;
        if (iV <= 0 || (z7 && (iM <= 0 || iM >= 7))) {
            if (getVisibility() != 4) {
                ValueAnimator valueAnimator3 = this.f67285f;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f67285f) != null) {
                    valueAnimator.cancel();
                }
                setVisibility(4);
                i();
            }
            Lazy<com.bilibili.music.podcast.view.mini.a> lazy = com.bilibili.music.podcast.view.mini.a.f67302c;
            a.C0391a.a().b(1);
            return;
        }
        Li0.d dVar4 = this.f67286g;
        MusicPlayVideo musicPlayVideoG = null;
        if (dVar4 != null) {
            j jVarG2 = dVar4.g();
            musicPlayVideoG = null;
            if (jVarG2 != null) {
                musicPlayVideoG = jVarG2.g();
            }
        }
        if (musicPlayVideoG != null) {
            this.f67289k.a(CollectionsKt.listOf(musicPlayVideoG));
            this.f67289k.b();
        }
        Lazy<com.bilibili.music.podcast.view.mini.a> lazy2 = com.bilibili.music.podcast.view.mini.a.f67302c;
        a.C0391a.a().b(2);
        setVisibility(0);
        ValueAnimator valueAnimator4 = this.f67285f;
        if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator2 = this.f67285f) != null) {
            valueAnimator2.cancel();
        }
        if (z6) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getHeight(), 0.0f);
            this.f67285f = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.addUpdateListener(new C5263a(this));
            }
            ValueAnimator valueAnimator5 = this.f67285f;
            if (valueAnimator5 != null) {
                valueAnimator5.setDuration(200L);
            }
            ValueAnimator valueAnimator6 = this.f67285f;
            if (valueAnimator6 != null) {
                valueAnimator6.start();
            }
        } else if (getTranslationY() != 0.0f) {
            setTranslationY(0.0f);
        }
        g();
        Li0.d dVar5 = this.f67286g;
        if (dVar5 == null || !dVar5.o()) {
            return;
        }
        d dVar6 = this.f67290l;
        Li0.d dVar7 = this.f67286g;
        int iM2 = 0;
        if (dVar7 != null) {
            iM2 = dVar7.m();
        }
        dVar6.onPlayerStateChanged(iM2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.mini.MusicBottomPlayView.g():void");
    }

    @Nullable
    public final MusicPlayItem getCurrentPlayItem() {
        j jVarG;
        Li0.d dVar = this.f67286g;
        return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.a();
    }

    public final void h() {
        HandlerThreads.remove(0, getMRefreshRunnable());
    }

    public final void i() {
        j jVarG;
        this.h = false;
        Li0.d dVar = this.f67286g;
        if (dVar != null) {
            dVar.f14658d.remove(this.f67290l);
        }
        Li0.d dVar2 = this.f67286g;
        if (dVar2 != null) {
            dVar2.f14656b.remove(this.f67293o);
        }
        b bVar = this.f67291m;
        Li0.d dVar3 = this.f67286g;
        if (dVar3 != null && (jVarG = dVar3.g()) != null) {
            jVarG.x(bVar);
        }
        h();
        Li0.d dVar4 = this.f67286g;
        if (dVar4 != null) {
            dVar4.c();
        }
        this.f67286g = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Li0.d dVar = this.f67286g;
        Bundle bundleP = null;
        j jVarG = dVar != null ? dVar.g() : null;
        int id = view.getId();
        if (id == 2131308945) {
            MusicPagerReportData musicPagerReportDataD = d(jVarG != null ? jVarG.p() : null);
            MusicPlayVideo musicPlayVideoG = jVarG != null ? jVarG.g() : null;
            com.bilibili.music.podcast.utils.p.f(musicPlayVideoG != null ? musicPlayVideoG.getEventTracking() : null, musicPagerReportDataD != null ? musicPagerReportDataD.f66423b : null);
            AlertDialogC8304d alertDialogC8304d = new AlertDialogC8304d(getContext());
            this.f67287i = alertDialogC8304d;
            alertDialogC8304d.show();
            AlertDialogC8304d alertDialogC8304d2 = this.f67287i;
            if (alertDialogC8304d2 != null) {
                alertDialogC8304d2.h(this.f67292n);
            }
            EventTracking eventTracking = musicPlayVideoG != null ? musicPlayVideoG.getEventTracking() : null;
            String str = null;
            if (musicPagerReportDataD != null) {
                str = musicPagerReportDataD.f66423b;
            }
            com.bilibili.music.podcast.utils.p.g(eventTracking, str);
            return;
        }
        if (id == 2131308709) {
            Li0.d dVar2 = this.f67286g;
            boolean zN = dVar2 != null ? dVar2.n() : false;
            Li0.d dVar3 = this.f67286g;
            if (zN) {
                if (dVar3 != null) {
                    dVar3.q();
                }
            } else if (dVar3 != null) {
                dVar3.u();
            }
            MusicPlayVideo musicPlayVideoG2 = jVarG != null ? jVarG.g() : null;
            if (jVarG != null) {
                bundleP = jVarG.p();
            }
            com.bilibili.music.podcast.utils.p.b(musicPlayVideoG2, d(bundleP), zN ? "pause" : "start", "video", new HashMap(), "mini");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }
}
