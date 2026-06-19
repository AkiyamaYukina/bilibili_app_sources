package com.bilibili.lib.router;

import Ob1.I;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.widget.T;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import cf0.C5254b;
import com.bilibili.base.Bootstrap;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MatchedRoutes;
import com.bilibili.lib.blrouter.ModuleDescriptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.brouter.api.FunctionWrapper;
import com.bilibili.lib.brouter.api.RouteTarget;
import com.bilibili.lib.brouter.api.internal.DefaultFunctionWrapper;
import com.bilibili.lib.brouter.api.internal.base.NoHandler;
import com.bilibili.lib.brouter.api.internal.base.RouteCollectorKt;
import com.bilibili.lib.brouter.api.internal.base.d;
import com.bilibili.lib.jsbridge.legacy.b;
import com.bilibili.lib.router.Action;
import com.bilibili.lib.router.RouteParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import o00.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Router.class */
@Deprecated(message = "")
@ModuleDescriptor(desc = "For old router.", name = "RouterCompat")
public final class Router {

    @NotNull
    public static final String ROUTE_URI_ACT = "route_uri_actual";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Context f64350a;

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Router f64349b = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Router$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "")
        @JvmStatic
        @NotNull
        public final Router global() {
            return Router.f64349b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Router$RouterProxy.class */
    @Deprecated(message = "")
    public static final class RouterProxy {

        @NotNull
        public static final a Companion = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Router f64351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Context f64352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Fragment f64353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Bundle f64354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f64355e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Action.a<Object> f64356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Uri f64357g;
        public int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f64358i;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Router$RouterProxy$a.class */
        public static final class a {
        }

        public RouterProxy(@NotNull Router router) {
            this.f64351a = router;
            this.f64352b = router.f64350a;
        }

        @Deprecated(message = "")
        @JvmStatic
        @NotNull
        public static final RouterProxy proxy(@NotNull Router router) {
            Companion.getClass();
            return new RouterProxy(router);
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy add(int i7) {
            this.h = i7 | this.h;
            return this;
        }

        @NotNull
        public final RouterProxy allowMiss() {
            this.f64358i = true;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated(message = "")
        @Nullable
        public final <T> T call(@NotNull Uri uri) throws Throwable {
            T t7 = (T) findRoutes$router_compat_release(uri).go(this.f64352b, this.f64353c, false).getObj();
            if (t7 instanceof RuntimeException) {
                throw ((Throwable) t7);
            }
            return t7;
        }

        @Deprecated(message = "")
        @Nullable
        public final <T> T call(@NotNull String str) {
            return (T) call(Uri.parse(str));
        }

        @NotNull
        public final MatchedRoutes findRoutes$router_compat_release(@NotNull Uri uri) {
            String path = uri.getPath();
            Bundle bundle = this.f64354d;
            Uri uriBuild = uri;
            if (bundle != null) {
                uriBuild = uri;
                if (!bundle.isEmpty()) {
                    if (path == null) {
                        uriBuild = uri;
                    } else {
                        StringBuilder sb = new StringBuilder(path.length());
                        int i7 = -1;
                        int length = 0;
                        while (true) {
                            int iA = StringsKt.A(path, ":", i7, false, 4);
                            if (iA >= 0) {
                                sb.append((CharSequence) path, length, iA);
                                int iA2 = StringsKt.A(path, "/", iA, false, 4);
                                length = iA2;
                                if (iA2 < 0) {
                                    length = path.length();
                                }
                                if (length - iA <= 1) {
                                    throw new IllegalArgumentException(T.a(uri, "placeholder param missing: ").toString());
                                }
                                String strSubstring = path.substring(iA + 1, length);
                                String string = this.f64354d.getString(strSubstring);
                                if (string == null) {
                                    sb.append(":");
                                    sb.append(strSubstring);
                                } else {
                                    sb.append(string);
                                }
                                i7 = length;
                            } else {
                                if (length < path.length()) {
                                    sb.append((CharSequence) path, length, path.length());
                                }
                                uriBuild = uri.buildUpon().path(sb.toString()).build();
                            }
                        }
                    }
                }
            }
            RouteRequest.Builder builderFlags = new RouteRequest.Builder(uriBuild).requestCode(this.f64355e).flags(this.h);
            Uri uri2 = this.f64357g;
            if (uri2 != null) {
                builderFlags.data(uri2);
            }
            builderFlags.props(new C5254b(this, 0));
            if (this.f64354d != null) {
                builderFlags.extras(new I(this, 2));
            }
            return BLRouter.findRoutes(builderFlags.build());
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy forResult(int i7) {
            this.f64355e = i7;
            return this;
        }

        public final boolean getAllowMiss() {
            return this.f64358i;
        }

        @Nullable
        public final Action.a<Object> getMCallback() {
            return this.f64356f;
        }

        @Nullable
        public final Context getMContext() {
            return this.f64352b;
        }

        @Nullable
        public final Uri getMData() {
            return this.f64357g;
        }

        @Nullable
        public final Bundle getMExtras() {
            return this.f64354d;
        }

        public final int getMFlags() {
            return this.h;
        }

        @Nullable
        public final Fragment getMFragment() {
            return this.f64353c;
        }

        public final int getMRequest() {
            return this.f64355e;
        }

        @NotNull
        public final Router getMRouter() {
            return this.f64351a;
        }

        @Deprecated(message = "")
        public final void open(@NotNull Uri uri) throws Throwable {
            if (!Intrinsics.areEqual("action", uri.getScheme())) {
                findRoutes$router_compat_release(uri).go(this.f64352b, this.f64353c, false);
                return;
            }
            Object objCall = call(uri);
            b bVar = this.f64356f;
            if (bVar != null) {
                bVar.a(objCall);
            }
        }

        @Deprecated(message = "")
        public final void open(@Nullable String str) {
            open(Uri.parse(str));
        }

        @Deprecated(message = "")
        public final void release(@NotNull Uri uri) {
            P40.a aVar = P40.a.a;
            P40.a.a().b().a(CollectionsKt.listOf(uri.toString()));
        }

        @Deprecated(message = "")
        public final void release(@NotNull String str) {
            release(Uri.parse(str));
        }

        public final void setAllowMiss(boolean z6) {
            this.f64358i = z6;
        }

        public final void setMCallback(@Nullable Action.a<Object> aVar) {
            this.f64356f = aVar;
        }

        public final void setMContext(@Nullable Context context) {
            this.f64352b = context;
        }

        public final void setMData(@Nullable Uri uri) {
            this.f64357g = uri;
        }

        public final void setMExtras(@Nullable Bundle bundle) {
            this.f64354d = bundle;
        }

        public final void setMFlags(int i7) {
            this.h = i7;
        }

        public final void setMFragment(@Nullable Fragment fragment) {
            this.f64353c = fragment;
        }

        public final void setMRequest(int i7) {
            this.f64355e = i7;
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy with(@Nullable Context context) {
            this.f64352b = context;
            return this;
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy with(@Nullable Uri uri) {
            this.f64357g = uri;
            return this;
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy with(@Nullable Fragment fragment) {
            this.f64353c = fragment;
            return this;
        }

        @Deprecated(message = "")
        @NotNull
        public final <Result> RouterProxy with(@Nullable Action.a<Result> aVar) {
            this.f64356f = aVar;
            return this;
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy with(@Nullable String str, @Nullable Bundle bundle) {
            if (this.f64354d == null) {
                this.f64354d = new Bundle();
            }
            this.f64354d.putBundle(str, bundle);
            return this;
        }

        @Deprecated(message = "")
        @NotNull
        public final RouterProxy with(@Nullable String str, @Nullable String str2) {
            if (this.f64354d == null) {
                this.f64354d = new Bundle();
            }
            this.f64354d.putString(str, str2);
            return this;
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    @NotNull
    public static final Router global() {
        return Companion.global();
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy add(int i7) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).add(i7);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Deprecated(message = "")
    public final void attach(@Nullable Application application) {
        this.f64350a = application;
        BLRouter.INSTANCE.setUp(application, (Function1) new Object());
    }

    @Deprecated(message = "")
    @Nullable
    public final <T> T call(@NotNull Uri uri) {
        return (T) call(uri.toString());
    }

    @Deprecated(message = "")
    @Nullable
    public final <T> T call(@NotNull String str) {
        RouterProxy.Companion.getClass();
        return (T) new RouterProxy(this).call(str);
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy forResult(int i7) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).forResult(i7);
    }

    @Deprecated(message = "")
    @NotNull
    public final List<Pair<String, ? extends Bootstrap>> getBootstraps() {
        ArrayList arrayList = new ArrayList();
        BLRouter bLRouter = BLRouter.INSTANCE;
        a.a();
        for (Map.Entry entry : bLRouter.getServices(Bootstrap.class).getAll().entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (Bootstrap) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated(message = "")
    @NotNull
    public final List<Pair<String, ? extends Bootstrap.Launch>> getLaunches() {
        ArrayList arrayList = new ArrayList();
        BLRouter bLRouter = BLRouter.INSTANCE;
        a.a();
        for (Map.Entry entry : bLRouter.getServices(Bootstrap.class).getAll().entrySet()) {
            String str = (String) entry.getKey();
            Bootstrap bootstrap = (Bootstrap) entry.getValue();
            if (bootstrap instanceof Bootstrap.Launch) {
                arrayList.add(new Pair(str, bootstrap));
            }
        }
        return arrayList;
    }

    @Deprecated(message = "")
    public final void map(@NotNull Uri uri, @Nullable Action<?> action) {
        map(uri.toString(), action);
    }

    @Deprecated(message = "")
    public final void map(@NotNull Uri uri, @NotNull Class<?> cls) {
        map(uri.toString(), cls);
    }

    @Deprecated(message = "")
    public final void map(@Nullable String str, @Nullable final Action<?> action) {
        P40.a aVar = P40.a.a;
        d dVarB = P40.a.a().b();
        List listListOf = CollectionsKt.listOf(str);
        dVarB.c(new RouteTarget.FunctionTarget(action) { // from class: com.bilibili.lib.router.compat.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Action f64359a;

            {
                this.f64359a = action;
            }

            public final FunctionWrapper invoke() {
                ActionHelper$addAction$2$1 actionHelper$addAction$2$1 = new ActionHelper$addAction$2$1(this.f64359a);
                KTypeProjection.Companion companion = KTypeProjection.Companion;
                return new DefaultFunctionWrapper(actionHelper$addAction$2$1, Reflection.typeOf(Function1.class, companion.invariant(Reflection.typeOf(RouteParams.class)), companion.invariant(Reflection.nullableTypeOf(Object.class))));
            }
        }, str, D.a(action.getClass(), "Dynamic Action: "), "action", listListOf, RouteCollectorKt.emptyListProvider(), NoHandler.INSTANCE, new kotlin.Pair[0]);
    }

    @Deprecated(message = "")
    public final void map(@NotNull String str, @NotNull final Class<?> cls) {
        if (!Action.class.isAssignableFrom(cls)) {
            throw new UnsupportedOperationException("only Action support dynamic register");
        }
        P40.a aVar = P40.a.a;
        d dVarB = P40.a.a().b();
        List listListOf = CollectionsKt.listOf(str);
        dVarB.c(new RouteTarget.KClassTarget(cls) { // from class: df0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class f116423a;

            {
                this.f116423a = cls;
            }

            public final KClass invoke() {
                return JvmClassMappingKt.getKotlinClass(this.f116423a);
            }
        }, str, D.a(cls, "Dynamic Action: "), "action", listListOf, RouteCollectorKt.emptyListProvider(), NoHandler.INSTANCE, new kotlin.Pair[0]);
    }

    @Deprecated(message = "")
    public final boolean match(@NotNull Uri uri) {
        return !new RouterProxy(this).findRoutes$router_compat_release(uri).getInfo().isEmpty();
    }

    @Deprecated(message = "")
    public final boolean match(@Nullable String str) {
        return match(Uri.parse(str));
    }

    @Deprecated(message = "")
    public final void open(@Nullable Context context, @NotNull Uri uri) {
        open(context, uri.toString());
    }

    @Deprecated(message = "")
    public final <Result> void open(@Nullable Context context, @NotNull Uri uri, @Nullable Action.a<Result> aVar) throws Throwable {
        RouterProxy.Companion.getClass();
        new RouterProxy(this).with(context).with(aVar).open(uri);
    }

    @Deprecated(message = "")
    public final void open(@Nullable Context context, @Nullable String str) {
        RouterProxy.Companion.getClass();
        new RouterProxy(this).with(context).open(str);
    }

    @Deprecated(message = "")
    public final void open(@NotNull Uri uri) {
        open(uri.toString());
    }

    @Deprecated(message = "")
    public final <Result> void open(@NotNull Uri uri, @Nullable Action.a<Result> aVar) throws Throwable {
        RouterProxy.Companion.getClass();
        new RouterProxy(this).with(aVar).open(uri);
    }

    @Deprecated(message = "")
    public final void open(@Nullable String str) {
        RouterProxy.Companion.getClass();
        new RouterProxy(this).open(str);
    }

    @Deprecated(message = "")
    public final void release(@NotNull Uri uri) {
        release(uri.toString());
    }

    @Deprecated(message = "")
    public final void release(@NotNull String str) {
        RouterProxy.Companion.getClass();
        new RouterProxy(this).release(str);
    }

    public final void setUp(@Nullable Application application) {
        this.f64350a = application;
    }

    @NotNull
    public String toString() {
        return "router:{__global__";
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy with(@Nullable Context context) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(context);
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy with(@Nullable Uri uri) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(uri);
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy with(@Nullable Fragment fragment) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(fragment);
    }

    @Deprecated(message = "")
    @NotNull
    public final <Result> RouterProxy with(@Nullable Action.a<Result> aVar) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(aVar);
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy with(@Nullable String str, @Nullable Bundle bundle) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(str, bundle);
    }

    @Deprecated(message = "")
    @NotNull
    public final RouterProxy with(@Nullable String str, @Nullable String str2) {
        RouterProxy.Companion.getClass();
        return new RouterProxy(this).with(str, str2);
    }
}
