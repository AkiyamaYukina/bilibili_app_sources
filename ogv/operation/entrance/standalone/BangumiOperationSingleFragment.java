package com.bilibili.ogv.operation.entrance.standalone;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RequestMode;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.ogv.operation.entrance.BangumiOperationFragmentV4;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import ec.c;
import io.reactivex.rxjava3.subjects.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/standalone/BangumiOperationSingleFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiOperationSingleFragment extends BangumiBaseOperationSingleFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f70201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f70202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f70203e;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = r3
            r1 = r4
            super.onCreate(r1)
            r0 = r3
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L5d
            r0 = r3
            android.os.Bundle r0 = r0.getArguments()
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "page_name"
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
            goto L23
        L21:
            r0 = 0
            r4 = r0
        L23:
            r0 = r3
            r1 = r4
            r0.f70201c = r1
            r0 = r3
            android.os.Bundle r0 = r0.getArguments()
            r6 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 == 0) goto L3a
            r0 = r6
            java.lang.String r1 = "page_id"
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
        L3a:
            r0 = r3
            r1 = r4
            r0.f70202d = r1
            r0 = r3
            android.os.Bundle r0 = r0.getArguments()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L55
            r0 = r4
            java.lang.String r1 = "title"
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L58
        L55:
            java.lang.String r0 = ""
            r4 = r0
        L58:
            r0 = r3
            r1 = r4
            r0.f70203e = r1
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.standalone.BangumiOperationSingleFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.ogv.operation.entrance.standalone.BangumiBaseOperationSingleFragment, com.bilibili.lib.ui.BaseToolbarFragment
    public final void onCreateToolbarMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        String str = this.f70202d;
        String str2 = str;
        if (str == null) {
            str2 = this.f70201c;
        }
        if (Intrinsics.areEqual(str2, "cinema-hot-operation")) {
            return;
        }
        super.onCreateToolbarMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2131886299)).inflate(2131499657, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        a<Boolean> aVar;
        super.onPause();
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(2131298918);
        if (fragmentFindFragmentById instanceof BangumiOperationFragmentV4) {
            BangumiOperationFragmentV4 bangumiOperationFragmentV4 = fragmentFindFragmentById instanceof BangumiOperationFragmentV4 ? (BangumiOperationFragmentV4) fragmentFindFragmentById : null;
            if (bangumiOperationFragmentV4 == null || (aVar = bangumiOperationFragmentV4.f70304b) == null) {
                return;
            }
            aVar.onNext(Boolean.FALSE);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        a<Boolean> aVar;
        super.onResume();
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(2131298918);
        if (fragmentFindFragmentById instanceof BangumiOperationFragmentV4) {
            BangumiOperationFragmentV4 bangumiOperationFragmentV4 = fragmentFindFragmentById instanceof BangumiOperationFragmentV4 ? (BangumiOperationFragmentV4) fragmentFindFragmentById : null;
            if (bangumiOperationFragmentV4 == null || (aVar = bangumiOperationFragmentV4.f70304b) == null) {
                return;
            }
            aVar.onNext(Boolean.TRUE);
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        mf();
        super.onSkinChange(garb);
    }

    @Override // com.bilibili.ogv.operation.entrance.standalone.BangumiBaseOperationSingleFragment, com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Class clazz;
        super.onViewCreated(view, bundle);
        setTitle(this.f70203e);
        EmptyStateView emptyStateView = this.f70200b;
        if (emptyStateView != null) {
            int i7 = EmptyStateView.f73157k;
            emptyStateView.b(0, false);
        }
        EmptyStateView emptyStateView2 = this.f70200b;
        if (emptyStateView2 != null) {
            emptyStateView2.a();
        }
        RouteRequest routeRequestA = c.a("bilibili://pgc/page/operation_list_content");
        RouteResponse routeResponseExecute = BLRouter.newCall$default(routeRequestA, getContext(), this, RequestMode.ROUTE, false, 16, (Object) null).execute();
        if (routeResponseExecute.isSuccess()) {
            Object obj = routeResponseExecute.getObj();
            Fragment fragment = null;
            RouteInfo routeInfo = obj instanceof RouteInfo ? (RouteInfo) obj : null;
            Object objNewInstance = (routeInfo == null || (clazz = routeInfo.getClazz()) == null) ? null : clazz.newInstance();
            if (objNewInstance instanceof Fragment) {
                fragment = (Fragment) objNewInstance;
            }
            if (fragment == null) {
                BLog.e("BangumiOperationSingleFragment", "路由结果解析失败");
                return;
            }
            if (fragment instanceof BangumiOperationFragmentV4) {
                BangumiOperationFragmentV4 bangumiOperationFragmentV4 = (BangumiOperationFragmentV4) fragment;
                Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeRequestA, routeInfo);
                String str = this.f70202d;
                String str2 = str;
                if (str == null) {
                    str2 = this.f70201c;
                }
                bundleCreateExtrasForFragment.putString("page_id", str2);
                String str3 = this.f70202d;
                String str4 = str3;
                if (str3 == null) {
                    str4 = this.f70201c;
                }
                bundleCreateExtrasForFragment.putString("page_name", str4);
                bundleCreateExtrasForFragment.putString("tab_name", this.f70203e);
                bangumiOperationFragmentV4.setArguments(bundleCreateExtrasForFragment);
            } else {
                fragment.setArguments(AbstractLauncherKt.createExtrasForFragment(routeRequestA, routeInfo));
            }
            BLog.e("BangumiOperationSingleFragment", fragment.toString());
            getChildFragmentManager().beginTransaction().replace(2131298918, fragment).commitAllowingStateLoss();
        }
    }
}
