package com.bilibili.biligame.business.pegasus.view;

import Hk0.v;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GamePanelTextView.class */
@StabilityInferred(parameters = 0)
public final class GamePanelTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public CharSequence f62736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f62737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f62739e;

    @JvmOverloads
    public GamePanelTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public GamePanelTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public GamePanelTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f62735a = 2;
        this.f62736b = "";
        this.f62737c = "等9款游戏";
        this.f62739e = "";
    }

    public static void J(GamePanelTextView gamePanelTextView) {
        if (gamePanelTextView.getWidth() > 0) {
            gamePanelTextView.f62738d = (gamePanelTextView.getWidth() - gamePanelTextView.getPaddingLeft()) - gamePanelTextView.getPaddingRight();
        }
        gamePanelTextView.setRealContent(gamePanelTextView.f62736b);
    }

    private final Layout getOriginLayout() {
        return new StaticLayout(this.f62736b, getPaint(), this.f62738d, Layout.Alignment.ALIGN_NORMAL, 1.2f, 0.0f, true);
    }

    private final void setRealContent(CharSequence charSequence) {
        int i7;
        CharSequence charSequence2;
        Layout originLayout = getOriginLayout();
        int lineStart = originLayout.getLineStart(this.f62735a - 1);
        int lineEnd = originLayout.getLineEnd(this.f62735a - 1);
        if (originLayout.getLineCount() <= 1) {
            SpannableString spannableString = new SpannableString(((Object) charSequence) + "\n" + this.f62737c);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), 2131103284)), (spannableString.length() - 3) - this.f62739e.length(), spannableString.length() - 3, 33);
            charSequence2 = spannableString;
        } else {
            if (originLayout.getWidth() - Layout.getDesiredWidth(charSequence, lineStart, lineEnd, getPaint()) >= getPaint().measureText(" " + this.f62737c)) {
                SpannableString spannableString2 = new SpannableString(((Object) charSequence) + " " + this.f62737c);
                spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), 2131103284)), (spannableString2.length() - 3) - this.f62739e.length(), spannableString2.length() - 3, 33);
                charSequence2 = spannableString2;
            } else {
                float fMeasureText = getPaint().measureText("..." + this.f62737c);
                do {
                    i7 = lineEnd - 1;
                    if (i7 < lineStart) {
                        break;
                    } else {
                        lineEnd = i7;
                    }
                } while (originLayout.getWidth() - Layout.getDesiredWidth(charSequence, lineStart, i7, getPaint()) < fMeasureText);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, i7));
                spannableStringBuilder.append((CharSequence) ("..." + this.f62737c));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), 2131103284)), (spannableStringBuilder.length() - 3) - this.f62739e.length(), spannableStringBuilder.length() - 3, 33);
                charSequence2 = spannableStringBuilder;
            }
        }
        setText(charSequence2);
    }

    public final void K(@Nullable CharSequence charSequence, @NotNull String str) {
        if (StringsKt.isBlank(charSequence)) {
            return;
        }
        this.f62737c = android.support.v4.media.a.a("等", str, "款游戏");
        this.f62736b = charSequence;
        this.f62739e = str;
        if (this.f62738d <= 0 && getWidth() > 0) {
            this.f62738d = (getWidth() - getPaddingLeft()) - getPaddingRight();
        }
        if (this.f62738d <= 0) {
            post(new v(this, 2));
        } else {
            setRealContent(this.f62736b);
        }
    }

    @NotNull
    public final String getMSize() {
        return this.f62739e;
    }

    public final int getMWidth() {
        return this.f62738d;
    }

    public final void setMSize(@NotNull String str) {
        this.f62739e = str;
    }

    public final void setMWidth(int i7) {
        this.f62738d = i7;
    }
}
