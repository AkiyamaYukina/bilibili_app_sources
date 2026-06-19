package com.bilibili.playerbizcommon.widget.function.feedback;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.magicasakura.widgets.TintRadioButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerReportLayout.class */
public final class PlayerReportLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80656g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<TintRadioButton> f80657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f80658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f80659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintRadioButton f80660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TintEditText f80661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f80662f;

    @JvmOverloads
    public PlayerReportLayout(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerReportLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PlayerReportLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f80657a = new ArrayList();
        setOrientation(1);
    }

    @Nullable
    public final TintEditText getOtherEt() {
        return this.f80661e;
    }

    @NotNull
    public final String getOtherStr() {
        String string;
        TintEditText tintEditText = this.f80661e;
        if (tintEditText == null) {
            string = "";
        } else {
            String strValueOf = String.valueOf(tintEditText != null ? tintEditText.getText() : null);
            int length = strValueOf.length() - 1;
            int i7 = 0;
            boolean z6 = false;
            while (i7 <= length) {
                boolean z7 = Intrinsics.compare(strValueOf.charAt(!z6 ? i7 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    }
                    length--;
                } else if (z7) {
                    i7++;
                } else {
                    z6 = true;
                }
            }
            string = strValueOf.subSequence(i7, length + 1).toString();
        }
        return string;
    }

    @Nullable
    public final String getReportContent() {
        return this.f80659c;
    }

    @Nullable
    public final String getReportId() {
        return this.f80658b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        TintEditText tintEditText;
        this.f80658b = view.getTag() != null ? (String) view.getTag() : null;
        this.f80659c = view.getTag(2131298661) != null ? (String) view.getTag(2131298661) : null;
        for (TintRadioButton tintRadioButton : (ArrayList) this.f80657a) {
            if (tintRadioButton != view) {
                if (tintRadioButton.isChecked() && (view != this.f80661e || tintRadioButton != this.f80660d)) {
                    tintRadioButton.setChecked(false);
                }
            } else if (!tintRadioButton.isChecked()) {
                tintRadioButton.setChecked(true);
            }
        }
        if (TextUtils.equals(this.f80658b, "189") || view == (tintEditText = this.f80661e)) {
            Context context = getContext();
            TintEditText tintEditText2 = this.f80661e;
            ThemeUtils.tintDrawableByColorId(context, tintEditText2 != null ? tintEditText2.getBackground() : null, 2131103284);
            this.f80658b = "189";
            TintRadioButton tintRadioButton2 = this.f80660d;
            if (tintRadioButton2 != null) {
                if (tintRadioButton2 != null) {
                    tintRadioButton2.setChecked(true);
                }
                TintEditText tintEditText3 = this.f80661e;
                if (tintEditText3 != null) {
                    tintEditText3.setCursorVisible(true);
                    return;
                }
                return;
            }
            return;
        }
        if (tintEditText != null) {
            tintEditText.setText("");
        }
        TintEditText tintEditText4 = this.f80661e;
        ThemeUtils.tintDrawable(tintEditText4 != null ? tintEditText4.getBackground() : null, getResources().getColor(2131101466));
        TintRadioButton tintRadioButton3 = this.f80660d;
        if (tintRadioButton3 != null) {
            if (tintRadioButton3 != null) {
                tintRadioButton3.setChecked(false);
            }
            TintEditText tintEditText5 = this.f80661e;
            if (tintEditText5 != null) {
                tintEditText5.setCursorVisible(false);
            }
        }
    }

    public final void setCheckedStatusListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f80662f = onCheckedChangeListener;
    }

    public final void setOtherEt(@Nullable TintEditText tintEditText) {
        this.f80661e = tintEditText;
    }
}
