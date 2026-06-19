package com.bilibili.playset.playlist.edit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FooterBatchEditView.class */
@StabilityInferred(parameters = 0)
public final class FooterBatchEditView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85222f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f85223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f85224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f85225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f85226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f85227e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FooterBatchEditView$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<c> f85228a = new ArrayList<>();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FooterBatchEditView$b.class */
    public interface b {
        void J7(@NotNull View view);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FooterBatchEditView$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85231c;

        public c(@IdRes int i7, @StringRes int i8, @ColorRes int i9) {
            this.f85229a = i7;
            this.f85230b = i8;
            this.f85231c = i9;
        }
    }

    public FooterBatchEditView(@NotNull Context context) {
        this(context, null);
    }

    public FooterBatchEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f85223a = LazyKt.lazy(new FZ0.f(7));
        this.f85224b = LazyKt.lazy(new FZ0.g(9));
        this.f85225c = LazyKt.lazy(new FZ0.h(8));
        setBackgroundColor(ContextCompat.getColor(context, R$color.f64616Wh0));
        setClickable(true);
    }

    private final int getBorderMargin() {
        return ((Number) this.f85223a.getValue()).intValue();
    }

    private final int getTabLeftPadding() {
        return ((Number) this.f85224b.getValue()).intValue();
    }

    private final int getTabRightPadding() {
        return ((Number) this.f85225c.getValue()).intValue();
    }

    public final void a(@IdRes int i7, boolean z6) {
        View viewFindViewById = findViewById(i7);
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(z6);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        b bVar = this.f85227e;
        if (bVar != null) {
            bVar.J7(view);
        }
    }

    public final void setBuilder(@NotNull a aVar) {
        ArrayList<c> arrayList;
        this.f85226d = aVar;
        removeAllViews();
        View view = new View(getContext());
        view.setBackgroundResource(R$color.Ga2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ListExtentionsKt.toPx(1.0f));
        layoutParams.gravity = 48;
        view.setLayoutParams(layoutParams);
        addView(view);
        CheckBox checkBox = new CheckBox(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.setMarginStart(getBorderMargin());
        checkBox.setId(2131307719);
        checkBox.setLayoutParams(layoutParams2);
        checkBox.setButtonDrawable(ContextCompat.getDrawable(getContext(), 2131238516));
        checkBox.setText(getResources().getText(2131833197));
        checkBox.setTextColor(ContextCompat.getColor(getContext(), 2131103371));
        checkBox.setTextSize(15.0f);
        checkBox.setOnClickListener(this);
        addView(checkBox);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(8388629);
        a aVar2 = this.f85226d;
        if (aVar2 != null && (arrayList = aVar2.f85228a) != null) {
            for (c cVar : arrayList) {
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setPadding(getTabLeftPadding(), 0, getTabRightPadding(), 0);
                textView.setTextSize(13.0f);
                textView.setTextColor(ContextCompat.getColorStateList(getContext(), cVar.f85231c));
                textView.setText(getResources().getText(cVar.f85230b));
                textView.setId(cVar.f85229a);
                textView.setOnClickListener(this);
                linearLayout.addView(textView);
            }
        }
        addView(linearLayout);
    }

    public final void setOnTabClickListener(@NotNull b bVar) {
        this.f85227e = bVar;
    }

    public final void setSelectAll(boolean z6) {
        CheckBox checkBox = (CheckBox) findViewById(2131307719);
        if (checkBox != null) {
            checkBox.setChecked(z6);
        }
    }
}
