package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.Fragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/G.class */
public final class G implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73759c;

    public G(Ref.LongRef longRef, View view, MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73757a = longRef;
        this.f73758b = view;
        this.f73759c = mallMediaTakePhotoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73757a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment = this.f73759c;
        MallMediaRootFragment mallMediaRootFragment = null;
        mallMediaTakePhotoFragment.f73864k = null;
        ImageView imageView = mallMediaTakePhotoFragment.f73859e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = mallMediaTakePhotoFragment.f73860f;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        ImageView imageView3 = mallMediaTakePhotoFragment.f73861g;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = mallMediaTakePhotoFragment.f73858d;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        TextView textView = mallMediaTakePhotoFragment.h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (!mallMediaTakePhotoFragment.f73863j) {
            mallMediaTakePhotoFragment.f73863j = true;
        }
        if (mallMediaTakePhotoFragment.getParentFragment() instanceof MallMediaRootFragment) {
            Fragment parentFragment = mallMediaTakePhotoFragment.getParentFragment();
            if (parentFragment instanceof MallMediaRootFragment) {
                mallMediaRootFragment = (MallMediaRootFragment) parentFragment;
            }
            if (mallMediaRootFragment != null) {
                mallMediaRootFragment.showBottom(false);
            }
        }
        mallMediaTakePhotoFragment.f73857c.setVisibility(4);
        Drawable drawable = AppCompatResources.getDrawable(mallMediaTakePhotoFragment.requireContext(), 2131231978);
        if (drawable != null) {
            mallMediaTakePhotoFragment.f73857c.getGenericProperties().setImage(drawable);
        }
    }
}
