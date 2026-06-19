package com.bilibili.lib.projection.internal.search.searchv2;

import L3.r0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.mall.ui.page.create2.OrderGameInfoSelectionDialogFragment;
import com.mall.ui.page.detail.MallDyDetailFragment;
import com.mall.ui.page.detail.widget.MallDyHighLight;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchTitleBar.class */
public final class SearchTitleBar extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63782e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TintTextView f63783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TintImageView f63784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f63786d;

    @JvmOverloads
    public SearchTitleBar(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchTitleBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f63785c = new K2.k(5);
        this.f63786d = new r0(6);
        LayoutInflater.from(context).inflate(2131503053, (ViewGroup) this, true);
        this.f63783a = (TintTextView) findViewById(2131322139);
        TintImageView tintImageView = (TintImageView) findViewById(2131322098);
        TintImageView tintImageView2 = (TintImageView) findViewById(2131322100);
        this.f63784b = (TintImageView) findViewById(2131322087);
        if (tintImageView != null) {
            final int i8 = 0;
            tintImageView.setOnClickListener(new View.OnClickListener(this, i8) { // from class: com.bilibili.lib.projection.internal.search.searchv2.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63807a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63808b;

                {
                    this.f63807a = i8;
                    this.f63808b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f63807a) {
                        case 0:
                            ((SearchTitleBar) this.f63808b).f63785c.invoke();
                            break;
                        default:
                            MallDyDetailFragment mallDyDetailFragment = (MallDyDetailFragment) this.f63808b;
                            gQ0.f.h("dy_guide", 1);
                            MallDyHighLight mallDyHighLight = mallDyDetailFragment.C;
                            if (mallDyHighLight != null) {
                                mallDyHighLight.setVisibility(8);
                            }
                            break;
                    }
                }
            });
        }
        if (tintImageView2 != null) {
            final int i9 = 0;
            tintImageView2.setOnClickListener(new View.OnClickListener(this, i9) { // from class: com.bilibili.lib.projection.internal.search.searchv2.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63809a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63810b;

                {
                    this.f63809a = i9;
                    this.f63810b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vR0.h hVar;
                    switch (this.f63809a) {
                        case 0:
                            ((SearchTitleBar) this.f63810b).f63786d.invoke();
                            break;
                        case 1:
                            ((MallDyDetailFragment) this.f63810b).vf(1);
                            break;
                        default:
                            OrderGameInfoSelectionDialogFragment orderGameInfoSelectionDialogFragment = (OrderGameInfoSelectionDialogFragment) this.f63810b;
                            List list = orderGameInfoSelectionDialogFragment.d;
                            if (list != null) {
                                com.mall.ui.page.create2.a aVar = orderGameInfoSelectionDialogFragment.g;
                                hVar = (vR0.h) CollectionsKt.getOrNull(list, aVar != null ? aVar.b : 0);
                            } else {
                                hVar = null;
                            }
                            OrderGameInfoSelectionDialogFragment.a aVar2 = orderGameInfoSelectionDialogFragment.h;
                            if (aVar2 != null) {
                                com.mall.ui.page.create2.a aVar3 = orderGameInfoSelectionDialogFragment.g;
                                aVar2.a(hVar, aVar3 != null ? aVar3.b : -1);
                            }
                            orderGameInfoSelectionDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        }
    }

    public final void setBackCallback(@NotNull Function0<Unit> function0) {
        this.f63785c = function0;
    }

    public final void setCastingIconVisible(boolean z6) {
        if (z6) {
            TintImageView tintImageView = this.f63784b;
            if (tintImageView != null) {
                tintImageView.setVisibility(0);
                return;
            }
            return;
        }
        TintImageView tintImageView2 = this.f63784b;
        if (tintImageView2 != null) {
            tintImageView2.setVisibility(8);
        }
    }

    public final void setRefreshCallback(@NotNull Function0<Unit> function0) {
        this.f63786d = function0;
    }

    public final void setTitle(@NotNull String str) {
        TintTextView tintTextView = this.f63783a;
        if (tintTextView != null) {
            tintTextView.setText(str);
        }
    }
}
