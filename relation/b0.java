package com.bilibili.relation;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.bilibili.moduleservice.main.FollowOption;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.utils.ExBilowUtil;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.relation.api.RelationService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/b0.class */
@Singleton
@StabilityInferred(parameters = 1)
public final class b0 implements com.bilibili.moduleservice.main.i {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/b0$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86023a;

        static {
            int[] iArr = new int[FollowOption.values().length];
            try {
                iArr[FollowOption.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FollowOption.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f86023a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.moduleservice.main.i
    @Nullable
    public final Z a(@Nullable final String str, final long j7, final int i7, @Nullable FollowOption followOption, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable Map map) {
        Callable callable = null;
        if (str != null) {
            if (j7 == -1) {
                callable = null;
            } else {
                final Ref.IntRef intRef = new Ref.IntRef();
                int i8 = -1;
                intRef.element = -1;
                if (followOption != null) {
                    i8 = a.f86023a[followOption.ordinal()];
                }
                if (i8 == 1) {
                    intRef.element = 1;
                } else if (i8 == 2) {
                    intRef.element = 2;
                }
                String jSONString = null;
                if (map != null) {
                    jSONString = JSON.toJSONString(map);
                }
                final String str5 = jSONString;
                callable = new Callable(str, j7, intRef, i7, str2, str3, str4, str5) { // from class: com.bilibili.relation.Z

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f86001a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f86002b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Ref.IntRef f86003c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final int f86004d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f86005e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f86006f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final String f86007g;
                    public final String h;

                    {
                        this.f86001a = str;
                        this.f86002b = j7;
                        this.f86003c = intRef;
                        this.f86004d = i7;
                        this.f86005e = str2;
                        this.f86006f = str3;
                        this.f86007g = str4;
                        this.h = str5;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        RelationService relationService = (RelationService) ServiceGenerator.createService(RelationService.class);
                        int i9 = this.f86003c.element;
                        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                        return (Void) ExBilowUtil.extractResponseData(relationService.changeRelationV2(this.f86001a, this.f86002b, i9, this.f86004d, this.f86005e, this.f86006f, this.f86007g, this.h, strCurrentPolarisActionId).execute());
                    }
                };
            }
        }
        return callable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.relation.a0] */
    @Override // com.bilibili.moduleservice.main.i
    @Nullable
    public final a0 b(@Nullable final String str, final long j7, @Nullable FollowOption followOption) throws NoWhenBranchMatchedException {
        if (str == null || j7 == -1) {
            return null;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        int i7 = followOption == null ? -1 : a.f86023a[followOption.ordinal()];
        if (i7 != -1) {
            if (i7 == 1) {
                intRef.element = 5;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intRef.element = 6;
            }
        }
        return new Callable(str, j7, intRef) { // from class: com.bilibili.relation.a0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f86016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f86017b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Ref.IntRef f86018c;

            {
                this.f86016a = str;
                this.f86017b = j7;
                this.f86018c = intRef;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Void) ExBilowUtil.extractResponseData(((RelationService) ServiceGenerator.createService(RelationService.class)).changeRelationV2(this.f86016a, this.f86017b, this.f86018c.element, 80, "community.public-community.0.0", "", "", "", PageViewTracker.getInstance().currentPolarisActionId()).execute());
            }
        };
    }

    @Override // com.bilibili.moduleservice.main.i
    @Nullable
    public final Uri c(int i7, long j7) {
        Uri.Builder builderBuildUpon = Uri.parse(AX.f.a("relation", "url_attention", "https://space.bilibili.com/h5/follow")).buildUpon();
        builderBuildUpon.appendQueryParameter("newfans", String.valueOf(i7));
        if (j7 > 0) {
            builderBuildUpon.appendQueryParameter(EditCustomizeSticker.TAG_MID, String.valueOf(j7));
            builderBuildUpon.appendQueryParameter("type", "fans");
        }
        return builderBuildUpon.build();
    }

    @Override // com.bilibili.moduleservice.main.i
    @Nullable
    public final Uri d(long j7) {
        Uri.Builder builderBuildUpon = Uri.parse(AX.f.a("relation", "url_attention", "https://space.bilibili.com/h5/follow")).buildUpon();
        if (j7 > 0) {
            builderBuildUpon.appendQueryParameter(EditCustomizeSticker.TAG_MID, String.valueOf(j7));
            builderBuildUpon.appendQueryParameter("type", "follow");
        }
        return builderBuildUpon.build();
    }
}
