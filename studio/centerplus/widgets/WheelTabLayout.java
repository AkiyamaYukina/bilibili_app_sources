package com.bilibili.studio.centerplus.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.centerplus.widgets.WheelTabLayout;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import fw0.d;
import fw0.g;
import fw0.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/WheelTabLayout.class */
public final class WheelTabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f105320s = DensityUtil.dp2px(BiliContext.application(), 14.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinearLayout f105321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<g> f105322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f105323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f105324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f105325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105327g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f105330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f105331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f105332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f105333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Function2<? super TabEvent, ? super d, Unit> f105334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f105335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Handler f105336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f105337r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/WheelTabLayout$a.class */
    public static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WheelTabLayout f105338a;

        public a(WheelTabLayout wheelTabLayout) {
            this.f105338a = wheelTabLayout;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 2001) {
                return false;
            }
            Function1<? super Boolean, Unit> function1 = this.f105338a.f105333n;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            this.f105338a.f105328i = false;
            return true;
        }
    }

    public WheelTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f105321a = linearLayout;
        this.f105322b = new ArrayList<>();
        this.f105323c = new ArrayList<>();
        this.f105324d = new ArrayList<>();
        this.f105325e = new ArrayList<>();
        this.f105329j = -1;
        this.f105330k = -1;
        this.f105335p = true;
        this.f105336q = new Handler(Looper.getMainLooper(), new a(this));
        this.f105337r = 150;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
    }

    public final void a() {
        Function1<? super Boolean, Unit> function1 = this.f105333n;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.f105328i = false;
        int i7 = this.f105330k;
        int i8 = this.f105329j;
        if (i7 == i8) {
            return;
        }
        final g gVar = this.f105322b.get(i8);
        Function2<? super TabEvent, ? super d, Unit> function2 = this.f105334o;
        if (function2 != null) {
            function2.invoke(TabEvent.CLICK, gVar.f119653a);
        }
        d dVar = gVar.f119653a;
        dVar.f119647e = false;
        dVar.f119648f = false;
        final boolean z6 = true;
        gVar.f119655c.post(new Runnable(z6, gVar) { // from class: fw0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f119651a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final g f119652b;

            {
                this.f119651a = z6;
                this.f119652b = gVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z7 = this.f119651a;
                g gVar2 = this.f119652b;
                if (!z7) {
                    gVar2.f119655c.setAlpha(0.6f);
                    gVar2.f119655c.setTextSize(14.0f);
                } else {
                    gVar2.f119656d.setVisibility(8);
                    gVar2.f119657e.setVisibility(8);
                    gVar2.f119655c.setAlpha(1.0f);
                    gVar2.f119655c.setTextSize(16.0f);
                }
            }
        });
        int i9 = this.f105330k;
        if (i9 >= 0) {
            final g gVar2 = this.f105322b.get(i9);
            final boolean z7 = false;
            gVar2.f119655c.post(new Runnable(z7, gVar2) { // from class: fw0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f119651a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final g f119652b;

                {
                    this.f119651a = z7;
                    this.f119652b = gVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z72 = this.f119651a;
                    g gVar22 = this.f119652b;
                    if (!z72) {
                        gVar22.f119655c.setAlpha(0.6f);
                        gVar22.f119655c.setTextSize(14.0f);
                    } else {
                        gVar22.f119656d.setVisibility(8);
                        gVar22.f119657e.setVisibility(8);
                        gVar22.f119655c.setAlpha(1.0f);
                        gVar22.f119655c.setTextSize(16.0f);
                    }
                }
            });
        }
        Function1<? super Integer, Unit> function12 = this.f105331l;
        if (function12 != null) {
            function12.invoke(Integer.valueOf(this.f105329j));
        }
        this.f105330k = this.f105329j;
        this.f105327g = false;
    }

    public final void b(int i7, long j7) {
        Function1<? super Integer, Unit> function1;
        if (getCount() < 1 || getCount() <= i7) {
            return;
        }
        this.f105329j = i7;
        if (i7 != this.f105330k && (function1 = this.f105332m) != null) {
            function1.invoke(Integer.valueOf(i7));
        }
        int i8 = this.f105329j;
        if (i8 != this.f105330k) {
            ArrayList<Integer> arrayList = this.f105323c;
            int iIntValue = this.f105324d.get(i8).intValue();
            int i9 = f105320s * 2;
            arrayList.set(i8, Integer.valueOf((((iIntValue - i9) * 16) / 14) + i9));
            this.f105322b.get(this.f105329j).f119654b.getLayoutParams().width = this.f105323c.get(this.f105329j).intValue();
            int i10 = this.f105330k;
            if (i10 >= 0) {
                this.f105323c.set(i10, this.f105324d.get(i10));
                this.f105322b.get(this.f105330k).f119654b.getLayoutParams().width = this.f105323c.get(this.f105330k).intValue();
            }
            this.f105325e.clear();
            int count = getCount();
            for (int i11 = 0; i11 < count; i11++) {
                if (i11 == 0) {
                    this.f105325e.add(Integer.valueOf(this.f105329j == 0 ? (this.f105323c.get(0).intValue() - this.f105324d.get(0).intValue()) / 2 : 0));
                } else {
                    int i12 = i11 - 1;
                    int iIntValue2 = this.f105323c.get(i12).intValue() / 2;
                    int iIntValue3 = this.f105323c.get(i11).intValue() / 2;
                    ArrayList<Integer> arrayList2 = this.f105325e;
                    arrayList2.add(Integer.valueOf(arrayList2.get(i12).intValue() + iIntValue3 + iIntValue2));
                }
            }
        }
        final int iIntValue4 = this.f105325e.get(this.f105329j).intValue();
        if (iIntValue4 == getScrollX()) {
            a();
        } else {
            this.f105327g = true;
            postDelayed(new Runnable(this, iIntValue4) { // from class: fw0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WheelTabLayout f119660a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f119661b;

                {
                    this.f119660a = this;
                    this.f119661b = iIntValue4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WheelTabLayout wheelTabLayout = this.f119660a;
                    int i13 = this.f119661b;
                    int i14 = WheelTabLayout.f105320s;
                    wheelTabLayout.smoothScrollTo(i13, 0);
                }
            }, j7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (this.f105328i) {
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            Function1<? super Boolean, Unit> function1 = this.f105333n;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.f105336q.removeMessages(2001);
            this.f105336q.sendEmptyMessageDelayed(2001, 1000L);
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.h = true;
            this.f105328i = true;
            this.f105326f = getScrollX();
            postDelayed(new h(this), 20L);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int getCount() {
        return this.f105322b.size();
    }

    public final boolean getMEnableTabClick() {
        return this.f105335p;
    }

    @Nullable
    public final Function2<TabEvent, d, Unit> getMTabEvent() {
        return this.f105334o;
    }

    public final int getOverScroll() {
        return this.f105337r;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        Integer num;
        super.onScrollChanged(i7, i8, i9, i10);
        defpackage.a.a(i7, "onScrollChanged, l = ", "WheelTabLayout");
        if (this.f105325e.size() == 0) {
            return;
        }
        if (this.f105327g && this.f105329j < this.f105325e.size() && (num = this.f105325e.get(this.f105329j)) != null && num.intValue() == i7) {
            a();
            return;
        }
        if (getCount() > 0) {
            if (i7 <= this.f105325e.get(0).intValue() || i7 >= this.f105325e.get(getCount() - 1).intValue()) {
                return;
            }
            int count = getCount();
            for (int i11 = 0; i11 < count; i11++) {
                int iIntValue = this.f105323c.get(i11).intValue() - Math.abs(this.f105325e.get(i11).intValue() - i7);
                if (iIntValue > 0) {
                    float fFloatValue = iIntValue / this.f105323c.get(i11).floatValue();
                    final g gVar = this.f105322b.get(i11);
                    final float f7 = (fFloatValue * 2) + 14.0f;
                    gVar.f119655c.post(new Runnable(gVar, f7) { // from class: fw0.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final g f119649a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final float f119650b;

                        {
                            this.f119649a = gVar;
                            this.f119650b = f7;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            g gVar2 = this.f119649a;
                            gVar2.f119655c.setTextSize(this.f119650b);
                        }
                    });
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6) {
        return super.overScrollBy(i7, i8, i9, i10, i11, i12, this.f105337r, i14, z6);
    }

    public final void setMEnableTabClick(boolean z6) {
        this.f105335p = z6;
    }

    public final void setMTabEvent(@Nullable Function2<? super TabEvent, ? super d, Unit> function2) {
        this.f105334o = function2;
    }

    public final void setOnItemSelectListener(@NotNull Function1<? super Integer, Unit> function1) {
        this.f105331l = function1;
    }

    public final void setOnItemSelectPreListener(@NotNull Function1<? super Integer, Unit> function1) {
        this.f105332m = function1;
    }

    public final void setOverScroll(int i7) {
        this.f105337r = i7;
    }

    public final void setScrollListener(@NotNull Function1<? super Boolean, Unit> function1) {
        this.f105333n = function1;
    }
}
