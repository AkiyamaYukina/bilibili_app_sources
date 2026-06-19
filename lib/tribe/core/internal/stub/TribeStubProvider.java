package com.bilibili.lib.tribe.core.internal.stub;

import Df0.C1593a;
import Gf0.InterfaceC1970e;
import If0.C2291a;
import If0.f;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.p;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.spy.generated.android_content_ContentProvider;
import com.bilibili.lib.tribe.core.internal.bundle.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/stub/TribeStubProvider.class */
public final class TribeStubProvider extends android_content_ContentProvider implements InterfaceC1970e {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final ThreadLocal<C2291a> threadLocal = new ThreadLocal<>();

    @Nullable
    private final C2291a componentRecord;

    @Nullable
    private ProviderInfo providerInfo;

    @Nullable
    private ContentProvider realProvider;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/stub/TribeStubProvider$a.class */
    public static final class a {
    }

    public TribeStubProvider() {
        Companion.getClass();
        C2291a c2291a = (C2291a) threadLocal.get();
        threadLocal.remove();
        this.componentRecord = c2291a;
    }

    private final ContentProvider checkProvider() {
        ContentProvider contentProvider = this.realProvider;
        if (contentProvider == null) {
            C2291a c2291a = this.componentRecord;
            Log.w("TribeStub", "provider '" + (c2291a != null ? c2291a.f10277b.getName() : null) + "' is not installed");
        }
        return contentProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // android.content.ContentProvider
    @androidx.annotation.RequiresApi(29)
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.ContentProviderResult[] applyBatch(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.util.ArrayList<android.content.ContentProviderOperation> r6) throws android.content.OperationApplicationException {
        /*
            r4 = this;
            r0 = r4
            android.content.ContentProvider r0 = r0.checkProvider()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r7
            r1 = r5
            r2 = r6
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r1, r2)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L20
        L19:
            r0 = r4
            r1 = r5
            r2 = r6
            android.content.ContentProviderResult[] r0 = super.applyBatch(r1, r2)
            r7 = r0
        L20:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider.applyBatch(java.lang.String, java.util.ArrayList):android.content.ContentProviderResult[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.content.ContentProvider
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.ContentProviderResult[] applyBatch(@org.jetbrains.annotations.NotNull java.util.ArrayList<android.content.ContentProviderOperation> r4) throws android.content.OperationApplicationException {
        /*
            r3 = this;
            r0 = r3
            android.content.ContentProvider r0 = r0.checkProvider()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            r1 = r4
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L1b
        L15:
            r0 = r3
            r1 = r4
            android.content.ContentProviderResult[] r0 = super.applyBatch(r1)
            r5 = r0
        L1b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider.applyBatch(java.util.ArrayList):android.content.ContentProviderResult[]");
    }

    @Override // com.bilibili.lib.spy.generated.android_content_ContentProvider, android.content.ContentProvider
    public void attachInfo(@Nullable Context context, @Nullable ProviderInfo providerInfo) {
        String str;
        super.attachInfo(context, providerInfo);
        this.providerInfo = new ProviderInfo(providerInfo);
        C2291a c2291a = this.componentRecord;
        if (c2291a == null || (str = c2291a.f10276a) == null) {
            return;
        }
        b bVar = C1593a.f2893a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            bVar = null;
        }
        bVar.j(str, this);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(@NotNull Uri uri, @NotNull ContentValues[] contentValuesArr) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.bulkInsert(uri, contentValuesArr) : super.bulkInsert(uri, contentValuesArr);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NotNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.call(str, str2, bundle) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(29)
    @Nullable
    public Bundle call(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Bundle bundle) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.call(str, str2, str3, bundle) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(19)
    @Nullable
    public Uri canonicalize(@NotNull Uri uri) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.canonicalize(uri) : null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.delete(uri, str, strArr) : 0;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(18)
    public void dump(@Nullable FileDescriptor fileDescriptor, @Nullable PrintWriter printWriter, @Nullable String[] strArr) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        if (contentProviderCheckProvider != null) {
            contentProviderCheckProvider.dump(fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String[] getStreamTypes(@NotNull Uri uri, @NotNull String str) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.getStreamTypes(uri, str) : null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.getType(uri) : null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.insert(uri, contentValues) : null;
    }

    @Override // Gf0.InterfaceC1970e
    public void onBundleInstalled(@NotNull String str) throws IllegalAccessException, InstantiationException {
        C2291a c2291a = this.componentRecord;
        String name = c2291a != null ? c2291a.f10277b.getName() : null;
        if (name == null || name.length() == 0) {
            return;
        }
        b bVar = C1593a.f2893a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            bVar = null;
        }
        f fVarD = bVar.i().d(str);
        ContentProvider contentProvider = null;
        if (fVarD != null) {
            Object objNewInstance = fVarD.a(name).newInstance();
            ContentProvider contentProvider2 = objNewInstance instanceof ContentProvider ? (ContentProvider) objNewInstance : null;
            contentProvider = null;
            if (contentProvider2 != null) {
                contentProvider2.attachInfo(getContext(), this.providerInfo);
                contentProvider = contentProvider2;
            }
        }
        this.realProvider = contentProvider;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        if (contentProviderCheckProvider != null) {
            contentProviderCheckProvider.onConfigurationChanged(configuration);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C2291a c2291a = this.componentRecord;
        String name = null;
        String str = c2291a != null ? c2291a.f10276a : null;
        if (c2291a != null) {
            name = c2291a.f10277b.getName();
        }
        Log.w("TribeStub", p.a("stub provider for bundle[", str, " - ", name, "]"));
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        ContentProvider contentProviderCheckProvider = checkProvider();
        if (contentProviderCheckProvider != null) {
            contentProviderCheckProvider.onLowMemory();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        if (contentProviderCheckProvider != null) {
            contentProviderCheckProvider.onTrimMemory(i7);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openAssetFile(uri, str) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(19)
    @Nullable
    public AssetFileDescriptor openAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openAssetFile(uri, str, cancellationSignal) : null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openFile(uri, str) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(19)
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String str, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openFile(uri, str, cancellationSignal) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @Override // android.content.ContentProvider
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> android.os.ParcelFileDescriptor openPipeHelper(@org.jetbrains.annotations.NotNull android.net.Uri r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10, @org.jetbrains.annotations.Nullable T r11, @org.jetbrains.annotations.NotNull android.content.ContentProvider.PipeDataWriter<T> r12) throws java.io.FileNotFoundException {
        /*
            r7 = this;
            r0 = r7
            android.content.ContentProvider r0 = r0.checkProvider()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L22
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.os.ParcelFileDescriptor r0 = r0.openPipeHelper(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r14
            if (r0 != 0) goto L2f
        L22:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.os.ParcelFileDescriptor r0 = super.openPipeHelper(r1, r2, r3, r4, r5)
            r13 = r0
        L2f:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider.openPipeHelper(android.net.Uri, java.lang.String, android.os.Bundle, java.lang.Object, android.content.ContentProvider$PipeDataWriter):android.os.ParcelFileDescriptor");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openTypedAssetFile(uri, str, bundle) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(19)
    @Nullable
    public AssetFileDescriptor openTypedAssetFile(@NotNull Uri uri, @NotNull String str, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.openTypedAssetFile(uri, str, bundle, cancellationSignal) : null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.query(uri, strArr, str, strArr2, str2) : null;
    }

    @Override // android.content.ContentProvider
    @RequiresApi(26)
    public boolean refresh(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable CancellationSignal cancellationSignal) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.refresh(uri, bundle, cancellationSignal) : super.refresh(uri, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        ContentProvider contentProviderCheckProvider = checkProvider();
        if (contentProviderCheckProvider != null) {
            contentProviderCheckProvider.shutdown();
        }
    }

    @Override // android.content.ContentProvider
    @RequiresApi(19)
    @Nullable
    public Uri uncanonicalize(@NotNull Uri uri) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.uncanonicalize(uri) : null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        ContentProvider contentProviderCheckProvider = checkProvider();
        return contentProviderCheckProvider != null ? contentProviderCheckProvider.update(uri, contentValues, str, strArr) : 0;
    }
}
