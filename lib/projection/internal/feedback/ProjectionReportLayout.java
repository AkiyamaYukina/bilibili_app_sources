package com.bilibili.lib.projection.internal.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.ProjectionTheme;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.magicasakura.widgets.TintRadioButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/ProjectionReportLayout.class */
public final class ProjectionReportLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63187g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<TintRadioButton> f63188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f63189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f63190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintEditText f63191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f63192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public h f63193f;

    @JvmOverloads
    public ProjectionReportLayout(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionReportLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionReportLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f63188a = new ArrayList();
        setOrientation(1);
    }

    private final int getThemeColor() {
        return ProjectionTheme.GREEN == null ? R$color.Cy6 : 2131103296;
    }

    public final void a(@Nullable List list, @Nullable ProjectionTheme projectionTheme) {
        setFocusable(false);
        setFocusableInTouchMode(false);
        int size = ((ArrayList) list).size();
        if (size <= 0) {
            return;
        }
        int iIntValue = new BigDecimal(size).divide(new BigDecimal(1), 4).intValue();
        ArrayList arrayList = new ArrayList(iIntValue);
        for (int i7 = 0; i7 < iIntValue; i7++) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setHorizontalGravity(0);
            arrayList.add(linearLayout);
        }
        int i8 = projectionTheme == ProjectionTheme.GREEN ? 2131103564 : 2131103565;
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            BiliCastFeedbackTag biliCastFeedbackTag = (BiliCastFeedbackTag) it.next();
            String id = biliCastFeedbackTag.getId();
            String name = biliCastFeedbackTag.getName();
            TintRadioButton tintRadioButton = new TintRadioButton(getContext());
            tintRadioButton.setText(name);
            tintRadioButton.setTextAppearance(getContext(), 2131887653);
            tintRadioButton.setTextColorById(2131103296);
            tintRadioButton.setCompoundButtonTintList(i8);
            tintRadioButton.setTag(id);
            tintRadioButton.setTag(2131298661, name);
            tintRadioButton.setTag(2131312905, biliCastFeedbackTag.getHint());
            tintRadioButton.setGravity(16);
            tintRadioButton.setTextSize(2, 14.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, (int) LA.f.a(36.0f, 1), 1.0f);
            layoutParams.gravity = 17;
            tintRadioButton.setLayoutParams(layoutParams);
            tintRadioButton.setPadding((int) TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics()), 0, 0, 0);
            tintRadioButton.setOnClickListener(this);
            tintRadioButton.setChecked(false);
            LinearLayout linearLayout2 = (LinearLayout) arrayList.get((int) Math.floor(((double) i9) / ((double) 1.0f)));
            linearLayout2.addView(tintRadioButton, layoutParams);
            ((ArrayList) this.f63188a).add(tintRadioButton);
            addView(linearLayout2);
            tintRadioButton.setOnCheckedChangeListener(this.f63192e);
            i9++;
        }
        TintEditText tintEditText = new TintEditText(getContext());
        this.f63191d = tintEditText;
        tintEditText.setOnClickListener(this);
        TintEditText tintEditText2 = this.f63191d;
        if (tintEditText2 != null) {
            tintEditText2.setMaxLines(2);
        }
        TintEditText tintEditText3 = this.f63191d;
        if (tintEditText3 != null) {
            tintEditText3.setContentDescription("byplayer_feedback_inputtext");
        }
        TintEditText tintEditText4 = this.f63191d;
        if (tintEditText4 != null) {
            tintEditText4.setHint(2131845699);
        }
        TintEditText tintEditText5 = this.f63191d;
        if (tintEditText5 != null) {
            tintEditText5.setMaxEms(200);
        }
        TintEditText tintEditText6 = this.f63191d;
        if (tintEditText6 != null) {
            tintEditText6.setTextSize(14.0f);
        }
        TintEditText tintEditText7 = this.f63191d;
        if (tintEditText7 != null) {
            tintEditText7.setTextColor(getResources().getColor(getThemeColor()));
        }
        TintEditText tintEditText8 = this.f63191d;
        if (tintEditText8 != null) {
            tintEditText8.setHintTextColor(getResources().getColor(2131103980));
        }
        TintEditText tintEditText9 = this.f63191d;
        if (tintEditText9 != null) {
            tintEditText9.setMinimumWidth((int) LA.f.a(120.0f, 1));
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = (int) LA.f.a(2.0f, 1);
        layoutParams2.topMargin = (int) LA.f.a(6.0f, 1);
        layoutParams2.leftMargin = (int) LA.f.a(6.0f, 1);
        TintEditText tintEditText10 = this.f63191d;
        if (tintEditText10 != null) {
            tintEditText10.setLayoutParams(layoutParams2);
        }
        TintEditText tintEditText11 = this.f63191d;
        if (tintEditText11 != null) {
            tintEditText11.setBackgroundDrawable(getResources().getDrawable(2131234812));
        }
        TintEditText tintEditText12 = this.f63191d;
        ThemeUtils.tintDrawable(tintEditText12 != null ? tintEditText12.getBackground() : null, getResources().getColor(2131103980));
        TintEditText tintEditText13 = this.f63191d;
        if (tintEditText13 != null) {
            tintEditText13.setCursorVisible(false);
        }
        TintEditText tintEditText14 = this.f63191d;
        if (tintEditText14 != null) {
            tintEditText14.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.bilibili.lib.projection.internal.feedback.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionReportLayout f63205a;

                {
                    this.f63205a = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ProjectionReportLayout projectionReportLayout = this.f63205a;
                    int i10 = ProjectionReportLayout.f63187g;
                    projectionReportLayout.onClick(view);
                    return false;
                }
            });
        }
        TintEditText tintEditText15 = this.f63191d;
        if (tintEditText15 != null) {
            tintEditText15.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: com.bilibili.lib.projection.internal.feedback.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionReportLayout f63206a;

                {
                    this.f63206a = this;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                    boolean z6;
                    ProjectionReportLayout projectionReportLayout = this.f63206a;
                    int i11 = ProjectionReportLayout.f63187g;
                    if (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6) {
                        InputMethodManagerHelper.hideSoftInput(projectionReportLayout.getContext(), projectionReportLayout.f63191d, 2);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
        TintEditText tintEditText16 = this.f63191d;
        if (tintEditText16 != null) {
            tintEditText16.addTextChangedListener(new g(this));
        }
        addView(this.f63191d);
    }

    @Nullable
    public final TintEditText getOtherEt() {
        return this.f63191d;
    }

    @NotNull
    public final String getOtherStr() {
        String string;
        TintEditText tintEditText = this.f63191d;
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
    public final String getReportId() {
        return this.f63189b;
    }

    @Nullable
    public final String getSelectOptions() {
        return this.f63190c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view instanceof TintRadioButton) {
            TintRadioButton tintRadioButton = (TintRadioButton) view;
            this.f63189b = tintRadioButton.getTag() != null ? (String) tintRadioButton.getTag() : null;
            this.f63190c = (String) view.getTag(2131298661);
            for (TintRadioButton tintRadioButton2 : (ArrayList) this.f63188a) {
                if (tintRadioButton2 != view) {
                    if (tintRadioButton2.isChecked()) {
                        tintRadioButton2.setChecked(false);
                    }
                } else if (!tintRadioButton2.isChecked()) {
                    tintRadioButton2.setChecked(true);
                }
            }
        }
        TintEditText tintEditText = this.f63191d;
        if (view == tintEditText) {
            Context context = getContext();
            TintEditText tintEditText2 = this.f63191d;
            ThemeUtils.tintDrawableByColorId(context, tintEditText2 != null ? tintEditText2.getBackground() : null, getThemeColor());
            TintEditText tintEditText3 = this.f63191d;
            if (tintEditText3 != null) {
                tintEditText3.setCursorVisible(true);
                return;
            }
            return;
        }
        if (tintEditText != null) {
            tintEditText.setText("");
        }
        TintEditText tintEditText4 = this.f63191d;
        ThemeUtils.tintDrawable(tintEditText4 != null ? tintEditText4.getBackground() : null, getResources().getColor(getThemeColor()));
        TintEditText tintEditText5 = this.f63191d;
        if (tintEditText5 != null) {
            tintEditText5.setCursorVisible(true);
        }
        TintEditText tintEditText6 = this.f63191d;
        if (tintEditText6 != null) {
            tintEditText6.requestFocus();
        }
        InputMethodManagerHelper.showSoftInput(getContext(), this.f63191d, 0);
        String str = (String) view.getTag(2131312905);
        TintEditText tintEditText7 = this.f63191d;
        if (tintEditText7 != null) {
            tintEditText7.setHint(str);
        }
    }

    public final void setCheckedStatusListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f63192e = onCheckedChangeListener;
    }

    public final void setOtherEt(@Nullable TintEditText tintEditText) {
        this.f63191d = tintEditText;
    }

    public final void setTextChangeListener(@NotNull h hVar) {
        this.f63193f = hVar;
    }
}
