package com.bilibili.playerbizcommon.features.danmaku.view;

import K70.d;
import K70.e;
import S60.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerDanmakuOperationSwitchView.class */
public final class PlayerDanmakuOperationSwitchView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79701d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f79702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f79703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f79704c;

    public PlayerDanmakuOperationSwitchView(@NotNull Context context) {
        super(context);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f79702a = LazyKt.lazy(lazyThreadSafetyMode, new d(this, 5));
        this.f79703b = LazyKt.lazy(lazyThreadSafetyMode, new e(this, 8));
        this.f79704c = LazyKt.lazy(lazyThreadSafetyMode, new i(this, 8));
    }

    public PlayerDanmakuOperationSwitchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f79702a = LazyKt.lazy(lazyThreadSafetyMode, new d(this, 5));
        this.f79703b = LazyKt.lazy(lazyThreadSafetyMode, new e(this, 8));
        this.f79704c = LazyKt.lazy(lazyThreadSafetyMode, new i(this, 8));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.f);
        String string = typedArrayObtainStyledAttributes.getString(0);
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        int color = typedArrayObtainStyledAttributes.getColor(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.inflate(context, 2131496415, this);
        if (string2 == null || StringsKt.isBlank(string2)) {
            TextView mTitle = getMTitle();
            if (mTitle != null) {
                mTitle.setVisibility(8);
            }
        } else {
            TextView mTitle2 = getMTitle();
            if (mTitle2 != null) {
                mTitle2.setText(string2);
            }
        }
        if (string == null || StringsKt.isBlank(string)) {
            TextView mTips = getMTips();
            if (mTips != null) {
                mTips.setVisibility(8);
                return;
            }
            return;
        }
        TextView mTips2 = getMTips();
        if (mTips2 != null) {
            mTips2.setText(string);
        }
        TextView mTips3 = getMTips();
        if (mTips3 != null) {
            mTips3.setTextColor(color);
        }
    }

    private final CheckBox getMSwitch() {
        return (CheckBox) this.f79704c.getValue();
    }

    private final TextView getMTips() {
        return (TextView) this.f79703b.getValue();
    }

    private final TextView getMTitle() {
        return (TextView) this.f79702a.getValue();
    }

    public void setSwitchChangedListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CheckBox mSwitch = getMSwitch();
        if (mSwitch != null) {
            mSwitch.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }
}
