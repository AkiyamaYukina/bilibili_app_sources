package com.bilibili.ogv.review.reviewpublish;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import j5.C7642d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class ReviewShareDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReviewShareFragment f72463b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareDialogFragment$a.class */
    public static final class a {
        public static ReviewShareDialogFragment a(ReviewShareData reviewShareData) {
            ReviewShareDialogFragment reviewShareDialogFragment = new ReviewShareDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", reviewShareData);
            bundle.putString("page_name", null);
            bundle.putBoolean("should_show_background", false);
            bundle.putBoolean("is_newly_published_review", false);
            reviewShareDialogFragment.setArguments(bundle);
            return reviewShareDialogFragment;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ReviewShareFragment reviewShareFragment = new ReviewShareFragment();
        this.f72463b = reviewShareFragment;
        reviewShareFragment.setArguments(requireArguments());
        ReviewShareFragment reviewShareFragment2 = this.f72463b;
        ReviewShareFragment reviewShareFragment3 = reviewShareFragment2;
        if (reviewShareFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewShareFragment");
            reviewShareFragment3 = null;
        }
        reviewShareFragment3.f72475l = new E90.d(this, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            C7642d.a(window, 0);
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(ViewCompat.generateViewId());
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int id = frameLayout.getId();
        ReviewShareFragment reviewShareFragment = this.f72463b;
        ReviewShareFragment reviewShareFragment2 = reviewShareFragment;
        if (reviewShareFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reviewShareFragment");
            reviewShareFragment2 = null;
        }
        fragmentTransactionBeginTransaction.replace(id, reviewShareFragment2).commitAllowingStateLoss();
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
    }
}
