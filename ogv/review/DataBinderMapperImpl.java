package com.bilibili.ogv.review;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/DataBinderMapperImpl.class */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f72178a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/DataBinderMapperImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f72179a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            f72179a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "avatarUrl");
            sparseArray.put(2, "coverUrl");
            sparseArray.put(3, "description");
            sparseArray.put(4, "nickname");
            sparseArray.put(5, "posterBackgroundBottom");
            sparseArray.put(6, "posterMaskLower");
            sparseArray.put(7, "posterMaskUpper");
            sparseArray.put(8, "qrCode");
            sparseArray.put(9, "reviewPublishTime");
            sparseArray.put(10, "scoreText");
            sparseArray.put(11, "vm");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/DataBinderMapperImpl$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f72180a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            f72180a = map;
            map.put("layout/review_poster_review_publish_success_0", 2131499894);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f72178a = sparseIntArray;
        sparseIntArray.put(2131499894, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.app.gemini.base.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogv.glue.DataBinderMapperImpl());
        arrayList.add(new com.bilibili.ogvcommon.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final String convertBrIdToString(int i7) {
        return a.f72179a.get(i7);
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i7) {
        int i8 = f72178a.get(i7);
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
        if ("layout/review_poster_review_publish_success_0".equals(tag)) {
            return new Al0.b(view, dataBindingComponent);
        }
        throw new IllegalArgumentException(Fp.c.b(tag, "The tag for review_poster_review_publish_success is invalid. Received: "));
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i7) {
        if (viewArr == null || viewArr.length == 0 || f72178a.get(i7) <= 0 || viewArr[0].getTag() != null) {
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
        Integer num = b.f72180a.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }
}
