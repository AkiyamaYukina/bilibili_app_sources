package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bF0.C4951F;
import com.alibaba.fastjson.JSON;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.ui.permission.PermissionBiz;
import com.bilibili.location.LocationManager;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import com.bilibili.upper.api.bean.manuscript.VideoViolationPic;
import com.bilibili.upper.module.contribute.dynamic.DynamicEditDialogFragment;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import com.mall.ui.page.newest.MallNewestFragment;
import gI0.C7263m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/AuditProblemShowActivity.class */
@StabilityInferred(parameters = 0)
public final class AuditProblemShowActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f113408G = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public C4951F f113409D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f113410E = LazyKt.lazy(new BS0.A(this, 5));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final C7263m f113411F = new C7263m();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/AuditProblemShowActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f113412a;

        public a(Function1 function1) {
            this.f113412a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f113412a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113412a.invoke(obj);
        }
    }

    @NotNull
    public final com.bilibili.upper.module.manuscript.model.b Q6() {
        return (com.bilibili.upper.module.manuscript.model.b) this.f113410E.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        ProblemDetailBean problemDetailBean = Q6().f113668g;
        return problemDetailBean == null ? "creation.only-return-detial-page.0.0.pv" : (problemDetailBean.statePanel == 2 && problemDetailBean.isLimit()) ? "creation.return-limit-detial-page.0.0.pv" : problemDetailBean.statePanel == 3 ? "creation.lock-detial-page.0.0.pv" : "creation.only-return-detial-page.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        ProblemDetailBean problemDetailBean = Q6().f113668g;
        bundle.putString(GameCardButton.extraAvid, String.valueOf(problemDetailBean != null ? problemDetailBean.aid : 0L));
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1) {
            Q6().f113666e = i7;
            if (Q6().f113667f == 0) {
                Q6().f113667f = i8;
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Q6().f113666e == 1) {
            setResult(Q6().f113667f);
        }
        super.onBackPressed();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C4951F c4951fInflate = C4951F.inflate(getLayoutInflater());
        this.f113409D = c4951fInflate;
        setContentView(c4951fInflate != null ? c4951fInflate.f54729a : null);
        ensureToolbar();
        showBackButton();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        Intent intent = getIntent();
        ProblemDetailBean problemDetailBean = null;
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("param_control");
            problemDetailBean = null;
            if (bundleExtra != null) {
                problemDetailBean = (ProblemDetailBean) bundleExtra.getParcelable("problemDetail");
            }
        }
        C7263m c7263m = this.f113411F;
        if (problemDetailBean == null) {
            finish();
        } else {
            Q6().f113668g = problemDetailBean;
            Q6().K0(problemDetailBean.aid);
            c7263m.f119859f = problemDetailBean.aid;
            c7263m.f119858e = problemDetailBean.statePanel;
        }
        C4951F c4951f = this.f113409D;
        if (c4951f != null) {
            c4951f.f54730b.setOnClickListener(new com.bilibili.search2.result.holder.collection.b(this, 2));
            final int i7 = 0;
            c4951f.f54731c.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.upper.module.manuscript.activity.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f113540a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f113541b;

                {
                    this.f113540a = i7;
                    this.f113541b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f113540a) {
                        case 0:
                            AuditProblemShowActivity auditProblemShowActivity = (AuditProblemShowActivity) this.f113541b;
                            int i8 = AuditProblemShowActivity.f113408G;
                            com.bilibili.upper.module.manuscript.model.b bVarQ6 = auditProblemShowActivity.Q6();
                            ProblemDetailBean problemDetailBean2 = bVarQ6.f113668g;
                            if (problemDetailBean2 != null) {
                                BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/manuscript-edit/")).extras(new Hr.b(problemDetailBean2, 6)).requestCode(1).build(), auditProblemShowActivity);
                                WE0.a aVarA = WE0.a.a();
                                String str = problemDetailBean2.source == 1 ? "creative_center" : "archive_manage";
                                aVarA.getClass();
                                WE0.a.b(str, "发布编辑页");
                                ProblemDetailBean problemDetailBean3 = bVarQ6.f113668g;
                                if (problemDetailBean3 != null) {
                                    if (problemDetailBean3.statePanel == 2 && problemDetailBean3.isLimit()) {
                                        TE0.b bVar = TE0.b.f24088a;
                                        long j7 = problemDetailBean3.aid;
                                        HashMap mapA = VF0.b.a(bVar);
                                        mapA.put(GameCardButton.extraAvid, String.valueOf(j7));
                                        Neurons.reportClick(false, "creation.return-limit-detial-page.revise.0.click", mapA);
                                    } else {
                                        TE0.b bVar2 = TE0.b.f24088a;
                                        long j8 = problemDetailBean3.aid;
                                        HashMap mapA2 = VF0.b.a(bVar2);
                                        mapA2.put(GameCardButton.extraAvid, String.valueOf(j8));
                                        Neurons.reportClick(false, "creation.only-return-detial-page.revise.0.click", mapA2);
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            MallNewestFragment.of((MallNewestFragment) this.f113541b);
                            break;
                        default:
                            DynamicEditDialogFragment dynamicEditDialogFragment = (DynamicEditDialogFragment) this.f113541b;
                            if (!V.c() && dynamicEditDialogFragment.getContext() != null) {
                                dynamicEditDialogFragment.kf();
                                Context contextRequireContext = dynamicEditDialogFragment.requireContext();
                                PermissionBiz permissionBiz = PermissionBiz.UPPER;
                                if (PermissionsChecker.checkSelfPermissions(contextRequireContext, permissionBiz, LocationManager.LOCATION_PERMISSION)) {
                                    BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://following/select_location")).requestCode(4).build(), dynamicEditDialogFragment);
                                    break;
                                } else if (!fA0.m.a(dynamicEditDialogFragment)) {
                                    PermissionRequestUtils.requestPermissionWithTip((Fragment) dynamicEditDialogFragment, dynamicEditDialogFragment.getLifecycle(), permissionBiz, LocationManager.LOCATION_PERMISSION, 3, dynamicEditDialogFragment.getString(2131850894));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            com.bilibili.upper.module.manuscript.model.b bVarQ6 = Q6();
            ProblemDetailBean problemDetailBean2 = Q6().f113668g;
            bVarQ6.getClass();
            ArrayList arrayList = new ArrayList();
            if (problemDetailBean2 != null) {
                List<ArcAudit.VideoAudit> array = JSON.parseArray(problemDetailBean2.auditList, ArcAudit.VideoAudit.class);
                if (array == null || array.size() <= 0) {
                    AuditReason auditReason = new AuditReason();
                    auditReason.f113567c = problemDetailBean2.errorMsg;
                    auditReason.f113571g = problemDetailBean2.rejectURL;
                    auditReason.f113568d = problemDetailBean2.modifyAdvice;
                    auditReason.f113569e = problemDetailBean2.problemDescriptionTitle;
                    auditReason.f113570f = problemDetailBean2.problemDescription;
                    List array2 = JSON.parseArray(problemDetailBean2.violationPics, VideoViolationPic.class);
                    if (array2 != null && array2.size() > 0) {
                        com.bilibili.upper.module.manuscript.model.b.L0(auditReason, array2);
                    }
                    arrayList.add(auditReason);
                } else {
                    for (ArcAudit.VideoAudit videoAudit : array) {
                        AuditReason auditReason2 = new AuditReason();
                        auditReason2.f113567c = androidx.compose.ui.input.pointer.k.b(videoAudit.index, "P", "-", videoAudit.rejectReason);
                        auditReason2.f113566b = videoAudit.rejectReasonId;
                        auditReason2.f113571g = videoAudit.rejectURL;
                        auditReason2.f113568d = videoAudit.modifyAdvise;
                        auditReason2.f113569e = videoAudit.problemDescriptionTitle;
                        auditReason2.f113570f = videoAudit.problemDescription;
                        List list = videoAudit.violationPics;
                        if (list != null && !list.isEmpty()) {
                            com.bilibili.upper.module.manuscript.model.b.L0(auditReason2, videoAudit.violationPics);
                        }
                        arrayList.add(auditReason2);
                    }
                }
            }
            c7263m.f119854a.clear();
            c7263m.f119854a.addAll(arrayList);
            ArrayList<AuditReason> arrayList2 = c7263m.f119854a;
            c7263m.f119855b.clear();
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                C7263m.b bVar = new C7263m.b();
                int i9 = arrayList2.get(i8).h;
                bVar.f119884a = i9;
                if (i9 > 0) {
                    bVar.f119885b = true;
                }
                c7263m.f119855b.add(bVar);
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            RecyclerView recyclerView = c4951f.f54732d;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(c7263m);
        }
        final int i10 = 0;
        Q6().f113661c.observe(this, new a(new Function1(this, i10) { // from class: com.bilibili.upper.module.manuscript.activity.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f113542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f113543b;

            {
                this.f113542a = i10;
                this.f113543b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:57:0x0190  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r6) {
                /*
                    Method dump skipped, instruction units count: 413
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.activity.i.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        Q6().f113662d.observe(this, new a(new EQ.n(this, 1)));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        Q6().J0();
    }
}
