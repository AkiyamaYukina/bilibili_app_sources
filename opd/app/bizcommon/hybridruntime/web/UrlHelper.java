package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.B;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/UrlHelper.class */
public class UrlHelper {
    public static String appendFragments(String str, String str2, String str3) {
        String strA;
        boolean z6;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        String fragment = uri.getFragment();
        if (TextUtils.isEmpty(fragment)) {
            strA = B0.a.a(str2, "=", str3);
        } else {
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit = fragment.split("&");
            int length = strArrSplit.length;
            int i7 = 0;
            boolean z7 = false;
            boolean z8 = true;
            while (i7 < length) {
                String str4 = strArrSplit[i7];
                int iIndexOf = str4.indexOf(61);
                String strSubstring = iIndexOf != -1 ? iIndexOf == 0 ? "" : str4.substring(0, iIndexOf) : str4;
                String strSubstring2 = iIndexOf != -1 ? str4.substring(iIndexOf + 1, str4.length()) : "";
                if (z7) {
                    sb.append("&");
                }
                if (str2.equals(strSubstring)) {
                    B0.b.b(str2, "=", str3, sb);
                    z6 = false;
                } else if (TextUtils.isEmpty(strSubstring2)) {
                    sb.append(strSubstring);
                    z6 = z8;
                    if (iIndexOf == str4.length() - 1) {
                        z6 = z8;
                        if (str4.length() > 0) {
                            sb.append("=");
                            z6 = z8;
                        }
                    }
                } else {
                    B0.b.b(strSubstring, "=", strSubstring2, sb);
                    z6 = z8;
                }
                i7++;
                z8 = z6;
                z7 = true;
            }
            if (z8) {
                B.a("&", str2, "=", str3, sb);
            }
            strA = sb.toString();
        }
        return uri.buildUpon().encodedFragment(strA).build().toString();
    }

    public static String appendFromH5(String str) {
        Uri uriBuild;
        try {
            uriBuild = Uri.parse(str).buildUpon().appendQueryParameter("url_from_h5", String.valueOf(1)).build();
        } catch (Exception e7) {
            BLog.e("kfc_UrlHelper", e7.toString());
            uriBuild = null;
        }
        return uriBuild == null ? str : uriBuild.toString();
    }

    @Nullable
    public static Uri appendQueryParam(String str, String str2, String str3, String str4, String str5) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).appendQueryParameter(str4, str5).build();
        } catch (Exception e7) {
            BLog.e("kfc_UrlHelper", e7.toString());
            return null;
        }
    }

    public static boolean getBooleanParameter(Uri uri, String str, boolean z6) {
        boolean booleanQueryParameter = z6;
        if (uri != null) {
            if (uri.isHierarchical()) {
                try {
                    booleanQueryParameter = uri.getBooleanQueryParameter(str, z6);
                } catch (Exception e7) {
                    BLog.e("kfc_UrlHelper", e7.toString());
                    booleanQueryParameter = z6;
                }
            } else {
                booleanQueryParameter = z6;
            }
        }
        return booleanQueryParameter;
    }

    public static String getMsource(Intent intent, String str) {
        String queryParameter;
        String str2 = null;
        try {
            String queryParameter2 = null;
            if (TextUtils.isEmpty(null)) {
                queryParameter2 = null;
                if (intent != null) {
                    queryParameter2 = null;
                    if (intent.getData() != null) {
                        queryParameter2 = intent.getData().getQueryParameter(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE);
                    }
                }
            }
            String stringExtra = queryParameter2;
            if (TextUtils.isEmpty(queryParameter2)) {
                stringExtra = queryParameter2;
                if (intent != null) {
                    stringExtra = intent.getStringExtra(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE);
                }
            }
            String str3 = stringExtra;
            queryParameter = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                queryParameter = stringExtra;
                if (intent != null) {
                    queryParameter = stringExtra;
                    if (intent.getData() != null) {
                        String str4 = stringExtra;
                        String queryParameter3 = intent.getData().getQueryParameter("url");
                        queryParameter = stringExtra;
                        if (queryParameter3 != null) {
                            queryParameter = stringExtra;
                            if (queryParameter3.startsWith("http")) {
                                str2 = stringExtra;
                                queryParameter = Uri.parse(queryParameter3).getQueryParameter(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE);
                            }
                        }
                    }
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            queryParameter = str2;
        }
        if (queryParameter != null) {
            str = queryParameter;
        }
        return str;
    }

    public static String getStringParameter(Uri uri, String str, String str2) {
        String queryParameter;
        String str3 = str2;
        if (uri != null) {
            if (uri.isHierarchical()) {
                try {
                    queryParameter = uri.getQueryParameter(str);
                } catch (Exception e7) {
                    BLog.e("kfc_UrlHelper", e7.toString());
                    queryParameter = str2;
                }
                str3 = queryParameter == null ? str2 : queryParameter;
            } else {
                str3 = str2;
            }
        }
        return str3;
    }

    public static boolean isMallDomain(@Nullable String str) {
        return !TextUtils.isEmpty(str) && "mall.bilibili.com".equals(Uri.parse(str).getHost());
    }

    public static boolean isShowDomain(@Nullable String str) {
        return !TextUtils.isEmpty(str) && "show.bilibili.com".equals(Uri.parse(str).getHost());
    }

    public static boolean isUrlFromH5(Uri uri) {
        return (uri == null || TextUtils.isEmpty(uri.getQueryParameter("url_from_h5")) || !"1".equals(uri.getQueryParameter("url_from_h5"))) ? false : true;
    }

    public static boolean openByRouter(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return BLRouter.routeTo(new RouteRequest.Builder(Uri.parse(str)).build(), activity).isSuccess();
    }
}
