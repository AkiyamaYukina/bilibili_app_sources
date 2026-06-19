package com.bilibili.lib.projection.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ke0.InterfaceC7756d;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/ProjectionGlobalLinkModeWidget.class */
public final class ProjectionGlobalLinkModeWidget extends FrameLayout implements InterfaceC7756d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ImageView f63846a;

    public ProjectionGlobalLinkModeWidget(@NotNull Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496551, (ViewGroup) this, false);
        this.f63846a = (ImageView) viewInflate.findViewById(2131302257);
        addView(viewInflate);
    }

    public ProjectionGlobalLinkModeWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131496551, (ViewGroup) this, false);
        this.f63846a = (ImageView) viewInflate.findViewById(2131302257);
        addView(viewInflate);
    }

    @Override // ke0.InterfaceC7753a
    public final /* bridge */ /* synthetic */ void b(InterfaceC7845m.a aVar) {
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        CommonDialogUtilsKt.setVisibility(this, aVar2.getContainer().getClient().isGlobalLinkMode() && aVar2.getContainer().getClient().getClientType() != 4);
    }
}
