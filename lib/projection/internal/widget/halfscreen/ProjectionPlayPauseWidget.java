package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.p;
import Qe0.q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.projectionitem.NoItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.halfscreen.ProjectionPlayPauseWidget;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7756d;
import kotlinx.coroutines.flow.MutableSharedFlow;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionPlayPauseWidget.class */
public final class ProjectionPlayPauseWidget extends AppCompatImageView implements View.OnClickListener, InterfaceC7756d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f64081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f64082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64083d;

    public ProjectionPlayPauseWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m.a aVar) {
        Disposable disposable = this.f64082c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f64082c = null;
        this.f64083d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        setOnClickListener(this);
        this.f64083d = aVar2.getContainer().getClient();
        this.f64082c = aVar2.getContainer().getClient().f().switchMap(new p(this)).doOnDispose(new Action(this) { // from class: Qe0.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionPlayPauseWidget f19908a;

            {
                this.f19908a = this;
            }

            public final void run() {
                this.f19908a.f64081b = null;
            }
        }).subscribe(new q(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MutableSharedFlow<ProjectionClient.PlayEvent> mutableSharedFlowM;
        com.bilibili.lib.projection.internal.reporter.a reporter;
        a aVarS;
        MutableSharedFlow<ProjectionClient.PlayEvent> mutableSharedFlowM2;
        MutableSharedFlow<ProjectionClient.PlayEvent> mutableSharedFlowM3;
        com.bilibili.lib.projection.internal.reporter.a reporter2;
        a aVarS2;
        com.bilibili.lib.projection.internal.reporter.a reporter3;
        a aVar = this.f64081b;
        if (aVar == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m = this.f64083d;
        IProjectionItem iProjectionItemN = null;
        if (interfaceC7845m != null && (reporter3 = interfaceC7845m.getReporter()) != null) {
            InterfaceC7845m client = aVar.getClient();
            IProjectionItem iProjectionItemN2 = client != null ? client.n(true) : null;
            reporter3.D(iProjectionItemN2 instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN2 : null, aVar.getDevice(), 1);
        }
        if (!this.f64080a) {
            if (aVar.getDevice().getPlayerState() == ProjectionDeviceInternal.PlayerState.PLAYING) {
                aVar.getDevice().pause();
                InterfaceC7845m interfaceC7845m2 = this.f64083d;
                if (interfaceC7845m2 != null && (mutableSharedFlowM2 = interfaceC7845m2.m()) != null) {
                    mutableSharedFlowM2.tryEmit(ProjectionClient.PlayEvent.PAUSE);
                }
            } else {
                aVar.getDevice().resume();
                InterfaceC7845m interfaceC7845m3 = this.f64083d;
                if (interfaceC7845m3 != null && (mutableSharedFlowM = interfaceC7845m3.m()) != null) {
                    mutableSharedFlowM.tryEmit(ProjectionClient.PlayEvent.PLAY);
                }
            }
            InterfaceC7845m interfaceC7845m4 = this.f64083d;
            if (interfaceC7845m4 == null || (reporter = interfaceC7845m4.getReporter()) == null) {
                return;
            }
            ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
            ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.PlayPauseButton;
            InterfaceC7845m interfaceC7845m5 = this.f64083d;
            ProjectionDeviceInternal device = (interfaceC7845m5 == null || (aVarS = interfaceC7845m5.s()) == null) ? null : aVarS.getDevice();
            InterfaceC7845m interfaceC7845m6 = this.f64083d;
            IProjectionItem iProjectionItemN3 = null;
            if (interfaceC7845m6 != null) {
                iProjectionItemN3 = interfaceC7845m6.n(true);
            }
            reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN3);
            return;
        }
        if (aVar.getDevice().E()) {
            InterfaceC7845m interfaceC7845m7 = this.f64083d;
            if (interfaceC7845m7 != null) {
                DefaultProjectionEngineManager defaultProjectionEngineManagerD = aVar.getService().d();
                IProjectionItem iProjectionItemN4 = interfaceC7845m7.n(true);
                IProjectionItem iProjectionItem = iProjectionItemN4;
                if (iProjectionItemN4 == null) {
                    iProjectionItem = NoItem.f63473a;
                }
                defaultProjectionEngineManagerD.q(iProjectionItem, interfaceC7845m7);
            }
        } else {
            aVar.replay();
            InterfaceC7845m interfaceC7845m8 = this.f64083d;
            if (interfaceC7845m8 != null && (mutableSharedFlowM3 = interfaceC7845m8.m()) != null) {
                mutableSharedFlowM3.tryEmit(ProjectionClient.PlayEvent.REPLAY);
            }
        }
        InterfaceC7845m interfaceC7845m9 = this.f64083d;
        if (interfaceC7845m9 == null || (reporter2 = interfaceC7845m9.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode2 = ProjectionReporter.PanelMode.Half;
        ProjectionReporter.ControlPageButtonType controlPageButtonType2 = ProjectionReporter.ControlPageButtonType.ReplayButton;
        InterfaceC7845m interfaceC7845m10 = this.f64083d;
        ProjectionDeviceInternal device2 = (interfaceC7845m10 == null || (aVarS2 = interfaceC7845m10.s()) == null) ? null : aVarS2.getDevice();
        InterfaceC7845m interfaceC7845m11 = this.f64083d;
        if (interfaceC7845m11 != null) {
            iProjectionItemN = interfaceC7845m11.n(true);
        }
        reporter2.o(panelMode2, controlPageButtonType2, device2, iProjectionItemN);
    }
}
