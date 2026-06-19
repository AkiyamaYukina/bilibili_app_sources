package com.bilibili.playerbizcommon.input.panels.commandsdetail.mark;

import Fq0.f;
import Fq0.h;
import android.content.Context;
import android.widget.LinearLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/a.class */
public final class a extends Fq0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f80136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel f80137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f f80138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public e f80139f;

    public a(@NotNull Context context, @NotNull CommandsPanel.Panel panel, @NotNull f fVar) {
        super(context);
        this.f80136c = context;
        this.f80137d = panel;
        this.f80138e = fVar;
    }

    @Override // Fq0.b
    public final void a() {
        LinearLayout mContainer = getMContainer();
        if (mContainer != null) {
            mContainer.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, NewPlayerUtilsKt.toPx(10.0f));
        e eVar = new e(this.f80136c, this.f80137d, this.f80138e);
        this.f80139f = eVar;
        LinearLayout mContainer2 = getMContainer();
        if (mContainer2 != null) {
            mContainer2.addView(eVar, layoutParams);
        }
        h hVar = new h(this.f80137d.getTipsBelow(), this.f80136c);
        LinearLayout mContainer3 = getMContainer();
        if (mContainer3 != null) {
            mContainer3.addView(hVar);
        }
    }

    @Override // Fq0.b
    public final void b(boolean z6) {
        e eVar;
        if (!z6 || (eVar = this.f80139f) == null) {
            return;
        }
        eVar.e();
    }

    @Override // Fq0.b
    public final void c() {
        super.c();
        this.f80139f = null;
        setMContainer(null);
    }
}
