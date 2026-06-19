package com.bilibili.relation;

import android.app.Activity;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.history.ui.HistoryContentFragment;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.moduleservice.main.MainCommonService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/V.class */
@StabilityInferred(parameters = 0)
public final class V implements Observer<Map<Long, ? extends Pair<? extends Y, ? extends Integer>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HistoryContentFragment.d f85980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85981b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/V$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85982a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f85982a = iArr;
        }
    }

    public V(@NotNull HistoryContentFragment.d dVar) {
        this.f85980a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(V v7, Ref.IntRef intRef, Map<Long, Y> map, Pair<Y, Integer> pair) {
        if (((Number) pair.getSecond()).intValue() > v7.f85981b) {
            map.put(Long.valueOf(((Y) pair.getFirst()).f85997b), pair.getFirst());
            intRef.element = Math.max(intRef.element, ((Number) pair.getSecond()).intValue());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Map<Long, ? extends Pair<? extends Y, ? extends Integer>> map) throws NoWhenBranchMatchedException {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = this.f85981b;
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int i7 = a.f85982a[((Y) pair.getFirst()).f85996a.ordinal()];
            if (i7 == 1) {
                a(this, intRef, linkedHashMap, pair);
            } else if (i7 == 2) {
                a(this, intRef, linkedHashMap2, pair);
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a(this, intRef, linkedHashMap3, pair);
            }
        }
        boolean zIsEmpty = linkedHashMap.isEmpty();
        HistoryContentFragment.d dVar = this.f85980a;
        if (!zIsEmpty) {
            dVar.getClass();
        }
        if (!linkedHashMap2.isEmpty()) {
            dVar.b(linkedHashMap2);
        }
        if (!linkedHashMap3.isEmpty() && dVar.a() != null) {
            Iterator it2 = linkedHashMap3.entrySet().iterator();
            while (it2.hasNext()) {
                Y y6 = (Y) ((Map.Entry) it2.next()).getValue();
                if (y6 != null) {
                    int i8 = y6.f86000e;
                    if (i8 == 1) {
                        BiliApiException biliApiException = y6.f85999d;
                        if (biliApiException instanceof BiliApiException) {
                            BiliApiException biliApiException2 = biliApiException;
                            int i9 = biliApiException2.mCode;
                            if (i9 == 61001 || Hs0.a.a(i9)) {
                                Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(dVar.a());
                                MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
                                if (mainCommonService != null && activityFindActivityOrNull != null) {
                                    mainCommonService.showAuthorityDialog(activityFindActivityOrNull, biliApiException2.getMessage(), ProjectionDanmakuSendHelper.ERROR_NEED_BIND_PHONE);
                                }
                            } else {
                                string = biliApiException2.getMessage();
                            }
                        } else {
                            string = !ConnectivityMonitor.getInstance().isNetworkActive() ? dVar.a().getString(2131847652) : null;
                        }
                        String string2 = string;
                        if (TextUtils.isEmpty(string)) {
                            string2 = dVar.a().getString(2131847626);
                        }
                        ToastHelper.showToastShort(dVar.a().getApplicationContext(), string2);
                    } else if (i8 == 2) {
                        ToastHelper.showToastShort(dVar.a().getApplicationContext(), 2131847616);
                    }
                }
            }
        }
        this.f85981b = intRef.element;
    }
}
