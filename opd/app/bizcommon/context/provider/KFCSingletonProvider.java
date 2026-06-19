package com.bilibili.opd.app.bizcommon.context.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.spy.generated.android_content_ContentProvider;
import de.a;
import java.util.HashMap;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pm0.InterfaceC8334a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/provider/KFCSingletonProvider.class */
public final class KFCSingletonProvider extends android_content_ContentProvider {
    private final HashMap<String, String> getParams(Uri uri) {
        HashMap<String, String> map = new HashMap<>();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final pm0.InterfaceC8334a getProviderBySchema(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L20
            r0 = r5
            java.lang.String r0 = r0.getPath()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L20
            com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
            java.lang.Class<pm0.a> r1 = pm0.InterfaceC8334a.class
            r2 = r5
            java.lang.Object r0 = r0.get(r1, r2)
            pm0.a r0 = (pm0.InterfaceC8334a) r0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            r5 = r0
        L22:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.provider.KFCSingletonProvider.getProviderBySchema(android.net.Uri):pm0.a");
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        int iC;
        try {
            HashMap<String, String> params = getParams(uri);
            InterfaceC8334a providerBySchema = getProviderBySchema(uri);
            iC = 0;
            if (providerBySchema != null) {
                Context context = getContext();
                iC = providerBySchema.c(params, context != null ? context.getContentResolver() : null);
            }
        } catch (Exception e7) {
            iC = 0;
        }
        return iC;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            HashMap<String, String> params = getParams(uri);
            InterfaceC8334a providerBySchema = getProviderBySchema(uri);
            if (providerBySchema == null) {
                return null;
            }
            Context context = getContext();
            providerBySchema.a(params, context != null ? context.getContentResolver() : null);
            return null;
        } catch (Exception e7) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        MatrixCursor matrixCursor;
        try {
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"data"});
            HashMap<String, String> params = getParams(uri);
            InterfaceC8334a providerBySchema = getProviderBySchema(uri);
            Object objB = providerBySchema != null ? providerBySchema.b(params) : null;
            if (objB != null) {
                matrixCursor2.addRow(new String[]{JSON.toJSONString(objB)});
            }
            matrixCursor = matrixCursor2;
        } catch (Exception e7) {
            matrixCursor = null;
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            HashMap<String, String> params = getParams(uri);
            InterfaceC8334a providerBySchema = getProviderBySchema(uri);
            if (providerBySchema == null) {
                return 0;
            }
            Context context = getContext();
            if (context != null) {
                context.getContentResolver();
            }
            providerBySchema.d(params);
            return 0;
        } catch (Exception e7) {
            a.b("browseInfo update exception: ", e7.getMessage());
            return 0;
        }
    }
}
