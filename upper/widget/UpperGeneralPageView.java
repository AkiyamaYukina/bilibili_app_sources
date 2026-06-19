package com.bilibili.upper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.AnyRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperGeneralPageView.class */
@StabilityInferred(parameters = 0)
public final class UpperGeneralPageView extends TintConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f114439r = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @AnyRes
    @Nullable
    public final Integer f114441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @AnyRes
    @Nullable
    public final Integer f114442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @AnyRes
    @Nullable
    public final Integer f114443g;

    @AnyRes
    @Nullable
    public final Integer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f114444i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f114445j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f114446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f114447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Function1<Integer, Unit>> f114448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f114449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f114450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f114451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f114452q;

    @JvmOverloads
    public UpperGeneralPageView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public UpperGeneralPageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public UpperGeneralPageView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f114441e = 0;
        this.f114442f = 0;
        this.f114443g = 0;
        this.h = 0;
        this.f114448m = new LinkedHashMap();
        this.f114450o = 16;
        this.f114452q = 8;
        q4.D.a(hashCode(), this.f114440d, "initDefaultLayoutParam hash:", " state:", "UpperGeneralPageView");
        this.f114443g = 2131500626;
        this.f114441e = 2131500625;
        this.f114442f = 2131500624;
    }

    public final void j0(View view) {
        if (view == null) {
            return;
        }
        setVisibility(0);
        addView(view, -1, -1);
        Iterator it = ((LinkedHashMap) this.f114448m).entrySet().iterator();
        while (it.hasNext()) {
            View viewFindViewById = findViewById(((Number) ((Map.Entry) it.next()).getKey()).intValue());
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(this);
            }
        }
    }

    public final void k0(View view) {
        LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout != null) {
            linearLayout.setGravity(this.f114450o);
        }
        if (view != null) {
            PaddingUtilsKt.setPaddingTop(view, ListExtentionsKt.toPx(this.f114451p));
        }
    }

    public final void l0(int i7) {
        if (!this.f114449n) {
            this.f114449n = true;
            if (getChildCount() > 1) {
                throw new IllegalArgumentException("UpperGeneralPageView can only has one child");
            }
            if (getChildCount() == 1) {
                this.f114444i = getChildAt(0);
            } else {
                Integer num = this.h;
                if (num != null) {
                    if (this.f114444i == null) {
                        num = null;
                    }
                    if (num != null) {
                        this.f114444i = LayoutInflater.from(getContext()).inflate(num.intValue(), (ViewGroup) this, false);
                    }
                }
                j0(this.f114444i);
            }
        }
        q4.D.a(hashCode(), i7, "updateViewState hash:", " state:", "UpperGeneralPageView");
        this.f114440d = i7;
        if (i7 == 0) {
            Integer num2 = this.f114441e;
            q4.D.a(i7, num2 != null ? num2.intValue() : 2131500625, "bindLoadingView state:", " resId:", "UpperGeneralPageView");
            if (this.f114447l == null) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                Integer num3 = this.f114441e;
                int iIntValue = 2131500625;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                }
                View viewInflate = layoutInflaterFrom.inflate(iIntValue, (ViewGroup) this, false);
                this.f114447l = viewInflate;
                j0(viewInflate);
            }
            k0(this.f114447l);
            View view = this.f114447l;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f114446k;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.f114445j;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.f114444i;
            if (view4 != null) {
                view4.setVisibility(this.f114452q);
                return;
            }
            return;
        }
        if (i7 == 1) {
            Integer num4 = this.f114442f;
            q4.D.a(i7, num4 != null ? num4.intValue() : 2131500624, "bindFailedView state:", " resId:", "UpperGeneralPageView");
            if (this.f114446k == null) {
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(getContext());
                Integer num5 = this.f114442f;
                int iIntValue2 = 2131500624;
                if (num5 != null) {
                    iIntValue2 = num5.intValue();
                }
                View viewInflate2 = layoutInflaterFrom2.inflate(iIntValue2, (ViewGroup) this, false);
                this.f114446k = viewInflate2;
                j0(viewInflate2);
            }
            k0(this.f114446k);
            View view5 = this.f114446k;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            View view6 = this.f114447l;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f114445j;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            View view8 = this.f114444i;
            if (view8 != null) {
                view8.setVisibility(this.f114452q);
                return;
            }
            return;
        }
        if (i7 == 2) {
            setVisibility(8);
            return;
        }
        if (i7 == 3) {
            Integer num6 = this.h;
            Object obj = num6;
            if (num6 == null) {
                obj = this.f114444i;
            }
            BLog.d("UpperGeneralPageView", "bindContentView state:" + i7 + " resId:" + obj);
            View view9 = this.f114444i;
            if (view9 != null) {
                view9.setVisibility(0);
            }
            View view10 = this.f114445j;
            if (view10 != null) {
                view10.setVisibility(8);
            }
            View view11 = this.f114446k;
            if (view11 != null) {
                view11.setVisibility(8);
            }
            View view12 = this.f114447l;
            if (view12 != null) {
                view12.setVisibility(8);
                return;
            }
            return;
        }
        if (i7 != 4) {
            return;
        }
        Integer num7 = this.f114443g;
        q4.D.a(i7, num7 != null ? num7.intValue() : 2131500626, "bindEmptyView state:", " resId:", "UpperGeneralPageView");
        if (this.f114445j == null) {
            LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(getContext());
            Integer num8 = this.f114443g;
            int iIntValue3 = 2131500626;
            if (num8 != null) {
                iIntValue3 = num8.intValue();
            }
            View viewInflate3 = layoutInflaterFrom3.inflate(iIntValue3, (ViewGroup) this, false);
            this.f114445j = viewInflate3;
            j0(viewInflate3);
        }
        k0(this.f114445j);
        View view13 = this.f114445j;
        if (view13 != null) {
            view13.setVisibility(0);
        }
        View view14 = this.f114446k;
        if (view14 != null) {
            view14.setVisibility(8);
        }
        View view15 = this.f114447l;
        if (view15 != null) {
            view15.setVisibility(8);
        }
        View view16 = this.f114444i;
        if (view16 != null) {
            view16.setVisibility(this.f114452q);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        if (view != null) {
            Function1 function1 = (Function1) ((LinkedHashMap) this.f114448m).get(Integer.valueOf(view.getId()));
            if (function1 != null) {
            }
        }
    }

    public final void setContentViewVisibleState(int i7) {
        getVisibility();
        this.f114452q = i7;
    }

    public final void setStatusGravity(int i7) {
        this.f114450o = i7;
    }

    public final void setStatusPaddingTop(int i7) {
        this.f114451p = i7;
    }
}
