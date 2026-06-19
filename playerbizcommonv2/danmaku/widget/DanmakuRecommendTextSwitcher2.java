package com.bilibili.playerbizcommonv2.danmaku.widget;

import K7.L;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import ir0.C7613b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2.class */
@StabilityInferred(parameters = 0)
public class DanmakuRecommendTextSwitcher2 extends TextSwitcher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f81601j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f81606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f81607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f81608g;

    @NotNull
    public final HashSet<a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f81609i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f81610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f81611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f81612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<String> f81613d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f81615f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f81614e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public String f81616g = "";

        public a(@NotNull List list, long j7, long j8, long j9) {
            this.f81610a = j7;
            this.f81611b = j8;
            this.f81612c = j9;
            this.f81613d = list;
        }
    }

    public DanmakuRecommendTextSwitcher2(@NotNull Context context) {
        this(context, null);
    }

    public DanmakuRecommendTextSwitcher2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81602a = 17;
        this.f81604c = ContextCompat.getColor(getContext(), R$color.Ga8_u);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f81605d = MutableStateFlow;
        this.f81606e = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.f81607f = MutableStateFlow2;
        this.f81608g = FlowKt.asStateFlow(MutableStateFlow2);
        this.h = new HashSet<>();
        this.f81609i = StateFlowKt.MutableStateFlow((Object) null);
        ViewSwitcher.ViewFactory viewFactory = new ViewSwitcher.ViewFactory(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.widget.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuRecommendTextSwitcher2 f81625a;

            {
                this.f81625a = this;
            }

            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2 = this.f81625a;
                int i7 = DanmakuRecommendTextSwitcher2.f81601j;
                TextView textView = new TextView(danmakuRecommendTextSwitcher2.getContext());
                textView.setTextColor(danmakuRecommendTextSwitcher2.f81604c);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView.setGravity(danmakuRecommendTextSwitcher2.f81602a);
                textView.setTextSize(0, danmakuRecommendTextSwitcher2.f81603b);
                return textView;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7613b.f122198d);
        this.f81602a = typedArrayObtainStyledAttributes.getInt(2, 17);
        this.f81603b = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f81604c = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(viewFactory);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), 2130772126));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), 2130772127));
    }

    public final void b(@NotNull List list, long j7, long j8, long j9) {
        a next;
        Iterator<a> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            a aVar = next;
            if (aVar.f81610a == j7 && aVar.f81611b == j8 && aVar.f81612c == j9) {
                break;
            }
        }
        if (next == null && !list.isEmpty()) {
            BLog.i("DanmakuRecommendTextSwitcher", com.bapis.bilibili.app.home.v1.l.a(list.size(), j7, "addWord, ", " "));
            this.h.add(new a(list, j7, j8, j9));
        }
    }

    public final void c() {
        BLog.i("DanmakuRecommendTextSwitcher", "hide");
        this.f81605d.setValue(Boolean.FALSE);
    }

    @Nullable
    public final Object d(@NotNull SuspendLambda suspendLambda) {
        BLog.i("DanmakuRecommendTextSwitcher", "runSwitcher");
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new DanmakuRecommendTextSwitcher2$runSwitcher$2(this, null), suspendLambda);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void e(long j7, long j8, long j9, boolean z6) {
        Object next;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "startAnimation, ", " ");
        sbA.append(j8);
        J1.z.a(j9, " ", " ", sbA);
        L.a(sbA, z6, "DanmakuRecommendTextSwitcher");
        a aVar = (a) this.f81609i.getValue();
        Long lValueOf = aVar != null ? Long.valueOf(aVar.f81610a) : null;
        if (z6 && lValueOf != null && lValueOf.longValue() == j7) {
            this.f81609i.setValue((Object) null);
        }
        MutableStateFlow<a> mutableStateFlow = this.f81609i;
        Iterator<T> it = this.h.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            a aVar2 = (a) next;
            if (aVar2.f81610a == j7 && aVar2.f81611b == j8 && aVar2.f81612c == j9) {
                break;
            }
        }
        mutableStateFlow.setValue(next);
    }

    @NotNull
    public final StateFlow<String> getCurrentTextFlow() {
        return this.f81608g;
    }

    @NotNull
    public final StateFlow<Boolean> getVisibleStateFlow() {
        return this.f81606e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f81609i.setValue((Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // android.widget.TextSwitcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentText(@org.jetbrains.annotations.Nullable java.lang.CharSequence r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            super.setCurrentText(r1)
            r0 = r3
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r0 = r0.f81607f
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L1c
        L19:
            java.lang.String r0 = ""
            r4 = r0
        L1c:
            r0 = r6
            r1 = r4
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2.setCurrentText(java.lang.CharSequence):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // android.widget.TextSwitcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setText(@org.jetbrains.annotations.Nullable java.lang.CharSequence r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            super.setText(r1)
            r0 = r3
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r0 = r0.f81607f
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L1c
        L19:
            java.lang.String r0 = ""
            r4 = r0
        L1c:
            r0 = r6
            r1 = r4
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2.setText(java.lang.CharSequence):void");
    }
}
