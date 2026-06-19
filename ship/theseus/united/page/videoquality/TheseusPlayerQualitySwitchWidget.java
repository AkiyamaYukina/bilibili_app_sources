package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt;
import com.google.common.base.Optional;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualitySwitchWidget.class */
@StabilityInferred(parameters = 0)
public final class TheseusPlayerQualitySwitchWidget extends Zq0.d implements IControlWidget {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f103801o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ComposeView f103802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public com.bilibili.ship.theseus.keel.player.h f103803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public com.bilibili.ship.theseus.united.page.screenstate.c f103804g;

    @Inject
    public IControlContainerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public IReporterService f103805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Inject
    public IPlayerSettingService f103806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Inject
    public O f103807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Inject
    public Optional<a> f103808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableState f103809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final c f103810n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualitySwitchWidget$a.class */
    @Stable
    public interface a {
        @Nullable
        Function3<Modifier, Composer, Integer, Unit> getContent();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualitySwitchWidget$b.class */
    public static final class b<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusPlayerQualitySwitchWidget f103811a;

        public b(TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget) {
            this.f103811a = theseusPlayerQualitySwitchWidget;
        }

        public final Object emit(Object obj, Continuation continuation) {
            final MediaResource mediaResource = (MediaResource) ((Pair) obj).component1();
            final TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget = this.f103811a;
            if (mediaResource == null || !TheseusPlayerQualitySwitchWidget.k0(theseusPlayerQualitySwitchWidget)) {
                theseusPlayerQualitySwitchWidget.setVisibility(8);
                theseusPlayerQualitySwitchWidget.f103802e.disposeComposition();
            } else {
                theseusPlayerQualitySwitchWidget.setVisibility(0);
                theseusPlayerQualitySwitchWidget.f103802e.setContent(ComposableLambdaKt.composableLambdaInstance(-2139309415, true, new Function2(theseusPlayerQualitySwitchWidget, mediaResource) { // from class: com.bilibili.ship.theseus.united.page.videoquality.g0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusPlayerQualitySwitchWidget f103874a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaResource f103875b;

                    {
                        this.f103874a = theseusPlayerQualitySwitchWidget;
                        this.f103875b = mediaResource;
                    }

                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2139309415, iIntValue, -1, "com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget.bindToView.<anonymous>.<anonymous> (TheseusPlayerQualitySwitchWidget.kt:118)");
                            }
                            TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget2 = this.f103874a;
                            theseusPlayerQualitySwitchWidget2.j0(this.f103875b, (com.bilibili.player.tangram.basic.c) SnapshotStateKt.collectAsState(theseusPlayerQualitySwitchWidget2.getPlayer().f91109c.f79294a, theseusPlayerQualitySwitchWidget2.getPlayer().f91109c.g(), null, composer, 0, 2).getValue(), (com.bilibili.player.tangram.basic.a) SnapshotStateKt.collectAsState(theseusPlayerQualitySwitchWidget2.getPlayer().f91109c.f79296c, theseusPlayerQualitySwitchWidget2.getPlayer().f91109c.a(), null, composer, 0, 2).getValue(), null, composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget$bindToView$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualitySwitchWidget$bindToView$6.class */
    public static final /* synthetic */ class AnonymousClass6 extends AdaptedFunctionReference implements Function3<MediaResource, Oi1.d, Continuation<? super Pair<? extends MediaResource, ? extends Oi1.d>>, Object>, SuspendFunction {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(MediaResource mediaResource, Oi1.d dVar, Continuation<? super Pair<MediaResource, Oi1.d>> continuation) {
            int i7 = TheseusPlayerQualitySwitchWidget.f103801o;
            return new Pair(mediaResource, dVar);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualitySwitchWidget$c.class */
    public final class c implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusPlayerQualitySwitchWidget f103814a;

        public c(TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget) {
            this.f103814a = theseusPlayerQualitySwitchWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget = this.f103814a;
            theseusPlayerQualitySwitchWidget.setControlContainerVisible(z6);
            if (z6 && theseusPlayerQualitySwitchWidget.getControlContainerService().getScreenModeType() != ScreenModeType.THUMB && TheseusPlayerQualitySwitchWidget.k0(theseusPlayerQualitySwitchWidget)) {
                com.bilibili.playerbizcommonv2.widget.quality.l0.a("player.player.quality.show.player", null, theseusPlayerQualitySwitchWidget.getReporterService());
            }
        }
    }

    @JvmOverloads
    public TheseusPlayerQualitySwitchWidget(@NotNull Context context) {
        this(context, 0);
    }

    public TheseusPlayerQualitySwitchWidget(Context context, int i7) {
        super(context, null, 0);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.f103802e = composeView;
        setContentDescription("清晰度调节");
        composeView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        addView(composeView);
        this.f103809m = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f103810n = new c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getControlContainerVisible() {
        return ((Boolean) this.f103809m.getValue()).booleanValue();
    }

    public static final boolean k0(TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget) {
        int widgetFrom = theseusPlayerQualitySwitchWidget.getWidgetFrom();
        boolean zN = true;
        if (widgetFrom == 1) {
            Oi1.d cloudConfig = theseusPlayerQualitySwitchWidget.getPlayerSettingService().getCloudConfig();
            BLog.i("showQuality:" + cloudConfig.q() + " supportQuality:" + cloudConfig.N());
            if (!cloudConfig.q() || !cloudConfig.N()) {
                zN = false;
            }
        } else if (widgetFrom == 2) {
            BLog.i("showQuality:" + theseusPlayerQualitySwitchWidget.getPlayerSettingService().getCloudConfig().N());
            zN = theseusPlayerQualitySwitchWidget.getPlayerSettingService().getCloudConfig().N();
        }
        return zN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setControlContainerVisible(boolean z6) {
        this.f103809m.setValue(Boolean.valueOf(z6));
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        getControlContainerService().registerControlContainerVisible(this.f103810n);
        Oi1.f.b();
        if (!Oi1.f.b) {
            Oi1.f.b();
            if (!Oi1.f.c) {
                setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.videoquality.e0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusPlayerQualitySwitchWidget f103864a;

                    {
                        this.f103864a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget = this.f103864a;
                        int i7 = TheseusPlayerQualitySwitchWidget.f103801o;
                        theseusPlayerQualitySwitchWidget.getReporterService().report(new NeuronsEvents.b("player.player.quality.0.player", (Map) null));
                        theseusPlayerQualitySwitchWidget.getShowQualityList().invoke();
                    }
                });
                Object objCollect = FlowKt.combine(FlowKt.transformLatest(FlowKt.asStateFlow(getPlayer().f91111e), new TheseusPlayerQualitySwitchWidget$bindToView$$inlined$flatMapLatest$1(null)), TheseusPlayContainerXKt.a(getPlayerSettingService()), AnonymousClass6.INSTANCE).collect(new b(this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }
        this.f103802e.setContent(C6434h.f103876a);
        return Unit.INSTANCE;
    }

    @NotNull
    public final Optional<a> getBubbleOptional() {
        Optional<a> optional = this.f103808l;
        if (optional != null) {
            return optional;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bubbleOptional");
        return null;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.h;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h getPlayer() {
        com.bilibili.ship.theseus.keel.player.h hVar = this.f103803f;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("player");
        return null;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.f103806j;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f103805i;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c getScreenStateRepository() {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f103804g;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenStateRepository");
        return null;
    }

    @NotNull
    public final O getShowQualityList() {
        O o7 = this.f103807k;
        if (o7 != null) {
            return o7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showQualityList");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(final com.bilibili.lib.media.resource.MediaResource r11, final com.bilibili.player.tangram.basic.c r12, final com.bilibili.player.tangram.basic.a r13, androidx.compose.ui.Modifier r14, androidx.compose.runtime.Composer r15, final int r16) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget.j0(com.bilibili.lib.media.resource.MediaResource, com.bilibili.player.tangram.basic.c, com.bilibili.player.tangram.basic.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
        this.f103802e.disposeComposition();
        getControlContainerService().unregisterControlContainerVisible(this.f103810n);
    }

    public final void setBubbleOptional(@NotNull Optional<a> optional) {
        this.f103808l = optional;
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.h = iControlContainerService;
    }

    public final void setPlayer(@NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f103803f = hVar;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.f103806j = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f103805i = iReporterService;
    }

    public final void setScreenStateRepository(@NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f103804g = cVar;
    }

    public final void setShowQualityList(@NotNull O o7) {
        this.f103807k = o7;
    }
}
