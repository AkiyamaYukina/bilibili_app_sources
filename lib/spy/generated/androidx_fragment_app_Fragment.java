package com.bilibili.lib.spy.generated;

import Az.c;
import Az.d;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.mixin.IHasRoute;
import com.bilibili.lib.ui.mixin.a;
import com.bilibili.lib.ui.mixin.b;
import com.bilibili.lib.ui.mixin.e;
import com.bilibili.lib.ui.mixin.f;
import com.bilibili.lifeevent.LifeEventLog;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.C8509b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/spy/generated/androidx_fragment_app_Fragment.class */
public class androidx_fragment_app_Fragment extends Fragment implements IHasRoute, a.InterfaceC0362a {

    @NotNull
    private final Lazy com_bilibili_lib_ui_mixin_MixinLogFragment_className$delegate;

    @NotNull
    private final Lazy com_bilibili_lib_ui_mixin_MixinLogFragment_hostName$delegate;

    @NotNull
    private IHasRoute.Info com_bilibili_lib_ui_mixin_MixinRouteFragment_curShownFragmentInfo;

    @NotNull
    private final Lazy com_bilibili_lib_ui_mixin_MixinShowHideFragment_parentVisibleObserver$delegate;

    @NotNull
    private final com.bilibili.lib.ui.mixin.a com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/spy/generated/androidx_fragment_app_Fragment$a.class */
    public static final class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx_fragment_app_Fragment f64470a;

        public a(androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
            this.f64470a = androidx_fragment_app_fragment;
        }

        @Override // com.bilibili.lib.ui.mixin.a.b
        public final void a(boolean z6) {
            this.f64470a.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(z6, Flag.FLAG_PARENT);
        }
    }

    public androidx_fragment_app_Fragment() {
        __combined___init_();
    }

    public androidx_fragment_app_Fragment(int i7) {
        super(i7);
        __combined___init_(i7);
    }

    private void __combined___init_() {
        com_bilibili_lib_ui_BaseAppPermissionFragment__init_();
        com_bilibili_lib_ui_mixin_MixinLogFragment__init_();
        com_bilibili_lib_ui_mixin_MixinRouteFragment__init_();
        com_bilibili_lib_ui_mixin_MixinShowHideFragment__init_();
        com_bilibili_lib_spy_generated_androidx_fragment_app_Fragment__init_();
    }

    private void __combined___init_(int i7) {
        com_bilibili_lib_ui_mixin_MixinLogFragment__init_(i7);
        com_bilibili_lib_spy_generated_androidx_fragment_app_Fragment__init_(i7);
    }

    private void __combined__callFragmentHide(Flag flag) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_callFragmentHide(flag);
        com_bilibili_lib_ui_mixin_MixinRouteFragment_callFragmentHide(flag);
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_callFragmentHide(flag);
    }

    private void __combined__callFragmentShow(Flag flag) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_callFragmentShow(flag);
        com_bilibili_lib_ui_mixin_MixinRouteFragment_callFragmentShow(flag);
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_callFragmentShow(flag);
    }

    private void com_bilibili_lib_spy_generated_androidx_fragment_app_Fragment__init_() {
    }

    private void com_bilibili_lib_spy_generated_androidx_fragment_app_Fragment__init_(int i7) {
    }

    private void com_bilibili_lib_ui_BaseAppPermissionFragment__init_() {
    }

    private void com_bilibili_lib_ui_BaseAppPermissionFragment_onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        BLog.i("BaseAppPermissionFragment", "onRequestPermissionsResult");
        PermissionRequestUtils.onRequestPermissionsResult(p3(), i7, strArr, iArr);
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment__init_() {
        this.com_bilibili_lib_ui_mixin_MixinLogFragment_hostName$delegate = LazyKt.lazy(new c(this, 7));
        this.com_bilibili_lib_ui_mixin_MixinLogFragment_className$delegate = LazyKt.lazy(new d(this, 5));
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment__init_(int i7) {
        this.com_bilibili_lib_ui_mixin_MixinLogFragment_hostName$delegate = LazyKt.lazy(new c(this, 7));
        this.com_bilibili_lib_ui_mixin_MixinLogFragment_className$delegate = LazyKt.lazy(new d(this, 5));
    }

    private final void com_bilibili_lib_ui_mixin_MixinLogFragment_callFragmentHide(@NotNull Flag flag) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "hide");
    }

    private final void com_bilibili_lib_ui_mixin_MixinLogFragment_callFragmentShow(@NotNull Flag flag) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "show");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String com_bilibili_lib_ui_mixin_MixinLogFragment_className_delegate$lambda$0(androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        return C8509b.a(androidx_fragment_app_fragment.hashCode(), androidx_fragment_app_fragment.getClass().getSimpleName(), "@");
    }

    private final String com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName() {
        return (String) this.com_bilibili_lib_ui_mixin_MixinLogFragment_className$delegate.getValue();
    }

    private final String com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName() {
        return (String) this.com_bilibili_lib_ui_mixin_MixinLogFragment_hostName$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String com_bilibili_lib_ui_mixin_MixinLogFragment_hostName_delegate$lambda$0(com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment r4) {
        /*
            r0 = r4
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L22
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5 = r0
            r0 = r4
            int r0 = r0.hashCode()
            r1 = r5
            java.lang.String r2 = "@"
            java.lang.String r0 = r2.C8509b.a(r0, r1, r2)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L25
        L22:
            java.lang.String r0 = ""
            r4 = r0
        L25:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment.com_bilibili_lib_ui_mixin_MixinLogFragment_hostName_delegate$lambda$0(com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment):java.lang.String");
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onCreate(@Nullable Bundle bundle) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onCreate");
        super.onCreate(bundle);
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onDestroy() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onDestroy");
        super.onDestroy();
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onDestroyView() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onDestroyView");
        super.onDestroyView();
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onPause() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onPause");
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onPause();
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onResume() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onResume");
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onResume();
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onStart() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onStart");
        super.onStart();
    }

    private void com_bilibili_lib_ui_mixin_MixinLogFragment_onStop() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(com_bilibili_lib_ui_mixin_MixinLogFragment_getHostName(), com_bilibili_lib_ui_mixin_MixinLogFragment_getClassName(), "onStop");
        super.onStop();
    }

    private final void com_bilibili_lib_ui_mixin_MixinLogFragment_reportUnifiedLog(String str, String str2, String str3) {
        LifeEventLog.report("lifecycle", MapsKt.mapOf(new Pair[]{TuplesKt.to("hostId", str), TuplesKt.to("pvid", str2), TuplesKt.to(NotificationCompat.CATEGORY_EVENT, str3)}));
    }

    private void com_bilibili_lib_ui_mixin_MixinRouteFragment__init_() {
        this.com_bilibili_lib_ui_mixin_MixinRouteFragment_curShownFragmentInfo = (IHasRoute.Info) b.f64898a.getValue();
    }

    private final void com_bilibili_lib_ui_mixin_MixinRouteFragment_callFragmentHide(@NotNull Flag flag) {
        if (flag != Flag.FLAG_LIFECYCLE) {
            f fVar = Uf0.c.f24717a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            String str = fVar.f64903a;
            if (str == null || Intrinsics.areEqual(str, fragmentActivityRequireActivity.toString())) {
                FragmentActivity fragmentActivityP3 = p3();
                IHasRoute.Info info = getInfo();
                fVar.f64903a = fragmentActivityP3 != null ? fragmentActivityP3.toString() : null;
                fVar.f64904b = info;
            }
        }
    }

    private final void com_bilibili_lib_ui_mixin_MixinRouteFragment_callFragmentShow(@NotNull Flag flag) {
        com.bilibili.lib.ui.mixin.c cVar;
        f fVar = Uf0.c.f24717a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        String str = fVar.f64903a;
        FragmentActivity fragmentActivity = null;
        if (str == null || Intrinsics.areEqual(str, fragmentActivityRequireActivity.toString())) {
            IHasRoute.Info info = fVar.f64904b;
            fVar.f64904b = null;
            if (info != null && (cVar = (com.bilibili.lib.ui.mixin.c) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.lib.ui.mixin.c.class, (String) null, 2, (Object) null)) != null) {
                cVar.a(info, getInfo());
            }
        } else {
            fVar.f64903a = null;
            fVar.f64904b = null;
        }
        com.bilibili.lib.ui.mixin.d dVarB = e.b(this);
        if (dVarB != null) {
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                fragmentActivity = fragmentActivityP3;
            }
            if (fragmentActivity != null) {
                fragmentActivity.setCurShownFragmentInfo(dVarB);
            }
        }
    }

    @NotNull
    private final IHasRoute.Info com_bilibili_lib_ui_mixin_MixinRouteFragment_getCurShownFragmentInfo() {
        return this.com_bilibili_lib_ui_mixin_MixinRouteFragment_curShownFragmentInfo;
    }

    @NotNull
    private final IHasRoute.Info com_bilibili_lib_ui_mixin_MixinRouteFragment_getInfo() {
        return e.c(this);
    }

    private final void com_bilibili_lib_ui_mixin_MixinRouteFragment_setCurShownFragmentInfo(@NotNull IHasRoute.Info info) {
        this.com_bilibili_lib_ui_mixin_MixinRouteFragment_curShownFragmentInfo = info;
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment__init_() {
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager = new com.bilibili.lib.ui.mixin.a(this, Flag.FLAG_HIDDEN, Flag.FLAG_PAGER);
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_parentVisibleObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Az.e(this, 4));
    }

    private final void com_bilibili_lib_ui_mixin_MixinShowHideFragment_callFragmentHide(@NotNull Flag flag) {
        BLog.v("mixin", "onFragmentHide: " + this);
        onFragmentHide(flag);
    }

    private final void com_bilibili_lib_ui_mixin_MixinShowHideFragment_callFragmentShow(@NotNull Flag flag) {
        BLog.v("mixin", "onFragmentShow: " + this);
        onFragmentShow(flag);
    }

    private final a.b com_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver() {
        return (a.b) this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_parentVisibleObserver$delegate.getValue();
    }

    @NotNull
    private final com.bilibili.lib.ui.mixin.a com_bilibili_lib_ui_mixin_MixinShowHideFragment_getVisibleManager() {
        return this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager;
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onAttach(@NotNull Context context) {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment == null) {
            this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(true, Flag.FLAG_PARENT);
        } else {
            a.InterfaceC0362a interfaceC0362a = parentFragment instanceof a.InterfaceC0362a ? (a.InterfaceC0362a) parentFragment : null;
            if (interfaceC0362a != null) {
                com.bilibili.lib.ui.mixin.a visibleManager = interfaceC0362a.getVisibleManager();
                a.b bVarCom_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver = com_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver();
                if (!((ArrayList) visibleManager.f64894b).contains(bVarCom_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver)) {
                    ((ArrayList) visibleManager.f64894b).add(bVarCom_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver);
                    if (visibleManager.f64895c) {
                        bVarCom_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver.a(visibleManager.f64896d);
                    }
                }
            } else {
                String name = getClass().getName();
                String name2 = parentFragment.getClass().getName();
                ClassLoader classLoader = getClass().getClassLoader();
                ClassLoader classLoader2 = parentFragment.getClass().getClassLoader();
                StringBuilder sbA = G0.b.a("parent has no FragmentVisibleManager, fallback parent visible. child=", name, ", parent=", name2, ", childLoader=");
                sbA.append(classLoader);
                sbA.append(", parentLoader=");
                sbA.append(classLoader2);
                BLog.w("mixin", sbA.toString());
                this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(true, Flag.FLAG_PARENT);
            }
        }
        super.onAttach(context);
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onDetach() {
        com.bilibili.lib.ui.mixin.a visibleManager;
        ActivityResultCaller parentFragment = getParentFragment();
        a.InterfaceC0362a interfaceC0362a = parentFragment instanceof a.InterfaceC0362a ? (a.InterfaceC0362a) parentFragment : null;
        if (interfaceC0362a != null && (visibleManager = interfaceC0362a.getVisibleManager()) != null) {
            ((ArrayList) visibleManager.f64894b).remove(com_bilibili_lib_ui_mixin_MixinShowHideFragment_getParentVisibleObserver());
        }
        super.onDetach();
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onFragmentHide(@NotNull Flag flag) {
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onFragmentShow(@NotNull Flag flag) {
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onHiddenChanged(boolean z6) {
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(!z6, Flag.FLAG_HIDDEN);
        super.onHiddenChanged(z6);
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onPause() {
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(false, Flag.FLAG_LIFECYCLE);
        super.onPause();
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onResume() {
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(true, Flag.FLAG_LIFECYCLE);
        super.onResume();
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key_visible_flags", this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.f64897e);
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        com.bilibili.lib.ui.mixin.a aVar = this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager;
        aVar.getClass();
        if (bundle != null) {
            aVar.f64897e = bundle.getInt("key_visible_flags");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a com_bilibili_lib_ui_mixin_MixinShowHideFragment_parentVisibleObserver_delegate$lambda$0(androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        return new a(androidx_fragment_app_fragment);
    }

    private void com_bilibili_lib_ui_mixin_MixinShowHideFragment_setUserVisibleHint(boolean z6) {
        this.com_bilibili_lib_ui_mixin_MixinShowHideFragment_visibleManager.a(z6, Flag.FLAG_PAGER);
        super.setUserVisibleHint(z6);
    }

    @Override // com.bilibili.lib.ui.mixin.a.InterfaceC0362a
    public void callFragmentHide(Flag flag) {
        __combined__callFragmentHide(flag);
    }

    @Override // com.bilibili.lib.ui.mixin.a.InterfaceC0362a
    public void callFragmentShow(Flag flag) {
        __combined__callFragmentShow(flag);
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute
    public IHasRoute.Info getCurShownFragmentInfo() {
        return com_bilibili_lib_ui_mixin_MixinRouteFragment_getCurShownFragmentInfo();
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute
    public IHasRoute.Info getInfo() {
        return com_bilibili_lib_ui_mixin_MixinRouteFragment_getInfo();
    }

    @Override // com.bilibili.lib.ui.mixin.a.InterfaceC0362a
    public com.bilibili.lib.ui.mixin.a getVisibleManager() {
        return com_bilibili_lib_ui_mixin_MixinShowHideFragment_getVisibleManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onDetach();
    }

    public void onFragmentHide(Flag flag) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onFragmentHide(flag);
    }

    public void onFragmentShow(Flag flag) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onFragmentShow(flag);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z6) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onHiddenChanged(z6);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        com_bilibili_lib_ui_BaseAppPermissionFragment_onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        com_bilibili_lib_ui_mixin_MixinLogFragment_onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_onViewStateRestored(bundle);
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute
    public void setCurShownFragmentInfo(IHasRoute.Info info) {
        com_bilibili_lib_ui_mixin_MixinRouteFragment_setCurShownFragmentInfo(info);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z6) {
        com_bilibili_lib_ui_mixin_MixinShowHideFragment_setUserVisibleHint(z6);
    }
}
