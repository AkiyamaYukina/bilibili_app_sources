package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.danmaku.input.InputPanelContainer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rr0.ViewOnClickListenerC8540a;
import rr0.ViewOnClickListenerC8541b;
import sr0.AbstractC8618a;
import sr0.C8619b;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/c.class */
@StabilityInferred(parameters = 0)
public final class c extends com.bilibili.playerbizcommonv2.danmaku.input.panel.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FrameLayout f81005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AbstractC8618a f81006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewGroup f81007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.bilibili.playerbizcommonv2.danmaku.input.a f81008g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> f81010j;

    @NotNull
    public CommandsPanel.Panel h = new CommandsPanel.Panel();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f81009i = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f81011k = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/c$a.class */
    public static final class a implements InterfaceC8621d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f81012a;

        public a(c cVar) {
            this.f81012a = cVar;
        }

        @Override // sr0.InterfaceC8621d
        public final qr0.e a() {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81012a.f81008g;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            return aVar2.t().a();
        }

        @Override // sr0.InterfaceC8621d
        public final AbstractC8618a b() {
            return this.f81012a.f81006e;
        }

        @Override // sr0.InterfaceC8621d
        public final boolean c() {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81012a.f81008g;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            return aVar2.t().c();
        }

        @Override // sr0.InterfaceC8621d
        public final void d() {
            this.f81012a.w();
        }

        @Override // sr0.InterfaceC8621d
        public final void e(CommandsPanel.Panel.Drop drop, int i7) {
            ViewOnClickListenerC8541b viewOnClickListenerC8541b;
            ViewOnClickListenerC8540a viewOnClickListenerC8540aW;
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarV = this.f81012a.v();
            if (eVarV == null || (viewOnClickListenerC8541b = (ViewOnClickListenerC8541b) eVarV.a()) == null || (viewOnClickListenerC8540aW = viewOnClickListenerC8541b.w()) == null || drop == null) {
                return;
            }
            viewOnClickListenerC8540aW.f126947n.put(drop.getKey(), Integer.valueOf(i7));
        }

        @Override // sr0.InterfaceC8621d
        public final int f() {
            int px;
            ViewGroup viewGroup = this.f81012a.f81007f;
            if (viewGroup != null) {
                px = NewPlayerUtilsKt.toPx(42.0f) + viewGroup.getHeight();
            } else {
                px = 0;
            }
            return px;
        }

        @Override // sr0.InterfaceC8621d
        public final void g(CommandsPanel.Panel.Form form) {
            ViewOnClickListenerC8541b viewOnClickListenerC8541b;
            ViewOnClickListenerC8540a viewOnClickListenerC8540aW;
            CommandsPanel.Panel panel;
            ArrayList form2;
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarV = this.f81012a.v();
            if (eVarV == null || (viewOnClickListenerC8541b = (ViewOnClickListenerC8541b) eVarV.a()) == null || (viewOnClickListenerC8540aW = viewOnClickListenerC8541b.w()) == null || form == null || (panel = viewOnClickListenerC8540aW.f126945l) == null || (form2 = panel.getForm()) == null || !form2.contains(form)) {
                return;
            }
            viewOnClickListenerC8540aW.f126946m.put(form.getKey(), "");
        }

        @Override // sr0.InterfaceC8621d
        public final long getAvid() {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81012a.f81008g;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            return aVar2.t().p();
        }

        @Override // sr0.InterfaceC8621d
        public final void h(CommandsPanel.Panel.Form form, String str) {
            ViewOnClickListenerC8541b viewOnClickListenerC8541b;
            c cVar = this.f81012a;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = cVar.f81008g;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = aVar2.h();
            if ((inputPanelContainerH != null ? inputPanelContainerH.getStackTopPanel() : null) instanceof ViewOnClickListenerC8541b) {
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = cVar.f81008g;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar3 = null;
                }
                InputPanelContainer inputPanelContainerH2 = aVar3.h();
                if (inputPanelContainerH2 != null) {
                    inputPanelContainerH2.c();
                }
            }
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarV = cVar.v();
            if (eVarV != null && (viewOnClickListenerC8541b = (ViewOnClickListenerC8541b) eVarV.a()) != null) {
                viewOnClickListenerC8541b.f126955j = form;
                viewOnClickListenerC8541b.f126956k = str;
            }
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarV2 = cVar.v();
            if (eVarV2 != null) {
                eVarV2.b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/c$b.class */
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FrameLayout f81013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f81014b;

        public b(FrameLayout frameLayout, c cVar) {
            this.f81013a = frameLayout;
            this.f81014b = cVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            LinearLayout linearLayout;
            view.removeOnLayoutChangeListener(this);
            this.f81013a.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f81013a.getHeight());
            C8619b c8619b = new C8619b(this.f81013a.getContext());
            c cVar = this.f81014b;
            c8619b.f127363c = cVar.h;
            c8619b.f127362b = cVar.f81011k;
            AbstractC8618a abstractC8618aA = c8619b.a();
            if (abstractC8618aA != null) {
                this.f81014b.f81006e = abstractC8618aA;
                this.f81013a.addView(abstractC8618aA, layoutParams);
                AbstractC8618a abstractC8618a = this.f81014b.f81006e;
                if (abstractC8618a != null) {
                    abstractC8618a.a();
                }
                AbstractC8618a abstractC8618a2 = this.f81014b.f81006e;
                if (abstractC8618a2 != null && (linearLayout = abstractC8618a2.f127359a) != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        KeyEvent.Callback childAt = linearLayout.getChildAt(i15);
                        InterfaceC8622e interfaceC8622e = childAt instanceof InterfaceC8622e ? (InterfaceC8622e) childAt : null;
                        if (interfaceC8622e != null) {
                            int i16 = AbstractC8618a.f127358c;
                            interfaceC8622e.onAttach();
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
                this.f81014b.w();
            }
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void k() {
        LinearLayout linearLayout;
        FrameLayout frameLayout = this.f81005d;
        if (frameLayout != null) {
            if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
                frameLayout.addOnLayoutChangeListener(new b(frameLayout, this));
                return;
            }
            frameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, frameLayout.getHeight());
            C8619b c8619b = new C8619b(frameLayout.getContext());
            c8619b.f127363c = this.h;
            c8619b.f127362b = this.f81011k;
            AbstractC8618a abstractC8618aA = c8619b.a();
            if (abstractC8618aA != null) {
                this.f81006e = abstractC8618aA;
                frameLayout.addView(abstractC8618aA, layoutParams);
                AbstractC8618a abstractC8618a = this.f81006e;
                if (abstractC8618a != null) {
                    abstractC8618a.a();
                }
                AbstractC8618a abstractC8618a2 = this.f81006e;
                if (abstractC8618a2 != null && (linearLayout = abstractC8618a2.f127359a) != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        KeyEvent.Callback childAt = linearLayout.getChildAt(i7);
                        InterfaceC8622e interfaceC8622e = childAt instanceof InterfaceC8622e ? (InterfaceC8622e) childAt : null;
                        if (interfaceC8622e != null) {
                            int i8 = AbstractC8618a.f127358c;
                            interfaceC8622e.onAttach();
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
                w();
            }
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void l(@NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar) {
        this.f81008g = aVar;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    @NotNull
    public final ViewGroup m(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(2131496627, viewGroup, false);
        this.f81007f = viewGroup2;
        viewGroup2.setBackgroundColor(ResourcesCompat.getColor(context.getResources(), R$color.Bg2, null));
        return viewGroup2;
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void n() {
        AbstractC8618a abstractC8618a = this.f81006e;
        if (abstractC8618a != null) {
            abstractC8618a.c();
        }
        FrameLayout frameLayout = this.f81005d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.h = new CommandsPanel.Panel();
        this.f81006e = null;
        this.f81009i.clear();
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.input.panel.a
    public final void u(@NotNull ViewGroup viewGroup) {
        this.f81005d = (FrameLayout) viewGroup.findViewById(2131300036);
    }

    public final com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> v() {
        if (this.f81010j == null) {
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar = this.f81008g;
            com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                aVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = aVar2.h();
            com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarE = null;
            if (inputPanelContainerH != null) {
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar3 = this.f81008g;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar3 = null;
                }
                com.bilibili.playerbizcommonv2.danmaku.input.d dVar = new com.bilibili.playerbizcommonv2.danmaku.input.d(aVar3);
                com.bilibili.playerbizcommonv2.danmaku.input.d.a(dVar, ViewOnClickListenerC8541b.class, new com.bilibili.playerbizcommonv2.danmaku.input.panel.b(0), 2);
                dVar.f80983d = false;
                eVarE = inputPanelContainerH.e(dVar);
            }
            this.f81010j = eVarE;
        }
        return this.f81010j;
    }

    public final void w() {
        ViewOnClickListenerC8541b viewOnClickListenerC8541b;
        ViewOnClickListenerC8540a viewOnClickListenerC8540aW;
        AbstractC8618a abstractC8618a = this.f81006e;
        boolean z6 = false;
        if (abstractC8618a != null) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            LinearLayout linearLayout = abstractC8618a.f127359a;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    KeyEvent.Callback childAt = linearLayout.getChildAt(i7);
                    InterfaceC8622e interfaceC8622e = childAt instanceof InterfaceC8622e ? (InterfaceC8622e) childAt : null;
                    if (interfaceC8622e != null) {
                        int i8 = AbstractC8618a.f127358c;
                        if (interfaceC8622e.c()) {
                            Unit unit = Unit.INSTANCE;
                        } else {
                            booleanRef.element = false;
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            }
            z6 = booleanRef.element;
        }
        com.bilibili.playerbizcommonv2.danmaku.input.e<ViewOnClickListenerC8541b> eVarV = v();
        if (eVarV == null || (viewOnClickListenerC8541b = (ViewOnClickListenerC8541b) eVarV.a()) == null || (viewOnClickListenerC8540aW = viewOnClickListenerC8541b.w()) == null) {
            return;
        }
        viewOnClickListenerC8540aW.f126948o = z6;
        viewOnClickListenerC8540aW.x();
    }
}
