package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget;
import he0.k;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiDurationTextWidget.class */
public final class ProjectionNewUiDurationTextWidget extends AppCompatTextView implements InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f63983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f63984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63985c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiDurationTextWidget$a.class */
    public static final class a implements ProjectionSeekBarWidget.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionNewUiDurationTextWidget f63986a;

        public a(ProjectionNewUiDurationTextWidget projectionNewUiDurationTextWidget) {
            this.f63986a = projectionNewUiDurationTextWidget;
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget.a
        public final void a(int i7, int i8) {
            String strA = k.a(i8);
            String str = strA;
            if (TextUtils.isEmpty(strA)) {
                str = "00:00";
            }
            this.f63986a.setText(str);
        }
    }

    public ProjectionNewUiDurationTextWidget(@NotNull Context context) {
        super(context);
        this.f63984b = new a(this);
    }

    public ProjectionNewUiDurationTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63984b = new a(this);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        ProjectionSeekBarWidget projectionSeekBarWidget;
        InterfaceC5317a interfaceC5317a = this.f63983a;
        if (interfaceC5317a != null && (projectionSeekBarWidget = (ProjectionSeekBarWidget) interfaceC5317a.Y4()) != null) {
            a aVar = this.f63984b;
            if (projectionSeekBarWidget.f64045l.contains(aVar)) {
                projectionSeekBarWidget.f64045l.remove(aVar);
            }
        }
        this.f63985c = false;
        this.f63983a = null;
    }

    @Override // ke0.InterfaceC7753a
    public final /* bridge */ /* synthetic */ void i(InterfaceC7845m interfaceC7845m) {
    }

    @Override // ke0.InterfaceC7755c
    public void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
        ProjectionSeekBarWidget projectionSeekBarWidget;
        this.f63983a = interfaceC5317a;
        if (interfaceC5317a == null || (projectionSeekBarWidget = (ProjectionSeekBarWidget) interfaceC5317a.Y4()) == null) {
            return;
        }
        a aVar = this.f63984b;
        if (!projectionSeekBarWidget.f64045l.contains(aVar)) {
            projectionSeekBarWidget.f64045l.add(aVar);
        }
        this.f63985c = true;
    }
}
