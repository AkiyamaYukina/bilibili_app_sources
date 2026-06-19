package com.bilibili.playerbizcommon.features.danmaku.view;

import O80.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qq0.InterfaceC8478b;
import qq0.d;
import qq0.e;
import z.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerAutoLineLayout.class */
public final class PlayerAutoLineLayout extends ViewGroup implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f79692g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC8478b f79696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public d f79697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79698f;

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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.e);
        this.f79693a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f79694b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f79695c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // qq0.d
    public final void a(@Nullable InterfaceC8478b interfaceC8478b) {
        d(interfaceC8478b);
        d dVar = this.f79697e;
        if (dVar != null) {
            dVar.a(interfaceC8478b);
        }
    }

    @Override // qq0.d
    public final void b(@Nullable InterfaceC8478b interfaceC8478b) {
        d dVar = this.f79697e;
        if (dVar != null) {
            dVar.b(interfaceC8478b);
        }
    }

    @Override // qq0.d
    public final void c(@Nullable e eVar, @NotNull Function1 function1) {
        d dVar = this.f79697e;
        if (dVar != null) {
            dVar.c(eVar, new g(2, this, eVar));
        }
    }

    public final void d(InterfaceC8478b interfaceC8478b) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            KeyEvent.Callback childAt = getChildAt(i7);
            if (childAt instanceof InterfaceC8478b) {
                if (interfaceC8478b == childAt) {
                    InterfaceC8478b interfaceC8478b2 = (InterfaceC8478b) childAt;
                    interfaceC8478b2.setSelectState(true);
                    this.f79696d = interfaceC8478b2;
                    this.f79698f = i7;
                } else {
                    ((InterfaceC8478b) childAt).setSelectState(false);
                }
            }
        }
    }

    public final int getChoosePos() {
        return this.f79698f;
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
            qq0.b r0 = r0.f79696d
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.danmaku.view.PlayerAutoLineLayout.getChooseViewTag():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f79694b / 2;
        int childCount = getChildCount();
        int i12 = 1;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int measuredWidth2 = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = this.f79694b;
            int i15 = i11;
            int i16 = i12;
            if ((i14 / 2) + i11 + measuredWidth2 > measuredWidth) {
                i15 = i14 / 2;
                i16 = i12 + 1;
            }
            int i17 = this.f79693a;
            int iA = L.a(i16, 1, i17, (i17 - measuredHeight) / 2) + this.f79695c;
            if (childAt instanceof InterfaceC8478b) {
                ((InterfaceC8478b) childAt).setItemClickListener(this);
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
        int i10 = (this.f79694b * childCount) + measuredWidth;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = i10;
        if (size > 0) {
            i11 = i10;
            if (childCount > 0) {
                int measuredWidth2 = getChildAt(0).getMeasuredWidth() + this.f79694b;
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
        setMeasuredDimension(size, (this.f79693a + this.f79695c) * (size <= 0 ? 1 : i11 % size == 0 ? i11 / size : 1 + (i11 / size)));
    }

    public final void setChoosePos(int i7) {
        if (i7 <= 0 || i7 >= getChildCount()) {
            return;
        }
        KeyEvent.Callback childAt = getChildAt(i7);
        InterfaceC8478b interfaceC8478b = childAt instanceof InterfaceC8478b ? (InterfaceC8478b) childAt : null;
        this.f79696d = interfaceC8478b;
        if (interfaceC8478b != null) {
            interfaceC8478b.setSelectState(true);
        }
        this.f79698f = i7;
        KeyEvent.Callback childAt2 = getChildAt(0);
        InterfaceC8478b interfaceC8478b2 = null;
        if (childAt2 instanceof InterfaceC8478b) {
            interfaceC8478b2 = (InterfaceC8478b) childAt2;
        }
        if (interfaceC8478b2 != null) {
            interfaceC8478b2.setSelectState(false);
        }
    }

    public final void setPlayerOptionListener(@NotNull d dVar) {
        this.f79697e = dVar;
    }
}
