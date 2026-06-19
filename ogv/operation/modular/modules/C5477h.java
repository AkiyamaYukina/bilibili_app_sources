package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.infra.legacy.exposure.d;
import com.bilibili.ogv.infra.tempfile.e;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.operation.legacy.BangumiBannerIndicator;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.common.base.Optional;
import com.google.gson.JsonObject;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.Banner;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.ICardPlayerInfoListener;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h.class */
@StabilityInferred(parameters = 0)
public final class C5477h extends com.bilibili.ogv.operation.inlineplayer2.a<InlinePanel> implements Banner.OnBannerSlideListener, IExposureReporter {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f70619x = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Ek0.A f70620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f70622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f70623g;

    @NotNull
    public final J41.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.emoticon.emoji2.f f70624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Wu0.j f70625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Banner f70626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BangumiBannerIndicator f70627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardView f70628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BiliImageView f70629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BiliImageView f70630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f70631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Ck0.a f70632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public List<CommonCard> f70633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f70634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f70635t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Job f70636u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Disposable f70637v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f70638w;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends InlinePanel {
        @NotNull
        public final View onCreateView(@NotNull LayoutInflater layoutInflater) {
            return new View(layoutInflater.getContext());
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h$b.class */
    public static final class b implements Nk0.e {
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h$c.class */
    public static final class c implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5477h f70639a;

        public c(C5477h c5477h) {
            this.f70639a = c5477h;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            C5477h c5477h = this.f70639a;
            C5490v c5490v = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
            if (c5490v != null) {
                c5490v.m(false);
            }
            C5490v c5490v2 = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
            if (c5490v2 != null) {
                c5490v2.n(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h$d.class */
    public static final class d implements ICardPlayerInfoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5477h f70640a;

        public d(C5477h c5477h) {
            this.f70640a = c5477h;
        }

        public final void onInfo(int i7, Object obj) {
            C5488t c5488t;
            CommonCard commonCard;
            ICardPlayerContext cardPlayerContext;
            C5488t c5488t2;
            C5477h c5477h = this.f70640a;
            if (i7 != 1) {
                if (i7 == 2) {
                    C5490v c5490v = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
                    if (c5490v != null) {
                        c5490v.m(true);
                    }
                    Wu0.j jVar = c5477h.f70625j;
                    C5490v c5490v2 = ((Ek0.A) jVar.f27377b).f4266B;
                    if (c5490v2 != null && (c5488t2 = c5490v2.f70772f) != null && true != c5488t2.f70762w) {
                        c5488t2.f70762w = true;
                        c5488t2.notifyPropertyChanged(270);
                    }
                    InlinePanel inlinePanelV0 = c5477h.v0();
                    if (inlinePanelV0 != null && (cardPlayerContext = inlinePanelV0.getCardPlayerContext()) != null) {
                        cardPlayerContext.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
                    }
                    C5490v c5490v3 = ((Ek0.A) jVar.f27377b).f4266B;
                    Map<String, String> map = (c5490v3 == null || (c5488t = c5490v3.f70772f) == null || (commonCard = c5488t.f70757r) == null) ? null : commonCard.f69701D0;
                    Map<String, String> mapEmptyMap = map;
                    if (map == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Neurons.reportExposure$default(false, C8770a.a(new StringBuilder("pgc."), c5477h.f70623g, ".banner.dynamic.show"), mapEmptyMap, (List) null, 8, (Object) null);
                    return;
                }
                if (i7 != 3) {
                    return;
                }
            }
            C5490v c5490v4 = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
            if (c5490v4 != null) {
                c5490v4.m(false);
            }
            C5490v c5490v5 = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
            if (c5490v5 != null) {
                c5490v5.n(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.h$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/h$e.class */
    public static final class e<T1, T2, T3, R> implements Function3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e<T1, T2, T3, R> f70641a = (e<T1, T2, T3, R>) new Object();

        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(((Optional) obj).orNull(), ((Optional) obj2).orNull(), ((Optional) obj3).orNull());
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Ck0.a, java.lang.Object] */
    public C5477h(@NotNull Ek0.A a7, @NotNull Pk0.w wVar, @Nullable String str, @NotNull String str2, @NotNull J41.b bVar, @NotNull com.bilibili.app.comm.emoticon.emoji2.f fVar, @NotNull Wu0.j jVar) {
        super(a7.getRoot());
        this.f70620d = a7;
        this.f70621e = wVar;
        this.f70622f = str;
        this.f70623g = str2;
        this.h = bVar;
        this.f70624i = fVar;
        this.f70625j = jVar;
        this.f70631p = -1;
        this.f70632q = new Object();
        this.f70633r = CollectionsKt.emptyList();
        this.f70634s = true;
        this.f70638w = LazyKt.lazy(new UI.c(this, 3));
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    public final boolean A0() {
        C5490v c5490v = ((Ek0.A) this.f70625j.f27377b).f4266B;
        boolean z6 = false;
        if (c5490v != null) {
            z6 = false;
            if (c5490v.f70767a) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void E0() {
        C5488t c5488t;
        List<C5488t> list;
        C5488t c5488t2;
        Wu0.j jVar = this.f70625j;
        C5490v c5490v = ((Ek0.A) jVar.f27377b).f4266B;
        if (c5490v == null || (c5488t = c5490v.f70772f) == null) {
            return;
        }
        CommonCard commonCard = c5488t.f70757r;
        FrameLayout frameLayout = null;
        Ek0.A a7 = (Ek0.A) jVar.f27377b;
        if (commonCard != null && commonCard.f69719M0 && c5488t.f70756q) {
            if (c5490v != null && true != c5490v.h) {
                c5490v.h = true;
                c5490v.notifyPropertyChanged(579);
            }
            C5490v c5490v2 = a7.f4266B;
            if (c5490v2 != null && (c5488t2 = c5490v2.f70772f) != null && true != c5488t2.f70764y) {
                c5488t2.f70764y = true;
                c5488t2.notifyPropertyChanged(265);
            }
            FrameLayout frameLayout2 = this.f70626k;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banner");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.post(new c10.e(this, c5488t));
            return;
        }
        Job job = this.f70636u;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f70636u = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), (CoroutineContext) null, (CoroutineStart) null, new ExpandableBannerHolder$checkVideoPlay$1(this, null), 3, (Object) null);
        C5490v c5490v3 = a7.f4266B;
        if (c5490v3 == null || (list = c5490v3.f70769c) == null) {
            return;
        }
        for (C5488t c5488t3 : list) {
            boolean z6 = c5488t3 == c5488t;
            if (z6 != c5488t3.f70752m) {
                c5488t3.f70752m = z6;
                c5488t3.notifyPropertyChanged(550);
            }
        }
    }

    public final void F0(final C5488t c5488t) {
        C5490v c5490v = ((Ek0.A) this.f70625j.f27377b).f4266B;
        if ((c5490v != null ? c5490v.f70772f : null) == c5488t) {
            return;
        }
        if (c5490v != null && !Intrinsics.areEqual(c5488t, c5490v.f70772f)) {
            c5490v.f70772f = c5488t;
            c5490v.notifyPropertyChanged(168);
        }
        Disposable disposable = this.f70637v;
        if (disposable != null) {
            disposable.dispose();
        }
        Context context = this.f70620d.getRoot().getContext();
        Single singleZip = Single.zip(r.a(context, c5488t.f70745e), r.a(context, c5488t.f70747g), r.a(context, c5488t.f70746f), e.f70641a);
        Functions.v vVar = Functions.a;
        this.f70637v = singleZip.subscribe(new Consumer(this, c5488t) { // from class: com.bilibili.ogv.operation.modular.modules.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5477h f70615a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C5488t f70616b;

            {
                this.f70615a = this;
                this.f70616b = c5488t;
            }

            public final void accept(Object obj) {
                Triple triple = (Triple) obj;
                Bitmap bitmap = (Bitmap) triple.component1();
                Bitmap bitmap2 = (Bitmap) triple.component2();
                Bitmap bitmap3 = (Bitmap) triple.component3();
                C5477h c5477h = this.f70615a;
                C5490v c5490v2 = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
                C5488t c5488t2 = this.f70616b;
                if (c5490v2 != null) {
                    Drawable bitmapDrawable = bitmap != null ? new BitmapDrawable(bitmap) : c5488t2.f70744d;
                    if (!Intrinsics.areEqual(bitmapDrawable, c5490v2.f70770d)) {
                        c5490v2.f70770d = bitmapDrawable;
                        c5490v2.notifyPropertyChanged(31);
                    }
                }
                la0.f fVar = c5488t2.f70751l;
                if (fVar != null) {
                    fVar.f = bitmap3 != null ? new BitmapDrawable(bitmap3) : null;
                }
                la0.f fVar2 = c5488t2.f70751l;
                if (fVar2 != null) {
                    BitmapDrawable bitmapDrawable2 = null;
                    if (bitmap2 != null) {
                        bitmapDrawable2 = new BitmapDrawable(bitmap2);
                    }
                    fVar2.g = bitmapDrawable2;
                }
                la0.f fVar3 = c5488t2.f70751l;
                if (fVar3 != null) {
                    c5477h.h.invoke(fVar3);
                }
                c5477h.f70620d.executePendingBindings();
            }
        }, new Consumer(this, c5488t) { // from class: com.bilibili.ogv.operation.modular.modules.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5477h f70617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C5488t f70618b;

            {
                this.f70617a = this;
                this.f70618b = c5488t;
            }

            public final void accept(Object obj) {
                C5477h c5477h = this.f70617a;
                C5490v c5490v2 = ((Ek0.A) c5477h.f70625j.f27377b).f4266B;
                C5488t c5488t2 = this.f70618b;
                if (c5490v2 != null) {
                    Ak0.b bVar = c5488t2.f70744d;
                    if (!Intrinsics.areEqual(bVar, c5490v2.f70770d)) {
                        c5490v2.f70770d = bVar;
                        c5490v2.notifyPropertyChanged(31);
                    }
                }
                la0.f fVar = c5488t2.f70751l;
                if (fVar != null) {
                    c5477h.h.invoke(fVar);
                }
                c5477h.f70620d.executePendingBindings();
            }
        });
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final void Xa(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType, @Nullable View view) {
        CommonCard commonCard;
        SourceContent sourceContent;
        CommonCard commonCard2;
        IExposureReporter.ReporterCheckerType reporterCheckerType2 = IExposureReporter.ReporterCheckerType.DefaultChecker;
        if (reporterCheckerType != reporterCheckerType2) {
            if (reporterCheckerType != IExposureReporter.ReporterCheckerType.ExtraChecker || (commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70633r, i7)) == null || (sourceContent = commonCard.f69715K0) == null) {
                return;
            }
            IAdReporter.exposeAll$default(GAdCoreKt.getGAdReport(), sourceContent, (ExtraParams) null, (String) null, false, (List) null, (String) null, false, SearchBangumiItem.TYPE_FULLNET_MOVIE, (Object) null);
            return;
        }
        CommonCard commonCard3 = (CommonCard) CollectionsKt.getOrNull(this.f70633r, i7);
        if (commonCard3 != null) {
            StringBuilder sb = new StringBuilder("pgc.");
            String str = this.f70623g;
            String strA = C8770a.a(sb, str, ".operation.0.show");
            Map<String, String> map = commonCard3.f69701D0;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportExposure$default(false, strA, mapEmptyMap, (List) null, 8, (Object) null);
            List<CommonCard> listL = commonCard3.l();
            if (listL.size() > 1) {
                String strA2 = android.support.v4.media.a.a("pgc.", str, ".banner-button.0.show");
                Map<String, String> map2 = listL.get(0).f69701D0;
                Map<String, String> mapEmptyMap2 = map2;
                if (map2 == null) {
                    mapEmptyMap2 = MapsKt.emptyMap();
                }
                Neurons.reportExposure$default(false, strA2, mapEmptyMap2, (List) null, 8, (Object) null);
                String strA3 = android.support.v4.media.a.a("pgc.", str, ".banner-button.0.show");
                Map<String, String> map3 = listL.get(1).f69701D0;
                Map<String, String> mapEmptyMap3 = map3;
                if (map3 == null) {
                    mapEmptyMap3 = MapsKt.emptyMap();
                }
                Neurons.reportExposure$default(false, strA3, mapEmptyMap3, (List) null, 8, (Object) null);
            }
        }
        if (reporterCheckerType != reporterCheckerType2 || (commonCard2 = (CommonCard) CollectionsKt.getOrNull(this.f70633r, i7)) == null) {
            return;
        }
        commonCard2.f69736V = true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider] */
    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        cardPlayTask.setCommonResolveTaskProvider((CommonResolveTaskProvider) new Object());
        cardPlayTask.setTaskRepository(new com.bilibili.ogv.operation.inlineplayer2.d());
        cardPlayTask.addPlayerStateChangedCallback(new c(this));
        cardPlayTask.addCardPlayInfoListener(new d(this));
        cardPlayTask.setNetworkAlertEnable(false);
        cardPlayTask.setNetworkToastEnable(false);
        return cardPlayTask;
    }

    @NotNull
    public final IInlineCardData getCardData() {
        return (IInlineCardData) this.f70638w.getValue();
    }

    @NotNull
    public final Class<? extends InlinePanel> getPanelType() {
        return a.class;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    public final void onBindPanel(@NotNull InlinePanel inlinePanel) {
        super.onBindPanel(inlinePanel);
        inlinePanel.setOnClickListener(new com.bilibili.biligame.ui.minev3.d(this, 2));
    }

    public final void onSlideTo(@Nullable Banner.BannerItem bannerItem) {
        Nk0.a aVar = (Nk0.a) bannerItem;
        this.f70631p = aVar.f17260d;
        HashMap<String, d.b> map = com.bilibili.ogv.infra.legacy.exposure.d.f67889a;
        String str = this.f70622f;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        View view = this.f70626k;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banner");
            view2 = null;
        }
        com.bilibili.ogv.infra.legacy.exposure.d.f(str2, view2, this.f70632q, this, this.f70631p);
        F0((C5488t) aVar.f17259c);
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    @Nullable
    public final Video.PlayableParams t0() {
        C5488t c5488t;
        CommonCard commonCard;
        String str;
        Result<? extends File> result;
        File file;
        OGVPlayableParams oGVPlayableParams = new OGVPlayableParams();
        C5490v c5490v = ((Ek0.A) this.f70625j.f27377b).f4266B;
        if (c5490v == null || (c5488t = c5490v.f70772f) == null || (commonCard = c5488t.f70757r) == null || (str = commonCard.f69711I0) == null) {
            return null;
        }
        FrameLayout frameLayout = this.f70626k;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banner");
            frameLayout2 = null;
        }
        frameLayout2.getContext().getApplicationContext();
        com.bilibili.ogv.infra.tempfile.e eVar = com.bilibili.ogv.infra.tempfile.a.f67935a;
        eVar.getClass();
        e.a aVar = eVar.f67945d.get("DownloadingTempFileFactory-".concat(str));
        if (aVar == null || (result = aVar.f67947b) == null) {
            file = null;
        } else {
            Object obj = result.unbox-impl();
            Object obj2 = obj;
            if (Result.isFailure-impl(obj)) {
                obj2 = null;
            }
            file = (File) obj2;
        }
        if (file == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url", Uri.fromFile(file).toString());
        oGVPlayableParams.setFlashJsonStr(jsonObject.toString());
        oGVPlayableParams.setReportEnabled(false);
        return oGVPlayableParams;
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final boolean ve(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
        boolean z6 = true;
        if (reporterCheckerType == IExposureReporter.ReporterCheckerType.DefaultChecker) {
            CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70633r, i7);
            z6 = (commonCard == null || commonCard.f69736V) ? false : true;
        }
        return z6;
    }

    @Override // com.bilibili.ogv.operation.inlineplayer2.a
    @NotNull
    public final ViewGroup w0() {
        CardView cardView = this.f70628m;
        CardView cardView2 = cardView;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerVideoContainer");
            cardView2 = null;
        }
        return cardView2;
    }
}
