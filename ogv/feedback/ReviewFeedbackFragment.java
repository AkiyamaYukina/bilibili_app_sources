package com.bilibili.ogv.feedback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bilibili.droid.BundleUtil;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/feedback/ReviewFeedbackFragment.class */
public final class ReviewFeedbackFragment extends BaseBangumiFeedbackFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ReviewMediaBase f67601o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f67600n = 391;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Integer> f67602p = MapsKt.mapOf(TuplesKt.to(2131309788, 2131856375));

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final void nf() {
        Bundle bundle;
        Bundle arguments = getArguments();
        this.f67601o = (arguments == null || (bundle = arguments.getBundle(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE)) == null) ? null : (ReviewMediaBase) bundle.getParcelable("DATA");
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final int of() {
        return 2131309788;
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    @NotNull
    public final ConstraintRadioGroup pf(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
        return (ConstraintRadioGroup) layoutInflater.inflate(2131493302, viewGroup, false);
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    @NotNull
    public final String qf() {
        StringBuilder sb = new StringBuilder(getString(2131856376));
        ReviewMediaBase reviewMediaBase = this.f67601o;
        if (reviewMediaBase != null) {
            String str = reviewMediaBase.f71704b;
            if (str != null && str.length() != 0) {
                sb.append(getString(2131856365, reviewMediaBase.f71704b));
            }
            sb.append(getString(2131856364, String.valueOf(reviewMediaBase.f71703a)));
            int i7 = this.f67588k;
            if (i7 > -1) {
                sb.append(getString(this.f67602p.get(Integer.valueOf(i7)).intValue()));
            }
            String string = StringsKt.trim(this.f67582d.getText().toString()).toString();
            if (string.length() > 0) {
                sb.append(getString(2131856383));
                sb.append(string);
            }
        }
        return sb.toString();
    }

    @Override // com.bilibili.ogv.feedback.BaseBangumiFeedbackFragment
    public final int rf() {
        return this.f67600n;
    }
}
