package com.bilibili.ogv.story;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Singleton;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/k.class */
@Singleton
@StabilityInferred(parameters = 0)
public final class k implements com.bilibili.bangumi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public OgvStorySeasonListDialog f73093a;

    @NotNull
    public final g a(@NotNull Context context) {
        return new g(context);
    }

    @NotNull
    public final VipPaymentStoryContainerFragment b(@NotNull String str, @NotNull Function0 function0, @NotNull Function0 function02) {
        VipPaymentStoryContainerFragment vipPaymentStoryContainerFragment = new VipPaymentStoryContainerFragment();
        Uri uri = Uri.parse(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Ej0.a.a(uri, linkedHashMap);
        Bundle bundleA = com.bilibili.ogv.infra.util.a.a(linkedHashMap);
        MatchResult matchResultFind$default = Regex.find$default(new Regex("bilibili://user_center/vip/buy/(\\d+)"), str, 0, 2, (Object) null);
        String str2 = null;
        if (matchResultFind$default != null) {
            List groupValues = matchResultFind$default.getGroupValues();
            str2 = null;
            if (groupValues != null) {
                str2 = (String) CollectionsKt.last(groupValues);
            }
        }
        if (str2 != null && str2.length() != 0) {
            bundleA.putString("appId", str2);
        }
        vipPaymentStoryContainerFragment.setArguments(bundleA);
        vipPaymentStoryContainerFragment.f73050c = function0;
        vipPaymentStoryContainerFragment.f73051d = function02;
        return vipPaymentStoryContainerFragment;
    }

    @NotNull
    public final o c(@NotNull Context context, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, long j7, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull StateFlow stateFlow, @NotNull Function5 function5, @NotNull DK.a aVar) {
        return new o(context, lifecycleCoroutineScope, j7, i7, str, str2, str3, stateFlow, function5, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, com.bilibili.ogv.story.OgvStorySeasonListDialog] */
    public final void d(@NotNull Context context, long j7, @NotNull StateFlow stateFlow, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, int i8, @NotNull Function5 function5, @NotNull yJ0.c cVar, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull DK.a aVar) {
        ?? ogvStorySeasonListDialog = new OgvStorySeasonListDialog(context, j7, stateFlow, i7, str, str2, str3, i8, function5, cVar, function0, function02, aVar);
        this.f73093a = ogvStorySeasonListDialog;
        ogvStorySeasonListDialog.show();
    }

    public final void e() {
        OgvStorySeasonListDialog ogvStorySeasonListDialog = this.f73093a;
        if (ogvStorySeasonListDialog != null) {
            ogvStorySeasonListDialog.cancel();
        }
        this.f73093a = null;
    }

    public final boolean f() {
        BottomSheetDialog bottomSheetDialog = this.f73093a;
        boolean z6 = false;
        if (bottomSheetDialog != null) {
            z6 = false;
            if (bottomSheetDialog.isShowing()) {
                z6 = true;
            }
        }
        return z6;
    }
}
