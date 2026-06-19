package com.bilibili.biligame;

import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.biligame.ui.image.GameImageViewV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import qp.c0;
import qp.d;
import qp.e;
import qp.i0;
import qp.j0;
import qp.k0;
import qp.m0;
import qp.o0;
import qp.p0;
import qp.s0;
import qp.u0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f62111a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f62112a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(10);
            f62112a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "category");
            sparseArray.put(2, "comment");
            sparseArray.put(3, "count");
            sparseArray.put(4, "group");
            sparseArray.put(5, "info");
            sparseArray.put(6, "reply");
            sparseArray.put(7, "title");
            sparseArray.put(8, "viewModel");
            sparseArray.put(9, "vm");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f62113a;

        static {
            HashMap<String, Integer> map = new HashMap<>(8);
            f62113a = map;
            p2.b.a(2131496723, map, "layout/biligame_activity_dynamic_0", 2131496986, "layout/biligame_item_category_text_0");
            p2.b.a(2131497026, map, "layout/biligame_item_game_comment_detail_0", 2131497027, "layout/biligame_item_game_comment_detail_title_0");
            p2.b.a(2131497037, map, "layout/biligame_item_game_comment_reply_0", 2131497072, "layout/biligame_item_hot_comment_top_0");
            p2.b.a(2131497121, map, "layout/biligame_item_test_rank_group_0", 2131497122, "layout/biligame_item_test_rank_group_float_0");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f62111a = sparseIntArray;
        sparseIntArray.put(2131496723, 1);
        sparseIntArray.put(2131496986, 2);
        sparseIntArray.put(2131497026, 3);
        sparseIntArray.put(2131497027, 4);
        sparseIntArray.put(2131497037, 5);
        sparseIntArray.put(2131497072, 6);
        sparseIntArray.put(2131497121, 7);
        sparseIntArray.put(2131497122, 8);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.screen.adjust.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f62112a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f62111a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i8) {
            case 1:
                if (!"layout/biligame_activity_dynamic_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for biligame_activity_dynamic is invalid. Received: "));
                }
                Object[] objArrMapBindings = ViewDataBinding.mapBindings(dataBindingComponent, view, 6, (ViewDataBinding.i) null, e.E);
                d dVar = new d(dataBindingComponent, view, (ImageView) objArrMapBindings[4], (Toolbar) objArrMapBindings[3], (TextView) objArrMapBindings[1], (TextView) objArrMapBindings[2], (ViewPager) objArrMapBindings[5]);
                ((e) dVar).D = -1L;
                ((LinearLayout) objArrMapBindings[0]).setTag(null);
                dVar.y.setTag(null);
                dVar.z.setTag(null);
                dVar.setRootTag(view);
                dVar.invalidateAll();
                return dVar;
            case 2:
                if ("layout/biligame_item_category_text_0".equals(tag)) {
                    return new c0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_category_text is invalid. Received: "));
            case 3:
                if ("layout/biligame_item_game_comment_detail_0".equals(tag)) {
                    return new i0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_game_comment_detail is invalid. Received: "));
            case 4:
                if (!"layout/biligame_item_game_comment_detail_title_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_game_comment_detail_title is invalid. Received: "));
                }
                Object[] objArrMapBindings2 = ViewDataBinding.mapBindings(dataBindingComponent, view, 2, (ViewDataBinding.i) null, (SparseIntArray) null);
                j0 j0Var = new j0(dataBindingComponent, view, (TextView) objArrMapBindings2[1]);
                ((k0) j0Var).y = -1L;
                ((ConstraintLayout) objArrMapBindings2[0]).setTag(null);
                j0Var.w.setTag(null);
                j0Var.setRootTag(view);
                j0Var.invalidateAll();
                return j0Var;
            case 5:
                if ("layout/biligame_item_game_comment_reply_0".equals(tag)) {
                    return new m0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_game_comment_reply is invalid. Received: "));
            case 6:
                if (!"layout/biligame_item_hot_comment_top_0".equals(tag)) {
                    throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_hot_comment_top is invalid. Received: "));
                }
                Object[] objArrMapBindings3 = ViewDataBinding.mapBindings(dataBindingComponent, view, 6, (ViewDataBinding.i) null, p0.C);
                o0 o0Var = new o0(dataBindingComponent, view, (GameImageViewV2) objArrMapBindings3[1], (RatingBar) objArrMapBindings3[3], (TextView) objArrMapBindings3[4], (TextView) objArrMapBindings3[2]);
                ((p0) o0Var).B = -1L;
                o0Var.w.setTag(null);
                ((ConstraintLayout) objArrMapBindings3[0]).setTag(null);
                o0Var.x.setTag(null);
                o0Var.y.setTag(null);
                o0Var.z.setTag(null);
                o0Var.setRootTag(view);
                o0Var.invalidateAll();
                return o0Var;
            case 7:
                if ("layout/biligame_item_test_rank_group_0".equals(tag)) {
                    return new s0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_test_rank_group is invalid. Received: "));
            case 8:
                if ("layout/biligame_item_test_rank_group_float_0".equals(tag)) {
                    return new u0(view, dataBindingComponent);
                }
                throw new IllegalArgumentException(c.b(tag, "The tag for biligame_item_test_rank_group_float is invalid. Received: "));
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f62111a.get(i7) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int getLayoutId(String str) {
        int iIntValue = 0;
        if (str == null) {
            return 0;
        }
        Integer num = b.f62113a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
