package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.core.app.NotificationCompat;
import com.bilibili.relation.FollowStateManager;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/I.class */
public final class I implements zh1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaffsService f101778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Staff f101779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101781d;

    public I(StaffsService staffsService, Staff staff, long j7, int i7) {
        this.f101778a = staffsService;
        this.f101779b = staff;
        this.f101780c = j7;
        this.f101781d = i7;
    }

    public final void a(boolean z6) {
        this.f101779b.f101787b = z6 ? 1 : 0;
    }

    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f101778a.f101833b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFollowError(java.lang.Throwable r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
            r5 = r0
            r0 = r3
            com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService r0 = r0.f101778a
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L2f
            r0 = r4
            com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
            r4 = r0
            r0 = r4
            int r0 = r0.mCode
            boolean r0 = Hs0.a.a(r0)
            if (r0 == 0) goto L27
            r0 = r7
            android.content.Context r0 = r0.f101832a
            Hs0.a.b(r0)
            return
        L27:
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            r4 = r0
            goto L31
        L2f:
            r0 = 0
            r4 = r0
        L31:
            r0 = r4
            if (r0 == 0) goto L40
            r0 = r4
            r6 = r0
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L4b
        L40:
            r0 = r7
            android.content.Context r0 = r0.f101832a
            r1 = 2131847626(0x7f1169ca, float:1.9328735E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
        L4b:
            r0 = r6
            com.bilibili.ship.theseus.united.utils.q.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.staffs.I.onFollowError(java.lang.Throwable):void");
    }

    public final void onFollowSuccess() {
        Staff staff = this.f101779b;
        staff.f101787b = 1;
        FollowStateManager companion = FollowStateManager.Companion.getInstance();
        long j7 = this.f101780c;
        companion.notify(j7, true, null);
        StaffsService staffsService = this.f101778a;
        t tVar = staffsService.f101856z;
        if (tVar != null) {
            tVar.b(this.f101781d, j7);
        }
        String strC = UR0.D.c(true ^ staff.c(), false);
        HashMap map = new HashMap();
        map.putAll(staffsService.f101844n.a(null));
        map.put("spmid", "united.player-video-detail.joint-submission.0");
        map.put(NotificationCompat.CATEGORY_STATUS, strC);
        map.put(EditCustomizeSticker.TAG_MID, String.valueOf(staff.f101786a));
        map.put("action_type", "interaction_follow");
        UR0.D.d(map);
        com.bilibili.ship.theseus.united.utils.q.c(staffsService.f101832a.getString(2131846742));
    }
}
