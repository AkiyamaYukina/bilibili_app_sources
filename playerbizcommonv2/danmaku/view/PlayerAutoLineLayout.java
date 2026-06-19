package com.bilibili.playerbizcommonv2.danmaku.view;

import Cr0.c;
import Nh1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.view.PlayerAutoLineLayout;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8348b;
import pr0.InterfaceC8350d;
import z.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerAutoLineLayout.class */
@StabilityInferred(parameters = 0)
public final class PlayerAutoLineLayout extends ViewGroup implements InterfaceC8350d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81512g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC8348b f81516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC8350d f81517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81518f;

    @JvmOverloads
    public PlayerAutoLineLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerAutoLineLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayerAutoLineLayout(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e);
        this.f81513a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f81514b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f81515c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // pr0.InterfaceC8350d
    public final void a(@Nullable InterfaceC8348b interfaceC8348b) {
        InterfaceC8350d interfaceC8350d = this.f81517e;
        if (interfaceC8350d != null) {
            interfaceC8350d.a(interfaceC8348b);
        }
    }

    @Override // pr0.InterfaceC8350d
    public final void b(@Nullable final c cVar, @NotNull Function1 function1) {
        InterfaceC8350d interfaceC8350d = this.f81517e;
        if (interfaceC8350d != null) {
            interfaceC8350d.b(cVar, new Function1(this, cVar) { // from class: Cr0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerAutoLineLayout f1732a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final c f1733b;

                {
                    this.f1732a = this;
                    this.f1733b = cVar;
                }

                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    int i7 = PlayerAutoLineLayout.f81512g;
                    if (zBooleanValue) {
                        this.f1732a.d(this.f1733b);
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Override // pr0.InterfaceC8350d
    public final void c(@Nullable InterfaceC8348b interfaceC8348b) {
        d(interfaceC8348b);
        InterfaceC8350d interfaceC8350d = this.f81517e;
        if (interfaceC8350d != null) {
            interfaceC8350d.c(interfaceC8348b);
        }
    }

    public final void d(InterfaceC8348b interfaceC8348b) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            KeyEvent.Callback childAt = getChildAt(i7);
            if (childAt instanceof InterfaceC8348b) {
                if (interfaceC8348b == childAt) {
                    InterfaceC8348b interfaceC8348b2 = (InterfaceC8348b) childAt;
                    interfaceC8348b2.setSelectState(true);
                    this.f81516d = interfaceC8348b2;
                    this.f81518f = i7;
                } else {
                    ((InterfaceC8348b) childAt).setSelectState(false);
                }
            }
        }
    }

    public final int getChoosePos() {
        return this.f81518f;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getChooseViewTag() {
        /*
            r2 = this;
            r0 = r2
            pr0.b r0 = r0.f81516d
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            java.lang.String r0 = r0.getItemTag()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L19
        L16:
            java.lang.String r0 = ""
            r3 = r0
        L19:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.view.PlayerAutoLineLayout.getChooseViewTag():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f81514b / 2;
        int childCount = getChildCount();
        int i12 = 1;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = this.f81514b;
            int i15 = i11;
            int i16 = i12;
            if ((i14 / 2) + i11 + measuredWidth2 > measuredWidth) {
                i15 = i14 / 2;
                i16 = i12 + 1;
            }
            int i17 = this.f81513a;
            int iA = L.a(i16, 1, i17, (i17 - measuredHeight) / 2) + this.f81515c;
            if (childAt instanceof InterfaceC8348b) {
                ((InterfaceC8348b) childAt).setItemClickListener(this);
            }
            childAt.layout(i15, iA, measuredWidth2 + i15, measuredHeight + iA);
            i13++;
            i11 = i14 + measuredWidth2 + i15;
            i12 = i16;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        measureChildren(i7, i8);
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            measuredWidth += getChildAt(i9).getMeasuredWidth();
        }
        int i10 = (this.f81514b * childCount) + measuredWidth;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = i10;
        if (size > 0) {
            i11 = i10;
            if (childCount > 0) {
                int measuredWidth2 = getChildAt(0).getMeasuredWidth() + this.f81514b;
                i11 = i10;
                if (measuredWidth2 > 0) {
                    int i12 = size / measuredWidth2;
                    i11 = i10;
                    if (1 <= i12) {
                        i11 = i10;
                        if (i12 < childCount) {
                            int i13 = childCount / i12;
                            if (childCount % i12 != 0) {
                                i13++;
                            }
                            i11 = i10 + ((size % measuredWidth2) * i13);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(size, (this.f81513a + this.f81515c) * (size <= 0 ? 1 : i11 % size == 0 ? i11 / size : 1 + (i11 / size)));
    }

    public final void setChoosePos(int i7) {
        if (i7 <= 0 || i7 >= getChildCount()) {
            return;
        }
        KeyEvent.Callback childAt = getChildAt(i7);
        InterfaceC8348b interfaceC8348b = childAt instanceof InterfaceC8348b ? (InterfaceC8348b) childAt : null;
        this.f81516d = interfaceC8348b;
        if (interfaceC8348b != null) {
            interfaceC8348b.setSelectState(true);
        }
        this.f81518f = i7;
        KeyEvent.Callback childAt2 = getChildAt(0);
        InterfaceC8348b interfaceC8348b2 = null;
        if (childAt2 instanceof InterfaceC8348b) {
            interfaceC8348b2 = (InterfaceC8348b) childAt2;
        }
        if (interfaceC8348b2 != null) {
            interfaceC8348b2.setSelectState(false);
        }
    }

    public final void setPlayerOptionListener(@NotNull InterfaceC8350d interfaceC8350d) {
        this.f81517e = interfaceC8350d;
    }
}
