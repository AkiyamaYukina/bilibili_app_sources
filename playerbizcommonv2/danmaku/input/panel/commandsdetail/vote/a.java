package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.AbstractC8618a;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import wr0.C8918a;
import wr0.C8919b;
import wr0.C8920c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/vote/a.class */
@StabilityInferred(parameters = 0)
public final class a extends LinearLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C8918a f81118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public AppCompatCheckBox f81119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public AppCompatCheckBox f81120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TintImageView f81121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8919b f81122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8920c f81123g;

    @NotNull
    public final Om.a h;

    /* JADX WARN: Type inference failed for: r1v4, types: [wr0.b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [wr0.c] */
    public a(@NotNull Context context, @NotNull InterfaceC8621d interfaceC8621d) {
        super(context);
        this.f81117a = interfaceC8621d;
        AbstractC8618a abstractC8618aB = interfaceC8621d.b();
        this.f81118b = abstractC8618aB instanceof C8918a ? (C8918a) abstractC8618aB : null;
        setOrientation(0);
        this.f81122f = new CompoundButton.OnCheckedChangeListener(this) { // from class: wr0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote.a f128989a;

            {
                this.f128989a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote.a aVar = this.f128989a;
                AppCompatCheckBox appCompatCheckBox = aVar.f81120d;
                int i7 = 0;
                if (appCompatCheckBox != null) {
                    appCompatCheckBox.setChecked(false);
                }
                View childAt = aVar.getChildAt(1);
                if (childAt != null) {
                    if (z6) {
                        i7 = 8;
                    }
                    childAt.setVisibility(i7);
                }
                C8918a c8918a = aVar.f81118b;
                if (c8918a != null) {
                    c8918a.d(z6);
                }
            }
        };
        this.f81123g = new CompoundButton.OnCheckedChangeListener(this) { // from class: wr0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote.a f128990a;

            {
                this.f128990a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                C8923f c8923f;
                com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote.a aVar = this.f128990a;
                AppCompatCheckBox appCompatCheckBox = aVar.f81119c;
                if (appCompatCheckBox != null) {
                    appCompatCheckBox.setChecked(false);
                }
                View childAt = aVar.getChildAt(0);
                if (childAt != null) {
                    childAt.setVisibility(!z6 ? 0 : 8);
                }
                C8918a c8918a = aVar.f81118b;
                if (c8918a == null || (c8923f = c8918a.f128988i) == null) {
                    return;
                }
                c8923f.setVisibility(z6 ? 0 : 8);
            }
        };
        this.h = new Om.a(3, context, this);
    }

    @Override // sr0.InterfaceC8622e
    public final void a(@NotNull HashMap<String, Object> map) {
        AppCompatCheckBox appCompatCheckBox = this.f81119c;
        int i7 = 1;
        map.put("has_self_def", (appCompatCheckBox == null || !appCompatCheckBox.isChecked()) ? "0" : "1");
        AppCompatCheckBox appCompatCheckBox2 = this.f81120d;
        if (appCompatCheckBox2 == null || !appCompatCheckBox2.isChecked()) {
            i7 = 0;
        }
        map.put("vote_type", Integer.valueOf(i7));
    }

    @Override // sr0.InterfaceC8622e
    public final boolean c() {
        return true;
    }

    public final AppCompatCheckBox d(String str, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, NewPlayerUtilsKt.toPx(40.0f));
        layoutParams.setMargins(0, 0, NewPlayerUtilsKt.toPx(10.0f), 0);
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(getContext());
        appCompatCheckBox.setBackground(null);
        appCompatCheckBox.setButtonDrawable(AppCompatResources.getDrawable(appCompatCheckBox.getContext(), 2131239238));
        appCompatCheckBox.setTextColor(appCompatCheckBox.getContext().getResources().getColor(R$color.Text2));
        appCompatCheckBox.setGravity(16);
        appCompatCheckBox.setChecked(false);
        appCompatCheckBox.setTextSize(12.0f);
        appCompatCheckBox.setText(str);
        appCompatCheckBox.setPadding(NewPlayerUtilsKt.toPx(6.0f), 0, 0, 0);
        appCompatCheckBox.setOnCheckedChangeListener(onCheckedChangeListener);
        addView(appCompatCheckBox, layoutParams);
        return appCompatCheckBox;
    }

    public final boolean getCustomChecked$playerbizcommonv2_release() {
        AppCompatCheckBox appCompatCheckBox = this.f81119c;
        boolean z6 = false;
        if (appCompatCheckBox != null) {
            z6 = false;
            if (appCompatCheckBox.isChecked()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // sr0.InterfaceC8622e
    public final void onAttach() {
        removeAllViews();
        this.f81119c = d(getContext().getString(2131845392), this.f81122f);
        if (this.f81117a.c()) {
            this.f81120d = d(getContext().getString(2131847375), this.f81123g);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, NewPlayerUtilsKt.toPx(40.0f));
        layoutParams.weight = 1.0f;
        addView(new View(getContext()), layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(NewPlayerUtilsKt.toPx(40.0f), NewPlayerUtilsKt.toPx(40.0f));
        TintImageView tintImageView = new TintImageView(getContext());
        tintImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tintImageView.setImageResource(2131236708);
        tintImageView.setImageTintList(R$color.Text2, PorterDuff.Mode.SRC_IN);
        tintImageView.setOnClickListener(this.h);
        addView(tintImageView, layoutParams2);
        this.f81121e = tintImageView;
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
    }
}
