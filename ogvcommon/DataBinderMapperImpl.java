package com.bilibili.ogvcommon;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f73141a = new SparseIntArray(0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f73142a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            f73142a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "vm");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f73143a = new HashMap<>(0);
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
        return a.f73142a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        if (f73141a.get(i7) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f73141a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f73143a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
