package com.bilibili.music.podcast.utils;

import Ci0.InterfaceC1518a;
import Ci0.InterfaceC1519b;
import Di0.InterfaceC1597a;
import Li0.C2539a;
import Si0.c;
import Ui0.C2911d;
import Wi0.C3042a;
import Xi0.C3124c;
import Zi0.C3176a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.bus.Violet;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.fragment.BaseLoadFragment;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.video.story.X;
import gi0.AbstractC7320a;
import gi0.C7297A;
import gi0.C7345z;
import hi0.AbstractC7445c;
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
import pi0.AlertDialogC8304d;
import pi0.InterfaceC8301a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.sms.Q;
import tv.danmaku.bili.sms.SmsLoginDialogActivityV3;
import tv.danmaku.bili.videopage.common.segment.ActivityEventDispatcher;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerSpeedChangedObserver;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I.class */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Li0.d f66918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public AbstractC7320a f66919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewPager2 f66920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f66921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AlertDialogC8304d f66922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C7297A f66923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.bilibili.music.podcast.data.j f66924g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f66926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f66927k;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public AbstractC7320a f66940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public RunnableC5428h f66941y;
    public long h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f66925i = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f66928l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.music.podcast.utils.l<MusicPlayVideo> f66929m = new com.bilibili.music.podcast.utils.l<>(new i(this));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final j f66930n = new j(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final k f66931o = new k(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final d f66932p = new d(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final h f66933q = new h(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f66934r = new a(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final l f66935s = new l(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final g f66936t = new g(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final e f66937u = new e(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final b f66938v = new b(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final f f66939w = new f(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$a.class */
    public static final class a implements InterfaceC1518a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66942a;

        public a(I i7) {
            this.f66942a = i7;
        }

        @Override // Ci0.InterfaceC1518a
        public final void a() {
            AbstractC7320a abstractC7320a;
            I i7 = this.f66942a;
            if (!I.a(i7) || (abstractC7320a = i7.f66940x) == null) {
                return;
            }
            BLog.i("MusicPlayListAdapter", "start buffering");
            AbstractC7445c abstractC7445cN = abstractC7320a.N(abstractC7320a.f120286e);
            if (abstractC7445cN != null) {
                abstractC7445cN.x0(null, "buffer_start");
            }
        }

        @Override // Ci0.InterfaceC1518a
        public final void onBufferingEnd() {
            AbstractC7320a abstractC7320a;
            I i7 = this.f66942a;
            if (!I.a(i7) || (abstractC7320a = i7.f66940x) == null) {
                return;
            }
            abstractC7320a.P();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$b.class */
    public static final class b implements AbstractC7320a.InterfaceC1271a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66943a;

        public b(I i7) {
            this.f66943a = i7;
        }

        @Override // gi0.AbstractC7320a.InterfaceC1271a
        public final void a(C7297A c7297a) {
            I i7 = this.f66943a;
            ViewPager2 viewPager2 = i7.f66920c;
            if (viewPager2 != null) {
                I.b(i7, viewPager2.getCurrentItem(), c7297a);
                BLog.i("PlayerAndUiJoint", "playItem triggered by onContainerCreated");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$c.class */
    public static final class c extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66944a;

        public c(I i7) {
            this.f66944a = i7;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int i7) {
            I i8 = this.f66944a;
            if (i7 == 0) {
                i8.f66926j = false;
            } else {
                if (i7 != 1) {
                    return;
                }
                i8.f66926j = true;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i7) {
            List<MusicPlayVideo> currentList;
            List<MusicPlayVideo> currentList2;
            AbstractC7445c abstractC7445cN;
            super.onPageSelected(i7);
            final I i8 = this.f66944a;
            ViewPager2 viewPager2 = i8.f66920c;
            com.bilibili.music.podcast.data.j jVar = null;
            androidx.compose.animation.z.c(viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null, "onPageSelected, mViewPager current page ", "PlayerAndUiJoint");
            AbstractC7320a abstractC7320a = i8.f66919b;
            Integer numValueOf = (abstractC7320a == null || (abstractC7445cN = abstractC7320a.N(abstractC7320a.f120286e)) == null) ? null : Integer.valueOf(abstractC7445cN.getBindingAdapterPosition());
            I.b(i8, i7, i8.f66923f);
            if (i8.f66923f != null) {
                i8.f66923f = null;
            }
            if (numValueOf != null && i8.f66926j && numValueOf.intValue() >= 0) {
                int iIntValue = numValueOf.intValue();
                AbstractC7320a abstractC7320a2 = i8.f66919b;
                if (iIntValue < ((abstractC7320a2 == null || (currentList2 = abstractC7320a2.getCurrentList()) == null) ? 0 : currentList2.size())) {
                    AbstractC7320a abstractC7320a3 = i8.f66919b;
                    MusicPlayVideo musicPlayVideo = (abstractC7320a3 == null || (currentList = abstractC7320a3.getCurrentList()) == null) ? null : currentList.get(numValueOf.intValue());
                    int iCompare = Intrinsics.compare(i7, numValueOf.intValue());
                    String str = iCompare > 0 ? "upglide" : iCompare < 0 ? "glide" : null;
                    if (str != null) {
                        com.bilibili.music.podcast.data.j jVar2 = i8.f66924g;
                        if (jVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPageData");
                        } else {
                            jVar = jVar2;
                        }
                        p.c(musicPlayVideo, jVar.a(), str, "video");
                    }
                }
            }
            ViewPager2 viewPager22 = i8.f66920c;
            if (viewPager22 != null) {
                final int i9 = 0;
                viewPager22.post(new Runnable(i8, i9) { // from class: com.bilibili.music.podcast.utils.J

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f66954a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f66955b;

                    {
                        this.f66954a = i9;
                        this.f66955b = i8;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Ki0.j jVarG;
                        Pair<Integer, Integer> pairB;
                        switch (this.f66954a) {
                            case 0:
                                I i10 = (I) this.f66955b;
                                if (i10.f66927k) {
                                    Li0.d dVar = i10.f66918a;
                                    Integer num = (dVar == null || (jVarG = dVar.g()) == null || (pairB = jVarG.b()) == null) ? null : (Integer) pairB.getFirst();
                                    if (num != null) {
                                        int iIntValue2 = num.intValue();
                                        bilibili.live.app.service.resolver.c.a(iIntValue2, "onPageSelected, shouldScrollTo is true, about to call scrollTo(), scroll to ", "PlayerAndUiJoint");
                                        I.c(i10, iIntValue2, false);
                                    }
                                }
                                break;
                            default:
                                SmsLoginDialogActivityV3 smsLoginDialogActivityV3 = (SmsLoginDialogActivityV3) this.f66955b;
                                ViewGroup viewGroup = smsLoginDialogActivityV3.c0;
                                if (viewGroup != null) {
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 0.0f, 1.0f);
                                    objectAnimatorOfFloat.addListener(new Q(smsLoginDialogActivityV3));
                                    objectAnimatorOfFloat.setDuration(100L);
                                    objectAnimatorOfFloat.start();
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$d.class */
    public static final class d implements Ki0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66945a;

        public d(I i7) {
            this.f66945a = i7;
        }

        @Override // Ki0.k
        public final void a(List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            BLog.i("PlayerAndUiJoint", "onDataRemove");
            I i7 = this.f66945a;
            AbstractC7320a abstractC7320a = i7.f66919b;
            if (abstractC7320a != null) {
                abstractC7320a.submitList(new ArrayList(list2));
            }
            AlertDialogC8304d alertDialogC8304d2 = i7.f66922e;
            if (alertDialogC8304d2 == null || !alertDialogC8304d2.isShowing() || (alertDialogC8304d = i7.f66922e) == null) {
                return;
            }
            alertDialogC8304d.d(list);
        }

        @Override // Ki0.k
        public final void b(List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            BLog.i("PlayerAndUiJoint", "onDataAdded");
            I i7 = this.f66945a;
            AbstractC7320a abstractC7320a = i7.f66919b;
            if (abstractC7320a != null) {
                abstractC7320a.submitList(new ArrayList(list2));
            }
            AlertDialogC8304d alertDialogC8304d2 = i7.f66922e;
            if (alertDialogC8304d2 == null || !alertDialogC8304d2.isShowing() || (alertDialogC8304d = i7.f66922e) == null) {
                return;
            }
            alertDialogC8304d.b(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
        @Override // Ki0.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(kotlin.Pair<java.lang.Integer, java.lang.Integer> r7, kotlin.Pair<java.lang.Integer, java.lang.Integer> r8, android.os.Bundle r9) {
            /*
                Method dump skipped, instruction units count: 669
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.I.d.c(kotlin.Pair, kotlin.Pair, android.os.Bundle):void");
        }

        @Override // Ki0.k
        public final void d(int i7, List<MusicPlayVideo> list, List<MusicPlayVideo> list2) {
            AlertDialogC8304d alertDialogC8304d;
            BLog.i("PlayerAndUiJoint", "onDataInsert");
            I i8 = this.f66945a;
            AbstractC7320a abstractC7320a = i8.f66919b;
            if (abstractC7320a != null) {
                abstractC7320a.submitList(new ArrayList(list2));
            }
            AlertDialogC8304d alertDialogC8304d2 = i8.f66922e;
            if (alertDialogC8304d2 != null && alertDialogC8304d2.isShowing() && (alertDialogC8304d = i8.f66922e) != null) {
                alertDialogC8304d.c(i7, list);
            }
            i8.f66927k = true;
        }

        @Override // Ki0.k
        public final void e(List list, Bundle bundle) {
            Ki0.j jVarG;
            I i7 = this.f66945a;
            com.bilibili.music.podcast.data.j jVar = i7.f66924g;
            com.bilibili.music.podcast.data.j jVar2 = jVar;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageData");
                jVar2 = null;
            }
            Pair<String, String> pairC = jVar2.c();
            Li0.d dVar = i7.f66918a;
            Ki0.j jVarG2 = dVar != null ? dVar.g() : null;
            if (jVarG2 != null) {
                String str = (String) pairC.getSecond();
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                jVarG2.n("content_session_id", str2);
            }
            if (!TextUtils.isEmpty((CharSequence) pairC.getFirst())) {
                com.bilibili.music.podcast.data.j jVar3 = i7.f66924g;
                com.bilibili.music.podcast.data.j jVar4 = jVar3;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageData");
                    jVar4 = null;
                }
                jVar4.e();
                if (jVarG2 != null) {
                    jVarG2.n("from_spmid", "");
                }
            }
            AbstractC7320a abstractC7320a = i7.f66919b;
            if (abstractC7320a != null) {
                abstractC7320a.submitList(null);
            }
            AbstractC7320a abstractC7320a2 = i7.f66919b;
            if (abstractC7320a2 != null) {
                abstractC7320a2.R(list);
            }
            Pair serializable = bundle.getSerializable("anchor_index");
            Pair pair = null;
            if (serializable instanceof Pair) {
                pair = serializable;
            }
            if (pair != null) {
                int iIntValue = ((Integer) pair.getFirst()).intValue();
                int iIntValue2 = ((Integer) pair.getSecond()).intValue();
                if (iIntValue < ((ArrayList) list).size()) {
                    Li0.d dVar2 = i7.f66918a;
                    if (dVar2 != null) {
                        dVar2.r(iIntValue, iIntValue2);
                        return;
                    }
                    return;
                }
                BLog.i("PlayerAndUiJoint", androidx.compose.runtime.collection.d.a(iIntValue, iIntValue2, "music index out of bounds -> [", ", ", "]"));
                Li0.d dVar3 = i7.f66918a;
                boolean zC = (dVar3 == null || (jVarG = dVar3.g()) == null) ? false : jVarG.c();
                Bundle bundleA = X.a("play_scroll", false);
                if (Ei0.b.a("pref_music_podcast_player_completion_action_key", 4) == 8) {
                    Li0.d dVar4 = i7.f66918a;
                    if (dVar4 != null) {
                        dVar4.t(bundleA, zC);
                        return;
                    }
                    return;
                }
                Li0.d dVar5 = i7.f66918a;
                if (dVar5 != null) {
                    dVar5.s(bundleA, zC);
                }
            }
        }

        @Override // Ki0.k
        public final void f(List list) {
            BLog.i("PlayerAndUiJoint", "onDataReorder");
            AbstractC7320a abstractC7320a = this.f66945a.f66919b;
            if (abstractC7320a == null || list == null) {
                return;
            }
            abstractC7320a.submitList(new ArrayList(list));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$e.class */
    public static final class e implements InterfaceC8301a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66946a;

        public e(I i7) {
            this.f66946a = i7;
        }

        @Override // pi0.InterfaceC8301a
        public final MusicPlayItem a() {
            Ki0.j jVarG;
            Li0.d dVar = this.f66946a.f66918a;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.a();
        }

        @Override // pi0.InterfaceC8301a
        public final void b(MusicPlayItem musicPlayItem) {
            Ki0.j jVarG;
            List<MusicPlayVideo> listR;
            Pair pair;
            Li0.d dVar;
            I i7 = this.f66946a;
            Li0.d dVar2 = i7.f66918a;
            if (dVar2 == null || (jVarG = dVar2.g()) == null || (listR = jVarG.r()) == null) {
                return;
            }
            Pair pair2 = new Pair(-1, -1);
            Iterator<T> it = listR.iterator();
            int i8 = 0;
            while (true) {
                pair = pair2;
                if (!it.hasNext()) {
                    break;
                }
                MusicPlayVideo musicPlayVideo = (MusicPlayVideo) it.next();
                if (musicPlayVideo.getOid() == musicPlayItem.getOid()) {
                    pair = new Pair(Integer.valueOf(i8), Integer.valueOf(musicPlayVideo.getParts().indexOf(musicPlayItem)));
                    break;
                }
                i8++;
            }
            if (((Number) pair.getFirst()).intValue() < 0 || ((Number) pair.getSecond()).intValue() < 0 || (dVar = i7.f66918a) == null) {
                return;
            }
            dVar.r(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }

        @Override // pi0.InterfaceC8301a
        public final boolean c() {
            Li0.d dVar = this.f66946a.f66918a;
            return dVar != null ? dVar.o() : false;
        }

        @Override // pi0.InterfaceC8301a
        public final void d(Ki0.q qVar, Ki0.o oVar) {
            Ki0.j jVarG;
            Li0.d dVar = this.f66946a.f66918a;
            if (dVar == null || (jVarG = dVar.g()) == null) {
                return;
            }
            jVarG.d(qVar, oVar);
        }

        @Override // pi0.InterfaceC8301a
        public final int e() {
            Li0.d dVar = this.f66946a.f66918a;
            return dVar != null ? dVar.k() : 0;
        }

        @Override // pi0.InterfaceC8301a
        public final Ki0.p f() {
            Ki0.j jVarG;
            Li0.d dVar = this.f66946a.f66918a;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.f();
        }

        @Override // pi0.InterfaceC8301a
        public final void g(List<MusicPlayVideo> list) {
            Ki0.j jVarG;
            Li0.d dVar = this.f66946a.f66918a;
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
                com.bilibili.music.podcast.utils.I r0 = r0.f66946a
                Li0.d r0 = r0.f66918a
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.I.e.h():java.util.List");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$f.class */
    public static final class f implements InterfaceC1519b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66947a;

        public f(I i7) {
            this.f66947a = i7;
        }

        @Override // Ci0.InterfaceC1519b
        public final void a(int i7) {
            AbstractC7320a abstractC7320a;
            I i8 = this.f66947a;
            Li0.d dVar = i8.f66918a;
            if ((dVar == null || i7 != dVar.k()) && (abstractC7320a = i8.f66940x) != null) {
                abstractC7320a.S(5);
                abstractC7320a.P();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$g.class */
    public static final class g implements InterfaceC5424d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66948a;

        public g(I i7) {
            this.f66948a = i7;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final MusicPlayItem a() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.h() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> b() {
            /*
                r5 = this;
                r0 = r5
                com.bilibili.music.podcast.utils.I r0 = r0.f66948a
                Li0.d r0 = r0.f66918a
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L22
                r0 = r6
                Ki0.j r0 = r0.g()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L22
                r0 = r6
                kotlin.Pair r0 = r0.b()
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                if (r0 != 0) goto L32
            L22:
                kotlin.Pair r0 = new kotlin.Pair
                r1 = r0
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.<init>(r2, r3)
                r6 = r0
            L32:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.I.g.b():kotlin.Pair");
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final boolean c() {
            Ki0.j jVarG;
            Li0.d dVar = this.f66948a.f66918a;
            return (dVar == null || (jVarG = dVar.g()) == null) ? false : jVarG.c();
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void d(InterfaceC1597a interfaceC1597a) {
            Pi0.d dVarL;
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar == null || (dVarL = dVar.l()) == null) {
                return;
            }
            dVarL.h = interfaceC1597a;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void e(Bundle bundle, boolean z6) {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.t(bundle, z6);
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final Ki0.m f() {
            Ki0.j jVarG;
            Li0.d dVar = this.f66948a.f66918a;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.i();
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final MusicPlayVideo g() {
            Ki0.j jVarG;
            Li0.d dVar = this.f66948a.f66918a;
            return (dVar == null || (jVarG = dVar.g()) == null) ? null : jVarG.g();
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final float getBufferedPercentage() {
            Li0.d dVar = this.f66948a.f66918a;
            float bufferedPercentage = 0.0f;
            if (dVar != null) {
                Pi0.d dVarL = dVar.l();
                bufferedPercentage = 0.0f;
                if (dVarL != null) {
                    Ci0.g gVar = dVarL.f18911a;
                    bufferedPercentage = 0.0f;
                    if (gVar != null) {
                        if (gVar.f1621j) {
                            IPlayerContainer iPlayerContainer = gVar.f1614b;
                            bufferedPercentage = 0.0f;
                            if (iPlayerContainer != null) {
                                IPlayerCoreService playerCoreService = iPlayerContainer.getPlayerCoreService();
                                bufferedPercentage = 0.0f;
                                if (playerCoreService != null) {
                                    bufferedPercentage = playerCoreService.getBufferedPercentage();
                                }
                            }
                        } else {
                            bufferedPercentage = 0.0f;
                        }
                    }
                }
            }
            return bufferedPercentage;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final int getCurrentPosition() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.i() : 0;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final int getDuration() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.j() : 0;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final float getPlaySpeed() {
            Li0.d dVar = this.f66948a.f66918a;
            float fA = 1.0f;
            if (dVar != null) {
                if (dVar.o()) {
                    Pi0.d dVarL = dVar.l();
                    fA = 1.0f;
                    if (dVarL != null) {
                        fA = dVarL.h();
                    }
                } else {
                    Ki0.j jVarG = dVar.g();
                    MusicPlayItem musicPlayItemA = jVarG != null ? jVarG.a() : null;
                    fA = 1.0f;
                    if (musicPlayItemA != null) {
                        fA = jVarG.i().a(musicPlayItemA.getOid());
                    }
                }
            }
            return fA;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final int getPlayerState() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.m() : 0;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void h(int i7) {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.y(i7);
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final boolean i() {
            Li0.d dVar = this.f66948a.f66918a;
            boolean z6 = false;
            if (dVar != null) {
                z6 = false;
                if (dVar.n()) {
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void j() {
            Pi0.d dVarL;
            Ci0.g gVar;
            PlayerHeadsetService playerHeadsetService;
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar == null || (dVarL = dVar.l()) == null || (gVar = dVarL.f18911a) == null || (playerHeadsetService = (PlayerHeadsetService) gVar.f1617e.getService()) == null) {
                return;
            }
            playerHeadsetService.updatePlaybackState();
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final boolean k() {
            Li0.d dVar = this.f66948a.f66918a;
            boolean z6 = false;
            if (dVar != null) {
                z6 = false;
                if (dVar.o()) {
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final int l() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.f() : 0;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void m() {
            I i7 = this.f66948a;
            Context context = i7.f66921d;
            Context context2 = context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            i7.f66922e = new AlertDialogC8304d(context2);
            AlertDialogC8304d alertDialogC8304d = i7.f66922e;
            if (alertDialogC8304d != null) {
                alertDialogC8304d.show();
            }
            AlertDialogC8304d alertDialogC8304d2 = i7.f66922e;
            if (alertDialogC8304d2 != null) {
                alertDialogC8304d2.h(i7.f66937u);
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void n(Bundle bundle, boolean z6) {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.s(bundle, z6);
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final int[] o() {
            Li0.d dVar = this.f66948a.f66918a;
            return dVar != null ? dVar.e() : new int[0];
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final boolean p() {
            Li0.d dVar = this.f66948a.f66918a;
            boolean z6 = false;
            if (dVar != null) {
                Pi0.d dVarL = dVar.l();
                z6 = false;
                if (dVarL != null) {
                    z6 = dVarL.f18914d;
                }
            }
            return z6;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void pause() {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.q();
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void resume() {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.u();
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void seekTo(int i7) {
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar != null) {
                dVar.v(i7);
            }
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5424d
        public final void setPlaySpeed(float f7) {
            Ci0.g gVar;
            IPlayerContainer iPlayerContainer;
            IPlayerCoreService playerCoreService;
            Li0.d dVar = this.f66948a.f66918a;
            if (dVar == null || dVar.f14659e) {
                return;
            }
            if (!dVar.o()) {
                Ki0.j jVarG = dVar.g();
                MusicPlayItem musicPlayItemA = jVarG != null ? jVarG.a() : null;
                if (musicPlayItemA != null) {
                    jVarG.i().b(f7, musicPlayItemA.getOid());
                }
                dVar.f14657c.forEach(new C2539a(f7));
                return;
            }
            Pi0.d dVarL = dVar.l();
            if (dVarL == null || (gVar = dVarL.f18911a) == null || !gVar.f1621j || (iPlayerContainer = gVar.f1614b) == null || (playerCoreService = iPlayerContainer.getPlayerCoreService()) == null) {
                return;
            }
            playerCoreService.setPlaySpeed(f7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$h.class */
    public static final class h implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66949a;

        public h(I i7) {
            this.f66949a = i7;
        }

        public final void onPlayerStateChanged(int i7) {
            AbstractC7320a abstractC7320a;
            I i8 = this.f66949a;
            if (!I.a(i8) || (abstractC7320a = i8.f66940x) == null) {
                return;
            }
            abstractC7320a.S(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$i.class */
    public static final class i implements InterfaceC5426f<MusicPlayVideo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66950a;

        public i(I i7) {
            this.f66950a = i7;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final boolean a(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            return (musicPlayVideo2.getEventTracking() == null || musicPlayVideo2.isReported()) ? false : true;
        }

        @Override // com.bilibili.music.podcast.utils.InterfaceC5426f
        public final void b(MusicPlayVideo musicPlayVideo) {
            MusicPlayVideo musicPlayVideo2 = musicPlayVideo;
            com.bilibili.music.podcast.data.j jVar = this.f66950a.f66924g;
            com.bilibili.music.podcast.data.j jVar2 = jVar;
            if (jVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageData");
                jVar2 = null;
            }
            p.a(musicPlayVideo2, jVar2.a(), "normal");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$j.class */
    public static final class j implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66951a;

        public j(I i7) {
            this.f66951a = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$k.class */
    public static final class k implements IPlayerSpeedChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66952a;

        public k(I i7) {
            this.f66952a = i7;
        }

        public final void onChanged(float f7) {
            AbstractC7320a abstractC7320a = this.f66952a.f66919b;
            if (abstractC7320a != null) {
                Iterator<Map.Entry<MusicPlayVideo, AbstractC7445c>> it = abstractC7320a.f120285d.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().x0(null, "speed");
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/I$l.class */
    public static final class l implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I f66953a;

        public l(I i7) {
            this.f66953a = i7;
        }

        public final void onResolveFailed(Video video, Video.PlayableParams playableParams, String str) {
            Lifecycle.State currentState;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            Lifecycle lifecycle = null;
            I i7 = this.f66953a;
            if (zIsEmpty) {
                Context context = i7.f66921d;
                Context context2 = context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context2 = null;
                }
                str = context2.getString(2131841717);
            }
            Context context3 = i7.f66921d;
            Context context4 = context3;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context4 = null;
            }
            Li0.d dVar = i7.f66918a;
            if (dVar != null) {
                lifecycle = dVar.f14660f;
            }
            if (context4 != null && !TextUtils.isEmpty(str)) {
                if ((lifecycle == null || (currentState = lifecycle.getCurrentState()) == null) ? true : currentState.isAtLeast(Lifecycle.State.STARTED)) {
                    ToastHelper.showToast(context4, str, 0);
                }
            }
            AbstractC7320a abstractC7320a = i7.f66940x;
            if (abstractC7320a != null) {
                abstractC7320a.P();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.bilibili.music.podcast.utils.I r4) {
        /*
            r0 = r4
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f66920c
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L48
            r0 = r7
            int r0 = r0.getCurrentItem()
            r5 = r0
            r0 = r4
            Li0.d r0 = r0.f66918a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L36
            r0 = r4
            Ki0.j r0 = r0.g()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L36
            r0 = r4
            kotlin.Pair r0 = r0.b()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L36
            r0 = r4
            java.lang.Object r0 = r0.getFirst()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r4 = r0
            goto L38
        L36:
            r0 = 0
            r4 = r0
        L38:
            r0 = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r4
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L48
            r0 = 1
            r6 = r0
            goto L4a
        L48:
            r0 = 0
            r6 = r0
        L4a:
            java.lang.String r0 = "change player state isCurrentPlayItem="
            java.lang.String r1 = "PlayerAndUiJoint"
            r2 = r6
            j4.t.a(r0, r1, r2)
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.I.a(com.bilibili.music.podcast.utils.I):boolean");
    }

    public static final void b(I i7, int i8, C7297A c7297a) {
        List<MusicPlayVideo> currentList;
        MusicPlayVideo musicPlayVideo;
        Ki0.j jVarG;
        AbstractC7445c abstractC7445cN;
        AbstractC7320a abstractC7320a;
        List<MusicPlayVideo> currentList2;
        MusicPlayVideo musicPlayVideo2;
        AbstractC7320a abstractC7320a2 = i7.f66919b;
        if (abstractC7320a2 != null) {
            if (i8 < 0 || i8 >= abstractC7320a2.getCurrentList().size()) {
                BLog.w("MusicPlayListAdapter", "position is index out of bounds");
            } else {
                MusicPlayVideo musicPlayVideo3 = abstractC7320a2.getCurrentList().get(i8);
                if (Intrinsics.areEqual(musicPlayVideo3, abstractC7320a2.f120286e)) {
                    BLog.w("MusicPlayListAdapter", "it has playing");
                } else {
                    if (abstractC7320a2.N(musicPlayVideo3) != null) {
                        bilibili.live.app.service.resolver.c.a(i8, "will play position=", "PlayerAndUiJoint");
                        I i9 = i7.f66930n.f66951a;
                        Li0.d dVar = i9.f66918a;
                        if (dVar != null && !dVar.f14659e && (abstractC7320a = i9.f66919b) != null && (currentList2 = abstractC7320a.getCurrentList()) != null && (musicPlayVideo2 = currentList2.get(i8)) != null) {
                            List listListOf = CollectionsKt.listOf(musicPlayVideo2);
                            com.bilibili.music.podcast.utils.l<MusicPlayVideo> lVar = i9.f66929m;
                            lVar.a(listListOf);
                            lVar.b();
                        }
                        BLog.i("PlayerAndUiJoint", "delayHandlePlayMessage ==" + c7297a + "， delayHandlePlayMessage.isPlay == " + (c7297a != null ? Boolean.valueOf(c7297a.f120097b) : null));
                        if (c7297a == null || c7297a.f120097b) {
                            Li0.d dVar2 = i7.f66918a;
                            MusicPlayVideo musicPlayVideoG = (dVar2 == null || (jVarG = dVar2.g()) == null) ? null : jVarG.g();
                            Long lValueOf = musicPlayVideoG != null ? Long.valueOf(musicPlayVideoG.getOid()) : null;
                            AbstractC7320a abstractC7320a3 = i7.f66919b;
                            if (Intrinsics.areEqual(lValueOf, (abstractC7320a3 == null || (currentList = abstractC7320a3.getCurrentList()) == null || (musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(currentList, i8)) == null) ? null : Long.valueOf(musicPlayVideo.getOid()))) {
                                BLog.i("PlayerAndUiJoint", "play video equal current video,so we not play it");
                            } else {
                                Li0.d dVar3 = i7.f66918a;
                                if (dVar3 != null) {
                                    dVar3.r(i8, 0);
                                }
                            }
                        }
                        AbstractC7320a abstractC7320a4 = i7.f66919b;
                        if (abstractC7320a4 != null) {
                            MusicPlayVideo musicPlayVideo4 = abstractC7320a4.f120286e;
                            if (musicPlayVideo4 != null && (abstractC7445cN = abstractC7320a4.N(musicPlayVideo4)) != null) {
                                abstractC7445cN.w0();
                            }
                            MusicPlayVideo musicPlayVideo5 = abstractC7320a4.getCurrentList().get(i8);
                            AbstractC7445c abstractC7445cN2 = abstractC7320a4.N(musicPlayVideo5);
                            if (abstractC7445cN2 != null) {
                                abstractC7445cN2.v0(i8);
                            }
                            abstractC7320a4.f120286e = musicPlayVideo5;
                        }
                        AbstractC7320a abstractC7320a5 = i7.f66919b;
                        MusicPlayVideo musicPlayVideo6 = abstractC7320a5 != null ? abstractC7320a5.f120286e : null;
                        if (i7.f66925i) {
                            if (musicPlayVideo6 != null && i7.h != -1 && musicPlayVideo6.getOid() == i7.h) {
                                MusicPlayItem musicPlayItem = (MusicPlayItem) CollectionsKt.getOrNull(musicPlayVideo6.getParts(), 0);
                                if (musicPlayItem == null) {
                                    BLog.w("PlayerAndUiJoint", "first anchor show comment but playItem is null");
                                }
                                if (musicPlayItem != null) {
                                    AbstractC7320a abstractC7320a6 = i7.f66919b;
                                    c.b bVar = null;
                                    if (abstractC7320a6 != null) {
                                        bVar = abstractC7320a6.f120289i;
                                    }
                                    RunnableC5428h runnableC5428h = new RunnableC5428h(bVar, musicPlayItem);
                                    i7.f66941y = runnableC5428h;
                                    HandlerThreads.postDelayed(0, runnableC5428h, 800L);
                                }
                            }
                            i7.h = -1L;
                        }
                        if (i7.f66925i) {
                            i7.f66925i = false;
                            return;
                        }
                        return;
                    }
                    BLog.w("MusicPlayListAdapter", "playViewHolder is null,something is err");
                }
            }
        }
        BLog.w("PlayerAndUiJoint", "viewpager position changed but something has err");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.bilibili.music.podcast.utils.I r7, int r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.I.c(com.bilibili.music.podcast.utils.I, int, boolean):void");
    }

    public final void d(@NotNull Context context, @NotNull Ah1.b bVar, @Nullable Li0.d dVar, @Nullable ViewPager2 viewPager2, @NotNull ViewGroup viewGroup, @NotNull com.bilibili.music.podcast.data.j jVar) {
        RecyclerView recyclerView;
        Pi0.d dVarL;
        Ki0.j jVarG;
        this.f66924g = jVar;
        this.f66921d = context;
        BaseLoadFragment baseLoadFragment = (BaseLoadFragment) bVar;
        this.f66918a = dVar;
        if (dVar != null) {
            Collections.SafeIteratorList<PlayerStateObserver> safeIteratorList = dVar.f14658d;
            h hVar = this.f66933q;
            if (!safeIteratorList.contains(hVar)) {
                safeIteratorList.add(hVar);
            }
        }
        Li0.d dVar2 = this.f66918a;
        if (dVar2 != null) {
            Collections.SafeIteratorList<InterfaceC1518a> safeIteratorList2 = dVar2.f14655a;
            a aVar = this.f66934r;
            if (!safeIteratorList2.contains(aVar)) {
                safeIteratorList2.add(aVar);
            }
        }
        Li0.d dVar3 = this.f66918a;
        if (dVar3 != null) {
            Collections.SafeIteratorList<IVideosPlayDirectorService.VideoPlayEventListener> safeIteratorList3 = dVar3.f14656b;
            l lVar = this.f66935s;
            if (!safeIteratorList3.contains(lVar)) {
                safeIteratorList3.add(lVar);
            }
        }
        Li0.d dVar4 = this.f66918a;
        if (dVar4 != null && (jVarG = dVar4.g()) != null) {
            jVarG.q(this.f66932p);
        }
        Li0.d dVar5 = this.f66918a;
        if (dVar5 != null && (dVarL = dVar5.l()) != null) {
            Collections.SafeIteratorList<InterfaceC1519b> safeIteratorList4 = dVarL.f18913c;
            f fVar = this.f66939w;
            if (!safeIteratorList4.contains(fVar)) {
                safeIteratorList4.add(fVar);
            }
        }
        Li0.d dVar6 = this.f66918a;
        if (dVar6 != null) {
            Collections.SafeIteratorList<IPlayerSpeedChangedObserver> safeIteratorList5 = dVar6.f14657c;
            k kVar = this.f66931o;
            if (!safeIteratorList5.contains(kVar)) {
                safeIteratorList5.add(kVar);
            }
        }
        this.f66920c = viewPager2;
        if (viewPager2 != null) {
            int childCount = viewPager2.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    recyclerView = null;
                    break;
                }
                View childAt = viewPager2.getChildAt(i7);
                if (childAt instanceof RecyclerView) {
                    recyclerView = (RecyclerView) childAt;
                    break;
                }
                i7++;
            }
            if (recyclerView != null) {
                recyclerView.setItemAnimator(null);
            }
        }
        ViewPager2 viewPager22 = this.f66920c;
        if (viewPager22 != null) {
            viewPager22.registerOnPageChangeCallback(this.f66928l);
        }
        RecyclerView.Adapter adapter = viewPager2 != null ? viewPager2.getAdapter() : null;
        if (adapter instanceof AbstractC7320a) {
            this.f66919b = (AbstractC7320a) adapter;
        }
        AbstractC7320a abstractC7320a = this.f66919b;
        if (abstractC7320a != null) {
            com.bilibili.music.podcast.data.j jVar2 = this.f66924g;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageData");
                jVar2 = null;
            }
            abstractC7320a.f120290j = jVar2.a();
        }
        AbstractC7320a abstractC7320a2 = this.f66919b;
        if (abstractC7320a2 != null) {
            abstractC7320a2.h = this.f66938v;
        }
        if (abstractC7320a2 != null) {
            abstractC7320a2.f120287f = this.f66936t;
        }
        if (abstractC7320a2 != null) {
            abstractC7320a2.f120284c = baseLoadFragment;
            ActivityEventDispatcher activityEventDispatcher = new ActivityEventDispatcher();
            abstractC7320a2.f120292l = activityEventDispatcher;
            activityEventDispatcher.b = bVar;
            activityEventDispatcher.Me(viewGroup);
            C7345z c7345z = (C7345z) abstractC7320a2.f120291k.getValue();
            BaseLoadFragment baseLoadFragment2 = abstractC7320a2.f120284c;
            HashMap<MusicPlayVideo, AbstractC7445c> map = abstractC7320a2.f120285d;
            c7345z.getClass();
            if (baseLoadFragment2 != null) {
                Fragment fragment = baseLoadFragment2.getFragment();
                c7345z.f120363b = map;
                Violet violet = Violet.INSTANCE;
                violet.ofChannel(C3124c.class).observe(fragment, c7345z.f120364c);
                violet.ofChannel(Ti0.g.class).observe(fragment, c7345z.f120365d);
                violet.ofChannel(C3042a.class).observe(fragment, c7345z.f120366e);
                violet.ofChannel(C3176a.class).observe(fragment, c7345z.f120367f);
                violet.ofChannel(com.bilibili.music.podcast.utils.favorite.d.class).observe(fragment, c7345z.f120368g);
                violet.ofChannel(C2911d.class).observe(fragment, c7345z.h);
                violet.ofChannel(aj0.f.class).observe(fragment, c7345z.f120369i);
                violet.ofChannel(com.bilibili.music.podcast.utils.triple.b.class).observe(fragment, c7345z.f120370j);
            }
        }
        this.f66940x = this.f66919b;
    }

    public final void e() {
        Ki0.j jVarG;
        Pi0.d dVarL;
        this.f66926j = false;
        Li0.d dVar = this.f66918a;
        if (dVar != null) {
            dVar.f14658d.remove(this.f66933q);
        }
        Li0.d dVar2 = this.f66918a;
        if (dVar2 != null) {
            dVar2.f14655a.remove(this.f66934r);
        }
        Li0.d dVar3 = this.f66918a;
        if (dVar3 != null) {
            dVar3.f14656b.remove(this.f66935s);
        }
        Li0.d dVar4 = this.f66918a;
        if (dVar4 != null && (dVarL = dVar4.l()) != null) {
            dVarL.f18913c.remove(this.f66939w);
        }
        Li0.d dVar5 = this.f66918a;
        if (dVar5 != null) {
            dVar5.f14657c.remove(this.f66931o);
        }
        RunnableC5428h runnableC5428h = this.f66941y;
        if (runnableC5428h != null) {
            HandlerThreads.remove(0, runnableC5428h);
        }
        ViewPager2 viewPager2 = this.f66920c;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f66928l);
        }
        Li0.d dVar6 = this.f66918a;
        if (dVar6 != null && (jVarG = dVar6.g()) != null) {
            jVarG.x(this.f66932p);
        }
        AbstractC7320a abstractC7320a = this.f66919b;
        if (abstractC7320a != null) {
            C7345z c7345z = (C7345z) abstractC7320a.f120291k.getValue();
            c7345z.getClass();
            Violet violet = Violet.INSTANCE;
            violet.ofChannel(C3124c.class).removeObserver(c7345z.f120364c);
            violet.ofChannel(Ti0.g.class).removeObserver(c7345z.f120365d);
            violet.ofChannel(C3042a.class).removeObserver(c7345z.f120366e);
            violet.ofChannel(C3176a.class).removeObserver(c7345z.f120367f);
            violet.ofChannel(com.bilibili.music.podcast.utils.favorite.d.class).removeObserver(c7345z.f120368g);
            violet.ofChannel(C2911d.class).removeObserver(c7345z.h);
            violet.ofChannel(aj0.f.class).removeObserver(c7345z.f120369i);
            violet.ofChannel(com.bilibili.music.podcast.utils.triple.b.class).removeObserver(c7345z.f120370j);
            Fragment fragment = abstractC7320a.f120292l;
            if (fragment != null) {
                Ah1.a aVar = ((ActivityEventDispatcher) fragment).b;
                FragmentManager childFragmentManager = null;
                Ah1.a aVar2 = aVar;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mHost");
                    aVar2 = null;
                }
                if (aVar2 instanceof Ah1.a) {
                    childFragmentManager = aVar2.getActivity().getSupportFragmentManager();
                } else if (aVar2 != null) {
                    childFragmentManager = aVar2.getFragment().getChildFragmentManager();
                }
                if (childFragmentManager != null) {
                    childFragmentManager.beginTransaction().remove(fragment).commitNowAllowingStateLoss();
                }
            }
            ActivityEventDispatcher activityEventDispatcher = abstractC7320a.f120292l;
            if (activityEventDispatcher != null) {
                activityEventDispatcher.onDetach();
            }
            AbstractC7445c abstractC7445cN = abstractC7320a.N(abstractC7320a.f120286e);
            if (abstractC7445cN != null) {
                abstractC7445cN.w0();
            }
        }
    }
}
