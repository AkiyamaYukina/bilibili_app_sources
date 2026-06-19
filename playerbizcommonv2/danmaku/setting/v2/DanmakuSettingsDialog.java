package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.ad.v1.KSourceContentDto;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.compose.widget.S;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.fasthybrid.container.A0;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.theme.R$color;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.C5784d;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.D;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDensity;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMDisplayDomain;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DMSpeedLevel;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.H;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.I;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.N;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.z;
import com.bilibili.playerbizcommonv2.widget.setting.channel.InterfaceC5833b;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kntr.app.ad.biz.videodetail.pausedpage.AdPausedPageData;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.protobuf.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsDialog.class */
@StabilityInferred(parameters = 0)
public final class DanmakuSettingsDialog extends ComponentDialog {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f81288z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f81289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f81290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final IReporterService f81291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC5833b f81292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f81293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f81294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dr0.e f81295g;
    public RecyclerView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f81296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final LinearLayoutManager f81297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f81299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f81300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final DanmakuParams f81301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<DMDisplayDomain> f81302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f81304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f81307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81312y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsDialog$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f81313a;

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
            f81313a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsDialog$b.class */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuSettingsDialog f81314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Window f81315b;

        public b(DanmakuSettingsDialog danmakuSettingsDialog, Window window) {
            this.f81314a = danmakuSettingsDialog;
            this.f81315b = window;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            Window window = this.f81315b;
            if (window != null) {
                window.setDimAmount(f8 * this.f81314a.f81293e);
            }
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f81314a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsDialog$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsDialog$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final DanmakuSettingsDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsDialog$onCreate$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsDialog$onCreate$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final DanmakuSettingsDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, DanmakuSettingsDialog danmakuSettingsDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = danmakuSettingsDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                    this.$windowSize.element = windowSizeClass;
                    DanmakuSettingsDialog danmakuSettingsDialog = this.this$0;
                    int i7 = DanmakuSettingsDialog.f81288z;
                    danmakuSettingsDialog.l(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(DanmakuSettingsDialog danmakuSettingsDialog, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = danmakuSettingsDialog;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f81289a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DanmakuSettingsDialog(ComponentActivity componentActivity, IInteractLayerService iInteractLayerService, IReporterService iReporterService, int i7) {
        this(componentActivity, iInteractLayerService, iReporterService, InterfaceC5833b.C0553b.f83223a, 0.5f, (i7 & 32) != 0);
    }

    public DanmakuSettingsDialog(@NotNull ComponentActivity componentActivity, @NotNull IInteractLayerService iInteractLayerService, @Nullable IReporterService iReporterService, @NotNull InterfaceC5833b interfaceC5833b, @FloatRange(from = 0.0d, to = 1.0d) float f7, boolean z6) {
        super(componentActivity, 2131889095);
        this.f81289a = componentActivity;
        this.f81290b = iInteractLayerService;
        this.f81291c = iReporterService;
        this.f81292d = interfaceC5833b;
        this.f81293e = f7;
        this.f81294f = z6;
        this.f81296i = new com.bilibili.app.gemini.ui.f(false);
        this.f81297j = new LinearLayoutManager(getContext());
        this.f81301n = iInteractLayerService.getDanmakuParams();
        DMDisplayDomain dMDisplayDomain = DMDisplayDomain.PERCENT_25;
        this.f81302o = StateFlowKt.MutableStateFlow(dMDisplayDomain);
        this.f81303p = StateFlowKt.MutableStateFlow(Float.valueOf(dMDisplayDomain.getPercent()));
        this.f81304q = StateFlowKt.MutableStateFlow(Integer.valueOf(DMDisplayDensity.NORMAL.ordinal()));
        this.f81305r = StateFlowKt.MutableStateFlow(Float.valueOf(80.0f));
        this.f81306s = StateFlowKt.MutableStateFlow(Float.valueOf(100.0f));
        this.f81307t = StateFlowKt.MutableStateFlow(Float.valueOf(DMSpeedLevel.NORMAL.getSpeed()));
        Boolean bool = Boolean.FALSE;
        this.f81308u = StateFlowKt.MutableStateFlow(bool);
        this.f81309v = StateFlowKt.MutableStateFlow(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f81310w = StateFlowKt.MutableStateFlow(bool2);
        this.f81311x = StateFlowKt.MutableStateFlow(bool2);
        this.f81312y = StateFlowKt.MutableStateFlow(bool);
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = Cj0.a.a(getContext()) ? R$color.Text_white : R$color.Brand_pink;
        int i8 = Cj0.a.a(getContext()) ? 2131104725 : R$color.Pi3;
        arrayList2.add(new N(new N.a(getContext().getString(2131846815), 0, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, !this.f81298k), new EV.e(this, 7)));
        if (!this.f81294f) {
            MutableStateFlow<DMDisplayDomain> mutableStateFlow = this.f81302o;
            DMDisplayDomain.a aVar = DMDisplayDomain.Companion;
            float danmakuDisplayDomain = this.f81301n.getDanmakuDisplayDomain();
            aVar.getClass();
            mutableStateFlow.setValue(DMDisplayDomain.a.b(danmakuDisplayDomain));
            this.f81303p.setValue(Float.valueOf(((DMDisplayDomain) this.f81302o.getValue()).getPercent()));
            final float fDisplayDomainReportValue = this.f81301n.displayDomainReportValue();
            String string = getContext().getString(2131845449);
            float percent = DMDisplayDomain.PERCENT_10.getPercent();
            float percent2 = DMDisplayDomain.PERCENT_100.getPercent();
            MutableStateFlow<Float> mutableStateFlow2 = this.f81303p;
            EnumEntries<DMDisplayDomain> entries = DMDisplayDomain.getEntries();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            for (DMDisplayDomain dMDisplayDomain : entries) {
                arrayList3.add(new H.a.C0530a(dMDisplayDomain.getDescription(), dMDisplayDomain.getPercent()));
            }
            Object value = this.f81302o.getValue();
            DMDisplayDomain dMDisplayDomain2 = DMDisplayDomain.PERCENT_100;
            arrayList2.add(new H(new H.a(string, percent, percent2, mutableStateFlow2, arrayList3, value == dMDisplayDomain2 ? DanmakuSettingsStyle.TOP_WITHOUT_DIVIDER : DanmakuSettingsStyle.TOP, 0, 0, i7, i8, 0, 0, 0, 0, 0, 127792), new M80.g(this, 1), new Function1(this, fDisplayDomainReportValue) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuSettingsDialog f81444a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f81445b;

                {
                    this.f81444a = this;
                    this.f81445b = fDisplayDomainReportValue;
                }

                public final Object invoke(Object obj) {
                    float fFloatValue = ((Float) obj).floatValue();
                    DMDisplayDomain.Companion.getClass();
                    DMDisplayDomain dMDisplayDomainA = DMDisplayDomain.a.a(fFloatValue);
                    DanmakuSettingsDialog danmakuSettingsDialog = this.f81444a;
                    DMDisplayDomain dMDisplayDomain3 = (DMDisplayDomain) danmakuSettingsDialog.f81302o.getValue();
                    danmakuSettingsDialog.f81302o.setValue(dMDisplayDomainA);
                    danmakuSettingsDialog.f81303p.setValue(Float.valueOf(dMDisplayDomainA.getPercent()));
                    danmakuSettingsDialog.f81290b.setDanmakuDisplayDomain(dMDisplayDomainA.getRegion(), true);
                    IReporterService iReporterService = danmakuSettingsDialog.f81291c;
                    if (iReporterService != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.visible-area.player", new String[]{"area", String.format("%s,%s", Arrays.copyOf(new Object[]{Float.valueOf(this.f81445b), Float.valueOf(danmakuSettingsDialog.f81301n.displayDomainReportValue())}, 2))}));
                    }
                    DMDisplayDomain dMDisplayDomain4 = DMDisplayDomain.PERCENT_100;
                    if (dMDisplayDomain3 == dMDisplayDomain4 || dMDisplayDomainA == dMDisplayDomain4) {
                        danmakuSettingsDialog.j();
                    }
                    return Unit.INSTANCE;
                }
            }));
            if (((Number) this.f81303p.getValue()).floatValue() == dMDisplayDomain2.getPercent()) {
                MutableStateFlow<Integer> mutableStateFlow3 = this.f81304q;
                DMDisplayDensity.a aVar2 = DMDisplayDensity.Companion;
                int danmakuDensity = this.f81301n.getDanmakuDensity();
                aVar2.getClass();
                DMDisplayDensity dMDisplayDensity = DMDisplayDensity.PLENTY;
                if (danmakuDensity != dMDisplayDensity.getValue()) {
                    dMDisplayDensity = DMDisplayDensity.STACKING;
                    if (danmakuDensity != dMDisplayDensity.getValue()) {
                        dMDisplayDensity = DMDisplayDensity.NORMAL;
                    }
                }
                mutableStateFlow3.setValue(Integer.valueOf(dMDisplayDensity.ordinal()));
                MutableStateFlow<Integer> mutableStateFlow4 = this.f81304q;
                String string2 = getContext().getString(2131847041);
                EnumEntries<DMDisplayDensity> entries2 = DMDisplayDensity.getEntries();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
                for (DMDisplayDensity dMDisplayDensity2 : entries2) {
                    arrayList4.add(new D.b(getContext().getString(dMDisplayDensity2.getDescription()), dMDisplayDensity2.getValue()));
                }
                arrayList2.add(new D(new D.a(mutableStateFlow4, string2, arrayList4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16376), new A0(this, 1)));
            }
        }
        float f7 = 100;
        final float fCoerceAtMost = RangesKt.coerceAtMost(this.f81301n.getDanmakuAlphaFactor(), 1.0f) * f7;
        this.f81305r.setValue(Float.valueOf(fCoerceAtMost));
        String string3 = getContext().getString(2131846055);
        ClosedFloatingPointRange<Float> closedFloatingPointRange = r.f81462b;
        float fFloatValue = ((Number) closedFloatingPointRange.getStart()).floatValue();
        float fFloatValue2 = ((Number) closedFloatingPointRange.getEndInclusive()).floatValue();
        MutableStateFlow<Float> mutableStateFlow5 = this.f81305r;
        boolean z6 = this.f81294f;
        arrayList2.add(new H(new H.a(string3, fFloatValue, fFloatValue2, mutableStateFlow5, null, (z6 && this.f81298k) ? DanmakuSettingsStyle.TOP : z6 ? DanmakuSettingsStyle.SINGLE : this.f81298k ? DanmakuSettingsStyle.MIDDLE : DanmakuSettingsStyle.BOTTOM, 0, 0, i7, i8, 0, 0, 0, 0, 0, 127856), new I.r(this, 1), new Function1(this, fCoerceAtMost) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuSettingsDialog f81446a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f81447b;

            {
                this.f81446a = this;
                this.f81447b = fCoerceAtMost;
            }

            public final Object invoke(Object obj) {
                Float f8 = (Float) obj;
                float fFloatValue3 = f8.floatValue();
                DanmakuSettingsDialog danmakuSettingsDialog = this.f81446a;
                danmakuSettingsDialog.f81305r.setValue(f8);
                danmakuSettingsDialog.f81290b.setDanmakuOpacity(fFloatValue3 / 100, true);
                IReporterService iReporterService = danmakuSettingsDialog.f81291c;
                if (iReporterService != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.alpha.player", new String[]{"alpha", String.format("%s,%s", Arrays.copyOf(new Object[]{Integer.valueOf(MathKt.roundToInt(this.f81447b)), Integer.valueOf(MathKt.roundToInt(fFloatValue3))}, 2))}));
                }
                return Unit.INSTANCE;
            }
        }));
        if (this.f81298k) {
            final float fCoerceAtMost2 = RangesKt.coerceAtMost(this.f81301n.getDanmakuTextSizeScaleFactor(), 2.0f) * f7;
            this.f81306s.setValue(Float.valueOf(fCoerceAtMost2));
            String string4 = getContext().getString(2131845839);
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = r.f81463c;
            arrayList2.add(new H(new H.a(string4, ((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), this.f81306s, null, null, 0, 0, i7, i8, 0, 0, 0, 0, 0, 127984), new I.t(this, 4), new Function1(this, fCoerceAtMost2) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuSettingsDialog f81448a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f81449b;

                {
                    this.f81448a = this;
                    this.f81449b = fCoerceAtMost2;
                }

                public final Object invoke(Object obj) {
                    Float f8 = (Float) obj;
                    float fFloatValue3 = f8.floatValue();
                    DanmakuSettingsDialog danmakuSettingsDialog = this.f81448a;
                    danmakuSettingsDialog.f81306s.setValue(f8);
                    danmakuSettingsDialog.f81290b.setScaleFactor(fFloatValue3 / 100, true);
                    IReporterService iReporterService = danmakuSettingsDialog.f81291c;
                    if (iReporterService != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-set.font-size.player", new String[]{TextSource.CFG_SIZE, String.format("%s,%s", Arrays.copyOf(new Object[]{Integer.valueOf(MathKt.roundToInt(this.f81449b)), Integer.valueOf(MathKt.roundToInt(fFloatValue3))}, 2))}));
                    }
                    return Unit.INSTANCE;
                }
            }));
            DMSpeedLevel.a aVar3 = DMSpeedLevel.Companion;
            float danmakuDuration = this.f81301n.getDanmakuDuration();
            aVar3.getClass();
            DMSpeedLevel dMSpeedLevelA = DMSpeedLevel.a.a(danmakuDuration);
            this.f81307t.setValue(Float.valueOf(dMSpeedLevelA.getSpeed()));
            String string5 = getContext().getString(2131845388);
            float speed = DMSpeedLevel.SLOWEST.getSpeed();
            float speed2 = DMSpeedLevel.FASTEST.getSpeed();
            MutableStateFlow<Float> mutableStateFlow6 = this.f81307t;
            EnumEntries<DMSpeedLevel> entries3 = DMSpeedLevel.getEntries();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries3, 10));
            for (DMSpeedLevel dMSpeedLevel : entries3) {
                arrayList5.add(new H.a.C0530a(getContext().getString(dMSpeedLevel.getLevel()), dMSpeedLevel.getSpeed()));
            }
            arrayList2.add(new H(new H.a(string5, speed, speed2, mutableStateFlow6, arrayList5, DanmakuSettingsStyle.BOTTOM, 0, 0, i7, i8, 0, 0, 0, 0, 0, 127792), new C5788h(this, 0), new C5789i(0, this, dMSpeedLevelA)));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new com.bilibili.playerbizcommonv2.widget.setting.channel.w(16));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new N(new N.a(getContext().getString(2131847246), 0, 0, SearchBangumiItem.TYPE_FULLNET_MOVIE, false)));
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(k());
        String string6 = getContext().getString(2131845574);
        DanmakuSettingsStyle danmakuSettingsStyle = DanmakuSettingsStyle.TOP;
        arrayList6.add(new C5784d(new C5784d.a(string6, MutableStateFlow, danmakuSettingsStyle, 0, 0, 0, 0, 0, 2020), new Yt0.I(1, MutableStateFlow, this)));
        this.f81308u.setValue(Boolean.valueOf(this.f81301n.isDanmakuDuplicateMerging()));
        arrayList6.add(new I(new I.a(getContext().getString(2131847255), getContext().getString(2131846720), this.f81308u, 0, 0, 0, 0, 0, 0, 0, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE), new com.bilibili.bililive.room.ui.roomv3.player.h(this, 1)));
        if (!this.f81294f) {
            this.f81309v.setValue(Boolean.valueOf(this.f81301n.getDanmakuAvoidScript()));
            arrayList6.add(new I(new I.a(getContext().getString(2131845568), getContext().getString(2131847222), this.f81309v, 0, 0, 0, 0, 0, 0, 0, null, TfCode.UNICOM_CDN_RTMP_URL_EMPTY_VALUE), new On.g(this, 5)));
        }
        this.f81310w.setValue(Boolean.valueOf(this.f81301n.getDanmakuAvoidFigure()));
        String string7 = getContext().getString(2131847336);
        String string8 = getContext().getString(2131845544);
        MutableStateFlow<Boolean> mutableStateFlow7 = this.f81310w;
        DanmakuSettingsStyle danmakuSettingsStyle2 = DanmakuSettingsStyle.BOTTOM;
        arrayList6.add(new I(new I.a(string7, string8, mutableStateFlow7, 0, 0, 0, 0, 0, 0, 0, danmakuSettingsStyle2, 1016), new XO.l(this, 3)));
        arrayList.addAll(arrayList6);
        arrayList.add(new com.bilibili.playerbizcommonv2.widget.setting.channel.w(16));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new N(new N.a(getContext().getString(2131846991), 0, 0, SearchBangumiItem.TYPE_FULLNET_MOVIE, false)));
        int danmakuSeniorModeSwitch = this.f81290b.getDanmakuSeniorModeSwitch();
        boolean z7 = danmakuSeniorModeSwitch != 0 && ConfigManager.Companion.isHitFF("player.damaku.senior.mode");
        this.f81311x.setValue(Boolean.valueOf(this.f81301n.isDanmakuBlackWordsEnable()));
        String string9 = getContext().getString(2131854292);
        String string10 = getContext().getString(2131854361);
        MutableStateFlow<Boolean> mutableStateFlow8 = this.f81311x;
        if (!z7) {
            danmakuSettingsStyle = DanmakuSettingsStyle.SINGLE;
        }
        arrayList7.add(new I(new I.a(string9, string10, mutableStateFlow8, 0, 0, 0, 0, 0, 0, 0, danmakuSettingsStyle, 1016), new On.c(this, 4)));
        if (z7) {
            this.f81312y.setValue(Boolean.valueOf(danmakuSeniorModeSwitch == 2));
            final int i9 = 0;
            arrayList7.add(new I(new I.a(getContext().getString(2131846841), null, this.f81312y, 0, 0, 0, 0, 0, 0, 0, danmakuSettingsStyle2, 1018), new Function0(this, i9) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f81439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f81440b;

                {
                    this.f81439a = i9;
                    this.f81440b = this;
                }

                public final Object invoke() {
                    Object obj;
                    Object obj2 = this.f81440b;
                    switch (this.f81439a) {
                        case 0:
                            DanmakuSettingsDialog danmakuSettingsDialog = (DanmakuSettingsDialog) obj2;
                            boolean zBooleanValue = ((Boolean) danmakuSettingsDialog.f81312y.getValue()).booleanValue();
                            danmakuSettingsDialog.f81312y.setValue(Boolean.valueOf(!zBooleanValue));
                            IInteractLayerService.changeDanmakuSeniorModeSwitch$default(danmakuSettingsDialog.f81290b, !zBooleanValue ? 2 : 3, false, 2, (Object) null);
                            return Unit.INSTANCE;
                        case 1:
                            ((com.mall.ui.page.create3.module.o) obj2).f.l.setValue(Boolean.FALSE);
                            return Unit.INSTANCE;
                        default:
                            AdPausedPageData adPausedPageData = (AdPausedPageData) obj2;
                            try {
                                Result.Companion companion = Result.Companion;
                                ProtoBuf.Default r02 = ProtoBuf.Default;
                                KSourceContentDto data = adPausedPageData.getAd().getData();
                                r02.getSerializersModule();
                                obj = Result.constructor-impl(r02.encodeToByteArray(KSourceContentDto.Companion.serializer(), data));
                                break;
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                            }
                            if (Result.isFailure-impl(obj)) {
                                obj = null;
                            }
                            return (byte[]) obj;
                    }
                }
            }));
        }
        arrayList.addAll(arrayList7);
        arrayList.add(new z(new z.a(getContext().getString(2131847217), getContext().getString(2131847217), 0, 24), new S(this, 1)));
        this.f81296i.N(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final List<C5784d.b> k() throws NoWhenBranchMatchedException {
        EnumEntries<DMBlockType> entries = DMBlockType.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        for (DMBlockType dMBlockType : entries) {
            int enableRes = dMBlockType.getEnableRes();
            int disableRes = dMBlockType.getDisableRes();
            int desc = dMBlockType.getDesc();
            int i7 = a.f81313a[dMBlockType.ordinal()];
            boolean danmakuBlockFixed = true;
            if (i7 == 1) {
                danmakuBlockFixed = this.f81301n.getDanmakuBlockFixed();
            } else if (i7 == 2) {
                danmakuBlockFixed = this.f81301n.isDanmakuBlockScroll();
            } else if (i7 == 3) {
                danmakuBlockFixed = this.f81301n.isDanmakuBlockColorful();
            } else if (i7 == 4) {
                danmakuBlockFixed = this.f81301n.isDanmakuBlockSpecial();
            } else {
                if (i7 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f81301n.getEnableDanmakuFold()) {
                    danmakuBlockFixed = false;
                }
            }
            arrayList.add(new C5784d.b(enableRes, disableRes, desc, danmakuBlockFixed));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void l(WindowSizeClass windowSizeClass) throws NoWhenBranchMatchedException {
        this.f81299l = windowSizeClass;
        InterfaceC5833b aVar = this.f81292d;
        int iDpToPx = 0;
        if (!KScreenAdjustUtilsKt.isNormal(windowSizeClass)) {
            int minHeightDp = windowSizeClass.getMinHeightDp();
            aVar = new InterfaceC5833b.a(RangesKt.coerceIn(RangesKt.coerceAtMost(MathKt.roundToInt(minHeightDp * 0.6f), 580) / RangesKt.coerceAtLeast(minHeightDp - DimenUtilsKt.pxToDp(this.f81300m), 1), 0.0f, 1.0f));
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        }
        Dr0.e eVar = this.f81295g;
        Dr0.e eVar2 = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar2 = null;
        }
        View view = eVar2.f3060f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (Intrinsics.areEqual(aVar, InterfaceC5833b.C0553b.f83223a)) {
            layoutParams2.dimensionRatio = "w,9:16";
            layoutParams2.matchConstraintPercentHeight = 1.0f;
        } else {
            if (!(aVar instanceof InterfaceC5833b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.dimensionRatio = null;
            layoutParams2.matchConstraintPercentHeight = 1 - ((InterfaceC5833b.a) aVar).f83222a;
        }
        view.setLayoutParams(layoutParams2);
        Dr0.e eVar3 = this.f81295g;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar3 = null;
        }
        CoordinatorLayout coordinatorLayout = eVar3.f3057c;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.matchConstraintMaxWidth = iDpToPx;
        coordinatorLayout.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
            setCanceledOnTouchOutside(true);
            WindowCompat.setDecorFitsSystemWindows(window, false);
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dr0.e eVarInflate = Dr0.e.inflate(getLayoutInflater());
        this.f81295g = eVarInflate;
        Dr0.e eVar = eVarInflate;
        if (eVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar = null;
        }
        final ConstraintLayout constraintLayout = eVar.f3055a;
        setContentView(constraintLayout);
        Dr0.e eVar2 = this.f81295g;
        Dr0.e eVar3 = eVar2;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar3 = null;
        }
        eVar3.f3059e.setOnClickListener(new Jq.j(this, 2));
        Dr0.e eVar4 = this.f81295g;
        Dr0.e eVar5 = eVar4;
        if (eVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar5 = null;
        }
        RecyclerView recyclerView = eVar5.f3058d;
        this.h = recyclerView;
        recyclerView.setLayoutManager(this.f81297j);
        RecyclerView recyclerView2 = this.h;
        RecyclerView recyclerView3 = recyclerView2;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(this.f81296i);
        RecyclerView recyclerView4 = this.h;
        RecyclerView recyclerView5 = recyclerView4;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setItemAnimator(null);
        Dr0.e eVar6 = this.f81295g;
        Dr0.e eVar7 = eVar6;
        if (eVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            eVar7 = null;
        }
        LinearLayout linearLayout = eVar7.f3056b;
        linearLayout.setOnClickListener(new Object());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f81289a);
        objectRef.element = windowSizeClassWindowSize;
        l(windowSizeClassWindowSize);
        RecyclerView recyclerView6 = this.h;
        RecyclerView recyclerView7 = recyclerView6;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView7 = null;
        }
        final RecyclerView recyclerView8 = recyclerView7;
        ViewCompat.setOnApplyWindowInsetsListener(constraintLayout, new OnApplyWindowInsetsListener(this, constraintLayout, recyclerView8) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuSettingsDialog f81441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ConstraintLayout f81442b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final RecyclerView f81443c;

            {
                this.f81441a = this;
                this.f81442b = constraintLayout;
                this.f81443c = recyclerView8;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) throws NoWhenBranchMatchedException {
                WindowSizeClass windowSizeClass;
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
                int i7 = insets.top;
                DanmakuSettingsDialog danmakuSettingsDialog = this.f81441a;
                boolean z6 = danmakuSettingsDialog.f81300m != i7;
                danmakuSettingsDialog.f81300m = i7;
                BLog.i("DanmakuSettingsDialog", "windowInsets - systemBars: " + insets + ", ime: " + insets2 + ", imeVisible: " + zIsVisible);
                ConstraintLayout constraintLayout2 = this.f81442b;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), insets.top, constraintLayout2.getPaddingRight(), constraintLayout2.getPaddingBottom());
                int i8 = zIsVisible ? insets2.bottom : insets.bottom;
                RecyclerView recyclerView9 = this.f81443c;
                recyclerView9.setPadding(recyclerView9.getPaddingLeft(), recyclerView9.getPaddingTop(), recyclerView9.getPaddingRight(), i8);
                if (z6 && (windowSizeClass = danmakuSettingsDialog.f81299l) != null) {
                    danmakuSettingsDialog.l(windowSizeClass);
                }
                return windowInsetsCompat;
            }
        });
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, objectRef, null), 3, (Object) null);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(linearLayout);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new b(this, window));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(this.f81293e);
        }
        j();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.h;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(null);
        this.f81296i.N(CollectionsKt.emptyList());
    }
}
