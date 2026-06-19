package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.InterfaceC2645a;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import he0.k;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionDurationTextWidget.class */
public final class ProjectionDurationTextWidget extends AppCompatTextView implements InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f63926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f63927b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionDurationTextWidget$a.class */
    public static final class a implements InterfaceC2645a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionDurationTextWidget f63928a;

        public a(ProjectionDurationTextWidget projectionDurationTextWidget) {
            this.f63928a = projectionDurationTextWidget;
        }

        @Override // Me0.InterfaceC2645a
        public final void a(int i7, int i8) {
            String strA = k.a(i8);
            String str = strA;
            if (TextUtils.isEmpty(strA)) {
                str = "00:00";
            }
            this.f63928a.setText(str);
        }
    }

    public ProjectionDurationTextWidget(@NotNull Context context) {
        super(context);
        this.f63927b = new a(this);
    }

    public ProjectionDurationTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63927b = new a(this);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget;
        InterfaceC5317a interfaceC5317a = this.f63926a;
        if (interfaceC5317a != null && (projectionFullScreenSeekWidget = (ProjectionFullScreenSeekWidget) interfaceC5317a.Y4()) != null) {
            a aVar = this.f63927b;
            if (projectionFullScreenSeekWidget.f63943m.contains(aVar)) {
                projectionFullScreenSeekWidget.f63943m.remove(aVar);
            }
        }
        this.f63926a = null;
    }

    @Override // ke0.InterfaceC7753a
    public final /* bridge */ /* synthetic */ void i(InterfaceC7845m interfaceC7845m) {
    }

    @Override // ke0.InterfaceC7755c
    public void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
        ProjectionFullScreenSeekWidget projectionFullScreenSeekWidget;
        this.f63926a = interfaceC5317a;
        if (interfaceC5317a == null || (projectionFullScreenSeekWidget = (ProjectionFullScreenSeekWidget) interfaceC5317a.Y4()) == null) {
            return;
        }
        a aVar = this.f63927b;
        if (projectionFullScreenSeekWidget.f63943m.contains(aVar)) {
            return;
        }
        projectionFullScreenSeekWidget.f63943m.add(aVar);
    }
}
