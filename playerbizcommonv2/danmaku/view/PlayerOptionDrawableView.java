package com.bilibili.playerbizcommonv2.danmaku.view;

import Cr0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8348b;
import pr0.InterfaceC8350d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerOptionDrawableView.class */
@StabilityInferred(parameters = 0)
public final class PlayerOptionDrawableView extends FrameLayout implements View.OnClickListener, InterfaceC8348b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ImageView f81530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ImageView f81531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f81532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81534g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f81535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InterfaceC8350d f81536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f81537k;

    public PlayerOptionDrawableView(@NotNull Context context) {
        super(context);
        this.f81528a = 102;
        this.f81529b = 255;
        this.h = -1;
        this.f81535i = -1;
        this.f81537k = "";
    }

    public PlayerOptionDrawableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f81528a = 102;
        this.f81529b = 255;
        this.h = -1;
        this.f81535i = -1;
        this.f81537k = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.j);
        this.f81534g = typedArrayObtainStyledAttributes.getBoolean(1, false);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.color.white);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 2131101466);
        String string = typedArrayObtainStyledAttributes.getString(6);
        this.h = ThemeUtils.getColorById(context, resourceId);
        int colorById = ThemeUtils.getColorById(context, resourceId2);
        this.f81535i = colorById;
        this.f81537k = typedArrayObtainStyledAttributes.getString(4);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131496640, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(2131311297);
        this.f81530c = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131305873);
        this.f81531d = imageView2;
        TextView textView = (TextView) findViewById(2131312912);
        this.f81532e = textView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable2);
        }
        if (imageView2 != null) {
            imageView2.setColorFilter(colorById);
        }
        if (string == null || !(!StringsKt.isBlank(string))) {
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (textView != null) {
            textView.setText(string);
        }
        setSelectState(this.f81534g);
        setOnClickListener(this);
    }

    @Override // pr0.InterfaceC8348b
    @NotNull
    public String getItemTag() {
        String str = this.f81537k;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    public boolean getLockState() {
        return this.f81533f;
    }

    public boolean getSelectState() {
        return this.f81534g;
    }

    @Override // pr0.InterfaceC8348b
    public /* bridge */ /* synthetic */ long getVipColorfulType() {
        return 0L;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (this.f81533f) {
            InterfaceC8350d interfaceC8350d = this.f81536j;
            if (interfaceC8350d != null) {
                interfaceC8350d.a(this);
                return;
            }
            return;
        }
        InterfaceC8350d interfaceC8350d2 = this.f81536j;
        if (interfaceC8350d2 != null) {
            interfaceC8350d2.c(this);
        }
    }

    @Override // Cr0.a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        int i7 = z6 ? this.f81529b : this.f81528a;
        if (this.f81533f) {
            Color.colorToHSV(this.f81535i, fArr);
            ImageView imageView = this.f81531d;
            if (imageView != null) {
                imageView.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        } else {
            Color.colorToHSV(this.f81534g ? this.h : this.f81535i, fArr);
            ImageView imageView2 = this.f81530c;
            if (imageView2 != null) {
                imageView2.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        }
        TextView textView = this.f81532e;
        if (textView != null) {
            textView.setAlpha(i7 / this.f81529b);
        }
        setClickable(z6);
    }

    @Override // pr0.InterfaceC8348b
    public void setItemClickListener(@NotNull InterfaceC8350d interfaceC8350d) {
        this.f81536j = interfaceC8350d;
    }

    public void setLockState(boolean z6) {
        this.f81533f = z6;
        if (z6) {
            ImageView imageView = this.f81531d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f81530c;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f81531d;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f81530c;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    @Override // pr0.InterfaceC8348b
    public void setSelectState(boolean z6) {
        this.f81534g = z6;
        if (z6) {
            ImageView imageView = this.f81530c;
            if (imageView != null) {
                imageView.setColorFilter(this.h);
            }
            TextView textView = this.f81532e;
            if (textView != null) {
                textView.setTextColor(this.h);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f81530c;
        if (imageView2 != null) {
            imageView2.setColorFilter(this.f81535i);
        }
        TextView textView2 = this.f81532e;
        if (textView2 != null) {
            textView2.setTextColor(this.f81535i);
        }
    }
}
