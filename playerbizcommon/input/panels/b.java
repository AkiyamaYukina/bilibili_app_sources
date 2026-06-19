package com.bilibili.playerbizcommon.input.panels;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.autofill.n;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.semantics.y;
import com.bilibili.base.MainThread;
import com.bilibili.playerbizcommon.input.InputPanelContainer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/b.class */
public final class b extends Cq0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FrameLayout f80116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Fq0.b f80117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewGroup f80118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cq0.b f80119g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Cq0.h<Dq0.c> f80121j;

    @NotNull
    public CommandsPanel.Panel h = new CommandsPanel.Panel();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f80120i = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a f80122k = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/b$a.class */
    public static final class a implements Fq0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80123a;

        public a(b bVar) {
            this.f80123a = bVar;
        }

        @Override // Fq0.f
        public final Rq0.d a() {
            Cq0.b bVar = this.f80123a.f80119g;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            return bVar2.a();
        }

        @Override // Fq0.f
        public final Fq0.b b() {
            return this.f80123a.f80117e;
        }

        @Override // Fq0.f
        public final boolean c() {
            Cq0.b bVar = this.f80123a.f80119g;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            return bVar2.c();
        }

        @Override // Fq0.f
        public final void d() {
            this.f80123a.x();
        }

        @Override // Fq0.f
        public final void e(CommandsPanel.Panel.Drop drop, int i7) {
            Dq0.c cVar;
            Dq0.a aVarX;
            Cq0.h<Dq0.c> hVarW = this.f80123a.w();
            if (hVarW == null || (cVar = (Dq0.c) hVarW.a()) == null || (aVarX = cVar.x()) == null || drop == null) {
                return;
            }
            aVarX.f3015n.put(drop.getKey(), Integer.valueOf(i7));
        }

        @Override // Fq0.f
        public final int f() {
            int px;
            ViewGroup viewGroup = this.f80123a.f80118f;
            if (viewGroup != null) {
                px = NewPlayerUtilsKt.toPx(42.0f) + viewGroup.getHeight();
            } else {
                px = 0;
            }
            return px;
        }

        @Override // Fq0.f
        public final void g(CommandsPanel.Panel.Form form) {
            Dq0.c cVar;
            Dq0.a aVarX;
            CommandsPanel.Panel panel;
            ArrayList form2;
            Cq0.h<Dq0.c> hVarW = this.f80123a.w();
            if (hVarW == null || (cVar = (Dq0.c) hVarW.a()) == null || (aVarX = cVar.x()) == null || form == null || (panel = aVarX.f3013l) == null || (form2 = panel.getForm()) == null || !form2.contains(form)) {
                return;
            }
            aVarX.f3014m.put(form.getKey(), "");
        }

        @Override // Fq0.f
        public final long getAvid() {
            Cq0.b bVar = this.f80123a.f80119g;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            return bVar2.getAvid();
        }

        @Override // Fq0.f
        public final void h(CommandsPanel.Panel.Form form, String str) {
            Dq0.c cVar;
            b bVar = this.f80123a;
            Cq0.b bVar2 = bVar.f80119g;
            Cq0.b bVar3 = bVar2;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar3 = null;
            }
            InputPanelContainer inputPanelContainerH = bVar3.h();
            if ((inputPanelContainerH != null ? inputPanelContainerH.getStackTopPanel() : null) instanceof Dq0.c) {
                Cq0.b bVar4 = bVar.f80119g;
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar4 = null;
                }
                InputPanelContainer inputPanelContainerH2 = bVar4.h();
                if (inputPanelContainerH2 != null) {
                    inputPanelContainerH2.b();
                }
            }
            Cq0.h<Dq0.c> hVarW = bVar.w();
            if (hVarW != null && (cVar = (Dq0.c) hVarW.a()) != null) {
                cVar.f3025j = form;
                cVar.f3026k = str;
            }
            Cq0.h<Dq0.c> hVarW2 = bVar.w();
            if (hVarW2 != null) {
                hVarW2.b();
            }
        }
    }

    @Override // Cq0.a
    public final void k() {
        MainThread.postOnMainThread(new X9.d(this, 5));
    }

    @Override // Cq0.a
    public final void l(@NotNull Cq0.b bVar) {
        this.f80119g = bVar;
    }

    @Override // Cq0.a
    public final void m(boolean z6) {
        Fq0.b bVar = this.f80117e;
        if (bVar != null) {
            bVar.b(z6);
        }
    }

    @Override // Cq0.a
    @NotNull
    public final ViewGroup n(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(2131496354, viewGroup, false);
        this.f80118f = viewGroup2;
        return viewGroup2;
    }

    @Override // Cq0.a
    public final void o() {
        Fq0.b bVar = this.f80117e;
        if (bVar != null) {
            bVar.c();
        }
        FrameLayout frameLayout = this.f80116d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.h = new CommandsPanel.Panel();
        this.f80117e = null;
        this.f80120i.clear();
    }

    @Override // Cq0.a
    public final void p() {
        Cq0.b bVar = this.f80119g;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        bVar2.q();
    }

    @Override // Cq0.a
    public final void s() {
        Cq0.b bVar = this.f80119g;
        Cq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputController");
            bVar2 = null;
        }
        bVar2.z();
    }

    @Override // Cq0.a
    public final void v(@NotNull ViewGroup viewGroup) {
        this.f80116d = (FrameLayout) viewGroup.findViewById(2131300036);
    }

    public final Cq0.h<Dq0.c> w() {
        if (this.f80121j == null) {
            Cq0.b bVar = this.f80119g;
            Cq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                bVar2 = null;
            }
            InputPanelContainer inputPanelContainerH = bVar2.h();
            Cq0.h<Dq0.c> hVarD = null;
            if (inputPanelContainerH != null) {
                Cq0.b bVar3 = this.f80119g;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar3 = null;
                }
                Cq0.g gVar = new Cq0.g(bVar3);
                final int i7 = 0;
                Cq0.g.a(gVar, Dq0.c.class, new Function1(i7) { // from class: com.bilibili.playerbizcommon.input.panels.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f80115a;

                    {
                        this.f80115a = i7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f80115a) {
                            case 0:
                                break;
                            default:
                                n.f43147a.getClass();
                                y.i((SemanticsPropertyReceiver) obj, n.a.f43150c);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, 2);
                gVar.f1712d = false;
                hVarD = inputPanelContainerH.d(gVar);
            }
            this.f80121j = hVarD;
        }
        return this.f80121j;
    }

    public final void x() {
        Dq0.c cVar;
        Dq0.a aVarX;
        Fq0.b bVar = this.f80117e;
        boolean z6 = false;
        if (bVar != null) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            LinearLayout linearLayout = bVar.f6391a;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    KeyEvent.Callback childAt = linearLayout.getChildAt(i7);
                    Fq0.g gVar = childAt instanceof Fq0.g ? (Fq0.g) childAt : null;
                    if (gVar != null) {
                        int i8 = Fq0.b.f6390b;
                        if (gVar.c()) {
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
        Cq0.h<Dq0.c> hVarW = w();
        if (hVarW == null || (cVar = (Dq0.c) hVarW.a()) == null || (aVarX = cVar.x()) == null) {
            return;
        }
        aVarX.f3016o = z6;
        aVarX.x();
    }
}
