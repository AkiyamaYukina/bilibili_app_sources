package com.bilibili.lib.projection.internal.widget.fullscreen;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionGlobalLinkModeFullScreenWidget.class */
public final class ProjectionGlobalLinkModeFullScreenWidget extends FrameLayout implements InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ImageView f63948a;

    public ProjectionGlobalLinkModeFullScreenWidget(@NotNull Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496551, (ViewGroup) this, false);
        this.f63948a = (ImageView) viewInflate.findViewById(2131302257);
        addView(viewInflate);
    }

    public ProjectionGlobalLinkModeFullScreenWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496551, (ViewGroup) this, false);
        this.f63948a = (ImageView) viewInflate.findViewById(2131302257);
        addView(viewInflate);
    }

    @Override // ke0.InterfaceC7753a
    public final /* bridge */ /* synthetic */ void b(InterfaceC7845m interfaceC7845m) {
    }

    public final void g(boolean z6) {
        if (z6) {
            ImageView imageView = this.f63948a;
            if (imageView != null) {
                imageView.setImageResource(2131238612);
            }
            ImageView imageView2 = this.f63948a;
            if (imageView2 != null) {
                imageView2.clearColorFilter();
                return;
            }
            return;
        }
        ImageView imageView3 = this.f63948a;
        if (imageView3 != null) {
            imageView3.setImageResource(2131238613);
        }
        ImageView imageView4 = this.f63948a;
        if (imageView4 != null) {
            imageView4.setColorFilter(-1);
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        CommonDialogUtilsKt.setVisibility(this, interfaceC7845m2.isGlobalLinkMode() && interfaceC7845m2.getClientType() != 4);
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
