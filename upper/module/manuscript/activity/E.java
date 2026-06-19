package com.bilibili.upper.module.manuscript.activity;

import androidx.fragment.app.FragmentManager;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/E.class */
public final class E extends GI0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViolationPicItemActivity f113417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ViolationPicItemActivity violationPicItemActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f113417b = violationPicItemActivity;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<? extends AuditReason.ViolationPic> list = this.f113417b.f113532H;
        return list != null ? list.size() : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // androidx.fragment.app.FragmentPagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment getItem(int r4) {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.upper.module.manuscript.activity.ViolationPicItemActivity r0 = r0.f113417b
            java.util.List<? extends com.bilibili.upper.module.manuscript.bean.AuditReason$ViolationPic> r0 = r0.f113532H
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1a
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.upper.module.manuscript.bean.AuditReason$ViolationPic r0 = (com.bilibili.upper.module.manuscript.bean.AuditReason.ViolationPic) r0
            r5 = r0
            goto L1c
        L1a:
            r0 = 0
            r5 = r0
        L1c:
            r0 = r5
            if (r0 == 0) goto L2b
            r0 = r5
            java.lang.String r0 = r0.url
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L2e
        L2b:
            java.lang.String r0 = ""
            r5 = r0
        L2e:
            java.lang.String r0 = "pic_src"
            r1 = r5
            android.os.Bundle r0 = androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m(r0, r1)
            r5 = r0
            com.bilibili.upper.module.manuscript.fragment.ViolationPicItemFragment r0 = new com.bilibili.upper.module.manuscript.fragment.ViolationPicItemFragment
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r5
            r0.setArguments(r1)
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.E.getItem(int):androidx.fragment.app.Fragment");
    }
}
