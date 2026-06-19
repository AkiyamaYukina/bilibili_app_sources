package com.bilibili.studio.centerplus.widgets;

import TB0.C2875g;
import Wj.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/GeneralModLoadingView2.class */
public final class GeneralModLoadingView2 extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C2875g f105313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f105314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f105315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f105316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f105317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105318f;

    @JvmOverloads
    public GeneralModLoadingView2(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public GeneralModLoadingView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public GeneralModLoadingView2(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f105318f = -1;
        this.f105315c = context.getString(2131842107);
        this.f105316d = context.getString(2131842257);
        this.f105313a = C2875g.inflate(LayoutInflater.from(context), this, true);
    }

    private static /* synthetic */ void getLoadingState$annotations() {
    }

    public final int getLoadingState() {
        return this.f105318f;
    }

    public final void onLoading() {
        this.f105318f = 2;
        setVisibility(0);
        String str = this.f105315c;
        if (str == null || str.length() == 0) {
            C2875g c2875g = this.f105313a;
            if (c2875g != null) {
                c2875g.f23787e.setVisibility(8);
            }
        } else {
            if (this.f105318f == 0) {
                C2875g c2875g2 = this.f105313a;
                if (c2875g2 != null) {
                    c2875g2.f23787e.setText(this.f105316d);
                }
            } else {
                C2875g c2875g3 = this.f105313a;
                if (c2875g3 != null) {
                    c2875g3.f23787e.setText(this.f105315c);
                }
            }
            C2875g c2875g4 = this.f105313a;
            if (c2875g4 != null) {
                c2875g4.f23787e.setVisibility(0);
            }
        }
        if (this.f105317e) {
            C2875g c2875g5 = this.f105313a;
            if (c2875g5 != null) {
                c2875g5.f23784b.setVisibility(0);
            }
            C2875g c2875g6 = this.f105313a;
            if (c2875g6 != null) {
                c2875g6.f23784b.setOnClickListener(new e(this, 1));
            }
        } else {
            C2875g c2875g7 = this.f105313a;
            if (c2875g7 != null) {
                c2875g7.f23784b.setVisibility(8);
            }
        }
        if (this.f105318f == 0) {
            C2875g c2875g8 = this.f105313a;
            if (c2875g8 != null) {
                c2875g8.f23785c.setVisibility(0);
            }
            C2875g c2875g9 = this.f105313a;
            if (c2875g9 != null) {
                c2875g9.f23786d.setVisibility(8);
            }
        } else {
            C2875g c2875g10 = this.f105313a;
            if (c2875g10 != null) {
                c2875g10.f23785c.setVisibility(8);
            }
            C2875g c2875g11 = this.f105313a;
            if (c2875g11 != null) {
                c2875g11.f23786d.setVisibility(0);
            }
        }
        Function1<? super Integer, Unit> function1 = this.f105314b;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f105318f));
        }
    }
}
