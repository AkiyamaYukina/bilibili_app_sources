package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C3259x;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.bilibili.opd.app.bizcommon.ui.flexbox.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayout.class */
public class FlexboxLayout extends ViewGroup implements a {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f74556g;

    @Nullable
    public Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f74557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f74558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f74559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f74560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f74561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SparseIntArray f74562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f74563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<b> f74564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c.a f74565q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayout$LayoutParams.class */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f74567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f74568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f74570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f74572g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f74573i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f74574j;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayout$LayoutParams$a.class */
        public final class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i7) {
                return new LayoutParams[i7];
            }
        }

        public LayoutParams(int i7, int i8) {
            super(new ViewGroup.LayoutParams(i7, i8));
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Cn0.a.f1638b);
            this.f74566a = typedArrayObtainStyledAttributes.getInt(8, 1);
            this.f74567b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            this.f74568c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            this.f74569d = typedArrayObtainStyledAttributes.getInt(0, -1);
            this.f74570e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f74571f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f74572g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, ViewCompat.MEASURED_SIZE_MASK);
            this.f74573i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, ViewCompat.MEASURED_SIZE_MASK);
            this.f74574j = typedArrayObtainStyledAttributes.getBoolean(9, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z6 = false;
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
            this.f74566a = parcel.readInt();
            this.f74567b = parcel.readFloat();
            this.f74568c = parcel.readFloat();
            this.f74569d = parcel.readInt();
            this.f74570e = parcel.readFloat();
            this.f74571f = parcel.readInt();
            this.f74572g = parcel.readInt();
            this.h = parcel.readInt();
            this.f74573i = parcel.readInt();
            this.f74574j = parcel.readByte() != 0 ? true : z6;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f74566a = 1;
            this.f74567b = 0.0f;
            this.f74568c = 1.0f;
            this.f74569d = -1;
            this.f74570e = -1.0f;
            this.f74571f = -1;
            this.f74572g = -1;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
            this.f74573i = ViewCompat.MEASURED_SIZE_MASK;
            this.f74566a = layoutParams.f74566a;
            this.f74567b = layoutParams.f74567b;
            this.f74568c = layoutParams.f74568c;
            this.f74569d = layoutParams.f74569d;
            this.f74570e = layoutParams.f74570e;
            this.f74571f = layoutParams.f74571f;
            this.f74572g = layoutParams.f74572g;
            this.h = layoutParams.h;
            this.f74573i = layoutParams.f74573i;
            this.f74574j = layoutParams.f74574j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getAlignSelf() {
            return this.f74569d;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.f74570e;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public float getFlexGrow() {
            return this.f74567b;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public float getFlexShrink() {
            return this.f74568c;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f74573i;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMaxWidth() {
            return this.h;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMinHeight() {
            return this.f74572g;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getMinWidth() {
            return this.f74571f;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getOrder() {
            return this.f74566a;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.f74574j;
        }

        public void setAlignSelf(int i7) {
            this.f74569d = i7;
        }

        public void setFlexBasisPercent(float f7) {
            this.f74570e = f7;
        }

        public void setFlexGrow(float f7) {
            this.f74567b = f7;
        }

        public void setFlexShrink(float f7) {
            this.f74568c = f7;
        }

        public void setHeight(int i7) {
            ((ViewGroup.MarginLayoutParams) this).height = i7;
        }

        public void setMaxHeight(int i7) {
            this.f74573i = i7;
        }

        public void setMaxWidth(int i7) {
            this.h = i7;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public void setMinHeight(int i7) {
            this.f74572g = i7;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public void setMinWidth(int i7) {
            this.f74571f = i7;
        }

        public void setOrder(int i7) {
            this.f74566a = i7;
        }

        public void setWidth(int i7) {
            ((ViewGroup.MarginLayoutParams) this).width = i7;
        }

        public void setWrapBefore(boolean z6) {
            this.f74574j = z6;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f74566a);
            parcel.writeFloat(this.f74567b);
            parcel.writeFloat(this.f74568c);
            parcel.writeInt(this.f74569d);
            parcel.writeFloat(this.f74570e);
            parcel.writeInt(this.f74571f);
            parcel.writeInt(this.f74572g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.f74573i);
            parcel.writeByte(this.f74574j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.c$a, java.lang.Object] */
    public FlexboxLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f74555f = -1;
        this.f74563o = new c(this);
        this.f74564p = new ArrayList();
        this.f74565q = new Object();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Cn0.a.f1637a, i7, 0);
        this.f74550a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f74551b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f74552c = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f74553d = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f74554e = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f74555f = typedArrayObtainStyledAttributes.getInt(7, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i8 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i8 != 0) {
            this.f74558j = i8;
        }
        int i9 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i9 != 0) {
            this.f74557i = i9;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z6, boolean z7) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f74564p.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f74564p.get(i7);
            for (int i8 = 0; i8 < bVar.h; i8++) {
                int i9 = bVar.f74638o + i8;
                View reorderedChildAt = getReorderedChildAt(i9);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (e(i9, i8)) {
                        d(canvas, z6 ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f74560l, bVar.f74626b, bVar.f74631g);
                    }
                    if (i8 == bVar.h - 1 && (this.f74558j & 4) > 0) {
                        d(canvas, z6 ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f74560l : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, bVar.f74626b, bVar.f74631g);
                    }
                }
            }
            if (f(i7)) {
                c(canvas, paddingLeft, z7 ? bVar.f74628d : bVar.f74626b - this.f74559k, iMax);
            }
            if (g(i7) && (this.f74557i & 4) > 0) {
                c(canvas, paddingLeft, z7 ? bVar.f74626b - this.f74559k : bVar.f74628d, iMax);
            }
        }
    }

    public void addToParent(ViewGroup viewGroup, int i7, int i8, int i9, int i10, int i11) {
        if (viewGroup == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.startToStart = i8;
        layoutParams.topToBottom = i9;
        layoutParams.endToEnd = i10;
        layoutParams.bottomToBottom = i11;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((5 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        setLayoutParams(layoutParams);
        viewGroup.addView(this, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.f74562n == null) {
            this.f74562n = new SparseIntArray(getChildCount());
        }
        c cVar = this.f74563o;
        SparseIntArray sparseIntArray = this.f74562n;
        a aVar = cVar.f74642a;
        int flexItemCount = aVar.getFlexItemCount();
        List<c.b> listF = cVar.f(flexItemCount);
        c.b bVar = new c.b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f74650b = 1;
        } else {
            bVar.f74650b = ((FlexItem) layoutParams).getOrder();
        }
        if (i7 == -1 || i7 == flexItemCount || i7 >= aVar.getFlexItemCount()) {
            bVar.f74649a = flexItemCount;
        } else {
            bVar.f74649a = i7;
            for (int i8 = i7; i8 < flexItemCount; i8++) {
                ((c.b) ((ArrayList) listF).get(i8)).f74649a++;
            }
        }
        ((ArrayList) listF).add(bVar);
        this.f74561m = c.r(flexItemCount + 1, listF, sparseIntArray);
        super.addView(view, i7, layoutParams);
    }

    public final void b(Canvas canvas, boolean z6, boolean z7) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f74564p.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f74564p.get(i7);
            for (int i8 = 0; i8 < bVar.h; i8++) {
                int i9 = bVar.f74638o + i8;
                View reorderedChildAt = getReorderedChildAt(i9);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (e(i9, i8)) {
                        c(canvas, bVar.f74625a, z7 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f74559k, bVar.f74631g);
                    }
                    if (i8 == bVar.h - 1 && (this.f74557i & 4) > 0) {
                        c(canvas, bVar.f74625a, z7 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f74559k : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, bVar.f74631g);
                    }
                }
            }
            if (f(i7)) {
                d(canvas, z6 ? bVar.f74627c : bVar.f74625a - this.f74560l, paddingTop, iMax);
            }
            if (g(i7) && (this.f74558j & 4) > 0) {
                d(canvas, z6 ? bVar.f74625a - this.f74560l : bVar.f74627c, paddingTop, iMax);
            }
        }
    }

    public final void c(Canvas canvas, int i7, int i8, int i9) {
        Drawable drawable = this.f74556g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i8, i9 + i7, this.f74559k + i8);
        this.f74556g.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i7, int i8, int i9) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i8, this.f74560l + i7, i9 + i8);
        this.h.draw(canvas);
    }

    public final boolean e(int i7, int i8) {
        for (int i9 = 1; i9 <= i8; i9++) {
            View reorderedChildAt = getReorderedChildAt(i7 - i9);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.f74558j & 2) != 0;
                }
                return (this.f74557i & 2) != 0;
            }
        }
        if (!isMainAxisDirectionHorizontal()) {
            return (this.f74557i & 1) != 0;
        }
        return (this.f74558j & 1) != 0;
    }

    public final boolean f(int i7) {
        boolean z6 = false;
        if (i7 >= 0) {
            if (i7 >= this.f74564p.size()) {
                z6 = false;
            } else {
                for (int i8 = 0; i8 < i7; i8++) {
                    if (this.f74564p.get(i8).a() > 0) {
                        if (isMainAxisDirectionHorizontal()) {
                            return (this.f74557i & 2) != 0;
                        }
                        return (this.f74558j & 2) != 0;
                    }
                }
                if (isMainAxisDirectionHorizontal()) {
                    return (this.f74557i & 1) != 0;
                }
                z6 = false;
                if ((this.f74558j & 1) != 0) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final boolean g(int i7) {
        boolean z6 = false;
        if (i7 >= 0) {
            if (i7 < this.f74564p.size()) {
                do {
                    i7++;
                    if (i7 >= this.f74564p.size()) {
                        if (isMainAxisDirectionHorizontal()) {
                            boolean z7 = false;
                            if ((this.f74557i & 4) != 0) {
                                z7 = true;
                            }
                            return z7;
                        }
                        z6 = false;
                        if ((this.f74558j & 4) != 0) {
                            z6 = true;
                        }
                    }
                } while (this.f74564p.get(i7).a() <= 0);
                return false;
            }
            z6 = false;
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getAlignContent() {
        return this.f74554e;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getAlignItems() {
        return this.f74553d;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getChildHeightMeasureSpec(int i7, int i8, int i9) {
        return ViewGroup.getChildMeasureSpec(i7, i8, i9);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getChildWidthMeasureSpec(int i7, int i8, int i9) {
        return ViewGroup.getChildMeasureSpec(i7, i8, i9);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getDecorationLengthMainAxis(View view, int i7, int i8) {
        int i9;
        int i10;
        int i11 = 0;
        if (isMainAxisDirectionHorizontal()) {
            if (e(i7, i8)) {
                i11 = this.f74560l;
            }
            i9 = i11;
            if ((this.f74558j & 4) > 0) {
                i10 = this.f74560l;
                i9 = i11 + i10;
            }
        } else {
            i11 = 0;
            if (e(i7, i8)) {
                i11 = this.f74559k;
            }
            i9 = i11;
            if ((this.f74557i & 4) > 0) {
                i10 = this.f74559k;
                i9 = i11 + i10;
            }
        }
        return i9;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f74556g;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getFlexDirection() {
        return this.f74550a;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public View getFlexItemAt(int i7) {
        return getChildAt(i7);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f74564p.size());
        for (b bVar : this.f74564p) {
            if (bVar.a() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.f74564p;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getFlexWrap() {
        return this.f74551b;
    }

    public int getJustifyContent() {
        return this.f74552c;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getLargestMainSize() {
        Iterator<b> it = this.f74564p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (true) {
            int i7 = iMax;
            if (!it.hasNext()) {
                return i7;
            }
            iMax = Math.max(i7, it.next().f74629e);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getMaxLine() {
        return this.f74555f;
    }

    public View getReorderedChildAt(int i7) {
        if (i7 < 0) {
            return null;
        }
        int[] iArr = this.f74561m;
        if (i7 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i7]);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public View getReorderedFlexItemAt(int i7) {
        return getReorderedChildAt(i7);
    }

    public int getShowDividerHorizontal() {
        return this.f74557i;
    }

    public int getShowDividerVertical() {
        return this.f74558j;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f74564p.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = this.f74564p.get(i8);
            int i9 = i7;
            if (f(i8)) {
                i9 = i7 + (isMainAxisDirectionHorizontal() ? this.f74559k : this.f74560l);
            }
            int i10 = i9;
            if (g(i8)) {
                i10 = i9 + (isMainAxisDirectionHorizontal() ? this.f74559k : this.f74560l);
            }
            i7 = i10 + bVar.f74631g;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayout.h(int, int, int, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r11, int r12, int r13, int r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayout.i(int, int, int, int, boolean, boolean):void");
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public boolean isMainAxisDirectionHorizontal() {
        int i7 = this.f74550a;
        boolean z6 = true;
        if (i7 != 0) {
            z6 = i7 == 1;
        }
        return z6;
    }

    public final void j(int i7, int i8, int i9, int i10) {
        int paddingBottom;
        int largestMainSize;
        int i11;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (i7 == 0 || i7 == 1) {
            int sumOfCrossSize = getSumOfCrossSize();
            paddingBottom = getPaddingBottom() + getPaddingTop() + sumOfCrossSize;
            largestMainSize = getLargestMainSize();
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new IllegalArgumentException(C3259x.a(i7, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            int sumOfCrossSize2 = getSumOfCrossSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + sumOfCrossSize2;
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i10 = View.combineMeasuredStates(i10, 16777216);
                i11 = size;
            } else {
                i11 = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(i11, i8, i10);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i8, i10);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(C3259x.a(mode, "Unknown width mode is set: "));
            }
            int iCombineMeasuredStates = i10;
            if (size < largestMainSize) {
                iCombineMeasuredStates = View.combineMeasuredStates(i10, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i8, iCombineMeasuredStates);
            i10 = iCombineMeasuredStates;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i10 = View.combineMeasuredStates(i10, 256);
                paddingBottom = size2;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i9, i10);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i9, i10);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(C3259x.a(mode2, "Unknown height mode is set: "));
            }
            int iCombineMeasuredStates2 = i10;
            if (size2 < paddingBottom) {
                iCombineMeasuredStates2 = View.combineMeasuredStates(i10, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i9, iCombineMeasuredStates2);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.h == null && this.f74556g == null) {
            return;
        }
        if (this.f74557i == 0 && this.f74558j == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i7 = this.f74550a;
        boolean z6 = false;
        boolean z7 = true;
        if (i7 == 0) {
            boolean z8 = layoutDirection == 1;
            if (this.f74551b == 2) {
                z6 = true;
            }
            a(canvas, z8, z6);
            return;
        }
        if (i7 == 1) {
            boolean z9 = layoutDirection != 1;
            boolean z10 = false;
            if (this.f74551b == 2) {
                z10 = true;
            }
            a(canvas, z9, z10);
            return;
        }
        if (i7 == 2) {
            if (layoutDirection != 1) {
                z7 = false;
            }
            boolean z11 = z7;
            if (this.f74551b == 2) {
                z11 = !z7;
            }
            b(canvas, z11, false);
            return;
        }
        if (i7 != 3) {
            return;
        }
        boolean z12 = false;
        if (layoutDirection == 1) {
            z12 = true;
        }
        boolean z13 = z12;
        if (this.f74551b == 2) {
            z13 = !z12;
        }
        b(canvas, z13, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i11 = this.f74550a;
        boolean z7 = false;
        if (i11 == 0) {
            h(i7, i8, i9, i10, layoutDirection == 1);
            return;
        }
        if (i11 == 1) {
            h(i7, i8, i9, i10, layoutDirection != 1);
            return;
        }
        if (i11 == 2) {
            boolean z8 = false;
            if (layoutDirection == 1) {
                z8 = true;
            }
            if (this.f74551b == 2) {
                z8 = !z8;
            }
            i(i7, i8, i9, i10, z8, false);
            return;
        }
        if (i11 != 3) {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f74550a);
        }
        if (layoutDirection == 1) {
            z7 = true;
        }
        if (this.f74551b == 2) {
            z7 = !z7;
        }
        i(i7, i8, i9, i10, z7, true);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        if (this.f74562n == null) {
            this.f74562n = new SparseIntArray(getChildCount());
        }
        c cVar = this.f74563o;
        SparseIntArray sparseIntArray = this.f74562n;
        a aVar = cVar.f74642a;
        int flexItemCount = aVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            c cVar2 = this.f74563o;
            SparseIntArray sparseIntArray2 = this.f74562n;
            int flexItemCount2 = cVar2.f74642a.getFlexItemCount();
            this.f74561m = c.r(flexItemCount2, cVar2.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i9 = 0; i9 < flexItemCount; i9++) {
            View flexItemAt = aVar.getFlexItemAt(i9);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i9)) {
                c cVar22 = this.f74563o;
                SparseIntArray sparseIntArray22 = this.f74562n;
                int flexItemCount22 = cVar22.f74642a.getFlexItemCount();
                this.f74561m = c.r(flexItemCount22, cVar22.f(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i10 = this.f74550a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f74550a);
            }
            this.f74564p.clear();
            c.a aVar2 = this.f74565q;
            aVar2.f74647a = null;
            aVar2.f74648b = 0;
            this.f74563o.b(aVar2, i8, i7, Integer.MAX_VALUE, 0, -1, null);
            this.f74564p = this.f74565q.f74647a;
            this.f74563o.h(i7, i8, 0);
            this.f74563o.g(i7, i8, getPaddingRight() + getPaddingLeft());
            this.f74563o.u(0);
            j(this.f74550a, i7, i8, this.f74565q.f74648b);
            return;
        }
        this.f74564p.clear();
        c.a aVar3 = this.f74565q;
        aVar3.f74647a = null;
        aVar3.f74648b = 0;
        this.f74563o.b(aVar3, i7, i8, Integer.MAX_VALUE, 0, -1, null);
        this.f74564p = this.f74565q.f74647a;
        this.f74563o.h(i7, i8, 0);
        if (this.f74553d == 3) {
            for (b bVar : this.f74564p) {
                int i11 = Integer.MIN_VALUE;
                int i12 = 0;
                while (i12 < bVar.h) {
                    View reorderedChildAt = getReorderedChildAt(bVar.f74638o + i12);
                    int iMax = i11;
                    if (reorderedChildAt != null) {
                        if (reorderedChildAt.getVisibility() == 8) {
                            iMax = i11;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            iMax = this.f74551b != 2 ? Math.max(i11, reorderedChildAt.getMeasuredHeight() + Math.max(bVar.f74635l - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i11, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (bVar.f74635l - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                    i12++;
                    i11 = iMax;
                }
                bVar.f74631g = i11;
            }
        }
        this.f74563o.g(i7, i8, getPaddingBottom() + getPaddingTop());
        this.f74563o.u(0);
        j(this.f74550a, i7, i8, this.f74565q.f74648b);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public void onNewFlexItemAdded(View view, int i7, int i8, b bVar) {
        if (e(i7, i8)) {
            if (isMainAxisDirectionHorizontal()) {
                int i9 = bVar.f74629e;
                int i10 = this.f74560l;
                bVar.f74629e = i9 + i10;
                bVar.f74630f += i10;
                return;
            }
            int i11 = bVar.f74629e;
            int i12 = this.f74559k;
            bVar.f74629e = i11 + i12;
            bVar.f74630f += i12;
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public void onNewFlexLineAdded(b bVar) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.f74558j & 4) > 0) {
                int i7 = bVar.f74629e;
                int i8 = this.f74560l;
                bVar.f74629e = i7 + i8;
                bVar.f74630f += i8;
                return;
            }
            return;
        }
        if ((this.f74557i & 4) > 0) {
            int i9 = bVar.f74629e;
            int i10 = this.f74559k;
            bVar.f74629e = i9 + i10;
            bVar.f74630f += i10;
        }
    }

    public void removeFromParent(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void setAlignContent(int i7) {
        if (this.f74554e != i7) {
            this.f74554e = i7;
            requestLayout();
        }
    }

    public void setAlignItems(int i7) {
        if (this.f74553d != i7) {
            this.f74553d = i7;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f74556g) {
            return;
        }
        this.f74556g = drawable;
        if (drawable != null) {
            this.f74559k = drawable.getIntrinsicHeight();
        } else {
            this.f74559k = 0;
        }
        boolean z6 = false;
        if (this.f74556g == null) {
            z6 = false;
            if (this.h == null) {
                z6 = true;
            }
        }
        setWillNotDraw(z6);
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.f74560l = drawable.getIntrinsicWidth();
        } else {
            this.f74560l = 0;
        }
        boolean z6 = false;
        if (this.f74556g == null) {
            z6 = false;
            if (this.h == null) {
                z6 = true;
            }
        }
        setWillNotDraw(z6);
        requestLayout();
    }

    public void setFlexDirection(int i7) {
        if (this.f74550a != i7) {
            this.f74550a = i7;
            requestLayout();
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public void setFlexLines(List<b> list) {
        this.f74564p = list;
    }

    public void setFlexWrap(int i7) {
        if (this.f74551b != i7) {
            this.f74551b = i7;
            requestLayout();
        }
    }

    public void setJustifyContent(int i7) {
        if (this.f74552c != i7) {
            this.f74552c = i7;
            requestLayout();
        }
    }

    public void setMaxLine(int i7) {
        if (this.f74555f != i7) {
            this.f74555f = i7;
            requestLayout();
        }
    }

    public void setShowDivider(int i7) {
        setShowDividerVertical(i7);
        setShowDividerHorizontal(i7);
    }

    public void setShowDividerHorizontal(int i7) {
        if (i7 != this.f74557i) {
            this.f74557i = i7;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i7) {
        if (i7 != this.f74558j) {
            this.f74558j = i7;
            requestLayout();
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public void updateViewCache(int i7, View view) {
    }
}
