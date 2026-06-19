package com.bilibili.ship.theseus.miniplayer.ui;

import Oi1.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.playershared.GuideStyle;
import com.bapis.bilibili.playershared.LimitActionType;
import com.bapis.bilibili.playershared.ViewInfo;
import com.bilibili.app.comm.ugc.miniplayer.common.f;
import com.bilibili.app.comment3.ui.widget.k;
import com.bilibili.bililive.room.biz.shopping.beans.LiveGoodsCardDetail;
import com.bilibili.bililive.room.biz.shopping.view.goodslist.LiveRoomShoppingGoodsListFragment;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.ImageSpannableTextViewCompat;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel;
import com.bilibili.ship.theseus.miniplayer.ui.c;
import com.bilibili.upos.videoupload.UpOSTask;
import com.bilibili.upos.videoupload.db.UploadTaskDao;
import j4.t;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.clock.PlayerProgressRangeObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import uq0.InterfaceC8754b;
import vh0.AbstractC8809a;
import vu0.AbstractC8860a;
import wh0.C8887d;
import wu0.C8927b;
import wu0.C8928c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel.class */
public final class UnitedMiniPlayerPanel extends AbstractC8809a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f91156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f91157u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.miniplayer.ui.b f91158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC8860a f91159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f91160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public CoroutineScope f91161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CE0.a f91162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final CE0.b f91163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final d f91164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final b f91165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f91166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final c f91167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final a f91168s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedMiniPlayerPanel f91169a;

        public a(UnitedMiniPlayerPanel unitedMiniPlayerPanel) {
            this.f91169a = unitedMiniPlayerPanel;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            super.onCompleted(iCardPlayerContext);
            this.f91169a.f91166q = true;
        }

        public final void onPrepared(ICardPlayerContext iCardPlayerContext) {
            super.onPrepared(iCardPlayerContext);
            UnitedMiniPlayerPanel unitedMiniPlayerPanel = this.f91169a;
            unitedMiniPlayerPanel.u();
            iCardPlayerContext.unregisterPlayerProgressRangeObserver(unitedMiniPlayerPanel.f91164o);
            long duration = iCardPlayerContext.getDuration();
            if (duration >= UnitedMiniPlayerPanel.f91157u) {
                iCardPlayerContext.registerPlayerProgressRangeObserver(unitedMiniPlayerPanel.f91164o, duration - ((long) UnitedMiniPlayerPanel.f91156t), duration);
            }
        }

        public final void onResume(ICardPlayerContext iCardPlayerContext) {
            super.onResume(iCardPlayerContext);
            this.f91169a.u();
        }

        public final boolean onSourcePlayable(ICardPlayerContext iCardPlayerContext, MediaResource mediaResource) {
            ExtraInfo extraInfo;
            ViewInfo viewInfo;
            int color;
            if (mediaResource == null || (extraInfo = mediaResource.getExtraInfo()) == null || (viewInfo = (ViewInfo) C8927b.f129019a.a(extraInfo)) == null) {
                return true;
            }
            com.bilibili.ship.theseus.miniplayer.ui.c cVarA = c.a.a(viewInfo);
            GuideStyle guideStyle = cVarA != null ? cVarA.f91184c : null;
            Set<GuideStyle> set = C8928c.f129020q;
            boolean zContains = CollectionsKt.contains(set, guideStyle);
            if ((guideStyle == null || zContains) && (!zContains || mediaResource.isPlayable())) {
                return true;
            }
            com.bilibili.ship.theseus.miniplayer.ui.c cVarA2 = c.a.a(viewInfo);
            LimitActionType limitActionType = cVarA2 != null ? cVarA2.f91185d : null;
            LimitActionType limitActionType2 = LimitActionType.SKIP_CURRENT_EP;
            UnitedMiniPlayerPanel unitedMiniPlayerPanel = this.f91169a;
            if (limitActionType != limitActionType2) {
                if (!CollectionsKt.contains(set, cVarA2 != null ? cVarA2.f91184c : null)) {
                    String str = null;
                    if (cVarA2 != null) {
                        Integer numB = Uj0.a.b(cVarA2.f91183b);
                        if (numB != null) {
                            color = numB.intValue();
                        } else {
                            Context context = unitedMiniPlayerPanel.f128255f;
                            if (context == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("context");
                                context = null;
                            }
                            color = ContextCompat.getColor(context, R$color.Ga5_u);
                        }
                        com.bilibili.ship.theseus.miniplayer.ui.b bVar = unitedMiniPlayerPanel.f91158i;
                        String str2 = bVar.f91179g;
                        str = cVarA2.f91182a;
                        if (!Intrinsics.areEqual(str, str2)) {
                            bVar.f91179g = str;
                            bVar.notifyPropertyChanged(352);
                        }
                        com.bilibili.ship.theseus.miniplayer.ui.b bVar2 = unitedMiniPlayerPanel.f91158i;
                        if (color != bVar2.f91178f) {
                            bVar2.f91178f = color;
                            bVar2.notifyPropertyChanged(353);
                        }
                    }
                    com.bilibili.ship.theseus.miniplayer.ui.b bVar3 = unitedMiniPlayerPanel.f91158i;
                    boolean z6 = str == null || str.length() == 0;
                    if (z6 != bVar3.f91174b) {
                        bVar3.f91174b = z6;
                        bVar3.notifyPropertyChanged(578);
                    }
                    com.bilibili.ship.theseus.miniplayer.ui.b bVar4 = unitedMiniPlayerPanel.f91158i;
                    boolean z7 = !bVar4.f91174b;
                    if (z7 != bVar4.f91175c) {
                        bVar4.f91175c = z7;
                        bVar4.notifyPropertyChanged(580);
                    }
                    unitedMiniPlayerPanel.f91166q = true;
                    return false;
                }
            }
            com.bilibili.mini.player.biz.c cVar = unitedMiniPlayerPanel.f128252c;
            if (cVar != null && com.bilibili.mini.player.biz.b.k(cVar.f66062a)) {
                return false;
            }
            com.bilibili.ship.theseus.miniplayer.ui.b bVar5 = unitedMiniPlayerPanel.f91158i;
            if (true == bVar5.f91174b) {
                return false;
            }
            bVar5.f91174b = true;
            bVar5.notifyPropertyChanged(578);
            return false;
        }

        public final void onStart(ICardPlayerContext iCardPlayerContext) {
            UnitedMiniPlayerPanel unitedMiniPlayerPanel = this.f91169a;
            unitedMiniPlayerPanel.u();
            CoroutineScope coroutineScope = unitedMiniPlayerPanel.f91161l;
            if (coroutineScope != null) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UnitedMiniPlayerPanel$performNextSheet$1(unitedMiniPlayerPanel, null), 3, (Object) null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$b.class */
    public static final class b implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedMiniPlayerPanel f91170a;

        public b(UnitedMiniPlayerPanel unitedMiniPlayerPanel) {
            this.f91170a = unitedMiniPlayerPanel;
        }

        public final void c() {
            UnitedMiniPlayerPanel unitedMiniPlayerPanel = this.f91170a;
            unitedMiniPlayerPanel.t(unitedMiniPlayerPanel.f128251b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$c.class */
    public static final class c implements InterfaceC8754b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedMiniPlayerPanel f91171a;

        public c(UnitedMiniPlayerPanel unitedMiniPlayerPanel) {
            this.f91171a = unitedMiniPlayerPanel;
        }

        @Override // uq0.InterfaceC8754b
        public final void d() {
            this.f91171a.f91166q = true;
        }

        @Override // uq0.InterfaceC8754b
        public final void e() {
            this.f91171a.f91166q = false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$d.class */
    public static final class d implements PlayerProgressRangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedMiniPlayerPanel f91172a;

        public d(UnitedMiniPlayerPanel unitedMiniPlayerPanel) {
            this.f91172a = unitedMiniPlayerPanel;
        }

        public final void onRangeStateChanged(boolean z6, int i7) {
            UnitedMiniPlayerPanel unitedMiniPlayerPanel = this.f91172a;
            com.bilibili.mini.player.biz.c cVar = unitedMiniPlayerPanel.f128252c;
            if (cVar != null && cVar.a() && z6) {
                com.bilibili.ship.theseus.miniplayer.ui.b bVar = unitedMiniPlayerPanel.f91158i;
                if (true != bVar.f91173a) {
                    bVar.f91173a = true;
                    bVar.notifyPropertyChanged(577);
                }
                if (unitedMiniPlayerPanel.f91160k && true != bVar.f91180i) {
                    bVar.f91180i = true;
                    bVar.notifyPropertyChanged(390);
                }
            }
        }
    }

    static {
        ConfigManager.Companion companion = ConfigManager.Companion;
        Integer intOrNull = StringsKt.toIntOrNull(companion.getConfig("miniplayer.play_next_hint_interval", "6000"));
        f91156t = intOrNull != null ? intOrNull.intValue() : 6000;
        Integer intOrNull2 = StringsKt.toIntOrNull(companion.getConfig("miniplayer.play_next_hint_min_duration", "30000"));
        f91157u = intOrNull2 != null ? intOrNull2.intValue() : 30000;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [CE0.a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [CE0.b] */
    public UnitedMiniPlayerPanel() {
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = new com.bilibili.ship.theseus.miniplayer.ui.b();
        this.f91158i = bVar;
        this.f91160k = true;
        final int i7 = 2;
        this.f91162m = new Runnable(this, i7) { // from class: CE0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1537b;

            {
                this.f1536a = i7;
                this.f1537b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f1536a) {
                    case 0:
                        UpOSTask upOSTask = (UpOSTask) this.f1537b;
                        upOSTask.c.cancel();
                        UploadTaskDao.instance(upOSTask.a).delete(upOSTask.b.getId());
                        break;
                    case 1:
                        LiveRoomShoppingGoodsListFragment liveRoomShoppingGoodsListFragment = (LiveRoomShoppingGoodsListFragment) this.f1537b;
                        qG.e eVar = liveRoomShoppingGoodsListFragment.m;
                        if ((eVar != null ? eVar.getItemCount() : 0) > 0) {
                            qG.e eVar2 = liveRoomShoppingGoodsListFragment.m;
                            Object item = eVar2 != null ? eVar2.getItem(0) : null;
                            if (item instanceof LiveGoodsCardDetail) {
                                LiveGoodsCardDetail liveGoodsCardDetail = (LiveGoodsCardDetail) item;
                                if (liveGoodsCardDetail.isExplaining()) {
                                    liveGoodsCardDetail.hotBuyNum = 0L;
                                    qG.e eVar3 = liveRoomShoppingGoodsListFragment.m;
                                    if (eVar3 != null) {
                                        eVar3.notifyItemChanged(0);
                                    }
                                    liveRoomShoppingGoodsListFragment.n = System.currentTimeMillis();
                                }
                            }
                        }
                        break;
                    default:
                        UnitedMiniPlayerPanel unitedMiniPlayerPanel = (UnitedMiniPlayerPanel) this.f1537b;
                        com.bilibili.ship.theseus.miniplayer.ui.b bVar2 = unitedMiniPlayerPanel.f91158i;
                        if (bVar2.f91173a) {
                            bVar2.f91173a = false;
                            bVar2.notifyPropertyChanged(577);
                        }
                        if (unitedMiniPlayerPanel.f91160k && bVar2.f91180i) {
                            bVar2.f91180i = false;
                            bVar2.notifyPropertyChanged(390);
                        }
                        break;
                }
            }
        };
        final int i8 = 2;
        this.f91163n = new Runnable(this, i8) { // from class: CE0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1539b;

            {
                this.f1538a = i8;
                this.f1539b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f1538a) {
                    case 0:
                        UpOSTask upOSTask = (UpOSTask) this.f1539b;
                        ConcurrentHashMap concurrentHashMap = UpOSTask.n;
                        synchronized (upOSTask) {
                            if (upOSTask.e) {
                                return;
                            }
                            upOSTask.c.pause();
                            return;
                        }
                    case 1:
                        ImageSpannableTextViewCompat imageSpannableTextViewCompat = (ImageSpannableTextViewCompat) this.f1539b;
                        float textSize = imageSpannableTextViewCompat.getTextSize();
                        imageSpannableTextViewCompat.setTextSize(0, textSize - 0.001f);
                        imageSpannableTextViewCompat.setTextSize(0, textSize);
                        return;
                    default:
                        com.bilibili.ship.theseus.miniplayer.ui.b bVar2 = ((UnitedMiniPlayerPanel) this.f1539b).f91158i;
                        if (bVar2.f91181j) {
                            bVar2.f91181j = false;
                            bVar2.notifyPropertyChanged(370);
                            return;
                        }
                        return;
                }
            }
        };
        this.f91164o = new d(this);
        this.f91165p = new b(this);
        this.f91166q = true;
        this.f91167r = new c(this);
        k kVar = new k(this, 1);
        if (!Intrinsics.areEqual(kVar, bVar.f91176d)) {
            bVar.f91176d = kVar;
            bVar.notifyPropertyChanged(ErrorCode.E_T0_INIT_FAILED);
        }
        Mu.a aVar = new Mu.a(this, 1);
        if (!Intrinsics.areEqual(aVar, bVar.f91177e)) {
            bVar.f91177e = aVar;
            bVar.notifyPropertyChanged(407);
        }
        this.f91168s = new a(this);
    }

    public static final void s(UnitedMiniPlayerPanel unitedMiniPlayerPanel, boolean z6, String str) {
        if (z6) {
            AbstractC8860a abstractC8860a = unitedMiniPlayerPanel.f91159j;
            AbstractC8860a abstractC8860a2 = abstractC8860a;
            if (abstractC8860a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a2 = null;
            }
            abstractC8860a2.f128439A.getNextTipsTextView$theseus_miniplayer_release().setText("");
            AbstractC8860a abstractC8860a3 = unitedMiniPlayerPanel.f91159j;
            AbstractC8860a abstractC8860a4 = abstractC8860a3;
            if (abstractC8860a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a4 = null;
            }
            abstractC8860a4.f128439A.getNextButton$theseus_miniplayer_release().setAlpha(0.4f);
        } else {
            AbstractC8860a abstractC8860a5 = unitedMiniPlayerPanel.f91159j;
            AbstractC8860a abstractC8860a6 = abstractC8860a5;
            if (abstractC8860a5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a6 = null;
            }
            AppCompatTextView nextTipsTextView$theseus_miniplayer_release = abstractC8860a6.f128439A.getNextTipsTextView$theseus_miniplayer_release();
            Context context = unitedMiniPlayerPanel.f128255f;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            nextTipsTextView$theseus_miniplayer_release.setText(context.getString(2131846974));
            AbstractC8860a abstractC8860a7 = unitedMiniPlayerPanel.f91159j;
            AbstractC8860a abstractC8860a8 = abstractC8860a7;
            if (abstractC8860a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a8 = null;
            }
            abstractC8860a8.f128439A.getNextButton$theseus_miniplayer_release().setAlpha(1.0f);
        }
        AbstractC8860a abstractC8860a9 = unitedMiniPlayerPanel.f91159j;
        AbstractC8860a abstractC8860a10 = abstractC8860a9;
        if (abstractC8860a9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingView");
            abstractC8860a10 = null;
        }
        abstractC8860a10.f128439A.getNextTitleTextView$theseus_miniplayer_release().setText(str);
        AbstractC8860a abstractC8860a11 = unitedMiniPlayerPanel.f91159j;
        AbstractC8860a abstractC8860a12 = abstractC8860a11;
        if (abstractC8860a11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingView");
            abstractC8860a12 = null;
        }
        boolean z7 = !z6;
        abstractC8860a12.f128439A.getNextTipsTextView$theseus_miniplayer_release().setEnabled(z7);
        AbstractC8860a abstractC8860a13 = unitedMiniPlayerPanel.f91159j;
        AbstractC8860a abstractC8860a14 = abstractC8860a13;
        if (abstractC8860a13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingView");
            abstractC8860a14 = null;
        }
        abstractC8860a14.f128439A.getNextTitleTextView$theseus_miniplayer_release().setEnabled(z7);
        AbstractC8860a abstractC8860a15 = unitedMiniPlayerPanel.f91159j;
        if (abstractC8860a15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingView");
            abstractC8860a15 = null;
        }
        abstractC8860a15.f128439A.getNextButton$theseus_miniplayer_release().setEnabled(z7);
    }

    @Override // vh0.AbstractC8809a
    public final void c() {
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        if (bVar.f91173a) {
            bVar.f91173a = false;
            bVar.notifyPropertyChanged(577);
        }
        if (this.f91160k && bVar.f91180i) {
            bVar.f91180i = false;
            bVar.notifyPropertyChanged(390);
        }
    }

    @Override // vh0.AbstractC8809a
    @NotNull
    public final ViewGroup d() {
        return (ViewGroup) e().findViewById(2131307505);
    }

    @Override // vh0.AbstractC8809a
    public final void f() {
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        if (bVar.f91181j) {
            bVar.f91181j = false;
            bVar.notifyPropertyChanged(370);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // vh0.AbstractC8809a
    public final void g() {
        super.g();
        this.f91161l = f.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        if (this.f91159j == null) {
            AbstractC8860a abstractC8860aBind = AbstractC8860a.bind(e());
            this.f91159j = abstractC8860aBind;
            AbstractC8860a abstractC8860a = abstractC8860aBind;
            if (abstractC8860aBind == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a = null;
            }
            com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
            abstractC8860a.q(bVar);
            AbstractC8860a abstractC8860a2 = this.f91159j;
            AbstractC8860a abstractC8860a3 = abstractC8860a2;
            if (abstractC8860a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a3 = null;
            }
            abstractC8860a3.f128442D.getCloseBtn$theseus_miniplayer_release().setOnClickListener(new Ua0.k(this, 3));
            AbstractC8860a abstractC8860a4 = this.f91159j;
            AbstractC8860a abstractC8860a5 = abstractC8860a4;
            if (abstractC8860a4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a5 = null;
            }
            final int i7 = 0;
            abstractC8860a5.f128442D.getResumeBtn$theseus_miniplayer_release().setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.miniplayer.ui.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f91186a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f91187b;

                {
                    this.f91186a = i7;
                    this.f91187b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r11) {
                    /*
                        Method dump skipped, instruction units count: 264
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.miniplayer.ui.d.onClick(android.view.View):void");
                }
            });
            AbstractC8860a abstractC8860a6 = this.f91159j;
            AbstractC8860a abstractC8860a7 = abstractC8860a6;
            if (abstractC8860a6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a7 = null;
            }
            abstractC8860a7.f128442D.getRewindBtn$theseus_miniplayer_release().setOnClickListener(new Ms.d(this, 1));
            AbstractC8860a abstractC8860a8 = this.f91159j;
            AbstractC8860a abstractC8860a9 = abstractC8860a8;
            if (abstractC8860a8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a9 = null;
            }
            abstractC8860a9.f128442D.getFastForwardBtn$theseus_miniplayer_release().setOnClickListener(new com.bilibili.bplus.followinglist.module.item.topic.k(this, 1));
            if (i.c()) {
                if (true != bVar.f91181j) {
                    bVar.f91181j = true;
                    bVar.notifyPropertyChanged(370);
                }
                View viewE = e();
                CE0.b bVar2 = this.f91163n;
                viewE.removeCallbacks(bVar2);
                e().postDelayed(bVar2, PayTask.f60018j);
            }
            AbstractC8860a abstractC8860a10 = this.f91159j;
            if (abstractC8860a10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bindingView");
                abstractC8860a10 = null;
            }
            abstractC8860a10.f128439A.setOnClickListener(new Gv.i(this, 1));
        }
        ((C8887d) this.f128250a.f128669a.getValue()).f128668a.add((T) this.f91168s);
    }

    @Override // vh0.AbstractC8809a
    public final void h() {
        Video.PlayableParams currentPlayableParams;
        Video.DisplayParams displayParams;
        DisplayOrientation displayOrientation;
        super.h();
        BiliCardPlayerScene.CardPlayTask.Token token = this.f128251b;
        if (token == null || (currentPlayableParams = token.getCurrentPlayableParams()) == null || (displayParams = currentPlayableParams.getDisplayParams()) == null || (displayOrientation = displayParams.getDisplayOrientation()) == null) {
            return;
        }
        com.bilibili.ad.adview.pegasus.banner.topview.specialdanmaku.k kVar = new com.bilibili.ad.adview.pegasus.banner.topview.specialdanmaku.k(displayOrientation, 3);
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        if (!Intrinsics.areEqual(kVar, bVar.h)) {
            bVar.h = kVar;
            bVar.notifyPropertyChanged(108);
        }
        CoroutineScope coroutineScope = this.f91161l;
        if (coroutineScope != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UnitedMiniPlayerPanel$onBindToMiniPlayer$2(this, null), 3, (Object) null);
        }
        BiliCardPlayerScene.CardPlayTask.Token token2 = this.f128251b;
        if (token2 != null) {
            token2.addCloudConfigObserver(this.f91165p);
        }
        BiliCardPlayerScene.CardPlayTask.Token token3 = this.f128251b;
        if (token3 != null) {
            token3.addHeadsetEventObserver(this.f91167r);
        }
        t(this.f128251b);
    }

    @Override // vh0.AbstractC8809a
    @NotNull
    public final View i(@NotNull LayoutInflater layoutInflater) {
        return layoutInflater.inflate(2131500364, (ViewGroup) null, false);
    }

    @Override // vh0.AbstractC8809a
    public final void j() {
        super.j();
        e().removeCallbacks(this.f91162m);
        e().removeCallbacks(this.f91163n);
        ((C8887d) this.f128250a.f128669a.getValue()).f128668a.remove(this.f91168s);
        u();
        CoroutineScope coroutineScope = this.f91161l;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // vh0.AbstractC8809a
    public final void k() {
        super.k();
        BiliCardPlayerScene.CardPlayTask.Token token = this.f128251b;
        if (token != null) {
            token.removeCloudConfigObserver(this.f91165p);
        }
        BiliCardPlayerScene.CardPlayTask.Token token2 = this.f128251b;
        if (token2 != null) {
            token2.removeHeadsetEventObserver(this.f91167r);
        }
    }

    @Override // vh0.AbstractC8809a
    public final void n() {
        super.n();
        u();
        if (this.f91160k) {
            com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
            if (bVar.f91180i) {
                bVar.f91180i = false;
                bVar.notifyPropertyChanged(390);
            }
        }
        this.f91160k = false;
    }

    @Override // vh0.AbstractC8809a
    public final void o() {
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        if (bVar.f91173a) {
            bVar.f91173a = false;
            bVar.notifyPropertyChanged(577);
        }
        if (this.f91160k && bVar.f91180i) {
            bVar.f91180i = false;
            bVar.notifyPropertyChanged(390);
        }
    }

    @Override // vh0.AbstractC8809a
    public final void p(long j7) {
        View viewE = e();
        CE0.a aVar = this.f91162m;
        viewE.removeCallbacks(aVar);
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        boolean z6 = bVar.f91173a;
        if (z6) {
            if (z6) {
                bVar.f91173a = false;
                bVar.notifyPropertyChanged(577);
            }
            if (this.f91160k && bVar.f91180i) {
                bVar.f91180i = false;
                bVar.notifyPropertyChanged(390);
                return;
            }
            return;
        }
        if (true != z6) {
            bVar.f91173a = true;
            bVar.notifyPropertyChanged(577);
        }
        if (this.f91160k && true != bVar.f91180i) {
            bVar.f91180i = true;
            bVar.notifyPropertyChanged(390);
        }
        e().postDelayed(aVar, j7);
    }

    public final void t(BiliCardPlayerScene.CardPlayTask.Token token) {
        Oi1.d playerSettingCloudConfig;
        d.a aVarM;
        Oi1.d playerSettingCloudConfig2;
        if ((token == null || (playerSettingCloudConfig2 = token.getPlayerSettingCloudConfig()) == null || playerSettingCloudConfig2.G()) && (token == null || (playerSettingCloudConfig = token.getPlayerSettingCloudConfig()) == null || (aVarM = playerSettingCloudConfig.m()) == null || !aVarM.a)) {
            return;
        }
        t.a("video perform actionNext:", "UnitedMiniPlayerPanel", this.f91166q);
        if (this.f91166q) {
            com.bilibili.mini.player.biz.c cVar = this.f128252c;
            if (cVar != null) {
                cVar.b();
                return;
            }
            return;
        }
        com.bilibili.mini.player.biz.c cVar2 = this.f128252c;
        if (cVar2 != null) {
            com.bilibili.mini.player.biz.b.l(cVar2.f66062a);
        }
    }

    public final void u() {
        com.bilibili.ship.theseus.miniplayer.ui.b bVar = this.f91158i;
        if (bVar.f91174b) {
            bVar.f91174b = false;
            bVar.notifyPropertyChanged(578);
        }
        if (bVar.f91175c) {
            bVar.f91175c = false;
            bVar.notifyPropertyChanged(580);
        }
    }
}
