package com.bilibili.upper.module.draft.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import bolts.Task;
import com.bilibili.lib.ui.BaseRecyclerViewFragment;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import fC0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.util.DigitsUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/fragment/DraftBaseFragment.class */
public class DraftBaseFragment extends BaseRecyclerViewFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113109d = 23;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f113110e;

    public final void jf(@Nullable List<DraftItemBean> list) {
        if (list == null) {
            Task.callInBackground(new d(getApplicationContext(), (List) null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DraftItemBean> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().draftCoverPath);
        }
        Task.callInBackground(new d(getApplicationContext(), arrayList));
    }

    public final int kf() {
        int iIntValue;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return -1;
        }
        Object obj = arguments.get("theme_style");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Number number = null;
            if (obj instanceof Number) {
                number = (Number) obj;
            }
            iIntValue = number != null ? number.intValue() : obj instanceof String ? DigitsUtil.parseInt((CharSequence) obj, 0) : 0;
        }
        return iIntValue;
    }
}
