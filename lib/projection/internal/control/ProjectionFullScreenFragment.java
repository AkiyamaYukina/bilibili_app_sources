package com.bilibili.lib.projection.internal.control;

import E80.v;
import HH.u;
import Ie0.i;
import Ne0.C2728g;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.ProjectionClientConfig;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment;
import com.bilibili.lib.projection.internal.control.NewBubbleHelper;
import com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.IEngineDeviceChange;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.search.C5323b;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiPlayControlWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import j4.t;
import ke0.InterfaceC7755c;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment.class */
public final class ProjectionFullScreenFragment extends BaseProjectionDialogFragment implements IEngineDeviceChange, InterfaceC5317a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f63038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f63039g;

    @Nullable
    public WindowSizeClass h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f63041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f63042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f63043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f63044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f63045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public NewBubbleHelper f63046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiTopBarWidget f63047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiDeviceInfoWidget f63048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiTvControlWidget f63049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ProjectionNewUiPlayControlWidget f63050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public View f63051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public C2728g f63052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f63054w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63055a;

        public a(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63055a = projectionFullScreenFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void accept(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = r4
                com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem r0 = (com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem) r0
                com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem r0 = r0.getRawItem()
                r6 = r0
                r0 = r6
                boolean r0 = r0 instanceof com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem
                r5 = r0
                r0 = 0
                r4 = r0
                r0 = r5
                if (r0 == 0) goto L1d
                r0 = r6
                com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem r0 = (com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem) r0
                r6 = r0
                goto L1f
            L1d:
                r0 = 0
                r6 = r0
            L1f:
                r0 = r6
                if (r0 == 0) goto L2a
                r0 = r6
                java.lang.String r0 = r0.getTitle()
                r4 = r0
            L2a:
                r0 = r3
                com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment r0 = r0.f63055a
                r7 = r0
                r0 = r4
                if (r0 == 0) goto L3d
                r0 = r4
                r6 = r0
                r0 = r4
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L45
            L3d:
                r0 = r7
                r1 = 2131846735(0x7f11664f, float:1.9326928E38)
                java.lang.String r0 = r0.getString(r1)
                r6 = r0
            L45:
                r0 = r7
                com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget r0 = r0.f63047p
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L54
                r0 = r4
                r1 = r6
                r0.setTitle(r1)
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment.a.accept(java.lang.Object):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$b.class */
    public static final class b implements ProjectionNewUiDeviceInfoWidget.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63056a;

        public b(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63056a = projectionFullScreenFragment;
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget.a
        public final void a() {
            final Context context;
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget;
            final ProjectionFullScreenFragment projectionFullScreenFragment = this.f63056a;
            projectionFullScreenFragment.kf();
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget2 = projectionFullScreenFragment.f63048q;
            if (projectionNewUiDeviceInfoWidget2 == null || (context = projectionNewUiDeviceInfoWidget2.getContext()) == null || (projectionNewUiDeviceInfoWidget = projectionFullScreenFragment.f63048q) == null) {
                return;
            }
            projectionNewUiDeviceInfoWidget.post(new Runnable(context, projectionFullScreenFragment) { // from class: oe0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f124594a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ProjectionFullScreenFragment f124595b;

                {
                    this.f124594a = context;
                    this.f124595b = projectionFullScreenFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.f124594a;
                    ProjectionFullScreenFragment projectionFullScreenFragment2 = this.f124595b;
                    boolean z6 = context2.getResources().getConfiguration().smallestScreenWidthDp >= 600;
                    InterfaceC7845m interfaceC7845m = projectionFullScreenFragment2.f63036d;
                    if (interfaceC7845m != null) {
                        InterfaceC7845m.h(interfaceC7845m, context2, false, !z6, true, 2);
                    }
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$c.class */
    public static final class c implements ProjectionNewUiTopBarWidget.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63057a;

        public c(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63057a = projectionFullScreenFragment;
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget.a
        public final void onBackClick() {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            ProjectionFullScreenFragment projectionFullScreenFragment = this.f63057a;
            projectionFullScreenFragment.dismissAllowingStateLoss();
            InterfaceC7845m interfaceC7845m = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
            ProjectionDeviceInternal projectionDeviceInternal = projectionFullScreenFragment.f63053v;
            InterfaceC7845m interfaceC7845m2 = projectionFullScreenFragment.f63036d;
            reporter.q(panelMode, projectionDeviceInternal, interfaceC7845m2 != null ? interfaceC7845m2.n(true) : null);
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget.a
        public final void onCloseClick() {
            ProjectionFullScreenFragment projectionFullScreenFragment = this.f63057a;
            InterfaceC7845m interfaceC7845m = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m != null) {
                interfaceC7845m.reportStop();
            }
            InterfaceC7845m interfaceC7845m2 = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m2 != null) {
                interfaceC7845m2.stop();
            }
            InterfaceC7845m interfaceC7845m3 = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m3 != null) {
                ProjectionClient.stopGlobalLink$default(interfaceC7845m3, false, 1, null);
            }
            InterfaceC7845m interfaceC7845m4 = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m4 != null) {
                com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m4.getReporter();
                IProjectionItem iProjectionItemN = interfaceC7845m4.n(true);
                reporter.M(iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null, projectionFullScreenFragment.f63053v, interfaceC7845m4.isGlobalLinkMode(), 2);
                interfaceC7845m4.stop();
                ProjectionClient.stopGlobalLink$default(interfaceC7845m4, false, 1, null);
            }
            projectionFullScreenFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$d.class */
    public static final class d implements ProjectionNewUiTvControlWidget.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63058a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$d$a.class */
        public static final class a implements ProjectionDeviceInternal.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionDeviceInternal f63059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionFullScreenFragment f63060b;

            public a(ProjectionDeviceInternal projectionDeviceInternal, ProjectionFullScreenFragment projectionFullScreenFragment) {
                this.f63059a = projectionDeviceInternal;
                this.f63060b = projectionFullScreenFragment;
            }

            @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
            public final void a() {
            }

            @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
            public final void b(boolean z6) {
                ProjectionFullScreenFragment projectionFullScreenFragment = this.f63060b;
                ProjectionDeviceInternal projectionDeviceInternal = this.f63059a;
                if (projectionDeviceInternal != null) {
                    com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                    InterfaceC7845m interfaceC7845m = projectionFullScreenFragment.f63036d;
                    StandardProjectionItem standardProjectionItem = null;
                    boolean z7 = true;
                    IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(true) : null;
                    if (iProjectionItemN instanceof StandardProjectionItem) {
                        standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
                    }
                    InterfaceC7845m interfaceC7845m2 = projectionFullScreenFragment.f63036d;
                    if (interfaceC7845m2 == null || !interfaceC7845m2.isGlobalLinkMode()) {
                        z7 = false;
                    }
                    aVar.K(standardProjectionItem, projectionDeviceInternal, z7, 2);
                }
                projectionFullScreenFragment.showPanel("ProjectionClientQualityPanel");
            }
        }

        public d(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63058a = projectionFullScreenFragment;
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
        public final void a(ProjectionDeviceInternal projectionDeviceInternal) {
            C7564c.f121625a.j(new a(projectionDeviceInternal, this.f63058a));
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
        public final void b(boolean z6) {
            t.a("full screen control fragment damaku click, isBiliTv: ", "ProjectionFullScreenFragment", z6);
            ProjectionFullScreenFragment projectionFullScreenFragment = this.f63058a;
            if (z6) {
                InterfaceC7845m interfaceC7845m = projectionFullScreenFragment.f63036d;
                if (interfaceC7845m != null) {
                    boolean danmakuShow = interfaceC7845m.getDanmakuShow();
                    com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m.getReporter();
                    boolean z7 = !danmakuShow;
                    reporter.u(interfaceC7845m.i().c(), z7);
                    interfaceC7845m.danmakuToggle(z7, true);
                    return;
                }
                return;
            }
            Context context = projectionFullScreenFragment.getContext();
            if (context != null) {
                boolean z8 = context.getResources().getConfiguration().smallestScreenWidthDp < 600;
                InterfaceC7845m interfaceC7845m2 = projectionFullScreenFragment.f63036d;
                if (interfaceC7845m2 != null) {
                    InterfaceC7845m.h(interfaceC7845m2, context, false, z8, false, 10);
                }
            }
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
        public final void c() {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            com.bilibili.lib.projection.internal.device.a aVarS;
            ProjectionFullScreenFragment projectionFullScreenFragment = this.f63058a;
            projectionFullScreenFragment.showPanel("ProjectionClientSpeedPanel");
            InterfaceC7845m interfaceC7845m = projectionFullScreenFragment.f63036d;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            InterfaceC7845m interfaceC7845m2 = projectionFullScreenFragment.f63036d;
            StandardProjectionItem standardProjectionItem = null;
            Float fValueOf = interfaceC7845m2 != null ? Float.valueOf(interfaceC7845m2.getPlaySpeed()) : null;
            InterfaceC7845m interfaceC7845m3 = projectionFullScreenFragment.f63036d;
            ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
            InterfaceC7845m interfaceC7845m4 = projectionFullScreenFragment.f63036d;
            IProjectionItem iProjectionItemN = interfaceC7845m4 != null ? interfaceC7845m4.n(true) : null;
            if (iProjectionItemN instanceof StandardProjectionItem) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            reporter.T(2, fValueOf, device, standardProjectionItem);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$e.class */
    public static final class e<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e<T, R> f63061a = (e<T, R>) new Object();

        public final Object apply(Object obj) {
            return ((com.bilibili.lib.projection.internal.device.a) obj).getDevice().i();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$f.class */
    public static final class f<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63062a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$f$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f63063a;

            static {
                int[] iArr = new int[ProjectionDeviceInternal.DeviceState.values().length];
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ProjectionDeviceInternal.DeviceState.DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f63063a = iArr;
            }
        }

        public f(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63062a = projectionFullScreenFragment;
        }

        public final void accept(Object obj) {
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget;
            int i7 = a.f63063a[((ProjectionDeviceInternal.DeviceState) obj).ordinal()];
            ProjectionFullScreenFragment projectionFullScreenFragment = this.f63062a;
            if (i7 != 1) {
                if (i7 == 2 && (projectionNewUiDeviceInfoWidget = projectionFullScreenFragment.f63048q) != null) {
                    projectionNewUiDeviceInfoWidget.setBiLinkHighlight(false);
                    return;
                }
                return;
            }
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget2 = projectionFullScreenFragment.f63048q;
            if (projectionNewUiDeviceInfoWidget2 != null) {
                projectionNewUiDeviceInfoWidget2.setBiLinkHighlight(true);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$g.class */
    public static final class g<T, R> implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63064a;

        public g(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63064a = projectionFullScreenFragment;
        }

        public final Object apply(Object obj) {
            com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) obj;
            this.f63064a.f63053v = aVar.getDevice();
            return aVar.getDevice().j();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/ProjectionFullScreenFragment$h.class */
    public static final class h implements NewBubbleHelper.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionFullScreenFragment f63065a;

        public h(ProjectionFullScreenFragment projectionFullScreenFragment) {
            this.f63065a = projectionFullScreenFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        @Override // com.bilibili.lib.projection.internal.control.NewBubbleHelper.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig.NewThirdProjBubbleConfig r8) {
            /*
                r7 = this;
                r0 = r7
                com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment r0 = r0.f63065a
                r13 = r0
                r0 = r13
                Ne0.g r0 = r0.f63052u
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L1b
                r0 = r10
                boolean r0 = r0.isShowing()
                r1 = 1
                if (r0 != r1) goto L1b
                goto Lb9
            L1b:
                r0 = r13
                Ne0.g r0 = r0.f63052u
                if (r0 != 0) goto La1
                r0 = r13
                android.content.Context r0 = r0.getContext()
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L87
                r0 = r8
                if (r0 == 0) goto L41
                r0 = r8
                java.lang.String r0 = r0.getDesc()
                r11 = r0
                r0 = r11
                r10 = r0
                r0 = r11
                if (r0 != 0) goto L44
            L41:
                java.lang.String r0 = ""
                r10 = r0
            L44:
                r0 = r8
                if (r0 == 0) goto L57
                r0 = r8
                com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType r0 = r0.getShowBubbleType()
                r12 = r0
                r0 = r12
                r11 = r0
                r0 = r12
                if (r0 != 0) goto L5c
            L57:
                com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType r0 = com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType.Unknown
                r11 = r0
            L5c:
                r0 = r8
                if (r0 == 0) goto L74
                r0 = r8
                java.lang.Integer r0 = r0.getDuration()
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L74
                r0 = r12
                int r0 = r0.intValue()
                r9 = r0
                goto L76
            L74:
                r0 = 5
                r9 = r0
            L76:
                Ne0.g r0 = new Ne0.g
                r1 = r0
                r2 = r14
                r3 = r10
                r4 = r11
                r5 = r9
                r1.<init>(r2, r3, r4, r5)
                r10 = r0
                goto L89
            L87:
                r0 = 0
                r10 = r0
            L89:
                r0 = r13
                r1 = r10
                r0.f63052u = r1
                r0 = r10
                if (r0 == 0) goto La1
                r0 = r10
                oe0.c r1 = new oe0.c
                r2 = r1
                r3 = r8
                r4 = r13
                r2.<init>(r3, r4)
                r0.f17155e = r1
            La1:
                r0 = r13
                Ne0.g r0 = r0.f63052u
                r8 = r0
                r0 = r8
                if (r0 == 0) goto Lb9
                r0 = r8
                r1 = r13
                com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget r1 = r1.f63048q
                r2 = r13
                com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget r2 = r2.f63049r
                r0.d(r1, r2)
            Lb9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment.h.a(com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig$NewThirdProjBubbleConfig):void");
        }
    }

    private ProjectionFullScreenFragment() {
        this.f63038f = "";
        this.f63045n = ViewConfiguration.getDoubleTapTimeout() + 100;
    }

    public /* synthetic */ ProjectionFullScreenFragment(int i7) {
        this();
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    @Nullable
    public final InterfaceC7845m M6() {
        return this.f63036d;
    }

    @Override // com.bilibili.lib.projection.internal.engine.IEngineDeviceChange
    public final void O8(boolean z6) {
        if (z6) {
            NewBubbleHelper.f63022m.onNext(NewBubbleHelper.NeedShowNewBubble.BACK_TO_FOREEND);
        } else {
            kf();
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    public final void Td(@NotNull ProjectionDialogFragment projectionDialogFragment) {
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final int getDialogViewRes() {
        return 2131492943;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    /* JADX INFO: renamed from: if */
    public final boolean mo6609if(@NotNull KeyEvent keyEvent) {
        InterfaceC7845m interfaceC7845m = this.f63036d;
        boolean z6 = false;
        if (interfaceC7845m != null) {
            z6 = false;
            if (interfaceC7845m.onKeyEvent(keyEvent)) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final void initView(@NotNull View view) {
        View view2;
        io.reactivex.rxjava3.subjects.a aVarF;
        Observable observableSwitchMap;
        Disposable disposableSubscribe;
        CompositeDisposable compositeDisposable;
        io.reactivex.rxjava3.subjects.a aVarF2;
        Observable observableSwitchMap2;
        Disposable disposableSubscribe2;
        CompositeDisposable compositeDisposable2;
        View view3;
        jf(this.f63039g);
        this.f63054w = new CompositeDisposable();
        View view4 = this.f63039g;
        this.f63047p = view4 != null ? (ProjectionNewUiTopBarWidget) view4.findViewById(2131307873) : null;
        View view5 = this.f63039g;
        this.f63048q = view5 != null ? (ProjectionNewUiDeviceInfoWidget) view5.findViewById(2131307870) : null;
        View view6 = this.f63039g;
        this.f63049r = view6 != null ? (ProjectionNewUiTvControlWidget) view6.findViewById(2131307874) : null;
        View view7 = this.f63039g;
        this.f63050s = view7 != null ? (ProjectionNewUiPlayControlWidget) view7.findViewById(2131307871) : null;
        View view8 = this.f63039g;
        this.f63051t = view8 != null ? view8.findViewById(2131307872) : null;
        ViewCompat.setOnApplyWindowInsetsListener(view, new Fr0.g(this));
        ViewCompat.requestApplyInsets(view);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            fragmentActivityP3 = null;
        }
        if (fragmentActivityP3 != null) {
            this.h = ScreenAdjustUtilsKt.windowSize(fragmentActivityP3);
            mf();
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new u(this, 6), 1, (Object) null);
        }
        ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget = this.f63048q;
        if (projectionNewUiDeviceInfoWidget != null) {
            projectionNewUiDeviceInfoWidget.setClickAction(new b(this));
        }
        View view9 = this.f63039g;
        if (view9 != null) {
            view9.setOnClickListener(new com.bilibili.bililive.biz.prop.h(this, 2));
        }
        ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget = this.f63047p;
        if (projectionNewUiTopBarWidget != null) {
            projectionNewUiTopBarWidget.setClickAction(new c(this));
        }
        ProjectionNewUiTvControlWidget projectionNewUiTvControlWidget = this.f63049r;
        if (projectionNewUiTvControlWidget != null) {
            projectionNewUiTvControlWidget.setClickAction(new d(this));
        }
        InterfaceC7845m interfaceC7845m = this.f63036d;
        if (interfaceC7845m != null ? interfaceC7845m.isGlobalLinkMode() : false) {
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget2 = this.f63048q;
            if (projectionNewUiDeviceInfoWidget2 != null) {
                projectionNewUiDeviceInfoWidget2.setSwitchDeviceVisible(false);
            }
            ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget2 = this.f63047p;
            if (projectionNewUiTopBarWidget2 != null && (view3 = projectionNewUiTopBarWidget2.f64013b) != null) {
                CommonDialogUtilsKt.setVisibility(view3, false);
            }
            InterfaceC7845m interfaceC7845m2 = this.f63036d;
            if (interfaceC7845m2 != null && (aVarF2 = interfaceC7845m2.f()) != null && (observableSwitchMap2 = aVarF2.switchMap(e.f63061a)) != null && (disposableSubscribe2 = observableSwitchMap2.subscribe(new f(this))) != null && (compositeDisposable2 = this.f63054w) != null) {
                compositeDisposable2.add(disposableSubscribe2);
            }
        } else {
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget3 = this.f63048q;
            if (projectionNewUiDeviceInfoWidget3 != null) {
                projectionNewUiDeviceInfoWidget3.setSwitchDeviceVisible(true);
            }
            ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget3 = this.f63047p;
            if (projectionNewUiTopBarWidget3 != null && (view2 = projectionNewUiTopBarWidget3.f64013b) != null) {
                CommonDialogUtilsKt.setVisibility(view2, true);
            }
            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget4 = this.f63048q;
            if (projectionNewUiDeviceInfoWidget4 != null) {
                projectionNewUiDeviceInfoWidget4.setBiLinkHighlight(false);
            }
        }
        InterfaceC7845m interfaceC7845m3 = this.f63036d;
        if (interfaceC7845m3 != null && (aVarF = interfaceC7845m3.f()) != null && (observableSwitchMap = aVarF.switchMap(new g(this))) != null && (disposableSubscribe = observableSwitchMap.subscribe(new a(this))) != null && (compositeDisposable = this.f63054w) != null) {
            compositeDisposable.add(disposableSubscribe);
        }
        Lazy lazy = he0.e.f120842a;
        InterfaceC7845m interfaceC7845m4 = this.f63036d;
        ProjectionClientConfig config = null;
        if (interfaceC7845m4 != null) {
            config = interfaceC7845m4.getConfig();
        }
        ProjectionOperationConfig projectionOperationConfigB = he0.e.b(String.valueOf(he0.e.f(config)));
        if (projectionOperationConfigB != null) {
            projectionOperationConfigB.getProjPage();
            projectionOperationConfigB.getThirdProjBubble();
        }
        NewBubbleHelper newBubbleHelper = this.f63046o;
        if (newBubbleHelper != null) {
            newBubbleHelper.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jf(View view) {
        InterfaceC7845m interfaceC7845m;
        if (view == 0) {
            return;
        }
        if ((view instanceof InterfaceC7755c) && (interfaceC7845m = this.f63036d) != null) {
            InterfaceC7755c interfaceC7755c = (InterfaceC7755c) view;
            interfaceC7755c.setPanelContext(this);
            interfaceC7755c.i(interfaceC7845m);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                jf(viewGroup.getChildAt(i7));
            }
        }
    }

    public final void kf() {
        C2728g c2728g = this.f63052u;
        if (c2728g != null) {
            c2728g.dismiss();
        }
        this.f63052u = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lf(View view) {
        InterfaceC7845m interfaceC7845m;
        if (view == 0) {
            return;
        }
        if ((view instanceof InterfaceC7755c) && (interfaceC7845m = this.f63036d) != null) {
            ((InterfaceC7755c) view).b(interfaceC7845m);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                lf(viewGroup.getChildAt(i7));
            }
        }
    }

    public final void mf() {
        WindowSizeClass windowSizeClass;
        View view = this.f63039g;
        if (view == null || (windowSizeClass = this.h) == null) {
            return;
        }
        i.a(view, windowSizeClass, this.f63040i, this.f63041j);
        ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget = this.f63047p;
        if (projectionNewUiTopBarWidget != null) {
            projectionNewUiTopBarWidget.setPadding(this.f63042k, projectionNewUiTopBarWidget.getPaddingTop(), this.f63043l, projectionNewUiTopBarWidget.getPaddingBottom());
        }
        ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget = this.f63050s;
        if (projectionNewUiPlayControlWidget != null) {
            projectionNewUiPlayControlWidget.setPadding(this.f63042k, projectionNewUiPlayControlWidget.getPaddingTop(), this.f63043l, projectionNewUiPlayControlWidget.getPaddingBottom());
        }
        View view2 = this.f63051t;
        if (view2 != null) {
            view2.setPadding(this.f63042k, view2.getPaddingTop(), this.f63043l, view2.getPaddingBottom());
        }
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 2131889147);
        C5323b.f63716a.b(this);
        Bundle arguments = getArguments();
        int i7 = 0;
        if (arguments != null) {
            i7 = arguments.getInt("bundle_client_id", 0);
        }
        this.f63037e = i7;
        Bundle arguments2 = getArguments();
        String string = "";
        if (arguments2 != null) {
            string = arguments2.getString("bundle_play_scene", "");
            if (string == null) {
                string = "";
            }
        }
        this.f63038f = string;
        this.f63036d = C7564c.f121625a.h(this.f63037e);
        NewBubbleHelper newBubbleHelper = new NewBubbleHelper(this.f63037e);
        newBubbleHelper.f63032j = new h(this);
        newBubbleHelper.f63025b = this.f63038f;
        this.f63046o = newBubbleHelper;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f63039g = viewOnCreateView;
        if (viewOnCreateView != null) {
            viewOnCreateView.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#000000"), Color.parseColor("#212224"), Color.parseColor("#212224"), Color.parseColor("#0c0c0e")}));
        }
        return this.f63039g;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        NewBubbleHelper newBubbleHelper = this.f63046o;
        if (newBubbleHelper != null) {
            newBubbleHelper.f63032j = null;
            CompositeDisposable compositeDisposable = newBubbleHelper.f63024a;
            if (compositeDisposable != null) {
                compositeDisposable.dispose();
            }
            newBubbleHelper.f63024a = null;
        }
        this.f63046o = null;
        synchronized (C5323b.f63716a) {
            C5323b.f63717b.remove(this);
        }
        super.onDestroy();
        lf(this.f63039g);
        CompositeDisposable compositeDisposable2 = this.f63054w;
        if (compositeDisposable2 != null) {
            compositeDisposable2.dispose();
        }
        this.f63054w = null;
        kf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        HandlerThreads.postDelayed(0, new v(this, 2), 800L);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.clearFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        super.onStop();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        boolean zIsNormal = KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(fragmentActivityP3));
        BLog.i("ProjectionFullScreenFragment", "show: normal=" + zIsNormal + " set orientation=" + (!zIsNormal ? -1 : 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void showPanel(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.control.ProjectionFullScreenFragment.showPanel(java.lang.String):void");
    }
}
