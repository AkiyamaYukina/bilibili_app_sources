package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2720M;
import Ne0.C2721N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionPlayNextTextWidget;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7755c;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionPlayNextTextWidget.class */
public final class ProjectionPlayNextTextWidget extends AppCompatTextView implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f64031d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f64032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f64033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64034c;

    public ProjectionPlayNextTextWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionPlayNextTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() {
        /*
            r3 = this;
            r0 = r3
            le0.m r0 = r0.f64034c
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            le0.f$a r0 = r0.i()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem r0 = r0.a()
            r6 = r0
            goto L21
        L1f:
            r0 = 0
            r6 = r0
        L21:
            r0 = r3
            le0.m r0 = r0.f64034c
            r8 = r0
            r0 = 0
            r5 = r0
            r0 = r8
            if (r0 == 0) goto L45
            r0 = r8
            le0.f$a r0 = r0.i()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L45
            r0 = r8
            int r0 = r0.getCurrentIndex()
            r4 = r0
            goto L47
        L45:
            r0 = 0
            r4 = r0
        L47:
            r0 = r6
            if (r0 == 0) goto L93
            r0 = r6
            com.bilibili.lib.projection.internal.projectionitem.NoItem r1 = com.bilibili.lib.projection.internal.projectionitem.NoItem.f63473a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L93
            r0 = r3
            le0.m r0 = r0.f64034c
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L8a
            r0 = r8
            le0.f$a r0 = r0.i()
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L8a
            r0 = r8
            com.bilibili.lib.projection.datasource.ProjectionDataSource r0 = r0.b()
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L8a
            r0 = r8
            r1 = r4
            com.bilibili.lib.projection.datasource.ProjectionDataSource$b r0 = r0.next(r1)
            r6 = r0
        L8a:
            r0 = r6
            if (r0 == 0) goto L93
            r0 = r5
            r4 = r0
            goto L96
        L93:
            r0 = 8
            r4 = r0
        L96:
            r0 = r3
            r1 = r4
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionPlayNextTextWidget.J():void");
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f64033b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f64033b = null;
        this.f64034c = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        setVisibility(8);
        this.f64034c = interfaceC7845m2;
        this.f64033b = interfaceC7845m2.f().switchMap(new C2720M(this)).doOnDispose(new Action(this) { // from class: Ne0.L

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionPlayNextTextWidget f17126a;

            {
                this.f17126a = this;
            }

            public final void run() {
                int i7 = ProjectionPlayNextTextWidget.f64031d;
                this.f17126a.getClass();
            }
        }).subscribe(new C2721N(this));
        J();
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        InterfaceC7845m interfaceC7845m;
        ProjectionClient.ClientCallback callback;
        C7838f.a aVarI;
        ProjectionDataSource projectionDataSourceB;
        C7838f.a aVarI2;
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        InterfaceC7845m interfaceC7845m2 = this.f64034c;
        if (interfaceC7845m2 != null && (reporter = interfaceC7845m2.getReporter()) != null) {
            ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
            ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.NextSelectionButton;
            InterfaceC7845m interfaceC7845m3 = this.f64034c;
            ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
            InterfaceC7845m interfaceC7845m4 = this.f64034c;
            reporter.o(panelMode, controlPageButtonType, device, interfaceC7845m4 != null ? interfaceC7845m4.n(true) : null);
        }
        InterfaceC7845m interfaceC7845m5 = this.f64034c;
        int currentIndex = (interfaceC7845m5 == null || (aVarI2 = interfaceC7845m5.i()) == null) ? 0 : aVarI2.getCurrentIndex();
        InterfaceC7845m interfaceC7845m6 = this.f64034c;
        ProjectionDataSource.b next = (interfaceC7845m6 == null || (aVarI = interfaceC7845m6.i()) == null || (projectionDataSourceB = aVarI.b()) == null) ? null : projectionDataSourceB.next(currentIndex);
        if (next != null) {
            InterfaceC7845m interfaceC7845m7 = this.f64034c;
            int i7 = next.f62997a;
            IProjectionItem iProjectionItemP = null;
            if (interfaceC7845m7 != null) {
                iProjectionItemP = interfaceC7845m7.p(i7);
            }
            if (iProjectionItemP != null && (interfaceC7845m = this.f64034c) != null && (callback = interfaceC7845m.getCallback()) != null) {
                callback.onItemChange(iProjectionItemP, i7, true);
            }
            InterfaceC7845m interfaceC7845m8 = this.f64034c;
            if (interfaceC7845m8 != null) {
                ProjectionClient.play$default(interfaceC7845m8, next.f62997a, 0L, false, false, false, null, 62, null);
            }
        }
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
