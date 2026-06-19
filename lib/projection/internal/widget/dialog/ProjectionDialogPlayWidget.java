package com.bilibili.lib.projection.internal.widget.dialog;

import Ke0.c;
import Ke0.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogPlayWidget;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7754b;
import kotlin.jvm.JvmOverloads;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogPlayWidget.class */
public final class ProjectionDialogPlayWidget extends AppCompatImageView implements InterfaceC7754b, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f63881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f63882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63883d;

    @JvmOverloads
    public ProjectionDialogPlayWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionDialogPlayWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionDialogPlayWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63882c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63882c = null;
        this.f63883d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        setOnClickListener(this);
        this.f63883d = interfaceC7845m2;
        this.f63882c = interfaceC7845m2.f().switchMap(new c(this)).doOnDispose(new Action(this) { // from class: Ke0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionDialogPlayWidget f12784a;

            {
                this.f12784a = this;
            }

            public final void run() {
                this.f12784a.f63881b = null;
            }
        }).subscribe(new d(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        a aVar = this.f63881b;
        if (aVar == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m = this.f63883d;
        if (interfaceC7845m != null && (reporter = interfaceC7845m.getReporter()) != null) {
            InterfaceC7845m client = aVar.getClient();
            StandardProjectionItem standardProjectionItem = null;
            IProjectionItem iProjectionItemN = client != null ? client.n(true) : null;
            if (iProjectionItemN instanceof StandardProjectionItem) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            reporter.D(standardProjectionItem, aVar.getDevice(), 2);
        }
        if (this.f63880a) {
            aVar.replay();
            setImageLevel(0);
        } else if (aVar.getDevice().getPlayerState() == ProjectionDeviceInternal.PlayerState.PLAYING) {
            aVar.getDevice().pause();
        } else {
            aVar.getDevice().resume();
        }
    }
}
