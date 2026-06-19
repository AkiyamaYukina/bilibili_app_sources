package com.bilibili.upper.widget.task;

import GO.d;
import X9.n;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/task/UpperTaskCreditPicView.class */
public class UpperTaskCreditPicView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliImageView f114598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f114599b;

    public UpperTaskCreditPicView(Context context) {
        this(context, null);
    }

    public UpperTaskCreditPicView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(2131500675, (ViewGroup) this, true);
        setOrientation(1);
        this.f114598a = findViewById(2131310866);
        this.f114599b = (TextView) findViewById(2131314423);
    }

    public void setImageAlpha(int i7) {
        this.f114598a.setImageAlpha(i7);
    }

    public void setImageSize(int i7) {
        ViewGroup.LayoutParams layoutParams = this.f114598a.getLayoutParams();
        float f7 = i7;
        layoutParams.width = d.a(getContext(), f7);
        layoutParams.height = d.a(getContext(), f7);
        this.f114598a.setLayoutParams(layoutParams);
    }

    public void setImageUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n.a(this.f114598a, BiliImageLoader.INSTANCE, str).into(this.f114598a);
    }

    public void setTitleSize(int i7) {
        this.f114599b.setTextSize(1, i7);
    }
}
