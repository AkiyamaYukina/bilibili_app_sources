package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.utils.PanelState;
import com.bilibili.lib.projection.internal.widget.ProjectionGlobalLinkModeWidget;
import com.bilibili.lib.projection.internal.widget.ProjectionTitleWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionDeviceNameWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionDeviceSwitchFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionGlobalLinkModeFullScreenWidget;
import he0.C7433b;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.LinkedList;
import java.util.List;
import ke0.InterfaceC7755c;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import we0.C8881c;
import xe0.AbstractC8965a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/w.class */
public final class w extends AbstractC8965a implements InterfaceC5317a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f63440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC7845m f63441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ProjectionTitleWidget f63442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f63443g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceSwitchFullScreenWidget f63444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f63445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f63446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ProjectionGlobalLinkModeFullScreenWidget f63447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public View f63448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceNameWidget f63449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63450o = new CompositeDisposable();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final LinkedList<ProjectionDialogFragment> f63451p = new LinkedList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ProjectionOperationConfig.ControlPageConfig f63452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ProjectionOperationConfig.ThirdProjBubbleConfig f63453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.widget.e f63454s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/w$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63455a;

        static {
            int[] iArr = new int[PanelState.values().length];
            try {
                iArr[PanelState.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PanelState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PanelState.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f63455a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/w$b.class */
    public static final class b implements com.bilibili.lib.projection.internal.widget.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f63456a;

        public b(w wVar) {
            this.f63456a = wVar;
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void a() {
            this.f63456a.f63441e.getCallback().onProjectionBackPressed();
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void f() {
            w wVar = this.f63456a;
            wVar.z();
            InterfaceC7845m interfaceC7845m = wVar.f63441e;
            interfaceC7845m.reportStop();
            interfaceC7845m.stop();
            ProjectionClient.stopGlobalLink$default(interfaceC7845m, false, 1, null);
        }

        @Override // com.bilibili.lib.projection.internal.widget.x
        public final void g(com.bilibili.lib.projection.internal.widget.halfscreen.ProjectionDeviceNameWidget projectionDeviceNameWidget) {
            if (projectionDeviceNameWidget != null) {
                projectionDeviceNameWidget.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                projectionDeviceNameWidget.setSingleLine(true);
                projectionDeviceNameWidget.setFocusable(true);
                projectionDeviceNameWidget.setFocusableInTouchMode(true);
                projectionDeviceNameWidget.setMarqueeRepeatLimit(-1);
                projectionDeviceNameWidget.setHorizontallyScrolling(true);
                projectionDeviceNameWidget.setSelected(true);
            }
        }
    }

    public w(@NotNull Context context, @NotNull InterfaceC7845m interfaceC7845m) {
        this.f63440d = context;
        this.f63441e = interfaceC7845m;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void u(w wVar, PanelState panelState) throws NoWhenBranchMatchedException {
        wVar.getClass();
        int i7 = a.f63455a[panelState.ordinal()];
        if (i7 == 1) {
            View view = wVar.f63443g;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = wVar.h;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget = wVar.f63444i;
            if (projectionDeviceSwitchFullScreenWidget != null) {
                projectionDeviceSwitchFullScreenWidget.setVisibility(0);
            }
            View view3 = wVar.f63445j;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = wVar.f63446k;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            InterfaceC7845m interfaceC7845m = wVar.f63441e;
            if (interfaceC7845m.getClientType() == 4) {
                List<Float> list = C7433b.f120827a;
                com.bilibili.lib.projection.internal.device.a aVarS = interfaceC7845m.s();
                if (!C7433b.d(aVarS != null ? aVarS.getDevice() : null)) {
                    View view5 = wVar.f63448m;
                    if (view5 != null) {
                        view5.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            View view6 = wVar.f63448m;
            if (view6 != null) {
                view6.setVisibility(0);
                return;
            }
            return;
        }
        if (i7 == 2) {
            View view7 = wVar.f63443g;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            View view8 = wVar.h;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget2 = wVar.f63444i;
            if (projectionDeviceSwitchFullScreenWidget2 != null) {
                projectionDeviceSwitchFullScreenWidget2.setVisibility(8);
            }
            View view9 = wVar.f63445j;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            View view10 = wVar.f63446k;
            if (view10 != null) {
                view10.setVisibility(8);
            }
            View view11 = wVar.f63448m;
            if (view11 != null) {
                view11.setVisibility(8);
                return;
            }
            return;
        }
        if (i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        View view12 = wVar.f63443g;
        if (view12 != null) {
            view12.setVisibility(0);
        }
        View view13 = wVar.h;
        if (view13 != null) {
            view13.setVisibility(8);
        }
        ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget3 = wVar.f63444i;
        if (projectionDeviceSwitchFullScreenWidget3 != null) {
            projectionDeviceSwitchFullScreenWidget3.setVisibility(8);
        }
        View view14 = wVar.f63445j;
        if (view14 != null) {
            view14.setVisibility(8);
        }
        View view15 = wVar.f63446k;
        if (view15 != null) {
            view15.setVisibility(8);
        }
        View view16 = wVar.f63448m;
        if (view16 != null) {
            view16.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(View view) {
        if (view instanceof InterfaceC7755c) {
            ((InterfaceC7755c) view).b(this.f63441e);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                D(viewGroup.getChildAt(i7));
            }
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    @NotNull
    public final InterfaceC7845m M6() {
        return this.f63441e;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    public final void Td(@NotNull ProjectionDialogFragment projectionDialogFragment) {
        this.f63451p.remove(projectionDialogFragment);
    }

    @Override // xe0.AbstractC8965a
    @NotNull
    public final View o(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f63440d).inflate(2131499659, viewGroup, false);
        ProjectionTitleWidget projectionTitleWidget = (ProjectionTitleWidget) viewInflate.findViewById(2131308649);
        this.f63442f = projectionTitleWidget;
        View view = projectionTitleWidget.f63848a;
        if (view != null) {
            view.setVisibility(8);
        }
        ProjectionGlobalLinkModeWidget projectionGlobalLinkModeWidget = projectionTitleWidget.h;
        if (projectionGlobalLinkModeWidget != null) {
            projectionGlobalLinkModeWidget.setVisibility(8);
        }
        InterfaceC7845m interfaceC7845m = this.f63441e;
        projectionTitleWidget.k(interfaceC7845m.isGlobalLinkMode() || interfaceC7845m.getClientType() == 4);
        Lazy lazy = he0.e.f120842a;
        long jF = he0.e.f(interfaceC7845m.getConfig());
        ProjectionOperationConfig projectionOperationConfigB = he0.e.b(String.valueOf(jF));
        this.f63452q = projectionOperationConfigB != null ? projectionOperationConfigB.getProjPage() : null;
        ProjectionOperationConfig projectionOperationConfigB2 = he0.e.b(String.valueOf(jF));
        this.f63453r = projectionOperationConfigB2 != null ? projectionOperationConfigB2.getThirdProjBubble() : null;
        ProjectionOperationConfig.ControlPageConfig controlPageConfig = this.f63452q;
        String staticPic = controlPageConfig != null ? controlPageConfig.getStaticPic() : null;
        ProjectionOperationConfig.ControlPageConfig controlPageConfig2 = this.f63452q;
        String dynamicPic = controlPageConfig2 != null ? controlPageConfig2.getDynamicPic() : null;
        ProjectionOperationConfig.ControlPageConfig controlPageConfig3 = this.f63452q;
        int repeat = controlPageConfig3 != null ? controlPageConfig3.getRepeat() : 1;
        if (!((C8881c) getContainer()).getClient().isGlobalLinkMode()) {
            if ((staticPic == null || StringsKt.isBlank(staticPic)) && (dynamicPic == null || StringsKt.isBlank(dynamicPic))) {
                BLog.i("ProjectionClientControlPanel", "pic url empty");
            } else {
                ProjectionTitleWidget projectionTitleWidget2 = this.f63442f;
                if (projectionTitleWidget2 != null) {
                    projectionTitleWidget2.setSVGAClearAfterStop(false);
                }
                ProjectionTitleWidget projectionTitleWidget3 = this.f63442f;
                if (projectionTitleWidget3 != null) {
                    projectionTitleWidget3.setStaticImage(staticPic);
                }
                ProjectionOperationConfig.ControlPageConfig controlPageConfig4 = this.f63452q;
                if (controlPageConfig4 != null) {
                    com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                    String id = controlPageConfig4.getId();
                    String title = controlPageConfig4.getTitle();
                    String url = controlPageConfig4.getUrl();
                    com.bilibili.lib.projection.internal.device.a aVarS = interfaceC7845m.s();
                    aVar.r(id, title, url, aVarS != null ? aVarS.getDevice() : null);
                }
                ProjectionTitleWidget projectionTitleWidget4 = this.f63442f;
                if (projectionTitleWidget4 != null) {
                    projectionTitleWidget4.j(repeat, dynamicPic);
                }
            }
        }
        projectionTitleWidget.setActionCallback(new b(this));
        this.h = viewInflate.findViewById(2131297514);
        this.f63449n = (ProjectionDeviceNameWidget) viewInflate.findViewById(2131308641);
        final ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget = (ProjectionDeviceSwitchFullScreenWidget) viewInflate.findViewById(2131308648);
        this.f63444i = projectionDeviceSwitchFullScreenWidget;
        projectionDeviceSwitchFullScreenWidget.setVisibility((!interfaceC7845m.isGlobalLinkMode() || interfaceC7845m.getClientType() == 4) ? 0 : 8);
        projectionDeviceSwitchFullScreenWidget.setOnClickListener(new View.OnClickListener(this, projectionDeviceSwitchFullScreenWidget) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final w f63436a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionDeviceSwitchFullScreenWidget f63437b;

            {
                this.f63436a = this;
                this.f63437b = projectionDeviceSwitchFullScreenWidget;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                w wVar = this.f63436a;
                ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget2 = this.f63437b;
                wVar.z();
                InterfaceC7845m.h(wVar.f63441e, projectionDeviceSwitchFullScreenWidget2.getContext(), true, true, false, 8);
            }
        });
        this.f63445j = viewInflate.findViewById(2131308646);
        this.f63446k = viewInflate.findViewById(2131308644);
        this.f63448m = viewInflate.findViewById(2131308640);
        View viewFindViewById = viewInflate.findViewById(2131297513);
        this.f63443g = viewFindViewById;
        ((AppCompatTextView) viewFindViewById.findViewById(2131300166)).setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.p(this, 1));
        this.f63447l = (ProjectionGlobalLinkModeFullScreenWidget) viewInflate.findViewById(2131308643);
        View viewFindViewById2 = viewInflate.findViewById(2131308642);
        int i7 = 8;
        if (interfaceC7845m.isGlobalLinkMode()) {
            i7 = interfaceC7845m.getClientType() == 4 ? 8 : 0;
        }
        viewFindViewById2.setVisibility(i7);
        Disposable disposableSubscribe = interfaceC7845m.f().switchMap(new x(this)).subscribe(new y(this));
        CompositeDisposable compositeDisposable = this.f63450o;
        compositeDisposable.add(disposableSubscribe);
        compositeDisposable.add(C7564c.f121647x.subscribe(new z(this)));
        if (interfaceC7845m.isGlobalLinkMode()) {
            compositeDisposable.add(interfaceC7845m.f().switchMap(A.f63337a).subscribe(new B(this)));
        }
        final ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget2 = this.f63444i;
        if (projectionDeviceSwitchFullScreenWidget2 != null) {
            com.bilibili.lib.projection.internal.widget.e eVar = new com.bilibili.lib.projection.internal.widget.e(View.inflate(this.f63440d, 2131496561, null), projectionDeviceSwitchFullScreenWidget2, 2, 0);
            eVar.setFocusable(false);
            eVar.setTouchInterceptor(new View.OnTouchListener(this, projectionDeviceSwitchFullScreenWidget2) { // from class: com.bilibili.lib.projection.internal.panel.fullscreen.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final w f63438a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ProjectionDeviceSwitchFullScreenWidget f63439b;

                {
                    this.f63438a = this;
                    this.f63439b = projectionDeviceSwitchFullScreenWidget2;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    w wVar = this.f63438a;
                    ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget3 = this.f63439b;
                    wVar.z();
                    InterfaceC7845m interfaceC7845m2 = projectionDeviceSwitchFullScreenWidget3.f63923d;
                    if (interfaceC7845m2 != null) {
                        InterfaceC7845m.h(interfaceC7845m2, projectionDeviceSwitchFullScreenWidget3.getContext(), true, false, false, 8);
                    }
                    return view2.performClick();
                }
            });
            eVar.f63908b = new C(this, eVar);
            this.f63454s = eVar;
        }
        return viewInflate;
    }

    @Override // xe0.AbstractC8965a
    public final void q() {
        super.q();
        D(k());
    }

    @Override // xe0.AbstractC8965a
    public final void r() {
        com.bilibili.lib.projection.internal.widget.e eVar;
        super.r();
        v(k());
        com.bilibili.lib.projection.internal.widget.e eVar2 = this.f63454s;
        if ((eVar2 == null || !eVar2.isShowing()) && (eVar = this.f63454s) != null) {
            com.bilibili.lib.projection.internal.widget.e.b(eVar, 0, 0, 600L, 3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showPanel(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.w.showPanel(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(View view) {
        if (view instanceof InterfaceC7755c) {
            InterfaceC7755c interfaceC7755c = (InterfaceC7755c) view;
            interfaceC7755c.i(this.f63441e);
            interfaceC7755c.setPanelContext(this);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                v(viewGroup.getChildAt(i7));
            }
        }
    }

    public final void z() {
        com.bilibili.lib.projection.internal.widget.e eVar;
        com.bilibili.lib.projection.internal.widget.e eVar2 = this.f63454s;
        if (eVar2 == null || !eVar2.isShowing() || (eVar = this.f63454s) == null) {
            return;
        }
        eVar.dismiss();
    }
}
