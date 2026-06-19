package com.bilibili.playerbizcommonv2.danmaku.widget;

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
import com.alipay.sdk.app.PayTask;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.theme.R$color;
import ir0.C7613b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher.class */
@StabilityInferred(parameters = 0)
public class DanmakuRecommendTextSwitcher extends TextSwitcher implements ViewSwitcher.ViewFactory, InterfaceC5797a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function0<? extends List<String>> f81589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public List<String> f81590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f81594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f81595g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f81596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f81597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f81599l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher$a.class */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuRecommendTextSwitcher f81600a;

        public b(DanmakuRecommendTextSwitcher danmakuRecommendTextSwitcher) {
            this.f81600a = danmakuRecommendTextSwitcher;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<String> list = this.f81600a.f81590b;
            int size = list.size();
            if (size <= 0) {
                this.f81600a.b();
                return;
            }
            if (this.f81600a.h >= size * 3) {
                return;
            }
            BLog.i("DanmakuRecommendTextSwitcher", "run");
            DanmakuRecommendTextSwitcher danmakuRecommendTextSwitcher = this.f81600a;
            int i7 = danmakuRecommendTextSwitcher.f81591c + 1;
            danmakuRecommendTextSwitcher.f81591c = i7;
            if (i7 == 0) {
                danmakuRecommendTextSwitcher.setCurrentText(list.get(0));
                if (size == 1) {
                    return;
                }
            } else {
                if (i7 > size - 1) {
                    danmakuRecommendTextSwitcher.f81591c = 0;
                }
                danmakuRecommendTextSwitcher.setText(list.get(danmakuRecommendTextSwitcher.f81591c));
            }
            String currentRecommendWord = this.f81600a.getCurrentRecommendWord();
            String str = currentRecommendWord;
            if (currentRecommendWord == null) {
                str = "";
            }
            Function1<? super String, Unit> function1 = this.f81600a.f81597j;
            if (function1 != null) {
                function1.invoke(str);
            }
            this.f81600a.h++;
            HandlerThreads.postDelayed(0, this, PayTask.f60018j);
        }
    }

    public DanmakuRecommendTextSwitcher(@NotNull Context context) {
        this(context, null);
    }

    public DanmakuRecommendTextSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81590b = new ArrayList();
        this.f81591c = -1;
        this.f81592d = true;
        this.f81593e = 17;
        this.f81595g = ContextCompat.getColor(getContext(), R$color.Ga8_u);
        this.f81598k = true;
        this.f81599l = new b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7613b.f122198d);
        this.f81593e = typedArrayObtainStyledAttributes.getInt(2, 17);
        this.f81594f = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f81595g = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
        setInAnimation(AnimationUtils.loadAnimation(getContext(), 2130772126));
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), 2130772127));
    }

    public final void b() {
        if (getVisibility() == 0) {
            setVisibility(8);
            if (this.f81592d) {
                e();
            }
            Function1<? super String, Unit> function1 = this.f81597j;
            if (function1 != null) {
                function1.invoke("");
            }
            a aVar = this.f81596i;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void c() {
        if (getVisibility() == 0 || this.f81590b.isEmpty() || !this.f81598k) {
            return;
        }
        setVisibility(0);
        a aVar = this.f81596i;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void d() {
        if (this.f81592d) {
            e();
        }
        this.f81592d = true;
        HandlerThreads.post(0, this.f81599l);
    }

    public final void e() {
        HandlerThreads.remove(0, this.f81599l);
        getInAnimation().cancel();
        getOutAnimation().cancel();
        this.f81592d = false;
    }

    public final void f(boolean z6) {
        Function0<? extends List<String>> function0 = this.f81589a;
        List<String> list = function0 != null ? (List) function0.invoke() : null;
        if (!this.f81598k || list == null) {
            b();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        if (!Intrinsics.areEqual(list, this.f81590b)) {
            e();
            this.f81591c = -1;
            this.h = 0;
            this.f81590b = list;
            c();
            d();
            return;
        }
        if (Intrinsics.areEqual(list, this.f81590b) && z6) {
            this.f81590b = list;
            c();
            d();
        } else {
            if (!Intrinsics.areEqual(list, this.f81590b) || z6) {
                return;
            }
            c();
            d();
        }
    }

    @Override // com.bilibili.playerbizcommonv2.danmaku.widget.InterfaceC5797a
    @Nullable
    public String getCurrentRecommendWord() {
        String string;
        if (getVisibility() == 0) {
            View currentView = getCurrentView();
            TextView textView = currentView instanceof TextView ? (TextView) currentView : null;
            string = null;
            if (textView != null) {
                CharSequence text = textView.getText();
                string = null;
                if (text != null) {
                    string = text.toString();
                }
            }
        } else {
            string = "";
        }
        return string;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    @NotNull
    public final View makeView() {
        TextView textView = new TextView(getContext());
        textView.setTextColor(this.f81595g);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textView.setGravity(this.f81593e);
        textView.setTextSize(0, this.f81594f);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.f81592d) {
            e();
        }
        super.onDetachedFromWindow();
        this.f81596i = null;
    }

    public final void setAnimStateListener(@NotNull a aVar) {
        this.f81596i = aVar;
    }

    public void setEnable(boolean z6) {
        this.f81598k = z6;
        if (z6) {
            return;
        }
        b();
    }

    public final void setGetRecommendSwitcherDataFunc(@NotNull Function0<? extends List<String>> function0) {
        this.f81589a = function0;
    }

    public final void setTextChangeListener(@Nullable Function1<? super String, Unit> function1) {
        this.f81597j = function1;
    }
}
