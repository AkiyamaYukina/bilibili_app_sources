package com.bilibili.lib.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BasePreferenceFragment.class */
public abstract class BasePreferenceFragment extends PreferenceFragmentCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TypedArray f64713a;
    private View contentView;
    private boolean mAllowDividerAfterLastItem;
    private a mDecoration;
    private LayerDrawable mDivider;
    private int mDividerHeight;
    private int mLeftDividerOffset;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    private int mRightDividerOffset;
    private Context mStyledContext;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BasePreferenceFragment$a.class */
    public final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f64714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f64716c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BasePreferenceFragment f64717d;

        public a(BasePreferenceFragment basePreferenceFragment) {
            this.f64717d = basePreferenceFragment;
        }

        public final boolean a(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof androidx.preference.h) || !((androidx.preference.h) childViewHolder).f52143e) {
                return false;
            }
            boolean z6 = this.f64716c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild < recyclerView.getChildCount() - 1) {
                RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
                z6 = false;
                if (childViewHolder2 instanceof androidx.preference.h) {
                    z6 = false;
                    if (((androidx.preference.h) childViewHolder2).f52142d) {
                        z6 = true;
                    }
                }
            }
            return z6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            if (a(view, recyclerView)) {
                rect.bottom = this.f64715b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            if (this.f64714a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                if (a(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f64714a.setBounds(recyclerView.getPaddingLeft(), height, (width - recyclerView.getPaddingRight()) - this.f64717d.mRightDividerOffset, this.f64715b + height);
                    this.f64714a.draw(canvas);
                }
            }
        }
    }

    private void applyPaddings() {
        RecyclerView listView = getListView();
        if (listView != null) {
            listView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
        }
    }

    private boolean isOffsetValid() {
        return this.mLeftDividerOffset > 0 || this.mRightDividerOffset > 0;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        fragmentActivityP3.getTheme().resolveAttribute(2130970536, typedValue, true);
        this.mStyledContext = new ContextThemeWrapper(p3(), typedValue.resourceId);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.contentView = viewOnCreateView;
        Context context = this.mStyledContext;
        if (context == null) {
            return viewOnCreateView;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, L.f64790a, 2130970528, 0);
        this.mLeftDividerOffset = (int) typedArrayObtainStyledAttributes.getDimension(4, this.mLeftDividerOffset);
        this.mRightDividerOffset = (int) typedArrayObtainStyledAttributes.getDimension(5, this.mRightDividerOffset);
        this.mPaddingLeft = (int) typedArrayObtainStyledAttributes.getDimension(0, this.mPaddingLeft);
        this.mPaddingTop = (int) typedArrayObtainStyledAttributes.getDimension(1, this.mPaddingTop);
        this.mPaddingRight = (int) typedArrayObtainStyledAttributes.getDimension(2, this.mPaddingRight);
        this.mPaddingBottom = (int) typedArrayObtainStyledAttributes.getDimension(3, this.mPaddingBottom);
        typedArrayObtainStyledAttributes.recycle();
        RecyclerView listView = getListView();
        if (listView != null) {
            listView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            listView.setClipChildren(false);
            listView.setClipToPadding(false);
        }
        if (!isOffsetValid()) {
            return this.contentView;
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.mStyledContext.obtainStyledAttributes(null, androidx.preference.i.h, 2130970528, 0);
        this.mDivider = new LayerDrawable(new Drawable[]{new ColorDrawable(ContextCompat.getColor(this.mStyledContext, R$color.f64616Wh0)), new InsetDrawable((Drawable) new ColorDrawable(ThemeUtils.getColorById(p3(), typedArrayObtainStyledAttributes2.getResourceId(1, 0))), this.mLeftDividerOffset, 0, 0, 0)});
        this.mDividerHeight = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, -1);
        this.mAllowDividerAfterLastItem = typedArrayObtainStyledAttributes2.getBoolean(3, true);
        typedArrayObtainStyledAttributes2.recycle();
        return this.contentView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (isOffsetValid()) {
            RecyclerView listView = getListView();
            listView.removeItemDecorationAt(0);
            a aVar = new a(this);
            this.mDecoration = aVar;
            listView.addItemDecoration(aVar);
            setDivider(this.mDivider);
            int i7 = this.mDividerHeight;
            if (i7 != -1) {
                setDividerHeight(i7);
            }
            this.mDecoration.f64716c = this.mAllowDividerAfterLastItem;
        }
    }

    public void refreshLine() {
        Context context = this.mStyledContext;
        if (context == null) {
            return;
        }
        this.f64713a = context.obtainStyledAttributes(null, androidx.preference.i.h, 2130970528, 0);
        int colorById = ThemeUtils.getColorById(p3(), this.f64713a.getResourceId(1, 0));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(ContextCompat.getColor(this.mStyledContext, R$color.f64616Wh0)), new InsetDrawable((Drawable) new ColorDrawable(colorById), this.mLeftDividerOffset, 0, 0, 0)});
        this.mDivider = layerDrawable;
        setDivider(layerDrawable);
        this.f64713a.recycle();
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void setDivider(Drawable drawable) {
        a aVar = this.mDecoration;
        if (aVar == null) {
            super.setDivider(drawable);
            return;
        }
        if (drawable != null) {
            aVar.getClass();
            aVar.f64715b = drawable.getIntrinsicHeight();
        } else {
            aVar.f64715b = 0;
        }
        aVar.f64714a = drawable;
        RecyclerView listView = aVar.f64717d.getListView();
        if (listView != null) {
            listView.invalidateItemDecorations();
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void setDividerHeight(int i7) {
        a aVar = this.mDecoration;
        if (aVar == null) {
            super.setDividerHeight(i7);
            return;
        }
        aVar.f64715b = i7;
        RecyclerView listView = aVar.f64717d.getListView();
        if (listView != null) {
            listView.invalidateItemDecorations();
        }
    }

    public final void setDividerPadding(int i7, int i8) {
        this.mLeftDividerOffset = i7;
        this.mRightDividerOffset = i8;
        refreshLine();
    }

    public final void setPaddingBottom(int i7) {
        this.mPaddingBottom = i7;
        applyPaddings();
    }

    public final void setPaddingLeft(int i7) {
        this.mPaddingLeft = i7;
        applyPaddings();
    }

    public final void setPaddingRight(int i7) {
        this.mPaddingRight = i7;
        applyPaddings();
    }

    public final void setPaddingTop(int i7) {
        this.mPaddingTop = i7;
        applyPaddings();
    }
}
