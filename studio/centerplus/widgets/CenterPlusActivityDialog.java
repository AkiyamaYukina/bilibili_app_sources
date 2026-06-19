package com.bilibili.studio.centerplus.widgets;

import TB0.C0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.centerplus.network.entity.CenterPlusActivityBean;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/CenterPlusActivityDialog.class */
public final class CenterPlusActivityDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C0 f105302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public CenterPlusActivityBean f105303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f105304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f105305e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/CenterPlusActivityDialog$a.class */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean a(java.lang.String r6, com.bilibili.studio.centerplus.network.entity.CenterPlusActivityBean r7) {
            /*
                Method dump skipped, instruction units count: 617
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.widgets.CenterPlusActivityDialog.a.a(java.lang.String, com.bilibili.studio.centerplus.network.entity.CenterPlusActivityBean):boolean");
        }

        public static void b(@NotNull FragmentManager fragmentManager, @NotNull String str) {
            CenterPlusActivityBean centerPlusActivityBean;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                List array = JSON.parseArray((String) b.f130956g.getValue(), CenterPlusActivityBean.class);
                List listEmptyList = array;
                if (array == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Iterator it = listEmptyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        centerPlusActivityBean = null;
                        break;
                    } else {
                        centerPlusActivityBean = (CenterPlusActivityBean) it.next();
                        if (a(str, centerPlusActivityBean)) {
                            break;
                        }
                    }
                }
                BLog.i("CenterPlusActivityDialog", String.valueOf(centerPlusActivityBean));
                if (centerPlusActivityBean != null && !fragmentManager.isStateSaved() && fragmentManager.findFragmentByTag("CenterPlusActivityDialog") == null) {
                    CenterPlusActivityDialog centerPlusActivityDialog = new CenterPlusActivityDialog();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", centerPlusActivityBean);
                    bundle.putString("showPosition", str);
                    centerPlusActivityDialog.setArguments(bundle);
                    centerPlusActivityDialog.showNow(fragmentManager, "CenterPlusActivityDialog");
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            androidx.compose.foundation.text.C0.c(System.currentTimeMillis() - jCurrentTimeMillis, "all time  : ", "CenterPlusActivityDialog");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data") : null;
        this.f105303c = serializable instanceof CenterPlusActivityBean ? (CenterPlusActivityBean) serializable : null;
        Bundle arguments2 = getArguments();
        String string = null;
        if (arguments2 != null) {
            string = arguments2.getString("showPosition");
        }
        this.f105304d = string;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C0 c0Inflate = C0.inflate(layoutInflater, viewGroup, false);
        this.f105302b = c0Inflate;
        return c0Inflate != null ? c0Inflate.f23493a : null;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f105302b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            super.onDismiss(r1)
            r0 = r5
            boolean r0 = r0.f105305e
            if (r0 != 0) goto L83
            HB0.b r0 = HB0.b.f8155a
            r6 = r0
            r0 = r5
            com.bilibili.studio.centerplus.network.entity.CenterPlusActivityBean r0 = r0.f105303c
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L21
            r0 = r6
            long r0 = r0.getActivityId()
            r7 = r0
            goto L23
        L21:
            r0 = 0
            r7 = r0
        L23:
            r0 = r5
            com.bilibili.studio.centerplus.network.entity.CenterPlusActivityBean r0 = r0.f105303c
            r6 = r0
            java.lang.String r0 = ""
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L3e
            r0 = r6
            java.lang.String r0 = r0.getActivityLink()
            r10 = r0
            r0 = r10
            r6 = r0
            r0 = r10
            if (r0 != 0) goto L41
        L3e:
            java.lang.String r0 = ""
            r6 = r0
        L41:
            r0 = r5
            java.lang.String r0 = r0.f105304d
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L4f
            goto L53
        L4f:
            r0 = r10
            r9 = r0
        L53:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "activity_id"
            r2 = r7
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r10
            java.lang.String r1 = "activity_schema"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r10
            java.lang.String r1 = "refer_page"
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 0
            java.lang.String r1 = "creation.choose-matter.0.close-activity.click"
            r2 = r10
            com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.widgets.CenterPlusActivityDialog.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r8, @org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.widgets.CenterPlusActivityDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
