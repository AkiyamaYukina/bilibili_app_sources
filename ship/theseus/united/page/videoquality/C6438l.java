package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.playerbizcommonv2.widget.quality.HDRType;
import com.bilibili.playerbizcommonv2.widget.quality.QualityHdrInfoComponent;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/l.class */
@StabilityInferred(parameters = 0)
public final class C6438l extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f103891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IReporterService f103895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f103896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final QualityHdrInfoComponent f103897g;

    @NotNull
    public final UIComponent.b<ComposeView> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CoroutineScope f103898i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.l$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/l$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final HDRType f103899a;

        public a(@NotNull HDRType hDRType) {
            this.f103899a = hDRType;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.l$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/l$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f103900a;

        static {
            int[] iArr = new int[HDRType.values().length];
            try {
                iArr[HDRType.HDR.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[HDRType.HDRVIVID.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f103900a = iArr;
        }
    }

    @Inject
    public C6438l(@NotNull Context context, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IControlContainerService iControlContainerService, @NotNull IReporterService iReporterService, @NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        super(context);
        this.f103891a = theseusPlayerQualityService;
        this.f103892b = hVar;
        this.f103893c = iPlayerCoreService;
        this.f103894d = iControlContainerService;
        this.f103895e = iReporterService;
        this.f103896f = absFunctionWidgetService;
        QualityHdrInfoComponent qualityHdrInfoComponent = new QualityHdrInfoComponent(new Xr.y(this, 1), new C61.g(1, this, context), new com.bilibili.bplus.followinglist.module.item.draw.pro.B(this, 1), new C6437k(this, 0));
        this.f103897g = qualityHdrInfoComponent;
        this.h = qualityHdrInfoComponent.createViewEntry(context, null);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        return this.h.a;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration instanceof a) {
            this.f103897g.f82719f = ((a) configuration).f103899a;
        }
        CoroutineScope coroutineScope = this.f103898i;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new QualityHdrInfoFunctionWidget$updateWidget$1(this, null), 3, (Object) null);
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        this.f103892b.i(this);
        CoroutineScope coroutineScope = this.f103898i;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        this.f103898i = com.bilibili.ad.core.click.K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.f103892b.h(this);
        this.f103895e.report(new NeuronsEvents.b("player.player.hdr-wall.show.player", MapsKt.mapOf(TuplesKt.to("qn", String.valueOf(this.f103893c.getCurrentQuality())))));
    }
}
