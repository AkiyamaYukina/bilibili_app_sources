package com.bilibili.lib.ui.menu;

import LA.f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/FloatMenuWindow.class */
public class FloatMenuWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f64861a = (int) f.a(200.0f, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f64862b = (int) f.a(25.0f, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64863c = (int) f.a(30.0f, 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/FloatMenuWindow$MenuType.class */
    public enum MenuType {
        TYPE_NORMAL,
        TYPE_TITLE_LIST
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/FloatMenuWindow$a.class */
    public static final class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<IFloatMenuItem> f64864a;

        @Override // android.widget.Adapter
        public final int getCount() {
            List<IFloatMenuItem> list = this.f64864a;
            return list == null ? 0 : list.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i7) {
            return this.f64864a.get(i7);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i7) {
            return this.f64864a.get(i7).getType();
        }

        @Override // android.widget.Adapter
        public final View getView(int i7, View view, ViewGroup viewGroup) {
            return this.f64864a.get(i7).getView(view, viewGroup);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return MenuType.values().length;
        }
    }

    @Nullable
    public static PopupWindow show(Context context, @Nullable View view, View view2, List<IFloatMenuItem> list) {
        return show(context, view, view2, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Type inference failed for: r0v101, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v105, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v121, types: [android.widget.ListView] */
    /* JADX WARN: Type inference failed for: r0v174, types: [android.widget.ListView] */
    /* JADX WARN: Type inference failed for: r0v196, types: [com.bilibili.lib.ui.menu.IFloatMenuItem] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bilibili.lib.ui.menu.IFloatMenuItem] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.PopupWindow] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.BaseAdapter, android.widget.ListAdapter, com.bilibili.lib.ui.menu.FloatMenuWindow$a] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.ListView] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.PopupWindow show(android.content.Context r6, @androidx.annotation.Nullable android.view.View r7, android.view.View r8, java.util.List<com.bilibili.lib.ui.menu.IFloatMenuItem> r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 1007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.menu.FloatMenuWindow.show(android.content.Context, android.view.View, android.view.View, java.util.List, java.lang.String):android.widget.PopupWindow");
    }

    @Nullable
    public static PopupWindow show(Context context, View view, List<IFloatMenuItem> list) {
        return show(context, (View) null, view, list);
    }

    @Nullable
    public static PopupWindow show(Context context, View view, List<IFloatMenuItem> list, String str) {
        return show(context, null, view, list, str);
    }
}
