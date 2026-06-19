package com.bilibili.upper.widget.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/a.class */
public class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f114488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animator f114493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animator f114494g;
    public Animator h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animator f114495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f114496j;

    /* JADX INFO: renamed from: com.bilibili.upper.widget.circleindicator.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/a$a.class */
    public interface InterfaceC1238a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/a$b.class */
    public static final class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            return Math.abs(1.0f - f7);
        }
    }

    public a(Context context) {
        super(context);
        this.f114488a = -1;
        this.f114489b = -1;
        this.f114490c = -1;
        this.f114496j = -1;
        b(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114488a = -1;
        this.f114489b = -1;
        this.f114490c = -1;
        this.f114496j = -1;
        b(context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.circleindicator.a.a(int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.animation.TimeInterpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.animation.TimeInterpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void b(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int i7;
        int i8;
        ?? LoadAnimator;
        ?? LoadAnimator2;
        int dimensionPixelSize3 = -1;
        int resourceId4 = 2130772399;
        if (attributeSet == null) {
            resourceId2 = 2131241923;
            resourceId = 0;
            resourceId3 = 0;
            i7 = 0;
            dimensionPixelSize = -1;
            dimensionPixelSize2 = -1;
            i8 = 17;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10161a);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
            resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 2130772399);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(2, 2131241923);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(3, resourceId2);
            i7 = typedArrayObtainStyledAttributes.getInt(7, -1);
            i8 = typedArrayObtainStyledAttributes.getInt(4, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i9 = dimensionPixelSize3;
        if (dimensionPixelSize3 < 0) {
            i9 = iApplyDimension;
        }
        this.f114489b = i9;
        int i10 = dimensionPixelSize;
        if (dimensionPixelSize < 0) {
            i10 = iApplyDimension;
        }
        this.f114490c = i10;
        int i11 = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0) {
            i11 = iApplyDimension;
        }
        this.f114488a = i11;
        this.f114493f = AnimatorInflater.loadAnimator(getContext(), resourceId4);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), resourceId4);
        this.h = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(0L);
        if (resourceId == 0) {
            ?? LoadAnimator3 = AnimatorInflater.loadAnimator(getContext(), resourceId4);
            LoadAnimator3.setInterpolator(new Object());
            LoadAnimator = LoadAnimator3;
        } else {
            LoadAnimator = AnimatorInflater.loadAnimator(getContext(), resourceId);
        }
        this.f114494g = LoadAnimator;
        if (resourceId == 0) {
            ?? LoadAnimator4 = AnimatorInflater.loadAnimator(getContext(), resourceId4);
            LoadAnimator4.setInterpolator(new Object());
            LoadAnimator2 = LoadAnimator4;
        } else {
            LoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), resourceId);
        }
        this.f114495i = LoadAnimator2;
        LoadAnimator2.setDuration(0L);
        this.f114491d = resourceId2 == 0 ? 2131241923 : resourceId2;
        if (resourceId3 != 0) {
            resourceId2 = resourceId3;
        }
        this.f114492e = resourceId2;
        int i12 = 0;
        if (i7 == 1) {
            i12 = 1;
        }
        setOrientation(i12);
        if (i8 < 0) {
            i8 = 17;
        }
        setGravity(i8);
        if (isInEditMode()) {
            a(3, 1);
        }
    }

    public void setIndicatorCreatedListener(@Nullable InterfaceC1238a interfaceC1238a) {
    }
}
