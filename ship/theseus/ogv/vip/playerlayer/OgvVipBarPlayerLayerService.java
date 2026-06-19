package com.bilibili.ship.theseus.ogv.vip.playerlayer;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.GradientColorVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService.class */
@StabilityInferred(parameters = 0)
public final class OgvVipBarPlayerLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f94845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f94846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f94847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IActivityStateService f94848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f94849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.promptbar.c f94850g;

    @NotNull
    public final h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f94851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f94852j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/playerlayer/OgvVipBarPlayerLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<?>, ExtraInfo, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvVipBarPlayerLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = ogvVipBarPlayerLayerService;
        }

        public final Object invoke(FlowCollector<?> flowCollector, ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = extraInfo;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public OgvVipBarPlayerLayerService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Flow<Configuration> flow, @NotNull IRenderContainerService iRenderContainerService, @NotNull IActivityStateService iActivityStateService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull h hVar) {
        this.f94844a = coroutineScope;
        this.f94845b = context;
        this.f94846c = flow;
        this.f94847d = iRenderContainerService;
        this.f94848e = iActivityStateService;
        this.f94849f = pageReportService;
        this.f94850g = cVar;
        this.h = hVar;
        this.f94851i = Uj0.c.b(70, context);
        this.f94852j = Uj0.c.b(64, context);
        FlowKt.launchIn(FlowKt.transformLatest(FlowKt.debounce(episodeExtraInfoRepository.f99566b, 10L), new AnonymousClass1(this, null)), coroutineScope);
    }

    public static final void a(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, final e eVar, float f7) {
        ReportVo reportVoL;
        ogvVipBarPlayerLayerService.getClass();
        if (eVar.f94868e == 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(280L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(eVar) { // from class: com.bilibili.ship.theseus.ogv.vip.playerlayer.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f94857a;

                {
                    this.f94857a = eVar;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e eVar2 = this.f94857a;
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (fFloatValue == eVar2.f94868e) {
                        return;
                    }
                    eVar2.f94868e = fFloatValue;
                    eVar2.notifyPropertyChanged(516);
                }
            });
            valueAnimatorOfFloat.start();
        }
        ogvVipBarPlayerLayerService.d(eVar, 0.28f, f7);
        PlayerToastVo playerToastVo = eVar.f94865b;
        TextVo textVo = playerToastVo.f102390b;
        if (textVo == null || (reportVoL = textVo.l()) == null) {
            return;
        }
        TextVo textVo2 = playerToastVo.f102390b;
        ogvVipBarPlayerLayerService.f(reportVoL, "0", (textVo2 != null ? textVo2.e() : null) != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService r5, com.bilibili.ship.theseus.ogv.vip.playerlayer.e r6, float r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService.b(com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService, com.bilibili.ship.theseus.ogv.vip.playerlayer.e, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean c(OgvVipBarPlayerLayerService ogvVipBarPlayerLayerService, Configuration configuration) {
        ogvVipBarPlayerLayerService.getClass();
        return configuration.orientation == 2;
    }

    public final void d(e eVar, float f7, float f8) {
        Integer numB;
        GradientColorVo gradientColorVoF;
        Integer numB2;
        Integer numB3;
        float fCoerceAtMost = RangesKt.coerceAtMost(f7, 0.16f) / 0.16f;
        if (fCoerceAtMost != eVar.f94869f) {
            eVar.f94869f = fCoerceAtMost;
            eVar.notifyPropertyChanged(102);
        }
        float fCoerceAtMost2 = ((RangesKt.coerceAtMost(f7, 0.24f) / 0.24f) * 0.060000002f) + 0.94f;
        if (fCoerceAtMost2 != eVar.h) {
            eVar.h = fCoerceAtMost2;
            eVar.notifyPropertyChanged(53);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        float fCoerceAtMost3 = RangesKt.coerceAtMost(f7, 0.24f) / 0.24f;
        PromptBarVo promptBarVo = eVar.f94864a;
        GradientColorVo gradientColorVoB = promptBarVo.b();
        int iIntValue = (gradientColorVoB == null || (numB3 = gradientColorVoB.b()) == null) ? 0 : numB3.intValue();
        PlayerToastVo playerToastVo = eVar.f94865b;
        TextVo textVo = playerToastVo.f102390b;
        int iIntValue2 = (textVo == null || (gradientColorVoF = textVo.f()) == null || (numB2 = gradientColorVoF.b()) == null) ? 0 : numB2.intValue();
        GradientColorVo gradientColorVoB2 = promptBarVo.b();
        int iIntValue3 = (gradientColorVoB2 == null || (numB = gradientColorVoB2.b()) == null) ? 0 : numB.intValue();
        TextVo textVo2 = playerToastVo.f102390b;
        int iIntValue4 = 0;
        if (textVo2 != null) {
            GradientColorVo gradientColorVoF2 = textVo2.f();
            iIntValue4 = 0;
            if (gradientColorVoF2 != null) {
                Integer numB4 = gradientColorVoF2.b();
                iIntValue4 = 0;
                if (numB4 != null) {
                    iIntValue4 = numB4.intValue();
                }
            }
        }
        gradientDrawable.setColors(new int[]{((Integer) new ArgbEvaluator().evaluate(fCoerceAtMost3, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2))).intValue(), ((Integer) new ArgbEvaluator().evaluate(fCoerceAtMost3, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4))).intValue()});
        gradientDrawable.setCornerRadius(Uj0.c.a(((RangesKt.coerceAtMost(f7, 0.24f) / 0.24f) * 16) + 6, this.f94845b));
        if (!Intrinsics.areEqual(gradientDrawable, eVar.f94870g)) {
            eVar.f94870g = gradientDrawable;
            eVar.notifyPropertyChanged(58);
        }
        int iRoundToInt = MathKt.roundToInt(f8 - ((RangesKt.coerceAtMost(f7, 0.24f) / 0.24f) * (f8 - Uj0.c.b(116, this.f94845b))));
        if (iRoundToInt != eVar.f94871i) {
            eVar.f94871i = iRoundToInt;
            eVar.notifyPropertyChanged(65);
        }
        int iRoundToInt2 = MathKt.roundToInt(this.f94852j - ((RangesKt.coerceAtMost(f7, 0.24f) / 0.24f) * (r0 - Uj0.c.b(44, this.f94845b))));
        if (iRoundToInt2 != eVar.f94872j) {
            eVar.f94872j = iRoundToInt2;
            eVar.notifyPropertyChanged(59);
        }
        float f9 = 1;
        float fCoerceAtMost4 = f9 - (RangesKt.coerceAtMost(f7, 0.12f) / 0.12f);
        if (fCoerceAtMost4 != eVar.f94873k) {
            eVar.f94873k = fCoerceAtMost4;
            eVar.notifyPropertyChanged(292);
        }
        float fCoerceAtMost5 = (RangesKt.coerceAtMost(f7, 0.28f) / 0.28f) * this.f94851i;
        if (fCoerceAtMost5 != eVar.f94874l) {
            eVar.f94874l = fCoerceAtMost5;
            eVar.notifyPropertyChanged(298);
        }
        float fCoerceAtMost6 = f9 - (RangesKt.coerceAtMost(f7, 0.16f) / 0.16f);
        if (fCoerceAtMost6 == eVar.f94875m) {
            return;
        }
        eVar.f94875m = fCoerceAtMost6;
        eVar.notifyPropertyChanged(114);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(final com.bilibili.ship.theseus.ogv.vip.playerlayer.e r8, final float r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.playerlayer.OgvVipBarPlayerLayerService.e(com.bilibili.ship.theseus.ogv.vip.playerlayer.e, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void f(ReportVo reportVo, String str, boolean z6) {
        String str2 = (String) i.a(reportVo.d());
        if (str2 != null) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.putAll(reportVo.c());
            mapCreateMapBuilder.put("button_position", str);
            mapCreateMapBuilder.put("has_corner_tips", z6 ? "1" : "0");
            Unit unit = Unit.INSTANCE;
            PageReportService.i(this.f94849f, str2, MapsKt.build(mapCreateMapBuilder), 4);
        }
    }
}
