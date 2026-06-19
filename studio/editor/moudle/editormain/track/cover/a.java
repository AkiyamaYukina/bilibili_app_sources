package com.bilibili.studio.editor.moudle.editormain.track.cover;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/a.class */
public final class a extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC1189a f106160a;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.track.cover.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/a$a.class */
    public interface InterfaceC1189a {
        void a(@NotNull Canvas canvas);
    }

    public a(@NotNull Context context) {
        super(context, null, -1);
    }

    @Nullable
    public final InterfaceC1189a getOnDrawListener() {
        return this.f106160a;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        InterfaceC1189a interfaceC1189a = this.f106160a;
        if (interfaceC1189a != null) {
            interfaceC1189a.a(canvas);
        }
    }

    public final void setOnDrawListener(@Nullable InterfaceC1189a interfaceC1189a) {
        this.f106160a = interfaceC1189a;
    }
}
