package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.AbstractC8618a;
import sr0.C8623f;
import sr0.InterfaceC8621d;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbstractC8618a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f81076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel f81077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f81079g;

    public a(@NotNull Context context, @NotNull CommandsPanel.Panel panel, @NotNull InterfaceC8621d interfaceC8621d) {
        super(context);
        this.f81076d = context;
        this.f81077e = panel;
        this.f81078f = interfaceC8621d;
    }

    @Override // sr0.AbstractC8618a
    public final void a() {
        super.a();
        LinearLayout mContainer = getMContainer();
        if (mContainer != null) {
            mContainer.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, NewPlayerUtilsKt.toPx(10.0f));
        f fVar = new f(this.f81076d, this.f81077e, this.f81078f);
        this.f81079g = fVar;
        LinearLayout mContainer2 = getMContainer();
        if (mContainer2 != null) {
            mContainer2.addView(fVar, layoutParams);
        }
        C8623f c8623f = new C8623f(this.f81077e.getTipsBelow(), this.f81076d);
        LinearLayout mContainer3 = getMContainer();
        if (mContainer3 != null) {
            mContainer3.addView(c8623f);
        }
    }

    @Override // sr0.AbstractC8618a
    public final void b(boolean z6) {
        f fVar;
        if (!z6 || (fVar = this.f81079g) == null) {
            return;
        }
        fVar.e();
    }

    @Override // sr0.AbstractC8618a
    public final void c() {
        super.c();
        this.f81079g = null;
        setMContainer(null);
    }
}
