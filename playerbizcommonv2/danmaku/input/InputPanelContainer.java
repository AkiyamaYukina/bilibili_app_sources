package com.bilibili.playerbizcommonv2.danmaku.input;

import W60.d0;
import W60.f0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/InputPanelContainer.class */
@StabilityInferred(parameters = 0)
public final class InputPanelContainer extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80972f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f80973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, d<?>> f80975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Stack<com.bilibili.playerbizcommonv2.danmaku.input.panel.a> f80976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public c f80977e;

    public InputPanelContainer(@NotNull Context context) {
        this(context, null);
    }

    public InputPanelContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f80973a = "InputPanelContainer";
        this.f80975c = new HashMap<>();
        this.f80976d = new Stack<>();
    }

    public static com.bilibili.playerbizcommonv2.danmaku.input.panel.a b(InputPanelContainer inputPanelContainer, Class cls) {
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar;
        Iterator<T> it = inputPanelContainer.f80975c.entrySet().iterator();
        while (true) {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            aVar = ((d) entry.getValue()).f80981b;
            if (aVar != null) {
                if (cls.isInstance(aVar) && Intrinsics.areEqual(((d) entry.getValue()).f80982c, "")) {
                    break;
                }
            } else {
                aVar = null;
                break;
            }
        }
        return aVar;
    }

    public final void a() {
        this.f80975c.clear();
        while (!this.f80976d.isEmpty()) {
            com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVarPop = this.f80976d.pop();
            try {
                aVarPop.j(this);
            } catch (Exception e7) {
                BLog.e(this.f80973a, "clear panel " + aVarPop + " failed because " + e7.getMessage());
            }
        }
        BLog.d(this.f80973a, "clear panel stack");
        removeAllViews();
    }

    public final void c() {
        if (this.f80976d.size() > 1) {
            defpackage.a.b("pop stack ", CollectionsKt.p(this.f80976d, "->", (CharSequence) null, (CharSequence) null, new f0(1), 30), this.f80973a);
            com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVarPop = this.f80976d.pop();
            if (aVarPop.f81003c) {
                aVarPop.j(this);
            }
            com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel = getStackTopPanel();
            if (stackTopPanel != null) {
                stackTopPanel.q();
            }
        }
    }

    public final void d(com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar) {
        com.bilibili.playerbizcommonv2.danmaku.input.panel.a stackTopPanel = getStackTopPanel();
        if (stackTopPanel == null || Intrinsics.areEqual(stackTopPanel, aVar)) {
            return;
        }
        c();
        d(aVar);
    }

    @NotNull
    public final <T extends com.bilibili.playerbizcommonv2.danmaku.input.panel.a> e<T> e(@NotNull d<T> dVar) {
        int iHashCode = dVar.hashCode();
        if (!this.f80975c.containsValue(dVar)) {
            this.f80975c.put(Integer.valueOf(iHashCode), dVar);
        }
        return new e<>(iHashCode, new d0(this, 3), new b(this, 0));
    }

    @Nullable
    public final com.bilibili.playerbizcommonv2.danmaku.input.panel.a getStackTopPanel() {
        return this.f80976d.empty() ? null : this.f80976d.peek();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f80974b;
        if (i9 != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setMaxHeight(int i7) {
        this.f80974b = i7;
    }

    public final void setOnInputPanelChangedListener(@NotNull c cVar) {
        this.f80977e = cVar;
    }
}
