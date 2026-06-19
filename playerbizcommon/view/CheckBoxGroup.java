package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/CheckBoxGroup.class */
public final class CheckBoxGroup extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CompoundButton f80329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<CompoundButton> f80330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ArrayList<Integer> f80331d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/CheckBoxGroup$a.class */
    public interface a {
    }

    public CheckBoxGroup(@NotNull Context context) {
        super(context);
        this.f80330c = new ArrayList();
        this.f80328a = getContext().getResources().getDimensionPixelSize(2131166860);
        this.f80331d = new ArrayList<>();
    }

    public CheckBoxGroup(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80330c = new ArrayList();
        this.f80328a = getContext().getResources().getDimensionPixelSize(2131166860);
        this.f80331d = new ArrayList<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        if (this.f80330c.size() <= 0) {
            return true;
        }
        float x6 = motionEvent.getX();
        for (CompoundButton compoundButton : this.f80330c) {
            if (x6 >= compoundButton.getLeft() - this.f80328a && x6 <= compoundButton.getRight() + this.f80328a && !compoundButton.isChecked() && compoundButton.isShown()) {
                CompoundButton compoundButton2 = this.f80329b;
                if (compoundButton2 != null) {
                    compoundButton2.setChecked(false);
                }
                this.f80329b = compoundButton;
                compoundButton.setChecked(true);
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((ArrayList) this.f80330c).isEmpty()) {
            ((ArrayList) this.f80330c).clear();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = viewGroup.getChildAt(i8);
                        if (childAt2 instanceof CompoundButton) {
                            ((ArrayList) this.f80330c).add(childAt2);
                            ((CompoundButton) childAt2).setOnCheckedChangeListener(this);
                        }
                    }
                } else if (childAt instanceof CompoundButton) {
                    ((ArrayList) this.f80330c).add(childAt);
                    ((CompoundButton) childAt).setOnCheckedChangeListener(this);
                }
            }
            for (CompoundButton compoundButton : (ArrayList) this.f80330c) {
                compoundButton.setChecked(this.f80331d.contains(Integer.valueOf(compoundButton.getId())));
            }
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(@NotNull CompoundButton compoundButton, boolean z6) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (!z6 || getMeasuredWidth() == 0) {
            return;
        }
        for (CompoundButton compoundButton : (ArrayList) this.f80330c) {
            if (compoundButton.getRight() + this.f80328a >= getMeasuredWidth()) {
                compoundButton.setVisibility(4);
            } else {
                compoundButton.setVisibility(getMeasuredWidth() > 0 ? 0 : 8);
            }
        }
    }

    public final void setOnCheckedChangeListener(@NotNull a aVar) {
    }
}
