package com.bilibili.routeui.launcher;

import Ms0.a;
import T40.n;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.internal.bridge.t;
import com.bilibili.lib.brouter.api.BRouteInfo;
import com.bilibili.lib.brouter.api.BRouteRequest;
import com.bilibili.lib.brouter.api.HandlerFactoryContext;
import com.bilibili.lib.brouter.api.RouteTarget;
import com.bilibili.lib.brouter.api.RouteTargetHandler;
import com.bilibili.lib.brouter.api.TypedRouteFactory;
import com.bilibili.lib.ui.RouteConstKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/launcher/NativeAndWebHandlerKt.class */
public final class NativeAndWebHandlerKt {
    public static final void a(n nVar, Bundle bundle) {
        for (String str : nVar.getKeySet()) {
            if (!bundle.containsKey(str)) {
                bundle.putString(str, CollectionsKt.p(nVar.getAll(str), ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
            }
        }
    }

    public static final Bundle access$createBExtrasForFragment(BRouteRequest bRouteRequest, BRouteInfo bRouteInfo) {
        Bundle bundleCreateBExtras = createBExtras(bRouteRequest, bRouteInfo);
        bundleCreateBExtras.putString(RouteConstKt.BLROUTER_PUREURL, bRouteRequest.getPureUri().toString());
        return bundleCreateBExtras;
    }

    public static final a b(HandlerFactoryContext handlerFactoryContext, KType kType) {
        KClass kClassInvoke;
        Class javaClass;
        if (!Intrinsics.areEqual(kType, Reflection.typeOf(Intent.class))) {
            return null;
        }
        RouteTarget.KClassTarget target = handlerFactoryContext.getRoute().getTarget();
        RouteTarget.KClassTarget kClassTarget = target instanceof RouteTarget.KClassTarget ? target : null;
        if (kClassTarget == null || (kClassInvoke = kClassTarget.invoke()) == null || (javaClass = JvmClassMappingKt.getJavaClass(kClassInvoke)) == null) {
            return null;
        }
        if (Activity.class.isAssignableFrom(javaClass) || Fragment.class.isAssignableFrom(javaClass)) {
            return a.f16354a;
        }
        return null;
    }

    @NotNull
    public static final Bundle createBExtras(@NotNull BRouteRequest bRouteRequest, @NotNull BRouteInfo bRouteInfo) {
        Bundle bundle;
        Bundle bundle2;
        Bundle extras = bRouteRequest.getExtras();
        if (extras != null) {
            bundle = new Bundle(extras);
            bundle2 = bundle.getBundle("__compat_prop_in_extras_");
            bundle.remove("__compat_prop_in_extras_");
        } else {
            bundle = new Bundle();
            bundle2 = null;
        }
        a(bRouteRequest.getParams(), bundle);
        for (Map.Entry entry : bRouteInfo.getCaptures().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!bundle.containsKey(str) && (!StringsKt.Z(str2, ":") || str2.length() <= 1 || !Intrinsics.areEqual(str2.substring(1), str))) {
                bundle.putString(str, str2);
            }
        }
        Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
        a(bRouteRequest.getProps(), bundle3);
        Unit unit = Unit.INSTANCE;
        bundle.putBundle(RouteConstKt.BLROUTER_PROPS, bundle3);
        RouteRequest forward = t.b(bRouteRequest).getForward();
        if (forward != null) {
            bundle.putParcelable(RouteConstKt.BLROUTER_FORWARD, forward);
        }
        return bundle;
    }

    @TypedRouteFactory(routeType = "native")
    @Nullable
    public static final RouteTargetHandler<?> createNative(@NotNull HandlerFactoryContext handlerFactoryContext, @NotNull KType kType) {
        return b(handlerFactoryContext, kType);
    }

    @TypedRouteFactory(routeType = "web")
    @Nullable
    public static final RouteTargetHandler<?> createWeb(@NotNull HandlerFactoryContext handlerFactoryContext, @NotNull KType kType) {
        return b(handlerFactoryContext, kType);
    }
}
