package com.bilibili.upper.module.template.view;

import C0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.autofill.r;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/view/FolderTextView.class */
public class FolderTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f114007m = Color.parseColor("#E1E1E1");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f114008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f114009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f114013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f114014g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f114015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f114016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f114017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f114018l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/view/FolderTextView$a.class */
    public final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FolderTextView f114019a;

        public a(FolderTextView folderTextView) {
            this.f114019a = folderTextView;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            FolderTextView folderTextView = this.f114019a;
            folderTextView.f114013f = !folderTextView.f114013f;
            folderTextView.f114014g = false;
            folderTextView.invalidate();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f114019a.f114011d);
        }
    }

    public FolderTextView(Context context) {
        this(context, null);
    }

    public FolderTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f114012e = false;
        this.f114013f = false;
        this.f114014g = false;
        this.h = false;
        this.f114016j = 1.0f;
        this.f114017k = 0.0f;
        this.f114018l = new a(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, IE0.a.f10166f);
        String string = typedArrayObtainStyledAttributes.getString(2);
        this.f114008a = string;
        if (string == null) {
            this.f114008a = "收起";
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f114009b = string2;
        if (string2 == null) {
            this.f114009b = "展开全部";
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(1, 2);
        this.f114010c = i7;
        if (i7 < 1) {
            throw new RuntimeException("foldLine must not less than 1");
        }
        this.f114011d = typedArrayObtainStyledAttributes.getColor(3, f114007m);
        this.f114012e = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int J(int i7, String str) {
        String str2 = str.substring(0, i7) + "..." + this.f114009b;
        Layout layoutK = K(str2);
        Layout layoutK2 = K(str2 + ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        int lineCount = layoutK.getLineCount();
        int lineCount2 = layoutK2.getLineCount();
        if (lineCount == getFoldLine() && lineCount2 == getFoldLine() + 1) {
            return 0;
        }
        return lineCount > getFoldLine() ? 1 : -1;
    }

    public final Layout K(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f114016j, this.f114017k, true);
    }

    public final String L(String str) {
        String strL;
        int i7;
        int length = str.length() - 1;
        int i8 = length / 2;
        int iJ = J(i8, str);
        int i9 = 0;
        while (iJ != 0 && length > i9) {
            if (iJ > 0) {
                i7 = i8 - 1;
            } else {
                i7 = length;
                if (iJ < 0) {
                    i9 = i8 + 1;
                    i7 = length;
                }
            }
            i8 = (i9 + i7) / 2;
            iJ = J(i8, str);
            length = i7;
        }
        if (iJ == 0) {
            strL = str.substring(0, i8) + "..." + this.f114009b;
        } else {
            StringBuilder sbA = d.a(str, "...");
            sbA.append(this.f114009b);
            String string = sbA.toString();
            Layout layoutK = K(string);
            if (layoutK.getLineCount() > getFoldLine()) {
                int lineEnd = layoutK.getLineEnd(getFoldLine() - 1);
                int length2 = lineEnd;
                if (str.length() < lineEnd) {
                    length2 = str.length();
                }
                if (length2 <= 1) {
                    strL = "..." + this.f114009b;
                } else {
                    strL = L(str.substring(0, length2 - 1));
                }
            } else {
                strL = string;
            }
        }
        return strL;
    }

    public int getFoldLine() {
        return this.f114010c;
    }

    public String getFoldText() {
        return this.f114008a;
    }

    public String getFullText() {
        return this.f114015i;
    }

    public int getTailColor() {
        return this.f114011d;
    }

    public String getUnFoldText() {
        return this.f114009b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        getMeasuredHeight();
        if (!this.f114014g) {
            if (K(this.f114015i).getLineCount() <= getFoldLine()) {
                setText(this.f114015i);
            } else {
                SpannableString spannableString = new SpannableString(this.f114015i);
                if (!this.f114013f) {
                    String str = this.f114015i;
                    System.currentTimeMillis();
                    String strL = L(str);
                    System.currentTimeMillis();
                    int length = strL.length();
                    int length2 = this.f114009b.length();
                    int length3 = strL.length();
                    spannableString = new SpannableString(strL);
                    spannableString.setSpan(this.f114018l, length - length2, length3, 33);
                } else if (this.f114012e) {
                    StringBuilder sbA = r.a(this.f114015i);
                    sbA.append(this.f114008a);
                    String string = sbA.toString();
                    int length4 = string.length();
                    int length5 = this.f114008a.length();
                    int length6 = string.length();
                    spannableString = new SpannableString(string);
                    spannableString.setSpan(this.f114018l, length4 - length5, length6, 33);
                }
                this.h = true;
                setText(spannableString);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        super.onDraw(canvas);
        this.f114014g = true;
        this.h = false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int lineEnd;
        super.onMeasure(i7, i8);
        if (this.f114013f) {
            return;
        }
        Layout layout = getLayout();
        int foldLine = getFoldLine();
        if (foldLine >= layout.getLineCount() || (lineEnd = layout.getLineEnd(foldLine - 1)) <= 0) {
            return;
        }
        Layout layoutK = K(getText().subSequence(0, lineEnd).toString());
        setMeasuredDimension(getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + layoutK.getHeight());
    }

    public void setCanFoldAgain(boolean z6) {
        this.f114012e = z6;
        super.invalidate();
    }

    public void setFoldLine(int i7) {
        this.f114010c = i7;
        super.invalidate();
    }

    public void setFoldText(String str) {
        this.f114008a = str;
        super.invalidate();
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f7, float f8) {
        this.f114017k = f7;
        this.f114016j = f8;
        super.setLineSpacing(f7, f8);
    }

    public void setTailColor(int i7) {
        this.f114011d = i7;
        super.invalidate();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (TextUtils.isEmpty(this.f114015i) || !this.h) {
            this.f114014g = false;
            this.f114015i = String.valueOf(charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    public void setUnFoldText(String str) {
        this.f114009b = str;
        super.invalidate();
    }
}
