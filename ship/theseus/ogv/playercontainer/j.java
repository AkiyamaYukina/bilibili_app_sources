package com.bilibili.ship.theseus.ogv.playercontainer;

import YO.m;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.misc.OgvVideoSvgaCardWidget;
import dagger.assisted.AssistedInject;
import dr0.ViewOnClickListenerC6833a;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.Material;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.MaterialBizType;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/j.class */
@StabilityInferred(parameters = 0)
public final class j extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f94325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f94326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IReporterService f94327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Material f94328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<Material, Unit> f94329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OgvVideoSvgaCardWidget f94330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94331g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f94332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f94333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f94334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f94335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final FunctionWidgetConfig f94336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f94337n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/j$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f94338a;

        public a(j jVar) {
            this.f94338a = jVar;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            boolean z6 = screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN;
            j jVar = this.f94338a;
            jVar.h = z6;
            jVar.g();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/j$b.class */
    public static final class b implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f94339a;

        public b(j jVar) {
            this.f94339a = jVar;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            j jVar = this.f94339a;
            jVar.f94331g = z6;
            jVar.g();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/j$c.class */
    public static final class c implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f94340a;

        public c(j jVar) {
            this.f94340a = jVar;
        }

        public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
            if (Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class)) {
                j jVar = this.f94340a;
                jVar.f94332i = false;
                jVar.g();
            }
        }

        public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
            if (Intrinsics.areEqual(functionWidgetToken.getClazz(), ViewOnClickListenerC6833a.class)) {
                j jVar = this.f94340a;
                jVar.f94332i = true;
                jVar.g();
            }
        }
    }

    @AssistedInject
    public j(@NotNull Context context, @NotNull IControlContainerService iControlContainerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IReporterService iReporterService, @NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        super(context);
        this.f94325a = iControlContainerService;
        this.f94326b = absFunctionWidgetService;
        this.f94327c = iReporterService;
        this.f94328d = material;
        this.f94329e = function1;
        this.f94333j = new b(this);
        this.f94334k = new a(this);
        this.f94335l = new c(this);
        this.f94336m = new FunctionWidgetConfig.Builder().launchType(2).dismissWhenVideoChange(true).build();
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131500440, (ViewGroup) null);
        this.f94330f = (OgvVideoSvgaCardWidget) viewInflate.findViewById(2131312729);
        return viewInflate;
    }

    public final void g() {
        boolean z6 = this.f94331g && this.h && !this.f94332i;
        if (z6 == this.f94337n) {
            return;
        }
        OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget = null;
        if (z6) {
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget2 = this.f94330f;
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget3 = ogvVideoSvgaCardWidget2;
            if (ogvVideoSvgaCardWidget2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardWidget");
                ogvVideoSvgaCardWidget3 = null;
            }
            Material material = this.f94328d;
            ogvVideoSvgaCardWidget3.setOnClickListener(new m(1, this, material));
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget4 = this.f94330f;
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget5 = ogvVideoSvgaCardWidget4;
            if (ogvVideoSvgaCardWidget4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardWidget");
                ogvVideoSvgaCardWidget5 = null;
            }
            ogvVideoSvgaCardWidget5.setVisibility(0);
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget6 = this.f94330f;
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget7 = ogvVideoSvgaCardWidget6;
            if (ogvVideoSvgaCardWidget6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardWidget");
                ogvVideoSvgaCardWidget7 = null;
            }
            ogvVideoSvgaCardWidget7.a(material.getStaticIcon());
            Pair pair = TuplesKt.to("operational_id", String.valueOf(material.getId()));
            MaterialBizType type = material.getType();
            Integer numValueOf = null;
            if (type != null) {
                numValueOf = Integer.valueOf(type.ordinal());
            }
            this.f94327c.report(new NeuronsEvents.b("player.player.activity.show.player", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("operational_type", String.valueOf(numValueOf))})));
        } else {
            OgvVideoSvgaCardWidget ogvVideoSvgaCardWidget8 = this.f94330f;
            if (ogvVideoSvgaCardWidget8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardWidget");
            } else {
                ogvVideoSvgaCardWidget = ogvVideoSvgaCardWidget8;
            }
            ogvVideoSvgaCardWidget.setVisibility(8);
        }
        this.f94337n = z6;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return this.f94336m;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        b bVar = this.f94333j;
        IControlContainerService iControlContainerService = this.f94325a;
        iControlContainerService.unregisterControlContainerVisible(bVar);
        iControlContainerService.unregisterState(this.f94334k);
        this.f94326b.removeOnWidgetStateChangeListener(this.f94335l);
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        IControlContainerService iControlContainerService = this.f94325a;
        iControlContainerService.registerControlContainerVisible(this.f94333j);
        iControlContainerService.registerState(this.f94334k);
        this.f94326b.addOnWidgetStateChangeListener(this.f94335l);
        this.h = iControlContainerService.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN;
        g();
    }
}
