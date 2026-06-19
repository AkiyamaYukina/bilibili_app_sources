package com.bilibili.ogv.misc.follow;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.ogv.infra.account.a;
import com.bilibili.ogv.misc.follow.AbsFollowMainFragment;
import com.bilibili.pvtracker.IPvTracker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8331z;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiCinemaMineFragmentV2.class */
@StabilityInferred(parameters = 0)
public final class BangumiCinemaMineFragmentV2 extends AbsFollowMainFragment implements IPvTracker {
    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.my-favorite-cinema.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        BiliAccountInfo biliAccountInfo = a.f67851a;
        VipUserInfo vipInfo = biliAccountInfo.getVipInfo();
        int vipType = 0;
        int vipStatus = vipInfo != null ? vipInfo.getVipStatus() : 0;
        VipUserInfo vipInfo2 = biliAccountInfo.getVipInfo();
        if (vipInfo2 != null) {
            vipType = vipInfo2.getVipType();
        }
        VipUserInfo vipInfo3 = biliAccountInfo.getVipInfo();
        long endTime = vipInfo3 != null ? vipInfo3.getEndTime() : 0L;
        Bundle bundle = new Bundle();
        bundle.putString("vip_type", String.valueOf(vipType));
        bundle.putString("vip_status", String.valueOf(vipStatus));
        bundle.putString("vip_due_date", String.valueOf(endTime));
        FollowSubFragment followSubFragmentPf = pf();
        bundle.putString(NotificationCompat.CATEGORY_STATUS, String.valueOf(followSubFragmentPf != null ? Integer.valueOf(followSubFragmentPf.f69086p) : null));
        Bundle arguments = getArguments();
        String string = null;
        if (arguments != null) {
            string = arguments.getString("from_spmid");
        }
        bundle.putString("from_spmid", string);
        return bundle;
    }

    @Override // com.bilibili.ogv.misc.follow.AbsFollowMainFragment
    public final void qf() {
        PageAdapter pageAdapter = this.f69010m;
        if (pageAdapter != null) {
            pageAdapter.add(new AbsFollowMainFragment.a(2, 1, new FollowSubFragment()));
        }
        PageAdapter pageAdapter2 = this.f69010m;
        if (pageAdapter2 != null) {
            pageAdapter2.add(new AbsFollowMainFragment.a(2, 2, new FollowSubFragment()));
        }
        PageAdapter pageAdapter3 = this.f69010m;
        if (pageAdapter3 != null) {
            pageAdapter3.add(new AbsFollowMainFragment.a(2, 3, new FollowSubFragment()));
        }
    }

    @Override // com.bilibili.ogv.misc.follow.AbsFollowMainFragment
    public final void rf(int i7) {
        C8331z.a(i7 != 0 ? i7 != 2 ? "pgc.my-favorite-cinema.group.watching.click" : "pgc.my-favorite-cinema.group.watched.click" : "pgc.my-favorite-cinema.group.will.click", null, null, null);
    }
}
