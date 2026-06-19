package com.bilibili.search2.result.holder.author;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.inline.Option;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/InlineSettingBottomDialog.class */
@StabilityInferred(parameters = 0)
public final class InlineSettingBottomDialog extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public RecyclerView f87808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f87809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f87810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LinearLayout f87811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public o f87812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Function1<? super Option, Unit> f87813g;

    @Nullable
    public Function0<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87814i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public List<Option> f87815j;

    /* JADX WARN: Multi-variable type inference failed */
    public static void hf(InlineSettingBottomDialog inlineSettingBottomDialog, BottomSheetBehavior bottomSheetBehavior, DialogInterface dialogInterface) {
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityCreated(@Nullable Bundle bundle) {
        View viewFindViewById;
        RecyclerView recyclerView;
        super/*androidx.fragment.app.DialogFragment*/.onActivityCreated(bundle);
        View view = getView();
        this.f87808b = view != null ? (RecyclerView) view.findViewById(2131305122) : null;
        View view2 = getView();
        this.f87809c = view2 != null ? (TextView) view2.findViewById(2131300094) : null;
        View view3 = getView();
        this.f87810d = view3 != null ? view3.findViewById(2131299397) : null;
        View view4 = getView();
        this.f87811e = view4 != null ? (LinearLayout) view4.findViewById(2131301318) : null;
        this.f87812f = new o(new BJ.g(this, 1));
        if (this.f87814i && (recyclerView = this.f87808b) != null) {
            recyclerView.addItemDecoration(new q(this, R$color.Ga2, ListExtentionsKt.toPx(0.5d), ListExtentionsKt.toPx(12)));
        }
        RecyclerView recyclerView2 = this.f87808b;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView3 = this.f87808b;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f87812f);
        }
        View view5 = getView();
        BottomSheetBehavior bottomSheetBehaviorFrom = null;
        if (view5 != null) {
            View viewFindViewById2 = view5.findViewById(2131297542);
            bottomSheetBehaviorFrom = null;
            if (viewFindViewById2 != null) {
                bottomSheetBehaviorFrom = BottomSheetBehavior.from((View) viewFindViewById2.getParent());
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            final BottomSheetBehavior bottomSheetBehavior = bottomSheetBehaviorFrom;
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener(this, bottomSheetBehavior) { // from class: com.bilibili.search2.result.holder.author.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InlineSettingBottomDialog f87888a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BottomSheetBehavior f87889b;

                {
                    this.f87888a = this;
                    this.f87889b = bottomSheetBehavior;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    InlineSettingBottomDialog.hf(this.f87888a, this.f87889b, dialogInterface);
                }
            });
        }
        View view6 = getView();
        if (view6 == null || (viewFindViewById = view6.findViewById(2131297884)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new OV.d(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(2131494764, viewGroup, false);
    }
}
