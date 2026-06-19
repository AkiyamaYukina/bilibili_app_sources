package com.bilibili.ogv.operation.entrance.indexpage;

import Hk0.x;
import Hk0.z;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.ogv.operation.entrance.indexpage.CategoryIndexFragment;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/i.class */
@StabilityInferred(parameters = 1)
public final class i implements RouteInterceptor {
    @NotNull
    public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        RouteRequest request = chain.getRequest();
        objectRef.element = request;
        Uri targetUri = request.getTargetUri();
        if (!Hj0.a.a("ogv.channel.bangumi.index.h5", false) || !Intrinsics.areEqual(targetUri.getScheme(), LogReportStrategy.TAG_DEFAULT) || !Intrinsics.areEqual(targetUri.getHost(), "pgc") || !Intrinsics.areEqual(targetUri.getPath(), "/bangumi/index")) {
            final List<String> pathSegments = ((RouteRequest) objectRef.element).getTargetUri().getPathSegments();
            if (pathSegments.size() == 2 && Intrinsics.areEqual(pathSegments.get(0), "module")) {
                objectRef.element = ((RouteRequest) objectRef.element).newBuilder().extras(new Function1(pathSegments, objectRef) { // from class: Hk0.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final List f8722a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f8723b;

                    {
                        this.f8722a = pathSegments;
                        this.f8723b = objectRef;
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    public final Object invoke(Object obj) {
                        String strValueOf;
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        String str = (String) this.f8722a.get(1);
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1121191939:
                                    if (str.equals("doc-index")) {
                                        strValueOf = String.valueOf(CategoryIndexFragment.Type.DOC.getValue());
                                        mutableBundleLike.put("season_type", strValueOf);
                                        return Unit.INSTANCE;
                                    }
                                    break;
                                case -957554233:
                                    if (str.equals("tv-index")) {
                                        strValueOf = String.valueOf(CategoryIndexFragment.Type.TV.getValue());
                                        mutableBundleLike.put("season_type", strValueOf);
                                        return Unit.INSTANCE;
                                    }
                                    break;
                                case 1061881613:
                                    if (str.equals("variety-index")) {
                                        strValueOf = String.valueOf(CategoryIndexFragment.Type.VARIETY.getValue());
                                        mutableBundleLike.put("season_type", strValueOf);
                                        return Unit.INSTANCE;
                                    }
                                    break;
                                case 1975080949:
                                    if (str.equals("movie-index")) {
                                        strValueOf = String.valueOf(CategoryIndexFragment.Type.MOVIE.getValue());
                                        mutableBundleLike.put("season_type", strValueOf);
                                        return Unit.INSTANCE;
                                    }
                                    break;
                            }
                        }
                        throw new IllegalStateException(("illegel url " + ((RouteRequest) this.f8723b.element).getTargetUri()).toString());
                    }
                }).build();
            }
            RouteRequest routeRequestBuild = ((RouteRequest) objectRef.element).newBuilder().extras(new z(objectRef, 0)).build();
            objectRef.element = routeRequestBuild;
            return chain.next(routeRequestBuild);
        }
        Uri.Builder builderBuildUpon = Uri.parse("https://m.bilibili.com/bangumi/channel/index?navhide=1").buildUpon();
        for (String str : ((RouteRequest) objectRef.element).getTargetUri().getQueryParameterNames()) {
            String queryParameter = ((RouteRequest) objectRef.element).getTargetUri().getQueryParameter(str);
            String str2 = queryParameter;
            if (queryParameter == null) {
                str2 = "";
            }
            builderBuildUpon.appendQueryParameter(str, str2);
        }
        Uri uriBuild = builderBuildUpon.build();
        RouteRequest routeRequest = (RouteRequest) objectRef.element;
        RouteRequest.Builder builderExtras = routeRequest.newBuilder().extras(new x(uriBuild, 0));
        builderExtras.setTargetUri(Uri.parse("bilibili://browser"));
        return RouteRequestKt.redirectTo(routeRequest, builderExtras.build());
    }
}
