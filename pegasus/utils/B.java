package com.bilibili.pegasus.utils;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.ThreePointV4Item;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/B.class */
public final class B implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f78848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreePointV4Item.SharePlaneItem f78849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BasicIndexItem f78850d;

    public B(int i7, FragmentActivity fragmentActivity, ThreePointV4Item.SharePlaneItem sharePlaneItem, BasicIndexItem basicIndexItem) {
        this.f78847a = i7;
        this.f78848b = fragmentActivity;
        this.f78849c = sharePlaneItem;
        this.f78850d = basicIndexItem;
    }

    public final Bundle getShareContent(String str) {
        int i7 = this.f78847a;
        String str2 = (i7 == 4 || i7 == 42) ? "hot_detail" : null;
        ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
        FragmentActivity fragmentActivity = this.f78848b;
        int i8 = this.f78850d.gotoType;
        Bundle shareContent$default = ListShareHelper.getShareContent$default(listShareHelper, fragmentActivity, this.f78849c, str, str2, i8 == 3322092 ? 1 : i8 == -732377866 ? 2 : 0, (String) null, (Integer) null, (Long) null, false, false, false, 0, 4064, (Object) null);
        Bundle bundle = shareContent$default;
        if (shareContent$default == null) {
            bundle = new Bundle();
        }
        return bundle;
    }
}
