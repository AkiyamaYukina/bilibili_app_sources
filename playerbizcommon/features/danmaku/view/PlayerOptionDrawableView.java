package com.bilibili.playerbizcommon.features.danmaku.view;

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
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qq0.InterfaceC8477a;
import qq0.InterfaceC8478b;
import qq0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerOptionDrawableView.class */
public final class PlayerOptionDrawableView extends FrameLayout implements View.OnClickListener, InterfaceC8478b, InterfaceC8477a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ImageView f79725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ImageView f79726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f79727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79729g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f79730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public d f79731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f79732k;

    public PlayerOptionDrawableView(@NotNull Context context) {
        super(context);
        this.f79723a = 102;
        this.f79724b = 255;
        this.h = -1;
        this.f79730i = -1;
        this.f79732k = "";
    }

    public PlayerOptionDrawableView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f79723a = 102;
        this.f79724b = 255;
        this.h = -1;
        this.f79730i = -1;
        this.f79732k = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.j);
        this.f79729g = typedArrayObtainStyledAttributes.getBoolean(1, false);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(3);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 2131103591);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 2131101466);
        String string = typedArrayObtainStyledAttributes.getString(6);
        this.h = ThemeUtils.getColorById(context, resourceId);
        int colorById = ThemeUtils.getColorById(context, resourceId2);
        this.f79730i = colorById;
        this.f79732k = typedArrayObtainStyledAttributes.getString(4);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131496530, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(2131311297);
        this.f79725c = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131305873);
        this.f79726d = imageView2;
        TextView textView = (TextView) findViewById(2131312912);
        this.f79727e = textView;
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
        setSelectState(this.f79729g);
        setOnClickListener(this);
    }

    @Override // qq0.InterfaceC8478b
    @NotNull
    public String getItemTag() {
        String str = this.f79732k;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    public boolean getLockState() {
        return this.f79728f;
    }

    public boolean getSelectState() {
        return this.f79729g;
    }

    @Override // qq0.InterfaceC8478b
    public /* bridge */ /* synthetic */ long getVipColorfulType() {
        return 0L;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (this.f79728f) {
            d dVar = this.f79731j;
            if (dVar != null) {
                dVar.b(this);
                return;
            }
            return;
        }
        d dVar2 = this.f79731j;
        if (dVar2 != null) {
            dVar2.a(this);
        }
    }

    @Override // qq0.InterfaceC8477a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        int i7 = z6 ? this.f79724b : this.f79723a;
        if (this.f79728f) {
            Color.colorToHSV(this.f79730i, fArr);
            ImageView imageView = this.f79726d;
            if (imageView != null) {
                imageView.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        } else {
            Color.colorToHSV(this.f79729g ? this.h : this.f79730i, fArr);
            ImageView imageView2 = this.f79725c;
            if (imageView2 != null) {
                imageView2.setColorFilter(Color.HSVToColor(i7, fArr), PorterDuff.Mode.SRC_IN);
            }
        }
        TextView textView = this.f79727e;
        if (textView != null) {
            textView.setAlpha(i7 / this.f79724b);
        }
        setClickable(z6);
    }

    @Override // qq0.InterfaceC8478b
    public void setItemClickListener(@NotNull d dVar) {
        this.f79731j = dVar;
    }

    public void setLockState(boolean z6) {
        this.f79728f = z6;
        if (z6) {
            ImageView imageView = this.f79726d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f79725c;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f79726d;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = this.f79725c;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
    }

    @Override // qq0.InterfaceC8478b
    public void setSelectState(boolean z6) {
        this.f79729g = z6;
        if (z6) {
            ImageView imageView = this.f79725c;
            if (imageView != null) {
                imageView.setColorFilter(this.h);
            }
            TextView textView = this.f79727e;
            if (textView != null) {
                textView.setTextColor(this.h);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f79725c;
        if (imageView2 != null) {
            imageView2.setColorFilter(this.f79730i);
        }
        TextView textView2 = this.f79727e;
        if (textView2 != null) {
            textView2.setTextColor(this.f79730i);
        }
    }
}
