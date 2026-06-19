package com.bilibili.studio.editor.moudle.caption.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.RangesKt;
import nx0.h;
import nx0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/CaptionEditText.class */
public final class CaptionEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColorInt
    @Nullable
    public Integer f106013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f106014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> f106015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> f106016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f106017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function2<? super Integer, ? super Integer, Unit> f106018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f106019g;

    @Nullable
    public Function0<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f106020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f106021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f106022k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/CaptionEditText$a.class */
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CaptionEditText f106023a;

        public a(CaptionEditText captionEditText) {
            this.f106023a = captionEditText;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void afterTextChanged(android.text.Editable r4) {
            /*
                r3 = this;
                r0 = r3
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                r5 = r0
                r0 = r5
                boolean r0 = r0.f106022k
                if (r0 != 0) goto L2f
                r0 = r5
                kotlin.jvm.functions.Function1 r0 = r0.getOnTextAfterChange()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L2f
                r0 = r4
                if (r0 == 0) goto L24
                r0 = r4
                java.lang.String r0 = r0.toString()
                r5 = r0
                r0 = r5
                r4 = r0
                r0 = r5
                if (r0 != 0) goto L27
            L24:
                java.lang.String r0 = ""
                r4 = r0
            L27:
                r0 = r6
                r1 = r4
                java.lang.Object r0 = r0.invoke(r1)
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText.a.afterTextChanged(android.text.Editable):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void beforeTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            /*
                r6 = this;
                r0 = r6
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                r11 = r0
                r0 = r11
                boolean r0 = r0.f106022k
                if (r0 != 0) goto L45
                r0 = r11
                kotlin.jvm.functions.Function4 r0 = r0.getOnTextBeforeChange()
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L45
                r0 = r7
                if (r0 == 0) goto L2c
                r0 = r7
                java.lang.String r0 = r0.toString()
                r11 = r0
                r0 = r11
                r7 = r0
                r0 = r11
                if (r0 != 0) goto L2f
            L2c:
                java.lang.String r0 = ""
                r7 = r0
            L2f:
                r0 = r12
                r1 = r7
                r2 = r8
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = r9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.invoke(r1, r2, r3, r4)
            L45:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText.a.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            /*
                r6 = this;
                r0 = r9
                if (r0 != 0) goto L4d
                r0 = r10
                r1 = 1
                if (r0 != r1) goto L4d
                r0 = r7
                if (r0 == 0) goto L4d
                r0 = r7
                r1 = r8
                char r0 = r0.charAt(r1)
                r1 = 10
                if (r0 != r1) goto L4d
                r0 = r6
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                kotlin.jvm.functions.Function0 r0 = r0.getOnClickEnter()
                if (r0 == 0) goto L4d
                r0 = r6
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                r1 = r7
                r2 = r8
                r3 = r8
                r4 = 1
                int r3 = r3 + r4
                java.lang.CharSequence r1 = kotlin.text.StringsKt.removeRange(r1, r2, r3)
                java.lang.String r1 = r1.toString()
                r0.setTextSilently(r1)
                r0 = r6
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                kotlin.jvm.functions.Function0 r0 = r0.getOnClickEnter()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L4c
                r0 = r7
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r7 = r0
            L4c:
                return
            L4d:
                r0 = r6
                com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText r0 = r0.f106023a
                r11 = r0
                r0 = r11
                boolean r0 = r0.f106022k
                if (r0 != 0) goto L92
                r0 = r11
                kotlin.jvm.functions.Function4 r0 = r0.getOnTextChange()
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L92
                r0 = r7
                if (r0 == 0) goto L79
                r0 = r7
                java.lang.String r0 = r0.toString()
                r11 = r0
                r0 = r11
                r7 = r0
                r0 = r11
                if (r0 != 0) goto L7c
            L79:
                java.lang.String r0 = ""
                r7 = r0
            L7c:
                r0 = r12
                r1 = r7
                r2 = r8
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = r9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r0 = r0.invoke(r1, r2, r3, r4)
            L92:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText.a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public CaptionEditText(@NotNull Context context) {
        super(context);
        addTextChangedListener(new a(this));
        setOnKeyListener(new h(this));
        setOnEditorActionListener(new i(this));
    }

    public CaptionEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        addTextChangedListener(new a(this));
        setOnKeyListener(new h(this));
        setOnEditorActionListener(new i(this));
    }

    public static boolean b(CaptionEditText captionEditText, int i7, KeyEvent keyEvent) {
        Function0<Boolean> function0;
        captionEditText.getClass();
        boolean zBooleanValue = false;
        if (keyEvent.getAction() == 0) {
            if (i7 == 66) {
                Function0<Boolean> function02 = captionEditText.h;
                if (function02 != null) {
                    zBooleanValue = ((Boolean) function02.invoke()).booleanValue();
                }
            } else if (i7 == 67 && (function0 = captionEditText.f106020i) != null) {
                zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
            }
        }
        return zBooleanValue;
    }

    public final void c() {
        if (this.f106014b == null) {
            Integer num = this.f106013a;
            if (num != null) {
                super.setTextColor(num.intValue());
                return;
            }
            return;
        }
        if (isFocused()) {
            super.setTextColor(this.f106014b.intValue());
            return;
        }
        Integer num2 = this.f106013a;
        if (num2 != null) {
            super.setTextColor(num2.intValue());
        }
    }

    @Nullable
    public final Function0<Unit> getOnClickBack() {
        return this.f106021j;
    }

    @Nullable
    public final Function0<Boolean> getOnClickDel() {
        return this.f106020i;
    }

    @Nullable
    public final Function0<Boolean> getOnClickEnter() {
        return this.h;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnFocusChange() {
        return this.f106019g;
    }

    @Nullable
    public final Function2<Integer, Integer, Unit> getOnSelectionChange() {
        return this.f106018f;
    }

    @Nullable
    public final Function1<String, Unit> getOnTextAfterChange() {
        return this.f106017e;
    }

    @Nullable
    public final Function4<String, Integer, Integer, Integer, Unit> getOnTextBeforeChange() {
        return this.f106016d;
    }

    @Nullable
    public final Function4<String, Integer, Integer, Integer, Unit> getOnTextChange() {
        return this.f106015c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, @Nullable Rect rect) {
        Function1<? super Boolean, Unit> function1;
        super.onFocusChanged(z6, i7, rect);
        if (!this.f106022k && (function1 = this.f106019g) != null) {
            function1.invoke(Boolean.valueOf(z6));
        }
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i7, @Nullable KeyEvent keyEvent) {
        if (i7 != 4 || keyEvent == null || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i7, keyEvent);
        }
        Function0<Unit> function0 = this.f106021j;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i7, int i8) {
        Function2<? super Integer, ? super Integer, Unit> function2;
        super.onSelectionChanged(i7, i8);
        if (this.f106022k || (function2 = this.f106018f) == null) {
            return;
        }
        function2.invoke(Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public final void setFocusedTextColor(@ColorInt int i7) {
        this.f106014b = Integer.valueOf(i7);
        c();
    }

    public final void setOnClickBack(@Nullable Function0<Unit> function0) {
        this.f106021j = function0;
    }

    public final void setOnClickDel(@Nullable Function0<Boolean> function0) {
        this.f106020i = function0;
    }

    public final void setOnClickEnter(@Nullable Function0<Boolean> function0) {
        this.h = function0;
    }

    public final void setOnFocusChange(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f106019g = function1;
    }

    public final void setOnSelectionChange(@Nullable Function2<? super Integer, ? super Integer, Unit> function2) {
        this.f106018f = function2;
    }

    public final void setOnTextAfterChange(@Nullable Function1<? super String, Unit> function1) {
        this.f106017e = function1;
    }

    public final void setOnTextBeforeChange(@Nullable Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        this.f106016d = function4;
    }

    public final void setOnTextChange(@Nullable Function4<? super String, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        this.f106015c = function4;
    }

    @Override // android.widget.EditText
    public final void setSelection(int i7, int i8) {
        Editable text = getText();
        int iCoerceIn = RangesKt.coerceIn(i8, 0, text != null ? text.length() : 0);
        super.setSelection(RangesKt.coerceIn(i7, 0, iCoerceIn), iCoerceIn);
    }

    @Override // android.widget.TextView
    public void setTextColor(@ColorInt int i7) {
        super.setTextColor(i7);
        this.f106013a = Integer.valueOf(getCurrentTextColor());
        c();
    }

    @Override // android.widget.TextView
    public void setTextColor(@Nullable ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f106013a = Integer.valueOf(getCurrentTextColor());
        c();
    }

    public final void setTextSilently(@NotNull String str) {
        boolean z6 = this.f106022k;
        this.f106022k = true;
        setText(str);
        this.f106022k = z6;
    }
}
