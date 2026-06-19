package com.bilibili.ship.theseus.united.page.restrictionlayer;

import WI0.Y0;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.BackgroundVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.story.IStoryInvokerForAdCart;
import com.bilibili.story.StoryCartBean;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/G.class */
@StabilityInferred(parameters = 0)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f102532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f102533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f102534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Activity f102535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f102536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f102537g;

    @NotNull
    public final BackActionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f102538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Fr0.j f102539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f102540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f102541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.report.d f102542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f102543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f102544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C8043a f102545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f102546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C6384i f102547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lifecycle f102548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f102549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f102550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f102551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f102553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f102554y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/G$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f102555a;

        static {
            int[] iArr = new int[RestrictionLayerVo.Style.values().length];
            try {
                iArr[RestrictionLayerVo.Style.SIMPLE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[RestrictionLayerVo.Style.HORIZONTAL_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[RestrictionLayerVo.Style.VERTICAL_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[RestrictionLayerVo.Style.CHARGING_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[RestrictionLayerVo.Style.CHARGING_TEXT_WITH_NEXT_PLAYABLE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[RestrictionLayerVo.Style.UNIVERSAL_INTERCEPT.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[RestrictionLayerVo.Style.MSG_ATTACH_QR_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            f102555a = iArr;
        }
    }

    @Inject
    public G(@NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PageReportService pageReportService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull Activity activity, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull BackActionRepository backActionRepository, @NotNull InterfaceC6388m interfaceC6388m, @NotNull Fr0.j jVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull ToolbarRepository toolbarRepository, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar2, @NotNull C6384i c6384i, @NotNull Lifecycle lifecycle, @NotNull ChargeRepository chargeRepository, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull BiliAccountInfo biliAccountInfo, @NotNull PageAdRepository pageAdRepository) {
        this.f102531a = cVar;
        this.f102532b = pageReportService;
        this.f102533c = theseusFloatLayerService;
        this.f102534d = theseusCastScreenRepository;
        this.f102535e = activity;
        this.f102536f = context;
        this.f102537g = aVar;
        this.h = backActionRepository;
        this.f102538i = interfaceC6388m;
        this.f102539j = jVar;
        this.f102540k = gVar;
        this.f102541l = pageNestedScrollFusionRepository;
        this.f102542m = dVar;
        this.f102543n = hVar;
        this.f102544o = toolbarRepository;
        this.f102545p = c8043a;
        this.f102546q = dVar2;
        this.f102547r = c6384i;
        this.f102548s = lifecycle;
        this.f102549t = chargeRepository;
        this.f102550u = iPlayerCoreService;
        this.f102551v = theseusPageUIStyleRepository;
        this.f102552w = aVar2;
        this.f102553x = biliAccountInfo;
        this.f102554y = pageAdRepository;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.bilibili.ship.theseus.united.page.restrictionlayer.K] */
    public static Object c(G g7, final RestrictionLayerVo restrictionLayerVo, boolean z6, boolean z7, String str, boolean z8, Flow flow, SuspendLambda suspendLambda, int i7) {
        RestrictionLayerVo.Style styleH;
        Object objCoroutineScope;
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        if ((i7 & 8) != 0) {
            str = null;
        }
        if ((i7 & 16) != 0) {
            z8 = false;
        }
        Flow flowFlowOf = (i7 & 32) != 0 ? FlowKt.flowOf(Boolean.FALSE) : flow;
        g7.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final M m7 = new M(NotchCompat.hasDisplayCutout(g7.f102535e.getWindow()), StatusBarCompat.getStatusBarHeight(g7.f102536f), g7.f102532b);
        Y0 y02 = new Y0(1, g7, restrictionLayerVo);
        final boolean z9 = z8;
        Function1 function1 = new Function1(restrictionLayerVo, m7, z9, objectRef) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RestrictionLayerVo f102527a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final M f102528b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f102529c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.ObjectRef f102530d;

            {
                this.f102527a = restrictionLayerVo;
                this.f102528b = m7;
                this.f102529c = z9;
                this.f102530d = objectRef;
            }

            public final Object invoke(Object obj) {
                CoroutineScope coroutineScope;
                s sVar = (s) obj;
                s deliveryOperationAction = sVar;
                if (sVar instanceof DeliveryOperationAction) {
                    DeliveryOperationAction deliveryOperationAction2 = (DeliveryOperationAction) sVar;
                    deliveryOperationAction = new DeliveryOperationAction(this.f102527a.e(), deliveryOperationAction2.f102522b, deliveryOperationAction2.f102523c);
                }
                if ((deliveryOperationAction instanceof C6379d) || (deliveryOperationAction instanceof PlayNextOperationAction)) {
                    this.f102528b.m();
                }
                if (this.f102529c && (coroutineScope = (CoroutineScope) this.f102530d.element) != null) {
                    CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
                }
                return deliveryOperationAction;
            }
        };
        C6384i c6384i = g7.f102547r;
        C6384i c6384i2 = new C6384i(c6384i.f102744a, c6384i.f102745b, c6384i.f102746c, y02, function1);
        String strA = str;
        if (restrictionLayerVo.h() != RestrictionLayerVo.Style.CHARGING_TEXT) {
            if (restrictionLayerVo.h() == RestrictionLayerVo.Style.CHARGING_TEXT_WITH_NEXT_PLAYABLE) {
                strA = str;
            } else {
                BackgroundVo backgroundVoB = restrictionLayerVo.b();
                strA = backgroundVoB != null ? backgroundVoB.a() : null;
            }
        }
        if (!Intrinsics.areEqual(strA, m7.f102586n)) {
            m7.f102586n = strA;
            m7.notifyPropertyChanged(41);
        }
        Context context = g7.f102536f;
        C6386k c6386k = new C6386k(c6384i2);
        final com.bilibili.lib.projection.internal.widget.j jVar = new com.bilibili.lib.projection.internal.widget.j(1, g7, m7);
        TextVo textVo = m7.h;
        TextVo textVo2 = restrictionLayerVo.f102669c;
        if (!Intrinsics.areEqual(textVo2, textVo)) {
            m7.h = textVo2;
            m7.notifyPropertyChanged(658);
        }
        TextVo textVoI = restrictionLayerVo.i();
        if (!Intrinsics.areEqual(textVoI, m7.f102581i)) {
            m7.f102581i = textVoI;
            m7.notifyPropertyChanged(623);
        }
        ImageVo imageVo = restrictionLayerVo.f102671e;
        String str2 = imageVo != null ? imageVo.f102563a : null;
        if (!Intrinsics.areEqual(str2, m7.f102582j)) {
            m7.f102582j = str2;
            m7.notifyPropertyChanged(288);
        }
        m7.f102592t.setValue(Boolean.valueOf(restrictionLayerVo.d()));
        BackgroundVo backgroundVoB2 = restrictionLayerVo.b();
        ua0.c cVar = (backgroundVoB2 != null ? backgroundVoB2.f102506b : null) == BackgroundVo.BackgroundEffect.Blur ? new ua0.c(2, 22, (BitmapTransformation) null) : null;
        if (!Intrinsics.areEqual(cVar, m7.f102577d)) {
            m7.f102577d = cVar;
            m7.notifyPropertyChanged(66);
        }
        BackgroundVo backgroundVoB3 = restrictionLayerVo.b();
        boolean z10 = (backgroundVoB3 != null ? backgroundVoB3.f102506b : null) == BackgroundVo.BackgroundEffect.Translucent;
        if (z10 != m7.f102578e) {
            m7.f102578e = z10;
            m7.notifyPropertyChanged(39);
        }
        RestrictionLayerVo.BottomDisplayVo bottomDisplayVo = (RestrictionLayerVo.BottomDisplayVo) CollectionsKt.getOrNull(restrictionLayerVo.c(), 0);
        if (!Intrinsics.areEqual(bottomDisplayVo, m7.f102587o)) {
            m7.f102587o = bottomDisplayVo;
            m7.notifyPropertyChanged(69);
        }
        RestrictionLayerVo.BottomDisplayVo bottomDisplayVo2 = (RestrictionLayerVo.BottomDisplayVo) CollectionsKt.getOrNull(restrictionLayerVo.c(), 1);
        if (!Intrinsics.areEqual(bottomDisplayVo2, m7.f102588p)) {
            m7.f102588p = bottomDisplayVo2;
            m7.notifyPropertyChanged(70);
        }
        RestrictionLayerVo.BottomDisplayVo bottomDisplayVo3 = (RestrictionLayerVo.BottomDisplayVo) CollectionsKt.getOrNull(restrictionLayerVo.c(), 2);
        if (!Intrinsics.areEqual(bottomDisplayVo3, m7.f102589q)) {
            m7.f102589q = bottomDisplayVo3;
            m7.notifyPropertyChanged(71);
        }
        RestrictionLayerVo.BottomDisplayVo bottomDisplayVo4 = (RestrictionLayerVo.BottomDisplayVo) CollectionsKt.getOrNull(restrictionLayerVo.c(), 3);
        if (!Intrinsics.areEqual(bottomDisplayVo4, m7.f102590r)) {
            m7.f102590r = bottomDisplayVo4;
            m7.notifyPropertyChanged(72);
        }
        int iA = m7.f102574a ? ((int) Uj0.c.a(15, context)) + m7.f102575b : (int) Uj0.c.a(15, context);
        if (iA != m7.f102585m) {
            m7.f102585m = iA;
            m7.notifyPropertyChanged(364);
        }
        RestrictionLayerVo.Extra extraF = restrictionLayerVo.f();
        boolean z11 = false;
        if (extraF != null) {
            ChargingExtVo chargingExtVo = extraF.f102685c;
            z11 = false;
            if (chargingExtVo != null) {
                z11 = false;
                if (chargingExtVo.f102514a) {
                    z11 = true;
                }
            }
        }
        m7.f102593u = z11;
        List<TextVo> listTake = CollectionsKt.take(restrictionLayerVo.f102672f, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (final TextVo textVo3 : listTake) {
            C6385j c6385j = new C6385j(c6386k, textVo3);
            TextVo textVoE = textVo3.e();
            final int i8 = 0;
            arrayList.add(new C6378c(c6385j, textVoE != null ? new C6385j(c6386k, textVoE) : null, new Function0(i8, jVar, textVo3) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f102567a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f102568b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f102569c;

                {
                    this.f102567a = i8;
                    this.f102568b = jVar;
                    this.f102569c = textVo3;
                }

                public final Object invoke() {
                    switch (this.f102567a) {
                        case 0:
                            ((com.bilibili.lib.projection.internal.widget.j) this.f102568b).invoke((TextVo) this.f102569c);
                            break;
                        case 1:
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            StoryCartBean storyCartBean = (StoryCartBean) this.f102568b;
                            linkedHashMap.put(GameCardButton.extraAvid, storyCartBean.getAid());
                            linkedHashMap.put("spmid", "main.ugc-video-detail-vertical.0.0");
                            linkedHashMap.put("from_spmid", ((IStoryInvokerForAdCart) this.f102569c).getFromSpmid());
                            linkedHashMap.put("track_id", storyCartBean.getTrackId());
                            linkedHashMap.put("goto", storyCartBean.getCardGoto());
                            linkedHashMap.put("flow_type", "natural");
                            Neurons.reportExposure$default(false, "mall.story.story-cart.0.show", linkedHashMap, (List) null, 8, (Object) null);
                            break;
                        default:
                            ((Function1) this.f102568b).invoke(new tv.danmaku.bili.hottopic.api.f((Tc1.y) this.f102569c, false));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        m7.f102591s.setValue(arrayList);
        m7.f102594v = restrictionLayerVo.f102679n;
        m7.f102595w = restrictionLayerVo.f102680o;
        ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new com.bilibili.biligame.ui.strategy.v(1, g7, restrictionLayerVo));
        if (!Intrinsics.areEqual(exposureEntry, m7.f102579f)) {
            m7.f102579f = exposureEntry;
            m7.notifyPropertyChanged(203);
        }
        if (z6 != m7.f102583k) {
            m7.f102583k = z6;
            m7.notifyPropertyChanged(319);
        }
        if (z7 != m7.f102584l) {
            m7.f102584l = z7;
            m7.notifyPropertyChanged(320);
        }
        if (g7.f102534d.c() || (styleH = restrictionLayerVo.h()) == null) {
            objCoroutineScope = Unit.INSTANCE;
        } else {
            objCoroutineScope = CoroutineScopeKt.coroutineScope(new RestrictionLayerService$showRestrictionLayer$3(objectRef, g7, m7, restrictionLayerVo, c6384i2, flowFlowOf, styleH, null), suspendLambda);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
        }
        return objCoroutineScope;
    }

    public final String a() {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f102531a;
        c.a aVarH = cVar.h();
        return !Intrinsics.areEqual(cVar.f(), Boolean.TRUE) ? !aVarH.f102988b ? "1" : "2" : !aVarH.f102988b ? "3" : "4";
    }

    public final void b(RestrictionLayerVo restrictionLayerVo) {
        ReportVo reportVo = restrictionLayerVo.f102673g;
        if (reportVo != null && reportVo.d().length() > 0) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            ReportVo reportVo2 = restrictionLayerVo.f102673g;
            mapCreateMapBuilder.putAll(reportVo2.c());
            Fr0.j jVar = this.f102539j;
            mapCreateMapBuilder.put("audio", jVar.m(2) || jVar.m(1) ? "2" : "1");
            mapCreateMapBuilder.put("view_type", this.f102543n.f91107a.k() == PlayerAvailability.FORBIDDEN ? "2" : "1");
            C8043a c8043a = this.f102545p;
            mapCreateMapBuilder.put("track_id", c8043a.a().f123882d);
            mapCreateMapBuilder.put("up_mid", String.valueOf(this.f102546q.f()));
            mapCreateMapBuilder.put(GameCardButton.extraAvid, this.f102537g.b());
            mapCreateMapBuilder.put("from_spmid", c8043a.a().f123881c);
            mapCreateMapBuilder.put("state", a());
            String str = this.f102554y.f98946j;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            mapCreateMapBuilder.put("ad_track_id", str2);
            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
            PageReportService.i(this.f102532b, reportVo2.d(), mapBuild, 4);
            this.f102542m.a(reportVo2.d(), null, mapBuild);
        }
        String str3 = (String) com.bilibili.ogv.infra.util.i.a(restrictionLayerVo.e());
        if (str3 != null) {
            this.f102538i.a(new DeliveryOperationAction(str3, null, true));
        }
    }
}
