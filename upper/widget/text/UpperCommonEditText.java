package com.bilibili.upper.widget.text;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.app.screen.adjust.widget.l;
import com.bilibili.droid.StringUtil;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/text/UpperCommonEditText.class */
public class UpperCommonEditText extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f114600e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f114601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f114602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f114603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f114604d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/text/UpperCommonEditText$a.class */
    public interface a {
        void a(String str);
    }

    public UpperCommonEditText(Context context) {
        this(context, null);
    }

    public UpperCommonEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f114602b = true;
        setBackground(ContextCompat.getDrawable(getContext(), 2131241483));
        ((GradientDrawable) getBackground()).setColor(ThemeUtils.getColorById(getContext(), 2131103975));
        setGravity(16);
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131494814, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(2131315896);
        this.f114604d = imageView;
        imageView.setVisibility(8);
        this.f114604d.setOnClickListener(this);
        EditText editText = (EditText) findViewById(2131315883);
        this.f114603c = editText;
        editText.setOnClickListener(new l(1));
        this.f114603c.addTextChangedListener(new com.bilibili.upper.widget.text.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f114603c.clearFocus();
    }

    public String getContent() {
        String string = this.f114603c.getText().toString();
        String string2 = string;
        if (StringUtil.isBlank(string)) {
            CharSequence hint = this.f114603c.getHint();
            string2 = hint == null ? "" : hint.toString();
        }
        return string2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 2131315896) {
            this.f114603c.setText("");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f114602b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAutoShowSoftKeyboard(boolean z6) {
        if (z6) {
            setFocusable(false);
            setFocusableInTouchMode(false);
        } else {
            setFocusable(true);
            setFocusableInTouchMode(true);
        }
    }

    public void setContent(String str) {
        this.f114603c.setText(str);
        this.f114603c.setSelection(str.length());
    }

    public void setHint(String str) {
        this.f114603c.setHint(str);
    }
}
