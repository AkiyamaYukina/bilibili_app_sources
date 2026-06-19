package com.bilibili.pegasus.widget;

import G3.L;
import G3.M;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.HolderStyle;
import com.bilibili.pegasus.PegasusHolder;
import com.bilibili.pegasus.PegasusHolderData;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f79138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f79139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f79140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f79141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f79142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RectF f79143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f79144g;

    public b(@NotNull Context context) {
        this.f79138a = context;
        Paint paint = new Paint();
        this.f79139b = paint;
        Paint paint2 = new Paint();
        this.f79140c = paint2;
        this.f79141d = LazyKt.lazy(new L(8));
        this.f79142e = LazyKt.lazy(new M(8));
        this.f79143f = new RectF();
        this.f79144g = ConfigManager.Companion.isHitFF("ff_pegasus_decoration_shadow_disabled");
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(1.0f);
        a();
    }

    public final void a() {
        this.f79139b.setColor(ThemeUtils.getColorById(this.f79138a, R$color.f64616Wh0));
        this.f79140c.setColor(ThemeUtils.getColorById(this.f79138a, R$color.Ga2));
        this.f79139b.setShadowLayer(ListExtentionsKt.toPx(1.5d), 0.0f, 2.0f, BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
        int oldPosition = bindingAdapterPosition;
        if (bindingAdapterPosition == -1) {
            oldPosition = childViewHolder.getOldPosition();
        }
        if (oldPosition == -1) {
            return;
        }
        Lazy lazy = this.f79141d;
        rect.left = ((Number) lazy.getValue()).intValue();
        rect.right = ((Number) lazy.getValue()).intValue();
        rect.top = 0;
        rect.bottom = ((Number) this.f79142e.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        View view;
        PegasusHolder childViewHolder;
        super.onDraw(canvas, recyclerView, state);
        if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) || this.f79144g) {
            return;
        }
        Iterator it = ViewGroupKt.getChildren(recyclerView).iterator();
        while (it.hasNext() && (childViewHolder = recyclerView.getChildViewHolder((view = (View) it.next()))) != null) {
            PegasusHolder pegasusHolder = childViewHolder instanceof PegasusHolder ? childViewHolder : null;
            HolderStyle holderStyle = null;
            if (pegasusHolder != null) {
                PegasusHolderData bindData = pegasusHolder.getBindData();
                holderStyle = null;
                if (bindData != null) {
                    holderStyle = bindData.getHolderStyle();
                }
            }
            if (holderStyle != null && true == holderStyle.getDrawShadow()) {
                this.f79143f.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                this.f79143f.offset(view.getTranslationX(), view.getTranslationY());
                canvas.drawRoundRect(this.f79143f, ListExtentionsKt.toPx(4), ListExtentionsKt.toPx(4), this.f79139b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
    }
}
