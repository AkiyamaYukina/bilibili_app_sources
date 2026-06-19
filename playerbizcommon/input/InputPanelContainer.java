package com.bilibili.playerbizcommon.input;

import Cq0.a;
import Cq0.c;
import Cq0.d;
import Cq0.e;
import Cq0.f;
import Cq0.g;
import Cq0.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/InputPanelContainer.class */
public final class InputPanelContainer extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80095e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f80096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, g<?>> f80098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Stack<a> f80099d;

    public InputPanelContainer(@NotNull Context context) {
        this(context, null);
    }

    public InputPanelContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f80096a = "InputPanelContainer";
        this.f80098c = new HashMap<>();
        this.f80099d = new Stack<>();
    }

    public static a a(InputPanelContainer inputPanelContainer, Class cls) {
        a aVar;
        Iterator<T> it = inputPanelContainer.f80098c.entrySet().iterator();
        while (true) {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            aVar = ((g) entry.getValue()).f1710b;
            if (aVar != null) {
                if (cls.isInstance(aVar) && Intrinsics.areEqual(((g) entry.getValue()).f1711c, "")) {
                    break;
                }
            } else {
                aVar = null;
                break;
            }
        }
        return aVar;
    }

    public final void b() {
        if (this.f80099d.size() > 1) {
            defpackage.a.b("pop stack ", CollectionsKt.p(this.f80099d, "->", (CharSequence) null, (CharSequence) null, new e(0), 30), this.f80096a);
            a aVarPop = this.f80099d.pop();
            if (aVarPop.f1703c) {
                aVarPop.j(this);
            }
            a stackTopPanel = getStackTopPanel();
            if (stackTopPanel != null) {
                stackTopPanel.r();
            }
        }
    }

    public final void c(a aVar) {
        a stackTopPanel = getStackTopPanel();
        if (stackTopPanel == null || Intrinsics.areEqual(stackTopPanel, aVar)) {
            return;
        }
        b();
        c(aVar);
    }

    @NotNull
    public final <T extends a> h<T> d(@NotNull g<T> gVar) {
        int iHashCode = gVar.hashCode();
        if (!this.f80098c.containsValue(gVar)) {
            this.f80098c.put(Integer.valueOf(iHashCode), gVar);
        }
        return new h<>(iHashCode, new c(this, 0), new d(this, 0));
    }

    @Nullable
    public final a getStackTopPanel() {
        return this.f80099d.empty() ? null : this.f80099d.peek();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f80097b;
        if (i9 != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setMaxHeight(int i7) {
        this.f80097b = i7;
    }

    public final void setOnInputPanelChangedListener(@NotNull f fVar) {
    }
}
