package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/m.class */
final class m {
    private final View a(Context context) {
        InlineGestureSeekBarContainer inlineGestureSeekBarContainer = new InlineGestureSeekBarContainer(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, Uj0.c.b(2, context));
        layoutParams.gravity = 80;
        inlineGestureSeekBarContainer.setLayoutParams(layoutParams);
        inlineGestureSeekBarContainer.setId(r.f70971b);
        return inlineGestureSeekBarContainer;
    }

    private final View b(Context context) {
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayout = new CardFragmentPlayerContainerLayout(context);
        cardFragmentPlayerContainerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cardFragmentPlayerContainerLayout.setId(r.n());
        return cardFragmentPlayerContainerLayout;
    }

    @NotNull
    public final View c(@NotNull Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(b(context));
        frameLayout.addView(a(context));
        return frameLayout;
    }

    public final void d(@NotNull View view) {
    }
}
