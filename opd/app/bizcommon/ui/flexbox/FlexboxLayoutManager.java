package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.C3269h;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.opd.app.bizcommon.ui.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager.class */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements com.bilibili.opd.app.bizcommon.ui.flexbox.a, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Rect f74575z = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74582g;
    public List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f74583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView.Recycler f74584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView.State f74585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f74586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f74587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OrientationHelper f74588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OrientationHelper f74589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SavedState f74590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f74591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f74592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f74593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f74594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray<View> f74595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f74596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f74597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f74598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c.a f74599y;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$LayoutParams.class */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f74600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f74601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f74603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f74606g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f74607i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$LayoutParams$a.class */
        public final class a implements Parcelable.Creator<LayoutParams> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, androidx.recyclerview.widget.RecyclerView$LayoutParams, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$LayoutParams] */
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                ?? layoutParams = new RecyclerView.LayoutParams(-2, -2);
                layoutParams.f74600a = 0.0f;
                layoutParams.f74601b = 1.0f;
                layoutParams.f74602c = -1;
                layoutParams.f74603d = -1.0f;
                layoutParams.f74606g = ViewCompat.MEASURED_SIZE_MASK;
                layoutParams.h = ViewCompat.MEASURED_SIZE_MASK;
                layoutParams.f74600a = parcel.readFloat();
                layoutParams.f74601b = parcel.readFloat();
                layoutParams.f74602c = parcel.readInt();
                layoutParams.f74603d = parcel.readFloat();
                layoutParams.f74604e = parcel.readInt();
                layoutParams.f74605f = parcel.readInt();
                layoutParams.f74606g = parcel.readInt();
                layoutParams.h = parcel.readInt();
                layoutParams.f74607i = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i7) {
                return new LayoutParams[i7];
            }
        }

        public LayoutParams() {
            super(-2, -2);
            this.f74600a = 0.0f;
            this.f74601b = 1.0f;
            this.f74602c = -1;
            this.f74603d = -1.0f;
            this.f74606g = ViewCompat.MEASURED_SIZE_MASK;
            this.h = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getAlignSelf() {
            return this.f74602c;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final float getFlexBasisPercent() {
            return this.f74603d;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final float getFlexGrow() {
            return this.f74600a;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final float getFlexShrink() {
            return this.f74601b;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMaxHeight() {
            return this.h;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMaxWidth() {
            return this.f74606g;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMinHeight() {
            return this.f74605f;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getMinWidth() {
            return this.f74604e;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final boolean isWrapBefore() {
            return this.f74607i;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final void setMinHeight(int i7) {
            this.f74605f = i7;
        }

        @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem
        public final void setMinWidth(int i7) {
            this.f74604e = i7;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeFloat(this.f74600a);
            parcel.writeFloat(this.f74601b);
            parcel.writeInt(this.f74602c);
            parcel.writeFloat(this.f74603d);
            parcel.writeInt(this.f74604e);
            parcel.writeInt(this.f74605f);
            parcel.writeInt(this.f74606g);
            parcel.writeInt(this.h);
            parcel.writeByte(this.f74607i ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$SavedState.class */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74609b;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$SavedState$a.class */
        public final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f74608a = parcel.readInt();
                obj.f74609b = parcel.readInt();
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f74608a);
            sb.append(", mAnchorOffset=");
            return C3269h.a(sb, this.f74609b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f74608a);
            parcel.writeInt(this.f74609b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74613d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74616g;
        public final FlexboxLayoutManager h;

        public a(FlexboxLayoutManager flexboxLayoutManager) {
            this.h = flexboxLayoutManager;
        }

        public static void a(a aVar) {
            FlexboxLayoutManager flexboxLayoutManager = aVar.h;
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.f74581f) {
                aVar.f74612c = aVar.f74614e ? flexboxLayoutManager.f74588n.getEndAfterPadding() : flexboxLayoutManager.f74588n.getStartAfterPadding();
            } else {
                aVar.f74612c = aVar.f74614e ? flexboxLayoutManager.f74588n.getEndAfterPadding() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.f74588n.getStartAfterPadding();
            }
        }

        public static void b(a aVar) {
            aVar.f74610a = -1;
            aVar.f74611b = -1;
            aVar.f74612c = Integer.MIN_VALUE;
            boolean z6 = false;
            aVar.f74615f = false;
            aVar.f74616g = false;
            FlexboxLayoutManager flexboxLayoutManager = aVar.h;
            if (!flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                int i7 = flexboxLayoutManager.f74577b;
                if (i7 == 0) {
                    if (flexboxLayoutManager.f74576a == 3) {
                        z6 = true;
                    }
                    aVar.f74614e = z6;
                    return;
                } else {
                    boolean z7 = false;
                    if (i7 == 2) {
                        z7 = true;
                    }
                    aVar.f74614e = z7;
                    return;
                }
            }
            int i8 = flexboxLayoutManager.f74577b;
            if (i8 == 0) {
                boolean z8 = false;
                if (flexboxLayoutManager.f74576a == 1) {
                    z8 = true;
                }
                aVar.f74614e = z8;
                return;
            }
            boolean z9 = false;
            if (i8 == 2) {
                z9 = true;
            }
            aVar.f74614e = z9;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f74610a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f74611b);
            sb.append(", mCoordinate=");
            sb.append(this.f74612c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.f74613d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f74614e);
            sb.append(", mValid=");
            sb.append(this.f74615f);
            sb.append(", mAssignedFromSavedState=");
            return O4.a.b(sb, this.f74616g, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/FlexboxLayoutManager$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f74618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f74623g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f74624i;

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f74617a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f74619c);
            sb.append(", mPosition=");
            sb.append(this.f74620d);
            sb.append(", mOffset=");
            sb.append(this.f74621e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f74622f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.f74623g);
            sb.append(", mItemDirection=1, mLayoutDirection=");
            return C3269h.a(sb, this.h, '}');
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.c$a, java.lang.Object] */
    public FlexboxLayoutManager(Context context, int i7) {
        this.f74580e = -1;
        this.h = new ArrayList();
        this.f74583i = new c(this);
        this.f74587m = new a(this);
        this.f74591q = -1;
        this.f74592r = Integer.MIN_VALUE;
        this.f74593s = Integer.MIN_VALUE;
        this.f74594t = Integer.MIN_VALUE;
        this.f74595u = new SparseArray<>();
        this.f74598x = -1;
        this.f74599y = new Object();
        p(0);
        q(1);
        if (this.f74579d != 4) {
            removeAllViews();
            this.h.clear();
            a aVar = this.f74587m;
            a.b(aVar);
            aVar.f74613d = 0;
            this.f74579d = 4;
            requestLayout();
        }
        this.f74596v = context;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.c$a, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f74580e = -1;
        this.h = new ArrayList();
        this.f74583i = new c(this);
        this.f74587m = new a(this);
        this.f74591q = -1;
        this.f74592r = Integer.MIN_VALUE;
        this.f74593s = Integer.MIN_VALUE;
        this.f74594t = Integer.MIN_VALUE;
        this.f74595u = new SparseArray<>();
        this.f74598x = -1;
        this.f74599y = new Object();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i8);
        int i9 = properties.orientation;
        if (i9 != 0) {
            if (i9 == 1) {
                if (properties.reverseLayout) {
                    p(3);
                } else {
                    p(2);
                }
            }
        } else if (properties.reverseLayout) {
            p(1);
        } else {
            p(0);
        }
        q(1);
        if (this.f74579d != 4) {
            removeAllViews();
            this.h.clear();
            a aVar = this.f74587m;
            a.b(aVar);
            aVar.f74613d = 0;
            this.f74579d = 4;
            requestLayout();
        }
        this.f74596v = context;
    }

    public static boolean isMeasurementUpToDate(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        boolean z6 = false;
        if (i9 > 0 && i7 != i9) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            if (size >= i7) {
                z6 = true;
            }
            return z6;
        }
        if (mode == 0) {
            return true;
        }
        if (mode != 1073741824) {
            return false;
        }
        boolean z7 = false;
        if (size == i7) {
            z7 = true;
        }
        return z7;
    }

    public final void c() {
        if (this.f74588n != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.f74577b == 0) {
                this.f74588n = OrientationHelper.createHorizontalHelper(this);
                this.f74589o = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.f74588n = OrientationHelper.createVerticalHelper(this);
                this.f74589o = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.f74577b == 0) {
            this.f74588n = OrientationHelper.createVerticalHelper(this);
            this.f74589o = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.f74588n = OrientationHelper.createHorizontalHelper(this);
            this.f74589o = OrientationHelper.createVerticalHelper(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean canScrollHorizontally() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.f74577b
            if (r0 != 0) goto Lc
            r0 = r3
            boolean r0 = r0.isMainAxisDirectionHorizontal()
            return r0
        Lc:
            r0 = r3
            boolean r0 = r0.isMainAxisDirectionHorizontal()
            if (r0 == 0) goto L35
            r0 = r3
            int r0 = r0.getWidth()
            r5 = r0
            r0 = r3
            android.view.View r0 = r0.f74597w
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            int r0 = r0.getWidth()
            r4 = r0
            goto L30
        L2e:
            r0 = 0
            r4 = r0
        L30:
            r0 = r5
            r1 = r4
            if (r0 <= r1) goto L37
        L35:
            r0 = 1
            r6 = r0
        L37:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.canScrollHorizontally():boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.f74577b == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        boolean z6 = true;
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.f74597w;
            z6 = height > (view != null ? view.getHeight() : 0);
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        c();
        View viewE = e(itemCount);
        View viewG = g(itemCount);
        if (state.getItemCount() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        return Math.min(this.f74588n.getTotalSpace(), this.f74588n.getDecoratedEnd(viewG) - this.f74588n.getDecoratedStart(viewE));
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewE = e(itemCount);
        View viewG = g(itemCount);
        if (state.getItemCount() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        int position = getPosition(viewE);
        int position2 = getPosition(viewG);
        int iAbs = Math.abs(this.f74588n.getDecoratedEnd(viewG) - this.f74588n.getDecoratedStart(viewE));
        int i7 = this.f74583i.f74644c[position];
        if (i7 == 0 || i7 == -1) {
            return 0;
        }
        return Math.round((i7 * (iAbs / ((r0[position2] - i7) + 1))) + (this.f74588n.getStartAfterPadding() - this.f74588n.getDecoratedStart(viewE)));
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewE = e(itemCount);
        View viewG = g(itemCount);
        if (state.getItemCount() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        View viewI = i(0, getChildCount());
        int position = -1;
        int position2 = viewI == null ? -1 : getPosition(viewI);
        View viewI2 = i(getChildCount() - 1, -1);
        if (viewI2 != null) {
            position = getPosition(viewI2);
        }
        return (int) ((Math.abs(this.f74588n.getDecoratedEnd(viewG) - this.f74588n.getDecoratedStart(viewE)) / ((position - position2) + 1)) * state.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i7) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i8 = i7 < getPosition(childAt) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i8) : new PointF(i8, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return computeScrollRange(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x085c, code lost:
    
        r0 = r13.f74617a - r21;
        r13.f74617a = r0;
        r0 = r13.f74622f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0875, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0878, code lost:
    
        r0 = r0 + r21;
        r13.f74622f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0887, code lost:
    
        if (r0 >= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x088a, code lost:
    
        r13.f74622f = r0 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0893, code lost:
    
        n(r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x08a0, code lost:
    
        return r0 - r13.f74617a;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.b r13) {
        /*
            Method dump skipped, instruction units count: 2209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.d(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$b):int");
    }

    public final View e(int i7) {
        View viewJ = j(0, getChildCount(), i7);
        if (viewJ == null) {
            return null;
        }
        int i8 = this.f74583i.f74644c[getPosition(viewJ)];
        if (i8 == -1) {
            return null;
        }
        return f(viewJ, this.h.get(i8));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View f(android.view.View r5, com.bilibili.opd.app.bizcommon.ui.flexbox.b r6) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.isMainAxisDirectionHorizontal()
            r9 = r0
            r0 = r6
            int r0 = r0.h
            r8 = r0
            r0 = 1
            r7 = r0
        Le:
            r0 = r7
            r1 = r8
            if (r0 >= r1) goto L77
            r0 = r4
            r1 = r7
            android.view.View r0 = r0.getChildAt(r1)
            r10 = r0
            r0 = r5
            r6 = r0
            r0 = r10
            if (r0 == 0) goto L6f
            r0 = r10
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L31
            r0 = r5
            r6 = r0
            goto L6f
        L31:
            r0 = r4
            boolean r0 = r0.f74581f
            if (r0 == 0) goto L56
            r0 = r9
            if (r0 != 0) goto L56
            r0 = r5
            r6 = r0
            r0 = r4
            androidx.recyclerview.widget.OrientationHelper r0 = r0.f74588n
            r1 = r5
            int r0 = r0.getDecoratedEnd(r1)
            r1 = r4
            androidx.recyclerview.widget.OrientationHelper r1 = r1.f74588n
            r2 = r10
            int r1 = r1.getDecoratedEnd(r2)
            if (r0 >= r1) goto L6f
            goto L6c
        L56:
            r0 = r5
            r6 = r0
            r0 = r4
            androidx.recyclerview.widget.OrientationHelper r0 = r0.f74588n
            r1 = r5
            int r0 = r0.getDecoratedStart(r1)
            r1 = r4
            androidx.recyclerview.widget.OrientationHelper r1 = r1.f74588n
            r2 = r10
            int r1 = r1.getDecoratedStart(r2)
            if (r0 <= r1) goto L6f
        L6c:
            r0 = r10
            r6 = r0
        L6f:
            int r7 = r7 + 1
            r0 = r6
            r5 = r0
            goto Le
        L77:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.f(android.view.View, com.bilibili.opd.app.bizcommon.ui.flexbox.b):android.view.View");
    }

    public final int fixLayoutEndGap(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z6) {
        int iK;
        int endAfterPadding;
        if (isMainAxisDirectionHorizontal() || !this.f74581f) {
            int endAfterPadding2 = this.f74588n.getEndAfterPadding() - i7;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iK = -k(-endAfterPadding2, recycler, state);
        } else {
            int startAfterPadding = i7 - this.f74588n.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iK = k(startAfterPadding, recycler, state);
        }
        if (!z6 || (endAfterPadding = this.f74588n.getEndAfterPadding() - (i7 + iK)) <= 0) {
            return iK;
        }
        this.f74588n.offsetChildren(endAfterPadding);
        return endAfterPadding + iK;
    }

    public final int fixLayoutStartGap(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z6) {
        int iK;
        if (isMainAxisDirectionHorizontal() || !this.f74581f) {
            int startAfterPadding = i7 - this.f74588n.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iK = -k(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding = this.f74588n.getEndAfterPadding() - i7;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iK = k(-endAfterPadding, recycler, state);
        }
        int i8 = iK;
        if (z6) {
            int startAfterPadding2 = (i7 + iK) - this.f74588n.getStartAfterPadding();
            i8 = iK;
            if (startAfterPadding2 > 0) {
                this.f74588n.offsetChildren(-startAfterPadding2);
                i8 = iK - startAfterPadding2;
            }
        }
        return i8;
    }

    public final View g(int i7) {
        View viewJ = j(getChildCount() - 1, -1, i7);
        if (viewJ == null) {
            return null;
        }
        return h(viewJ, this.h.get(this.f74583i.f74644c[getPosition(viewJ)]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutParams, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$LayoutParams] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ?? layoutParams = new RecyclerView.LayoutParams(context, attributeSet);
        layoutParams.f74600a = 0.0f;
        layoutParams.f74601b = 1.0f;
        layoutParams.f74602c = -1;
        layoutParams.f74603d = -1.0f;
        layoutParams.f74606g = ViewCompat.MEASURED_SIZE_MASK;
        layoutParams.h = ViewCompat.MEASURED_SIZE_MASK;
        return layoutParams;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getAlignItems() {
        return this.f74579d;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getChildHeightMeasureSpec(int i7, int i8, int i9) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i8, i9, canScrollVertically());
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getChildWidthMeasureSpec(int i7, int i8, int i9) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i8, i9, canScrollHorizontally());
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getDecorationLengthMainAxis(View view, int i7, int i8) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getFlexDirection() {
        return this.f74576a;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final View getFlexItemAt(int i7) {
        View view = this.f74595u.get(i7);
        return view != null ? view : this.f74584j.getViewForPosition(i7);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getFlexItemCount() {
        return this.f74585k.getItemCount();
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> getFlexLinesInternal() {
        return this.h;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getFlexWrap() {
        return this.f74577b;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getLargestMainSize() {
        if (this.h.isEmpty()) {
            return 0;
        }
        int size = this.h.size();
        int iMax = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            iMax = Math.max(iMax, this.h.get(i7).f74629e);
        }
        return iMax;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getMaxLine() {
        return this.f74580e;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final View getReorderedFlexItemAt(int i7) {
        return getFlexItemAt(i7);
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final int getSumOfCrossSize() {
        int size = this.h.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += this.h.get(i8).f74631g;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View h(android.view.View r5, com.bilibili.opd.app.bizcommon.ui.flexbox.b r6) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.isMainAxisDirectionHorizontal()
            r10 = r0
            r0 = r4
            int r0 = r0.getChildCount()
            r1 = 2
            int r0 = r0 - r1
            r7 = r0
            r0 = r4
            int r0 = r0.getChildCount()
            r9 = r0
            r0 = r6
            int r0 = r0.h
            r8 = r0
            r0 = r5
            r6 = r0
        L1b:
            r0 = r7
            r1 = r9
            r2 = r8
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 - r2
            if (r0 <= r1) goto L89
            r0 = r4
            r1 = r7
            android.view.View r0 = r0.getChildAt(r1)
            r11 = r0
            r0 = r6
            r5 = r0
            r0 = r11
            if (r0 == 0) goto L81
            r0 = r11
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L43
            r0 = r6
            r5 = r0
            goto L81
        L43:
            r0 = r4
            boolean r0 = r0.f74581f
            if (r0 == 0) goto L68
            r0 = r10
            if (r0 != 0) goto L68
            r0 = r6
            r5 = r0
            r0 = r4
            androidx.recyclerview.widget.OrientationHelper r0 = r0.f74588n
            r1 = r6
            int r0 = r0.getDecoratedStart(r1)
            r1 = r4
            androidx.recyclerview.widget.OrientationHelper r1 = r1.f74588n
            r2 = r11
            int r1 = r1.getDecoratedStart(r2)
            if (r0 <= r1) goto L81
            goto L7e
        L68:
            r0 = r6
            r5 = r0
            r0 = r4
            androidx.recyclerview.widget.OrientationHelper r0 = r0.f74588n
            r1 = r6
            int r0 = r0.getDecoratedEnd(r1)
            r1 = r4
            androidx.recyclerview.widget.OrientationHelper r1 = r1.f74588n
            r2 = r11
            int r1 = r1.getDecoratedEnd(r2)
            if (r0 >= r1) goto L81
        L7e:
            r0 = r11
            r5 = r0
        L81:
            int r7 = r7 + (-1)
            r0 = r5
            r6 = r0
            goto L1b
        L89:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.h(android.view.View, com.bilibili.opd.app.bizcommon.ui.flexbox.b):android.view.View");
    }

    public final View i(int i7, int i8) {
        int i9 = i8 > i7 ? 1 : -1;
        while (i7 != i8) {
            View childAt = getChildAt(i7);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int decoratedLeft = getDecoratedLeft(childAt);
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int decoratedTop = getDecoratedTop(childAt);
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int decoratedRight = getDecoratedRight(childAt);
            int i12 = ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
            RecyclerView.LayoutParams layoutParams4 = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int decoratedBottom = getDecoratedBottom(childAt);
            int i13 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
            boolean z6 = false;
            boolean z7 = decoratedLeft - i10 >= width - paddingRight || decoratedRight + i12 >= paddingLeft;
            if (decoratedTop - i11 >= height - paddingBottom || decoratedBottom + i13 >= paddingTop) {
                z6 = true;
            }
            if (z7 && z6) {
                return childAt;
            }
            i7 += i9;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final boolean isMainAxisDirectionHorizontal() {
        int i7 = this.f74576a;
        boolean z6 = true;
        if (i7 != 0) {
            z6 = i7 == 1;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$b, java.lang.Object] */
    public final View j(int i7, int i8, int i9) {
        View view;
        View view2;
        c();
        int i10 = 1;
        if (this.f74586l == null) {
            ?? obj = new Object();
            obj.h = 1;
            this.f74586l = obj;
        }
        int startAfterPadding = this.f74588n.getStartAfterPadding();
        int endAfterPadding = this.f74588n.getEndAfterPadding();
        if (i8 <= i7) {
            i10 = -1;
        }
        View view3 = null;
        View view4 = null;
        while (true) {
            View view5 = view4;
            if (i7 == i8) {
                if (view3 == null) {
                    view3 = view5;
                }
                return view3;
            }
            View childAt = getChildAt(i7);
            if (childAt == null) {
                view = view3;
                view2 = view5;
            } else {
                int position = getPosition(childAt);
                view = view3;
                view2 = view5;
                if (position >= 0) {
                    view = view3;
                    view2 = view5;
                    if (position >= i9) {
                        continue;
                    } else if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                        view = view3;
                        view2 = view5;
                        if (view5 == null) {
                            view2 = childAt;
                            view = view3;
                        }
                    } else {
                        if (this.f74588n.getDecoratedStart(childAt) >= startAfterPadding && this.f74588n.getDecoratedEnd(childAt) <= endAfterPadding) {
                            return childAt;
                        }
                        view = view3;
                        view2 = view5;
                        if (view3 == null) {
                            view = childAt;
                            view2 = view5;
                        }
                    }
                } else {
                    continue;
                }
            }
            i7 += i10;
            view3 = view;
            view4 = view2;
        }
    }

    public final int k(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        c();
        this.f74586l.f74624i = true;
        boolean z6 = !isMainAxisDirectionHorizontal() && this.f74581f;
        int i8 = (!z6 ? i7 > 0 : i7 < 0) ? -1 : 1;
        int iAbs = Math.abs(i7);
        this.f74586l.h = i8;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z7 = !zIsMainAxisDirectionHorizontal && this.f74581f;
        c cVar = this.f74583i;
        if (i8 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null) {
                this.f74586l.f74621e = this.f74588n.getDecoratedEnd(childAt);
                int position = getPosition(childAt);
                View viewH = h(childAt, this.h.get(cVar.f74644c[position]));
                b bVar = this.f74586l;
                bVar.getClass();
                int i9 = position + 1;
                bVar.f74620d = i9;
                int[] iArr = cVar.f74644c;
                if (iArr.length <= i9) {
                    bVar.f74619c = -1;
                } else {
                    bVar.f74619c = iArr[i9];
                }
                if (z7) {
                    bVar.f74621e = this.f74588n.getDecoratedStart(viewH);
                    this.f74586l.f74622f = this.f74588n.getStartAfterPadding() + (-this.f74588n.getDecoratedStart(viewH));
                    b bVar2 = this.f74586l;
                    bVar2.f74622f = Math.max(bVar2.f74622f, 0);
                } else {
                    bVar.f74621e = this.f74588n.getDecoratedEnd(viewH);
                    this.f74586l.f74622f = this.f74588n.getDecoratedEnd(viewH) - this.f74588n.getEndAfterPadding();
                }
                int i10 = this.f74586l.f74619c;
                if ((i10 == -1 || i10 > this.h.size() - 1) && this.f74586l.f74620d <= this.f74585k.getItemCount()) {
                    b bVar3 = this.f74586l;
                    int i11 = iAbs - bVar3.f74622f;
                    c.a aVar = this.f74599y;
                    aVar.f74647a = null;
                    aVar.f74648b = 0;
                    if (i11 > 0) {
                        if (zIsMainAxisDirectionHorizontal) {
                            this.f74583i.b(aVar, iMakeMeasureSpec, iMakeMeasureSpec2, i11, bVar3.f74620d, -1, this.h);
                        } else {
                            this.f74583i.b(aVar, iMakeMeasureSpec2, iMakeMeasureSpec, i11, bVar3.f74620d, -1, this.h);
                        }
                        cVar.h(iMakeMeasureSpec, iMakeMeasureSpec2, this.f74586l.f74620d);
                        cVar.u(this.f74586l.f74620d);
                    }
                }
                b bVar4 = this.f74586l;
                bVar4.f74617a = iAbs - bVar4.f74622f;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null) {
                this.f74586l.f74621e = this.f74588n.getDecoratedStart(childAt2);
                int position2 = getPosition(childAt2);
                View viewF = f(childAt2, this.h.get(cVar.f74644c[position2]));
                b bVar5 = this.f74586l;
                bVar5.getClass();
                int i12 = cVar.f74644c[position2];
                int i13 = i12;
                if (i12 == -1) {
                    i13 = 0;
                }
                if (i13 > 0) {
                    this.f74586l.f74620d = position2 - this.h.get(i13 - 1).h;
                } else {
                    bVar5.f74620d = -1;
                }
                b bVar6 = this.f74586l;
                bVar6.f74619c = i13 > 0 ? i13 - 1 : 0;
                if (z7) {
                    bVar6.f74621e = this.f74588n.getDecoratedEnd(viewF);
                    this.f74586l.f74622f = this.f74588n.getDecoratedEnd(viewF) - this.f74588n.getEndAfterPadding();
                    b bVar7 = this.f74586l;
                    bVar7.f74622f = Math.max(bVar7.f74622f, 0);
                } else {
                    bVar6.f74621e = this.f74588n.getDecoratedStart(viewF);
                    this.f74586l.f74622f = this.f74588n.getStartAfterPadding() + (-this.f74588n.getDecoratedStart(viewF));
                }
                b bVar42 = this.f74586l;
                bVar42.f74617a = iAbs - bVar42.f74622f;
            }
        }
        b bVar8 = this.f74586l;
        int iD = d(recycler, state, bVar8) + bVar8.f74622f;
        if (iD < 0) {
            return 0;
        }
        if (z6) {
            if (iAbs > iD) {
                i7 = (-i8) * iD;
            }
        } else if (iAbs > iD) {
            i7 = i8 * iD;
        }
        this.f74588n.offsetChildren(-i7);
        this.f74586l.f74623g = i7;
        return i7;
    }

    public final int m(int i7) {
        int i8;
        int iMin;
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        c();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.f74597w;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        a aVar = this.f74587m;
        if (layoutDirection == 1) {
            int iAbs = Math.abs(i7);
            if (i7 < 0) {
                iMin = -Math.min((width2 + aVar.f74613d) - width, iAbs);
            } else {
                int i9 = aVar.f74613d;
                iMin = i7;
                if (i9 + i7 > 0) {
                    i8 = i9;
                }
            }
        } else if (i7 > 0) {
            iMin = Math.min((width2 - aVar.f74613d) - width, i7);
        } else {
            int i10 = aVar.f74613d;
            i8 = i10;
            iMin = i10 + i7 >= 0 ? i7 : -i8;
        }
        return iMin;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.recyclerview.widget.RecyclerView.Recycler r5, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.b r6) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.n(androidx.recyclerview.widget.RecyclerView$Recycler, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$b):void");
    }

    public final void o() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.f74586l.f74618b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f74597w = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i7, int i8) {
        super.onItemsAdded(recyclerView, i7, i8);
        t(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(@NonNull RecyclerView recyclerView, int i7, int i8, int i9) {
        super.onItemsMoved(recyclerView, i7, i8, i9);
        t(Math.min(i7, i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i7, int i8) {
        super.onItemsRemoved(recyclerView, i7, i8);
        t(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i8) {
        super.onItemsUpdated(recyclerView, i7, i8);
        t(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i8, Object obj) {
        super.onItemsUpdated(recyclerView, i7, i8, obj);
        t(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARN: Type inference failed for: r0v376, types: [com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$b, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r10, androidx.recyclerview.widget.RecyclerView.State r11) {
        /*
            Method dump skipped, instruction units count: 2089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f74590p = null;
        this.f74591q = -1;
        this.f74592r = Integer.MIN_VALUE;
        this.f74598x = -1;
        a.b(this.f74587m);
        this.f74595u.clear();
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final void onNewFlexItemAdded(View view, int i7, int i8, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar) {
        calculateItemDecorationsForChild(view, f74575z);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            bVar.f74629e += rightDecorationWidth;
            bVar.f74630f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        bVar.f74629e += bottomDecorationHeight;
        bVar.f74630f += bottomDecorationHeight;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final void onNewFlexLineAdded(com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f74590p = (SavedState) parcelable;
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.os.Parcelable, com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager$SavedState, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        if (this.f74590p != null) {
            SavedState savedState = this.f74590p;
            ?? obj = new Object();
            obj.f74608a = savedState.f74608a;
            obj.f74609b = savedState.f74609b;
            return obj;
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f74608a = getPosition(childAt);
            savedState2.f74609b = this.f74588n.getDecoratedStart(childAt) - this.f74588n.getStartAfterPadding();
        } else {
            savedState2.f74608a = -1;
        }
        return savedState2;
    }

    public final void p(int i7) {
        if (this.f74576a != i7) {
            removeAllViews();
            this.f74576a = i7;
            this.f74588n = null;
            this.f74589o = null;
            this.h.clear();
            a aVar = this.f74587m;
            a.b(aVar);
            aVar.f74613d = 0;
            requestLayout();
        }
    }

    public final void q(int i7) {
        int i8 = this.f74577b;
        if (i8 != 1) {
            if (i8 == 0) {
                removeAllViews();
                this.h.clear();
                a aVar = this.f74587m;
                a.b(aVar);
                aVar.f74613d = 0;
            }
            this.f74577b = 1;
            this.f74588n = null;
            this.f74589o = null;
            requestLayout();
        }
    }

    public final void r(int i7) {
        if (this.f74578c != 2) {
            this.f74578c = 2;
            requestLayout();
        }
    }

    public final boolean s(View view, int i7, int i8, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() || this.f74577b == 0) {
            int iK = k(i7, recycler, state);
            this.f74595u.clear();
            return iK;
        }
        int iM = m(i7);
        this.f74587m.f74613d += iM;
        this.f74589o.offsetChildren(-iM);
        return iM;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        this.f74591q = i7;
        this.f74592r = Integer.MIN_VALUE;
        SavedState savedState = this.f74590p;
        if (savedState != null) {
            savedState.f74608a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() || (this.f74577b == 0 && !isMainAxisDirectionHorizontal())) {
            int iK = k(i7, recycler, state);
            this.f74595u.clear();
            return iK;
        }
        int iM = m(i7);
        this.f74587m.f74613d += iM;
        this.f74589o.offsetChildren(-iM);
        return iM;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final void setFlexLines(List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> list) {
        this.h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i7);
        startSmoothScroll(linearSmoothScroller);
    }

    public final void t(int i7) {
        int position = -1;
        View viewI = i(getChildCount() - 1, -1);
        if (viewI != null) {
            position = getPosition(viewI);
        }
        if (i7 >= position) {
            return;
        }
        int childCount = getChildCount();
        c cVar = this.f74583i;
        cVar.j(childCount);
        cVar.k(childCount);
        cVar.i(childCount);
        if (i7 >= cVar.f74644c.length) {
            return;
        }
        this.f74598x = i7;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f74591q = getPosition(childAt);
        if (isMainAxisDirectionHorizontal() || !this.f74581f) {
            this.f74592r = this.f74588n.getDecoratedStart(childAt) - this.f74588n.getStartAfterPadding();
        } else {
            this.f74592r = this.f74588n.getEndPadding() + this.f74588n.getDecoratedEnd(childAt);
        }
    }

    public final void u(a aVar, boolean z6, boolean z7) {
        int i7;
        if (z7) {
            o();
        } else {
            this.f74586l.f74618b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f74581f) {
            this.f74586l.f74617a = this.f74588n.getEndAfterPadding() - aVar.f74612c;
        } else {
            this.f74586l.f74617a = aVar.f74612c - getPaddingRight();
        }
        b bVar = this.f74586l;
        bVar.f74620d = aVar.f74610a;
        bVar.h = 1;
        bVar.f74621e = aVar.f74612c;
        bVar.f74622f = Integer.MIN_VALUE;
        bVar.f74619c = aVar.f74611b;
        if (!z6 || this.h.size() <= 1 || (i7 = aVar.f74611b) < 0 || i7 >= this.h.size() - 1) {
            return;
        }
        com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar2 = this.h.get(aVar.f74611b);
        b bVar3 = this.f74586l;
        bVar3.f74619c++;
        bVar3.f74620d += bVar2.h;
    }

    @Override // com.bilibili.opd.app.bizcommon.ui.flexbox.a
    public final void updateViewCache(int i7, View view) {
        this.f74595u.put(i7, view);
    }

    public final void v(a aVar, boolean z6, boolean z7) {
        if (z7) {
            o();
        } else {
            this.f74586l.f74618b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.f74581f) {
            this.f74586l.f74617a = aVar.f74612c - this.f74588n.getStartAfterPadding();
        } else {
            this.f74586l.f74617a = (this.f74597w.getWidth() - aVar.f74612c) - this.f74588n.getStartAfterPadding();
        }
        b bVar = this.f74586l;
        bVar.f74620d = aVar.f74610a;
        bVar.h = -1;
        bVar.f74621e = aVar.f74612c;
        bVar.f74622f = Integer.MIN_VALUE;
        int i7 = aVar.f74611b;
        bVar.f74619c = i7;
        if (!z6 || i7 <= 0) {
            return;
        }
        int size = this.h.size();
        int i8 = aVar.f74611b;
        if (size > i8) {
            com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar2 = this.h.get(i8);
            b bVar3 = this.f74586l;
            bVar3.f74619c--;
            bVar3.f74620d -= bVar2.h;
        }
    }
}
