package com.bilibili.opd.app.bizcommon.context;

import Pb.F;
import Pb.G;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.n;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.neuron.util.HandlerThreads;
import com.bilibili.lib.neuron.util.NeuronRuntimeHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.opd.app.bizcommon.biliapm.MallTaskRunner;
import com.bilibili.opd.app.bizcommon.context.session.MallSessionHelper;
import com.bilibili.opd.app.bizcommon.context.session.a;
import com.bilibili.opd.app.bizcommon.context.utils.LifeCycleChecker;
import com.bilibili.pvtracker.IPvTracker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import om0.C8232d;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCFragment.class */
public abstract class KFCFragment extends androidx_fragment_app_Fragment implements b, m {
    private static final String DD_FSP_SAMPLE_RATE = "dd_mall_fsp_sample_rate";
    private static final String DD_FSP_WHITE_LIST = "dd_mall_fsp_detect_white_list";
    private static final String EVENT_FSP = "mall.common.fsp.0.show";
    private static final String QUERY_PARAMETER_URL = "url";
    private static final String SCHEMA_HTTP = "http";
    private static final String SCHEMA_HTTPS = "https";
    private static final String TAG = "kfc_basefragment";
    private static List<String> sFSPWhiteListCache;
    private static long sFSPWhiteListDDVersion = -1;
    protected String curPageId;

    @Nullable
    private Context mApplicationContext;
    private C8232d mFSPDetector;
    private long mFSPStartTime;
    protected String prePageId;
    private boolean mNeedPendingUserVisibileHint = false;
    private boolean mLastUserVisibileHint = false;
    private boolean hasDispatchKeyDown = false;
    private final Object mLifecycleListenersLock = new Object();
    private List<ActivityLifecycleListener> mLifecycleListeners = new ArrayList();
    private Pair<Map<String, String>, Map<String, String>> mCurrentSValue = null;
    private ArrayList<Runnable> mRunnables = new ArrayList<>();
    private final ArrayList<Runnable> mStartActivityRunnables = new ArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCFragment$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f73517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Pair<Map<String, String>, Map<String, String>> f73519c;

        public a(Context context, String str, Pair<Map<String, String>, Map<String, String>> pair) {
            this.f73517a = context;
            this.f73518b = str;
            this.f73519c = pair;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f73517a == null || TextUtils.isEmpty(this.f73518b) || this.f73519c == null) {
                return;
            }
            l lVarA = l.f73547c.a(this.f73517a);
            Pair<Map<String, String>, Map<String, String>> pair = this.f73519c;
            RawKV rawKV = lVarA.f73549a;
            try {
                rawKV.putMap("pre_sValue", (Map) pair.first);
                ArrayList<String> arrayList = (ArrayList) ArraysKt.toCollection(rawKV.getStrings("sValues", new String[0]), new ArrayList());
                lVarA.f73550b = arrayList;
                arrayList.add(pair.second.toString());
                if (lVarA.f73550b.size() >= 100) {
                    MallTaskRunner.getInstance().submit(new k(lVarA, 0));
                } else {
                    rawKV.putStrings("sValues", (String[]) lVarA.f73550b.toArray(new String[0]));
                }
            } catch (Exception e7) {
            }
        }
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    private static void __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookActivityFinish(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new kotlin.Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    private void commitSValue(String str) {
        Context applicationContext = getApplicationContext();
        Pair<Map<String, String>, Map<String, String>> pair = this.mCurrentSValue;
        MallTaskRunner.getInstance().submit(new a(applicationContext, str, pair));
        a aVar = new a(applicationContext, str, pair);
        this.mRunnables.add(aVar);
        HandlerThreads.runOn(3, aVar);
    }

    private Pair<Map<String, String>, Map<String, String>> genSValue(String str) {
        String buvid = NeuronRuntimeHelper.getInstance().getBuvid();
        String str2 = System.currentTimeMillis() + "";
        StringBuilder sb = new StringBuilder();
        sb.append((buvid + str2).hashCode());
        sb.append("");
        String string = sb.toString();
        HashMap mapA = pf.f.a(3, "preS", string, "preSchema", str);
        mapA.put("preTimes", str2);
        HashMap map = new HashMap(3);
        map.put("cureS", string);
        map.put("curSchema", str);
        map.put("curTimes", str2);
        return new Pair<>(mapA, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generatePageId() {
        if (!(this instanceof ISValue) || TextUtils.isEmpty(((ISValue) this).getSchema())) {
            return;
        }
        this.prePageId = MallSessionHelper.INSTANCE.getMallSession().getPrePageId();
        this.curPageId = UUID.randomUUID().toString();
        Lazy<com.bilibili.opd.app.bizcommon.context.session.a> lazy = com.bilibili.opd.app.bizcommon.context.session.a.f73555e;
        com.bilibili.opd.app.bizcommon.context.session.a aVarA = a.b.a();
        String str = this.curPageId;
        aVarA.getClass();
        com.bilibili.opd.app.bizcommon.context.session.a.d(str);
    }

    private Map<String, String> getPreSValue() {
        Map<String, String> mapEmptyMap = Collections.emptyMap();
        if (p3() != null) {
            try {
                mapEmptyMap = l.f73547c.a(p3()).f73549a.getMap("pre_sValue", MapsKt.emptyMap());
            } catch (Exception e7) {
                mapEmptyMap = MapsKt.emptyMap();
            }
        }
        return mapEmptyMap;
    }

    private boolean hitSample() {
        boolean z6;
        try {
            float f7 = Float.parseFloat(DeviceDecision.INSTANCE.dd(DD_FSP_SAMPLE_RATE, "0"));
            z6 = false;
            if (f7 > 0.0f) {
                z6 = false;
                if (Math.random() < f7) {
                    z6 = true;
                }
            }
        } catch (Exception e7) {
            z6 = false;
        }
        return z6;
    }

    private boolean isFragmentVisible() {
        return isResumed() && !isHidden();
    }

    private boolean isInFSPWhiteList() {
        DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
        long ddVersion = deviceDecision.getDdVersion();
        if (sFSPWhiteListCache == null || sFSPWhiteListDDVersion != ddVersion) {
            String strDd = deviceDecision.dd(DD_FSP_WHITE_LIST, (String) null);
            try {
                sFSPWhiteListCache = strDd != null ? JSON.parseArray(strDd, String.class) : Collections.emptyList();
            } catch (Exception e7) {
                sFSPWhiteListCache = Collections.emptyList();
            }
            sFSPWhiteListDDVersion = ddVersion;
        }
        return sFSPWhiteListCache.contains(getFSPPageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$0(String str) {
        Object obj;
        Map<String, String> preSValue = getPreSValue();
        HashMap map = new HashMap(6);
        Pair<Map<String, String>, Map<String, String>> pairGenSValue = genSValue(str);
        this.mCurrentSValue = pairGenSValue;
        map.putAll((Map) pairGenSValue.second);
        if (preSValue == null || preSValue.isEmpty()) {
            HashMap mapA = pf.f.a(3, "preSchema", "", "preS", "");
            mapA.put("preTimes", "");
            obj = mapA;
        } else {
            obj = preSValue;
            if (TextUtils.equals(preSValue.get("preSchema"), (CharSequence) ((Map) this.mCurrentSValue.second).get("curSchema"))) {
                preSValue.put("preSchema", "");
                preSValue.put("preS", "");
                preSValue.put("preTimes", "");
                obj = preSValue;
            }
        }
        map.putAll(obj);
        Neurons.reportPageView(false, "mall.svalue-path.0.0.pv", "", 0, 0L, map, 0L, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startActivity$1(String str) {
        BLRouter bLRouter = BLRouter.INSTANCE;
        BLRouter.routeTo(new RouteRequest.Builder(str).build(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$startActivity$2(Map map, MutableBundleLike mutableBundleLike) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        mutableBundleLike.put("bundleData", bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startActivity$3(String str, Map map) {
        BLRouter bLRouter = BLRouter.INSTANCE;
        BLRouter.routeTo(new RouteRequest.Builder(str).extras(new He.k(map, 1)).build(), this);
    }

    private void maybeStartFSPDetection() {
        View view;
        if (Build.VERSION.SDK_INT >= 26 && this.mFSPDetector == null && (view = getView()) != null && isFragmentVisible() && isInFSPWhiteList() && hitSample()) {
            startFSPDetector(view);
        }
    }

    private Bundle mergeBundles(Bundle... bundleArr) {
        Bundle bundle = new Bundle();
        for (Bundle bundle2 : bundleArr) {
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        return bundle;
    }

    private static Map<String, String> parseQueryParameters(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    private void release() {
        Iterator<Runnable> it = this.mRunnables.iterator();
        while (it.hasNext()) {
            HandlerThreads.remove(3, it.next());
        }
        this.mRunnables.clear();
        Iterator<Runnable> it2 = this.mStartActivityRunnables.iterator();
        while (it2.hasNext()) {
            HandlerThreads.remove(0, it2.next());
        }
        this.mStartActivityRunnables.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportFSP(long j7, boolean z6, float f7) {
        HashMap map = new HashMap(5);
        map.put("pv", getFSPPageName());
        map.put("fsp", String.valueOf(j7));
        map.put("timeout", String.valueOf(z6));
        map.put("bg_ratio", String.format("%.4f", Float.valueOf(f7)));
        FragmentActivity fragmentActivityM4405getActivity = p3();
        if (fragmentActivityM4405getActivity != null && fragmentActivityM4405getActivity.getIntent() != null && fragmentActivityM4405getActivity.getIntent().getData() != null) {
            map.put(QUERY_PARAMETER_URL, fragmentActivityM4405getActivity.getIntent().getData().toString());
        }
        BLog.d(TAG, "reportFSP: " + map);
        Neurons neurons = Neurons.INSTANCE;
        Neurons.reportExposure(false, EVENT_FSP, map, Collections.emptyList());
    }

    private void startFSPDetector(View view) {
        this.mFSPStartTime = SystemClock.elapsedRealtime();
        this.mFSPDetector = new C8232d();
        FragmentActivity fragmentActivityM4405getActivity = p3();
        Window window = fragmentActivityM4405getActivity != null ? fragmentActivityM4405getActivity.getWindow() : null;
        C8232d c8232d = this.mFSPDetector;
        long j7 = this.mFSPStartTime;
        d dVar = new d(this);
        if (c8232d.f124756e) {
            return;
        }
        c8232d.f124756e = true;
        c8232d.f124752a = j7;
        c8232d.f124753b = 0L;
        c8232d.f124754c = 0;
        c8232d.f124755d = 0.0f;
        c8232d.f124764n = new WeakReference<>(view);
        c8232d.f124767q = dVar;
        c8232d.f124768r = Executors.newSingleThreadExecutor();
        if (Build.VERSION.SDK_INT >= 26 && window != null) {
            c8232d.f124765o = new WeakReference<>(window);
        }
        view.post(new SV.g(c8232d, 1));
    }

    private void stopFSPDetector() {
        C8232d c8232d = this.mFSPDetector;
        if (c8232d != null) {
            c8232d.d();
            this.mFSPDetector = null;
        }
    }

    public boolean activityDie() {
        return !LifeCycleChecker.isAlive(p3());
    }

    public void close() {
        finishAttachedActivity();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && this.hasDispatchKeyDown) {
            this.hasDispatchKeyDown = false;
            boolean zIsInterceptBackKeyCode = isInterceptBackKeyCode();
            if (zIsInterceptBackKeyCode) {
                onBackPressed();
            }
            return zIsInterceptBackKeyCode;
        }
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        this.hasDispatchKeyDown = true;
        return false;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public void e(String str) {
        startActivity(str);
    }

    public boolean enableDispatchInterceptor() {
        return true;
    }

    public void finishAttachedActivity() {
        FragmentActivity fragmentActivityM4405getActivity = p3();
        if (activityDie()) {
            return;
        }
        __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookActivityFinish(fragmentActivityM4405getActivity);
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public Pair<Map<String, String>, Map<String, String>> getCurrentSValue() {
        return this.mCurrentSValue;
    }

    public Environment getEnvironment() {
        if (KFCAppCompatActivity.class.isInstance(p3())) {
            return ((KFCAppCompatActivity) p3()).getEnvironment();
        }
        Log.e(TAG, "Override getEnviroment() if u not use KFCAppCompatActivity to load KFCFragment");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getFSPPageName() {
        return this instanceof IPvTracker ? ((IPvTracker) this).getPvEventId() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getQueryParameter(java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.KFCFragment.getQueryParameter(java.lang.String):java.lang.String");
    }

    public Bundle getQueryParamsBundle() {
        Bundle bundleMergeBundles;
        Bundle extras;
        try {
            FragmentActivity fragmentActivityM4405getActivity = p3();
            bundleMergeBundles = null;
            if (fragmentActivityM4405getActivity != null) {
                if (activityDie()) {
                    bundleMergeBundles = null;
                } else {
                    Bundle bundle = new Bundle();
                    if (fragmentActivityM4405getActivity.getIntent() != null && fragmentActivityM4405getActivity.getIntent().getData() != null && fragmentActivityM4405getActivity.getIntent().getData().getEncodedQuery() != null) {
                        Iterator<Map.Entry<String, String>> it = parseQueryParameters(fragmentActivityM4405getActivity.getIntent().getData().getEncodedQuery()).entrySet().iterator();
                        while (true) {
                            extras = bundle;
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, String> next = it.next();
                            bundle.putString(next.getKey(), next.getValue());
                        }
                    } else {
                        extras = bundle;
                        if (fragmentActivityM4405getActivity.getIntent() != null) {
                            extras = bundle;
                            if (fragmentActivityM4405getActivity.getIntent().getExtras() != null) {
                                extras = fragmentActivityM4405getActivity.getIntent().getExtras();
                            }
                        }
                    }
                    bundleMergeBundles = mergeBundles(getArguments() != null ? getArguments() : null, extras);
                }
            }
        } catch (Exception e7) {
            bundleMergeBundles = null;
        }
        return bundleMergeBundles;
    }

    public void hideSoftInput() {
        InputMethodManager inputMethodManager;
        if (p3() == null || getView() == null || (inputMethodManager = (InputMethodManager) p3().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }

    public boolean isInterceptBackKeyCode() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.mNeedPendingUserVisibileHint) {
            setUserVisibleCompat(this.mLastUserVisibileHint);
            this.mNeedPendingUserVisibileHint = false;
        }
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onCreate(p3(), bundle);
            }
        }
        generatePageId();
        if (bundle != null) {
            this.prePageId = bundle.getString("prePageId");
            this.curPageId = bundle.getString("curPageId");
        }
        maybeStartFSPDetection();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onActivityResult(p3(), i7, i8, intent);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mApplicationContext = activity.getApplicationContext();
    }

    public void onBackPressed() {
        boolean zPopBackStackImmediate;
        FragmentActivity fragmentActivityM4405getActivity = p3();
        if (fragmentActivityM4405getActivity == null) {
            return;
        }
        hideSoftInput();
        if (KFCAppCompatActivity.class.isInstance(fragmentActivityM4405getActivity)) {
            ((KFCAppCompatActivity) fragmentActivityM4405getActivity).onBackPressed();
            return;
        }
        if (!AppCompatActivity.class.isInstance(fragmentActivityM4405getActivity)) {
            finishAttachedActivity();
            return;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityM4405getActivity;
        try {
            zPopBackStackImmediate = appCompatActivity.getSupportFragmentManager().popBackStackImmediate();
        } catch (IllegalStateException e7) {
            zPopBackStackImmediate = false;
        }
        if (zPopBackStackImmediate) {
            return;
        }
        appCompatActivity.supportFinishAfterTransition();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if ((p3() instanceof KFCAppCompatActivity) && enableDispatchInterceptor()) {
            ((KFCAppCompatActivity) p3()).setEventDispatchInterceptor(this);
        }
        if (p3() instanceof KFCAppCompatActivity) {
            ((KFCAppCompatActivity) p3()).setWindowFocusInterceptors(this);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        release();
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onDestroy(p3());
            }
        }
        if (p3() instanceof KFCAppCompatActivity) {
            if (enableDispatchInterceptor()) {
                ((KFCAppCompatActivity) p3()).removeEventDispatchInterceptor(this);
            }
            ((KFCAppCompatActivity) p3()).removeWindowFocusInterceptor(this);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        stopFSPDetector();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z6) {
        super.onHiddenChanged(z6);
        if (z6) {
            stopFSPDetector();
        } else {
            resumePageId();
            maybeStartFSPDetection();
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.b
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onPause(p3());
            }
        }
        if (this instanceof ISValue) {
            ISValue iSValue = (ISValue) this;
            if (iSValue.sValueEnable()) {
                String schema = iSValue.getSchema();
                if (TextUtils.isEmpty(schema)) {
                    return;
                }
                commitSValue(schema);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onResume(p3());
            }
        }
        maybeStartFSPDetection();
        if (this instanceof ISValue) {
            ISValue iSValue = (ISValue) this;
            if (iSValue.sValueEnable()) {
                String schema = iSValue.getSchema();
                if (!TextUtils.isEmpty(schema)) {
                    Runnable nVar = new com.bilibili.bililive.room.ui.roomv3.hybrid.n(this, schema, 1);
                    this.mRunnables.add(nVar);
                    HandlerThreads.runOn(3, nVar);
                }
                resumePageId();
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onSaveInstanceState(p3(), bundle);
            }
        }
        if (!TextUtils.isEmpty(this.prePageId)) {
            bundle.putString("prePageId", this.prePageId);
        }
        if (TextUtils.isEmpty(this.curPageId)) {
            return;
        }
        bundle.putString("curPageId", this.curPageId);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onStart(p3());
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        synchronized (this.mLifecycleListenersLock) {
            Iterator<ActivityLifecycleListener> it = this.mLifecycleListeners.iterator();
            while (it.hasNext()) {
                it.next().onStop(p3());
            }
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.m
    public void onWindowFocusChanged(boolean z6) {
    }

    public void registerLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        if (activityLifecycleListener == null) {
            return;
        }
        synchronized (this.mLifecycleListenersLock) {
            ArrayList arrayList = new ArrayList(this.mLifecycleListeners);
            if (arrayList.contains(activityLifecycleListener)) {
                return;
            }
            arrayList.add(activityLifecycleListener);
            this.mLifecycleListeners = arrayList;
        }
    }

    public void resumePageId() {
        if (TextUtils.isEmpty(this.curPageId)) {
            return;
        }
        Lazy<com.bilibili.opd.app.bizcommon.context.session.a> lazy = com.bilibili.opd.app.bizcommon.context.session.a.f73555e;
        com.bilibili.opd.app.bizcommon.context.session.a aVarA = a.b.a();
        String str = this.curPageId;
        aVarA.getClass();
        com.bilibili.opd.app.bizcommon.context.session.a.d(str);
    }

    public void setUserVisibleCompat(boolean z6) {
        if (z6) {
            maybeStartFSPDetection();
        } else {
            stopFSPDetector();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        if (p3() != null) {
            setUserVisibleCompat(z6);
        } else {
            this.mNeedPendingUserVisibileHint = true;
            this.mLastUserVisibileHint = z6;
        }
    }

    public void startActivity(final String str) {
        Runnable runnable = new Runnable(this, str) { // from class: com.bilibili.opd.app.bizcommon.context.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCFragment f73530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f73531b;

            {
                this.f73530a = this;
                this.f73531b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f73530a.lambda$startActivity$1(this.f73531b);
            }
        };
        this.mStartActivityRunnables.add(runnable);
        HandlerThreads.runOn(0, runnable);
    }

    public void startActivity(final String str, @Nullable final Map<String, String> map) {
        Runnable runnable = new Runnable(this, str, map) { // from class: com.bilibili.opd.app.bizcommon.context.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCFragment f73537a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f73538b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Map f73539c;

            {
                this.f73537a = this;
                this.f73538b = str;
                this.f73539c = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f73537a.lambda$startActivity$3(this.f73538b, this.f73539c);
            }
        };
        this.mStartActivityRunnables.add(runnable);
        HandlerThreads.runOn(0, runnable);
    }

    public void startActivityForResult(String str, int i7) {
        BLRouter bLRouter = BLRouter.INSTANCE;
        BLRouter.routeTo(new RouteRequest.Builder(str).requestCode(i7).build(), this);
    }

    public void unregisterLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        if (activityLifecycleListener == null) {
            return;
        }
        synchronized (this.mLifecycleListenersLock) {
            ArrayList arrayList = new ArrayList(this.mLifecycleListeners);
            if (arrayList.contains(activityLifecycleListener)) {
                arrayList.remove(activityLifecycleListener);
                this.mLifecycleListeners = arrayList;
            }
        }
    }
}
