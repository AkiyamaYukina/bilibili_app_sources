package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2730i;
import Oe0.InterfaceC2755a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.api.BiligameApiService;
import com.bilibili.biligame.api.user.FollowUser;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.minev3.child.UserFollowListFragment;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionGlobalLinkModeFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiDeviceInfoWidget.class */
public final class ProjectionNewUiDeviceInfoWidget extends FrameLayout implements InterfaceC7755c, InterfaceC2755a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f63976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f63977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ProjectionGlobalLinkModeFullScreenWidget f63978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final View f63979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f63980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63981f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiDeviceInfoWidget$a.class */
    public interface a {
        void a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiDeviceInfoWidget$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63982a;

        static {
            int[] iArr = new int[ShowBubbleType.values().length];
            try {
                iArr[ShowBubbleType.SwitchDevice.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f63982a = iArr;
        }
    }

    public ProjectionNewUiDeviceInfoWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionNewUiDeviceInfoWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, 2131495224, this);
        this.f63976a = (TextView) findViewById(2131309503);
        View viewFindViewById = findViewById(2131309516);
        this.f63977b = viewFindViewById;
        this.f63978c = (ProjectionGlobalLinkModeFullScreenWidget) findViewById(2131309470);
        this.f63979d = findViewById(2131309491);
        if (viewFindViewById != null) {
            final int i7 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Ne0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f17162a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f17163b;

                {
                    this.f17162a = i7;
                    this.f17163b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.bilibili.lib.projection.internal.reporter.a reporter;
                    com.bilibili.lib.projection.internal.device.a aVarS;
                    switch (this.f17162a) {
                        case 0:
                            ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget = (ProjectionNewUiDeviceInfoWidget) this.f17163b;
                            ProjectionNewUiDeviceInfoWidget.a aVar = projectionNewUiDeviceInfoWidget.f63980e;
                            if (aVar != null) {
                                aVar.a();
                            }
                            InterfaceC7845m interfaceC7845m = projectionNewUiDeviceInfoWidget.f63981f;
                            if (interfaceC7845m != null && (reporter = interfaceC7845m.getReporter()) != null) {
                                ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
                                ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.SwitchDeviceButton;
                                InterfaceC7845m interfaceC7845m2 = projectionNewUiDeviceInfoWidget.f63981f;
                                ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
                                InterfaceC7845m interfaceC7845m3 = projectionNewUiDeviceInfoWidget.f63981f;
                                reporter.o(panelMode, controlPageButtonType, device, interfaceC7845m3 != null ? interfaceC7845m3.n(true) : null);
                                break;
                            }
                            break;
                        default:
                            UserFollowListFragment userFollowListFragment = (UserFollowListFragment) this.f17163b;
                            userFollowListFragment.getClass();
                            Object tag = view.getTag();
                            if (tag != null && (tag instanceof FollowUser)) {
                                FollowUser followUser = (FollowUser) tag;
                                if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                                    ToastHelper.showToastShort(userFollowListFragment.getContext(), 2131823722);
                                } else {
                                    int i8 = followUser.attribute == 0 ? 1 : 2;
                                    TintProgressDialog tintProgressDialogShow = TintProgressDialog.show(userFollowListFragment.getContext(), null, userFollowListFragment.getString(2131823386), true, false);
                                    BiligameApiService apiService = userFollowListFragment.getApiService();
                                    long j7 = followUser.mid;
                                    int i9 = userFollowListFragment.c == 1 ? 93 : 92;
                                    ReporterV3 reporterV3 = ReporterV3.INSTANCE;
                                    userFollowListFragment.processCall(1, apiService.modifyFollowStatus(j7, i8, i9, reporterV3.getSCurrentSpmId(), reporterV3.getSSpmIdFrom(), "")).enqueue(new UserFollowListFragment.a(userFollowListFragment, tintProgressDialogShow, followUser, i8));
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
    }

    @Override // Oe0.InterfaceC2755a
    @Nullable
    public final View g(@NotNull ShowBubbleType showBubbleType) {
        return b.f63982a[showBubbleType.ordinal()] == 1 ? this.f63977b : null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        io.reactivex.rxjava3.subjects.a aVarF;
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        this.f63981f = interfaceC7845m2;
        if (interfaceC7845m2 == null || (aVarF = interfaceC7845m2.f()) == null) {
            return;
        }
        aVarF.subscribe(new C2730i(this));
    }

    public final void setBiLinkHighlight(boolean z6) {
        ProjectionGlobalLinkModeFullScreenWidget projectionGlobalLinkModeFullScreenWidget = this.f63978c;
        if (projectionGlobalLinkModeFullScreenWidget != null) {
            projectionGlobalLinkModeFullScreenWidget.g(z6);
        }
        View view = this.f63979d;
        if (view != null) {
            CommonDialogUtilsKt.setVisibility(view, z6);
        }
    }

    public final void setClickAction(@NotNull a aVar) {
        this.f63980e = aVar;
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }

    public final void setSwitchDeviceVisible(boolean z6) {
        if (z6) {
            View view = this.f63977b;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f63977b;
        if (view2 != null) {
            view2.setVisibility(4);
        }
    }
}
