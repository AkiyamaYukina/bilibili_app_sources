package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Gm0.C1988K;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintToolbar;
import java.util.List;
import m.C7899a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar.class */
public class WebToolbar extends TintToolbar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f73697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public TextView f73698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public TintImageView f73699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TintImageView f73700g;
    public StaticImageView2 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public StaticImageView2 f73701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f73702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f73703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f73706n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebToolbar f73707a;

        public a(WebToolbar webToolbar) {
            this.f73707a = webToolbar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = this.f73707a.f73697d;
            if (dVar != null) {
                ((C1988K) dVar).f7233a.onBackPressed();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar$b.class */
    public final class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebToolbar f73708a;

        public b(WebToolbar webToolbar) {
            this.f73708a = webToolbar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = this.f73708a.f73697d;
            if (dVar != null) {
                ((C1988K) dVar).f7233a.onBackPressed();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar$c.class */
    public final class c implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StaticImageView2 f73709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WebToolbarButtonBean f73710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WebToolbar f73711c;

        public c(WebToolbar webToolbar, StaticImageView2 staticImageView2, WebToolbarButtonBean webToolbarButtonBean) {
            this.f73711c = webToolbar;
            this.f73709a = staticImageView2;
            this.f73710b = webToolbarButtonBean;
        }

        public final void onImageLoadFailed(@Nullable Throwable th) {
        }

        public final void onImageLoading(@Nullable Uri uri) {
        }

        public final void onImageSet(@Nullable ImageInfo imageInfo) {
            final int i7 = 0;
            final WebToolbarButtonBean webToolbarButtonBean = this.f73710b;
            this.f73709a.setOnClickListener(new View.OnClickListener(i7, this, webToolbarButtonBean) { // from class: Gm0.S

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f7245a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f7246b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f7247c;

                {
                    this.f7245a = i7;
                    this.f7246b = this;
                    this.f7247c = webToolbarButtonBean;
                }

                /* JADX WARN: Removed duplicated region for block: B:67:0x0262  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r8) {
                    /*
                        Method dump skipped, instruction units count: 792
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Gm0.ViewOnClickListenerC1995S.onClick(android.view.View):void");
                }
            });
        }

        public final void onIntermediateImageSet(@Nullable ImageInfo imageInfo) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar$d.class */
    public interface d {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebToolbar$e.class */
    public interface e {
    }

    public WebToolbar(Context context) {
        super(context);
        this.f73705m = Integer.MIN_VALUE;
        e(null);
    }

    public WebToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73705m = Integer.MIN_VALUE;
        e(attributeSet);
    }

    public final void e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7899a.f123433z, 2130971227, 0);
        if (typedArrayObtainStyledAttributes != null) {
            this.f73703k = typedArrayObtainStyledAttributes.getResourceId(28, 0);
            if (typedArrayObtainStyledAttributes.hasValue(29)) {
                setTitleTextColor(typedArrayObtainStyledAttributes.getColor(29, -1));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void f(WebToolbarButtonBean webToolbarButtonBean, StaticImageView2 staticImageView2) {
        if (staticImageView2 == null) {
            return;
        }
        staticImageView2.setVisibility(0);
        if (webToolbarButtonBean.iconRatio > 0.0d) {
            staticImageView2.clearColorFilter();
            int i7 = (int) ((3.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
            staticImageView2.setPadding(i7, i7, i7, i7);
            ViewGroup.LayoutParams layoutParams = staticImageView2.getLayoutParams();
            if (layoutParams != null) {
                int i8 = layoutParams.height;
                int i9 = i7 * 2;
                layoutParams.width = (int) ((((double) (i8 - i9)) * webToolbarButtonBean.iconRatio) + ((double) i9));
                staticImageView2.setLayoutParams(layoutParams);
            }
        } else {
            int i10 = (int) ((8.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
            staticImageView2.setPadding(i10, i10, i10, i10);
            staticImageView2.setColorFilter(this.f73705m);
            ViewGroup.LayoutParams layoutParams2 = staticImageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = (int) ((36.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
                staticImageView2.setLayoutParams(layoutParams2);
            }
        }
        BiliImageLoader.INSTANCE.with(staticImageView2.getContext()).url(webToolbarButtonBean.icon).imageLoadingListener(new c(this, staticImageView2, webToolbarButtonBean)).into(staticImageView2);
    }

    public LinearLayout getEntryListView() {
        return this.f73702j;
    }

    public TintImageView getToolbarBackView() {
        return this.f73700g;
    }

    public TextView getToolbarTitleTextView() {
        return this.f73698e;
    }

    @Override // com.bilibili.magicasakura.widgets.TintToolbar, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(2131311356);
        this.f73698e = textView;
        if (textView == null) {
            throw new RuntimeException("Title view can't set to be null");
        }
        textView.setSingleLine();
        this.f73698e.setEllipsize(TextUtils.TruncateAt.END);
        if (this.f73703k != 0) {
            this.f73698e.setTextAppearance(getContext(), this.f73703k);
        }
        int i7 = this.f73704l;
        if (i7 != 0) {
            this.f73698e.setTextColor(i7);
        }
        TintImageView tintImageView = (TintImageView) findViewById(2131310499);
        this.f73699f = tintImageView;
        if (tintImageView == null) {
            throw new RuntimeException("Close view can't set to be null");
        }
        tintImageView.setOnClickListener(new a(this));
        TintImageView tintImageView2 = (TintImageView) findViewById(2131310497);
        this.f73700g = tintImageView2;
        if (tintImageView2 != null) {
            tintImageView2.setOnClickListener(new b(this));
        }
        this.h = findViewById(2131313562);
        this.f73701i = findViewById(2131313563);
        this.f73702j = (LinearLayout) findViewById(2131313554);
        setNavigationIcon((Drawable) null);
    }

    public void setOnRightButtonClickListener(e eVar) {
        this.f73706n = eVar;
    }

    public void setOnTitleEventListener(d dVar) {
        this.f73697d = dVar;
    }

    public void setRightIcons(List<WebToolbarButtonBean> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        WebToolbarButtonBean webToolbarButtonBean = list.get(0);
        if (webToolbarButtonBean != null) {
            f(webToolbarButtonBean, this.h);
        }
        if (list.size() <= 1) {
            this.f73701i.setVisibility(8);
            return;
        }
        WebToolbarButtonBean webToolbarButtonBean2 = list.get(1);
        if (webToolbarButtonBean2 != null) {
            f(webToolbarButtonBean2, this.f73701i);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(@StringRes int i7) {
        setTitle(getContext().getText(i7));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f73698e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitleTextAppearance(Context context, @StyleRes int i7) {
        this.f73703k = i7;
        TextView textView = this.f73698e;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(@ColorInt int i7) {
        this.f73704l = i7;
        TextView textView = this.f73698e;
        if (textView != null) {
            textView.setTextColor(i7);
        }
    }
}
