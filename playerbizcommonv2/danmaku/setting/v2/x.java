package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import WI0.C3023y;
import android.content.Context;
import androidx.compose.foundation.text.J1;
import androidx.compose.foundation.text.K1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.window.core.layout.WindowSizeClass;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bapis.bilibili.community.service.dm.v1.Command;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5784d;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.D;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDensity;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDomain;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMSpeedLevel;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.H;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.I;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.L;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.N;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.q;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kntr.app.ad.biz.videodetail.pausedpage.ui.AdPausedPageScreenKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nr0.C8132a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/x.class */
@StabilityInferred(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81477A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81478B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f81479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IReporterService f81480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f81481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f81482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f81483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f81484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Er0.a f81485g;

    @NotNull
    public final LifecycleCoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f81486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final O f81487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final XR0.b f81488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Function1<WindowSizeClass, Unit> f81489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.utils.B f81490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f81491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final LinearLayoutManager f81492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f81493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f81494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<DMDisplayDomain> f81495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f81497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81499v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81503z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/x$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81504a;

        static {
            int[] iArr = new int[DMBlockType.values().length];
            try {
                iArr[DMBlockType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DMBlockType.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DMBlockType.COLORFUL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DMBlockType.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[DMBlockType.COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f81504a = iArr;
        }
    }

    public x(Context context, IReporterService iReporterService, IControlContainerService iControlContainerService, AbsFunctionWidgetService absFunctionWidgetService, IInteractLayerService iInteractLayerService, IPlayDirector iPlayDirector, Er0.a aVar, LifecycleCoroutineScope lifecycleCoroutineScope, XR0.b bVar, com.bilibili.ad.reward.activity.L l7) {
        O o7 = new O(0);
        this.f81479a = context;
        this.f81480b = iReporterService;
        this.f81481c = iControlContainerService;
        this.f81482d = absFunctionWidgetService;
        this.f81483e = iInteractLayerService;
        this.f81484f = iPlayDirector;
        this.f81485g = aVar;
        this.h = lifecycleCoroutineScope;
        this.f81486i = "PlayerDanmakuSettingsFunctionWidgetV2";
        this.f81487j = o7;
        this.f81488k = bVar;
        this.f81489l = l7;
        this.f81491n = new com.bilibili.app.gemini.ui.f(false);
        this.f81492o = new LinearLayoutManager(context);
        this.f81494q = LazyKt.lazy(new J1(this, 3));
        DMDisplayDomain dMDisplayDomain = DMDisplayDomain.PERCENT_25;
        this.f81495r = StateFlowKt.MutableStateFlow(dMDisplayDomain);
        this.f81496s = StateFlowKt.MutableStateFlow(Float.valueOf(dMDisplayDomain.getPercent()));
        this.f81497t = StateFlowKt.MutableStateFlow(Integer.valueOf(DMDisplayDensity.NORMAL.ordinal()));
        this.f81498u = StateFlowKt.MutableStateFlow(Float.valueOf(80.0f));
        this.f81499v = StateFlowKt.MutableStateFlow(Float.valueOf(100.0f));
        this.f81500w = StateFlowKt.MutableStateFlow(Float.valueOf(DMSpeedLevel.NORMAL.getSpeed()));
        Boolean bool = Boolean.FALSE;
        this.f81501x = StateFlowKt.MutableStateFlow(bool);
        this.f81502y = StateFlowKt.MutableStateFlow(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f81503z = StateFlowKt.MutableStateFlow(bool2);
        this.f81477A = StateFlowKt.MutableStateFlow(bool2);
        this.f81478B = StateFlowKt.MutableStateFlow(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r3 = this;
            r0 = r3
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.f81483e
            tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel r0 = r0.getDanmakuCommandPanel()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L29
            r0 = r4
            java.lang.String r0 = r0.getListTitle()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L29
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            r4 = r0
        L23:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L33
        L29:
            r0 = r3
            android.content.Context r0 = r0.f81479a
            r1 = 2131846699(0x7f11662b, float:1.9326855E38)
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L33:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.setting.v2.x.a():java.lang.String");
    }

    public final void b() {
        AccountInfo accountInfoFromCache;
        Command command;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String string = this.f81479a.getString(2131846815);
        boolean z6 = this.f81493p;
        O o7 = this.f81487j;
        arrayList2.add(new N(new N.a(string, o7.f81382b, o7.f81383c, 28, !z6), new com.bilibili.ad.reward.activity.p(this, 2)));
        DMDisplayDomain.a aVar = DMDisplayDomain.Companion;
        float danmakuDisplayDomain = d().getDanmakuDisplayDomain();
        aVar.getClass();
        DMDisplayDomain dMDisplayDomainB = DMDisplayDomain.a.b(danmakuDisplayDomain);
        MutableStateFlow<DMDisplayDomain> mutableStateFlow = this.f81495r;
        mutableStateFlow.setValue(dMDisplayDomainB);
        float percent = ((DMDisplayDomain) mutableStateFlow.getValue()).getPercent();
        MutableStateFlow<Float> mutableStateFlow2 = this.f81496s;
        mutableStateFlow2.setValue(Float.valueOf(percent));
        final float fDisplayDomainReportValue = d().displayDomainReportValue();
        String string2 = this.f81479a.getString(2131845449);
        float percent2 = DMDisplayDomain.PERCENT_10.getPercent();
        float percent3 = DMDisplayDomain.PERCENT_100.getPercent();
        EnumEntries<DMDisplayDomain> entries = DMDisplayDomain.getEntries();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        for (DMDisplayDomain dMDisplayDomain : entries) {
            arrayList3.add(new H.a.C0530a(dMDisplayDomain.getDescription(), dMDisplayDomain.getPercent()));
        }
        DanmakuSettingsStyle danmakuSettingsStyle = DanmakuSettingsStyle.TOP;
        int i7 = o7.f81385e;
        arrayList2.add(new H(new H.a(string2, percent2, percent3, this.f81496s, arrayList3, danmakuSettingsStyle, o7.f81381a, o7.f81382b, o7.f81384d, 2131104725, o7.h, o7.f81383c, o7.f81386f, i7, i7, 48), new C3023y(this, 1), new Function1(this, fDisplayDomainReportValue) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f81469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f81470b;

            {
                this.f81469a = this;
                this.f81470b = fDisplayDomainReportValue;
            }

            public final Object invoke(Object obj) {
                float fFloatValue = ((Float) obj).floatValue();
                DMDisplayDomain.Companion.getClass();
                DMDisplayDomain dMDisplayDomainA = DMDisplayDomain.a.a(fFloatValue);
                x xVar = this.f81469a;
                DMDisplayDomain dMDisplayDomain2 = (DMDisplayDomain) xVar.f81495r.getValue();
                xVar.f81495r.setValue(dMDisplayDomainA);
                xVar.f81496s.setValue(Float.valueOf(dMDisplayDomainA.getPercent()));
                xVar.f81483e.setDanmakuDisplayDomain(dMDisplayDomainA.getRegion(), true);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                xVar.f81480b.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.visible-area.player", new String[]{"area", String.format("%s,%s", Arrays.copyOf(new Object[]{Float.valueOf(this.f81470b), Float.valueOf(xVar.d().displayDomainReportValue())}, 2))}));
                DMDisplayDomain dMDisplayDomain3 = DMDisplayDomain.PERCENT_100;
                if (dMDisplayDomain2 == dMDisplayDomain3 || dMDisplayDomainA == dMDisplayDomain3) {
                    xVar.b();
                }
                return Unit.INSTANCE;
            }
        }));
        if (((Number) mutableStateFlow2.getValue()).floatValue() == DMDisplayDomain.PERCENT_100.getPercent()) {
            DMDisplayDensity.a aVar2 = DMDisplayDensity.Companion;
            int danmakuDensity = d().getDanmakuDensity();
            aVar2.getClass();
            DMDisplayDensity dMDisplayDensity = DMDisplayDensity.PLENTY;
            if (danmakuDensity != dMDisplayDensity.getValue()) {
                dMDisplayDensity = DMDisplayDensity.STACKING;
                if (danmakuDensity != dMDisplayDensity.getValue()) {
                    dMDisplayDensity = DMDisplayDensity.NORMAL;
                }
            }
            this.f81497t.setValue(Integer.valueOf(dMDisplayDensity.ordinal()));
            String string3 = this.f81479a.getString(2131847041);
            EnumEntries<DMDisplayDensity> entries2 = DMDisplayDensity.getEntries();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
            for (DMDisplayDensity dMDisplayDensity2 : entries2) {
                arrayList4.add(new D.b(this.f81479a.getString(dMDisplayDensity2.getDescription()), dMDisplayDensity2.getValue()));
            }
            int i8 = o7.f81386f;
            int i9 = o7.f81385e;
            final int i10 = 0;
            arrayList2.add(new D(new D.a(this.f81497t, string3, arrayList4, o7.f81381a, o7.f81382b, o7.f81384d, 2131104725, o7.h, o7.f81383c, i8, i9, i9, 24), new Function1(this, i10) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f81471a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f81472b;

                {
                    this.f81471a = i10;
                    this.f81472b = this;
                }

                public final Object invoke(Object obj) {
                    Unit unit;
                    Object obj2 = this.f81472b;
                    switch (this.f81471a) {
                        case 0:
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            x xVar = (x) obj2;
                            xVar.f81497t.setValue(num);
                            if (iIntValue < 0 || iIntValue > CollectionsKt.getLastIndex(DMDisplayDensity.getEntries())) {
                                unit = Unit.INSTANCE;
                            } else {
                                xVar.f81483e.setDanmakuDensity(((DMDisplayDensity) DMDisplayDensity.getEntries().get(iIntValue)).getValue(), true);
                                unit = Unit.INSTANCE;
                            }
                            return unit;
                        default:
                            Set set = (Set) obj2;
                            float f7 = AdPausedPageScreenKt.a;
                            return Boolean.valueOf(set.contains(StringsKt.trim((String) obj).toString().toLowerCase(Locale.ROOT)));
                    }
                }
            }));
        }
        float f7 = 100;
        final float fCoerceAtMost = RangesKt.coerceAtMost(d().getDanmakuAlphaFactor(), 1.0f) * f7;
        this.f81498u.setValue(Float.valueOf(fCoerceAtMost));
        String string4 = this.f81479a.getString(2131846055);
        ClosedFloatingPointRange<Float> closedFloatingPointRange = r.f81462b;
        arrayList2.add(new H(new H.a(string4, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), this.f81498u, null, this.f81493p ? DanmakuSettingsStyle.MIDDLE : DanmakuSettingsStyle.BOTTOM, o7.f81381a, o7.f81382b, o7.f81384d, 2131104725, o7.h, o7.f81383c, o7.f81386f, 0, 0, 98416), new com.bilibili.bililive.room.ui.roomv3.player.s(this, 2), new Function1(this, fCoerceAtMost) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f81473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f81474b;

            {
                this.f81473a = this;
                this.f81474b = fCoerceAtMost;
            }

            public final Object invoke(Object obj) {
                Float f8 = (Float) obj;
                float fFloatValue = f8.floatValue();
                x xVar = this.f81473a;
                xVar.f81498u.setValue(f8);
                xVar.f81483e.setDanmakuOpacity(fFloatValue / 100, true);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                xVar.f81480b.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.alpha.player", new String[]{"alpha", String.format("%s,%s", Arrays.copyOf(new Object[]{Integer.valueOf(MathKt.roundToInt(this.f81474b)), Integer.valueOf(MathKt.roundToInt(fFloatValue))}, 2))}));
                return Unit.INSTANCE;
            }
        }));
        if (this.f81493p) {
            final float fCoerceAtMost2 = RangesKt.coerceAtMost(d().getDanmakuTextSizeScaleFactor(), 2.0f) * f7;
            this.f81499v.setValue(Float.valueOf(fCoerceAtMost2));
            String string5 = this.f81479a.getString(2131845839);
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = r.f81463c;
            arrayList2.add(new H(new H.a(string5, ((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), this.f81499v, null, null, o7.f81381a, o7.f81382b, o7.f81384d, 2131104725, o7.h, o7.f81383c, o7.f81386f, 0, 0, 98544), new com.bilibili.bililive.room.ui.roomv3.player.u(this, 1), new Function1(this, fCoerceAtMost2) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final x f81475a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f81476b;

                {
                    this.f81475a = this;
                    this.f81476b = fCoerceAtMost2;
                }

                public final Object invoke(Object obj) {
                    Float f8 = (Float) obj;
                    float fFloatValue = f8.floatValue();
                    x xVar = this.f81475a;
                    xVar.f81499v.setValue(f8);
                    xVar.f81483e.setScaleFactor(fFloatValue / 100, true);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    xVar.f81480b.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.font-size.player", new String[]{TextSource.CFG_SIZE, String.format("%s,%s", Arrays.copyOf(new Object[]{Integer.valueOf(MathKt.roundToInt(this.f81476b)), Integer.valueOf(MathKt.roundToInt(fFloatValue))}, 2))}));
                    return Unit.INSTANCE;
                }
            }));
            DMSpeedLevel.a aVar3 = DMSpeedLevel.Companion;
            float danmakuDuration = d().getDanmakuDuration();
            aVar3.getClass();
            DMSpeedLevel dMSpeedLevelA = DMSpeedLevel.a.a(danmakuDuration);
            this.f81500w.setValue(Float.valueOf(dMSpeedLevelA.getSpeed()));
            String string6 = this.f81479a.getString(2131845388);
            float speed = DMSpeedLevel.SLOWEST.getSpeed();
            float speed2 = DMSpeedLevel.FASTEST.getSpeed();
            EnumEntries<DMSpeedLevel> entries3 = DMSpeedLevel.getEntries();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries3, 10));
            for (DMSpeedLevel dMSpeedLevel : entries3) {
                arrayList5.add(new H.a.C0530a(this.f81479a.getString(dMSpeedLevel.getLevel()), dMSpeedLevel.getSpeed()));
            }
            DanmakuSettingsStyle danmakuSettingsStyle2 = DanmakuSettingsStyle.BOTTOM;
            int i11 = o7.f81385e;
            arrayList2.add(new H(new H.a(string6, speed, speed2, this.f81500w, arrayList5, danmakuSettingsStyle2, o7.f81381a, o7.f81382b, o7.f81384d, 2131104725, o7.h, o7.f81383c, o7.f81386f, i11, i11, 48), new I.D(this, 1), new Bs.u(3, this, dMSpeedLevelA)));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new com.bilibili.playerbizcommonv2.widget.setting.channel.w(16));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new N(new N.a(this.f81479a.getString(2131847246), o7.f81382b, 0, 94, false)));
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(c());
        String string7 = this.f81479a.getString(2131845574);
        DanmakuSettingsStyle danmakuSettingsStyle3 = DanmakuSettingsStyle.TOP;
        int i12 = o7.f81386f;
        int i13 = o7.f81381a;
        int i14 = o7.f81382b;
        arrayList6.add(new C5784d(new C5784d.a(string7, MutableStateFlow, danmakuSettingsStyle3, i13, i14, o7.f81387g, i14, i12, 516), new s(0, MutableStateFlow, this)));
        this.f81501x.setValue(Boolean.valueOf(d().isDanmakuDuplicateMerging()));
        arrayList6.add(new I(new I.a(this.f81479a.getString(2131847255), this.f81479a.getString(2131846720), this.f81501x, o7.f81382b, o7.f81383c, o7.f81381a, R$color.Wh0_u, R$color.Pi5_u, o7.f81388i, o7.f81386f, null, 1024), new QS0.n(this, 3)));
        this.f81502y.setValue(Boolean.valueOf(d().getDanmakuAvoidScript()));
        arrayList6.add(new I(new I.a(this.f81479a.getString(2131845568), this.f81479a.getString(2131847222), this.f81502y, o7.f81382b, o7.f81383c, o7.f81381a, R$color.Wh0_u, R$color.Pi5_u, o7.f81388i, o7.f81386f, null, 1024), new K1(this, 3)));
        this.f81503z.setValue(Boolean.valueOf(d().getDanmakuAvoidFigure()));
        String string8 = this.f81479a.getString(2131847336);
        String string9 = this.f81479a.getString(2131845544);
        DanmakuSettingsStyle danmakuSettingsStyle4 = DanmakuSettingsStyle.BOTTOM;
        arrayList6.add(new I(new I.a(string8, string9, this.f81503z, o7.f81382b, o7.f81383c, o7.f81381a, R$color.Wh0_u, R$color.Pi5_u, o7.f81388i, o7.f81386f, danmakuSettingsStyle4), new XO.E(this, 2)));
        arrayList.addAll(arrayList6);
        arrayList.add(new com.bilibili.playerbizcommonv2.widget.setting.channel.w(16));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new N(new N.a(this.f81479a.getString(2131846991), o7.f81382b, 0, 94, false)));
        DmViewReply dmViewReply = d().getDmViewReply();
        int commandDmsCount = (dmViewReply == null || (command = dmViewReply.getCommand()) == null) ? 0 : command.getCommandDmsCount();
        boolean z7 = o7.f81393n;
        boolean z8 = commandDmsCount > 0 && z7;
        int danmakuSeniorModeSwitch = this.f81483e.getDanmakuSeniorModeSwitch();
        Context context = this.f81479a;
        Video.PlayableParams currentPlayableParams = this.f81484f.getCurrentPlayableParams();
        Video.DisplayParams displayParams = currentPlayableParams != null ? currentPlayableParams.getDisplayParams() : null;
        boolean z9 = context != null && BiliAccounts.get(context).isLogin() && (accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache()) != null && (displayParams != null ? displayParams.getMid() : 0L) == accountInfoFromCache.getMid();
        boolean z10 = o7.f81392m;
        boolean z11 = o7.f81391l;
        boolean z12 = (z11 || z10 || z7) ? false : true;
        boolean z13 = danmakuSeniorModeSwitch != 0 && ConfigManager.Companion.isHitFF("player.damaku.senior.mode");
        if (z11) {
            boolean zIsDanmakuBlackWordsEnable = d().isDanmakuBlackWordsEnable();
            MutableStateFlow<Boolean> mutableStateFlow3 = this.f81477A;
            mutableStateFlow3.setValue(Boolean.valueOf(zIsDanmakuBlackWordsEnable));
            arrayList7.add(new I(new I.a(this.f81479a.getString(2131854292), this.f81479a.getString(2131854361), mutableStateFlow3, o7.f81382b, o7.f81383c, o7.f81381a, R$color.Wh0_u, R$color.Pi5_u, o7.f81388i, o7.f81386f, ((Boolean) mutableStateFlow3.getValue()).booleanValue() ? DanmakuSettingsStyle.TOP_WITHOUT_DIVIDER : danmakuSettingsStyle3), new M80.v(this, 3)));
            if (((Boolean) mutableStateFlow3.getValue()).booleanValue()) {
                arrayList7.add(new q(new q.a(StateFlowKt.MutableStateFlow(Boolean.TRUE), this.f81479a.getString(2131846696), o7.f81381a, o7.f81387g, o7.f81382b, o7.f81386f), new Bs.w(this, 5)));
            }
        }
        if (z9) {
            String string10 = this.f81479a.getString(2131854355);
            String string11 = this.f81479a.getString(2131854287);
            if (!z12) {
                danmakuSettingsStyle3 = DanmakuSettingsStyle.MIDDLE;
            } else if (!z13) {
                danmakuSettingsStyle3 = DanmakuSettingsStyle.SINGLE;
            }
            arrayList7.add(new L(new L.a(string10, string11, danmakuSettingsStyle3, o7.f81381a, o7.f81382b, o7.f81386f), new Oo.f(this, 4)));
        }
        if (z10) {
            arrayList7.add(new L(new L.a(this.f81479a.getString(2131846668), (z8 || z13) ? DanmakuSettingsStyle.MIDDLE : danmakuSettingsStyle4, o7.f81381a, o7.f81382b, o7.f81386f), new Oo.g(this, 4)));
        }
        if (z8) {
            arrayList7.add(new L(new L.a(a(), z13 ? DanmakuSettingsStyle.MIDDLE : danmakuSettingsStyle4, o7.f81381a, o7.f81382b, o7.f81386f), new Oo.h(this, 4)));
        }
        if (z13) {
            this.f81478B.setValue(Boolean.valueOf(danmakuSeniorModeSwitch == 2));
            String string12 = this.f81479a.getString(2131846841);
            if (z12 && !z9) {
                danmakuSettingsStyle4 = DanmakuSettingsStyle.SINGLE;
            }
            arrayList7.add(new I(new I.a(string12, null, this.f81478B, o7.f81382b, o7.f81383c, o7.f81381a, R$color.Wh0_u, R$color.Pi5_u, o7.f81388i, R$color.Ga9, danmakuSettingsStyle4, 2), new Oo.i(this, 5)));
        }
        arrayList.addAll(arrayList7);
        arrayList.add(new z(new z.a(this.f81479a.getString(2131847217), this.f81479a.getString(2131847217), o7.f81383c, 8), new com.bilibili.ad.reward.activity.l(this, 3)));
        this.f81491n.N(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<C5784d.b> c() throws NoWhenBranchMatchedException {
        EnumEntries<DMBlockType> entries = DMBlockType.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        for (DMBlockType dMBlockType : entries) {
            int enableRes = dMBlockType.getEnableRes();
            int disableRes = dMBlockType.getDisableRes();
            int desc = dMBlockType.getDesc();
            int i7 = a.f81504a[dMBlockType.ordinal()];
            boolean danmakuBlockFixed = true;
            if (i7 == 1) {
                danmakuBlockFixed = d().getDanmakuBlockFixed();
            } else if (i7 == 2) {
                danmakuBlockFixed = d().isDanmakuBlockScroll();
            } else if (i7 == 3) {
                danmakuBlockFixed = d().isDanmakuBlockColorful();
            } else if (i7 == 4) {
                danmakuBlockFixed = d().isDanmakuBlockSpecial();
            } else {
                if (i7 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (d().getEnableDanmakuFold()) {
                    danmakuBlockFixed = false;
                }
            }
            arrayList.add(new C5784d.b(enableRes, disableRes, desc, danmakuBlockFixed));
        }
        return arrayList;
    }

    public final DanmakuParams d() {
        return (DanmakuParams) this.f81494q.getValue();
    }

    public final void e(boolean z6) {
        this.f81480b.report(new NeuronsEvents.NormalEvent(z6 ? "player.danmaku-set.dm-order-list.click.player" : "player.player.danmaku-set.danmaku-list.player", new String[]{Constant.IN_KEY_LOCATION, "1"}));
        ScreenModeType screenModeType = this.f81481c.getScreenModeType();
        if (z6) {
            ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
            IFunctionContainer.LayoutParams layoutParams = screenModeType == screenModeType2 ? new IFunctionContainer.LayoutParams(-1, NewPlayerUtilsKt.toPx(380.0f)) : new IFunctionContainer.LayoutParams(NewPlayerUtilsKt.toPx(280.0f), -1);
            layoutParams.setLayoutType(screenModeType == screenModeType2 ? 8 : 4);
            this.f81482d.showWidget(com.bilibili.playerbizcommonv2.danmaku.command.b.class, layoutParams, new C8132a(false, a()));
            return;
        }
        IRemoteHandler remoteHandler = this.f81483e.getRemoteHandler();
        if (remoteHandler != null) {
            IRemoteHandler.requestRpcDanmakuList$default(remoteHandler, 0, new Js.a(1, this, screenModeType), 1, (Object) null);
        }
    }
}
