package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/a.class */
public class a extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public FrameLayout f113738B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public FrameLayout f113739C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f113740D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ValueAnimator f113741E;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public d f113745I;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f113742F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f113743G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f113744H = 0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f113746J = true;

    /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitionTopic.activity.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/a$a.class */
    public final class ViewOnClickListenerC1230a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f113747a;

        public ViewOnClickListenerC1230a(a aVar) {
            this.f113747a = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = this.f113747a;
            if (aVar.f113746J) {
                aVar.Q6();
                d dVar = this.f113747a.f113745I;
                if (dVar != null) {
                    dVar.a(false);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/a$b.class */
    public final class b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/a$c.class */
    public final class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f113748a;

        public c(a aVar) {
            this.f113748a = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f113748a.finish();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/a$d.class */
    public interface d {
        void a(boolean z6);

        void b(boolean z6);

        void c(boolean z6);
    }

    public final void P6(int i7) {
        if (this.f113739C == null) {
            return;
        }
        if (this.f113741E == null) {
            this.f113741E = new ValueAnimator();
        }
        int i8 = this.f113739C.getLayoutParams().height;
        this.f113741E.removeAllUpdateListeners();
        this.f113741E.setIntValues(i8, i7);
        this.f113741E.setDuration(300);
        this.f113741E.addUpdateListener(new com.bilibili.upper.module.partitionTag.partitionTopic.activity.b(this));
        this.f113741E.start();
    }

    public final void Q6() {
        if (this.f113739C == null) {
            finish();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, 2130772383);
        animationLoadAnimation.setAnimationListener(new c(this));
        this.f113739C.startAnimation(animationLoadAnimation);
    }

    public final void R6(int i7) {
        bilibili.live.app.service.resolver.c.a(i7, "handleStateChange state:", "BaseDialogActivity");
        if (i7 == 1) {
            ValueAnimator valueAnimator = this.f113741E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f113741E.removeAllUpdateListeners();
                return;
            }
            return;
        }
        if (i7 == 2) {
            P6(this.f113743G);
            return;
        }
        if (i7 == 3) {
            P6(this.f113744H);
            return;
        }
        if (i7 != 4) {
            return;
        }
        Q6();
        d dVar = this.f113745I;
        if (dVar != null) {
            dVar.a(true);
        }
    }

    public final void S6(int i7) {
        d dVar;
        d dVar2;
        bilibili.live.app.service.resolver.c.a(i7, "updateDialogHeight dy:", "BaseDialogActivity");
        FrameLayout frameLayout = this.f113739C;
        if (frameLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int i8 = layoutParams.height;
        if (i8 == this.f113743G && (dVar2 = this.f113745I) != null) {
            dVar2.c(false);
        }
        if (i8 == this.f113744H && (dVar = this.f113745I) != null) {
            dVar.b(false);
        }
        layoutParams.height += i7;
        this.f113739C.setLayoutParams(layoutParams);
        StringBuilder sb = new StringBuilder("updateDialogHeight dy:");
        sb.append(i7);
        sb.append(", currentHeight:");
        Z.b(i8, "BaseDialogActivity", sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnTouchListener, java.lang.Object] */
    public final View T6(int i7, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (this.f113738B == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(this, 2131493788, null);
            this.f113738B = frameLayout;
            this.f113739C = (FrameLayout) frameLayout.findViewById(2131300107);
            this.f113740D = this.f113738B.findViewById(2131313772);
            int i8 = this.f113742F;
            if (i8 > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.f113739C.getLayoutParams();
                layoutParams2.height = i8;
                this.f113739C.setLayoutParams(layoutParams2);
            }
        }
        View viewInflate = view;
        if (i7 != 0) {
            viewInflate = view;
            if (view == null) {
                viewInflate = getLayoutInflater().inflate(i7, (ViewGroup) this.f113739C, false);
            }
        }
        if (layoutParams == null) {
            this.f113739C.addView(viewInflate);
        } else {
            this.f113739C.addView(viewInflate, layoutParams);
        }
        this.f113740D.setOnClickListener(new ViewOnClickListenerC1230a(this));
        this.f113739C.setOnTouchListener(new Object());
        return this.f113738B;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        float screenHeight = ScreenUtil.getScreenHeight(this);
        int i7 = (int) (0.5f * screenHeight);
        this.f113742F = i7;
        this.f113743G = (int) (screenHeight * 0.9f);
        this.f113744H = i7;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, ContextCompat.getColor(this, 2131104090));
        if (this.f113739C != null) {
            this.f113739C.startAnimation(AnimationUtils.loadAnimation(this, 2130772382));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i7) {
        super.setContentView(T6(i7, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(T6(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(T6(0, view, layoutParams));
    }
}
