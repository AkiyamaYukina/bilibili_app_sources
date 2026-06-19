package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/c.class */
@StabilityInferred(parameters = 0)
public final class c extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusInteractVideoService f99953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f99954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vq0.d f99955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f99956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f99957e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99958a;

        public a(int i7) {
            this.f99958a = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/c$b.class */
    public static final class b implements vq0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f99959a;

        public b(c cVar) {
            this.f99959a = cVar;
        }

        @Override // vq0.j
        public final void a() {
            c cVar = this.f99959a;
            AbsFunctionWidgetService absFunctionWidgetService = cVar.f99954b;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFunctionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(cVar.getToken());
        }

        @Override // vq0.j
        public final void b() {
            c cVar = this.f99959a;
            vq0.d dVar = cVar.f99955c;
            vq0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                dVar2 = null;
            }
            dVar2.b();
            TheseusInteractVideoService theseusInteractVideoService = cVar.f99953a;
            if (theseusInteractVideoService.f99869F == 99003) {
                theseusInteractVideoService.f99900q.c();
            } else {
                theseusInteractVideoService.h(TheseusInteractVideoService.a.d.f99915a);
            }
        }

        @Override // vq0.j
        public final void c(long j7, int i7, long j8, long j9) {
            com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar = new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(j7, j8, "", 0L, 1, i7, (int) j9);
            c cVar = this.f99959a;
            vq0.d dVar = cVar.f99955c;
            vq0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                dVar2 = null;
            }
            dVar2.b();
            cVar.f99953a.j(jVar, null, true);
        }

        @Override // vq0.j
        public final void j() {
            TheseusInteractVideoService theseusInteractVideoService = this.f99959a.f99953a;
            theseusInteractVideoService.getClass();
            PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, theseusInteractVideoService.f99885a, 0, (String) null, 4, (Object) null);
            d dVar = theseusInteractVideoService.f99865B;
            if (dVar == null || !dVar.a()) {
                return;
            }
            dVar.f99962c.updateFunctionWidgetConfiguration(dVar.f99963d, new a(2));
        }
    }

    public c(@NotNull Context context, @NotNull TheseusInteractVideoService theseusInteractVideoService) {
        super(context);
        this.f99953a = theseusInteractVideoService;
        this.f99957e = new b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131495155, (ViewGroup) null, false);
        this.f99956d = (ViewGroup) viewInflate.findViewById(2131301692);
        viewInflate.findViewById(2131315119).setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f99952a;

            {
                this.f99952a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar = this.f99952a;
                cVar.f99953a.k();
                vq0.d dVar = cVar.f99955c;
                vq0.d dVar2 = dVar;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                    dVar2 = null;
                }
                dVar2.b();
            }
        });
        viewInflate.setOnClickListener(new com.bilibili.search2.result.base.d(1, this));
        this.f99955c = new vq0.d();
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().persistent(true).dismissWhenVideoChange(true).dismissWhenVideoCompleted(true).changeOrientationDisableWhenShow(true).build();
    }

    public final boolean onBackPressed() {
        vq0.d dVar = this.f99955c;
        vq0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
            dVar2 = null;
        }
        dVar2.b();
        return true;
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof a) {
            int i7 = ((a) configuration).f99958a;
            vq0.d dVar = null;
            if (i7 != 1) {
                if (i7 != 2) {
                    return;
                }
                vq0.d dVar2 = this.f99955c;
                if (dVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                    dVar2 = null;
                }
                dVar2.b();
                return;
            }
            InteractNode interactNode = this.f99953a.f99866C;
            if (interactNode == null) {
                return;
            }
            vq0.d dVar3 = this.f99955c;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
            } else {
                dVar = dVar3;
            }
            dVar.f128376k = interactNode;
            dVar.c();
        }
    }

    public final void onRelease() {
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        InteractNode interactNode = this.f99953a.f99866C;
        vq0.d dVar = this.f99955c;
        ViewGroup viewGroup = null;
        vq0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
            dVar2 = null;
        }
        if (dVar2.f128385t && interactNode != null) {
            vq0.d dVar3 = this.f99955c;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                dVar3 = null;
            }
            dVar3.f128376k = interactNode;
            dVar3.c();
            return;
        }
        vq0.d dVar4 = this.f99955c;
        vq0.d dVar5 = dVar4;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
            dVar5 = null;
        }
        ViewGroup viewGroup2 = this.f99956d;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingViewContainer");
        } else {
            viewGroup = viewGroup2;
        }
        dVar5.a(viewGroup, this.f99957e, interactNode);
    }
}
