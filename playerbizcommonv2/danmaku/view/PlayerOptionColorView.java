package com.bilibili.playerbizcommonv2.danmaku.view;

import Cr0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8348b;
import pr0.InterfaceC8350d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerOptionColorView.class */
@StabilityInferred(parameters = 0)
public final class PlayerOptionColorView extends FrameLayout implements View.OnClickListener, InterfaceC8348b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ImageView f81522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ImageView f81523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ImageView f81524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81526g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InterfaceC8350d f81527i;

    public PlayerOptionColorView(@NotNull Context context) {
        super(context);
        this.f81520a = 102;
        this.f81521b = 255;
    }

    public PlayerOptionColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f81520a = 102;
        this.f81521b = 255;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.i);
        this.f81526g = typedArrayObtainStyledAttributes.getBoolean(0, false);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String str = string == null ? "#FFFFFF" : string;
        this.h = str;
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131496637, (ViewGroup) this, true);
        this.f81522c = (ImageView) findViewById(2131297143);
        ImageView imageView = (ImageView) findViewById(2131311297);
        this.f81523d = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131305873);
        this.f81524e = imageView2;
        if (imageView != null) {
            imageView.setColorFilter(Color.parseColor(str));
        }
        int color = z6 ? Color.parseColor("#46494D") : context.getResources().getColor(R$color.Ga3);
        if (imageView != null) {
            imageView.setBackgroundTintList(ColorStateList.valueOf(color));
        }
        if (imageView2 != null) {
            imageView2.setColorFilter(Color.parseColor(str));
        }
        setSelectState(this.f81526g);
        setOnClickListener(this);
    }

    @Override // pr0.InterfaceC8348b
    @NotNull
    public String getItemTag() {
        return String.valueOf(this.h);
    }

    public boolean getLockState() {
        return this.f81525f;
    }

    public boolean getSelectState() {
        return this.f81526g;
    }

    @Override // pr0.InterfaceC8348b
    public /* bridge */ /* synthetic */ long getVipColorfulType() {
        return 0L;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (this.f81525f) {
            InterfaceC8350d interfaceC8350d = this.f81527i;
            if (interfaceC8350d != null) {
                interfaceC8350d.a(this);
                return;
            }
            return;
        }
        InterfaceC8350d interfaceC8350d2 = this.f81527i;
        if (interfaceC8350d2 != null) {
            interfaceC8350d2.c(this);
        }
    }

    @Override // Cr0.a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        int i7 = z6 ? this.f81521b : this.f81520a;
        Color.colorToHSV(Color.parseColor(this.h), fArr);
        if (this.f81525f) {
            ImageView imageView = this.f81524e;
            if (imageView != null) {
                imageView.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        } else {
            ImageView imageView2 = this.f81523d;
            if (imageView2 != null) {
                imageView2.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        }
        ImageView imageView3 = this.f81522c;
        if (imageView3 != null) {
            int i8 = 8;
            if (this.f81526g) {
                i8 = 8;
                if (z6) {
                    i8 = 0;
                }
            }
            imageView3.setVisibility(i8);
        }
        setClickable(z6);
    }

    @Override // pr0.InterfaceC8348b
    public void setItemClickListener(@NotNull InterfaceC8350d interfaceC8350d) {
        this.f81527i = interfaceC8350d;
    }

    public void setLockState(boolean z6) {
        this.f81525f = z6;
        if (z6) {
            ImageView imageView = this.f81524e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f81523d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f81524e;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f81523d;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    @Override // pr0.InterfaceC8348b
    public void setSelectState(boolean z6) {
        this.f81526g = z6;
        ImageView imageView = this.f81522c;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }
}
