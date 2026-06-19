package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/BasePreferenceFragment.class */
public abstract class BasePreferenceFragment extends PreferenceFragmentCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f78516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f78519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f78520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78521g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f78524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f78525l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/BasePreferenceFragment$a.class */
    public final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f78526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f78527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f78528c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BasePreferenceFragment f78529d;

        public a(BasePreferenceFragment basePreferenceFragment) {
            this.f78529d = basePreferenceFragment;
        }

        public final boolean a(View view, RecyclerView recyclerView) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof androidx.preference.h) || !((androidx.preference.h) childViewHolder).f52143e) {
                return false;
            }
            boolean z6 = this.f78528c;
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
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (a(view, recyclerView)) {
                rect.bottom = this.f78527b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.f78526a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = recyclerView.getChildAt(i7);
                if (a(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    Drawable drawable = this.f78526a;
                    BasePreferenceFragment basePreferenceFragment = this.f78529d;
                    drawable.setBounds(basePreferenceFragment.f78517c, height, width - basePreferenceFragment.f78518d, this.f78527b + height);
                    this.f78526a.draw(canvas);
                }
            }
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        fragmentActivityP3.getTheme().resolveAttribute(2130970536, typedValue, true);
        this.f78516b = new ContextThemeWrapper(p3(), typedValue.resourceId);
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = this.f78516b;
        if (context == null) {
            return viewOnCreateView;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, fl.a.c, 2130970528, 2131886196);
        this.f78517c = (int) typedArrayObtainStyledAttributes.getDimension(4, this.f78517c);
        this.f78518d = (int) typedArrayObtainStyledAttributes.getDimension(5, this.f78518d);
        this.f78522i = (int) typedArrayObtainStyledAttributes.getDimension(0, this.f78522i);
        this.f78523j = (int) typedArrayObtainStyledAttributes.getDimension(1, this.f78523j);
        this.f78524k = (int) typedArrayObtainStyledAttributes.getDimension(2, this.f78524k);
        this.f78525l = (int) typedArrayObtainStyledAttributes.getDimension(3, this.f78525l);
        typedArrayObtainStyledAttributes.recycle();
        RecyclerView listView = getListView();
        if (listView != null) {
            listView.setPadding(this.f78522i, this.f78523j, this.f78524k, this.f78525l);
            listView.setClipChildren(false);
            listView.setClipToPadding(false);
        }
        if (this.f78517c <= 0 && this.f78518d <= 0) {
            return viewOnCreateView;
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f78516b.obtainStyledAttributes(null, androidx.preference.i.h, 2130970528, 0);
        this.f78520f = new ColorDrawable(ThemeUtils.getColorById(p3(), typedArrayObtainStyledAttributes2.getResourceId(1, 0)));
        this.f78521g = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, -1);
        this.h = typedArrayObtainStyledAttributes2.getBoolean(3, true);
        typedArrayObtainStyledAttributes2.recycle();
        return viewOnCreateView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f78517c > 0 || this.f78518d > 0) {
            RecyclerView listView = getListView();
            listView.removeItemDecorationAt(0);
            a aVar = new a(this);
            this.f78519e = aVar;
            listView.addItemDecoration(aVar);
            setDivider(this.f78520f);
            int i7 = this.f78521g;
            if (i7 != -1) {
                setDividerHeight(i7);
            }
            this.f78519e.f78528c = this.h;
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final void setDivider(Drawable drawable) {
        a aVar = this.f78519e;
        if (aVar == null) {
            super.setDivider(drawable);
            return;
        }
        if (drawable != null) {
            aVar.getClass();
            aVar.f78527b = drawable.getIntrinsicHeight();
        } else {
            aVar.f78527b = 0;
        }
        aVar.f78526a = drawable;
        aVar.f78529d.getListView().invalidateItemDecorations();
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public final void setDividerHeight(int i7) {
        a aVar = this.f78519e;
        if (aVar == null) {
            super.setDividerHeight(i7);
        } else {
            aVar.f78527b = i7;
            aVar.f78529d.getListView().invalidateItemDecorations();
        }
    }
}
