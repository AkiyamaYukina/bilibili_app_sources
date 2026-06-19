package com.bilibili.pegasus.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/j.class */
@StabilityInferred(parameters = 0)
public final class j extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f79154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f79155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Paint f79156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Paint f79157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RectF f79158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f79159f;

    public j(@NotNull Context context, @Nullable WindowSizeClass windowSizeClass) {
        this.f79154a = context;
        this.f79155b = windowSizeClass;
        Paint paint = new Paint();
        this.f79156c = paint;
        Paint paint2 = new Paint();
        this.f79157d = paint2;
        this.f79158e = new RectF();
        this.f79159f = ConfigManager.Companion.isHitFF("ff_pegasus_decoration_shadow_disabled");
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(1.0f);
        a();
    }

    public final void a() {
        this.f79156c.setColor(ThemeUtils.getColorById(this.f79154a, R$color.f64616Wh0));
        this.f79157d.setColor(ThemeUtils.getColorById(this.f79154a, R$color.Ga2));
        this.f79156c.setShadowLayer(ListExtentionsKt.toPx(1.5d), 0.0f, 2.0f, BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getItemOffsets(@org.jetbrains.annotations.NotNull android.graphics.Rect r4, @org.jetbrains.annotations.NotNull android.view.View r5, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView r6, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r7) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.widget.j.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        View view;
        PegasusHolder childViewHolder;
        super.onDraw(canvas, recyclerView, state);
        if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE) || this.f79159f) {
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
                this.f79158e.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                this.f79158e.offset(view.getTranslationX(), view.getTranslationY());
                canvas.drawRoundRect(this.f79158e, ListExtentionsKt.toPx(4), ListExtentionsKt.toPx(4), this.f79156c);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        View view;
        PegasusHolder childViewHolder;
        if (PegasusStyleKt.currentIsDoubleColumn(PegasusStyle.INSTANCE)) {
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
            if (holderStyle != null && true == holderStyle.getDrawBottomLine()) {
                int left = recyclerView.getLeft();
                int right = recyclerView.getRight();
                int bottom = view.getBottom();
                float f7 = left;
                float f8 = bottom;
                canvas.drawLine(f7, f8, right, f8, this.f79157d);
            }
        }
    }
}
