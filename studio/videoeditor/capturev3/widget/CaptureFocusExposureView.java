package com.bilibili.studio.videoeditor.capturev3.widget;

import Xz0.g;
import Xz0.j;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.videoeditor.capturev3.widget.VerticalSeekBar;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/CaptureFocusExposureView.class */
public class CaptureFocusExposureView extends RelativeLayout implements VerticalSeekBar.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f109349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f109350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VerticalSeekBar f109351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RelativeLayout f109352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnimatorSet f109353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f109354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f109355g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f109356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f109357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f109358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f109359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ObjectAnimator f109360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f109362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f109363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f109364q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/CaptureFocusExposureView$a.class */
    public interface a {
        void b(float f7, int i7);
    }

    public CaptureFocusExposureView(Context context) {
        this(context, null);
    }

    public CaptureFocusExposureView(Context context, AttributeSet attributeSet) {
        int i7;
        super(context, attributeSet, 0);
        this.f109357j = 1.0f;
        this.f109358k = 0;
        this.f109359l = 0.0f;
        this.f109361n = false;
        this.f109362o = 1;
        this.f109363p = 1;
        this.f109364q = false;
        View viewInflate = LayoutInflater.from(context).inflate(2131495339, (ViewGroup) null);
        this.f109349a = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(2131298326);
        this.f109350b = imageView;
        imageView.setImageResource(2131234991);
        VerticalSeekBar verticalSeekBar = (VerticalSeekBar) this.f109349a.findViewById(2131298327);
        this.f109351c = verticalSeekBar;
        verticalSeekBar.setSeekChangeListener(this);
        this.f109351c.setEnabled(false);
        this.f109352d = (RelativeLayout) this.f109349a.findViewById(2131298328);
        addView(this.f109349a);
        this.f109353e = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f109350b, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.66f);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f109350b, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.66f);
        objectAnimatorOfFloat2.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f109349a, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        this.f109360m = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setDuration(1500L);
        this.f109360m.setInterpolator(new DecelerateInterpolator());
        this.f109353e.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.h = DensityUtil.getDevicesWidthPixels(context);
        int devicesHeightPixels = DensityUtil.getDevicesHeightPixels(context);
        this.f109356i = devicesHeightPixels;
        if (devicesHeightPixels != 0 && (i7 = this.h) != 0) {
            this.f109362o = (devicesHeightPixels / 2) / 200;
            this.f109363p = (i7 / 2) / 200;
        }
        StringBuilder sb = new StringBuilder("mVerticalPxPerProgress = ");
        sb.append(this.f109362o);
        sb.append("mHorizonPxPerProgress = ");
        Z.b(this.f109363p, "CaptureFocusExposureView", sb);
    }

    public final void a() {
        VerticalSeekBar verticalSeekBar = this.f109351c;
        if (verticalSeekBar != null) {
            float f7 = this.f109359l;
            if (f7 >= 95.0f && f7 <= 105.0f) {
                this.f109359l = 100.0f;
                verticalSeekBar.setProgress((int) 100.0f);
            }
            List<String> list = HB0.a.f8154a;
            HashMap map = new HashMap();
            map.put("first_entrance", j.a("first_entrance"));
            map.put("track_id", g.d());
            map.put("router_topic_id", g.f28463b);
            Neurons.reportClick(false, "creation.video-shoot.exposure-adjust.0.click", map);
        }
    }

    public final void b(int i7) {
        ObjectAnimator objectAnimator = this.f109360m;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f109359l = i7;
        a aVar = this.f109354f;
        if (aVar != null) {
            aVar.b(this.f109357j, i7 - 100);
        }
        ObjectAnimator objectAnimator2 = this.f109360m;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public final void c(float f7, float f8) {
        if (this.f109361n) {
            return;
        }
        AnimatorSet animatorSet = this.f109353e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        setVisibility(0);
        setAlpha(1.0f);
        VerticalSeekBar verticalSeekBar = this.f109351c;
        if (verticalSeekBar != null) {
            this.f109359l = 100.0f;
            verticalSeekBar.setProgress((int) 100.0f);
        }
        AnimatorSet animatorSet2 = this.f109353e;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        ObjectAnimator objectAnimator = this.f109360m;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        if (f7 < 0.0f || f8 < 0.0f) {
            return;
        }
        this.f109355g = getWidth() / 2;
        float height = getHeight() / 2;
        int i7 = this.f109358k;
        if (i7 == 0 || i7 == 2) {
            if (f7 + this.f109355g <= this.h / 2) {
                this.f109352d.setGravity(5);
                return;
            } else {
                this.f109352d.setGravity(3);
                return;
            }
        }
        if (i7 == 1) {
            if (f8 + height <= this.f109356i / 2) {
                this.f109352d.setGravity(3);
                return;
            } else {
                this.f109352d.setGravity(5);
                return;
            }
        }
        if (i7 == 3) {
            if (f8 + height <= this.f109356i / 2) {
                this.f109352d.setGravity(5);
            } else {
                this.f109352d.setGravity(3);
            }
        }
    }

    public void setCaptureExposureSeekbarListener(a aVar) {
        this.f109354f = aVar;
    }

    public void setFocusImage(int i7) {
        this.f109350b.setImageResource(i7);
    }

    public void setFrom(String str) {
    }

    public void setIntecept(boolean z6) {
        this.f109361n = z6;
    }

    public void setOrientation(int i7) {
        this.f109358k = i7;
    }
}
