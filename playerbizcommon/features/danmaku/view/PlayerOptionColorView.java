package com.bilibili.playerbizcommon.features.danmaku.view;

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
import com.bilibili.lib.theme.R$color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qq0.InterfaceC8477a;
import qq0.InterfaceC8478b;
import qq0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerOptionColorView.class */
public final class PlayerOptionColorView extends FrameLayout implements View.OnClickListener, InterfaceC8478b, InterfaceC8477a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ImageView f79717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ImageView f79718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ImageView f79719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79721g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public d f79722i;

    public PlayerOptionColorView(@NotNull Context context) {
        super(context);
        this.f79715a = 102;
        this.f79716b = 255;
    }

    public PlayerOptionColorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f79715a = 102;
        this.f79716b = 255;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.i);
        this.f79721g = typedArrayObtainStyledAttributes.getBoolean(0, false);
        String string = typedArrayObtainStyledAttributes.getString(2);
        String str = string == null ? "#FFFFFF" : string;
        this.h = str;
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131496529, (ViewGroup) this, true);
        this.f79717c = (ImageView) findViewById(2131297143);
        ImageView imageView = (ImageView) findViewById(2131311297);
        this.f79718d = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131305873);
        this.f79719e = imageView2;
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
        setSelectState(this.f79721g);
        setOnClickListener(this);
    }

    @Override // qq0.InterfaceC8478b
    @NotNull
    public String getItemTag() {
        return String.valueOf(this.h);
    }

    public boolean getLockState() {
        return this.f79720f;
    }

    public boolean getSelectState() {
        return this.f79721g;
    }

    @Override // qq0.InterfaceC8478b
    public /* bridge */ /* synthetic */ long getVipColorfulType() {
        return 0L;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (this.f79720f) {
            d dVar = this.f79722i;
            if (dVar != null) {
                dVar.b(this);
                return;
            }
            return;
        }
        d dVar2 = this.f79722i;
        if (dVar2 != null) {
            dVar2.a(this);
        }
    }

    @Override // qq0.InterfaceC8477a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        int i7 = z6 ? this.f79716b : this.f79715a;
        Color.colorToHSV(Color.parseColor(this.h), fArr);
        if (this.f79720f) {
            ImageView imageView = this.f79719e;
            if (imageView != null) {
                imageView.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        } else {
            ImageView imageView2 = this.f79718d;
            if (imageView2 != null) {
                imageView2.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        }
        ImageView imageView3 = this.f79717c;
        if (imageView3 != null) {
            int i8 = 8;
            if (this.f79721g) {
                i8 = 8;
                if (z6) {
                    i8 = 0;
                }
            }
            imageView3.setVisibility(i8);
        }
        setClickable(z6);
    }

    @Override // qq0.InterfaceC8478b
    public void setItemClickListener(@NotNull d dVar) {
        this.f79722i = dVar;
    }

    public void setLockState(boolean z6) {
        this.f79720f = z6;
        if (z6) {
            ImageView imageView = this.f79719e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f79718d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f79719e;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f79718d;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    @Override // qq0.InterfaceC8478b
    public void setSelectState(boolean z6) {
        this.f79721g = z6;
        ImageView imageView = this.f79717c;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }
}
