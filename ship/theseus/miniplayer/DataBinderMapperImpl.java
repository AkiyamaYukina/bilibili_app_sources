package com.bilibili.ship.theseus.miniplayer;

import Fp.c;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vu0.C8861b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f91149a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f91150a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            f91150a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "constraintSetModifier");
            sparseArray.put(2, "limitText");
            sparseArray.put(3, "limitTextColor");
            sparseArray.put(4, "miniPlayerDoubleTapHintVisible");
            sparseArray.put(5, "nextSheetVisible");
            sparseArray.put(6, "onErrorCoverClickListener");
            sparseArray.put(7, "onLimitCoverClickListener");
            sparseArray.put(8, "showingControl");
            sparseArray.put(9, "showingErrorCover");
            sparseArray.put(10, "showingLimitCover");
            sparseArray.put(11, "vm");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f91151a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f91151a = map;
            map.put("layout/theseus_mini_player_panel_0", 2131500364);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f91149a = sparseIntArray;
        sparseIntArray.put(2131500364, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.ui.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f91150a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f91149a.get(i7);
        if (i8 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i8 != 1) {
            return null;
        }
        if ("layout/theseus_mini_player_panel_0".equals(tag)) {
            return new C8861b(view, dataBindingComponent);
        }
        throw new IllegalArgumentException(c.b(tag, "The tag for theseus_mini_player_panel is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f91149a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f91151a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
