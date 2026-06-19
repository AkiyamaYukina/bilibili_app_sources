package com.bilibili.music.podcast.view.dropdownmenu;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C3237a;
import androidx.recyclerview.widget.RecyclerView;
import b60.r;
import bj0.AbstractC5110a;
import bj0.C5112c;
import com.bilibili.music.podcast.legacy.contribute.ContributePresenter;
import com.bilibili.music.podcast.legacy.fragment.ContributionsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n.C8047a;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import zg0.C9193a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead.class */
public class DropDownMenuHead extends RelativeLayout implements ValueAnimator.AnimatorUpdateListener, Animation.AnimationListener, BaseAdapter.HandleClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f67196A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f67197B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final b f67198C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f67199D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f67200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f67201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f67202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f67203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f67204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<C5112c> f67205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<C5112c> f67206g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Animation f67207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Animation f67208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Animation f67209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Animation f67210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f67211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f67213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f67214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f67215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f67216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f67217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f67218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f67219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final OvershootInterpolator f67220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractC5110a f67221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f67222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f67223y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f67224z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseViewHolder f67225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DropDownMenuHead f67226b;

        public a(DropDownMenuHead dropDownMenuHead, BaseViewHolder baseViewHolder) {
            this.f67226b = dropDownMenuHead;
            this.f67225a = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int layoutPosition = this.f67225a.getLayoutPosition();
            int i7 = 0;
            while (i7 < this.f67226b.f67206g.size()) {
                this.f67226b.f67206g.get(i7).f56690b = i7 == layoutPosition;
                i7++;
            }
            this.f67226b.f67221w.notifyDataSetChanged();
            this.f67226b.c();
            DropDownMenuHead dropDownMenuHead = this.f67226b;
            View childAt = dropDownMenuHead.f67200a.getChildAt(dropDownMenuHead.f67211m);
            TextView textView = (TextView) childAt.findViewById(2131307359);
            ImageView imageView = (ImageView) childAt.findViewById(2131296843);
            textView.setText(this.f67226b.f67206g.get(layoutPosition).f56689a);
            textView.setSelected(false);
            imageView.setSelected(false);
            DropDownMenuHead dropDownMenuHead2 = this.f67226b;
            r rVar = dropDownMenuHead2.f67199D;
            if (rVar != null) {
                int i8 = dropDownMenuHead2.f67211m;
                ContributePresenter contributePresenter = ((ContributionsFragment) rVar.a).f66834m;
                ContributePresenter contributePresenter2 = contributePresenter;
                if (contributePresenter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                    contributePresenter2 = null;
                }
                contributePresenter2.c(i8, layoutPosition);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f67227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f67228b;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead$c.class */
    public interface c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead$d.class */
    public interface d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuHead$e.class */
    public static final class e implements TypeEvaluator<b> {
        @Override // android.animation.TypeEvaluator
        public final b evaluate(float f7, b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            float f8 = bVar3.f67227a;
            float fA = C8047a.a(bVar4.f67227a, f8, f7, f8);
            float f9 = bVar3.f67228b;
            float fA2 = C8047a.a(bVar4.f67228b, f9, f7, f9);
            b bVar5 = new b();
            bVar5.f67227a = fA;
            bVar5.f67228b = fA2;
            return bVar5;
        }
    }

    public DropDownMenuHead(Context context) {
        this(context, null, 0);
    }

    public DropDownMenuHead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public DropDownMenuHead(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, 0);
        this.f67205f = new ArrayList<>();
        this.f67206g = new ArrayList<>();
        this.f67218t = new Rect();
        this.f67220v = new OvershootInterpolator(1.0f);
        this.f67223y = 4;
        b bVar = new b();
        this.f67197B = bVar;
        b bVar2 = new b();
        this.f67198C = bVar2;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9193a.f130306e)) != null) {
            this.f67224z = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#fafafa"));
            this.f67196A = typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#bdbdbd"));
            typedArrayObtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(2131494567, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131307369);
        this.f67200a = linearLayout;
        View viewFindViewById = findViewById(2131303070);
        this.f67201b = viewFindViewById;
        this.f67204e = (ImageView) findViewById(2131303617);
        linearLayout.setBackgroundColor(this.f67224z);
        viewFindViewById.setBackgroundColor(this.f67196A);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        alphaAnimation.setFillAfter(false);
        this.f67207i = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setDuration(200L);
        alphaAnimation2.setFillAfter(false);
        this.f67209k = alphaAnimation2;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(false);
        this.f67208j = translateAnimation;
        translateAnimation.setAnimationListener(this);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(200L);
        translateAnimation2.setFillAfter(false);
        this.f67210l = translateAnimation2;
        translateAnimation2.setAnimationListener(this);
        this.f67214p = (int) ((14.5f * getResources().getDisplayMetrics().density) + 0.5f);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new Object(), bVar2, bVar);
        this.f67219u = valueAnimatorOfObject;
        valueAnimatorOfObject.addUpdateListener(this);
        this.f67216r = true;
        this.f67217s = true;
        this.f67213o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerView(int i7) {
        List<C5112c> list;
        C5112c c5112c = this.f67205f.get(i7);
        if (c5112c == null || (list = c5112c.f56691c) == null || ((ArrayList) list).size() <= 0) {
            return;
        }
        this.f67206g.clear();
        this.f67206g.addAll(c5112c.f56691c);
        this.f67221w.N(this.f67206g);
        this.f67221w.notifyDataSetChanged();
    }

    public final void b() {
        View childAt = this.f67200a.getChildAt(this.f67211m);
        Rect rect = this.f67218t;
        int left = childAt.getLeft();
        int width = childAt.getWidth();
        int i7 = this.f67214p;
        rect.left = C3237a.a(width, i7, 2, left);
        Rect rect2 = this.f67218t;
        int i8 = rect2.left;
        rect2.right = i7 + i8;
        this.f67204e.setX(i8);
    }

    public final void c() {
        if (this.f67202c.getVisibility() != 0 || this.f67222x) {
            return;
        }
        this.f67205f.get(this.f67211m).f56690b = false;
        ((ImageView) this.f67200a.getChildAt(this.f67211m).findViewById(2131296843)).setSelected(false);
        this.f67203d.startAnimation(this.f67209k);
        this.f67203d.setVisibility(8);
        this.f67202c.startAnimation(this.f67210l);
        this.f67202c.setVisibility(8);
        this.f67204e.setVisibility(8);
        this.f67213o = true;
    }

    public final void d(boolean z6) {
        for (int i7 = 0; i7 < this.h; i7++) {
            View childAt = this.f67200a.getChildAt(i7);
            TextView textView = (TextView) childAt.findViewById(2131307359);
            ImageView imageView = (ImageView) childAt.findViewById(2131296843);
            if (z6) {
                textView.setText(this.f67205f.get(i7).f56689a);
            }
            imageView.setSelected(this.f67205f.get(i7).f56690b);
            textView.setSelected(this.f67205f.get(i7).f56690b);
        }
    }

    public int getCurrentMenu() {
        return this.f67211m;
    }

    public final void handleClick(BaseViewHolder baseViewHolder) {
        baseViewHolder.itemView.setOnClickListener(new a(this, baseViewHolder));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f67222x = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.f67222x = true;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View childAt = this.f67200a.getChildAt(this.f67211m);
        b bVar = (b) valueAnimator.getAnimatedValue();
        Rect rect = this.f67218t;
        float f7 = bVar.f67227a;
        rect.left = (int) f7;
        rect.right = (int) bVar.f67228b;
        int width = childAt.getWidth();
        int i7 = this.f67214p;
        float f8 = (width - i7) / 2;
        Rect rect2 = this.f67218t;
        int i8 = (int) (f7 + f8);
        rect2.left = i8;
        rect2.right = i7 + i8;
        this.f67204e.setX(i8);
    }

    public void setBgColor(int i7) {
        this.f67224z = i7;
        this.f67200a.setBackgroundColor(i7);
    }

    public void setCurrentMenu(int i7) {
        this.f67212n = this.f67211m;
        this.f67211m = i7;
        if (this.f67204e.getVisibility() != 0) {
            this.f67204e.setVisibility(0);
        }
        if (!this.f67216r) {
            b();
            return;
        }
        if (this.f67213o) {
            this.f67213o = false;
            this.f67212n = this.f67211m;
        }
        View childAt = this.f67200a.getChildAt(this.f67211m);
        this.f67197B.f67227a = childAt.getLeft();
        this.f67197B.f67228b = childAt.getRight();
        View childAt2 = this.f67200a.getChildAt(this.f67212n);
        this.f67198C.f67227a = childAt2.getLeft();
        this.f67198C.f67228b = childAt2.getRight();
        b bVar = this.f67198C;
        float f7 = bVar.f67227a;
        b bVar2 = this.f67197B;
        if (f7 == bVar2.f67227a && bVar.f67228b == bVar2.f67228b) {
            b();
            return;
        }
        this.f67219u.setObjectValues(bVar, bVar2);
        if (this.f67217s) {
            this.f67219u.setInterpolator(this.f67220v);
        }
        if (this.f67215q <= 0) {
            this.f67215q = this.f67217s ? 600L : 250L;
        }
        this.f67219u.setDuration(this.f67215q);
        this.f67219u.start();
    }

    public void setLineColor(int i7) {
        this.f67196A = i7;
        this.f67201b.setBackgroundColor(i7);
    }

    public void setOnMenuItemClickListener(c cVar) {
    }

    public void setOnSubMenuItemClickListener(d dVar) {
        this.f67199D = dVar;
    }
}
