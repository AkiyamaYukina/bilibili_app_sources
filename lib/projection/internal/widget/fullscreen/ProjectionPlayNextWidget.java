package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.v;
import Me0.w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.NoItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionPlayNextWidget;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7755c;
import kotlin.jvm.internal.Intrinsics;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionPlayNextWidget.class */
public final class ProjectionPlayNextWidget extends AppCompatImageView implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63949d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Disposable f63951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63952c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionPlayNextWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionPlayNextWidget f63953a;

        public a(ProjectionPlayNextWidget projectionPlayNextWidget) {
            this.f63953a = projectionPlayNextWidget;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            InterfaceC7845m interfaceC7845m;
            C7838f.a aVarI;
            ProjectionDataSource projectionDataSourceB;
            C7838f.a aVarI2;
            ProjectionPlayNextWidget projectionPlayNextWidget = this.f63953a;
            InterfaceC7845m interfaceC7845m2 = projectionPlayNextWidget.f63952c;
            int currentIndex = (interfaceC7845m2 == null || (aVarI2 = interfaceC7845m2.i()) == null) ? 0 : aVarI2.getCurrentIndex();
            InterfaceC7845m interfaceC7845m3 = projectionPlayNextWidget.f63952c;
            ProjectionDataSource.b next = (interfaceC7845m3 == null || (aVarI = interfaceC7845m3.i()) == null || (projectionDataSourceB = aVarI.b()) == null) ? null : projectionDataSourceB.next(currentIndex);
            if (next == null || (interfaceC7845m = projectionPlayNextWidget.f63952c) == null) {
                return;
            }
            ProjectionClient.play$default(interfaceC7845m, next.f62997a, 0L, false, false, false, null, 62, null);
        }
    }

    public ProjectionPlayNextWidget(@NotNull Context context) {
        super(context);
    }

    public ProjectionPlayNextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63951b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63951b = null;
        this.f63952c = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        setVisibility(8);
        this.f63952c = interfaceC7845m2;
        this.f63951b = interfaceC7845m2.f().switchMap(new v(this)).doOnDispose(new Action(this) { // from class: Me0.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionPlayNextWidget f16156a;

            {
                this.f16156a = this;
            }

            public final void run() {
                int i7 = ProjectionPlayNextWidget.f63949d;
                this.f16156a.getClass();
            }
        }).subscribe(new w(this));
        q();
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        C7564c.f121625a.j(new a(this));
    }

    public final void q() {
        int i7;
        C7838f.a aVarI;
        ProjectionDataSource projectionDataSourceB;
        C7838f.a aVarI2;
        C7838f.a aVarI3;
        InterfaceC7845m interfaceC7845m = this.f63952c;
        IProjectionPlayableItem iProjectionPlayableItemA = (interfaceC7845m == null || (aVarI3 = interfaceC7845m.i()) == null) ? null : aVarI3.a();
        InterfaceC7845m interfaceC7845m2 = this.f63952c;
        int currentIndex = (interfaceC7845m2 == null || (aVarI2 = interfaceC7845m2.i()) == null) ? 0 : aVarI2.getCurrentIndex();
        if (iProjectionPlayableItemA == null || Intrinsics.areEqual(iProjectionPlayableItemA, NoItem.f63473a)) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else {
            InterfaceC7845m interfaceC7845m3 = this.f63952c;
            if (((interfaceC7845m3 == null || (aVarI = interfaceC7845m3.i()) == null || (projectionDataSourceB = aVarI.b()) == null) ? null : projectionDataSourceB.next(currentIndex)) != null) {
                ViewParent parent2 = getParent();
                ViewGroup viewGroup2 = null;
                if (parent2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent2;
                }
                i7 = 0;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                    i7 = 0;
                }
                setVisibility(i7);
            }
            ViewParent parent3 = getParent();
            ViewGroup viewGroup3 = null;
            if (parent3 instanceof ViewGroup) {
                viewGroup3 = (ViewGroup) parent3;
            }
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
        i7 = 8;
        setVisibility(i7);
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
