package com.bilibili.playset.editor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.pegasus.holders.T;
import com.bilibili.playset.editor.PlaySetImageHelper;
import com.bilibili.playset.editor.PlaySetImagePickFragment;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetImagePickFragment.class */
public class PlaySetImagePickFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC5935b f84796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f84797c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetImagePickFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f84798a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.playset.editor.PlaySetImageHelper$PhotoSource[] r0 = com.bilibili.playset.editor.PlaySetImageHelper.PhotoSource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.playset.editor.PlaySetImagePickFragment.a.f84798a = r0
                r0 = r4
                com.bilibili.playset.editor.PlaySetImageHelper$PhotoSource r1 = com.bilibili.playset.editor.PlaySetImageHelper.PhotoSource.TAKE     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = com.bilibili.playset.editor.PlaySetImagePickFragment.a.f84798a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                com.bilibili.playset.editor.PlaySetImageHelper$PhotoSource r1 = com.bilibili.playset.editor.PlaySetImageHelper.PhotoSource.CHOOSE     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetImagePickFragment.a.m8544clinit():void");
        }
    }

    public final boolean hf() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ContentResolver contentResolver = context.getContentResolver();
        String str = System.currentTimeMillis() + ".jpg";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("title", str);
        contentValues.put("mime_type", "image/jpeg");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", "Pictures/bili");
        }
        Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        this.f84797c = uriInsert;
        intent.putExtra("output", uriInsert);
        try {
            startActivityForResult(intent, 1001);
            return true;
        } catch (Exception e7) {
            return false;
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m8543if(final PlaySetImageHelper.PhotoSource photoSource, final Uri uri) {
        if (uri == null || !PlaySetImageHelper.b(uri, p3())) {
            final FragmentActivity fragmentActivityP3 = p3();
            Task.callInBackground(new Callable(this, fragmentActivityP3, photoSource, uri) { // from class: com.bilibili.playset.editor.M

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaySetImagePickFragment f84750a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final FragmentActivity f84751b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final PlaySetImageHelper.PhotoSource f84752c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Uri f84753d;

                {
                    this.f84750a = this;
                    this.f84751b = fragmentActivityP3;
                    this.f84752c = photoSource;
                    this.f84753d = uri;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Uri uri2 = this.f84753d;
                    this.f84750a.getClass();
                    FragmentActivity fragmentActivity = this.f84751b;
                    Bitmap bitmapD = null;
                    if (fragmentActivity != null) {
                        int i7 = PlaySetImagePickFragment.a.f84798a[this.f84752c.ordinal()];
                        bitmapD = i7 != 1 ? i7 != 2 ? null : PlaySetImageHelper.d(fragmentActivity, uri2) : PlaySetImageHelper.e(fragmentActivity, uri2);
                    }
                    return bitmapD;
                }
            }).continueWith(new Continuation(this) { // from class: com.bilibili.playset.editor.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlaySetImagePickFragment f84754a;

                {
                    this.f84754a = this;
                }

                @Override // bolts.Continuation
                public final Object then(Task task) {
                    InterfaceC5935b interfaceC5935b;
                    PlaySetImagePickFragment playSetImagePickFragment = this.f84754a;
                    playSetImagePickFragment.getClass();
                    if (!task.isCompleted() || (interfaceC5935b = playSetImagePickFragment.f84796b) == null) {
                        return null;
                    }
                    interfaceC5935b.P6((Bitmap) task.getResult());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
            dismissAllowingStateLoss();
        } else {
            InterfaceC5935b interfaceC5935b = this.f84796b;
            if (interfaceC5935b != null) {
                interfaceC5935b.P6(null);
            }
            dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.boxing.loader.IBoxingCrop, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.editor.PlaySetImagePickFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 2131887241);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499692, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FF0.l lVar = new FF0.l(this, 5);
        view.findViewById(2131308860).setOnClickListener(lVar);
        view.findViewById(2131308854).setOnClickListener(lVar);
        view.findViewById(2131308852).setOnClickListener(new T(this, 1));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        try {
            Field declaredField = fragmentManager.getClass().getDeclaredField("mStateSaved");
            declaredField.setAccessible(true);
            if (declaredField.getBoolean(fragmentManager)) {
                return;
            }
            super.show(fragmentManager, str);
        } catch (Exception e7) {
            super.show(fragmentManager, str);
        }
    }
}
