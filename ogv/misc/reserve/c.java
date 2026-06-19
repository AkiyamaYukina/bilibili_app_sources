package com.bilibili.ogv.misc.reserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.ogv.misc.reserve.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/c.class */
@StabilityInferred(parameters = 0)
public final class c extends TintLinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheckBox f69182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f69183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f69184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f69185f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/c$a.class */
    @StabilityInferred(parameters = 1)
    public static class a {
        public void a(boolean z6) {
            throw null;
        }

        public void b() {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.CompoundButton$OnCheckedChangeListener, com.bilibili.ogv.misc.reserve.b] */
    public c(@NotNull Context context) {
        super(context);
        ?? r02 = new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.ogv.misc.reserve.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f69181a;

            {
                this.f69181a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                c.a aVar = this.f69181a.f69184e;
                if (aVar != null) {
                    aVar.a(z6);
                }
            }
        };
        this.f69185f = r02;
        setOrientation(1);
        setBackgroundResource(R$color.f64616Wh0);
        LayoutInflater.from(getContext()).inflate(2131493258, this);
        CheckBox checkBox = (CheckBox) findViewById(2131298745);
        this.f69182c = checkBox;
        this.f69183d = (TextView) findViewById(2131299944);
        findViewById(2131298728).setOnClickListener(this);
        checkBox.setOnCheckedChangeListener(r02);
    }

    public final void c(int i7, boolean z6) {
        this.f69182c.setOnCheckedChangeListener(null);
        this.f69182c.setChecked(z6);
        this.f69182c.setOnCheckedChangeListener(this.f69185f);
        if (i7 > 0) {
            this.f69183d.setEnabled(true);
            this.f69183d.setText(getResources().getString(2131822079, String.valueOf(i7)));
            this.f69183d.setTextColor(-370089);
            this.f69183d.setOnClickListener(this);
            return;
        }
        this.f69183d.setEnabled(false);
        this.f69183d.setText(getResources().getString(2131822078));
        this.f69183d.setTextColor(ContextCompat.getColor(getContext(), R$color.Ga4));
        this.f69183d.setOnClickListener(null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131299944) {
            a aVar = this.f69184e;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        if (id == 2131298728) {
            this.f69182c.setChecked(!r0.isChecked());
        }
    }
}
