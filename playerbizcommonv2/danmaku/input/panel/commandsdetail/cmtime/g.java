package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import xr0.C9001a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/g.class */
@StabilityInferred(parameters = 0)
public final class g extends FrameLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<View> f81040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LinearLayout f81041b;

    public g(@NotNull Context context, @NotNull List<View> list) {
        super(context);
        this.f81040a = list;
        FrameLayout.inflate(context, 2131496301, this);
        this.f81041b = (LinearLayout) findViewById(2131303528);
    }

    @Override // sr0.InterfaceC8622e
    public final boolean c() {
        return true;
    }

    @Override // sr0.InterfaceC8622e
    public final void onAttach() {
        LinearLayout linearLayout = this.f81041b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            for (View view : this.f81040a) {
                linearLayout.addView(view);
                C9001a.f(view, null, Integer.valueOf(NewPlayerUtilsKt.toPx(10)), null, 13);
            }
        }
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
    }
}
