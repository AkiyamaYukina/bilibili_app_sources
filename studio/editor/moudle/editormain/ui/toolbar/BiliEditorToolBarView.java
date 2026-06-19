package com.bilibili.studio.editor.moudle.editormain.ui.toolbar;

import Ay0.d;
import Ay0.g;
import Ay0.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.N1;
import androidx.compose.runtime.O1;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ad.adview.videodetail.upper.banner.v2.h;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.a;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBar;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarItem;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBarType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/BiliEditorToolBarView.class */
public final class BiliEditorToolBarView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f107081g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final yy0.a f107082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f107083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f107084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f107085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function1<? super EditorToolBar, Unit> f107086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function2<? super EditorToolBar, ? super EditorToolBarItem, Unit> f107087f;

    @JvmOverloads
    public BiliEditorToolBarView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliEditorToolBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BiliEditorToolBarView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f107082a = new yy0.a();
        this.f107083b = new a();
        this.f107084c = new i(context, 0);
    }

    public final void a(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        view.setVisibility(0);
    }

    public final void b(EditorToolBar editorToolBar) {
        if ((editorToolBar != null ? editorToolBar.getParentToolBar() : null) != null) {
            b(editorToolBar.getParentToolBar());
            this.f107083b.a(new a.C1192a(editorToolBar, 0));
        } else if (editorToolBar != null) {
            this.f107083b.a(new a.C1192a(editorToolBar, 0));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(@NotNull EditorToolBar editorToolBar, int i7) throws NoWhenBranchMatchedException {
        List<Integer> disableItems;
        List<Integer> disableItems2;
        BLog.e("EditorToolBarView", "showToolBar toolBarType=" + editorToolBar.getToolBarType());
        if (editorToolBar.getToolBarType() == EditorToolBarType.MAIN_TOOL_BAR) {
            BLog.e("EditorToolBarView", "showMainToolBar toolBarType=" + editorToolBar.getToolBarType() + ",curShowToolBarView=" + this.f107085d);
            this.f107084c.setToolBarData(editorToolBar);
            RecyclerView recyclerView = this.f107084c.f640b;
            if (recyclerView != null) {
                recyclerView.scrollBy(i7, 0);
            }
            View view = this.f107085d;
            if (view != null) {
                d(view, this.f107084c);
            } else {
                a(this.f107084c);
            }
            this.f107083b.f107088a.clear();
            BLog.e("EditorToolBarView", "clearStack");
            this.f107084c.setOnToolbarItemViewClick(new N1(this, 3));
            this.f107085d = this.f107084c;
            return;
        }
        a.C1192a curToolBarData = getCurToolBarData();
        int iIsSameToolBar = editorToolBar.isSameToolBar(curToolBarData != null ? curToolBarData.f107089a : null);
        T7.a.a(iIsSameToolBar, "工具栏的一致性检测 checkResult=", "EditorToolBarView");
        if (iIsSameToolBar == 0) {
            return;
        }
        if (iIsSameToolBar == 3) {
            View view2 = this.f107085d;
            if (view2 instanceof g) {
                g gVar = (g) view2;
                List<Integer> disableItems3 = editorToolBar.getDisableItems();
                EditorToolBar editorToolBar2 = gVar.f634e;
                if (editorToolBar2 != null && (disableItems2 = editorToolBar2.getDisableItems()) != null) {
                    disableItems2.clear();
                }
                EditorToolBar editorToolBar3 = gVar.f634e;
                if (editorToolBar3 != null && (disableItems = editorToolBar3.getDisableItems()) != null) {
                    disableItems.addAll(disableItems3);
                }
                d dVar = gVar.f633d;
                if (dVar != null) {
                    dVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
        int i8 = curToolBarData != null ? curToolBarData.f107090b : 0;
        EditorToolBarType toolBarType = null;
        if (curToolBarData != null) {
            EditorToolBar editorToolBar4 = curToolBarData.f107089a;
            toolBarType = null;
            if (editorToolBar4 != null) {
                toolBarType = editorToolBar4.getToolBarType();
            }
        }
        if (toolBarType == editorToolBar.getToolBarType()) {
            i7 = i8;
        }
        yy0.a aVar = this.f107082a;
        g gVar2 = ((ArrayList) aVar.a).isEmpty() ? new g(getContext(), 0) : (g) ((ArrayList) aVar.a).remove(0);
        gVar2.setToolBarData(editorToolBar);
        gVar2.f632c.scrollBy(i7, 0);
        gVar2.setOnToolBarItemViewClick(new O1(this, 3));
        gVar2.setOnBackViewClick(new h(this, 4));
        View view3 = this.f107085d;
        if (view3 != null) {
            d(view3, gVar2);
        } else {
            a(gVar2);
        }
        this.f107085d = gVar2;
        if (curToolBarData != null && curToolBarData.f107089a.getToolBarLevel().getValue() < editorToolBar.getToolBarLevel().getValue()) {
            this.f107083b.a(curToolBarData);
        }
        b(editorToolBar.getParentToolBar());
    }

    public final void d(View view, View view2) {
        view.setVisibility(8);
        removeView(view);
        if (view instanceof g) {
            yy0.a aVar = this.f107082a;
            g gVar = (g) view;
            aVar.getClass();
            gVar.f634e = null;
            gVar.f636g = null;
            gVar.f635f = null;
            d dVar = gVar.f633d;
            if (dVar != null) {
                dVar.f622b = null;
                dVar.notifyDataSetChanged();
            }
            gVar.f633d = null;
            gVar.f631b.setImageResource(0);
            ((ArrayList) aVar.a).add(gVar);
        }
        view2.setVisibility(0);
        a(view2);
    }

    @Nullable
    public final a.C1192a getCurToolBarData() {
        View view = this.f107085d;
        a.C1192a c1192a = null;
        if (view instanceof g) {
            EditorToolBar toolBarData = ((g) view).getToolBarData();
            if (toolBarData == null) {
                return null;
            }
            return new a.C1192a(toolBarData, ((g) this.f107085d).getItemListScrollDistance());
        }
        if (view instanceof i) {
            EditorToolBar toolBarData2 = ((i) view).getToolBarData();
            if (toolBarData2 == null) {
                return null;
            }
            c1192a = new a.C1192a(toolBarData2, ((i) this.f107085d).getItemListScrollDistance());
        }
        return c1192a;
    }

    @Nullable
    public final Function1<EditorToolBar, Unit> getOnToolBarBackViewClick() {
        return this.f107086e;
    }

    @Nullable
    public final Function2<EditorToolBar, EditorToolBarItem, Unit> getOnToolBarItemViewClick() {
        return this.f107087f;
    }

    public final void setOnToolBarBackViewClick(@Nullable Function1<? super EditorToolBar, Unit> function1) {
        this.f107086e = function1;
    }

    public final void setOnToolBarItemViewClick(@Nullable Function2<? super EditorToolBar, ? super EditorToolBarItem, Unit> function2) {
        this.f107087f = function2;
    }
}
