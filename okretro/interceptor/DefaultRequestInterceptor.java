package com.bilibili.okretro.interceptor;

import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bilibili.api.BiliConfig;
import com.bilibili.api.DisplayID;
import com.bilibili.api.PhoneDeviceId;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.nativelibrary.LibBili;
import com.bilibili.nativelibrary.SignedQuery;
import com.tencent.connect.common.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/interceptor/DefaultRequestInterceptor.class */
public class DefaultRequestInterceptor implements IRequestInterceptor {
    private static final String TAG = "DefaultRequestIntercept";
    private static a netPublicParamFactory;
    public static final DefaultRequestInterceptor INSTANCE = new DefaultRequestInterceptor();
    private static boolean guestIdEnable = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/interceptor/DefaultRequestInterceptor$a.class */
    public interface a {
        Map<String, String> create();

        boolean enable();
    }

    private boolean checkSign() {
        boolean withDefault = true;
        try {
            withDefault = ConfigManager.ab2().getWithDefault("net.check_sign", true);
        } catch (Exception e7) {
        }
        return withDefault;
    }

    private String decode(String str, String str2) throws UnsupportedEncodingException {
        return TextUtils.isEmpty(str) ? "" : URLDecoder.decode(str, str2);
    }

    private Map<String, String> fromToQueryMap(String str, Charset charset) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 1) {
                    try {
                        map.put(decode(strArrSplit[0], charset.name()), "");
                    } catch (UnsupportedEncodingException e7) {
                        throw new RuntimeException(e7);
                    }
                } else if (strArrSplit.length == 2) {
                    try {
                        map.put(decode(strArrSplit[0], charset.name()), decode(strArrSplit[1], charset.name()));
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return map;
    }

    public static boolean guestIdEnable() {
        return guestIdEnable;
    }

    public static void put(String str, String str2, Map<String, String> map) {
        if (!map.containsKey(str)) {
            map.put(str, str2);
            return;
        }
        String str3 = map.get(str);
        if (str2 != null) {
            map.put(str, str3 + "," + str2);
        }
    }

    public static void setGuestIdEnable(boolean z6) {
        guestIdEnable = z6;
    }

    public static void setNetPublicParamFactory(a aVar) {
        netPublicParamFactory = aVar;
    }

    @CallSuper
    public void addCommonParam(Map<String, String> map) {
        a aVar = netPublicParamFactory;
        if (aVar != null && aVar.enable()) {
            try {
                map.putAll(netPublicParamFactory.create());
                return;
            } catch (Throwable th) {
                BLog.e(TAG, "addCommonParam failure", th);
                return;
            }
        }
        map.put("platform", Constant.SDK_OS);
        map.put("mobi_app", BiliConfig.getMobiApp());
        map.put(DictionaryKeys.V2_APPKEY, getAppKey());
        map.put("build", String.valueOf(BiliConfig.getBiliVersionCode()));
        map.put("channel", BiliConfig.getChannel());
        String accessKey = BiliConfig.getAccessKey();
        if (!TextUtils.isEmpty(accessKey)) {
            map.put(Tm0.a.f24206c, accessKey);
        }
        Map<? extends String, ? extends String> customParams = BiliConfig.getCustomParams();
        if (customParams != null) {
            map.putAll(customParams);
        }
        map.put("c_locale", BiliConfig.getCurrentLocale());
        map.put("s_locale", BiliConfig.getSystemLocale());
    }

    public void addCommonParamToBody(HttpUrl httpUrl, RequestBody requestBody, Request.Builder builder) {
        addCommonParamToBodyResult(httpUrl, requestBody, builder);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean addCommonParamToBodyResult(okhttp3.HttpUrl r6, okhttp3.RequestBody r7, okhttp3.Request.Builder r8) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.okretro.interceptor.DefaultRequestInterceptor.addCommonParamToBodyResult(okhttp3.HttpUrl, okhttp3.RequestBody, okhttp3.Request$Builder):boolean");
    }

    public void addCommonParamToUrl(HttpUrl httpUrl, Request.Builder builder) {
        if (!checkSign() || httpUrl.queryParameter("sign") == null) {
            HashMap map = new HashMap();
            int iQuerySize = httpUrl.querySize();
            for (int i7 = 0; i7 < iQuerySize; i7++) {
                put(httpUrl.queryParameterName(i7), httpUrl.queryParameterValue(i7), map);
            }
            addCommonParam(map);
            builder.url(httpUrl.newBuilder().encodedQuery(signQuery(map).toString()).build());
        }
    }

    public void addHeader(Request.Builder builder) {
        String str = DisplayID.get();
        if (!TextUtils.isEmpty(str)) {
            builder.header("Display-ID", str);
        }
        String buvid = BiliConfig.getBuvid();
        if (!TextUtils.isEmpty(buvid)) {
            builder.header("Buvid", buvid);
        }
        String appDefaultUA = BiliConfig.getAppDefaultUA();
        if (!TextUtils.isEmpty(appDefaultUA)) {
            builder.header(Tm0.a.f24205b, appDefaultUA);
        }
        String str2 = PhoneDeviceId.get();
        if (!TextUtils.isEmpty(str2)) {
            builder.header("Device-ID", str2);
        }
        String fpLocal = BiliConfig.getFpLocal();
        if (!TextUtils.isEmpty(fpLocal)) {
            builder.header("fp_local", fpLocal);
        }
        String fpRemote = BiliConfig.getFpRemote();
        if (!TextUtils.isEmpty(fpRemote)) {
            builder.header("fp_remote", fpRemote);
        }
        String sessionId = BiliConfig.getSessionId();
        if (!TextUtils.isEmpty(sessionId)) {
            builder.header("session_id", sessionId);
        }
        String localBin = BiliConfig.getLocalBin();
        if (!TextUtils.isEmpty(localBin)) {
            builder.header("x-bili-locale-bin", localBin);
        }
        if (guestIdEnable) {
            String guestId = BiliConfig.getGuestId();
            if (TextUtils.isEmpty(guestId)) {
                return;
            }
            builder.header("GuestId", guestId);
        }
    }

    public String getAppKey() {
        return BiliConfig.getAppKey();
    }

    @Override // com.bilibili.okretro.interceptor.IRequestInterceptor
    public Request intercept(Request request) {
        Request.Builder builderNewBuilder = request.newBuilder();
        addHeader(builderNewBuilder);
        if (Constants.HTTP_GET.equals(request.method())) {
            addCommonParamToUrl(request.url(), builderNewBuilder);
        } else if (Constants.HTTP_POST.equals(request.method()) && !addCommonParamToBodyResult(request.url(), request.body(), builderNewBuilder)) {
            addCommonParamToUrl(request.url(), builderNewBuilder);
        }
        return builderNewBuilder.build();
    }

    public SignedQuery signQuery(Map<String, String> map) {
        return LibBili.signQuery(map);
    }
}
