package com.bilibili.playerbizcommon.features.danmaku.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerCheckBoxGroup.class */
public class PlayerCheckBoxGroup extends LinearLayout implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<CompoundButton> f79699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Integer> f79700b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerCheckBoxGroup$a.class */
    public interface a {
    }

    public PlayerCheckBoxGroup(Context context) {
        super(context);
        this.f79699a = new ArrayList();
        this.f79700b = new ArrayList<>();
    }

    public PlayerCheckBoxGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79699a = new ArrayList();
        this.f79700b = new ArrayList<>();
    }

    public final void a(@NonNull View view) {
        if (view instanceof CompoundButton) {
            CompoundButton compoundButton = (CompoundButton) view;
            this.f79699a.add(compoundButton);
            compoundButton.setChecked(this.f79700b.contains(Integer.valueOf(view.getId())));
            compoundButton.setOnCheckedChangeListener(this);
        }
    }

    public final void b() {
        for (CompoundButton compoundButton : this.f79699a) {
            compoundButton.setChecked(this.f79700b.contains(Integer.valueOf(compoundButton.getId())));
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
    }

    public void setCheckedCompoundButtons(List<Integer> list) {
        if (((ArrayList) this.f79699a).isEmpty()) {
            ((ArrayList) this.f79699a).clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount = viewGroup.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        a(viewGroup.getChildAt(i8));
                    }
                } else {
                    a(childAt);
                }
            }
            b();
        }
        this.f79700b.clear();
        if (list == null || list.size() == 0) {
            b();
        } else {
            this.f79700b.addAll(list);
            b();
        }
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
