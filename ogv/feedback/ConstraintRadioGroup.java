package com.bilibili.ogv.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment;
import com.bilibili.ogv.feedback.ConstraintRadioGroup;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/ConstraintRadioGroup.class */
public final class ConstraintRadioGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b f67593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final vj0.b f67595c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/ConstraintRadioGroup$a.class */
    public final class a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintRadioGroup f67596a;

        public a(ConstraintRadioGroup constraintRadioGroup) {
            this.f67596a = constraintRadioGroup;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (Intrinsics.areEqual(this.f67596a, view) && (view2 instanceof RadioButton)) {
                ((RadioButton) view2).setOnCheckedChangeListener(this.f67596a.f67595c);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            if (Intrinsics.areEqual(this.f67596a, view) && (view2 instanceof RadioButton)) {
                ((RadioButton) view2).setOnCheckedChangeListener(null);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/ConstraintRadioGroup$b.class */
    public interface b {
    }

    @JvmOverloads
    public ConstraintRadioGroup(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public ConstraintRadioGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [vj0.b] */
    public ConstraintRadioGroup(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f67594b = -1;
        setOnHierarchyChangeListener(new a(this));
        this.f67595c = new CompoundButton.OnCheckedChangeListener(this) { // from class: vj0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConstraintRadioGroup f128269a;

            {
                this.f128269a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                View viewFindViewById;
                ConstraintRadioGroup constraintRadioGroup = this.f128269a;
                int i9 = constraintRadioGroup.f67594b;
                if (i9 != -1 && (viewFindViewById = constraintRadioGroup.findViewById(i9)) != null && (viewFindViewById instanceof RadioButton)) {
                    ((RadioButton) viewFindViewById).setChecked(false);
                }
                int id = compoundButton.getId();
                constraintRadioGroup.f67594b = id;
                Vd1.b bVar = constraintRadioGroup.f67593a;
                if (bVar != null) {
                    BaseBangumiFeedbackFragment baseBangumiFeedbackFragment = (BaseBangumiFeedbackFragment) bVar.a;
                    baseBangumiFeedbackFragment.f67588k = id;
                    baseBangumiFeedbackFragment.mf();
                }
            }
        };
    }

    public final void setOnCheckedChangeListener(@NotNull b bVar) {
        this.f67593a = bVar;
    }
}
