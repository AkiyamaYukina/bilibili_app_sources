package com.bilibili.lib.projection.internal.widget;

import GS0.U;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.bilibili.app.comment3.ui.holder.A;
import com.bilibili.app.comment3.ui.holder.B;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.internal.widget.halfscreen.ProjectionDeviceNameWidget;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import java.net.URL;
import ke0.InterfaceC7756d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/ProjectionTitleWidget.class */
public final class ProjectionTitleWidget extends FrameLayout implements InterfaceC7756d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f63847p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f63848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final AppCompatImageView f63849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final AppCompatImageView f63850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final BiliImageView f63851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final SVGAImageView f63852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ProjectionDeviceNameWidget f63853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Group f63854g;

    @Nullable
    public final ProjectionGlobalLinkModeWidget h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextView f63855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public x f63856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m.a f63857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f63859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f63860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f63861o;

    @JvmOverloads
    public ProjectionTitleWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionTitleWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionTitleWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f63861o = LazyKt.lazy(new U(context, 3));
        FrameLayout.inflate(context, 2131498441, this);
        this.f63853f = (ProjectionDeviceNameWidget) findViewById(2131309611);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(2131309604);
        this.f63849b = appCompatImageView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(2131309609);
        this.f63850c = appCompatImageView2;
        this.h = (ProjectionGlobalLinkModeWidget) findViewById(2131309605);
        this.f63848a = findViewById(2131309606);
        SVGAImageView sVGAImageViewFindViewById = findViewById(2131309610);
        this.f63852e = sVGAImageViewFindViewById;
        BiliImageView biliImageViewFindViewById = findViewById(2131309607);
        this.f63851d = biliImageViewFindViewById;
        this.f63854g = (Group) findViewById(2131302411);
        TextView textView = (TextView) findViewById(2131298500);
        this.f63855i = textView;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new y(this, 0));
        }
        if (sVGAImageViewFindViewById != null) {
            sVGAImageViewFindViewById.setOnClickListener(new com.bilibili.app.comment3.ui.holder.y(this, 1));
        }
        if (biliImageViewFindViewById != null) {
            biliImageViewFindViewById.setOnClickListener(new com.bilibili.app.comment3.ui.holder.z(this, 1));
        }
        if (textView != null) {
            textView.setOnClickListener(new A(this, 1));
        }
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new B(this, 1));
        }
    }

    private final SVGAParser getMSVGAParser() {
        return (SVGAParser) this.f63861o.getValue();
    }

    public final void g(boolean z6) {
        ProjectionGlobalLinkModeWidget projectionGlobalLinkModeWidget = this.h;
        if (projectionGlobalLinkModeWidget != null) {
            if (z6) {
                ImageView imageView = projectionGlobalLinkModeWidget.f63846a;
                if (imageView != null) {
                    imageView.setImageResource(2131238612);
                }
                ImageView imageView2 = projectionGlobalLinkModeWidget.f63846a;
                if (imageView2 != null) {
                    imageView2.clearColorFilter();
                    return;
                }
                return;
            }
            ImageView imageView3 = projectionGlobalLinkModeWidget.f63846a;
            if (imageView3 != null) {
                imageView3.setImageResource(2131238613);
            }
            ImageView imageView4 = projectionGlobalLinkModeWidget.f63846a;
            if (imageView4 != null) {
                imageView4.setColorFilter(-1);
            }
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        this.f63857k = aVar2;
        this.f63858l = aVar2.getContainer().getClient();
    }

    public final void j(int i7, @Nullable String str) {
        if (str != null && !StringsKt.isBlank(str)) {
            if (this.f63852e != null) {
                getMSVGAParser().parse(new URL(str), new z(this, i7));
                return;
            }
            return;
        }
        SVGAImageView sVGAImageView = this.f63852e;
        if (sVGAImageView != null) {
            sVGAImageView.setVisibility(8);
        }
        BiliImageView biliImageView = this.f63851d;
        if (biliImageView != null) {
            biliImageView.setVisibility(0);
        }
    }

    public final void k(boolean z6) {
        AppCompatImageView appCompatImageView = this.f63850c;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(z6 ? 0 : 4);
        }
    }

    public final void setActionCallback(@NotNull x xVar) {
        this.f63856j = xVar;
        if (xVar != null) {
            xVar.g(this.f63853f);
        }
    }

    public final void setBackButtonRes(int i7) {
        AppCompatImageView appCompatImageView = this.f63849b;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i7);
        }
    }

    public final void setHalf(boolean z6) {
        this.f63860n = z6;
    }

    public final void setSVGAClearAfterStop(boolean z6) {
        SVGAImageView sVGAImageView = this.f63852e;
        if (sVGAImageView != null) {
            sVGAImageView.setClearsAfterStop(z6);
        }
    }

    public final void setStaticImage(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            this.f63859m = false;
            return;
        }
        this.f63859m = true;
        BiliImageView biliImageView = this.f63851d;
        if (biliImageView != null) {
            BiliImageLoader.INSTANCE.with(getContext()).url(str).into(biliImageView);
        }
    }

    public final void setTitleText(@NotNull String str) {
        ProjectionDeviceNameWidget projectionDeviceNameWidget = this.f63853f;
        if (projectionDeviceNameWidget != null) {
            projectionDeviceNameWidget.setText(str);
        }
    }
}
