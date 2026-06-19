package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.y;
import Me0.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionPlayPauseWidget;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionPlayPauseWidget.class */
public final class ProjectionPlayPauseWidget extends AppCompatImageView implements View.OnClickListener, InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f63955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f63956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63957d;

    public ProjectionPlayPauseWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63956c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63956c = null;
        this.f63957d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        setOnClickListener(this);
        this.f63957d = interfaceC7845m2;
        this.f63956c = interfaceC7845m2.f().switchMap(new y(this)).doOnDispose(new Action(this) { // from class: Me0.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionPlayPauseWidget f16159a;

            {
                this.f16159a = this;
            }

            public final void run() {
                this.f16159a.f63955b = null;
            }
        }).subscribe(new z(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        a aVarS;
        com.bilibili.lib.projection.internal.reporter.a reporter2;
        a aVarS2;
        com.bilibili.lib.projection.internal.reporter.a reporter3;
        a aVar = this.f63955b;
        if (aVar == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m = this.f63957d;
        IProjectionItem iProjectionItemN = null;
        if (interfaceC7845m != null && (reporter3 = interfaceC7845m.getReporter()) != null) {
            InterfaceC7845m client = aVar.getClient();
            IProjectionItem iProjectionItemN2 = client != null ? client.n(true) : null;
            reporter3.D(iProjectionItemN2 instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN2 : null, aVar.getDevice(), 2);
        }
        if (this.f63954a) {
            aVar.replay();
            setImageLevel(0);
            InterfaceC7845m interfaceC7845m2 = this.f63957d;
            if (interfaceC7845m2 == null || (reporter2 = interfaceC7845m2.getReporter()) == null) {
                return;
            }
            ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
            ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.ReplayButton;
            InterfaceC7845m interfaceC7845m3 = this.f63957d;
            ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS2 = interfaceC7845m3.s()) == null) ? null : aVarS2.getDevice();
            InterfaceC7845m interfaceC7845m4 = this.f63957d;
            IProjectionItem iProjectionItemN3 = null;
            if (interfaceC7845m4 != null) {
                iProjectionItemN3 = interfaceC7845m4.n(true);
            }
            reporter2.o(panelMode, controlPageButtonType, device, iProjectionItemN3);
            return;
        }
        if (aVar.getDevice().getPlayerState() == ProjectionDeviceInternal.PlayerState.PLAYING) {
            aVar.getDevice().pause();
        } else {
            aVar.getDevice().resume();
        }
        InterfaceC7845m interfaceC7845m5 = this.f63957d;
        if (interfaceC7845m5 == null || (reporter = interfaceC7845m5.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode2 = ProjectionReporter.PanelMode.Full;
        ProjectionReporter.ControlPageButtonType controlPageButtonType2 = ProjectionReporter.ControlPageButtonType.PlayPauseButton;
        InterfaceC7845m interfaceC7845m6 = this.f63957d;
        ProjectionDeviceInternal device2 = (interfaceC7845m6 == null || (aVarS = interfaceC7845m6.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m7 = this.f63957d;
        if (interfaceC7845m7 != null) {
            iProjectionItemN = interfaceC7845m7.n(true);
        }
        reporter.o(panelMode2, controlPageButtonType2, device2, iProjectionItemN);
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
