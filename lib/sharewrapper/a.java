package com.bilibili.lib.sharewrapper;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.sharewrapper.Bshare.ShareBLog;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.basic.IShareInterceptorV2;
import com.bilibili.lib.sharewrapper.selector.DialogSharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.DialogSharePlatformSelectorV2;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import gf0.C7276b;
import gf0.C7280f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/a.class */
public final class a implements ShareHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f64419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<ShareHelper.Callback> f64420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ISharePlatformSelector f64421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<IShareInterceptorV2> f64422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C0355a f64423e;

    /* JADX INFO: renamed from: com.bilibili.lib.sharewrapper.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/a$a.class */
    public final class C0355a implements ISharePlatformSelector.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f64424a;

        public C0355a(a aVar) {
            this.f64424a = aVar;
        }

        @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector.OnItemClickListener
        public final void onItemClick(SharePlatform sharePlatform) {
            a aVar = this.f64424a;
            aVar.shareTo(sharePlatform);
            ISharePlatformSelector iSharePlatformSelector = aVar.f64421c;
            if (iSharePlatformSelector != null) {
                iSharePlatformSelector.dismiss();
            }
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void addShareInterceptor(IShareInterceptorV2 iShareInterceptorV2) {
        if (iShareInterceptorV2 == null || ((ArrayList) this.f64422d).contains(iShareInterceptorV2)) {
            return;
        }
        ((ArrayList) this.f64422d).add(iShareInterceptorV2);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void reset() {
        ISharePlatformSelector iSharePlatformSelector = this.f64421c;
        if (iSharePlatformSelector != null) {
            iSharePlatformSelector.release();
            this.f64421c = null;
        }
        this.f64423e = null;
        ((ArrayList) this.f64422d).clear();
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setCallback(ShareHelper.Callback callback) {
        this.f64420b = new WeakReference<>(callback);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setContext(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f64419a = weakReference;
        if (weakReference.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
            return;
        }
        if (EntryPointKt.getMemleakOptEnable()) {
            ((ArrayList) this.f64422d).clear();
        }
        ((ArrayList) this.f64422d).add(new C7280f(this.f64419a.get()));
        ((ArrayList) this.f64422d).add(new C7276b(this.f64419a.get()));
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void setShareInterceptors(List<IShareInterceptorV2> list) {
        ((ArrayList) this.f64422d).clear();
        if (list != null) {
            ((ArrayList) this.f64422d).addAll(list);
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(SharePlatform sharePlatform) {
        shareTo(sharePlatform.media);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(SharePlatform sharePlatform, Bundle bundle) {
        shareTo(sharePlatform.media, bundle);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(String str) {
        if (this.f64420b.get() == null) {
            ShareBLog.e("share.helper.inner", "mCallback.get() is null");
            return;
        }
        Bundle shareContent = this.f64420b.get().getShareContent(str);
        if (shareContent == null) {
            ShareBLog.d("share.helper.inner", "empty share params");
        } else {
            shareTo(str, shareContent);
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void shareTo(String str, Bundle bundle) {
        for (IShareInterceptorV2 iShareInterceptorV2 : (ArrayList) this.f64422d) {
            if (iShareInterceptorV2.willIntercept(str)) {
                if (this.f64420b.get() == null) {
                    ShareBLog.e("share.helper.inner", "mCallback.get() is null");
                    return;
                } else {
                    iShareInterceptorV2.shareTo(str, bundle, this.f64420b.get());
                    return;
                }
            }
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog() {
        if (this.f64419a.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
        } else {
            showShareDialog(this.f64419a.get().getString(2131848267));
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(DialogInterface.OnDismissListener onDismissListener) {
        if (this.f64419a.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
        } else {
            showShareDialog(this.f64419a.get().getString(2131848267), onDismissListener);
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(ISharePlatformSelector.Style style, List<SharePlatform> list) {
        showShareDialog(style, list, (DialogInterface.OnDismissListener) null);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(ISharePlatformSelector.Style style, List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        if (this.f64419a.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
        } else {
            showShareDialog(this.f64419a.get().getString(2131848267), style, list, onDismissListener);
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(String str) {
        showShareDialog(str, SharePlatform.defaultPlatforms());
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(String str, DialogInterface.OnDismissListener onDismissListener) {
        showShareDialog(str, ISharePlatformSelector.Style.BOTTOM, SharePlatform.defaultPlatforms(), onDismissListener);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(String str, ISharePlatformSelector.Style style, List<SharePlatform> list) {
        showShareDialog(str, style, list, null);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.lib.sharewrapper.selector.DialogSharePlatformSelectorV2, com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.bilibili.lib.sharewrapper.selector.DialogSharePlatformSelector, com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector, java.lang.Object] */
    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(String str, ISharePlatformSelector.Style style, List<SharePlatform> list, @Nullable DialogInterface.OnDismissListener onDismissListener) {
        if (this.f64419a.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
        } else if (style == ISharePlatformSelector.Style.BOTTOM_V2 || style == ISharePlatformSelector.Style.CENTER_V2) {
            ISharePlatformSelector iSharePlatformSelector = this.f64421c;
            if (iSharePlatformSelector == null || !(iSharePlatformSelector instanceof DialogSharePlatformSelectorV2)) {
                Activity activity = this.f64419a.get();
                C0355a c0355a = this.f64423e;
                ?? obj = new Object();
                obj.f64446a = activity;
                obj.f64447b = c0355a;
                obj.f64448c = onDismissListener;
                this.f64421c = obj;
            }
        } else {
            ISharePlatformSelector iSharePlatformSelector2 = this.f64421c;
            if (iSharePlatformSelector2 == null || !(iSharePlatformSelector2 instanceof DialogSharePlatformSelector)) {
                Activity activity2 = this.f64419a.get();
                C0355a c0355a2 = this.f64423e;
                ?? obj2 = new Object();
                obj2.f64441a = activity2;
                obj2.f64442b = c0355a2;
                obj2.f64443c = onDismissListener;
                this.f64421c = obj2;
            }
        }
        ISharePlatformSelector iSharePlatformSelector3 = this.f64421c;
        if (iSharePlatformSelector3 != null) {
            iSharePlatformSelector3.show(str, style, list);
        }
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(String str, List<SharePlatform> list) {
        showShareDialog(str, ISharePlatformSelector.Style.BOTTOM, list, null);
    }

    @Override // com.bilibili.lib.sharewrapper.ShareHelper
    public final void showShareDialog(List<SharePlatform> list) {
        if (this.f64419a.get() == null) {
            ShareBLog.e("share.helper.inner", "mContextRef.get() is null");
        } else {
            showShareDialog(this.f64419a.get().getString(2131848267), list);
        }
    }
}
