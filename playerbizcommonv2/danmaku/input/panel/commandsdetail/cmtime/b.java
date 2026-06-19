package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime;

import WQ.O;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.dynamic.v2.Hc;
import com.bilibili.biligame.cloudgame.v2.ui.dialog.r;
import com.bilibili.bplus.followinglist.module.item.ModuleEnum;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.n;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.C8620c;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import xr0.C9003c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/b.class */
@StabilityInferred(parameters = 0)
public final class b extends LinearLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f81020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel.Form f81022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel.Form f81023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C8620c f81024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C8620c f81025f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/cmtime/b$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f81026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81027b;

        public a(b bVar, boolean z6) {
            this.f81026a = bVar;
            this.f81027b = z6;
        }
    }

    public b(@NotNull Context context, @NotNull InterfaceC8621d interfaceC8621d, @NotNull CommandsPanel.Panel.Form form, @NotNull CommandsPanel.Panel.Form form2) {
        super(context);
        this.f81020a = context;
        this.f81021b = interfaceC8621d;
        this.f81022c = form;
        this.f81023d = form2;
        setOrientation(0);
    }

    @Override // sr0.InterfaceC8622e
    public final void a(@NotNull HashMap<String, Object> map) {
        C8620c c8620c = this.f81024e;
        if (c8620c != null) {
            c8620c.a(map);
        }
        C8620c c8620c2 = this.f81025f;
        if (c8620c2 != null) {
            c8620c2.a(map);
        }
    }

    @Override // sr0.InterfaceC8622e
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        C8620c c8620c = this.f81024e;
        if (c8620c != null) {
            c8620c.b(form, str);
        }
        C8620c c8620c2 = this.f81025f;
        if (c8620c2 != null) {
            c8620c2.b(form, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // sr0.InterfaceC8622e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r3 = this;
            r0 = r3
            sr0.c r0 = r0.f81024e
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L29
            r0 = r6
            boolean r0 = r0.c()
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L29
            r0 = r3
            sr0.c r0 = r0.f81025f
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L29
            r0 = r6
            boolean r0 = r0.c()
            r1 = 1
            if (r0 != r1) goto L29
            goto L2b
        L29:
            r0 = 0
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.b.c():boolean");
    }

    public final void d(boolean z6) {
        n nVar = new n(this.f81020a, new n.a(this.f81021b.f(), z6 ? this.f81020a.getString(2131845769) : this.f81020a.getString(2131846885)));
        if (nVar.isShowing()) {
            return;
        }
        nVar.f81063e = new a(this, z6);
        nVar.show();
    }

    @Override // sr0.InterfaceC8622e
    public final void onAttach() {
        removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(NewPlayerUtilsKt.toPx(150.0f), NewPlayerUtilsKt.toPx(40.0f));
        layoutParams.setMargins(0, 0, NewPlayerUtilsKt.toPx(10.0f), 0);
        Context context = this.f81020a;
        InterfaceC8621d interfaceC8621d = this.f81021b;
        new CommandsPanel.Panel.Form();
        CommandsPanel.Panel.Form form = this.f81022c;
        final int i7 = 0;
        Function2<? super String, ? super HashMap<String, Object>, Unit> function2 = new Function2(i7) { // from class: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.cmtime.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81019a;

            {
                this.f81019a = i7;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f81019a) {
                    case 0:
                        ((HashMap) obj2).put("start_time", Long.valueOf(C9003c.b((String) obj)));
                        return Unit.INSTANCE;
                    default:
                        return ModuleEnum.N0((Hc) obj, (O) obj2);
                }
            }
        };
        W9.k kVar = new W9.k(this, 2);
        C8620c c8620c = new C8620c(context, interfaceC8621d);
        c8620c.f127365b = null;
        c8620c.h = form;
        c8620c.f127371i = function2;
        c8620c.f127372j = true;
        c8620c.f127373k = true;
        c8620c.f127374l = false;
        c8620c.f127375m = kVar;
        this.f81024e = c8620c;
        addView(c8620c, layoutParams);
        Context context2 = this.f81020a;
        InterfaceC8621d interfaceC8621d2 = this.f81021b;
        new CommandsPanel.Panel.Form();
        CommandsPanel.Panel.Form form2 = this.f81023d;
        com.bilibili.biligame.ui.pointmall.record.a aVar = new com.bilibili.biligame.ui.pointmall.record.a(1);
        r rVar = new r(this);
        C8620c c8620c2 = new C8620c(context2, interfaceC8621d2);
        c8620c2.f127365b = null;
        c8620c2.h = form2;
        c8620c2.f127371i = aVar;
        c8620c2.f127372j = true;
        c8620c2.f127373k = true;
        c8620c2.f127374l = false;
        c8620c2.f127375m = rVar;
        this.f81025f = c8620c2;
        addView(c8620c2, layoutParams);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            KeyEvent.Callback childAt = getChildAt(i8);
            InterfaceC8622e interfaceC8622e = childAt instanceof InterfaceC8622e ? (InterfaceC8622e) childAt : null;
            if (interfaceC8622e != null) {
                interfaceC8622e.onAttach();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
    }
}
