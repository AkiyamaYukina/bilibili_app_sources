package com.bilibili.studio.videoeditor.widgets.track.cover;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/a.class */
public final class a extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC1212a f110505a;

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.widgets.track.cover.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/a$a.class */
    public interface InterfaceC1212a {
        void onDraw();
    }

    public a(@NotNull Context context) {
        super(context, null, -1);
    }

    @Nullable
    public final InterfaceC1212a getOnDrawListener() {
        return this.f110505a;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC1212a interfaceC1212a = this.f110505a;
        if (interfaceC1212a != null) {
            interfaceC1212a.onDraw();
        }
    }

    public final void setOnDrawListener(@Nullable InterfaceC1212a interfaceC1212a) {
        this.f110505a = interfaceC1212a;
    }
}
