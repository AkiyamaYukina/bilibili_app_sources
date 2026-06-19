package com.bilibili.upper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.widget.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/VerifyAvatarFrameLayout.class */
public class VerifyAvatarFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f114469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaticImageView2 f114470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f114471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f114472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintLinearLayout f114473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f114474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f114475g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f114476i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/VerifyAvatarFrameLayout$VSize.class */
    public enum VSize {
        SMALL(10),
        MIDDLE(12),
        LARGE(16),
        SUPERB(22);

        public int dp;

        VSize(int i7) {
            this.dp = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/VerifyAvatarFrameLayout$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f114477a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.upper.widget.VerifyAvatarFrameLayout$VSize[] r0 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.VSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.upper.widget.VerifyAvatarFrameLayout.a.f114477a = r0
                r0 = r4
                com.bilibili.upper.widget.VerifyAvatarFrameLayout$VSize r1 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.VSize.SMALL     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.a.f114477a     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.bilibili.upper.widget.VerifyAvatarFrameLayout$VSize r1 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.VSize.MIDDLE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.a.f114477a     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.bilibili.upper.widget.VerifyAvatarFrameLayout$VSize r1 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.VSize.LARGE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.a.f114477a     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.bilibili.upper.widget.VerifyAvatarFrameLayout$VSize r1 = com.bilibili.upper.widget.VerifyAvatarFrameLayout.VSize.SUPERB     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.VerifyAvatarFrameLayout.a.m10709clinit():void");
        }
    }

    public VerifyAvatarFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public VerifyAvatarFrameLayout(Context context, AttributeSet attributeSet) {
        int frame;
        super(context, attributeSet, 0);
        this.f114471c = Boolean.FALSE;
        this.h = Color.argb(15, 0, 0, 0);
        this.f114476i = Boolean.TRUE;
        StaticImageView2 staticImageView2 = new StaticImageView2(context);
        this.f114470b = staticImageView2;
        staticImageView2.setThumbWidth(b(78));
        this.f114470b.setThumbHeight(b(78));
        this.f114470b.setThumbRatio(5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(36), b(36));
        layoutParams.gravity = 17;
        this.f114470b.setLayoutParams(layoutParams);
        addView(this.f114470b);
        this.f114475g = new v(context);
        this.f114472d = new o(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b(42), b(42));
        layoutParams2.gravity = 17;
        this.f114472d.setLayoutParams(layoutParams2);
        v vVar = this.f114475g;
        o oVar = this.f114472d;
        ((ArrayList) vVar.f114658c).add(new WeakReference(oVar));
        v.a aVar = vVar.f114657b;
        oVar.f114562b = aVar;
        if (aVar != null) {
            aVar.a(oVar.getContext());
        }
        this.f114472d.setVisibility(8);
        addView(this.f114472d);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10174o);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f114469a = new ImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388693;
        layoutParams3.rightMargin = dimensionPixelOffset;
        layoutParams3.bottomMargin = dimensionPixelOffset2;
        this.f114469a.setLayoutParams(layoutParams3);
        this.f114469a.setVisibility(8);
        addView(this.f114469a);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(b(52), b(16));
        layoutParams4.gravity = 81;
        TintLinearLayout tintLinearLayout = new TintLinearLayout(context);
        this.f114473e = tintLinearLayout;
        tintLinearLayout.setGravity(17);
        this.f114473e.setBackground(ContextCompat.getDrawable(context, 2131232776));
        this.f114473e.setOrientation(0);
        this.f114473e.setLayoutParams(layoutParams4);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams(b(10), b(10)));
        lottieAnimationView.setAnimation("player_live_avatar_anim.json");
        lottieAnimationView.setRepeatMode(1);
        this.f114473e.addView(lottieAnimationView);
        v vVar2 = this.f114475g;
        ((ArrayList) vVar2.f114659d).add(new WeakReference(lottieAnimationView));
        if (vVar2.f114660e && !lottieAnimationView.isAnimating()) {
            Iterator it = ((ArrayList) vVar2.f114659d).iterator();
            while (true) {
                frame = 0;
                if (!it.hasNext()) {
                    break;
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((WeakReference) it.next()).get();
                if (lottieAnimationView2 != null && lottieAnimationView2.isAnimating()) {
                    frame = lottieAnimationView2.getFrame();
                    break;
                }
            }
            lottieAnimationView.setFrame(frame);
            lottieAnimationView.resumeAnimation();
        }
        TintTextView tintTextView = new TintTextView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = b(1);
        tintTextView.setLayoutParams(layoutParams5);
        tintTextView.setTextAppearance(context, 2131888126);
        tintTextView.setText(context.getResources().getString(2131849791));
        this.f114473e.addView(tintTextView);
        this.f114473e.setVisibility(8);
        addView(this.f114473e);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(String str) {
        if (this.f114470b == null) {
            return;
        }
        this.f114474f = str;
        if (!this.f114471c.booleanValue()) {
            this.f114472d.setVisibility(8);
            this.f114473e.setVisibility(8);
            this.f114475g.f();
            BiliImageLoader.INSTANCE.with(getContext()).url(this.f114474f).failureImageDrawable(getContext().getDrawable(2131234716)).roundingParams(RoundingParams.asCircle().setBorder(this.h, b(1))).into(this.f114470b);
            return;
        }
        this.f114472d.setVisibility(0);
        this.f114473e.setVisibility(0);
        this.f114475g.f114657b.a(getContext());
        this.f114475g.d();
        BiliImageLoader.INSTANCE.with(getContext()).url(this.f114474f).failureImageDrawable(getContext().getDrawable(2131234716)).roundingParams(RoundingParams.asCircle()).into(this.f114470b);
    }

    public final int b(int i7) {
        return (int) TypedValue.applyDimension(1, i7, getResources().getDisplayMetrics());
    }

    public final void c(int i7, VSize vSize) {
        ImageView imageView = this.f114469a;
        if (imageView == null) {
            return;
        }
        if (this.f114471c.booleanValue()) {
            imageView.setVisibility(8);
            return;
        }
        int iB = b(vSize.dp);
        imageView.getLayoutParams().width = iB;
        imageView.getLayoutParams().height = iB;
        if (i7 == 0) {
            imageView.setVisibility(0);
            int i8 = a.f114477a[vSize.ordinal()];
            imageView.setBackgroundResource(i8 != 2 ? i8 != 3 ? i8 != 4 ? 2131234434 : 2131234433 : 2131234431 : 2131234429);
        } else if (i7 != 1) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            int i9 = a.f114477a[vSize.ordinal()];
            imageView.setBackgroundResource(i9 != 2 ? i9 != 3 ? i9 != 4 ? 2131234428 : 2131234427 : 2131234425 : 2131234423);
        }
        this.f114469a.setImageDrawable(null);
        if (MultipleThemeUtils.isNightTheme(getContext()) && this.f114476i.booleanValue()) {
            int iDip2px = ScreenUtil.dip2px(getContext(), 1.0f);
            int color = getResources().getColor(R$color.f64616Wh0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.mutate();
            gradientDrawable.setSize(24, 24);
            gradientDrawable.setStroke(iDip2px, color);
            gradientDrawable.setShape(1);
            this.f114469a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f114469a.setImageDrawable(gradientDrawable);
        }
    }

    public void setLiveAvatarState(Boolean bool) {
        this.f114471c = bool;
    }

    public void setVerifyImg(int i7) {
        ImageView imageView = this.f114469a;
        if (imageView == null) {
            return;
        }
        imageView.setBackgroundResource(i7);
        this.f114469a.setVisibility(0);
    }

    public void setVerifyImgSize(VSize vSize) {
        int iB = b(vSize.dp);
        this.f114469a.getLayoutParams().width = iB;
        this.f114469a.getLayoutParams().height = iB;
    }

    public void setVerifyImgVisibility(int i7) {
        ImageView imageView = this.f114469a;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i7);
    }
}
