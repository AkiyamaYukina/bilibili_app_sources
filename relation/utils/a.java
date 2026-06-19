package com.bilibili.relation.utils;

import UR0.D;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.relation.api.RelationApiManager;
import com.bilibili.relation.group.AttentionGroupDialog;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/a.class */
public final class a implements FollowFlowHelper.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FollowFlowHelper f86186c;

    /* JADX INFO: renamed from: com.bilibili.relation.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/utils/a$a.class */
    public final class C0575a implements AttentionGroupDialog.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f86187a;

        public C0575a(a aVar) {
            this.f86187a = aVar;
        }

        @Override // com.bilibili.relation.group.AttentionGroupDialog.b
        public final void a(boolean z6) {
            this.f86187a.f86186c.f86149i.onSpecialStatusChange(z6);
        }
    }

    public a(FollowFlowHelper followFlowHelper, Context context, String str) {
        this.f86186c = followFlowHelper;
        this.f86184a = context;
        this.f86185b = str;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.h
    public final void a() {
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"follow_tag_click", "click"});
        Context context = this.f86184a;
        FollowFlowHelper followFlowHelper = this.f86186c;
        AttentionGroupDialog.jf(context, followFlowHelper.f86144c, followFlowHelper.f86146e, new C0575a(this));
        followFlowHelper.f86149i.onGroupClickListener();
        HashMap<String, String> map = followFlowHelper.f86152l;
        if (map != null) {
            map.put("action_type", "interaction_set_follow_group");
            followFlowHelper.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(followFlowHelper.f86143b, followFlowHelper.f86153m));
            D.d(followFlowHelper.f86152l);
        }
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.h
    public final void b() {
        D.f();
        Context context = this.f86184a;
        FollowFlowHelper followFlowHelper = this.f86186c;
        followFlowHelper.c(context);
        HashMap<String, String> map = followFlowHelper.f86152l;
        if (map != null) {
            map.put("action_type", "interaction_unfollow");
            followFlowHelper.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(followFlowHelper.f86143b, followFlowHelper.f86153m));
            if (!TextUtils.isEmpty(followFlowHelper.f86148g)) {
                followFlowHelper.f86152l.put("from_scmid", followFlowHelper.f86148g);
            }
            if (!TextUtils.isEmpty(followFlowHelper.f86146e)) {
                followFlowHelper.f86152l.put("spmid", followFlowHelper.f86146e);
            }
            followFlowHelper.f86152l.put(EditCustomizeSticker.TAG_MID, this.f86185b);
            D.d(followFlowHelper.f86152l);
        }
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.h
    public final void c(boolean z6) {
        String str = this.f86185b;
        FollowFlowHelper followFlowHelper = this.f86186c;
        if (z6) {
            HashMap<String, String> map = followFlowHelper.f86152l;
            if (map != null) {
                map.put("action_type", "interaction_special_unfollow");
                followFlowHelper.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(followFlowHelper.f86143b, followFlowHelper.f86153m));
                D.d(followFlowHelper.f86152l);
            }
            RelationApiManager.removeSpecial(BiliAccounts.get(this.f86184a).getAccessKey(), str, new FollowFlowHelper.i(this.f86184a, true, followFlowHelper.f86149i));
            return;
        }
        HashMap<String, String> map2 = followFlowHelper.f86152l;
        if (map2 != null) {
            map2.put("action_type", "interaction_special_follow");
            followFlowHelper.f86152l.put(NotificationCompat.CATEGORY_STATUS, D.c(followFlowHelper.f86143b, followFlowHelper.f86153m));
            D.d(followFlowHelper.f86152l);
        }
        RelationApiManager.addSpecial(BiliAccounts.get(this.f86184a).getAccessKey(), str, new FollowFlowHelper.i(this.f86184a, false, followFlowHelper.f86149i));
    }
}
